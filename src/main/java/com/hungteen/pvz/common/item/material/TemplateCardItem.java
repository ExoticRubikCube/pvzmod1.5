package com.hungteen.pvz.common.item.material;

import com.hungteen.pvz.api.types.IRankType;
import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.world.item.Item;

public class TemplateCardItem extends Item {

	public final IRankType Rank;
	
	public TemplateCardItem(IRankType rank) {
        super(new Properties().tab(PVZItemGroups.PVZ_MISC).tab(PVZItemGroups.PVZ_MISC));
        this.Rank = rank;
	}
	
}
