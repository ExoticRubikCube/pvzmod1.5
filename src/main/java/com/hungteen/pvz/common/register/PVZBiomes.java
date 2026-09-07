package com.hungteen.pvz.common.register;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.world.feature.PVZFeatures;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PVZBiomes {

	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, PVZMod.MOD_ID);

	public static final RegistryObject<Biome> ZEN_GARDEN = BIOMES.register("zen_garden", PVZBiomes::zenGarden);

	public static Holder<PlacedFeature> NUT_TREE_PF = null;
	public static Holder<PlacedFeature> CHOMPER_PATCH_PF = null;
	private static boolean features;

	private static void checkFeatures() {
		if (features) {
			return;
		}
		Holder<PlacedFeature> chomper = PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(BlockRegister.CHOMPER.get().defaultBlockState())),
				BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK)));
		CHOMPER_PATCH_PF = PlacementUtils.register("pvz:chomper_patch",
				FeatureUtils.register("pvz:chomper_patch", Feature.RANDOM_PATCH,
						new RandomPatchConfiguration(64, 7, 3, chomper)),
				InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), RarityFilter.onAverageOnceEvery(32));
		NUT_TREE_PF = PlacementUtils.register("pvz:nut_tree", PVZFeatures.NUT_TREE,
				VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05F, 1), BlockRegister.NUT_SAPLING.get()));
		features = true;
	}

	private static Biome zenGarden() {
		checkFeatures();

		MobSpawnSettings.Builder mobSpawnBuilder = new MobSpawnSettings.Builder();

		BiomeGenerationSettings.Builder biomeGenBuilder = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultCrystalFormations(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultUndergroundVariety(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultOres(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultSoftDisks(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultSprings(biomeGenBuilder);
		BiomeDefaultFeatures.addPlainGrass(biomeGenBuilder);
		biomeGenBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUNFLOWER);
		BiomeDefaultFeatures.addPlainVegetation(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultMushrooms(biomeGenBuilder);
		BiomeDefaultFeatures.addDefaultExtraVegetation(biomeGenBuilder);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenBuilder);
		biomeGenBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CHOMPER_PATCH_PF);
		biomeGenBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, NUT_TREE_PF);

		return new Biome.BiomeBuilder()
				.precipitation(Biome.Precipitation.RAIN)
				.temperature(0.8F)
				.downfall(0.4F)
				.specialEffects(new BiomeSpecialEffects.Builder()
						.fogColor(12638463)
						.waterColor(4159204)
						.waterFogColor(329011)
						.skyColor(7907327)
						.ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
						.build())
				.mobSpawnSettings(mobSpawnBuilder.build())
				.generationSettings(biomeGenBuilder.build())
				.build();
	}
}
