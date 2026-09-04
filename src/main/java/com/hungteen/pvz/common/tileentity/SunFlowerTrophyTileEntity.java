package com.hungteen.pvz.common.tileentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SunFlowerTrophyTileEntity extends BlockEntity {

	public SunFlowerTrophyTileEntity(BlockPos pos, BlockState state) {
		super(TileEntityRegister.SUNFLOWER_TROPHY.get(), pos, state);
	}

}