package net.malarky.eldritchhorrors.block;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.item.ModItems;
import net.malarky.eldritchhorrors.EldritchHorrors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EldritchHorrors.MOD_ID);

    // Stones

    public static final RegistryObject<Block> CORRUPT_STONE = registerBlock("corrupt_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> COBBLED_CORRUPT_STONE = registerBlock("cobbled_corrupt_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_BRICKS = registerBlock("corrupt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    // Stairs

    public static final RegistryObject<Block> COBBLED_CORRUPT_STONE_STAIRS = registerBlock("cobbled_corrupt_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_CORRUPT_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_BRICK_STAIRS = registerBlock("corrupt_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CORRUPT_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_STONE_STAIRS = registerBlock("corrupt_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CORRUPT_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    // Slabs

    public static final RegistryObject<Block> COBBLED_CORRUPT_STONE_SLAB = registerBlock("cobbled_corrupt_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_BRICK_SLAB = registerBlock("corrupt_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_STONE_SLAB = registerBlock("corrupt_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    // Walls

    public static final RegistryObject<Block> COBBLED_CORRUPT_STONE_WALL = registerBlock("cobbled_corrupt_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_BRICK_WALL = registerBlock("corrupt_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> CORRUPT_STONE_WALL = registerBlock("corrupt_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)  {
        BLOCKS.register(eventBus);
    }
}
