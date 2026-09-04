package com.hungteen.pvz.common.capability.player;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;

public class PlayerDataStorage {

	public CompoundTag writeNBT(IPlayerDataCapability instance) {
		return instance.getPlayerData().saveToNBT();
	}

	public void readNBT(IPlayerDataCapability instance, Tag nbt) {
		if(nbt instanceof CompoundTag) {
			instance.getPlayerData().loadFromNBT((CompoundTag) nbt);
		}
	}
}