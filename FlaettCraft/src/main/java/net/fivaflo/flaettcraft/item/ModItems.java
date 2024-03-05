package net.fivaflo.flaettcraft.item;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.item.custom.ModArmorItem;
import net.fivaflo.flaettcraft.sound.ModSounds;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> Vibranium_Sword = ITEMS.register("vibranium_sword",
            () -> new SwordItem(ModToolTiers.Vibranium, 9, 2, new Item.Properties()));
    public static  final RegistryObject<Item> Vibranium_Pickaxe = ITEMS.register("vibranium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.Vibranium, 2, 2, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Axe = ITEMS.register("vibranium_axe",
            () -> new AxeItem(ModToolTiers.Vibranium, 8, 1, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Shovel = ITEMS.register("vibranium_shovel",
            () -> new ShovelItem(ModToolTiers.Vibranium, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Hoe = ITEMS.register("vibranium_hoe",
            () -> new HoeItem(ModToolTiers.Vibranium, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Helmet = ITEMS.register("vibranium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.Vibranium, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Chestplate = ITEMS.register("vibranium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.Vibranium, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Leggings = ITEMS.register("vibranium_leggings",
            () -> new ArmorItem(ModArmorMaterials.Vibranium, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> Vibranium_Boots = ITEMS.register("vibranium_boots",
                () -> new ArmorItem(ModArmorMaterials.Vibranium, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static  final RegistryObject<Item> Star_Wars_Drill_Music_Disc = ITEMS.register("star_wars_drill_music_disc",
            () -> new RecordItem(6, ModSounds.Star_Wars_Drill, new Item.Properties().stacksTo(1), 3180));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
