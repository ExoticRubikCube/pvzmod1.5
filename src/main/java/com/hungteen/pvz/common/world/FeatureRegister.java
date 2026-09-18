package com.hungteen.pvz.common.world;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.world.feature.Plantern;
import com.hungteen.pvz.common.world.structure.StructureRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FeatureRegister {

	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
			PVZMod.MOD_ID);

	public static final DeferredRegister<StructureSet> STRUCTURE_SETS =
			DeferredRegister.create(Registry.STRUCTURE_SET_REGISTRY, PVZMod.MOD_ID);

	public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPES =
			DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, PVZMod.MOD_ID);

	public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECE_TYPES =
			DeferredRegister.create(Registry.STRUCTURE_PIECE_REGISTRY, PVZMod.MOD_ID);

	public static final RegistryObject<Feature<SimpleBlockConfiguration>> PLANTERN_FEATURE =
			FEATURES.register("plantern_feature", Plantern::new);

	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LUNAR_STONE_CF;
	public static Holder<PlacedFeature> ORE_LUNAR_STONE_PF;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_ORIGIN_CF;
	public static Holder<PlacedFeature> ORE_ORIGIN_PF;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PLANTERN_CF;
	public static Holder<PlacedFeature> PLANTERN_PF;

	private static boolean initialized = false;

	@SubscribeEvent
	public static void onCommonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			if (!initialized) {
				initialized = true;
				StructureRegister.setupStructures();
				setupOres();
			}
		});
	}

	private static void setupOres() {
		ORE_LUNAR_STONE_CF = FeatureUtils.register("pvz:ore_lunar_stone", Feature.ORE,
				new OreConfiguration(new BlockMatchTest(Blocks.STONE),
						BlockRegister.LUNAR_STONE.get().defaultBlockState(), 4));
		ORE_LUNAR_STONE_PF = PlacementUtils.register("pvz:ore_lunar_stone", ORE_LUNAR_STONE_CF,
				List.of(CountPlacement.of(20),
						InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)),
						BiomeFilter.biome()));
		ORE_ORIGIN_CF = FeatureUtils.register("pvz:ore_origin", Feature.ORE,
				new OreConfiguration(new BlockMatchTest(Blocks.GRASS_BLOCK),
						BlockRegister.ORIGIN_ORE.get().defaultBlockState(), 4));
		ORE_ORIGIN_PF = PlacementUtils.register("pvz:ore_origin", ORE_ORIGIN_CF,
				List.of(CountPlacement.of(3),
						InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(200)),
						BiomeFilter.biome()));
		PLANTERN_CF = FeatureUtils.register("pvz:plantern", Feature.FLOWER,
				new RandomPatchConfiguration(1, 1, 1, PlacementUtils.onlyWhenEmpty(PLANTERN_FEATURE.get(),
						new SimpleBlockConfiguration(BlockStateProvider.simple(BlockRegister.PLANTERN.get())))));
		PLANTERN_PF = PlacementUtils.register("pvz:plantern", PLANTERN_CF,
				List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
	}
}