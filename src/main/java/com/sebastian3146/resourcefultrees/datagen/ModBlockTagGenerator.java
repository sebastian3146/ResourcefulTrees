package com.sebastian3146.resourcefultrees.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ResourcefulTrees.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider p_256380_) {
        
        //Adds the coal_leaves to the needs diamond tool
        /*
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.COAL_LEAVES.get());
        */

        //Adds coal_leaves to the mineable with hoe json file
        /*
        this.tag(BlockTags.MINEABLE_WITH_HOE)
            .add(ModBlocks.COAL_LEAVES.get())
            .add(ModBlocks.IRON_LEAVES.get())
            .add(ModBlocks.GOLD_LEAVES.get())
            .add(ModBlocks.DIAMOND_LEAVES.get())
            .add(ModBlocks.EMERALD_LEAVES.get())
            .add(ModBlocks.REDSTONE_LEAVES.get())
            .add(ModBlocks.COPPER_LEAVES.get())
            .add(ModBlocks.ANCIENT_DEBRIS_LEAVES.get());
            */
    }
    
}
