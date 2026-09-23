package com.hungteen.pvz.common.enchantment.misc;

import com.hungteen.pvz.common.enchantment.PVZEnchantment;
import com.hungteen.pvz.common.enchantment.PVZEnchantmentTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EnergyTransferEnchantment extends PVZEnchantment{

	public EnergyTransferEnchantment() {
		super(Rarity.RARE, EnchantmentCategory.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
	}
	
	@Override
	public int getMinCost(int enchantmentLevel) {
		return 15;
	}
	
	@Override
	public int getMaxCost(int enchantmentLevel) {
		return 55;
	}
	
	@Override
	public int getMaxLevel() {
		return 1;
	}

}