package com.hungteen.pvz.common.entity.plant.light;

import com.hungteen.pvz.api.interfaces.IAlmanacEntry;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.misc.drop.SunEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantProducerEntity;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.enums.PAZAlmanacs;
import com.mojang.datafixers.util.Pair;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;

import java.util.Arrays;
import java.util.List;

public class SunFlowerEntity extends PlantProducerEntity{

	public SunFlowerEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
	}

	@Override
	public void genSomething() {
		this.genSun(this.getSunAmount(), 1);
	}

	@Override
	public void genSuper() {
		SunEntity.spawnSunsByAmount(level, blockPosition(), this.getSuperSunAmount(), 100, 1);
		EntityUtil.playSound(this, SoundEvents.EXPERIENCE_ORB_PICKUP);
	}

	@Override
	public void addAlmanacEntries(List<Pair<IAlmanacEntry, Number>> list) {
		super.addAlmanacEntries(list);
		list.addAll(List.of(
                Pair.of(PAZAlmanacs.GEN_SUN_AMOUNT, this.getSunAmount())
        ));
	}

	/**
	 * get normal gen sun amount by maxLevel.
	 */
	public int getSunAmount(){
		return 25;
	}
	
	/**
	 * get normal gen sun amount by maxLevel.
	 */
	public int getSuperSunAmount(){
		return 500;
	}
	
	@Override
	public int getGenCD() {
		final int time = 250;
		return this.level.isDay() ?(this.level.isRaining() ? 2 * time : time) : 3 * time;
	}
	
	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		return EntityDimensions.scalable(0.8f, 1.3f);
	}
	
	@Override
	public IPlantType getPlantType() {
		return PVZPlants.SUN_FLOWER;
	}

}