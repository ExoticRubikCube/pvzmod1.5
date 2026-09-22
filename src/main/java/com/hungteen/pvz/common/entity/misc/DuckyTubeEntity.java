package com.hungteen.pvz.common.entity.misc;

import com.hungteen.pvz.common.entity.zombie.PVZZombieToolBase;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.level.Level;
import net.minecraftforge.fluids.FluidType;

public class DuckyTubeEntity extends PVZZombieToolBase {

	public DuckyTubeEntity(EntityType<? extends Mob> type, Level worldIn) {
		super(type, worldIn);
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new FloatGoal(this));
	}

	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		return new EntityDimensions(0.2f, 0.2f, false);
	}

	@Override
	public double getPassengersRidingOffset() {
		return -0.7f;
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	@Override
	public boolean rideableUnderWater() {
		return true;
	}

	@Override
	public boolean canBeRiddenUnderFluidType(FluidType type, Entity rider) {
		return true;
	}
}