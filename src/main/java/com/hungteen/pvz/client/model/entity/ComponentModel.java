package com.hungteen.pvz.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

/**
 * @program: pvzmod-1.16.5
 * @author: HungTeen
 * @create: 2022-03-02 17:16
 **/
public abstract class ComponentModel<T extends Entity> extends PVZEntityModel<T>{


    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
    }

    @Override
    public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
    }

    public void render(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay){
        this.getTotalModel().render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public abstract ModelPart getTotalModel();

}