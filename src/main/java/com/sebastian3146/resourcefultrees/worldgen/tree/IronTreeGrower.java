package com.sebastian3146.resourcefultrees.worldgen.tree;

import javax.annotation.Nullable;

import java.util.Optional;
import com.sebastian3146.resourcefultrees.worldgen.ModConfiguredFeatures;

import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.grower.TreeGrower;

public class IronTreeGrower {
    public static final TreeGrower iron = new TreeGrower(
        "iron_tree",
        0.1F,
        Optional.empty(),
        Optional.empty(),
        Optional.of(ModConfiguredFeatures.IRON_TREE_KEY),
        Optional.empty(),
        Optional.empty(),
        Optional.empty()
    );
    
}
