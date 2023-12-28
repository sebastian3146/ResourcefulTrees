package com.sebastian3146.resourcefultrees.worldgen.tree;

import javax.annotation.Nullable;

import com.sebastian3146.resourcefultrees.worldgen.ModConfiguredFeatures;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class CopperTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911) {
        return ModConfiguredFeatures.COPPER_TREE_KEY;    
    }
    
}