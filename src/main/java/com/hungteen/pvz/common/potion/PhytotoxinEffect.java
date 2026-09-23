package com.hungteen.pvz.common.potion;

import com.hungteen.pvz.common.misc.tag.PVZEntityTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class PhytotoxinEffect extends MobEffect {

	public PhytotoxinEffect(MobEffectCategory typeIn, int liquidColorIn) {
		super(typeIn, liquidColorIn);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		final int interval = 25 >> amplifier;
		return interval <= 0 || duration % interval == 0;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		if(entity.getType().is(PVZEntityTypeTags.PVZ_PLANTS)) {
			entity.removeEffect(this);
		} else if(entity.getHealth() > 1.0F) {
			entity.hurt(DamageSource.MAGIC, 1.0F);
		}
	}
}