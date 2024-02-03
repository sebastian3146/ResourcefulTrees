package com.sebastian3146.resourcefultrees.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.worldgen.ModBiomeModifiers;
import com.sebastian3146.resourcefultrees.worldgen.ModConfiguredFeatures;
import com.sebastian3146.resourcefultrees.worldgen.ModPlacedFeatures;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
        .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        //.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
        //.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    

    public ModWorldGenProvider(PackOutput output, CompletableFuture<Provider> registries, RegistrySetBuilder datapackEntriesBuilder, Set<String> modIds) {
        super(output, registries, BUILDER, Set.of(ResourcefulTrees.MODID));
    }
    
}
