package net.jonson.modhorror.sounds;

import net.jonson.modhorror.ModHorror;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ModHorror.MOD_ID);

    public static final RegistryObject<SoundEvent> GALAXY_BLOCK_SOUND =
            SOUNDS.register("galaxy_block_sound",
                    () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(ModHorror.MOD_ID, "galaxy_block_sound")));

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }


}
