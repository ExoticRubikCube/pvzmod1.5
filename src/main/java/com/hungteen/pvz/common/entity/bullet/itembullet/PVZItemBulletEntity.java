package com.hungteen.pvz.common.entity.bullet.itembullet;

import com.hungteen.pvz.common.entity.bullet.AbstractBulletEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.level.Level;

public abstract class PVZItemBulletEntity extends AbstractBulletEntity implements ItemSupplier {

	public PVZItemBulletEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
	}

	public PVZItemBulletEntity(EntityType<?> type, Level worldIn, LivingEntity shooter) {
		super(type, worldIn, shooter);
	}
	
}