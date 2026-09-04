package com.hungteen.pvz.common.block.ores;

import com.hungteen.pvz.api.types.IEssenceType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class EssenceOreBlock extends PVZOreBlock {

	public final IEssenceType essence;
	
	public EssenceOreBlock(IEssenceType e, int light) {
		super(Block.Properties.copy(Blocks.DIAMOND_ORE)
				.strength(9, 9)
				
				.requiresCorrectToolForDrops()
				.lightLevel(i -> light)
				);
		this.essence = e;
	}

}