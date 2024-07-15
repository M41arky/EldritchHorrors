package net.malarky.eldritchhorrors.datagen;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EldritchHorrors.MOD_ID);
    }

    @Override
    protected void start() {

        // Loot from Mobs

        // Loot from Chests

        // Loot from Suspicous Sand

    }
}