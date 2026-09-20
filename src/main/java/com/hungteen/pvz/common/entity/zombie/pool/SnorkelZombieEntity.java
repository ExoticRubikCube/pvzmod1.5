package com.hungteen.pvz.common.entity.zombie.pool;

import com.hungteen.pvz.common.entity.zombie.base.SwimmerZombieEntity;
import com.hungteen.pvz.common.impl.zombie.PoolZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.utils.ZombieUtil;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class SnorkelZombieEntity extends SwimmerZombieEntity {

	public SnorkelZombieEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
	}

	@Override
	public float getWalkSpeed() {
		return ZombieUtil.WALK_LITTLE_FAST;
	}

	@Override
	public float getLife() {
		return 27;
	}

	@Override
	protected float getWaterSlowDown() {
		return 1.175f;//潜水4s/格 ÷ 普通4.7s/格
	}
	
	@Override
	public ZombieType getZombieType() {
		return PoolZombies.SNORKEL_ZOMBIE;
	}

}