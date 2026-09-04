package com.hungteen.pvz.common.block.others;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.world.level.BlockGetter;

import javax.annotation.Nullable;
import java.util.List;

public class SteelLadderBlock extends LadderBlock {

	public static final float MAX_SPEED_UP = 0.5F;
	public static final float UP_SPEED = 0.01F;
	
	public SteelLadderBlock() {
		super(Block.Properties.copy(Blocks.LADDER).strength(6F));
	}

	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockReader, List<Component> textComponents, TooltipFlag tooltipFlag) {
		super.appendHoverText(itemStack, blockReader, textComponents, tooltipFlag);
		textComponents.add(Component.translatable("tooltip.pvz.steel_ladder").withStyle(ChatFormatting.ITALIC));
	}

}