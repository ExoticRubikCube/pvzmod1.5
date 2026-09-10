package com.hungteen.pvz.common.enchantment.misc;

import com.hungteen.pvz.common.enchantment.EnchantmentRegister;
import com.hungteen.pvz.common.enchantment.PVZEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;

public class SunMendingEnchantment extends PVZEnchantment {

	public SunMendingEnchantment() {
		super(Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.values());
		this.isTradeable = false;
		this.isTreasureOnly = true;
	}

	//sun cost per durability point: lvl1 50, lvl2 25, lvl3 15
	public static void repairItem(ItemStack stack, int amount) {
		if (! stack.isEmpty() && stack.isDamaged()) {
			final int lvl = EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegister.SUN_MENDING.get(), stack);
			final int needSunEach = lvl >= 3 ? 15 : lvl == 2 ? 25 : 50;
			final int repairDamage = Math.min(stack.getDamageValue(), amount / needSunEach);
			stack.setDamageValue(stack.getDamageValue() - repairDamage);
		}
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