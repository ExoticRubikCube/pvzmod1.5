package com.hungteen.pvz.common.block.plants;

import com.hungteen.pvz.common.item.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PepperBlock extends CropBlock {

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 2.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 8.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 10.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 14.0D, 14.0D),
    		Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D)
    };

    public PepperBlock(Properties builder) {
		super(builder);
	}

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
    	return SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }

	@Override
	protected ItemLike getBaseSeedId() {
		return ItemRegister.PEPPER.get();
	}
}