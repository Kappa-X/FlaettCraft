package net.fivaflo.flaettcraft.sound;

import net.fivaflo.flaettcraft.FlaettCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FlaettCraft.MODID);

    public static final RegistryObject<SoundEvent> Sound_FlaettBlock_Break = registerSoundEvents("sound_flaettblock_break");
    public static final RegistryObject<SoundEvent> Sound_ValeBlock_Break = registerSoundEvents("sound_valeblock_break");
    public static final RegistryObject<SoundEvent> Sound_FinnBlock_Break = registerSoundEvents("sound_finnblock_break");
    public static final RegistryObject<SoundEvent> Sound_Block_Step = registerSoundEvents("sound_block_step");
    public static final RegistryObject<SoundEvent> Sound_Block_Fall = registerSoundEvents("sound_block_fall");
    public static final RegistryObject<SoundEvent> Sound_Block_Place = registerSoundEvents("sound_block_place");
    public static final RegistryObject<SoundEvent> Sound_Block_Hit = registerSoundEvents("sound_block_hit");

    public static final RegistryObject<SoundEvent> Star_Wars_Drill = registerSoundEvents("star_wars_drill");

    public static final ForgeSoundType Sound_FlaettBlock_Sounds = new ForgeSoundType(1f, 1f,
            ModSounds.Sound_FlaettBlock_Break, ModSounds.Sound_Block_Hit, ModSounds.Sound_Block_Step,
            ModSounds.Sound_Block_Place, ModSounds.Sound_Block_Fall);

    public static final ForgeSoundType Sound_ValeBlock_Sounds = new ForgeSoundType(1f, 1f,
            ModSounds.Sound_ValeBlock_Break, ModSounds.Sound_Block_Hit, ModSounds.Sound_Block_Step,
            ModSounds.Sound_Block_Place, ModSounds.Sound_Block_Fall);

    public static final ForgeSoundType Sound_FinnBlock_Sounds = new ForgeSoundType(1f, 1f,
            ModSounds.Sound_FinnBlock_Break, ModSounds.Sound_Block_Hit, ModSounds.Sound_Block_Step,
            ModSounds.Sound_Block_Place, ModSounds.Sound_Block_Fall);


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(FlaettCraft.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
