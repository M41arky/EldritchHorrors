package net.malarky.eldritchhorrors.item;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.EldritchHorrors;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EldritchHorrors.MOD_ID);

    // Items

    // Mob Drops

    public static final RegistryObject<Item> CORRUPT_TENDRIL = ITEMS.register("corrupt_tendril",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

// New Item Checklist

// Add here
// Add to ItemModelProvider
// Add to Creative Tab
// Add to en_us.json
// Apply any additional requirements, Tags, etc
// Run Data