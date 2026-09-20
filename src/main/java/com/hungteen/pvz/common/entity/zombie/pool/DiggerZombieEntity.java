package com.hungteen.pvz.common.entity.zombie.pool;

import com.hungteen.pvz.api.enums.MetalTypes;
import com.hungteen.pvz.client.particle.ParticleRegister;
import com.hungteen.pvz.common.entity.ai.goal.target.PVZRandomTargetGoal;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.plant.appease.SplitPeaEntity;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;
import com.hungteen.pvz.common.entity.plant.ice.WinterMelonEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.impl.zombie.PoolZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.common.misc.PVZLoot;
import com.hungteen.pvz.utils.WorldUtil;
import com.hungteen.pvz.utils.ZombieUtil;
import com.hungteen.pvz.utils.interfaces.ICanAttract;
import com.hungteen.pvz.utils.interfaces.IHasMetal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class DiggerZombieEntity extends PVZZombieEntity implements IHasMetal {

	public static final int MAX_OUT_TIME = 30;
	
	public DiggerZombieEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
		this.increaseMetal();
	}
	
	@Override
	protected void registerTargetGoals() {
		this.targetSelector.addGoal(0, new PVZRandomTargetGoal(this, true, true, ZombieUtil.NORMAL_TARGET_RANGE, ZombieUtil.NORMAL_TARGET_HEIGHT));
	}
	
	@Override
	public void normalZombieTick() {
		super.normalZombieTick();
		if(! level.isClientSide()) {
			LivingEntity target = this.getTarget();
			if(this.hasPickaxe()) {
				if(target != null) {
				    if(this.distanceToSqr(target) <= 8) {
				    	this.setAttackTime(Mth.clamp(this.getAttackTime() + 1, 0, MAX_OUT_TIME));
				    } else {
				    	this.setAttackTime(Mth.clamp(this.getAttackTime() - 1, 0, MAX_OUT_TIME));
				    }
			    } else {
			    	this.setAttackTime(Mth.clamp(this.getAttackTime() - 1, 0, MAX_OUT_TIME));
			    }
			} else {
				this.setAttackTime(Mth.clamp(this.getAttackTime() + 1, 0, MAX_OUT_TIME));
			}
		} else{
			if(! this.isNotDigging()){
				WorldUtil.spawnRandomSpeedParticle(this.level, ParticleRegister.DIRT_BURST_OUT.get(), this.position(), 0.1F);
			}
		}
		this.refreshDimensions();
	}
	
	@Override
	protected void initAttributes() {
		super.initAttributes();
		this.updateAttributes(this.hasPickaxe());
	}
	
	private void updateAttributes(boolean has){
		this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(has ? ZombieUtil.LOW : ZombieUtil.HUGE_LOW);
		this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(has ? ZombieUtil.WALK_LITTLE_FAST : ZombieUtil.WALK_LITTLE_SLOW);
	}
	
	@Override
	public boolean canBeTargetBy(LivingEntity living) {
		if(living instanceof PVZPlantEntity && ! this.isNotDigging()){
			return false;
		}
		return super.canBeTargetBy(living) ;
	}
	
	@Override
	public boolean canBeAttractedBy(ICanAttract defender) {
		return ! this.hasPickaxe();
	}
	
	@Override
	protected boolean isZombieInvulnerableTo(DamageSource source) {
		if(! this.isNotDigging() && source.isProjectile()){
			return ! (source.getEntity() instanceof SplitPeaEntity || source.getEntity() instanceof Player || source.getEntity() instanceof MelonPultEntity || source.getEntity() instanceof WinterMelonEntity);
		}
		return super.isZombieInvulnerableTo(source);
	}
	
	/**
	 * is zombie digging underground.
	 * {@link #isZombieInvulnerableTo(DamageSource)}
	 * {@link #canBeTargetBy(LivingEntity)}
	 */
	public boolean isNotDigging() {
		return this.getAttackTime() == DiggerZombieEntity.MAX_OUT_TIME;
	}
	
	@Override
	public float getLife() {
		return 27;
	}
	
	@Override
	public float getInnerLife() {
		return 10;
	}
	
	@Override
	public boolean hasMetal() {
		return this.hasPickaxe();
	}
	
	@Override
	public void onInnerDefenceBroken() {
		super.onInnerDefenceBroken();
		if(! this.level.isClientSide()) {
			this.updateAttributes(false);
		}
	}
	
	@Override
	public void decreaseMetal() {
		this.setInnerDefenceLife(0);
		this.updateAttributes(false);
	}
	
	@Override
	public void increaseMetal() {
		this.setInnerDefenceLife(this.getInnerLife());
	}
	
	@Override
	public MetalTypes getMetalType() {
		return MetalTypes.IRON_PICKAXE;
	}
	
	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		if(this.isMiniZombie()) return EntityDimensions.scalable(0.4f, this.getAttackTime() * 0.02F + 0.1F);
		return EntityDimensions.scalable(0.8f, this.getAttackTime() * 0.06F + 0.2F);
	}
	
	@Override
	protected ResourceLocation getDefaultLootTable() {
		return PVZLoot.DIGGER_ZOMBIE;
	}
	
	@Override
    public ZombieType getZombieType() {
	    return PoolZombies.DIGGER_ZOMBIE;
    }
	
	public boolean hasPickaxe() {
		return this.getInnerDefenceLife() > 0;
	}
	
}
