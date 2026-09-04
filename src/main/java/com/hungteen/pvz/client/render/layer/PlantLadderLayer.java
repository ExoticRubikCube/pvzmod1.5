package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.misc.LadderModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class PlantLadderLayer<T extends PVZPlantEntity> extends RenderLayer<T, EntityModel<T>>{

	private static final ResourceLocation LADDER_TEX = StringUtil.prefix("textures/entity/misc/ladder.png");;
	private PVZPlantRender<T> plantRender;
	private LadderModel<T> model;

	public PlantLadderLayer(RenderLayerParent<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
		this.model = new LadderModel<>(LadderModel.createBodyLayer().bakeRoot());
		if(entityRendererIn instanceof PVZPlantRender) {
			this.plantRender = (PVZPlantRender<T>) entityRendererIn;
		}
	}

	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, T plant,
			float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
			float headPitch) {
		if(! plant.hasMetal()) return ;
		matrixStackIn.pushPose();
		VertexConsumer builder = bufferIn.getBuffer(RenderType.entitySolid(LADDER_TEX));
		if(this.plantRender != null) {
			float scale = 0.6f;
			float plantScale = this.plantRender.getScaleByEntity(plant);
		    matrixStackIn.scale(scale / plantScale, scale / plantScale, scale / plantScale);
		    double offsetH = 1.501D;
		    matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(- 22.5F));
		    matrixStackIn.translate(0, plantScale / scale * offsetH - offsetH + 0.5, - 0.8F);
		} else {
			PVZMod.LOGGER.debug("ladder render wrong !");
		}
		this.model.render(matrixStackIn, builder, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
	}

}
