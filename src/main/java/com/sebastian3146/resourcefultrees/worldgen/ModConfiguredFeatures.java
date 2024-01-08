package com.sebastian3146.resourcefultrees.worldgen;

import java.util.List;

import com.ibm.icu.impl.UResource.Array;
import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
    //ORES
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORE_KEY = registerKey("ore_gen");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");
    //TREES
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAL_TREE_KEY = registerKey("coal_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_TREE_KEY = registerKey("iron_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLD_TREE_KEY = registerKey("gold_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DIAMOND_TREE_KEY = registerKey("diamond_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EMERALD_TREE_KEY = registerKey("emerald_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDSTONE_TREE_KEY = registerKey("redstone_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COPPER_TREE_KEY = registerKey("copper_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DEBRIS_TREE_KEY = registerKey("ancient_debris_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_TREE_KEY = registerKey("quartz_tree");

    private static final int straightTrunkPlacer_1 = 3;
    private static final int straightTrunkPlacer_2 = 2;
    private static final int straightTrunkPlacer_3 = 2;

    private static final int blobFoliagePlacer_1 = 3;
    private static final int blobFoliagePlacer_2 = 2;
    private static final int blobFoliagePlacer_3 = 3;


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceable = new BlockMatchTest(Blocks.END_STONE);


        //ORE CONFIGURATIONS
        List<OreConfiguration.TargetBlockState> overworldOreOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.COAL_LEAVES.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.COAL_LEAVES.get().defaultBlockState()));
        
        //REGISTER ORES
        register(context, OVERWORLD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOreOres, 9));
        

        //COAL TREE configuration, placement //create a list of tree_keys and ore_tree_leaves
        register(context, COAL_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.COAL_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());
        
        register(context, IRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.IRON_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, GOLD_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.GOLD_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, DIAMOND_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.DIAMOND_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, EMERALD_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.EMERALD_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, REDSTONE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.REDSTONE_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, COPPER_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.COPPER_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ANCIENT_DEBRIS_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.ANCIENT_DEBRIS_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, QUARTZ_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(straightTrunkPlacer_1, straightTrunkPlacer_2, straightTrunkPlacer_3),
            BlockStateProvider.simple(ModBlocks.QUARTZ_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(blobFoliagePlacer_1), ConstantInt.of(blobFoliagePlacer_2), blobFoliagePlacer_3),
            new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    List<ResourceKey<ConfiguredFeature<?, ?>>> ore_keys = List.of(registerKey("coal_tree"), registerKey("iron_tree"));

    //HELPER METHODS
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ResourcefulTrees.MODID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {                                                                            
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}