package net.malarky.eldritchhorrors.datagen;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.EldritchHorrors;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EldritchHorrors.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // Blocks

        blockWithItem(ModBlocks.COBBLED_CORRUPT_STONE);
        blockWithItem(ModBlocks.CORRUPT_STONE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
