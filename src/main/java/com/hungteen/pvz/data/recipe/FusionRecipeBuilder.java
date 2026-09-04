package com.hungteen.pvz.data.recipe;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class FusionRecipeBuilder {

    private static final Logger LOGGER = LogManager.getLogger();
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Advancement.Builder advancement = Advancement.Builder.advancement();
    private String group;

    public FusionRecipeBuilder(ItemLike itemProvider, int count) {
        this.result = itemProvider.asItem();
        this.count = count;
    }

    public static FusionRecipeBuilder shapeless(ItemLike itemProvider) {
        return new FusionRecipeBuilder(itemProvider, 1);
    }

    public static FusionRecipeBuilder shapeless(ItemLike itemProvider, int count) {
        return new FusionRecipeBuilder(itemProvider, count);
    }

    public FusionRecipeBuilder requires(TagKey<Item> itemTag) {
        return this.requires(Ingredient.of(itemTag));
    }

    public FusionRecipeBuilder requires(ItemLike itemProvider) {
        return this.requires(itemProvider, 1);
    }

    public FusionRecipeBuilder requires(ItemLike itemProvider, int count) {
        for(int i = 0; i < count; ++i) {
            this.requires(Ingredient.of(itemProvider));
        }

        return this;
    }

    public FusionRecipeBuilder requires(Ingredient ingredient) {
        return this.requires(ingredient, 1);
    }

    public FusionRecipeBuilder requires(Ingredient ingredient, int ingredientCount) {
        for(int i = 0; i < ingredientCount; ++i) {
            this.ingredients.add(ingredient);
        }

        return this;
    }

    public FusionRecipeBuilder unlockedBy(String name, CriterionTriggerInstance trigger) {
        this.advancement.addCriterion(name, trigger);
        return this;
    }

    public FusionRecipeBuilder group(String groupName) {
        this.group = groupName;
        return this;
    }

    public void save(Consumer<FinishedRecipe> consumer) {
        this.save(consumer, Registry.ITEM.getKey(this.result));
    }

    public void save(Consumer<FinishedRecipe> consumer, String name) {
        ResourceLocation resourcelocation = Registry.ITEM.getKey(this.result);
        if ((ResourceLocation.parse(name)).equals(resourcelocation)) {
            throw new IllegalStateException("Shapeless Recipe " + name + " should remove its 'save' argument");
        } else {
            this.save(consumer, ResourceLocation.parse(name));
        }
    }

    public void save(Consumer<FinishedRecipe> consumer, ResourceLocation recipeId) {
        this.ensureValid(recipeId);
        this.advancement.parent(ResourceLocation.parse("recipes/root")).addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId)).rewards(AdvancementRewards.Builder.recipe(recipeId)).requirements(RequirementsStrategy.OR);
        consumer.accept(new FusionRecipeBuilder.Result(recipeId, this.result, this.count, this.group == null ? "" : this.group, this.ingredients, ResourceLocation.fromNamespaceAndPath(recipeId.getNamespace(), "recipes/" + recipeId.getPath())));
    }

    private void ensureValid(ResourceLocation recipeId) {
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final int count;
        private final String group;
        private final List<Ingredient> ingredients;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation id, Item result, int count, String group, List<Ingredient> ingredients, ResourceLocation advancementId) {
            this.id = id;
            this.result = result;
            this.count = count;
            this.group = group;
            this.ingredients = ingredients;
            this.advancementId = advancementId;
        }

        public void serializeRecipeData(JsonObject json) {
            if (!this.group.isEmpty()) {
                json.addProperty("group", this.group);
            }

            JsonArray jsonarray = new JsonArray();

            for(Ingredient ingredient : this.ingredients) {
                jsonarray.add(ingredient.toJson());
            }

            json.add("ingredients", jsonarray);
            JsonObject resultObj = new JsonObject();
            resultObj.addProperty("item", Registry.ITEM.getKey(this.result).toString());
            if (this.count > 1) {
                resultObj.addProperty("count", this.count);
            }

            json.add("result", resultObj);
        }

        public RecipeSerializer<?> getType() {
            return RecipeRegister.FUSION_SERIALIZER.get();
        }

        @Override
        public @org.jetbrains.annotations.Nullable JsonObject serializeAdvancement() {
            return null;
        }

        public ResourceLocation getId() {
            return this.id;
        }

        @Nullable
        public FinishedRecipe getAdvancement() {
            return null;
        }

        @Override
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}
