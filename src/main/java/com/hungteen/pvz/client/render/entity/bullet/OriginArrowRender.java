package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.OriginArrowEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OriginArrowRender extends ArrowRenderer<OriginArrowEntity> {

    private static final ResourceLocation ORIGIN_ARROW = StringUtil.prefix("textures/entity/projectiles/origin_arrow.png");
    private static final ResourceLocation ENERGY_LAYER = StringUtil.prefix("textures/entity/layer/energy_armor.png");

    public OriginArrowRender(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(OriginArrowEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
        if (entity.isEnergyArrow()) {
            this.renderEnergyLayer(entity, partialTicks, poseStack, buffer, packedLight);
        }
    }

    private void renderEnergyLayer(OriginArrowEntity entity, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        final float f = (float) entity.tickCount + partialTicks;
        poseStack.pushPose();
        poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entity.yRotO, entity.getYRot()) - 90.0F));
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entity.xRotO, entity.getXRot())));
        final float shake = (float) entity.shakeTime - partialTicks;
        if (shake > 0.0F) {
            poseStack.mulPose(Vector3f.ZP.rotationDegrees(-Mth.sin(shake * 3.0F) * shake));
        }
        poseStack.mulPose(Vector3f.XP.rotationDegrees(45.0F));
        poseStack.scale(0.05625F, 0.05625F, 0.05625F);
        poseStack.translate(-4.0F, 0.0F, 0.0F);
        poseStack.scale(1.1F, 1.1F, 1.1F);
        VertexConsumer vertexconsumer = buffer.getBuffer(RenderType.energySwirl(ENERGY_LAYER, 0.01F * f, 0.01F * f));
        PoseStack.Pose pose = poseStack.last();
        Matrix4f matrix4f = pose.pose();
        Matrix3f matrix3f = pose.normal();
        vertexconsumer.vertex(matrix4f, -7.0F, -2.0F, -2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, -1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, -2.0F, 2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.15625F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, -1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, 2.0F, 2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.15625F, 0.3125F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, -1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, 2.0F, -2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.3125F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, -1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, 2.0F, -2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, 2.0F, 2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.15625F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, -2.0F, 2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.15625F, 0.3125F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 1.0F, 0.0F, 0.0F).endVertex();
        vertexconsumer.vertex(matrix4f, -7.0F, -2.0F, -2.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.3125F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 1.0F, 0.0F, 0.0F).endVertex();

        for (int i = 0; i < 4; ++i) {
            poseStack.mulPose(Vector3f.XP.rotationDegrees(90.0F));
            vertexconsumer.vertex(matrix4f, -8.0F, -2.0F, 0.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.0F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 0.0F, 0.0F, 1.0F).endVertex();
            vertexconsumer.vertex(matrix4f, 8.0F, -2.0F, 0.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.5F, 0.0F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 0.0F, 0.0F, 1.0F).endVertex();
            vertexconsumer.vertex(matrix4f, 8.0F, 2.0F, 0.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.5F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 0.0F, 0.0F, 1.0F).endVertex();
            vertexconsumer.vertex(matrix4f, -8.0F, 2.0F, 0.0F).color(0.5F, 0.5F, 0.5F, 1.0F).uv(0.0F, 0.15625F).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 0.0F, 0.0F, 1.0F).endVertex();
        }

        poseStack.popPose();
    }

    @Override
    public ResourceLocation getTextureLocation(OriginArrowEntity entity) {
        return ORIGIN_ARROW;
    }
}
