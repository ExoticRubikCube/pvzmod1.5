package com.hungteen.pvz.common.entity.plant.assist;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidType;

import java.util.List;

/**
 * Leaf that floats on water and carries other plants riding on it.
 */
public class LilyPadEntity extends PVZPlantEntity {

	private Vec3 storedPosition = Vec3.ZERO;

	public LilyPadEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
		this.root = false;
	}

	@Override
	public IPlantType getPlantType() {
		return PVZPlants.LILY_PAD;
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	@Override
	public boolean canHoldPlant() {
		return true;
	}

	@Override
	public boolean canPlantOnMe(IPlantType type) {
		return super.canPlantOnMe(type) && !type.isWaterPlant() && type != PVZPlants.SPIKE_WEED
				&& type != PVZPlants.SPIKE_ROCK && type != PVZPlants.POTATO_MINE;
	}

	@Override
	protected float getWaterSlowDown() {
		return 1F;
	}

	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		return EntityDimensions.scalable(0.875F, 0.2F);
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public boolean canCollideWith(Entity entity) {
		return true;
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	public double getPassengersRidingOffset() {
		return 0.2D;
	}

	@Override
	public boolean canBeRiddenUnderFluidType(FluidType type, Entity rider) {
		return true;
	}

	@Override
	public boolean rideableUnderWater() {
		return true;
	}

	@Override
	public void tick() {
		if (! this.noPhysics && ! this.level.isClientSide) {
			if (! this.level.getFluidState(new BlockPos(this.position().add(0, this.getBbHeight(), 0))).isEmpty()
					|| this.isInLava()) {
				this.setDeltaMovement(this.getDeltaMovement().add(0, 0.06, 0).multiply(0.5, 0.5, 0.5));
			} else if (! this.level.getFluidState(new BlockPos(this.position().add(0, this.getEyeHeight(), 0))).isEmpty()) {
				this.setDeltaMovement(this.getDeltaMovement().multiply(0.5, 0.5, 0.5));
				if (Math.abs(this.getDeltaMovement().y) < 0.001 && this.getDeltaMovement().y != 0) {
					this.setDeltaMovement(this.getDeltaMovement().multiply(1, 0, 1));
				}
			}
		}
		if (level.isClientSide && ! level.getFluidState(new BlockPos(position().add(0, this.getEyeHeight(), 0))).isEmpty()) {
			Vec3 deltaMovement = this.position().subtract(storedPosition);
			if (deltaMovement.distanceToSqr(Vec3.ZERO) > 0.1) {
				for (int i = 0; i < 3; i ++) {
					level.addParticle(ParticleTypes.SPLASH,
							this.getX() - (deltaMovement.x + 1) * random.nextFloat() + 0.5F,
							this.getY() - deltaMovement.y * random.nextFloat(),
							this.getZ() - (deltaMovement.z + 1) * random.nextFloat() + 0.5F,
							0, 0, 0);
				}
			}
			storedPosition = this.position();
		}
		super.tick();
	}

	@Override
	public void remove(RemovalReason reason) {
		List.copyOf(this.getPassengers()).forEach(Entity::discard);
		super.remove(reason);
	}
}