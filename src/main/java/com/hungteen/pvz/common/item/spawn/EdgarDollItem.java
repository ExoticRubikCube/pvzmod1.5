package com.hungteen.pvz.common.item.spawn;

import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class EdgarDollItem extends Item {

	public EdgarDollItem() {
		super(new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
	}
	
	@Override
	public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(Component.translatable("tooltip.pvz.wait_for_update").withStyle(ChatFormatting.RED));
	}

}