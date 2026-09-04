package com.hungteen.pvz.common.entity.zombie.grass;

import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.impl.zombie.GrassZombies;
import com.hungteen.pvz.common.impl.zombie.ZombieType;
import com.hungteen.pvz.utils.ZombieUtil;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class NormalZombieEntity extends PVZZombieEntity {

	public NormalZombieEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
	}
	
	@Override
    public VariantType getRandomVariant() {
		VariantType type = super.getRandomVariant();
		if(type == VariantType.NORMAL) {
			if(this.getRandom().nextInt(200) == 0) {
				this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(ZombieUtil.NORMAL_DAMAGE);
			    return VariantType.BEARD;
			}
		}
		return type;
	}

	@Override
	public float getLife() {
		return 20;
	}
	
	@Override
	protected float getWaterSlowDown() {
		return 0.91f;
	}
	
	@Override
	public ZombieType getZombieType() {
		return GrassZombies.NORMAL_ZOMBIE;
	}

}