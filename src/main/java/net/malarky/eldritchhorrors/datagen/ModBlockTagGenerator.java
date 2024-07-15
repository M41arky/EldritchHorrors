package net.malarky.eldritchhorrors.datagen;

import net.malarky.eldritchhorrors.EldritchHorrors;
import net.malarky.eldritchhorrors.block.ModBlocks;
import net.malarky.eldritchhorrors.util.ModTags;
import net.malarky.eldritchhorrors.EldritchHorrors;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EldritchHorrors.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // Needs Specific Tool Tags

        // Needs Pickaxe

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CORRUPT_STONE.get(),
                        ModBlocks.COBBLED_CORRUPT_STONE.get());



        // Needs Specific Tool Material Tags

        // Needs Iron

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CORRUPT_STONE.get(),
                        ModBlocks.COBBLED_CORRUPT_STONE.get());



    }
}
