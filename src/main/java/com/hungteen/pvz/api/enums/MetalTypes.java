package com.hungteen.pvz.api.enums;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.item.ItemRegister;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public enum MetalTypes {

	EMPTY,
	BUCKET_HEAD,
	SCREEN_DOOR,
	FOOTBALL_HELMET,
	GIGA_HELMET,
	JACK_BOX,
	IRON_PICKAXE,
	POGO,
	LADDER;
	
	public static Item getMetalItem(MetalTypes type) {
        return switch (type) {
            case BUCKET_HEAD -> ItemRegister.BUCKET_HEAD.get();
            case SCREEN_DOOR -> ItemRegister.SCREEN_DOOR.get();
            case FOOTBALL_HELMET -> ItemRegister.FOOTBALL_HELMET.get();
            case GIGA_HELMET -> ItemRegister.GIGA_HELMET.get();
            case JACK_BOX -> ItemRegister.JACK_BOX.get();
            case IRON_PICKAXE -> Items.IRON_PICKAXE;
            case LADDER -> BlockRegister.STEEL_LADDER.get().asItem();
            default -> Items.IRON_INGOT;
        };
	}
}