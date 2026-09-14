package com.hungteen.pvz.common.enchantment.misc;

import com.hungteen.pvz.common.enchantment.PVZEnchantment;
import com.hungteen.pvz.common.enchantment.PVZEnchantmentTypes;
import net.minecraft.world.entity.EquipmentSlot;

public class RangeReachEnchantment extends PVZEnchantment {

    public RangeReachEnchantment() {
        super(Rarity.UNCOMMON, PVZEnchantmentTypes.SWORD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinCost(int enchantmentLevel) {
        return 10 * enchantmentLevel;
    }

    @Override
    public int getMaxCost(int enchantmentLevel) {
        return 20 + getMinCost(enchantmentLevel);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

}