package com.hungteen.pvz.common.world.feature;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class NutTree extends AbstractTreeGrower {

	@Override
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
		return PVZFeatures.NUT_TREE;
	}

	@Override
	public boolean growTree(ServerLevel serverLevel, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, RandomSource random) {
		Holder<? extends ConfiguredFeature<?, ?>> holder = this.getConfiguredFeature(random, false);
		if (holder == null) {
			return false;
		}
		ConfiguredFeature<?, ?> configuredfeature = holder.value();
		BlockState blockstate = serverLevel.getFluidState(pos).createLegacyBlock();
		serverLevel.setBlock(pos, blockstate, 4);
		if (configuredfeature.place(serverLevel, chunkGenerator, random, pos)) {
			if (serverLevel.getBlockState(pos) == blockstate) {
				serverLevel.sendBlockUpdated(pos, state, blockstate, 2);
			}
			return true;
		} else {
			serverLevel.setBlock(pos, state, 4);
			return false;
		}
	}

}