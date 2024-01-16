package net.fivaflo.flaettcraft.item;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FlaettCraft.MODID);

    public static final RegistryObject<CreativeModeTab> FLAETTCRAFT_TAB = CREATIVE_MODE_TABS.register("flaettcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Vibranium.get()))
                    .title(Component.translatable("creativetab.flaettcraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Vibranium.get());
                        pOutput.accept(ModItems.Raw_Vibranium.get());
                        pOutput.accept(ModBlocks.Vibranium_Block.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
