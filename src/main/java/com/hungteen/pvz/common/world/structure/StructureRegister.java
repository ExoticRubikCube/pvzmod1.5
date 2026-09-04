package com.hungteen.pvz.common.world.structure;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.world.FeatureRegister;
import com.hungteen.pvz.common.world.structure.shop.DaveVillaComponents;
import com.hungteen.pvz.common.world.structure.shop.DaveVillaStructure;
import com.hungteen.pvz.common.world.structure.shop.SunTempleComponents;
import com.hungteen.pvz.common.world.structure.shop.SunTempleStructure;
import com.hungteen.pvz.common.world.structure.zombie.*;
import com.hungteen.pvz.utils.BiomeUtil;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.Structure.StructureSettings;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

import com.hungteen.pvz.PVZConfig;

public class StructureRegister {
	public static final DeferredRegister<Structure> STRUCTURES = DeferredRegister.create(Registry.STRUCTURE_REGISTRY, PVZMod.MOD_ID);

	public static final RegistryObject<BucketHouseStructure> BUCKET_HOUSE = STRUCTURES.register("bucket_house",
			() -> new BucketHouseStructure(defaultSurfaceSettings()));
	public static final RegistryObject<DolphinHouseStructure> DOLPHIN_HOUSE = STRUCTURES.register("dolphin_house",
			() -> new DolphinHouseStructure(defaultSurfaceSettings()));
	public static final RegistryObject<GraveHouseStructure> GRAVE_HOUSE = STRUCTURES.register("grave_house",
			() -> new GraveHouseStructure(defaultSurfaceSettings()));
	public static final RegistryObject<YetiHouseStructure> YETI_HOUSE = STRUCTURES.register("yeti_house",
			() -> new YetiHouseStructure(defaultSurfaceSettings()));
	public static final RegistryObject<DaveVillaStructure> DAVE_VILLA = STRUCTURES.register("dave_villa",
			() -> new DaveVillaStructure(defaultSurfaceSettings()));
	public static final RegistryObject<SunTempleStructure> SUN_TEMPLE = STRUCTURES.register("sun_temple",
			() -> new SunTempleStructure(defaultSurfaceSettings()));

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
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new BucketHouseComponents.BucketHouseComponent(mgr, tag));
	public static final RegistryObject<StructurePieceType> DOLPHIN_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("dolphin_house",
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new DolphinHouseComponents.DolphinHouseComponent(mgr, tag));
	public static final RegistryObject<StructurePieceType> GRAVE_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("grave_house",
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new GraveHouseComponents.GraveHouseComponent(mgr, tag));
	public static final RegistryObject<StructurePieceType> YETI_HOUSE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("yeti_house",
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new YetiHouseComponents.YetiHouseComponent(mgr, tag));
	public static final RegistryObject<StructurePieceType> DAVE_VILLA_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("dave_villa",
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new DaveVillaComponents.DaveVillaComponent(mgr, tag));
	public static final RegistryObject<StructurePieceType> SUN_TEMPLE_PIECE = FeatureRegister.STRUCTURE_PIECE_TYPES.register("sun_temple",
			() -> (StructurePieceType.StructureTemplateType) (mgr, tag) -> new SunTempleComponents.SunTempleComponent(mgr, tag));

	public static final RegistryObject<StructureSet> BUCKET_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("bucket_house",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(BUCKET_HOUSE), 1)),
					new RandomSpreadStructurePlacement(dis(0), sep(0), RandomSpreadType.LINEAR, 998244353)));
	public static final RegistryObject<StructureSet> DOLPHIN_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("dolphin_house",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(DOLPHIN_HOUSE), 1)),
					new RandomSpreadStructurePlacement(dis(1), sep(1), RandomSpreadType.LINEAR, 165745799)));
	public static final RegistryObject<StructureSet> GRAVE_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("grave_house",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(GRAVE_HOUSE), 1)),
					new RandomSpreadStructurePlacement(dis(2), sep(2), RandomSpreadType.LINEAR, 165745797)));
	public static final RegistryObject<StructureSet> YETI_HOUSE_SET = FeatureRegister.STRUCTURE_SETS.register("yeti_house",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(YETI_HOUSE), 1)),
					new RandomSpreadStructurePlacement(dis(3), sep(3), RandomSpreadType.LINEAR, 165745795)));
	public static final RegistryObject<StructureSet> DAVE_VILLA_SET = FeatureRegister.STRUCTURE_SETS.register("dave_villa",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(DAVE_VILLA), 1)),
					new RandomSpreadStructurePlacement(dis(4), sep(4), RandomSpreadType.LINEAR, 165745793)));
	public static final RegistryObject<StructureSet> SUN_TEMPLE_SET = FeatureRegister.STRUCTURE_SETS.register("sun_temple",
			() -> new StructureSet(List.of(new StructureSet.StructureSelectionEntry(holder(SUN_TEMPLE), 1)),
					new RandomSpreadStructurePlacement(dis(5), sep(5), RandomSpreadType.LINEAR, 165745791)));

	private static StructureSettings defaultSurfaceSettings() {
		return new StructureSettings(HolderSet.direct(List.of()), Map.of(),
				GenerationStep.Decoration.SURFACE_STRUCTURES, TerrainAdjustment.NONE);
	}

	@SuppressWarnings("unchecked")
	private static Holder<Structure> holder(RegistryObject<? extends Structure> ro) {
		return Holder.direct(ro.get());
	}

	private static int dis(int idx) {
		List<Integer> ls = List.of(
				PVZConfig.COMMON_CONFIG.WorldSettings.BucketHouseDistance.get(),
				PVZConfig.COMMON_CONFIG.WorldSettings.DolphinHouseDistance.get(),
				PVZConfig.COMMON_CONFIG.WorldSettings.GraveHouseDistance.get(),
				PVZConfig.COMMON_CONFIG.WorldSettings.YetiHouseDistance.get(),
				PVZConfig.COMMON_CONFIG.WorldSettings.DaveVillaDistance.get(),
				PVZConfig.COMMON_CONFIG.WorldSettings.SunTempleDistance.get());
		return ls.get(idx);
	}

	private static int sep(int idx) {
		return Math.max(1, dis(idx) / 2);
	}

	public static void setupStructures() {
	}

}
