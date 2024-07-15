package net.malarky.eldritchhorrors.item;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.NavigableMap;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EldritchHorrors.MOD_ID);


    public static final RegistryObject<CreativeModeTab> DESERT_MOD_ITEMS = CREATIVE_MODE_TABS.register("eldritch_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORRUPT_TENDRIL.get()))
                    .title(Component.translatable("creativetab.eldritch_horrors"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Items

                        // Mob Drops

                        output.accept(ModItems.CORRUPT_TENDRIL.get());

                        // Blocks

                        output.accept(ModBlocks.CORRUPT_STONE.get());
                        output.accept(ModBlocks.COBBLED_CORRUPT_STONE.get());

                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
