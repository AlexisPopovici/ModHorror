package net.jonson.modhorror.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jonson.modhorror.ModHorror;
import net.jonson.modhorror.entity.custom.DreadhoofEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DreadhoofRenderer extends MobRenderer<DreadhoofEntity, DreadhoofModel<DreadhoofEntity>> {
    public DreadhoofRenderer(EntityRendererProvider.Context pContext){
        super(pContext, new DreadhoofModel<>(pContext.bakeLayer(ModModelLayers.DREADHOOF_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DreadhoofEntity dreadhoofEntity) {
        return new ResourceLocation(ModHorror.MOD_ID, "textures/entity/dreadhoof.png");
    }

    @Override
    public void render(DreadhoofEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {



        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
