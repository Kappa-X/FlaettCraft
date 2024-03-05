package net.fivaflo.flaettcraft.datagen;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, FlaettCraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Vibranium_Helmet.get(), ModItems.Vibranium_Chestplate.get(), ModItems.Vibranium_Leggings.get(), ModItems.Vibranium_Boots.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.Star_Wars_Drill_Music_Disc.get());
    }
}
