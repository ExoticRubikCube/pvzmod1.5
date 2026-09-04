package com.hungteen.pvz.common.world.biome;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.world.feature.PVZFeatures;

import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ZenGardenBiome {

	public static Biome getZenGardenBiome() {
		//special effect
		final BiomeSpecialEffects.Builder effectBuilder = new BiomeSpecialEffects.Builder()
				.waterColor(4159204).waterFogColor(329011).fogColor(12638463)
				.skyColor(getSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS);

		//mob spawner
		final MobSpawnSettings.Builder mobBuilder = new MobSpawnSettings.Builder();
		mobBuilder.addSpawn(MobCategory.AMBIENT, new SpawnerData(EntityRegister.SUN.get(), 100, 1, 1));

		//decoration
		BiomeGenerationSettings.Builder genBuilder = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(genBuilder);
		BiomeDefaultFeatures.addDefaultMonsterRoom(genBuilder);
		BiomeDefaultFeatures.addPlainGrass(genBuilder);
		BiomeDefaultFeatures.addPlainVegetation(genBuilder);
		BiomeDefaultFeatures.addDefaultOres(genBuilder);
		BiomeDefaultFeatures.addDefaultSoftDisks(genBuilder);
		BiomeDefaultFeatures.addDefaultUndergroundVariety(genBuilder);
		BiomeDefaultFeatures.addDefaultSprings(genBuilder);
		BiomeDefaultFeatures.addDefaultMushrooms(genBuilder);
		BiomeDefaultFeatures.addDefaultFlowers(genBuilder);
		BiomeDefaultFeatures.addSurfaceFreezing(genBuilder);

		genBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUNFLOWER);
		genBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUGAR_CANE);
		genBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_PUMPKIN);
		genBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PVZFeatures.PATCH_CHOMPER_PLANT);
		genBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PVZFeatures.TREES_NUT);

		return BiomeRegister.makeBiome(Biome.Precipitation.RAIN, 0.8F, 0.4F,
				effectBuilder.build(), mobBuilder.build(), genBuilder.build());
	}

	private static int getSkyColor(float p_48083_) {
		float f = p_48083_ / 3.0F;
		f = net.minecraft.util.Mth.clamp(f, -1.0F, 1.0F);
		return net.minecraft.util.Mth.hsvToRgb(0.62222224F - f * 0.05F, 0.5F + f * 0.1F, 1.0F);
	}

	@SuppressWarnings("deprecation")
	private static Holder<PlacedFeature> placed(ResourceKey<PlacedFeature> key) {
		return BuiltinRegistries.PLACED_FEATURE.getHolder(key).orElseThrow(
				() -> new IllegalStateException("Missing builtin placed feature: " + key));
	}

}
