package com.hungteen.pvz.common.entity.zombie.pool;

import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.base.DefenceZombieEntity;
import com.hungteen.pvz.common.entity.zombie.part.PVZHealthPartEntity;
import com.hungteen.pvz.common.impl.zombie.PoolZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import com.hungteen.pvz.utils.interfaces.ICanAttract;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;

import java.util.Optional;

public class BalloonZombieEntity extends DefenceZombieEntity {

	private static final EntityDataAccessor<Boolean> HAS_BALLOON = SynchedEntityData.defineId(BalloonZombieEntity.class, EntityDataSerializers.BOOLEAN);

	private final MoveControl FlyController = new FlyingMoveControl(this, 360, true);
	private final MoveControl GroundController = new MoveControl(this);
	private PathNavigation FlyNavigator;
	private PathNavigation GroundNavigator;

	public BalloonZombieEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(HAS_BALLOON, true);
	}

	@Override
	public void resetParts() {
		removeParts();
		this.part = new PVZHealthPartEntity(this, 0.6f, 0.7f);
		this.part.setOwner(this);
	}

	@Override
	public float getPartHeightOffset() {
		if(this.isMiniZombie()) return 0.55F;
		return 1.7F;
	}
	
	@Override
	public float getPartWidthOffset() {
		return 0F;
	}
	
	@Override
	public EntityDimensions getDimensions(Pose pose) {
		final EntityDimensions dimensions = super.getDimensions(pose);
		return this.hasBalloon() ? EntityDimensions.scalable(dimensions.width, dimensions.height * 0.7F) : dimensions;
	}
	
	@Override
	public boolean canOuterDefend(DamageSource source) {
		return super.canOuterDefend(source) && this.canHitBalloon(source);
	}
	
	private boolean canHitBalloon(DamageSource source) {
		if(source.getDirectEntity() instanceof AbstractArrow) {
			return true;
		}
		if(source instanceof PVZEntityDamageSource pvzEntityDamageSource) {
			return pvzEntityDamageSource.isThornDamage();
		}
		return false;
	}
	
	@Override
	public void onOuterDefenceBroken() {
		super.onOuterDefenceBroken();
		this.setBalloon(false);
		if(! level.isClientSide()) {
			EntityUtil.playSound(this, SoundRegister.BALLOON_POP.get());
		}
	}
	
	@Override
	protected void registerGoals() {
		//define at here to avoid crash.
		this.FlyNavigator = new FlyingPathNavigation(this, level);
		this.GroundNavigator = new GroundPathNavigation(this, level);
		super.registerGoals();
	}
	
	@Override
	protected void initAttributes() {
		super.initAttributes();
		this.getAttribute(Attributes.FLYING_SPEED).setBaseValue(ZombieUtil.FLY_FAST);
		this.setNoGravity(this.hasBalloon());
		this.moveControl = this.hasBalloon() ? FlyController : GroundController;
	}

	@Override
	public void onSyncedDataUpdated(EntityDataAccessor<?> data) {
		super.onSyncedDataUpdated(data);
		if(data.equals(HAS_BALLOON)) {
			this.setNoGravity(this.hasBalloon());
			this.moveControl = this.hasBalloon() ? FlyController : GroundController;
			this.refreshDimensions();
		}
	}
	
	@Override
	protected boolean isZombieInvulnerableTo(DamageSource source) {
		if(this.hasBalloon() && source.isProjectile()){
			return true;
		}
		return super.isZombieInvulnerableTo(source);
	}
	
	@Override
	public boolean canBeTargetBy(LivingEntity living) {
		if(living instanceof PVZPlantEntity && this.hasBalloon()){
			return false;
		}
		return super.canBeTargetBy(living);
	}
	
	@Override
	public boolean canClimbWalls() {
		return super.canClimbWalls() && ! this.hasBalloon();
	}
	
	@Override
	public boolean canBeAttractedBy(ICanAttract defender) {
		return ! this.hasBalloon();
	}
	
	@Override
	public float getLife() {
		return 27;
	}
	
	@Override
	public float getOuterLife() {
		return 2;
	}
	
	@Override
	public float getWalkSpeed() {
		return ZombieUtil.WALK_LITTLE_SLOW;
	}
	
	@Override
	public boolean canBeButtered() {
		return ! this.hasBalloon();
	}

	@Override
	protected boolean canBleedWhenDying() {
		//PvZ1气球僵尸飞行中不会触发垂死（气球为外防具，本体不受伤），气球破后坠落才按普通僵尸临界机制流血
		return ! this.hasBalloon();
	}
	
	@Override
	public boolean canBeFrozen() {
		return ! this.hasBalloon();
	}
	
	@Override
	public boolean canBeCold() {
		return ! this.hasBalloon();
	}
	
	@Override
	public PathNavigation getNavigation() {
		if(this.hasBalloon()) {
			if(! (this.navigation instanceof FlyingPathNavigation)) {
			    this.navigation = this.FlyNavigator;
			}
		} else {
			if(! (this.navigation instanceof GroundPathNavigation)) {
				this.navigation = this.GroundNavigator;
			}
		}
		return super.getNavigation();
	}
	
	@Override
	public Optional<SoundEvent> getSpawnSound() {
		return Optional.ofNullable(SoundRegister.BALLOON_INFLATE.get());
	}
	
	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if(compound.contains("has_balloon")) {
			this.setBalloon(compound.getBoolean("has_balloon"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putBoolean("has_balloon", this.hasBalloon());
	}

	public boolean hasBalloon() {
		return this.entityData.get(HAS_BALLOON);
	}

	public void setBalloon(boolean has) {
		this.entityData.set(HAS_BALLOON, has);
	}

    @Override
    public ZombieType getZombieType() {
	    return PoolZombies.BALLOON_ZOMBIE;
    }

}
