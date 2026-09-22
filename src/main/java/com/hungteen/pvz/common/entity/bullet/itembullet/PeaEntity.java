package com.hungteen.pvz.common.entity.bullet.itembullet;

import com.hungteen.pvz.api.interfaces.IIceEffect;
import com.hungteen.pvz.api.paz.IPAZEntity;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.bullet.AbstractShootBulletEntity;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity.FlameTypes;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.List;

public class PeaEntity extends AbstractShootBulletEntity implements ItemSupplier {

	private static final EntityDataAccessor<Integer> PEA_STATE = SynchedEntityData.defineId(PeaEntity.class, EntityDataSerializers.INT);
	private static final EntityDataAccessor<Integer> PEA_TYPE = SynchedEntityData.defineId(PeaEntity.class, EntityDataSerializers.INT);
	private static final int CHILL_FROZEN_TICK = 400;
	public TorchWoodEntity torchWood = null;
	private int power = 0;

	public PeaEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PeaEntity(Level worldIn, LivingEntity shooter, Type peaType, State peaState) {
		super(EntityRegister.PEA.get(), worldIn, shooter);
		this.setPeaState(peaState);
		this.setPeaType(peaType);
	}

	@Override
	protected void defineSynchedData() {
		entityData.define(PEA_STATE, State.NORMAL.ordinal());
		entityData.define(PEA_TYPE, Type.NORMAL.ordinal());
	}
	
	@Override
	protected void onImpact(HitResult result) {
		boolean flag = false;
		if (result.getType() == HitResult.Type.ENTITY) {
			Entity target = ((EntityHitResult) result).getEntity();
			if (this.shouldHit(target)) {
				target.invulnerableTime = 0;
				this.dealPeaDamage(target); // attack 
				flag = true;
			}
		}
		this.level.broadcastEntityEvent(this, (byte) 3);
		if (flag || !this.checkLive(result)) {
this.discard();
		}
	}
	
	/**
	 * {@link TorchWoodEntity#heatPeas()}
	 */
	public void heatBy(TorchWoodEntity wood) {
		if (this.torchWood == null || !this.torchWood.is(wood)) {// don't fire twice by the same torchwood
			this.torchWood = wood;
			if (this.torchWood.getFlameType() == FlameTypes.BLUE) {// blue fire
				if (this.getPeaState() == State.ICE) {//ice to fire
					this.setPeaState(State.FIRE);
				} else if (this.getPeaState().ordinal() < State.BLUE_FIRE.ordinal()) {// pea and fire to blue fire
					this.setPeaState(State.BLUE_FIRE);
				}
			} else {// fire
				if (this.getPeaState() == State.ICE) {//ice to normal 
					this.setPeaState(State.NORMAL);
				} else if (this.getPeaState() == State.NORMAL) {//normal to fire
					this.setPeaState(State.FIRE);
				}
			}
		}
	}

	private void dealPeaDamage(Entity target) {
		final float damage = this.getAttackDamage();
		if (this.getPeaState() == State.NORMAL) {// normal pea attack
			target.hurt(PVZEntityDamageSource.pea(this, this.getThrower()), damage);
		} else if (this.getPeaState() == State.ICE) {// snow pea attack
			PVZEntityDamageSource source = PVZEntityDamageSource.snowPea(this, this.getThrower());
			LivingEntity owner = this.getThrower();
			if (owner instanceof IIceEffect) {
				((IIceEffect) owner).getFrozenEffect().ifPresent(e -> source.addEffect(e));
			}
			target.hurt(source, damage);
			target.clearFire();
			if(target.canFreeze() && (!(target instanceof IPAZEntity) || ((IPAZEntity) target).canBeCold()) && target.getTicksFrozen() < CHILL_FROZEN_TICK) {
				target.setTicksFrozen(CHILL_FROZEN_TICK);
			}
		} else if (this.getPeaState() == State.FIRE || this.getPeaState() == State.BLUE_FIRE) {
			target.hurt(PVZEntityDamageSource.flamePea(this, this.getThrower()), damage);
			this.doSplashDamage(target);
		}
	}

	/**
	 * 火球 1×1 溅射：总溅射池 = 直接伤害×35%(火球40对应溅射14)，按溅射目标数分摊，溅射不去冰。
	 * {@link #dealPeaDamage(Entity)}
	 */
	private void doSplashDamage(Entity directTarget) {
		if(this.level.isClientSide()) {
			return;
		}
		final float splashPool = this.getAttackDamage() * 0.35F;
		List<LivingEntity> splashTargets = this.level.getEntitiesOfClass(LivingEntity.class,
				EntityUtil.getEntityAABB(this, 1F, 1F), target -> target != directTarget && this.shouldHit(target));
		if(splashTargets.isEmpty()) {
			return;
		}
		final float each = splashPool / splashTargets.size();
		splashTargets.forEach(target -> target.hurt(PVZEntityDamageSource.flamePea(this, this.getThrower()), each));
	}
	
	@Override
	public float getAttackDamage() {
		float damage = this.attackDamage;
		damage *= (1 + this.power * 1.0f / 5);
		// size
		if (this.getPeaType() == Type.BIG) {
			damage += 20f;
		} else if (this.getPeaType() == Type.HUGE) {
			damage += 75f;
		}
		// fire 
		if (this.getPeaState() == State.FIRE) {
			damage *= 2F;//PvZ1 火球 = 豌豆 ×2 = 40
		} else if (this.getPeaState() == State.BLUE_FIRE) {
			damage *= 3F;//PvZ2 施肥蓝火 = 豌豆 ×3
		}
		return damage;
	}
	
	@Override
	protected int getMaxLiveTick() {
		return 40;
	}

	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		if (this.getPeaType() == Type.NORMAL) {
			return new EntityDimensions(0.2f, 0.2f, false);
		}
		if (this.getPeaType() == Type.BIG) {
			return new EntityDimensions(0.4f, 0.4f, false);
		}
		if (this.getPeaType() == Type.HUGE) {
			return new EntityDimensions(0.6f, 0.6f, false);
		}
		return new EntityDimensions(0.2f, 0.2f, false);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("peaState", this.getPeaState().ordinal());
		compound.putInt("peaType", this.getPeaType().ordinal());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if(compound.contains("peaState")) {
			this.setPeaState(State.values()[compound.getInt("peaState")]);
		}
		if(compound.contains("peaType")) {
			this.setPeaType(Type.values()[compound.getInt("peaType")]);
		}
	}

	public State getPeaState() {
		return State.values()[entityData.get(PEA_STATE)];
	}

	public void setPeaState(State state) {
		entityData.set(PEA_STATE, state.ordinal());
	}

	public Type getPeaType() {
		return Type.values()[entityData.get(PEA_TYPE)];
	}

	public void setPeaType(Type type) {
		entityData.set(PEA_TYPE, type.ordinal());
	}

	@Override
	public ItemStack getItem() {
		if (this.getPeaState() == State.NORMAL) {
			return new ItemStack(ItemRegister.PEA.get());
		}
		if (this.getPeaState() == State.ICE) {
			return new ItemStack(ItemRegister.SNOW_PEA.get());
		}
		if (this.getPeaState() == State.FIRE) {
			return new ItemStack(ItemRegister.FLAME_PEA.get());
		}
		return new ItemStack(ItemRegister.PEA.get());
	}
	
	public void setPower(int lvl) {
		this.power = lvl;
	}

	public enum Type {
		NORMAL,
		BIG,
		HUGE,
	}

	public enum State {
		ICE,
		NORMAL,
		FIRE,
		BLUE_FIRE,
		ELECTRICITY,
	}

}