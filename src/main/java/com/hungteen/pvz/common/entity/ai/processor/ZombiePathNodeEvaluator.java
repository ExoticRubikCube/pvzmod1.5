package com.hungteen.pvz.common.entity.ai.processor;

import com.hungteen.pvz.common.entity.zombie.base.SwimmerZombieEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.PathNavigationRegion;
import net.minecraft.world.level.pathfinder.AmphibiousNodeEvaluator;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

public class ZombiePathNodeEvaluator extends AmphibiousNodeEvaluator {

	public ZombiePathNodeEvaluator(boolean pPrefersShallowSwimming) {
		super(pPrefersShallowSwimming);
	}

	public void prepare(PathNavigationRegion p_225578_1_, Mob mob) {
		super.prepare(p_225578_1_, mob);
		if(mob instanceof SwimmerZombieEntity) {
			mob.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
		    mob.setPathfindingMalus(BlockPathTypes.WALKABLE, 3F);
		    mob.setPathfindingMalus(BlockPathTypes.WATER_BORDER, 4.0F);
		} else {
			mob.setPathfindingMalus(BlockPathTypes.WATER, 2.0F);
		    mob.setPathfindingMalus(BlockPathTypes.WALKABLE, 0F);
		    mob.setPathfindingMalus(BlockPathTypes.WATER_BORDER, 4.0F);
		}
	}
	
}