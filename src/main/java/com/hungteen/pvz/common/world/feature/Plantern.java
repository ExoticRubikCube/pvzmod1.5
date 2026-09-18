package com.hungteen.pvz.common.world.feature;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.block.plants.PlanternBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;

public class Plantern  extends SimpleBlockFeature {

    public Plantern() {
        super(SimpleBlockConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> context) {
        SimpleBlockConfiguration config = context.config();
        WorldGenLevel level = context.level();
        BlockPos pos = context.origin();
        BlockState state = config.toPlace().getState(context.random(), pos);
        if (!state.canSurvive(level, pos)) {
            return false;
        }
        if (state.is(BlockRegister.PLANTERN.get())) {
            if (!level.isEmptyBlock(pos.above())) {
                return false;
            }
            PlanternBlock.placeAt(level, state, pos, 2);
        } else {
            level.setBlock(pos, state, 2);
        }
        return true;
    }
}
