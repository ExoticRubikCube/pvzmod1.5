package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.client.model.entity.misc.LawnMowerModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.LawnMowerEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import com.mojang.math.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LawnMowerRender extends PVZEntityRender<LawnMowerEntity> {

	public LawnMowerRender(EntityRendererProvider.Context context) {
		super(context, new LawnMowerModel(context.bakeLayer(LawnMowerModel.LAYER)));
	}

	@Override
	public void render(LawnMowerEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180.0F - entityYaw));
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.popPose();
	}
	
	@Override
	protected float getScaleByEntity(LawnMowerEntity entity) {
		return 0.9F;
	}

	@Override
	public ResourceLocation getTextureLocation(LawnMowerEntity entity) {
		return StringUtil.prefix("textures/entity/misc/lawn_mower.png");
	}

}