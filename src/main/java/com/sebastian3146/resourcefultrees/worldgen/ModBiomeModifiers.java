package com.sebastian3146.resourcefultrees.worldgen;

public class ModBiomeModifiers {
    /*
    public static final ResourceKey<BiomeModifier> ADD_ORES_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = registerKey("add_nether_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = registerKey("add_end_sapphire_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var PlacedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        //SPAWN ORE IN THE OVERWORLD
        context.register(ADD_ORES_ORE, new AddFeaturesBiomeModifier(
            biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
            HolderSet.direct(PlacedFeatures.getOrThrow(ModPlacedFeatures.ORES_ORE_PLACED_KEY)),
            GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    //HELPER METHODS
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ResourcefulTrees.MODID, name));
    }
    */
}
