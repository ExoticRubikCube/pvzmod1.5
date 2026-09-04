package com.hungteen.pvz.common.block.plants;

import com.hungteen.pvz.common.item.ItemRegister;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.ItemLike;

public class CornBlock extends CropBlock {

	public CornBlock(Properties builder) {
		super(builder);
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return ItemRegister.CORN_SEEDS.get();
	}
	
}