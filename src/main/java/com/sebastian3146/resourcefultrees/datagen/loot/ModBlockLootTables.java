package com.sebastian3146.resourcefultrees.datagen.loot;

import java.util.Set;
import java.util.stream.Collectors;

import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;



public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        /*
        this.add(ModBlocks.COAL_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.COAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.COAL_SAPLING.get());

        this.add(ModBlocks.IRON_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.IRON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.IRON_SAPLING.get());

        this.add(ModBlocks.GOLD_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.GOLD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.GOLD_SAPLING.get());

        this.add(ModBlocks.DIAMOND_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.DIAMOND_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.DIAMOND_SAPLING.get());

        this.add(ModBlocks.EMERALD_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.EMERALD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.EMERALD_SAPLING.get());

        this.add(ModBlocks.REDSTONE_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.REDSTONE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.REDSTONE_SAPLING.get());

        this.add(ModBlocks.COPPER_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.COPPER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.COPPER_SAPLING.get());

        this.add(ModBlocks.ANCIENT_DEBRIS_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.ANCIENT_DEBRIS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ANCIENT_DEBRIS_SAPLING.get());

        this.add(ModBlocks.QUARTZ_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.QUARTZ_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.QUARTZ_SAPLING.get());
        */
    }
    
    /*
    // In some BlockLootSubProvider subclass for some DeferredRegister BLOCK_REGISTRAR(= ModBlocks.BLOCKS)
    @Override
    protected Iterable<Block> getKnownBlocks() {
    return ModBlocks.BLOCKS.getEntries() // Get all registered entries
        .stream() // Stream the wrapped objects
        .flatMap(DeferredRegister::get) // Get the object if available
        ::iterator; // Create the iterable
    }
    */
}
