package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.client.model.entity.zombie.pool.DuckyTubeModel;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.Mob;
import net.minecraft.resources.ResourceLocation;

public class DuckyTubeLayer<T extends Mob> extends RenderLayer<T, EntityModel<T>>{

	public static final ResourceLocation TEXTURE = StringUtil.prefix("textures/entity/zombie/pool/ducky_tube.png");
	private DuckyTubeModel model;
	
	public DuckyTubeLayer(RenderLayerParent<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
		this.model = new DuckyTubeModel(Minecraft.getInstance().getEntityModels().bakeLayer(DuckyTubeModel.LAYER));
	}

	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn,
			T zombie, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if(! zombie.isInWater() || zombie.isInvisible()) {
			return ;
		}
		matrixStackIn.pushPose();
		VertexConsumer builder = bufferIn.getBuffer(RenderType.entitySolid(TEXTURE));
		matrixStackIn.translate(0, -1.3f, 0);
		this.model.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
	}
	
}