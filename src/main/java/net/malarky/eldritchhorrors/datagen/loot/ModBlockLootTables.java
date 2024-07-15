package net.malarky.eldritchhorrors.datagen.loot;

import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static net.malarky.eldritchhorrors.block.ModBlocks.COBBLED_CORRUPT_STONE;
import static net.malarky.eldritchhorrors.block.ModBlocks.CORRUPT_STONE;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        // Add blocks that drop themselves here

        this.dropSelf(ModBlocks.COBBLED_CORRUPT_STONE.get());
        this.dropSelf(ModBlocks.CORRUPT_BRICKS.get());

        // Add blocks that drop other blocks here

        this.add(CORRUPT_STONE.get(),
                block -> createStoneLikeOreDrops(CORRUPT_STONE.get(), Item.byBlock(COBBLED_CORRUPT_STONE.get())));

        // Stairs

        this.dropSelf(ModBlocks.COBBLED_CORRUPT_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CORRUPT_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CORRUPT_STONE_STAIRS.get());

        // Slabs

        this.add(ModBlocks.COBBLED_CORRUPT_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_CORRUPT_STONE_SLAB.get()));
        this.add(ModBlocks.CORRUPT_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CORRUPT_BRICK_SLAB.get()));
        this.add(ModBlocks.CORRUPT_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CORRUPT_STONE_SLAB.get()));

        // Walls

        this.dropSelf(ModBlocks.COBBLED_CORRUPT_STONE_WALL.get());
        this.dropSelf(ModBlocks.CORRUPT_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CORRUPT_STONE_WALL.get());

    }

    protected LootTable.Builder createStoneLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))));


}
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


// EVERYTIME AN ITEM IS ADDED RUN DATAGEN
// HAVE TO SWITCH TO RUN CLIENT IN TOP AFTER