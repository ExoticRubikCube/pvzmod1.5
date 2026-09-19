package com.hungteen.pvz.common.world.challenge;

import com.google.common.collect.Sets;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.events.RaidEvent;
import com.hungteen.pvz.api.interfaces.IChallenge;
import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.api.raid.IPlacementComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.api.raid.IWaveComponent;
import com.hungteen.pvz.common.advancement.trigger.ChallengeTrigger;
import com.hungteen.pvz.common.capability.CapabilityHandler;
import com.hungteen.pvz.common.capability.level.PVZFogCapability;
import com.hungteen.pvz.common.entity.AbstractPAZEntity;
import com.hungteen.pvz.common.entity.ai.goal.ChallengeMoveGoal;
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
	private final ServerBossEvent challengeBar = new ServerBossEvent(CHALLENGE_NAME_COMPONENT, BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS);
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
	private int currentMaxLevel = 0;
	private int fogRecoverDelay = 0;



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
			if(this.tick >= this.challenge.getPrepareCD(this.currentWave)) {
				this.waveStart();
			}
		} else if(this.isRunning()) {
			/* running state, whole wave spawns at wave start, only the countdown to next wave is ticked */
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
			this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, this.challenge.getPrepareSound()));
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
		final IPlacementComponent placement = spawn.getPlacement() != null ? spawn.getPlacement() : this.challenge.getPlacement(this.currentWave);
		final BlockPos pos = placement.getPlacePosition(this.world, this.center);
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
	 * threat; past the maximum wait it advances unconditionally. waves may overlap, the final wave only ends
	 * in victory after every raider is dead.
	 */
	public boolean trySwitchWave() {
		final IWaveComponent wave = this.getCurrentWaveComponent();
		if(this.tick < wave.getMinimumWaitTime()) {
			return false;
		}
		if(this.currentWave >= this.challenge.getTotalWaveCount() - 1) {
			if(this.raiders.isEmpty()) {
				this.status = Status.VICTORY;
				return true;
			}
			return false;
		}
		if(this.tick < wave.getMaximumWaitTime() && this.getLivingMembersThreat(this.currentWave) > this.waveSwitchThreshold) {
			return false;
		}
		this.currentWave += 1;
		this.tick = 0;
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
		PVZPacketHandler.sendToClient(player, new ChallengeBarPacket(this.id, this.challenge.getTotalWaveCount(), this.currentWave, bigWaves));
	}

	/**
	 * player who is alive and in suitable range can be tracked.
	 */
	private Predicate<ServerPlayer> validPlayer() {
		return (player) -> {
			final int range = ConfigUtil.getRaidRange();
			return Math.abs(player.getX() - this.center.getX()) < range
					&& Math.abs(player.getY() - this.center.getY()) < range
					&& Math.abs(player.getZ() - this.center.getZ()) < range;
		};
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
			}
		});

		/* add heroes */
		this.challengeBar.getPlayers().forEach(p -> {
            this.heroes.add(p.getUUID());
		});

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
		this.getPlayers().forEach(p -> {
			if(this.getRaidComponent().showRoundTitle()){
				PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.round", this.currentWave + 1).withStyle(ChatFormatting.DARK_RED));
			}
			PlayerUtil.playClientSound(p, this.challenge.getStartWaveSound());
		});
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
		this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, this.challenge.getLossSound()));
		MinecraftForge.EVENT_BUS.post(new RaidEvent.RaidLossEvent(this));
	}

	/**
	 * run when raid is defeated.
	 */
	protected void onVictory() {
		this.tick = 0;
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

	public enum Status {
		  PREPARE,
	      RUNNING,
	      VICTORY,
	      LOSS,
	      REMOVING
    }

}