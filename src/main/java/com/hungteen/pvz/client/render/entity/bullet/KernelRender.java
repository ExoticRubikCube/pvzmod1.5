package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.model.entity.bullet.KernelModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.bullet.KernelEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import com.mojang.math.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KernelRender extends PVZEntityRender<KernelEntity> {

	private static final ResourceLocation TEX = StringUtil.prefix("textures/entity/misc/kernel.png");
	
	public KernelRender(EntityRendererProvider.Context context) {
		super(context, new KernelModel(context.bakeLayer(KernelModel.LAYER)));
	}

	@Override
	public void render(KernelEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(entityIn.tickCount * 15));
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.popPose();
	}

	@Override
	protected float getScaleByEntity(KernelEntity entity) {
		return 1F;
	}

	@Override
	public ResourceLocation getTextureLocation(KernelEntity entity) {
		return TEX;
	}

}