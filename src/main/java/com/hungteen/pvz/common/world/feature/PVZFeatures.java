package com.hungteen.pvz.common.world.feature;

import com.hungteen.pvz.common.block.BlockRegister;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.InclusiveRange;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class PVZFeatures {

    public static final Holder<ConfiguredFeature<?, ?>> CHOMPER_PATCH = Holder.direct(
			new ConfiguredFeature<>(Feature.RANDOM_PATCH, new RandomPatchConfiguration(64, 7, 3,
					PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK,
							new SimpleBlockConfiguration(BlockStateProvider.simple(BlockRegister.CHOMPER.get().defaultBlockState())),
							BlockPredicateFilter.forPredicate(BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK))))));

	public static final Holder<ConfiguredFeature<?, ?>> NUT_TREE = Holder.direct(
			new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
					BlockStateProvider.simple(BlockRegister.NUT_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(5, 5, 4),
					BlockStateProvider.simple(BlockRegister.NUT_LEAVES.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));

	public static final Holder<ConfiguredFeature<?, ?>> PLANTERN = Holder.direct(
			new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(1, 1, 1,
					PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new DualNoiseProvider(
							new InclusiveRange<>(1, 3), new NormalNoise.NoiseParameters(-10, 1.0D), 0.5F, 2345L,
							new NormalNoise.NoiseParameters(-3, 1.0D), 0.5F,
							List.of(BlockRegister.PLANTERN.get().defaultBlockState())))))));

}
