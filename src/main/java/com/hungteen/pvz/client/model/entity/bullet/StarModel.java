package com.hungteen.pvz.client.model.entity.bullet;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.bullet.StarEntity;
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

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class StarModel extends EntityModel<StarEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "star"), "main");

	private final ModelPart total;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;




public StarModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cube_r1 = this.total.getChild("cube_r1");
		this.cube_r2 = this.total.getChild("cube_r2");
		this.cube_r3 = this.total.getChild("cube_r3");
		this.cube_r4 = this.total.getChild("cube_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r1_pd = total_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r2_pd = total_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r3_pd = total_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r4_pd = total_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}


	@Override
	public void setupAnim(StarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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