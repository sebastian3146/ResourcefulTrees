package com.sebastian3146.resourcefultrees.datagen.loot;

import java.util.Set;
import com.sebastian3146.resourcefultrees.block.ModBlocks;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;



public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.COAL_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.COAL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.COAL_LEAVES.get(), item ->
            createLeavesDrops(item, Items.COAL, NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.COAL_SAPLING.get());

        this.add(ModBlocks.IRON_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.IRON_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.IRON_SAPLING.get());

        this.add(ModBlocks.GOLD_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.GOLD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.GOLD_SAPLING.get());

        this.add(ModBlocks.DIAMOND_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.DIAMOND_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.DIAMOND_SAPLING.get());

        this.add(ModBlocks.EMERALD_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.EMERALD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.EMERALD_SAPLING.get());

        this.add(ModBlocks.REDSTONE_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.REDSTONE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.REDSTONE_SAPLING.get());

        this.add(ModBlocks.COPPER_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.COPPER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.COPPER_SAPLING.get());

        this.add(ModBlocks.ANCIENT_DEBRIS_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.ANCIENT_DEBRIS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.ANCIENT_DEBRIS_SAPLING.get());

        this.add(ModBlocks.QUARTZ_LEAVES.get(), block ->
            createLeavesDrops(block, ModBlocks.QUARTZ_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.QUARTZ_SAPLING.get());
    }
    
    
    // In some BlockLootSubProvider subclass for some DeferredRegister BLOCK_REGISTRAR(= ModBlocks.BLOCKS)
    @Override
    protected Iterable<Block> getKnownBlocks() {
    return ModBlocks.BLOCKS.getEntries() // Get all registered entries
        .stream() // Stream the wrapped objects
        .map(s->(Block)s.get()) // Get the object if available
        .toList();
    }

    protected LootTable.Builder createLeavesDrops(Block p_250088_, Item p_250731_, float... p_248949_) {
      return createSilkTouchOrShearsDispatchTable(
            p_250088_,
            this.applyExplosionCondition(p_250088_, LootItem.lootTableItem(p_250731_))
               .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, p_248949_))
         )
         .withPool(
            LootPool.lootPool()
               .setRolls(ConstantValue.exactly(1.0F))
               .when(HAS_SHEARS.or(HAS_SILK_TOUCH))
               .add(
                  this.applyExplosionDecay(
                        p_250088_, LootItem.lootTableItem(Items.STICK).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                     )
                     .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F}))
               )
         );
   }
    
    
}
