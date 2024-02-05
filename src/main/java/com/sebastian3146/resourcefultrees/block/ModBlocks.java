package com.sebastian3146.resourcefultrees.block;

import javax.annotation.Nullable;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.worldgen.tree.*;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ResourcefulTrees.MODID);

    //Saplings
	public static final DeferredBlock<SaplingBlock> COAL_SAPLING = BLOCKS.register("coal_sapling", ()-> new SaplingBlock(CoalTreeGrower.Coal, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> IRON_SAPLING = BLOCKS.register("iron_sapling", ()-> new SaplingBlock(IronTreeGrower.iron, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> GOLD_SAPLING = BLOCKS.register("gold_sapling", ()-> new SaplingBlock(GoldTreeGrower.gold, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> DIAMOND_SAPLING = BLOCKS.register("diamond_sapling", ()-> new SaplingBlock(DiamondTreeGrower.diamond, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> EMERALD_SAPLING = BLOCKS.register("emerald_sapling", ()-> new SaplingBlock(EmeraldTreeGrower.emerald, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> REDSTONE_SAPLING = BLOCKS.register("redstone_sapling", ()-> new SaplingBlock(RedstoneTreeGrower.redstone, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> COPPER_SAPLING = BLOCKS.register("copper_sapling", ()-> new SaplingBlock(CopperTreeGrower.Copper, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> ANCIENT_DEBRIS_SAPLING = BLOCKS.register("ancient_debris_sapling", ()-> new SaplingBlock(AncientDebrisTreeGrower.ancientDebris, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredBlock<SaplingBlock> QUARTZ_SAPLING = BLOCKS.register("quartz_sapling", ()-> new SaplingBlock(QuartzTreeGrower.quartz, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    //Leaves
    public static final DeferredBlock<LeavesBlock> COAL_LEAVES = BLOCKS.register("coal_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> IRON_LEAVES = BLOCKS.register("iron_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> GOLD_LEAVES = BLOCKS.register("gold_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> DIAMOND_LEAVES = BLOCKS.register("diamond_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> EMERALD_LEAVES = BLOCKS.register("emerald_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> REDSTONE_LEAVES = BLOCKS.register("redstone_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> COPPER_LEAVES = BLOCKS.register("copper_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> ANCIENT_DEBRIS_LEAVES = BLOCKS.register("ancient_debris_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<LeavesBlock> QUARTZ_LEAVES = BLOCKS.register("quartz_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));

    public static void register(IEventBus  eventBus) { BLOCKS.register(eventBus); }
}
        
