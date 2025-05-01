package net.jonson.modhorror.event;

import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.entity.client.DreadhoofModel;
import net.jonson.modhorror.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ModHorror.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class modEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event ){
        event.registerLayerDefinition(ModModelLayers.DREADHOOF_LAYER, DreadhoofModel::createBodyLayer);
    }

}

