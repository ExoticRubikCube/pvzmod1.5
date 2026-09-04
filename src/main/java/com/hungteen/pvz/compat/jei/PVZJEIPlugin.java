package com.hungteen.pvz.compat.jei;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.container.CardFusionContainer;
import com.hungteen.pvz.common.container.ContainerRegister;
import com.hungteen.pvz.common.container.FragmentSpliceContainer;
import com.hungteen.pvz.common.recipe.FragmentRecipe;
import com.hungteen.pvz.common.recipe.FusionRecipe;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import com.hungteen.pvz.compat.jei.category.FragmentRecipeCategory;
import com.hungteen.pvz.compat.jei.category.FusionRecipeCategory;
import com.hungteen.pvz.utils.StringUtil;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeTransferRegistration;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class PVZJEIPlugin implements IModPlugin {

    public static final ResourceLocation ID = StringUtil.prefix("jei");
    public static final RecipeType<FragmentRecipe> FRAGMENT_RECIPE = RecipeType.create(PVZMod.MOD_ID, "fragment_splice", FragmentRecipe.class);
    public static final RecipeType<FusionRecipe> FUSION_RECIPE = RecipeType.create(PVZMod.MOD_ID, "card_fusion", FusionRecipe.class);

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
       registration.addRecipes(FRAGMENT_RECIPE, PVZJEIHandler.getRecipeManager().getAllRecipesFor(RecipeRegister.FRAGMENT_RECIPE_TYPE.get()));
        registration.addRecipes(FUSION_RECIPE, PVZJEIHandler.getRecipeManager().getAllRecipesFor(RecipeRegister.FUSION_RECIPE_TYPE.get()));
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new FragmentRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new FusionRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(BlockRegister.FRAGMENT_SPLICE.get().asItem().getDefaultInstance(), FRAGMENT_RECIPE);
        registration.addRecipeCatalyst(BlockRegister.CARD_FUSION_TABLE.get().asItem().getDefaultInstance(), FUSION_RECIPE);
    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(FragmentSpliceContainer.class, ContainerRegister.FRAGMENT_SPLICE.get(), FRAGMENT_RECIPE, 2, 25, 27, 36);
        registration.addRecipeTransferHandler(CardFusionContainer.class, ContainerRegister.CARD_FUSION.get(), FUSION_RECIPE, 3, 9, 12, 36);
    }

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

}