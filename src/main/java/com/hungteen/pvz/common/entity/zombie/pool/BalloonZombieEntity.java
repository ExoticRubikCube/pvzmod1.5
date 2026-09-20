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
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
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

	private final MoveControl FlyController = new FlyingMoveControl(this, 360, true);
	private final MoveControl GroundController = new MoveControl(this);
	private PathNavigation FlyNavigator;
	private PathNavigation GroundNavigator;
	
	public BalloonZombieEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
	}
	
	@Override
	public void resetParts() {
		removeParts();
		this.part = new PVZHealthPartEntity(this, 0.6f, -0.45f);
		this.part.setOwner(this);
	}
	
	@Override
	protected float getPartHeightOffset() {
		if(this.isMiniZombie()) return 1.0F;
		return 2.4F;
	}
	
	@Override
	public float getPartWidthOffset() {
		return 0F;
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
	
	public boolean hasBalloon() {
		return this.getOuterDefenceLife() > 0;
	}
	
    @Override
    public ZombieType getZombieType() {
	    return PoolZombies.BALLOON_ZOMBIE;
    }

}
