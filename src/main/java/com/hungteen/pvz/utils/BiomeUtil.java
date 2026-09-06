package com.hungteen.pvz.utils;

import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BiomeUtil {

    public static final Set<Biome> OVERWORLD_LAND = new HashSet<>();
    public static final Set<Biome> OVERWORLD_DESERT = new HashSet<>();
    public static final Set<Biome> OVERWORLD_OCEAN = new HashSet<>();
    public static final Set<Biome> OVERWORLD_PLAIN = new HashSet<>();
    public static final Set<Biome> OVERWORLD_CONIFEROUS = new HashSet<>();//taiga
    public static final Set<Biome> OVERWORLD_SNOW_LAND = new HashSet<>();
    public static final Set<Biome> OVERWORLD_FOREST = new HashSet<>();
    public static final Set<Biome> NETHER = new HashSet<>();
    public static final Set<Biome> THE_END = new HashSet<>();

    public static void initBiomeSet() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ResourceKey<Biome> biomeKey = getKey(biome);
            if (isOverworld(biomeKey)) {
                if (isLand(biomeKey)) {
                    OVERWORLD_LAND.add(biome);
                    if (isSnowy(biomeKey)) {
                        OVERWORLD_SNOW_LAND.add(biome);
                    }
                }
                if (isDesert(biomeKey)) {
                    OVERWORLD_DESERT.add(biome);
                }
                if (isOcean(biomeKey)) {
                    OVERWORLD_OCEAN.add(biome);
                }
                if (isPlain(biomeKey)) {
                    OVERWORLD_PLAIN.add(biome);
                }
                if (isConiferous(biomeKey)) {
                    OVERWORLD_CONIFEROUS.add(biome);
                }
                if (isForest(biomeKey)) {
                    OVERWORLD_FOREST.add(biome);
                }
            }
            if (isNether(biomeKey)) {
                NETHER.add(biome);
            }
            if (isTheEnd(biomeKey)) {
                THE_END.add(biome);
            }
        }
    }

    public static boolean hasTag(ResourceKey<Biome> biomeKey, TagKey<Biome> tag) {
        return ForgeRegistries.BIOMES.getHolder(biomeKey)
                .map(holder -> holder.is(tag))
                .orElse(false);
    }

    public static boolean isLand(ResourceKey<Biome> biomeKey) {
        return !isOcean(biomeKey) && !hasTag(biomeKey, BiomeTags.IS_RIVER);
    }

    public static boolean isOcean(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, BiomeTags.IS_OCEAN);
    }

    public static boolean isDesert(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, Tags.Biomes.IS_DESERT) || hasTag(biomeKey, Tags.Biomes.IS_SANDY);
    }

    public static boolean isPlain(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, Tags.Biomes.IS_PLAINS);
    }

    public static boolean isConiferous(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, Tags.Biomes.IS_CONIFEROUS);
    }

    public static boolean isSnowy(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, Tags.Biomes.IS_SNOWY);
    }

    public static boolean isForest(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, BiomeTags.IS_FOREST);
    }

    public static boolean isOverworld(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, BiomeTags.IS_OVERWORLD);
    }

    public static boolean isNether(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, BiomeTags.IS_NETHER);
    }

    public static boolean isNetherWaste(ResourceKey<Biome> biomeKey) {
        return biomeKey.equals(Biomes.NETHER_WASTES);
    }

    public static boolean isTheEnd(ResourceKey<Biome> biomeKey) {
        return hasTag(biomeKey, BiomeTags.IS_END);
    }
    
    public static ResourceKey<Biome> getKey(final Biome biome) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOMES, Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome), "Biome registry name was null"));
    }
}