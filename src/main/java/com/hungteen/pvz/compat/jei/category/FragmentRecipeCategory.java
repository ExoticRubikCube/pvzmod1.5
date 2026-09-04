package com.hungteen.pvz.compat.jei.category;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.recipe.FragmentRecipe;
import com.hungteen.pvz.compat.jei.PVZJEIPlugin;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import java.util.Arrays;

public class FragmentRecipeCategory implements IRecipeCategory<FragmentRecipe> {

    private final IDrawable slotDraw;
    private final IDrawable bgDraw;
    private final IDrawable iconDraw;
    private final IDrawable arrowDraw;

    public FragmentRecipeCategory(IGuiHelper helper) {
        this.slotDraw = helper.getSlotDrawable();
        this.bgDraw = helper.createBlankDrawable(180, 120);
        this.arrowDraw = helper.drawableBuilder(StringUtil.WIDGETS, 44, 64, 22, 15).build();
        this.iconDraw = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlockRegister.FRAGMENT_SPLICE.get()));
    }

    @Override
    public void draw(FragmentRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack matrixStack, double mouseX, double mouseY) {
    	matrixStack.pushPose();
        this.arrowDraw.draw(matrixStack, 110, 52);
    	matrixStack.popPose();
    }

    @Override
    public RecipeType<FragmentRecipe> getRecipeType() {
        return PVZJEIPlugin.FRAGMENT_RECIPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.pvz.fragment_splice");
    }

    @Override
    public IDrawable getBackground() {
        return this.bgDraw;
    }

    @Override
    public IDrawable getIcon() {
        return this.iconDraw;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, FragmentRecipe recipe, IFocusGroup focuses) {
        for(int i = 0; i < 5; ++ i){
            for(int j = 0; j < 5; ++ j){
                final int slotId = i * 5 + j;
                builder.addSlot(RecipeIngredientRole.INPUT, i * 20 + 10, j * 20 + 10)
                        .addItemStacks(Arrays.asList(recipe.getIngredients().get(slotId).getItems()))
                        .setBackground(this.slotDraw, 0, 0);
            }
        }

        builder.addSlot(RecipeIngredientRole.OUTPUT, 150, 50)
                .addItemStack(recipe.getResultItem())
                .setBackground(this.slotDraw, 0, 0);
    }
}