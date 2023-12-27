package com.sebastian3146.resourcefultrees.item;

import com.sebastian3146.resourcefultrees.ResourcefulTrees;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab>  CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResourcefulTrees.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RECOURSFULTREES_TAB = CREATIVE_MODE_TABS.register("resourcefultrees_tab", 
        ()-> CreativeModeTab.builder()
        .title(Component.translatable("creativetab.resourcefultrees_tab"))
        .displayItems((parameters, output)-> {
            //Add items to the creative tab
            //output.accept(ModItems.SAPLING.get());
            output.accept(ModBlocks.COAL_SAPLING.get());
        })
        .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
