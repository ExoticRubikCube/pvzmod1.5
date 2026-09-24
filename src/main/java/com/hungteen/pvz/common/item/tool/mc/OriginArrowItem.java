package com.hungteen.pvz.common.item.tool.mc;

import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;

public class OriginArrowItem extends ArrowItem {

	public OriginArrowItem() {
		super(new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
	}
}
