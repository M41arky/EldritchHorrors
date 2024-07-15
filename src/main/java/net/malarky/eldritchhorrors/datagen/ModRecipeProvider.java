package net.malarky.eldritchhorrors.datagen;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.item.ModItems;
import net.malarky.eldritchhorrors.EldritchHorrors;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> COBBLED_CORRUPT_STONE_SMELTABLES = List.of(ModBlocks.COBBLED_CORRUPT_STONE.get());




    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Smelting Recipes

        oreSmelting(pWriter, COBBLED_CORRUPT_STONE_SMELTABLES, RecipeCategory.MISC, (ItemLike) ModBlocks.CORRUPT_STONE.get(), 0.25F, 200, "corrupt_stone");

        // Shaped Recipes

        // Stairs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_STAIRS.get(), 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', ModBlocks.COBBLED_CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_STAIRS.get(), 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_STAIRS.get(), 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter);

        // Slabs

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_SLAB.get(), 6)
                .pattern("CCC")
                .define('C', ModBlocks.COBBLED_CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_SLAB.get(), 6)
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_SLAB.get(), 6)
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter);

        // Walls

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_WALL.get(), 6)
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModBlocks.COBBLED_CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_WALL.get(), 6)
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_WALL.get(), 6)
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModBlocks.CORRUPT_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter);

        // Stonecutting count 2 output

        // Slabs SC2

        stonecutting2(Ingredient.of(ModBlocks.COBBLED_CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter, "cobbled_corrupt_stone_slab_from_stonecutting");  // CCSS

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_BRICKS.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter, "corrupt_brick_slab_from_stonecutting");   // CBS

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter, "corrupt_stone_slab_from_stonecutting");

        // Stairs SC2

        stonecutting2(Ingredient.of(ModBlocks.COBBLED_CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter, "cobbled_corrupt_stone_stairs_from_stonecutting");// CCSST

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_BRICKS.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter, "corrupt_brick_stairs_from_stonecutting");

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter, "corrupt_stone_stairs_from_stonecutting");

        // Walls SC2

        stonecutting2(Ingredient.of(ModBlocks.COBBLED_CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.COBBLED_CORRUPT_STONE_WALL.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_CORRUPT_STONE.get()), has(ModBlocks.COBBLED_CORRUPT_STONE.get()))
                .save(pWriter, "cobbled_corrupt_stone_wall_from_stonecutting");  // CCSW

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_BRICKS.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_BRICK_WALL.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BRICKS.get()), has(ModBlocks.CORRUPT_BRICKS.get()))
                .save(pWriter, "corrupt_brick_wall_from_stonecutting");

        stonecutting2(Ingredient.of(ModBlocks.CORRUPT_STONE.get())
                ,RecipeCategory.MISC, ModBlocks.CORRUPT_STONE_WALL.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_STONE.get()), has(ModBlocks.CORRUPT_STONE.get()))
                .save(pWriter, "corrupt_stone_wall_from_stonecutting");

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    public static SingleItemRecipeBuilder stonecutting(Ingredient pIngredient, RecipeCategory pCategory, ItemLike pResult) {
        return new SingleItemRecipeBuilder(pCategory, RecipeSerializer.STONECUTTER, pIngredient, pResult, 1);

    }

    public static SingleItemRecipeBuilder stonecutting2(Ingredient pIngredient, RecipeCategory pCategory, ItemLike pResult) {
        return new SingleItemRecipeBuilder(pCategory, RecipeSerializer.STONECUTTER, pIngredient, pResult, 2);

    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  EldritchHorrors.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
