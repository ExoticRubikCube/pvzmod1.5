package com.hungteen.pvz.mixin.client;

import com.hungteen.pvz.common.entity.misc.drop.FallenStar;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.item.ItemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntityRenderer.class)
public class ItemEntityRendererMixin {

	private static final ResourceLocation LOCATION = StringUtil.prefix("textures/entity/fallen_star/fallen_star.png");
	private static final RenderType RENDER_TYPE = RenderType.itemEntityTranslucentCull(LOCATION);

	@Inject(method = "render(Lnet/minecraft/world/entity/item/ItemEntity;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V",
			at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;translate(DDD)V", ordinal = 0, shift = At.Shift.AFTER))
	private void pvz$renderFallenStarGlow(ItemEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource bufferSource, int packedLight, CallbackInfo ci) {
		if (entity instanceof FallenStar) {
			stack.pushPose();
			stack.mulPose(Minecraft.getInstance().getEntityRenderDispatcher().cameraOrientation());
			stack.mulPose(Vector3f.YP.rotationDegrees(180.0F));
			final float x = 0.5F;
			final float y = 0.5F;
			final float tick = ((float) entity.tickCount + partialTicks) / 20.0F + 0.79F;
			final int alpha = 159 - (int) ((Math.sin((float) ((entity.tickCount + 5) / 3.183))) * 96);
			final float size = 0.4F * ((float) (Minecraft.getInstance().player == null ? 1 : Math.max(1, 0.8 * Math.log10(entity.distanceToSqr(Minecraft.getInstance().player)))));
			stack.scale(size, size, size);
			final VertexConsumer vertexconsumer = bufferSource.getBuffer(RENDER_TYPE);
			final PoseStack.Pose pose = stack.last();
			final Matrix4f matrix4f = pose.pose();
			final Matrix3f matrix3f = pose.normal();
			vertex(vertexconsumer, matrix4f, matrix3f, -1F, -1.0F, 255, 255, 255, x + 35F * Math.cos(tick) / 64, y + 35F * Math.sin(tick) / 64, packedLight, alpha);
			vertex(vertexconsumer, matrix4f, matrix3f, 1F, -1.0F, 255, 255, 255, x + 35F * Math.cos(tick + 1.57F) / 64, y + 35F * Math.sin(tick + 1.57F) / 64, packedLight, alpha);
			vertex(vertexconsumer, matrix4f, matrix3f, 1F, 1.0F, 255, 255, 255, x - 35F * Math.cos(tick) / 64, y - 35F * Math.sin(tick) / 64, packedLight, alpha);
			vertex(vertexconsumer, matrix4f, matrix3f, -1F, 1.0F, 255, 255, 255, x - 35F * Math.cos(tick + 1.57F) / 64, y - 35F * Math.sin(tick + 1.57F) / 64, packedLight, alpha);
			stack.popPose();
		}
	}

	private static void vertex(VertexConsumer consumer, Matrix4f matrix4f, Matrix3f matrix3f, float x, float y, int red, int green, int blue, double u, double v, int packedLight, int alpha) {
		consumer.vertex(matrix4f, x, y + 0.5F, 0.0F).color(red, green, blue, alpha).uv((float) u, (float) v).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(packedLight).normal(matrix3f, 0.0F, 1.0F, 0.0F).endVertex();
	}
}