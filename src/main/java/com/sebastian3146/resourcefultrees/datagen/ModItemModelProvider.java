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

        saplingItem(ModItems.ORE_SAPLING);
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
    
}
