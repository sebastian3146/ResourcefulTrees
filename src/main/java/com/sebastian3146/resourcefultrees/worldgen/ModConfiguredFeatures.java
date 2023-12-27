package com.sebastian3146.resourcefultrees.worldgen;

import java.util.List;

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
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TREE_KEY = registerKey("end_sapphire_ore");

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

        //ORE TREE configuration, placement
        register(context, ORE_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(Blocks.OAK_LOG),
            new StraightTrunkPlacer(5, 5, 5),
            BlockStateProvider.simple(ModBlocks.COAL_LEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
            new TwoLayersFeatureSize(1, 0, 2)).build());
    }   

    //HELPER METHODS
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ResourcefulTrees.MODID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {                                                                            
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}