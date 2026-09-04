package com.hungteen.pvz.client.render.entity.effects;

import com.hungteen.pvz.client.model.entity.plant.explosion.DoomShroomModel;
import com.hungteen.pvz.common.entity.misc.DoomFixerEntity;
import com.hungteen.pvz.common.entity.plant.explosion.DoomShroomEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DoomFixerRender extends EntityRenderer<DoomFixerEntity>{

	private static final ResourceLocation TEX = StringUtil.prefix("textures/entity/layer/doom.png");
	protected final EntityModel<DoomShroomEntity> model;
	
	public DoomFixerRender(EntityRendererProvider.Context context) {
		super(context);
		this.model = new DoomShroomModel(context.bakeLayer(DoomShroomModel.LAYER));
	}

	@Override
	public void render(DoomFixerEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.pushPose();
		matrixStackIn.scale(-1, -1, 1);
		final float maxScale = 30;
		final float sz = Math.min(maxScale, entityIn.getExistTick() * 1.5F);
		matrixStackIn.scale(sz, sz, sz);
		matrixStackIn.translate(0.0, -1.501, 0.0);
        float f = (float)entityIn.tickCount + partialTicks;
        VertexConsumer ivertexbuilder = bufferIn.getBuffer(RenderType.energySwirl(this.getTextureLocation(entityIn), f, f));
		model.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 0.5F, 0.5F, 0.5F, 1.0F);
		matrixStackIn.popPose();
	}

	@Override
	public ResourceLocation getTextureLocation(DoomFixerEntity entity) {
		return TEX;
	}

}