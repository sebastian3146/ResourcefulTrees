package com.sebastian3146.resourcefultrees.item;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResourcefulTrees.MODID);
        
    //public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item", new Item.Properties());

    //Block Items -> Saplings
    public static final DeferredItem<BlockItem> ORE_SAPLING = ITEMS.registerSimpleBlockItem("ore_sapling", ModBlocks.ORE_SAPLING);
    public static final DeferredItem<BlockItem> COAL_SAPLING = ITEMS.registerSimpleBlockItem("coal_sapling", ModBlocks.COAL_SAPLING);

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
