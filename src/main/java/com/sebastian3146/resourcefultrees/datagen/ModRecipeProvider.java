package com.sebastian3146.resourcefultrees.datagen;

import java.util.concurrent.CompletableFuture;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;
import com.sebastian3146.resourcefultrees.item.ModItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder{
    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput pWriter) {
        recipeResourceSaplings(Items.NETHERITE_SCRAP, Blocks.OAK_SAPLING, ModBlocks.ANCIENT_DEBRIS_SAPLING, pWriter);
        recipeResourceSaplings(Items.COAL, Blocks.OAK_SAPLING, ModBlocks.COAL_SAPLING, pWriter);
        recipeResourceSaplings(Items.COPPER_INGOT , Blocks.OAK_SAPLING, ModBlocks.COPPER_SAPLING, pWriter);
        recipeResourceSaplings(Items.DIAMOND, Blocks.OAK_SAPLING, ModBlocks.DIAMOND_SAPLING, pWriter);
        recipeResourceSaplings(Items.EMERALD, Blocks.OAK_SAPLING, ModBlocks.EMERALD_SAPLING, pWriter);
        recipeResourceSaplings(Items.GOLD_INGOT, Blocks.OAK_SAPLING, ModBlocks.GOLD_SAPLING, pWriter);
        recipeResourceSaplings(Items.IRON_INGOT, Blocks.OAK_SAPLING, ModBlocks.IRON_SAPLING, pWriter);
        recipeResourceSaplings(Items.QUARTZ, Blocks.OAK_SAPLING, ModBlocks.QUARTZ_SAPLING, pWriter);
        recipeResourceSaplings(Items.REDSTONE, Blocks.OAK_SAPLING, ModBlocks.REDSTONE_SAPLING, pWriter);
    }
    
    protected void recipeResourceSaplings(ItemLike ingredientsResource, ItemLike ingredientsSapling , ItemLike result, RecipeOutput pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
        .pattern(" a ")
        .pattern("aba")
        .pattern(" a ")
        .define('a', ingredientsResource)
        .define('b', ingredientsSapling)
        .unlockedBy("criteria", has(ingredientsResource)) // How the recipe is unlocked
        .save(pWriter);
    }
}

