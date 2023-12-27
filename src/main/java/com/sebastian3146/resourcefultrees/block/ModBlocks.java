package com.sebastian3146.resourcefultrees.block;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.worldgen.tree.OreTreeGrower;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ResourcefulTrees.MODID);

    //Saplings
    public static final DeferredBlock<SaplingBlock> ORE_SAPLING = BLOCKS.register("ore_sapling", ()-> new SaplingBlock(new OreTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<Block> COAL_SAPLING = BLOCKS.registerSimpleBlock("coal_sapling", BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING));
    //Leaves
    public static final DeferredBlock<Block> COAL_LEAVES = BLOCKS.registerSimpleBlock("coal_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> IRON_LEAVES = BLOCKS.registerSimpleBlock("iron_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> GOLD_LEAVES = BLOCKS.registerSimpleBlock("gold_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> DIAMOND_LEAVES = BLOCKS.registerSimpleBlock("diamond_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> EMERALD_LEAVES = BLOCKS.registerSimpleBlock("emerald_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> REDSTONE_LEAVES = BLOCKS.registerSimpleBlock("redstone_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> COPPER_LEAVES = BLOCKS.registerSimpleBlock("copper_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> ANCIENT_DEBRIS_LEAVES = BLOCKS.registerSimpleBlock("ancient_debris_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> QUARTZ_LEAVES = BLOCKS.registerSimpleBlock("quartz_leaves", BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));


    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}
        
