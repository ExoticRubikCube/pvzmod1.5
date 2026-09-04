package com.hungteen.pvz.common.capability.challenge;

import com.hungteen.pvz.common.capability.CapabilityHandler;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class RaiderDataProvider implements ICapabilitySerializable<CompoundTag> {

    private final IRaiderDataCapability capability = new RaiderDataCapability();

    public RaiderDataProvider(int ch) {
        capability.init(ch);
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return CapabilityHandler.RAIDER_DATA_CAPABILITY.orEmpty(cap, LazyOptional.of(()->capability));
    }

    @Override
    public CompoundTag serializeNBT() {
        return capability.SavetoNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        capability.LoadfromNBT(nbt);
    }
}