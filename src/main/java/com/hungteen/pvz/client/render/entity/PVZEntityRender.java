package com.hungteen.pvz.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class PVZEntityRender <T extends Entity> extends EntityRenderer<T> {

	protected EntityModel<T> model;
	
	public PVZEntityRender(EntityRendererProvider.Context context, EntityModel<T> m) {
		super(context);
		this.model = m;
	}

	protected abstract float getScaleByEntity(T entity);
	
	public Vec3 getTranslateVec(T entity) {
		return new Vec3(0, 0, 0);
	}
	
	@Override
	public void render(T entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.pushPose();
		matrixStackIn.scale(-1, -1, 1);
		final float f = getScaleByEntity(entityIn);
		matrixStackIn.scale(f, f, f);
		matrixStackIn.translate(0.0, -1.501, 0.0);
		final Vec3 vec = this.getTranslateVec(entityIn);
		matrixStackIn.translate(vec.x, vec.y, vec.z);
        VertexConsumer ivertexbuilder = bufferIn.getBuffer(this.model.renderType(this.getTextureLocation(entityIn)));
        this.model.setupAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, 0, 0);
        this.model.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.popPose();
	}
	
}