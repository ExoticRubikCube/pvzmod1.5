package com.hungteen.pvz.common.recipe;

import com.hungteen.pvz.PVZMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeRegister {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, PVZMod.MOD_ID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, PVZMod.MOD_ID);

    //recipe type.
    public static final RegistryObject<RecipeType<FusionRecipe>> FUSION_RECIPE_TYPE = RECIPE_TYPES.register("card_fusion",
            () -> new RecipeType<FusionRecipe>() {
                public String toString() { return "pvz:card_fusion"; }
            });
    public static final RegistryObject<RecipeType<FragmentRecipe>> FRAGMENT_RECIPE_TYPE = RECIPE_TYPES.register("fragment_splice",
            () -> new RecipeType<FragmentRecipe>() {
                public String toString() { return "pvz:fragment_splice"; }
            });

    //serializer.
    public static final RegistryObject<FusionRecipe.Serializer> FUSION_SERIALIZER = RECIPE_SERIALIZERS.register("card_fusion", FusionRecipe.Serializer::new);
    public static final RegistryObject<FragmentRecipe.Serializer> FRAGMENT_SERIALIZER = RECIPE_SERIALIZERS.register("fragment_splice", FragmentRecipe.Serializer::new);

}