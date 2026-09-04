package com.hungteen.pvz.common.capability.challenge;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;

public class RaiderDataStorage {
    public Tag writeNBT(IRaiderDataCapability instance) {
        return instance.SavetoNBT();
    }

    public void readNBT(IRaiderDataCapability instance, Tag nbt) {
        instance.LoadfromNBT((CompoundTag) nbt);
    }
}