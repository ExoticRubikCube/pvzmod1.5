package com.hungteen.pvz.common.world.challenge;

import com.google.common.collect.Sets;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.events.RaidEvent;
import com.hungteen.pvz.api.interfaces.IChallenge;
import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.api.raid.IPlacementComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.common.advancement.trigger.ChallengeTrigger;
import com.hungteen.pvz.common.entity.AbstractPAZEntity;
import com.hungteen.pvz.common.entity.ai.goal.ChallengeMoveGoal;
import com.hungteen.pvz.utils.ConfigUtil;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.commands.SummonCommand;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;

import java.util.*;
import java.util.function.Predicate;

public class Challenge implements IChallenge {

	private static final Component CHALLENGE_NAME_COMPONENT = Component.translatable("event.minecraft.raid");
	private static final Component CHALLENGE_WARN = Component.translatable("challenge.pvz.too_far_away").withStyle(ChatFormatting.RED);
	private final ServerBossEvent challengeBar = new ServerBossEvent(CHALLENGE_NAME_COMPONENT, BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS);
	private final int id;//unique specify id.
	public final ServerLevel world;
	public final ResourceLocation resource;//res to read raid component.
	protected IChallengeComponent challenge;
	protected BlockPos center;//raid center block position.
	protected Status status = Status.PREPARE;
	protected int tick = 0;
	protected int stopTick = 0;
	protected int waitTick = 0;
	protected int currentWave = 0;
	protected int currentSpawn = 0;
	protected Set<Entity> raiders = new HashSet<>();
	protected Set<UUID> heroes = new HashSet<>();
	private boolean firstTick = false;
	private int currentMaxLevel = 0;
	
	
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
		this.resource = ResourceLocation.parse(nbt.getString("challenge_resource"));
		this.tick = nbt.getInt("challenge_tick");
		this.stopTick = nbt.getInt("stop_tick");
		this.currentWave = nbt.getInt("current_wave");
		this.currentSpawn = nbt.getInt("current_spawn");
		this.firstTick = nbt.getBoolean("first_tick");
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
		nbt.putInt("stop_tick", this.stopTick);
		nbt.putInt("current_wave", this.currentWave);
		nbt.putInt("current_spawn", this.currentSpawn);
		nbt.putBoolean("first_tick", this.firstTick);
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
				this.waitTick = 0;
			}
		} else if(this.isRunning()) {
			/* running state */
			if(this.tick >= this.challenge.getLastDuration(this.currentWave) || canNextWave()) {
				if (this.waitTick > 20 || !canNextWave()) {
					this.checkNextWave();
				} else if (canNextWave()) {
					this.waitTick ++;
				}
			}
			if(this.isLoss()) {//fail to start next wave.
				this.onLoss();
				return ;
			}
			if(this.isVictory()) {
				this.onVictory();
				return ;
			}
			this.tickWave();
		} else if(this.isLoss()) {
			/* loss state */
			if(this.tick >= this.challenge.getLossTick()) {
				this.remove();
			}
		} else if(this.isVictory()) {
			/* running state */
			if(this.tick >= this.challenge.getWinTick()) {
				this.remove();
			}
		}
		if(! this.firstTick){//first tick.
			this.firstTick = true;
			this.getPlayers().forEach(p -> PlayerUtil.playClientSound(p, this.challenge.getPrepareSound()));
		}
		++ this.tick;
	}
	
	/**
	 * {@link #tick()}
	 */
	protected void tickWave() {
		/* update difficulty level */
		if(this.getWorld().getDifficulty() == Difficulty.HARD){
			if(this.tick % 10 == 2){
				this.currentMaxLevel = 0;
				this.getPlayers().forEach(p -> {
					this.currentMaxLevel += PlayerUtil.getResource(p, Resources.TREE_LVL);
				});
			}
		} else {
			this.currentMaxLevel = 0;
		}

		/* check spawn entities */
		final List<ISpawnComponent> spawns = this.challenge.getSpawns(this.currentWave);
		while(this.currentSpawn < spawns.size() && this.tick >= spawns.get(this.currentSpawn).getSpawnTick()) {
			this.spawnEntities(spawns.get(this.currentSpawn++));
		}
		
		/* update raiders list */
        this.raiders.removeIf(entity -> !entity.isAlive());
	}
	
	protected void spawnEntities(ISpawnComponent spawn) {
		final int count = spawn.getSpawnAmount();
		for(int i = 0; i < count; ++ i) {
			Entity entity = this.createEntity(spawn);
			if(entity != null) {
				this.raiders.add(entity);
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
			}
		}
	}
	
	/**
	 * copy from {@link SummonCommand}
	 */
	private Entity createEntity(ISpawnComponent spawn) {
		final IPlacementComponent placement = spawn.getPlacement() != null ? spawn.getPlacement() : this.challenge.getPlacement(this.currentWave);
		final BlockPos pos = placement.getPlacePosition(this.world, this.center);
		return EntityUtil.createWithNBT(this.world, spawn.getSpawnType(), spawn.getNBT(), pos);
	}
	
	/**
	 * {@link #tick()}
	 */
	protected void tickBar() {
		if(this.tick % 10 == 0 && ! this.world.players().isEmpty()) {
			this.updatePlayers();
		}
		this.challengeBar.setColor(this.challenge.getBarColor());
		if(this.isPreparing()) {
			this.challengeBar.setName(this.challenge.getTitle());
			this.challengeBar.setProgress(this.tick * 1.0F / this.challenge.getPrepareCD(this.currentWave));
		} else if(this.isRunning()) {
			this.challengeBar.setName(this.challenge.getTitle().copy().append(" - ").append(Component.translatable("event.minecraft.raid.raiders_remaining", this.raiders.size())));
			this.challengeBar.setProgress((1 - this.tick * 1.0F / this.challenge.getLastDuration(this.currentWave)) > 0 ? (1 - this.tick * 1.0F / this.challenge.getLastDuration(this.currentWave)) : 0);
		} else if(this.isVictory()) {
			this.challengeBar.setName(this.challenge.getTitle().copy().append(" - ").append(this.challenge.getWinTitle()));
			this.challengeBar.setProgress(1F);
		} else if(this.isLoss()) {
			this.challengeBar.setName(this.challenge.getTitle().copy().append(" - ").append(this.challenge.getLossTitle()));
			this.challengeBar.setProgress(1F);
		}
	}
	
	/**
	 * player who is alive and in suitable range can be tracked.
	 */
	private Predicate<ServerPlayer> validPlayer() {
		return (player) -> {
			final int range = ConfigUtil.getRaidRange();
			return player.isAlive() && Math.abs(player.getX() - this.center.getX()) < range
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
		this.tick = 0;
		this.status = Status.RUNNING;
		this.getPlayers().forEach(p -> {
			if(this.getRaidComponent().showRoundTitle()){
				PlayerUtil.sendTitleToPlayer(p, Component.translatable("challenge.pvz.round", this.currentWave + 1).withStyle(ChatFormatting.DARK_RED));
			}
			PlayerUtil.playClientSound(p, this.challenge.getStartWaveSound());
		});
	}
	
	/**
	 * check can start next wave or not.
	 */
	public boolean canNextWave() {
		return (this.raiders.isEmpty() && this.challenge.isWaveFinish(this.currentWave, this.currentSpawn));
	}
	
	/**
	 * {@link #tick()}
	 */
	protected void checkNextWave() {
		this.tick = 0;
		if(this.canNextWave()) {
			this.currentSpawn = 0;
			if(++ this.currentWave >= this.challenge.getTotalWaveCount()) {
				this.status = Status.VICTORY;
			} else {
				this.status = Status.PREPARE;
			}
		} else {
			this.status = Status.LOSS;
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
		this.challengeBar.removeAllPlayers();
		this.raiders.forEach(e -> e.remove(net.minecraft.world.entity.Entity.RemovalReason.KILLED));
	}
	
	public int getId() {
		return this.id;
	}
	
	public BlockPos getCenter() {
		return this.center;
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