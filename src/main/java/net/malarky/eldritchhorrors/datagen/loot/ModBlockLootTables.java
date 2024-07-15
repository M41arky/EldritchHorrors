package net.malarky.eldritchhorrors.datagen.loot;

import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static net.malarky.eldritchhorrors.block.ModBlocks.CORRUPT_STONE;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        // Add blocks that drop themselves here

        this.dropSelf(ModBlocks.COBBLED_CORRUPT_STONE.get());

        // Add blocks that drop other blocks here

        this.dropOther(CORRUPT_STONE.get(), ModBlocks.COBBLED_CORRUPT_STONE.get());

        this.dropWhenSilkTouch(CORRUPT_STONE.get(), CORRUPT_STONE.get());


    }

    private void dropWhenSilkTouch(Block block, Block block1) {
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));



    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}


// EVERYTIME AN ITEM IS ADDED RUN DATAGEN
// HAVE TO SWITCH TO RUN CLIENT IN TOP AFTER