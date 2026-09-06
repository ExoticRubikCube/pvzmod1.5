package com.hungteen.pvz.common.world.structure;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.misc.tag.PVZBiomeTags;
import com.hungteen.pvz.common.world.FeatureRegister;
import com.hungteen.pvz.common.world.structure.shop.DaveVillaComponents;
import com.hungteen.pvz.common.world.structure.shop.DaveVillaStructure;
import com.hungteen.pvz.common.world.structure.shop.SunTempleComponents;
import com.hungteen.pvz.common.world.structure.shop.SunTempleStructure;
import com.hungteen.pvz.common.world.structure.zombie.*;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.Structure.StructureSettings;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

public class StructureRegister {
	public static final DeferredRegister<Structure> STRUCTURES = DeferredRegister.create(Registry.STRUCTURE_REGISTRY, PVZMod.MOD_ID);

	public static final RegistryObject<Structure> BUCKET_HOUSE = STRUCTURES.register("bucket_house",
			() -> new BucketHouseStructure(surfaceSettings(PVZBiomeTags.HAS_BUCKET_HOUSE)));
	public static final RegistryObject<Structure> DOLPHIN_HOUSE = STRUCTURES.register("dolphin_house",
			() -> new DolphinHouseStructure(surfaceSettings(PVZBiomeTags.HAS_DOLPHIN_HOUSE)));
	public static final RegistryObject<Structure> GRAVE_HOUSE = STRUCTURES.register("grave_house",
			() -> new GraveHouseStructure(surfaceSettings(PVZBiomeTags.HAS_GRAVE_HOUSE)));
	public static final RegistryObject<Structure> YETI_HOUSE = STRUCTURES.register("yeti_house",
			() -> new YetiHouseStructure(surfaceSettings(PVZBiomeTags.HAS_YETI_HOUSE)));
	public static final RegistryObject<Structure> DAVE_VILLA = STRUCTURES.register("dave_villa",
			() -> new DaveVillaStructure(surfaceSettings(PVZBiomeTags.HAS_DAVE_VILLA)));
	public static final RegistryObject<Structure> SUN_TEMPLE = STRUCTURES.register("sun_temple",
			() -> new SunTempleStructure(surfaceSettings(PVZBiomeTags.HAS_SUN_TEMPLE)));

	public static final RegistryObject<StructureType<BucketHouseStructure>> BUCKET_HOUSE_TYPE = FeatureRegister.STRUCTURE_TYPES.register("bucket_house",
			() -> () -> BucketHouseStructure.CODEC);
	public static final RegistryObject<StructureType<DolphinHouseStructure>> DOLPHIN_HOUSE_TYPE = FeatureRegister.STRUCTURE_TYPES.register("dolphin_house",
			() -> () -> DolphinHouseStructure.CODEC);
	public static final RegistryObject<StructureType<GraveHouseStructure>> GRAVE_HOUSE_TYPE = FeatureRegister.STRUCTURE_TYPES.register("grave_house",
			() -> () -> GraveHouseStructure.CODEC);
	public static final RegistryObject<StructureType<YetiHouseStructure>> YETI_HOUSE_TYPE = FeatureRegister.STRUCTURE_TYPES.register("yeti_house",
			() -> () -> YetiHouseStructure.CODEC);
	public static final RegistryObject<StructureType<DaveVillaStructure>> DAVE_VILLA_TYPE = FeatureRegister.STRUCTURE_TYPES.register("dave_villa",
			() -> () -> DaveVillaStructure.CODEC);
	public static final RegistryObject<StructureType<SunTempleStructure>> SUN_TEMPLE_TYPE = FeatureRegister.STRUCTURE_TYPES.register("sun_temple",
			() -> () -> SunTempleStructure.CODEC);

	public static final RegistryObject<StructurePieceType> BUCKET_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("bucket_house",
			() -> (StructurePieceType.StructureTemplateType) BucketHouseComponents.BucketHouseComponent::new);
	public static final RegistryObject<StructurePieceType> DOLPHIN_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("dolphin_house",
			() -> (StructurePieceType.StructureTemplateType) DolphinHouseComponents.DolphinHouseComponent::new);
	public static final RegistryObject<StructurePieceType> GRAVE_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("grave_house",
			() -> (StructurePieceType.StructureTemplateType) GraveHouseComponents.GraveHouseComponent::new);
	public static final RegistryObject<StructurePieceType> YETI_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("yeti_house",
			() -> (StructurePieceType.StructureTemplateType) YetiHouseComponents.YetiHouseComponent::new);
	public static final RegistryObject<StructurePieceType> DAVE_VILLA_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("dave_villa",
			() -> (StructurePieceType.StructureTemplateType) DaveVillaComponents.DaveVillaComponent::new);
	public static final RegistryObject<StructurePieceType> SUN_TEMPLE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("sun_temple",
			() -> (StructurePieceType.StructureTemplateType) SunTempleComponents.SunTempleComponent::new);

	public static final RegistryObject<StructureSet> BUCKET_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("bucket_house",
			() -> new StructureSet(BUCKET_HOUSE.getHolder().get(),
					new RandomSpreadStructurePlacement(36, 18, RandomSpreadType.LINEAR, 998244353)));
	public static final RegistryObject<StructureSet> DOLPHIN_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("dolphin_house",
			() -> new StructureSet(DOLPHIN_HOUSE.getHolder().get(),
					new RandomSpreadStructurePlacement(32, 16, RandomSpreadType.LINEAR, 165745799)));
	public static final RegistryObject<StructureSet> GRAVE_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("grave_house",
			() -> new StructureSet(GRAVE_HOUSE.getHolder().get(),
					new RandomSpreadStructurePlacement(28, 14, RandomSpreadType.LINEAR, 165745797)));
	public static final RegistryObject<StructureSet> YETI_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("yeti_house",
			() -> new StructureSet(YETI_HOUSE.getHolder().get(),
					new RandomSpreadStructurePlacement(28, 14, RandomSpreadType.LINEAR, 165745797)));
	public static final RegistryObject<StructureSet> DAVE_VILLA_SET = FeatureRegister.STRUCTURE_SETS.register("dave_villa",
			() -> new StructureSet(DAVE_VILLA.getHolder().get(),
					new RandomSpreadStructurePlacement(40, 20, RandomSpreadType.LINEAR, 165745797)));
	public static final RegistryObject<StructureSet> SUN_TEMPLE_SET = FeatureRegister.STRUCTURE_SETS.register("sun_temple",
			() -> new StructureSet(SUN_TEMPLE.getHolder().get(),
					new RandomSpreadStructurePlacement(36, 18, RandomSpreadType.LINEAR, 165745797)));

	private static StructureSettings surfaceSettings(TagKey<Biome> tagKey) {
		final HolderSet<Biome> biomes = BuiltinRegistries.BIOME.getOrCreateTag(tagKey);
		return new StructureSettings(biomes, Map.of(),
				GenerationStep.Decoration.SURFACE_STRUCTURES, TerrainAdjustment.NONE);
	}

	public static void setupStructures() {
	}

}