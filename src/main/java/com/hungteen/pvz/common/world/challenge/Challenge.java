package com.hungteen.pvz.common.world.challenge;

import com.google.common.collect.Sets;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.events.RaidEvent;
import com.hungteen.pvz.api.interfaces.IChallenge;
import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.api.raid.IWaveComponent;
import com.hungteen.pvz.common.advancement.trigger.ChallengeTrigger;
import com.hungteen.pvz.common.capability.CapabilityHandler;
import com.hungteen.pvz.common.capability.level.PVZFogCapability;
import com.hungteen.pvz.common.entity.AbstractPAZEntity;
import com.hungteen.pvz.common.entity.ai.goal.ChallengeMoveGoal;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.common.network.PVZFogPacket;
import com.hungteen.pvz.common.network.PVZPacketHandler;
import com.hungteen.pvz.common.network.toclient.ChallengeBarPacket;
import com.hungteen.pvz.common.world.PVZFog;import com.hungteen.pvz.utils.ConfigUtil;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.game.ClientboundClearTitlesPacket;
import net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Predicate;

public class Challenge implements IChallenge {

	private static final Component CHALLENGE_NAME_COMPONENT = Component.translatable("event.minecraft.raid");
	private static final Component CHALLENGE_WARN = Component.translatable("challenge.pvz.too_far_away").withStyle(ChatFormatting.RED);

	private static final int FOG_RECOVER_TICK = 480;
	private static final int FOG_LIFE_TICK = 1200;
	private static final double FOG_STRENGTH = 1.5D;
	private static final double FOG_RANGE = 18.0D;
	private static final int MAX_ZOMBIES_IN_WAVE = 50;
	private static final int SWITCH_INTERVAL = 5;
	//对齐pvz2D mHugeWaveCountDown：旗帜波刷怪前750cs（7.5秒）红字预警
	private static final int WAVE_WARNING_TICK = 150;
	//Board.cpp:5398 红字后25cs播吼声；Board.cpp:5341 末波刷怪后60cs播finalwave
	private static final int HUGE_WAVE_ROAR_DELAY = 5;
	private static final int FINAL_WAVE_SOUND_DELAY = 12;
	//对齐pvz2D StartReadySetPlant.reanim总时长1830ms（约37tick）：5+27+5
	private static final int READY_TITLE_STAY_TICK = 27;
	//减速与玩家伤害减半已下放至PVZZombieEntity，由僵尸实体依据isInChallengeRange()自管理
	//复刻原版末影龙 dragonEvent：playBossMusic 随 add 包全量下发，音乐由客户端原版 MusicManager 驱动
	private final ServerBossEvent challengeBar = (ServerBossEvent)(new ServerBossEvent(CHALLENGE_NAME_COMPONENT, BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS).setPlayBossMusic(true));
	private final int id;//unique specify id.
	public final ServerLevel world;
	public final ResourceLocation resource;//res to read raid component.
	protected IChallengeComponent challenge;
	protected BlockPos center;//raid center block position.
	protected Status status = Status.PREPARE;
	protected int tick = 0;
	protected int totalTime = 0;
	protected int stopTick = 0;
	protected int currentWave = 0;
	protected int waveSwitchThreshold = 0;
	protected int waveStartThreat = 0;
	protected Set<Entity> raiders = new HashSet<>();
	protected Set<UUID> heroes = new HashSet<>();
	private boolean firstTick = false;
	private boolean warningSent = false;
	private int finalWaveSoundDelay = 0;
	private int currentMaxLevel = 0;
	private int fogRecoverDelay = 0;
	//玩家真实阳光在进入范围时快照于此，SUN_NUM槽位在挑战期间承载挑战余额
	private final Map<UUID, SunSession> sunSessions = new HashMap<>();



	public Challenge(int id, ServerLevel world, ResourceLocation res, BlockPos pos) {
		this.id = id;
		this.world = world;
		this.resource = res;
		this.center = pos;
	}

	public Challenge(ServerLevel world, CompoundTag nbt) {
		this.world = world;
		this.id = nbt.getInt("challenge_id");
		this.status = Status.values()[nbt.getInt("challenge_status")];
		this.resource = new ResourceLocation(nbt.getString("challenge_resource"));
		this.tick = nbt.getInt("challenge_tick");
		this.totalTime = nbt.getInt("total_time");
		this.stopTick = nbt.getInt("stop_tick");
		this.currentWave = nbt.getInt("current_wave");
		this.waveSwitchThreshold = nbt.getInt("wave_switch_threshold");
		this.waveStartThreat = nbt.getInt("wave_start_threat");
		this.firstTick = nbt.getBoolean("first_tick");
		this.warningSent = nbt.getBoolean("warning_sent");
		this.finalWaveSoundDelay = nbt.getInt("final_wave_sound_delay");
		this.fogRecoverDelay = nbt.getInt("fog_recover_delay");
		{// for raid center position.
			CompoundTag tmp = nbt.getCompound("center_pos");
			this.center = new BlockPos(tmp.getInt("pos_x"), tmp.getInt("pos_y"), tmp.getInt("pos_z"));
		}
		{// for raiders entity id.
			ListTag list = nbt.getList("raiders", 11);
            for (Tag tag : list) {
                final Entity entity = world.getEntity(NbtUtils.loadUUID(tag));
                if (entity != null) {
                    this.raiders.add(entity);
                }
            }
		}
		{// for heroes uuid.
			ListTag list = nbt.getList("heroes", 11);
            for (Tag tag : list) {
                this.heroes.add(NbtUtils.loadUUID(tag));
            }
		}
		if(nbt.contains("sun_sessions")) {
			ListTag list = nbt.getList("sun_sessions", 10);
			for(Tag tag : list) {
				final CompoundTag tmp = (CompoundTag) tag;
				this.sunSessions.put(NbtUtils.loadUUID(tmp.get("player_uuid")),
						new SunSession(tmp.getInt("original_sun"), tmp.getInt("challenge_sun"), tmp.getBoolean("exchanged")));
			}
		}
	}

	public void save(CompoundTag nbt) {
		nbt.putInt("challenge_id", this.id);
		nbt.putInt("challenge_status", this.status.ordinal());
		nbt.putString("challenge_resource", this.resource.toString());
		nbt.putInt("challenge_tick", this.tick);
		nbt.putInt("total_time", this.totalTime);
		nbt.putInt("stop_tick", this.stopTick);
		nbt.putInt("current_wave", this.currentWave);
		nbt.putInt("wave_switch_threshold", this.waveSwitchThreshold);
		nbt.putInt("wave_start_threat", this.waveStartThreat);
		nbt.putBoolean("first_tick", this.firstTick);
		nbt.putBoolean("warning_sent", this.warningSent);
		nbt.putInt("final_wave_sound_delay", this.finalWaveSoundDelay);
		nbt.putInt("fog_recover_delay", this.fogRecoverDelay);
		{// for raid center position.
			CompoundTag tmp = new CompoundTag();
			tmp.putInt("pos_x", this.center.getX());
		    tmp.putInt("pos_y", this.center.getY());
			tmp.putInt("pos_z", this.center.getZ());
			nbt.put("center_pos", tmp);
		}
		{// for raiders entity id.
			ListTag list = new ListTag();
			for(Entity entity : this.raiders) {
				list.add(NbtUtils.createUUID(entity.getUUID()));
			}
			nbt.put("raiders", list);
		}
		{// for heroes uuid.
			ListTag list = new ListTag();
			for(UUID uuid : this.heroes) {
				list.add(NbtUtils.createUUID(uuid));
			}
			nbt.put("heroes", list);
		}
		{// for isolated challenge sun sessions.
			ListTag list = new ListTag();
			this.sunSessions.forEach((uuid, session) -> {
				final Player online = this.world.getPlayerByUUID(uuid);
				if(session.exchanged && online != null) {
					session.challengeSun = PlayerUtil.getResource(online, Resources.SUN_NUM);
				}
				final CompoundTag tmp = new CompoundTag();
				tmp.put("player_uuid", NbtUtils.createUUID(uuid));
				tmp.putInt("original_sun", session.originalSun);
				tmp.putInt("challenge_sun", session.challengeSun);
				tmp.putBoolean("exchanged", session.exchanged);
				list.add(tmp);
			});
			nbt.put("sun_sessions", list);
		}
	}

	/**
	 * {@link PVZChallengeData#tick()}
	 */
	public void tick() {
		/* skip tick */
		if(this.isRemoving() || this.world.players().isEmpty()) {
			return ;
		}
		/* not allow to be peaceful */
		if(this.world.getDifficulty() == Difficulty.PEACEFUL) {
			this.remove();
			return ;
		}
		/* is raid component valid */
		if(this.getRaidComponent() == null) {
			this.remove();
			PVZMod.LOGGER.warn("Challenge Tick Error : Where is the challenge component ?");
			return ;
		}
		++ this.tick;
		++ this.totalTime;
		this.tickBar();
		if(this.isStopping()) {
			/* has stopped */
			if(++ this.stopTick >= ConfigUtil.getRaidWaitTime()) {
				this.remove();
			}
		}
		if(this.isPreparing()) {
			/* prepare state */
			final int prepareCD = this.challenge.getPrepareCD(this.currentWave);
			final boolean isBigWave = this.getCurrentWaveComponent().isBigWave();
			if(! this.warningSent && prepareCD >= WAVE_WARNING_TICK && this.tick >= prepareCD - WAVE_WARNING_TICK && isBigWave) {
				this.warningSent = true;
				if(this.getRaidComponent().showRoundTitle()) {
					this.getPlayers().forEach(p -> {
						p.connection.send(new ClientboundSetTitlesAnimationPacket(10, WAVE_WARNING_TICK - 20, 10));
						PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.huge_wave").withStyle(ChatFormatting.DARK_RED));
					});
				}
			}
			//对齐pvz2D Board.cpp:5398：红字出现25cs后播hugewave吼声
			if(this.warningSent && this.tick == prepareCD - WAVE_WARNING_TICK + HUGE_WAVE_ROAR_DELAY) {
				this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, SoundRegister.HUGE_WAVE.get()));
			}
			if(this.tick >= prepareCD) {
				this.waveStart();
			}
		} else if(this.isRunning()) {
			/* running state, whole wave spawns at wave start, only the countdown to next wave is ticked */
			//对齐pvz2D Board.cpp:5360-5367：末波刷怪60cs后播finalwave
			if(this.finalWaveSoundDelay > 0) {
				-- this.finalWaveSoundDelay;
				if(this.finalWaveSoundDelay == 0) {
					this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, SoundRegister.FINAL_WAVE.get()));
				}
			}
			if(this.tick % SWITCH_INTERVAL == 0) {
				this.updateDifficultyLevel();
				this.updateRaiders();
				if(this.trySwitchWave()) {
					this.syncBar();
				}
				if(this.isVictory()) {
					this.onVictory();
					return ;
				}
			}
		} else if(this.isLoss()) {
			/* loss state */
			if(this.tick >= this.challenge.getLossTick()) {
				this.remove();
			}
		} else if(this.isVictory()) {
			/* victory state */
			if(this.tick >= this.challenge.getWinTick()) {
				this.remove();
			}
		}
		if(! this.firstTick){//first tick.
			this.firstTick = true;
			if(this.currentWave == 0){
				//首tick先于updatePlayers，立即为范围内玩家建立独立阳光，保证READY过场前HUD已是挑战余额
				this.world.getPlayers(this.validPlayer()).forEach(p -> {
					if(! ChallengeManager.isSunExchanged(p)) {
						this.enterSunExchange(p);
					}
				});
			}
			this.getPlayers().forEach(p -> {
				PlayerUtil.playClientSound(p, this.challenge.getPrepareSound());
				if(this.currentWave == 0){
					p.connection.send(new ClientboundSetTitlesAnimationPacket(5, READY_TITLE_STAY_TICK, 5));
					PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.ready").withStyle(ChatFormatting.DARK_RED));
				}
			});
			if(this.hasTag("fog")) {
				PVZFogCapability.addOrResetFog(this.world, this.center, FOG_LIFE_TICK, FOG_STRENGTH, FOG_RANGE, this.getFogUUID());
			}
		}
		if(this.firstTick && this.hasTag("fog") && ! this.isRemoving()) {
			PVZFog fog = PVZFogCapability.getFog(this.world, this.getFogUUID());
			if(fog != null && fog.lifeLeft < 0) {
				//三叶草已标记移除，Capability下一tick清理，按原作24秒后重新蔓延
				this.fogRecoverDelay = FOG_RECOVER_TICK;
			} else if(fog == null && this.fogRecoverDelay > 0) {
				-- this.fogRecoverDelay;
				if(this.fogRecoverDelay == 0) {
					PVZFogCapability.addOrResetFog(this.world, this.center, FOG_LIFE_TICK, FOG_STRENGTH, FOG_RANGE, this.getFogUUID());
				}
			} else if(fog == null) {
				//雾自然到期或重载后缺失，与Capability移除同一tick补造，客户端视觉无断层
				PVZFogCapability.addOrResetFog(this.world, this.center, FOG_LIFE_TICK, FOG_STRENGTH, FOG_RANGE, this.getFogUUID());
			}
		}
	}

	/**
	 * {@link #tick()}
	 */
	protected void updateDifficultyLevel() {
		/* update difficulty level */
		if(this.getWorld().getDifficulty() == Difficulty.HARD){
			if(this.tick % 10 == 0){
				this.currentMaxLevel = 0;
				this.getPlayers().forEach(p -> {
					this.currentMaxLevel += PlayerUtil.getResource(p, Resources.TREE_LVL);
				});
			}
		} else {
			this.currentMaxLevel = 0;
		}
	}

	/**
	 * drop dead members.
	 * {@link #tick()}
	 */
	protected void updateRaiders() {
		this.raiders.removeIf(entity -> !entity.isAlive());
	}

	/**
	 * buy the whole roster of this wave with its points budget, equivalent to pvz2D PickZombieWaves.
	 * the flag zombie is forced ahead on a big wave, the rest are weighted picks that consume points.
	 */
	protected List<ISpawnComponent> pickWaveRoster(IWaveComponent wave, int points) {
		final List<ISpawnComponent> roster = new ArrayList<>();
		if(wave.isBigWave()) {
			for(ISpawnComponent spawn : wave.getSpawns()) {
				if(spawn.isFlag()) {
					roster.add(spawn);
					break;
				}
			}
		}
		int pointsLeft = points;
		while(pointsLeft > 0 && roster.size() < MAX_ZOMBIES_IN_WAVE) {
			final List<ISpawnComponent> candidates = new ArrayList<>();
			int allWeight = 0;
			for(ISpawnComponent spawn : wave.getSpawns()) {
				if(! spawn.isFlag() && pointsLeft >= spawn.getThreat() && (! spawn.isElite() || wave.isBigWave())
						&& (float) this.currentWave / this.challenge.getTotalWaveCount() >= spawn.getStartFrom()) {
					candidates.add(spawn);
					allWeight += spawn.getWeight();
				}
			}
			if(candidates.isEmpty() || allWeight <= 0) {
				break;
			}
			int selected = this.world.random.nextInt(allWeight);
			ISpawnComponent picked = null;
			for(ISpawnComponent spawn : candidates) {
				selected -= spawn.getWeight();
				if(selected <= 0) {
					picked = spawn;
					break;
				}
			}
			if(picked == null) {
				break;
			}
			roster.add(picked);
			pointsLeft -= picked.getThreat();
		}
		return roster;
	}

	/**
	 * summon one zombie of the picked roster and bind its threat cost and spawn wave onto the raider capability.
	 */
	protected boolean summonEntity(ISpawnComponent spawn, int wavePos) {
		final Entity entity = this.createEntity(spawn);
		if(entity == null) {
			return false;
		}
		this.raiders.add(entity);
		entity.getCapability(CapabilityHandler.RAIDER_DATA_CAPABILITY).ifPresent(cap -> {
			cap.setThreat(spawn.getThreat());
			cap.setWave(wavePos);
		});
		if(entity instanceof Mob) {
			// avoid despawn.
			((Mob) entity).setPersistenceRequired();

			//close to center goal.
			if (this.getRaidComponent().shouldCloseToCenter()) {
				((Mob) entity).goalSelector.addGoal(0, new ChallengeMoveGoal(((Mob) entity), this));
			}
		}
		if(entity instanceof AbstractPAZEntity){//init skills.
			AbstractPAZEntity.randomInitSkills((AbstractPAZEntity) entity, Math.max(0, this.currentMaxLevel - this.getRaidComponent().getRecommendLevel()));
		}
		return true;
	}

	/**
	 * copy from {@link net.minecraft.server.commands.SummonCommand}
	 */
	private Entity createEntity(ISpawnComponent spawn) {
		final BlockPos pos;
		if(spawn.getPlacement() != null) {
			pos = spawn.getPlacement().getPlacePosition(this.world, this.center);
		} else {
			// zombies walk in from 1~5 blocks outside one of the four square edges, spawn distance is global
			final int side = this.world.random.nextInt(4);
			final int outer = ConfigUtil.getRaidRange() + 1 + this.world.random.nextInt(5);
			final int along = this.world.random.nextInt(ConfigUtil.getRaidRange() * 2 + 1) - ConfigUtil.getRaidRange();
			final int spawnX = this.center.getX() + (side == 0 ? outer : side == 1 ? -outer : along);
			final int spawnZ = this.center.getZ() + (side == 2 ? outer : side == 3 ? -outer : along);
			pos = new BlockPos(spawnX, this.world.getHeight(Heightmap.Types.WORLD_SURFACE, spawnX, spawnZ), spawnZ);
		}
		final CompoundTag nbt = spawn.getNBT().copy();
		nbt.putInt("pvz_avoid_same_hash_random", this.world.random.nextInt());
		return EntityUtil.createWithNBT(this.world, spawn.getSpawnType(), nbt, pos);
	}

	/**
	 * total threat of alive raiders spawned in the given wave.
	 */
	public int getLivingMembersThreat(int wavePos) {
		int result = 0;
		for(Entity raider : this.raiders) {
			final int[] cost = new int[1];
			raider.getCapability(CapabilityHandler.RAIDER_DATA_CAPABILITY).ifPresent(cap -> {
				if(cap.getWave() == wavePos) {
					cost[0] = cap.getThreat();
				}
			});
			result += cost[0];
		}
		return result;
	}

	/**
	 * countdown driven wave switching, equivalent to pvz2D mZombieCountDown plus the health early trigger.
	 * before the minimum wait the wave holds; inside the wait window it advances once this wave loses enough
	 * threat; past the maximum wait it advances unconditionally. waves may overlap. the final wave spawns its
	 * whole roster at wave start and grants victory as soon as every raider is dead, aligned with htpvz2 which
	 * settles immediately on the last member removal instead of waiting out the remaining minimum wait.
	 */
	public boolean trySwitchWave() {
		final IWaveComponent wave = this.getCurrentWaveComponent();
		final boolean isFinalWave = this.currentWave >= this.challenge.getTotalWaveCount() - 1;
		if(isFinalWave) {
			if(this.raiders.isEmpty()) {
				this.status = Status.VICTORY;
				return true;
			}
			return false;
		}
		if(this.tick < wave.getMinimumWaitTime()) {
			return false;
		}
		if(this.tick < wave.getMaximumWaitTime() && this.getLivingMembersThreat(this.currentWave) > this.waveSwitchThreshold) {
			return false;
		}
		this.currentWave += 1;
		this.tick = 0;
		this.warningSent = false;
		this.status = Status.PREPARE;
		return true;
	}

	/**
	 * {@link #tick()}
	 */
	protected void tickBar() {
		if(this.tick % 10 == 0 && ! this.world.players().isEmpty()) {
			this.updatePlayers();
		}
		this.challengeBar.setColor(this.challenge.getBarColor());
		this.challengeBar.setName(this.getBarName());
		if(this.isPreparing() || this.isRunning()) {
			this.challengeBar.setProgress(this.getWaveProgress());
		} else {
			this.challengeBar.setProgress(1F);
		}
	}

	/**
	 * aligned with pvz2D Board::UpdateProgressMeter: wave slot start plus in-wave kill fraction,
	 * the previous wave end equals the next wave start so the fill never bounces back.
	 */
	private float getWaveProgress() {
		final int totalWaves = this.challenge.getTotalWaveCount();
		if(this.currentWave >= totalWaves - 1) {
			return 1.0F;
		}
		float fraction = 0.0F;
		if(this.isRunning()) {
			final int damageTarget = this.waveStartThreat - this.waveSwitchThreshold;
			if(damageTarget >= 1) {
				fraction = Mth.clamp((float) (this.waveStartThreat - this.getLivingMembersThreat(this.currentWave)) / damageTarget, 0.0F, 1.0F);
			}
		}
		return (this.currentWave + fraction) / (totalWaves - 1);
	}

	/**
	 * bar title carries the challenge id as an extra translatable arg, client side uses it to match synced wave data.
	 */
	private Component getBarName() {
		final MutableComponent name = Component.translatable("challenge." + this.resource.getNamespace() + "." + this.resource.getPath() + ".name", this.id);
		if(this.isVictory()) {
			return name.append(" - ").append(this.challenge.getWinTitle());
		} else if(this.isLoss()) {
			return name.append(" - ").append(this.challenge.getLossTitle());
		}
		return name;
	}

	/**
	 * sync wave layout and current progress to all tracked players, for the custom boss bar with flag markers.
	 */
	private void syncBar() {
		this.getPlayers().forEach(this::syncBarTo);
	}

	private void syncBarTo(ServerPlayer player) {
		final BitSet bigWaves = new BitSet();
		for(int i = 0; i < this.challenge.getTotalWaveCount(); ++ i) {
			if(this.challenge.getWaves().get(i).isBigWave()) {
				bigWaves.set(i);
			}
		}
		PVZPacketHandler.sendToClient(player, new ChallengeBarPacket(this.id, this.challengeBar.getId(), this.resource, this.challenge.getTotalWaveCount(), this.currentWave, bigWaves));
	}

	/**
	 * player who is alive and in suitable range can be tracked.
	 */
	private Predicate<ServerPlayer> validPlayer() {
		return this::isInRange;
	}

	private boolean isInRange(Entity entity) {
		final int range = ConfigUtil.getRaidRange();
		return Math.abs(entity.getX() - this.center.getX()) < range
				&& Math.abs(entity.getY() - this.center.getY()) < range
				&& Math.abs(entity.getZ() - this.center.getZ()) < range;
	}

	/**
	 * {@link #tickBar()}
	 */
	protected void updatePlayers() {
		final Set<ServerPlayer> oldPlayers = Sets.newHashSet(this.challengeBar.getPlayers());
		final Set<ServerPlayer> newPlayers = Sets.newHashSet(this.world.getPlayers(this.validPlayer()));

		/* add new join players */
		newPlayers.forEach(p -> {
			if(! oldPlayers.contains(p)) {
				this.challengeBar.addPlayer(p);
				this.syncBarTo(p);
			}
		});

		/* remove offline players */
		oldPlayers.forEach(p -> {
			if(! newPlayers.contains(p)) {
				this.challengeBar.removePlayer(p);
				this.leaveSunExchange(p);
			}
		});

		/* add heroes */
		this.challengeBar.getPlayers().forEach(p -> {
            this.heroes.add(p.getUUID());
		});

		/* 中途走进范围或离开后返回的玩家在此续接独立阳光；终态不再交换 */
		if(this.isPreparing() || this.isRunning()) {
			newPlayers.forEach(p -> {
				final SunSession session = this.sunSessions.get(p.getUUID());
				if((session == null || ! session.exchanged) && ! ChallengeManager.isSunExchanged(p)) {
					this.enterSunExchange(p);
				}
			});
		}

		if(this.challengeBar.getPlayers().isEmpty()){
			if(! this.isStopping()) {
				++ this.stopTick;
				this.heroes.forEach(uuid -> {
					Player player = this.world.getPlayerByUUID(uuid);
					if(player != null) {
						PlayerUtil.sendMsgTo(player, CHALLENGE_WARN);
					}
				});
			}
		} else {
			this.stopTick = 0;
		}
	}

	/**
	 * run when prepare time is finished.
	 */
	protected void waveStart() {
		this.status = Status.RUNNING;
		final IWaveComponent wave = this.getCurrentWaveComponent();
		int points = Math.max(1, wave.getThreat());
		if(this.currentWave >= 1) {
			points *= (int) Math.sqrt(Math.max(1, this.getPlayers().size()));
		}
		/* the whole roster enters in the same tick, staggered arrival comes from spawn placement offsets and zombie speed variance */
		int spawnedThreat = 0;
		for(ISpawnComponent spawn : this.pickWaveRoster(wave, points)) {
			if(this.summonEntity(spawn, this.currentWave)) {
				spawnedThreat += spawn.getThreat();
			}
		}
		this.waveSwitchThreshold = Mth.floor(spawnedThreat * (0.5F + this.world.random.nextFloat() * 0.15F));
		this.waveStartThreat = spawnedThreat;
		final boolean isFinalWave = this.currentWave >= this.challenge.getTotalWaveCount() - 1;
		this.getPlayers().forEach(p -> {
			if(this.getRaidComponent().showRoundTitle()){
				if(isFinalWave){
					p.connection.send(new ClientboundSetTitlesAnimationPacket(10, 60, 10));
					PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.final_wave").withStyle(ChatFormatting.DARK_RED));
				} else if(this.warningSent){
					p.connection.send(new ClientboundClearTitlesPacket(false));
				} else if(wave.isBigWave()){
					p.connection.send(new ClientboundSetTitlesAnimationPacket(10, WAVE_WARNING_TICK - 20, 10));
					PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.huge_wave").withStyle(ChatFormatting.DARK_RED));
				}
			}
			if(wave.isBigWave()){
				PlayerUtil.playClientSound(p, SoundRegister.SIREN.get());
			} else if(this.currentWave == 0){
				PlayerUtil.playClientSound(p, SoundRegister.AWOOGA.get());
			}
		});
		if(isFinalWave){
			this.finalWaveSoundDelay = FINAL_WAVE_SOUND_DELAY;
		}
	}

	private IWaveComponent getCurrentWaveComponent() {
		final List<IWaveComponent> waves = this.challenge.getWaves();
		return waves.get(Mth.clamp(this.currentWave, 0, waves.size() - 1));
	}

	/**
	 * any tracked hero dies means the zombies broke into the house, aligned with htpvz2 target death failure.
	 * {@link com.hungteen.pvz.common.event.handler.PlayerEventHandler#handlePlayerDeath}
	 */
	public void onHeroDeath(ServerPlayer player) {
		if((this.isPreparing() || this.isRunning()) && this.heroes.contains(player.getUUID())) {
			this.status = Status.LOSS;
			this.onLoss();
		}
	}

	/**
	 * run when raid is not defeated.
	 */
	protected void onLoss() {
		this.tick = 0;
		//onHeroDeath返回后PlayerEventHandler会按真实阳光处理死亡掉落，必须先恢复
		this.releaseAllSunSessions();
		//终态翻平音乐标志，客户端情境音乐随下一拍自动停止
		this.challengeBar.setPlayBossMusic(false);
		this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, this.challenge.getLossSound()));
		MinecraftForge.EVENT_BUS.post(new RaidEvent.RaidLossEvent(this));
	}

	/**
	 * run when raid is defeated.
	 */
	protected void onVictory() {
		this.tick = 0;
		this.releaseAllSunSessions();
		//终态翻平音乐标志，客户端情境音乐随下一拍自动停止
		this.challengeBar.setPlayBossMusic(false);
		this.getPlayers().forEach(p -> {
			PlayerUtil.playClientSound(p, this.challenge.getWinSound());
			ChallengeTrigger.INSTANCE.trigger(p, this.resource.toString());
		});
		if(! MinecraftForge.EVENT_BUS.post(new RaidEvent.RaidWinEvent(this))) {
			this.getPlayers().forEach(p -> {
				this.challenge.getRewards().forEach(r -> r.reward(p));
			});
			this.challenge.getRewards().forEach(r -> r.rewardGlobally(this));
		}
	}

	public void remove() {
		this.status = Status.REMOVING;
		//和平/组件缺失/无人超时等所有移除出口的终态兜底，幂等
		this.releaseAllSunSessions();
		//僵尸减速由僵尸实体自管理，挑战移除后其isInChallengeRange()失效自摘，无需在此处理
		//非雾挑战不存在对应UUID的雾，此处返回false且不发包，无副作用
		PVZFogCapability.modifyFogFeatures(this.world, this.getFogUUID(), PVZFogPacket.ModifyType.REMOVE, 0);
		final ChallengeBarPacket removePacket = ChallengeBarPacket.remove(this.id);
		this.getPlayers().forEach(player -> PVZPacketHandler.sendToClient(player, removePacket));
		this.challengeBar.removeAllPlayers();
		this.raiders.forEach(e -> e.remove(net.minecraft.world.entity.Entity.RemovalReason.KILLED));
	}

	public int getId() {
		return this.id;
	}

	public BlockPos getCenter() {
		return this.center;
	}

	private UUID getFogUUID() {
		return UUID.nameUUIDFromBytes(("pvz_challenge_fog_" + this.id).getBytes(StandardCharsets.UTF_8));
	}

	public boolean isRaider(Entity raider) {
		return this.raiders.contains(raider);
	}

	public boolean isStopping() {
		return this.stopTick > 0;
	}

	public boolean isPreparing() {
		return this.status == Status.PREPARE;
	}

	public boolean isRunning() {
		return this.status == Status.RUNNING;
	}

	public boolean isRemoving() {
		return this.status == Status.REMOVING;
	}

	public boolean isLoss() {
		return this.status == Status.LOSS;
	}

	public boolean isVictory() {
		return this.status == Status.VICTORY;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * get raid component by resource.
	 */
	public IChallengeComponent getRaidComponent() {
		return this.challenge != null ? this.challenge : (this.challenge = ChallengeManager.getChallengeByResource(this.resource));
	}

	/**
	 * get tracked players by raid bar.
	 */
	public List<ServerPlayer> getPlayers(){
		return new ArrayList<>(this.challengeBar.getPlayers());
	}

	public boolean hasTag(String tag) {
		return this.challenge.hasTag(tag);
	}

	public List<String> getAuthors(){
		return this.challenge.getAuthors();
	}

	public Set<Entity> getRaiders(){
		return this.raiders;
	}

	@Override
	public ServerLevel getWorld() {
		return world;
	}

	/**
	 * 进入范围：快照真实阳光并以挑战开局余额替换；存在离场会话时续用上次挑战余额。
	 * 上限包必须先于阳光值包到达客户端，否则余额高于树等级上限时会被客户端clamp截断。
	 */
	private void enterSunExchange(ServerPlayer player) {
		final SunSession session = this.sunSessions.get(player.getUUID());
		PlayerUtil.setSunLimitOverride(player, this.challenge.getSunLimit());
		if(session == null) {
			final int initialSun = this.challenge.getInitialSun();
			this.sunSessions.put(player.getUUID(), new SunSession(PlayerUtil.getResource(player, Resources.SUN_NUM), initialSun));
			PlayerUtil.setResource(player, Resources.SUN_NUM, initialSun);
		} else {
			session.originalSun = PlayerUtil.getResource(player, Resources.SUN_NUM);
			PlayerUtil.setResource(player, Resources.SUN_NUM, session.challengeSun);
			session.exchanged = true;
		}
	}

	/**
	 * 离开范围：当前槽位值存回挑战余额，真实阳光快照写回槽位。
	 */
	private void leaveSunExchange(ServerPlayer player) {
		final SunSession session = this.sunSessions.get(player.getUUID());
		if(session != null && session.exchanged) {
			session.challengeSun = PlayerUtil.getResource(player, Resources.SUN_NUM);
			PlayerUtil.setResource(player, Resources.SUN_NUM, session.originalSun);
			PlayerUtil.setSunLimitOverride(player, 0);
			session.exchanged = false;
		}
	}

	/**
	 * 挑战终态恢复全部在线玩家真实阳光；离线玩家登出时已写回，仅落标志。
	 */
	private void releaseAllSunSessions() {
		this.sunSessions.forEach((uuid, session) -> {
			if(session.exchanged) {
				final Player player = this.world.getPlayerByUUID(uuid);
				if(player != null) {
					PlayerUtil.setResource(player, Resources.SUN_NUM, session.originalSun);
					PlayerUtil.setSunLimitOverride(player, 0);
				}
				session.exchanged = false;
			}
		});
	}

	boolean isSunExchanged(UUID uuid) {
		final SunSession session = this.sunSessions.get(uuid);
		return session != null && session.exchanged;
	}

	/**
	 * 崩溃关服时玩家cap可能保存的是交换态余额，依NBT恢复的exchanged残留标志校正；正常登出则续用会话。
	 */
	public void onPlayerLogin(ServerPlayer player) {
		final SunSession session = this.sunSessions.get(player.getUUID());
		if(session != null) {
			if((this.isPreparing() || this.isRunning()) && this.isInRange(player)) {
				if(this.challenge != null) {
					PlayerUtil.setSunLimitOverride(player, this.challenge.getSunLimit());
				}
				if(! session.exchanged) {
					session.originalSun = PlayerUtil.getResource(player, Resources.SUN_NUM);
				}
				PlayerUtil.setResource(player, Resources.SUN_NUM, session.challengeSun);
				session.exchanged = true;
			} else if(session.exchanged) {
				PlayerUtil.setResource(player, Resources.SUN_NUM, session.originalSun);
				PlayerUtil.setSunLimitOverride(player, 0);
				session.exchanged = false;
			}
		}
	}

	public void onPlayerLogout(ServerPlayer player) {
		this.leaveSunExchange(player);
	}

	public enum Status {
		  PREPARE,
	      RUNNING,
	      VICTORY,
	      LOSS,
	      REMOVING
    }

	/**
	 * 单次挑战内一名玩家的阳光隔离会话：originalSun为进入前真实阳光，challengeSun为挑战内独立余额。
	 */
	private static final class SunSession {
		private int originalSun;
		private int challengeSun;
		private boolean exchanged;

		private SunSession(int originalSun, int challengeSun) {
			this(originalSun, challengeSun, true);
		}

		private SunSession(int originalSun, int challengeSun, boolean exchanged) {
			this.originalSun = originalSun;
			this.challengeSun = challengeSun;
			this.exchanged = exchanged;
		}
	}

}