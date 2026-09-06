package com.hungteen.pvz.data.tag;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.misc.tag.PVZBiomeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class BiomeTagGen extends BiomeTagsProvider {

    public BiomeTagGen(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, PVZMod.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags() {
        this.tag(PVZBiomeTags.HAS_BUCKET_HOUSE).addTag(Tags.Biomes.IS_DENSE_OVERWORLD).addTag(Tags.Biomes.IS_HOT_OVERWORLD);
        this.tag(PVZBiomeTags.HAS_DOLPHIN_HOUSE).addTag(BiomeTags.IS_OCEAN);
        this.tag(PVZBiomeTags.HAS_YETI_HOUSE).addTag(Tags.Biomes.IS_SNOWY);
        this.tag(PVZBiomeTags.HAS_GRAVE_HOUSE).addTag(BiomeTags.IS_FOREST);
        this.tag(PVZBiomeTags.HAS_DAVE_VILLA).addTag(Tags.Biomes.IS_PLAINS);
        this.tag(PVZBiomeTags.HAS_SUN_TEMPLE).addTag(Tags.Biomes.IS_DESERT);
    }

    @Override
    public String getName() {
        return "Plants vs Zombies biome tags";
    }
}
