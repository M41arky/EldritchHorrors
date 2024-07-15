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
        blockWithItem(ModBlocks.CORRUPT_BRICKS);

        // Stairs

        stairsBlock(((StairBlock) ModBlocks.COBBLED_CORRUPT_STONE_STAIRS.get()), blockTexture(ModBlocks.COBBLED_CORRUPT_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.CORRUPT_BRICK_STAIRS.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CORRUPT_STONE_STAIRS.get()), blockTexture(ModBlocks.CORRUPT_STONE.get()));

        // Slabs

        slabBlock(((SlabBlock) ModBlocks.COBBLED_CORRUPT_STONE_SLAB.get()), blockTexture(ModBlocks.COBBLED_CORRUPT_STONE.get()), blockTexture(ModBlocks.COBBLED_CORRUPT_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CORRUPT_BRICK_SLAB.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CORRUPT_STONE_SLAB.get()), blockTexture(ModBlocks.CORRUPT_STONE.get()), blockTexture(ModBlocks.CORRUPT_STONE.get()));

        // Walls

        wallBlock(((WallBlock) ModBlocks.COBBLED_CORRUPT_STONE_WALL.get()), blockTexture(ModBlocks.COBBLED_CORRUPT_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.CORRUPT_BRICK_WALL.get()), blockTexture(ModBlocks.CORRUPT_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.CORRUPT_STONE_WALL.get()), blockTexture(ModBlocks.CORRUPT_STONE.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
