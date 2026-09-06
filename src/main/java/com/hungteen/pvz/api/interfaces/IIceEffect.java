package com.hungteen.pvz.api.interfaces;

import net.minecraft.world.effect.MobEffectInstance;

import java.util.Optional;

public interface IIceEffect {

    Optional<MobEffectInstance> getColdEffect();

    Optional<MobEffectInstance> getFrozenEffect();
}