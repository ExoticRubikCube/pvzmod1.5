package com.hungteen.pvz.data.loot;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PVZFishingLootTables implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>> {

	@Override
	public void accept(BiConsumer<ResourceLocation, LootTable.Builder> t) {
		
	}

}
