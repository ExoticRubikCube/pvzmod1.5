package com.hungteen.pvz.common.world.feature;

import com.hungteen.pvz.common.block.BlockRegister;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class PVZFeatures {


	public static final Holder<ConfiguredFeature<?, ?>> NUT_TREE = Holder.direct(
			new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
					BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()),
					new StraightTrunkPlacer(5, 5, 4),
					BlockStateProvider.simple(BlockRegister.NUT_LEAVES.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));

	public static final Holder<ConfiguredFeature<?, ?>> PATCH_CHOMPER = Holder.direct(
			new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(96, 6, 2,
					PlacementUtils.inlinePlaced(Holder.direct(new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
							new net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration(
									BlockStateProvider.simple(BlockRegister.CHOMPER.get().defaultBlockState()))))))));

	public static final Holder<PlacedFeature> PATCH_CHOMPER_PLANT = Holder.direct(new PlacedFeature(
			PATCH_CHOMPER,
			List.of(RarityFilter.onAverageOnceEvery(32),
					InSquarePlacement.spread(),
					HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
					BiomeFilter.biome())));

	public static final Holder<PlacedFeature> TREES_NUT = Holder.direct(new PlacedFeature(
			NUT_TREE,
			List.of(CountPlacement.of(1),
					InSquarePlacement.spread(),
					HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
					BiomeFilter.biome())));

	private static final class PlacementUtils {
		static Holder<PlacedFeature> inlinePlaced(Holder<ConfiguredFeature<?, ?>> cf, PlacementModifier... mods) {
			return net.minecraft.data.worldgen.placement.PlacementUtils.inlinePlaced(cf, mods);
		}
	}

}