package com.hungteen.pvz.common.world.feature;

import com.hungteen.pvz.common.block.BlockRegister;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class PVZFeatures {

	public static final Holder<ConfiguredFeature<?, ?>> NUT_TREE = Holder.direct(
			new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
					BlockStateProvider.simple(BlockRegister.NUT_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(5, 5, 4),
					BlockStateProvider.simple(BlockRegister.NUT_LEAVES.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
					new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()));

}
