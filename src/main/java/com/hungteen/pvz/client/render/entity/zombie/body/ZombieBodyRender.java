package com.hungteen.pvz.client.render.entity.zombie.body;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.types.IZombieType;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.body.ZombieDropBodyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import com.mojang.math.Vector3f;

public class ZombieBodyRender extends EntityRenderer<ZombieDropBodyEntity> {

	public ZombieBodyRender(EntityRendererProvider.Context context) {
		super(context);
	}
	
	@Override
	public void render(ZombieDropBodyEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		final IZombieType zombie = entityIn.getZombieType();
		final BodyType part = entityIn.getBodyType(); 
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) + 180.0F));
		if(part != BodyType.BODY) {
		    if(entityIn.isOnGround()) {
			    matrixStackIn.mulPose(Vector3f.XN.rotationDegrees(part == BodyType.HEAD ? entityIn.HEAD_ROT : 90));
		    } else {
			    matrixStackIn.mulPose(Vector3f.XN.rotationDegrees(- entityIn.tickCount * 15));
		    }
		}
		matrixStackIn.scale(-1, -1, 1);
	    final float sz = entityIn.isMini() ? zombie.getRenderScale() * PVZZombieRender.MINI_SCALE : zombie.getRenderScale();
	    matrixStackIn.scale(sz, sz, sz); 
		matrixStackIn.translate(0.0, (part != BodyType.BODY ? -1.501 : -1.7), 0.0);
		if(part != BodyType.BODY) {
			zombie.getZombieModel1().ifPresent(m -> {
			    final VertexConsumer ivertexbuilder = bufferIn.getBuffer(m.getZombieModel().renderType(zombie.getRenderResource()));
			    m.tickPartAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, 0, 0);
			    m.renderBody(entityIn, matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
			});
		} else {
			zombie.getZombieModel2().ifPresent(m -> {
		        final VertexConsumer ivertexbuilder = bufferIn.getBuffer(m.getZombieModel().renderType(zombie.getRenderResource()));
		        m.tickPartAnim(entityIn, 0, 0, entityIn.tickCount + partialTicks, 0, 0);
		        m.renderBody(entityIn, matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY);
		    });
		}
		matrixStackIn.popPose();
	}

	@Override
	public ResourceLocation getTextureLocation(ZombieDropBodyEntity p_110775_1_) {
		return null;//no use
	}
 
}