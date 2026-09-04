package com.hungteen.pvz.common.block.special;

import com.hungteen.pvz.common.block.AbstractFacingBlock;
import com.hungteen.pvz.common.tileentity.SunFlowerTrophyTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SunFlowerTrophyBlock extends AbstractFacingBlock implements EntityBlock {

	public final int lvl;
	
	public SunFlowerTrophyBlock(Properties properties, int lvl) {
		super(properties.lightLevel(i -> 14));
		this.lvl = lvl;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SunFlowerTrophyTileEntity(pos, state);
	}
	
}