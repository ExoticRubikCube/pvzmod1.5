package com.hungteen.pvz.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class EntityBlockRender<T extends Entity> extends EntityRenderer<T> {

	public EntityBlockRender(EntityRendererProvider.Context context) {
		super(context);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void render(T entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.pushPose();
		matrixStackIn.scale(-1, -1, 1);
		float f = getScaleByEntity(entityIn);
		matrixStackIn.scale(f, f, f);
		matrixStackIn.translate(0.0, -1.501, 0.0);
//		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(entityIn.ticksExisted * 15));
//		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) + 180.0F));
		matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
        Minecraft.getInstance().getBlockRenderer().renderSingleBlock(getBlockByEntity(entityIn), matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
        matrixStackIn.popPose();
	}
	
	public abstract float getScaleByEntity(T entity);
	
	public abstract BlockState getBlockByEntity(T entity);

	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return null;
	}

}