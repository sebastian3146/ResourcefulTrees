package com.sebastian3146.resourcefultrees.datagen;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.item.ModItems;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ResourcefulTrees.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //generates a model item json file
        //simpleItem(ModItems.TEST_ITEM);
        
        //SAPLINGS
        saplingItem(ModItems.COAL_SAPLING);
        saplingItem(ModItems.IRON_SAPLING);
        saplingItem(ModItems.GOLD_SAPLING);
        saplingItem(ModItems.DIAMOND_SAPLING);
        saplingItem(ModItems.EMERALD_SAPLING);
        saplingItem(ModItems.REDSTONE_SAPLING);
        saplingItem(ModItems.COPPER_SAPLING);
        saplingItem(ModItems.ANCIENT_DEBRIS_SAPLING);
        saplingItem(ModItems.QUARTZ_SAPLING);
        
        //LEAVES
        /*
        simpleBlockItem(ModItems.COAL_LEAVES);
        simpleBlockItem(ModItems.IRON_LEAVES);
        simpleBlockItem(ModItems.GOLD_LEAVES);
        
        simpleBlockItem(ModItems.EMERALD_LEAVES);
        simpleBlockItem(ModItems.REDSTONE_LEAVES);
        simpleBlockItem(ModItems.COPPER_LEAVES);
        simpleBlockItem(ModItems.ANCIENT_DEBRIS_LEAVES);
        simpleBlockItem(ModItems.QUARTZ_LEAVES);
        */
        simpleBlockItem(ModItems.DIAMOND_LEAVES);
    }

    //Simple helper method
    private ItemModelBuilder simpleItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("layer0",
            new ResourceLocation(ResourcefulTrees.MODID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder saplingItem(DeferredItem<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ResourcefulTrees.MODID,"block/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItem(DeferredItem<BlockItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ResourcefulTrees.MODID,"item/" + item.getId().getPath()));
    }
    
}