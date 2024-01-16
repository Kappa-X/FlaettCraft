package net.fivaflo.flaettcraft.item;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FlaettCraft.MODID);

    public static  final RegistryObject<Item> Vibranium = ITEMS.register("vibranium",
            () -> new Item(new Item.Properties()));
    public static  final RegistryObject<Item> Raw_Vibranium = ITEMS.register("raw_vibranium",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
