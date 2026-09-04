package com.hungteen.pvz.api.interfaces;

import net.minecraft.world.entity.LivingEntity;

import javax.annotation.Nullable;

/**
 * use to check can entity be charmed.
 */
public interface ICanBeCharmed {

	boolean isCharmed();
	
	void onCharmedBy(@Nullable LivingEntity entity);
}