package com.hungteen.pvz.client.render.layer.component;

import com.hungteen.pvz.client.model.entity.ComponentModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

/**
 * @program: pvzmod-1.16.5
 * @author: HungTeen
 * @create: 2022-03-02 17:20
 **/
public abstract class ComponentLayer<T extends Entity> extends RenderLayer<T, EntityModel<T>> {

    private final ComponentModel model;

    public ComponentLayer(RenderLayerParent<T, EntityModel<T>> entityRendererIn, ComponentModel model) {
        super(entityRendererIn);
        this.model = model;
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn,
                       T entity, float limbSwing, float limbSwingAmount, float partialTicks,
                       float ageInTicks, float netHeadYaw, float headPitch) {
        if(this.canRender(entity)){
            matrixStackIn.pushPose();
            VertexConsumer builder = bufferIn.getBuffer(RenderType.entityCutoutNoCull(this.getRenderTexture(entity)));
            this.model.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
            matrixStackIn.popPose();
        }
    }

    public boolean canRender(T entity){
        return true;
    }

    public abstract ResourceLocation getRenderTexture(T entity);

}