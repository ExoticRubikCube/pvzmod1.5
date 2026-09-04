package com.hungteen.pvz.data.loot;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class LootTableGenerator extends LootTableProvider{

	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> tables = ImmutableList.of(
			Pair.of(PVZChestLootTables::new, LootContextParamSets.CHEST),
			Pair.of(PVZEntityLootTables::new, LootContextParamSets.ENTITY),
			Pair.of(PVZBlockLootTables::new, LootContextParamSets.BLOCK),
			Pair.of(PVZFishingLootTables::new, LootContextParamSets.FISHING)
			);
	
	public LootTableGenerator(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
		return this.tables;
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationContext) {
		map.forEach((id, builder) -> LootTables.validate(validationContext, id, builder));
	}

	@Override
	public String getName() {
		return "Plants vs Zombies loot tables";
	}
	
}
