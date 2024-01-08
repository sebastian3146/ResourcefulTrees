package com.sebastian3146.resourcefultrees.item;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResourcefulTrees.MODID);
    
    //Block Items -> Saplings
    public static final DeferredItem<BlockItem> COAL_SAPLING = ITEMS.registerSimpleBlockItem("coal_sapling", ModBlocks.COAL_SAPLING);
    public static final DeferredItem<BlockItem> IRON_SAPLING = ITEMS.registerSimpleBlockItem("iron_sapling", ModBlocks.IRON_SAPLING);
    public static final DeferredItem<BlockItem> GOLD_SAPLING = ITEMS.registerSimpleBlockItem("gold_sapling", ModBlocks.GOLD_SAPLING);
    public static final DeferredItem<BlockItem> DIAMOND_SAPLING = ITEMS.registerSimpleBlockItem("diamond_sapling", ModBlocks.DIAMOND_SAPLING);
    public static final DeferredItem<BlockItem> EMERALD_SAPLING = ITEMS.registerSimpleBlockItem("emerald_sapling", ModBlocks.EMERALD_SAPLING);
    public static final DeferredItem<BlockItem> REDSTONE_SAPLING = ITEMS.registerSimpleBlockItem("redstone_sapling", ModBlocks.REDSTONE_SAPLING);
    public static final DeferredItem<BlockItem> COPPER_SAPLING = ITEMS.registerSimpleBlockItem("copper_sapling", ModBlocks.COPPER_SAPLING);
    public static final DeferredItem<BlockItem> ANCIENT_DEBRIS_SAPLING = ITEMS.registerSimpleBlockItem("ancient_debris_sapling", ModBlocks.ANCIENT_DEBRIS_SAPLING);
    public static final DeferredItem<BlockItem> QUARTZ_SAPLING = ITEMS.registerSimpleBlockItem("quartz_sapling", ModBlocks.QUARTZ_SAPLING);

    //Block Items -> Leaves
    public static final DeferredItem<BlockItem> COAL_LEAVES = ITEMS.registerSimpleBlockItem("coal_leaves", ModBlocks.COAL_LEAVES);
    public static final DeferredItem<BlockItem> IRON_LEAVES = ITEMS.registerSimpleBlockItem("iron_leaves", ModBlocks.IRON_LEAVES);
    public static final DeferredItem<BlockItem> GOLD_LEAVES = ITEMS.registerSimpleBlockItem("gold_leaves", ModBlocks.GOLD_LEAVES);
    public static final DeferredItem<BlockItem> DIAMOND_LEAVES = ITEMS.registerSimpleBlockItem("diamond_leaves", ModBlocks.DIAMOND_LEAVES);
    public static final DeferredItem<BlockItem> EMERALD_LEAVES = ITEMS.registerSimpleBlockItem("emerald_leaves", ModBlocks.EMERALD_LEAVES);
    public static final DeferredItem<BlockItem> REDSTONE_LEAVES = ITEMS.registerSimpleBlockItem("redstone_leaves", ModBlocks.REDSTONE_LEAVES);
    public static final DeferredItem<BlockItem> COPPER_LEAVES = ITEMS.registerSimpleBlockItem("copper_leaves", ModBlocks.COPPER_LEAVES);
    public static final DeferredItem<BlockItem> ANCIENT_DEBRIS_LEAVES = ITEMS.registerSimpleBlockItem("ancient_debris_leaves", ModBlocks.ANCIENT_DEBRIS_LEAVES);
    public static final DeferredItem<BlockItem> QUARTZ_LEAVES = ITEMS.registerSimpleBlockItem("quartz_leavess", ModBlocks.QUARTZ_LEAVES);


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
        
}
