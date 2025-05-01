package net.jonson.modhorror.event;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.entity.ModEntities;
import net.jonson.modhorror.entity.custom.DreadhoofEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModHorror.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.DREADHOOF.get(), DreadhoofEntity.createAttributes().build());
    }
}
