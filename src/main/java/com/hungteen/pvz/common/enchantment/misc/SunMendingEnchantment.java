package com.hungteen.pvz.common.enchantment.misc;

import com.hungteen.pvz.common.enchantment.PVZEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;

public class SunMendingEnchantment extends PVZEnchantment {

	public SunMendingEnchantment() {
		super(Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.values());
		this.isTradeable = false;
		this.isTreasureOnly = true;
	}

	@Override
	public int getMaxCost(int enchantmentLevel) {
		return this.getMinCost(enchantmentLevel) + 10;
	}

	@Override
	public int getMinCost(int enchantmentLevel) {
		return 10 * enchantmentLevel + 20;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchant) {
		return super.checkCompatibility(enchant) || enchant == Enchantments.MENDING;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

}