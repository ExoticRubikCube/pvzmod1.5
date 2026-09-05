package com.hungteen.pvz.common.world.biome;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biome.Precipitation;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BiomeRegister {

	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, PVZMod.MOD_ID);

	public static final RegistryObject<Biome> ZEN_GARDEN = BIOMES.register("zen_garden", () -> ZenGardenBiome.getZenGardenBiome());

	/*
	 * {@link RegistryHandler#setUp(FMLCommonSetupEvent)}
	 */
	public static void registerBiomes(final FMLCommonSetupEvent ev) {
		ev.enqueueWork(() -> {
			registerBiome(ZEN_GARDEN.getKey(), BiomeType.WARM, PVZConfig.COMMON_CONFIG.WorldSettings.GenZenGardenChance.get());
		});
	}

	private static void registerBiome(final ResourceKey<Biome> biomeKey, final BiomeManager.BiomeType biomeType, final int weight) {
		BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biomeKey, weight));
	}

	public static Biome makeBiome(Precipitation precipitation, float temperature, float downfall, BiomeSpecialEffects effect, MobSpawnSettings mobInfo, BiomeGenerationSettings generateSettings) {
		Biome.BiomeBuilder builder = new Biome.BiomeBuilder()
				.precipitation(precipitation)
				.temperature(temperature)
				.downfall(downfall)
				.specialEffects(effect)
				.mobSpawnSettings(mobInfo)
				.generationSettings(generateSettings);
		if (precipitation == Precipitation.SNOW) {
			builder.temperatureAdjustment(Biome.TemperatureModifier.FROZEN);
		}
		return builder.build();
	}

}
