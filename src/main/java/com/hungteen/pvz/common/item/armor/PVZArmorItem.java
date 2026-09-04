package com.hungteen.pvz.common.item.armor;

import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public abstract class PVZArmorItem extends ArmorItem {

    public PVZArmorItem(ArmorMaterial armorMaterial, EquipmentSlot slotType) {
        super(armorMaterial, slotType, new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
    }
}