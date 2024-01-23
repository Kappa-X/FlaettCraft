package net.fivaflo.flaettcraft.datagen;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.item.ModItems;
import net.fivaflo.flaettcraft.block.ModBlocks;
import net.fivaflo.flaettcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FlaettCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.Vibranium);
        simpleItem(ModItems.Raw_Vibranium);

        handheldItem(ModItems.Vibranium_Sword);
        handheldItem(ModItems.Vibranium_Pickaxe);
        handheldItem(ModItems.Vibranium_Axe);
        handheldItem(ModItems.Vibranium_Shovel);
        handheldItem(ModItems.Vibranium_Hoe);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FlaettCraft.MODID,"item/" + item.getId().getPath()));
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(FlaettCraft.MODID,"item/" + item.getId().getPath()));
    }
}
