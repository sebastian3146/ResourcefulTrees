package com.sebastian3146.resourcefultrees.datagen.loot;

import java.util.Set;

import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;


public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        this.add(ModBlocks.COAL_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.COAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.COAL_SAPLING.get());
    }
    
    /*
    // In some BlockLootSubProvider subclass for some DeferredRegister BLOCK_REGISTRAR(= ModBlocks.BLOCKS)
    @Override
    protected Iterable<Block> getKnownBlocks() {
    return ModBlocks.BLOCKS.getEntries() // Get all registered entries
        .stream() // Stream the wrapped objects
        .map(DeferredRegister::get) // Get the object if available
        ::iterator; // Create the iterable
    }
    */
    
}
