package com.hungteen.pvz.common.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.IBrewingRecipe;

import javax.annotation.Nonnull;

public record PVZBrewRecipe(@Nonnull Ingredient input, @Nonnull Ingredient ingredient,
                            @Nonnull ItemStack output) implements IBrewingRecipe {

	public PVZBrewRecipe(Ingredient input, Ingredient ingredient, ItemStack output) {
		this.input = input;
		this.ingredient = ingredient;
		this.output = output;
	}

	@Override
	public boolean isInput(ItemStack stack) {
		Potion now = PotionUtils.getPotion(stack);
		for (ItemStack itemstack : this.input.getItems()) {
			if (itemstack.getItem() != stack.getItem()) continue;
			Potion std = PotionUtils.getPotion(itemstack);
			if (std == now) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return this.ingredient.test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		return isInput(input) && isIngredient(ingredient) ? output().copy() : ItemStack.EMPTY;
	}

	@Override
	public Ingredient input() {
		return input;
	}

	@Override
	public Ingredient ingredient() {
		return ingredient;
	}

	@Override
	public ItemStack output() {
		return output;
	}

}