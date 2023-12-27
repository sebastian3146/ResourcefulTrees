package com.sebastian3146.resourcefultrees.datagen;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nullable;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
            CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ResourcefulTrees.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider p_256380_) {

    }
    
}
