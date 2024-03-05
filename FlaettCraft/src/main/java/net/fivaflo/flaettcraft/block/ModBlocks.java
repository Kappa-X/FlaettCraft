package net.fivaflo.flaettcraft.block;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.fivaflo.flaettcraft.item.ModItems;
import net.fivaflo.flaettcraft.sound.ModSounds;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FlaettCraft.MODID);


    public static final RegistryObject<Block> Vibranium_Ore = registerBlock("vibranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> FlaettBlock = registerBlock("flaettblock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(ModSounds.Sound_FlaettBlock_Sounds).noLootTable()));

    public static final RegistryObject<Block> ValeBlock = registerBlock("valeblock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(ModSounds.Sound_ValeBlock_Sounds).noLootTable()));

    public static final RegistryObject<Block> FinnBlock = registerBlock("finnblock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(ModSounds.Sound_FinnBlock_Sounds).noLootTable()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static  void  register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
