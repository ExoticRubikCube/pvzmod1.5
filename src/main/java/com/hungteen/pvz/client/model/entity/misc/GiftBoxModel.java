package com.hungteen.pvz.client.model.entity.misc;// Made with Blockbench 4.1.3

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.GiftBoxEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class GiftBoxModel extends EntityModel<GiftBoxEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "gift_box"), "main");

	private final ModelPart total;
	private final ModelPart cover_r1;
	private final ModelPart tape1_r1;
	private final ModelPart tape2_r1;
	private final ModelPart tapehang1_r1;




public GiftBoxModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cover_r1 = this.total.getChild("cover_r1");
		this.tape1_r1 = this.total.getChild("tape1_r1");
		this.tape2_r1 = this.total.getChild("tape2_r1");
		this.tapehang1_r1 = this.total.getChild("tapehang1_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cover_r1_pd = total_pd.addOrReplaceChild("cover_r1",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-4.0F, -7.5F, -4.3F, 9.0F, 2.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, -0.0873F, -0.0873F));
		PartDefinition tape1_r1_pd = total_pd.addOrReplaceChild("tape1_r1",
			CubeListBuilder.create()
				.texOffs(0, 27).addBox(-1.0F, 0.4F, 0.0F, 2.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tape2_r1_pd = total_pd.addOrReplaceChild("tape2_r1",
			CubeListBuilder.create()
				.texOffs(12, 27).addBox(-0.5F, -1.4F, -3.3F, 2.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition tapehang1_r1_pd = total_pd.addOrReplaceChild("tapehang1_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.7F, -7.1F, -0.6F, 1.0F, 5.0F, 2.0F)
				.texOffs(0, 0).addBox(3.5F, -6.0F, -1.5F, 1.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0873F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GiftBoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}