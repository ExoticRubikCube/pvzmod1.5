package com.hungteen.pvz.compat.jei.category;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.recipe.FusionRecipe;
import com.hungteen.pvz.compat.jei.PVZJEIPlugin;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import java.util.Arrays;

public class FusionRecipeCategory implements IRecipeCategory<FusionRecipe> {

    private final IDrawable slotDraw;
    private final IDrawable bgDraw;
    private final IDrawable iconDraw;
    private final IDrawable arrowDraw;

    public FusionRecipeCategory(IGuiHelper helper) {
        this.slotDraw = helper.getSlotDrawable();
        this.bgDraw = helper.createBlankDrawable(180, 120);
        this.arrowDraw = helper.drawableBuilder(StringUtil.WIDGETS, 44, 64, 22, 15).build();
        this.iconDraw = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlockRegister.CARD_FUSION_TABLE.get()));
    }

    @Override
    public void draw(FusionRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack matrixStack, double mouseX, double mouseY) {
    	matrixStack.pushPose();
        this.arrowDraw.draw(matrixStack, 105, 52);
    	matrixStack.popPose();
    }

    @Override
    public RecipeType<FusionRecipe> getRecipeType() {
        return PVZJEIPlugin.FUSION_RECIPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.pvz.card_fusion_table");
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
    public void setRecipe(IRecipeLayoutBuilder builder, FusionRecipe recipe, IFocusGroup focuses) {
        for(int i = 0; i < 9; ++ i){
            final int x = i / 3;
            final int y = i % 3;

            IRecipeSlotBuilder slotBuilder = builder.addSlot(RecipeIngredientRole.INPUT, x * 20 + 30, y * 20 + 30)
                    .setBackground(this.slotDraw, 0, 0);
            if(i < recipe.getIngredients().size()){
                slotBuilder.addItemStacks(Arrays.asList(recipe.getIngredients().get(i).getItems()));
            }
        }

        builder.addSlot(RecipeIngredientRole.OUTPUT, 140, 50)
                .addItemStack(recipe.getResultItem())
                .setBackground(this.slotDraw, 0, 0);
    }
}