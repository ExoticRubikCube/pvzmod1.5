package com.hungteen.pvz.common.tags;

import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class PVZBiomeTags {

    public static final TagKey<Biome> UNABLE_MOOBLOOM_SPAWNING = pvzTag("unable_moobloom_spawning");
    public static final TagKey<Biome> EXTRA_MOOBLOOM_SPAWNING = pvzTag("extra_moobloom_spawning");

    public static TagKey<Biome> pvzTag(String name) {
        return TagKey.create(Registry.BIOME_REGISTRY, StringUtil.prefix(name));
    }
}
