package com.hungteen.pvz.client.model.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.TargetArrowEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.EntityModel;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class TargetArrowModel extends EntityModel<TargetArrowEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "target_arrow"), "main");

	private final ModelPart total;
	private final ModelPart cube_r1;
	private final ModelPart bone;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;




public TargetArrowModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cube_r1 = root.getChild("cube_r1");
		this.bone = root.getChild("bone");
		this.cube_r2 = root.getChild("cube_r2");
		this.cube_r3 = root.getChild("cube_r3");
		this.cube_r4 = root.getChild("cube_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 1).addBox(-0.5F, -4.5F, -2.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 8).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 8.0F, 0.0F),
			PartPose.offset(0.0F, 24.0F, -1.0F));
		PartDefinition cube_r1_pd = total_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(12, 0).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone_pd = total_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(10, 3).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -4.0F, 3.25F));
		PartDefinition cube_r2_pd = bone_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(10, 3).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r3_pd = bone_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(10, 3).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r4_pd = bone_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(10, 4).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}


	@Override
	public void setupAnim(TargetArrowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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