package com.hungteen.pvz.common.enchantment.card.plantcard;

import com.hungteen.pvz.common.enchantment.EnchantmentRegister;
import com.hungteen.pvz.common.enchantment.PVZEnchantment;

import com.hungteen.pvz.common.enchantment.PVZEnchantmentTypes;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

public class DenselyPlantEnchantment extends PVZEnchantment {

	public DenselyPlantEnchantment() {
		super(Rarity.RARE, PVZEnchantmentTypes.NO_OUTER_PLANT_CARD, new EquipmentSlot[] { EquipmentSlot.OFFHAND, EquipmentSlot.MAINHAND });
		this.isTradeable = false;
	}
	
	public static int getExtraPlantNum(ItemStack stack) {
		return 10 * EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegister.DENSELY_PLANT.get(), stack);
	}
	
	@Override
	public int getMinCost(int enchantmentLevel) {
		return 40;
	}
    
	@Override
	public int getMaxCost(int enchantmentLevel) {
		return 100;
	}
	
	@Override
	public int getMaxLevel() {
		return 2;
	}

}