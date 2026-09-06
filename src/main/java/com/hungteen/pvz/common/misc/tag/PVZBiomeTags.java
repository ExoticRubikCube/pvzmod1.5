package com.hungteen.pvz.common.misc.tag;

import com.hungteen.pvz.PVZMod;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

/**
 * used in {@link com.hungteen.pvz.data.tag.BiomeTagGen}
 */
public class PVZBiomeTags {

	//structure generation tags
	public static final TagKey<Biome> HAS_BUCKET_HOUSE = pvzTag("has_structure_bucket_house");
	public static final TagKey<Biome> HAS_DOLPHIN_HOUSE = pvzTag("has_structure_dolphin_house");
	public static final TagKey<Biome> HAS_GRAVE_HOUSE = pvzTag("has_structure_grave_house");
	public static final TagKey<Biome> HAS_YETI_HOUSE = pvzTag("has_structure_yeti_house");
	public static final TagKey<Biome> HAS_DAVE_VILLA = pvzTag("has_structure_dave_villa");
	public static final TagKey<Biome> HAS_SUN_TEMPLE = pvzTag("has_structure_sun_temple");

	private static TagKey<Biome> pvzTag(String name) {
		return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(PVZMod.MOD_ID, name));
	}
}