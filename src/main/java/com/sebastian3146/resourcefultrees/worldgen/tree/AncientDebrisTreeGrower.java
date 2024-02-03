package com.sebastian3146.resourcefultrees.worldgen.tree;

import com.sebastian3146.resourcefultrees.worldgen.ModConfiguredFeatures;

import java.util.Optional;

import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class AncientDebrisTreeGrower {
    public static final TreeGrower ancientDebris = new TreeGrower(
        "ancient_debris_tree",
        0.1F,
        Optional.empty(),
        Optional.empty(),
        Optional.of(ModConfiguredFeatures.ANCIENT_DEBRIS_TREE_KEY),
        Optional.empty(),
        Optional.empty(),
        Optional.empty()
    );
}
