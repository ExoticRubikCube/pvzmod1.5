package com.hungteen.pvz.common.entity.misc.drop;

import com.hungteen.pvz.api.interfaces.ICollectible;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public abstract class DropEntity extends Entity implements ICollectible {

	private static final EntityDataAccessor<Integer> AMOUNT = SynchedEntityData.defineId(DropEntity.class, EntityDataSerializers.INT);
	private static final EntityDataAccessor<Integer> STATE  = SynchedEntityData.defineId(DropEntity.class, EntityDataSerializers.INT);
	private static final double GRAVITY = 0.08D;
	private static final double VERTICAL_DRAG = 0.98D;
	private static final double AIR_DRAG = 0.91D;
	private static final double GROUND_DRAG = 0.6D * 0.91D;
	protected int liveTime = 0;
	private double lastYd;
	private boolean dropped;

	public DropEntity(EntityType<? extends Entity> type, Level worldIn) {
		super(type, worldIn);
		this.setInvulnerable(true);
	}

	@Override
	protected void defineSynchedData() {
		this.entityData.define(AMOUNT, 1);
		this.entityData.define(STATE, DropStates.NORMAL.ordinal());
	}

	@Override
	public void tick() {
		super.tick();
		this.noPhysics = this.getDropState() != DropStates.NORMAL;

		if(! level.isClientSide()) {
			if(! this.dropped) {
				this.dropped = true;
				this.onDropped();
			}
			if(this.getDropState() == DropStates.NORMAL) {
				++ this.liveTime;
			}
		    if(this.liveTime >= this.getMaxLiveTick()) {
				this.discard();
		    }
		}
		this.tickMove();
	}

	/**
	 * Entity has no travel logic, so drop moves itself.
	 */
	private void tickMove() {
		final double drag = this.onGround ? GROUND_DRAG : AIR_DRAG;
		final double gravity = this.isNoGravity() ? 0.0D : GRAVITY;
		Vec3 motion = this.getDeltaMovement();
		motion = new Vec3(motion.x * drag, (motion.y - gravity) * VERTICAL_DRAG, motion.z * drag);
		if(this.isInWater()) {
			// buoyancy push and damping, same as Boat.floatBoat
			final double buoyancy = (this.getWaterLevelAbove() - this.getY()) / this.getBbHeight();
			if(buoyancy > 0.0D) {
				motion = new Vec3(motion.x, (motion.y + buoyancy * 0.06153846016296973D) * 0.75D, motion.z);
			}
		}
		this.lastYd = motion.y;
		this.setDeltaMovement(motion);
		this.move(MoverType.SELF, motion);
	}

	private float getWaterLevelAbove() {
		AABB aabb = this.getBoundingBox();
		int i = Mth.floor(aabb.minX);
		int j = Mth.ceil(aabb.maxX);
		int k = Mth.floor(aabb.maxY);
		int l = Mth.ceil(aabb.maxY - this.lastYd);
		int i1 = Mth.floor(aabb.minZ);
		int j1 = Mth.ceil(aabb.maxZ);
		BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

		for(int k1 = k; k1 < l; ++ k1) {
			float f = 0.0F;
			for(int l1 = i; l1 < j && f < 1.0F; ++ l1) {
				for(int i2 = i1; i2 < j1 && f < 1.0F; ++ i2) {
					pos.set(l1, k1, i2);
					FluidState fluidstate = this.level.getFluidState(pos);
					if(fluidstate.is(FluidTags.WATER)) {
						f = Math.max(f, fluidstate.getHeight(this.level, pos));
					}
				}
			}
			if(f < 1.0F) {
				return (float) pos.getY() + f;
			}
		}
		return (float)(l + 1);
	}

	@Override
	public boolean isInvulnerableTo(DamageSource source) {
		return source != DamageSource.OUT_OF_WORLD;
	}

	@Override
	public void playerTouch(Player entityIn) {// collect by colliding with entity.
		if(this.canCollectBy(entityIn)) {
			this.onCollect(entityIn);
		}
	}

	@Override
	public boolean canCollectBy(LivingEntity living) {
		return living instanceof Player && EntityUtil.isEntityValid(this) && this.getDropState() != DropStates.STEAL;
	}

	@Override
	public void onCollect(LivingEntity living) {
		if(living instanceof Player) {
			this.onCollectedByPlayer((Player) living);
		}
		this.discard();
	}

	/**
	 * run when collect the drop.
	 */
	public abstract void onCollectedByPlayer(Player player);

	/**
	 * drop live tick,read from config file
	 */
	protected abstract int getMaxLiveTick();

	/**
	 * called when first tick in world.
	 */
	protected void onDropped() {

	}

	@Override
	public boolean isPickable() {
		return true;
	}

	@Override
	public void onSyncedDataUpdated(EntityDataAccessor<?> key) {
		if(AMOUNT.equals(key)) {
			this.refreshDimensions();
		}
		super.onSyncedDataUpdated(key);
	}

	@Override
	public boolean causeFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
		return false;
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		if(compound.contains("live_time")) {
			this.liveTime = compound.getInt("live_time");
		}
		if(compound.contains("drop_amount")) {
			this.setAmount(compound.getInt("drop_amount"));
		}
		if(compound.contains("drop_state")) {
			this.setDropState(DropStates.values()[compound.getInt("drop_state")]);
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		compound.putInt("live_time", this.liveTime);
		compound.putInt("drop_amount", this.getAmount());
		compound.putInt("drop_state", this.getDropState().ordinal());
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return new ClientboundAddEntityPacket(this);
	}

	public int getAmount(){
		return this.entityData.get(AMOUNT);
	}

	public void setAmount(int num){
		this.entityData.set(AMOUNT, num);
	}

	public DropStates getDropState(){
		return DropStates.values()[this.entityData.get(STATE)];
	}

	public void setDropState(DropStates state){
		this.entityData.set(STATE, state.ordinal());
	}

	public enum DropStates {
		NORMAL,
		ABSORB,
		STEAL
	}

}
