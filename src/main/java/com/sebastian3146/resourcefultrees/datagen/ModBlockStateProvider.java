package com.sebastian3146.resourcefultrees.datagen;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ResourcefulTrees.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //LEAVES
        /*
        leavesBlock(ModBlocks.COAL_LEAVES);
        leavesBlock(ModBlocks.IRON_LEAVES);
        leavesBlock(ModBlocks.GOLD_LEAVES);
        leavesBlock(ModBlocks.DIAMOND_LEAVES);
        leavesBlock(ModBlocks.EMERALD_LEAVES);
        leavesBlock(ModBlocks.REDSTONE_LEAVES);
        leavesBlock(ModBlocks.COPPER_LEAVES);
        leavesBlock(ModBlocks.ANCIENT_DEBRIS_LEAVES);
        leavesBlock(ModBlocks.QUARTZ_LEAVES);
        */
        //SAPLINGS
        saplingBlock(ModBlocks.COAL_SAPLING);
        saplingBlock(ModBlocks.IRON_SAPLING);
        saplingBlock(ModBlocks.GOLD_SAPLING);
        saplingBlock(ModBlocks.DIAMOND_SAPLING);
        saplingBlock(ModBlocks.EMERALD_SAPLING);
        saplingBlock(ModBlocks.REDSTONE_SAPLING);
        saplingBlock(ModBlocks.COPPER_SAPLING);
        saplingBlock(ModBlocks.ANCIENT_DEBRIS_SAPLING);
        saplingBlock(ModBlocks.QUARTZ_SAPLING);
    }

    //Helper Methods
    private void saplingBlock(DeferredBlock<SaplingBlock> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), 
                blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockWithItem(DeferredBlock<Block> blockDeferredBlock) {
        simpleBlockWithItem(blockDeferredBlock.get(), cubeAll(blockDeferredBlock.get()));
    }
    private void leavesBlock(DeferredBlock<LeavesBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    
}
