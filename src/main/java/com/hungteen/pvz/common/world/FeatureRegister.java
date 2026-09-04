package com.hungteen.pvz.common.world;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.world.feature.GenOres;
import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.hungteen.pvz.utils.ConfigUtil;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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

	public static Holder<PlacedFeature> PLACED_AMETHYST_ORE;
	public static Holder<PlacedFeature> PLACED_LUNAR_STONE;
	public static Holder<PlacedFeature> PLACED_ORIGIN_ORE;
	public static Holder<PlacedFeature> PLACED_DOUBLE_ORIGIN_ORE;

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
		Holder<ConfiguredFeature<?, ?>> amethystCF = Holder.direct(new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(OreConfiguration.target(GenOres.FillerBlockType.END_STONE,
						BlockRegister.AMETHYST_ORE.get().defaultBlockState())), 4)));
		Holder<ConfiguredFeature<?, ?>> lunarCF = Holder.direct(new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(OreConfiguration.target(GenOres.FillerBlockType.STONE,
						BlockRegister.LUNAR_STONE.get().defaultBlockState())), 4)));
		Holder<ConfiguredFeature<?, ?>> originCF = Holder.direct(new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(OreConfiguration.target(GenOres.FillerBlockType.GRASS,
						BlockRegister.ORIGIN_ORE.get().defaultBlockState())), 4)));
		Holder<ConfiguredFeature<?, ?>> originDoubleCF = Holder.direct(new ConfiguredFeature<>(Feature.ORE,
				new OreConfiguration(List.of(OreConfiguration.target(GenOres.FillerBlockType.GRASS,
						BlockRegister.ORIGIN_ORE.get().defaultBlockState())), 4)));

		PLACED_AMETHYST_ORE = placed(amethystCF,
				CountPlacement.of(ConfigUtil.getGenAmethystOreChance()),
				InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)),
				BiomeFilter.biome());
		PLACED_LUNAR_STONE = placed(lunarCF,
				CountPlacement.of(ConfigUtil.getGenLunarStoneChance()),
				InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(128)),
				BiomeFilter.biome());
		PLACED_ORIGIN_ORE = placed(originCF,
				CountPlacement.of(ConfigUtil.getGenOriginOreChance()),
				InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(200)),
				BiomeFilter.biome());
		PLACED_DOUBLE_ORIGIN_ORE = placed(originDoubleCF,
				CountPlacement.of(ConfigUtil.getGenOriginOreChance() * 2),
				InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(200)),
				BiomeFilter.biome());
	}

	private static Holder<PlacedFeature> placed(Holder<ConfiguredFeature<?, ?>> cf, PlacementModifier... modifiers) {
		return Holder.direct(new PlacedFeature(cf, List.of(modifiers)));
	}

}
