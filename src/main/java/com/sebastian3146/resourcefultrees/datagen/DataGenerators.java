package com.sebastian3146.resourcefultrees.datagen;

import java.util.concurrent.CompletableFuture;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.DataGenerator.PackGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ResourcefulTrees.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        PackGenerator vanillaPack = generator.getVanillaPack(true);

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider)); //recipes generation
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));          //loot table generation

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper)); //item model generation

        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));  //block tags
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper)); //item tags


        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, lookupProvider, null, null));
    }   
}