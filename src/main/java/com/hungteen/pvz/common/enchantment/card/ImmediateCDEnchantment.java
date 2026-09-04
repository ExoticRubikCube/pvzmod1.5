package com.hungteen.pvz.common.enchantment.card;

import com.hungteen.pvz.common.enchantment.EnchantmentRegister;
import com.hungteen.pvz.common.enchantment.PVZEnchantment;
import com.hungteen.pvz.common.enchantment.PVZEnchantmentTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class ImmediateCDEnchantment extends PVZEnchantment {

	public ImmediateCDEnchantment() {
		super(Rarity.UNCOMMON, PVZEnchantmentTypes.SUMMON_CARD, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
	}
	
	public static boolean canImmediateCD(ItemStack stack, RandomSource rand) {
		final int lvl = EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegister.IMMEDIATE_CD.get(), stack);
		final float chance = (lvl == 1 ? 0.05F : lvl == 2 ? 0.1F : 0.2F);
		return lvl > 0 && rand.nextFloat() < chance; 
	}

	@Override
	public int getMinCost(int enchantmentLevel) {
		return enchantmentLevel * 20 - 15;
	}
	
	@Override
	public int getMaxCost(int enchantmentLevel) {
		return this.getMinCost(enchantmentLevel) + 15;
	}
	
	@Override
	public int getMaxLevel() {
		return 3;
	}
	
}