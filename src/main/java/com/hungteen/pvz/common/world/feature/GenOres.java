package com.hungteen.pvz.common.world.feature;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class GenOres {

	public static final class FillerBlockType {
		public static final RuleTest END_STONE = new BlockMatchTest(Blocks.END_STONE);
		public static final RuleTest STONE = new BlockMatchTest(Blocks.STONE);
		public static final RuleTest GRASS = new BlockMatchTest(Blocks.GRASS_BLOCK);
	}

}
