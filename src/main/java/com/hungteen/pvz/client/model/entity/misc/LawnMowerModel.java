package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.common.entity.misc.LawnMowerEntity;
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
public class LawnMowerModel extends EntityModel<LawnMowerEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "lawn_mower"), "main");

	private final ModelPart total;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart bone3;
	private final ModelPart cube_r4;
	private final ModelPart Thing;
	private final ModelPart Wheel;
	private final ModelPart wheel1;
	private final ModelPart wheel2;
	private final ModelPart wheel3;
	private final ModelPart wheel4;
	private final ModelPart Handle;
	private final ModelPart cube_r5;
	private final ModelPart Wire;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart bone2;
	private final ModelPart Cuter;
	private final ModelPart cube_r9;




public LawnMowerModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cube_r1 = root.getChild("cube_r1");
		this.cube_r2 = root.getChild("cube_r2");
		this.cube_r3 = root.getChild("cube_r3");
		this.bone3 = root.getChild("bone3");
		this.cube_r4 = root.getChild("cube_r4");
		this.Thing = root.getChild("Thing");
		this.Wheel = root.getChild("Wheel");
		this.wheel1 = root.getChild("wheel1");
		this.wheel2 = root.getChild("wheel2");
		this.wheel3 = root.getChild("wheel3");
		this.wheel4 = root.getChild("wheel4");
		this.Handle = root.getChild("Handle");
		this.cube_r5 = root.getChild("cube_r5");
		this.Wire = root.getChild("Wire");
		this.cube_r6 = root.getChild("cube_r6");
		this.cube_r7 = root.getChild("cube_r7");
		this.cube_r8 = root.getChild("cube_r8");
		this.bone2 = root.getChild("bone2");
		this.Cuter = root.getChild("Cuter");
		this.cube_r9 = root.getChild("cube_r9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-5.0F, -6.0F, -8.0F, 10.0F, 5.0F, 16.0F)
				.texOffs(0, 0).addBox(-5.0F, -6.0F, -9.0F, 10.0F, 5.0F, 18.0F, new CubeDeformation(-0.2F))
				.texOffs(45, 45).addBox(-5.0F, -6.0F, -9.5F, 10.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(38, 0).addBox(-3.5F, -7.8F, -3.0F, 7.0F, 2.0F, 8.0F)
				.texOffs(36, 23).addBox(-3.5F, -8.7F, -3.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(-0.2F))
				.texOffs(38, 10).addBox(-3.0F, -9.8F, -2.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 44).addBox(-3.5F, -10.8F, -2.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.3F))
				.texOffs(26, 52).addBox(-6.0F, -2.8F, -0.5F, 12.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1_pd = total_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(10, 16).addBox(-1.5F, -1.5F, 1.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(0, 8).addBox(-1.5F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)),
			PartPose.offsetAndRotation(-2.0F, -11.0F, 8.0F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = total_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(36, 36).addBox(-1.0F, -0.5F, -1.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-5.0F, -2.0F, 2.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r3_pd = total_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(50, 42).addBox(-1.0F, -0.5F, -1.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-5.0F, -2.0F, -1.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone3_pd = total_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 26).addBox(0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 11).addBox(0.5F, -0.8F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(8, 4).addBox(-0.5F, -0.8F, 1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F))
				.texOffs(8, 8).addBox(-1.0F, -0.8F, 1.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.18F)),
			PartPose.offset(-5.0F, -6.0F, 1.0F));
		PartDefinition cube_r4_pd = bone3_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-3.0F, -0.8F, 1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.28F)),
			PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Thing_pd = total_pd.addOrReplaceChild("Thing",
			CubeListBuilder.create()
				.texOffs(52, 52).addBox(-6.5F, -2.5F, 6.0F, 13.0F, 1.0F, 1.0F)
				.texOffs(36, 34).addBox(-6.5F, -2.5F, -7.0F, 13.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Wheel_pd = Thing_pd.addOrReplaceChild("Wheel",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wheel1_pd = Wheel_pd.addOrReplaceChild("wheel1",
			CubeListBuilder.create()
				.texOffs(31, 55).addBox(-0.3F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F)
				.texOffs(49, 54).addBox(-0.3F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F),
			PartPose.offset(-6.0F, -2.0F, -6.5F));
		PartDefinition wheel2_pd = Wheel_pd.addOrReplaceChild("wheel2",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-0.8F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F)
				.texOffs(38, 0).addBox(-0.8F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F),
			PartPose.offset(6.0F, -2.0F, -6.5F));
		PartDefinition wheel3_pd = Wheel_pd.addOrReplaceChild("wheel3",
			CubeListBuilder.create()
				.texOffs(0, 55).addBox(-0.3F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F)
				.texOffs(39, 55).addBox(-0.3F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F),
			PartPose.offset(-6.0F, -2.0F, 6.5F));
		PartDefinition wheel4_pd = Wheel_pd.addOrReplaceChild("wheel4",
			CubeListBuilder.create()
				.texOffs(15, 53).addBox(-0.8F, -2.0F, -2.5F, 1.0F, 4.0F, 5.0F)
				.texOffs(36, 23).addBox(-0.8F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F),
			PartPose.offset(6.0F, -2.0F, 6.5F));
		PartDefinition Handle_pd = total_pd.addOrReplaceChild("Handle",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5_pd = Handle_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(52, 39).addBox(-9.5F, -11.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 0).addBox(-1.5F, -11.0F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 0).addBox(-9.5F, -11.0F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 53).addBox(-9.5F, -6.0F, 0.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(5.0F, -6.0F, 7.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition Wire_pd = total_pd.addOrReplaceChild("Wire",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6_pd = Wire_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(8, 0).addBox(-1.0F, -3.0F, -0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.0F, -9.0F, 7.0F, 2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r7_pd = Wire_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(12, 27).addBox(-1.0F, -3.7F, -0.01F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.0F, -11.0F, 9.0F, 2.4435F, 0.0F, 0.0F));
		PartDefinition cube_r8_pd = Wire_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(14, 14).addBox(-1.0F, -3.3F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.0F, -12.0F, 9.0F, 2.6616F, 0.0F, 0.0F));
		PartDefinition bone2_pd = total_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-3.5F, -2.3F, -4.0F, 7.0F, 2.0F, 1.0F)
				.texOffs(0, 32).addBox(-3.5F, -2.3F, 3.0F, 7.0F, 2.0F, 1.0F)
				.texOffs(21, 44).addBox(-3.0F, -1.8F, -3.0F, 6.0F, 1.0F, 6.0F)
				.texOffs(0, 8).addBox(-4.0F, -2.3F, -3.0F, 1.0F, 2.0F, 6.0F)
				.texOffs(0, 0).addBox(3.0F, -2.3F, -3.0F, 1.0F, 2.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Cuter_pd = bone2_pd.addOrReplaceChild("Cuter",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-0.5F, -2.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 3).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 10).addBox(-1.0F, -2.0F, -2.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(7, 55).addBox(-1.0F, -2.0F, 0.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(7, 23).addBox(-2.2F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(8, 10).addBox(0.2F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9_pd = Cuter_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(LawnMowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.isStartRun()) {
			float speed = 1F;
			this.wheel1.xRot = ageInTicks * speed;
			this.wheel2.xRot = ageInTicks * speed;
			this.wheel3.xRot = ageInTicks * speed;
			this.wheel4.xRot = ageInTicks * speed;
		} else {
			this.wheel1.xRot = 0;
			this.wheel2.xRot = 0;
			this.wheel3.xRot = 0;
			this.wheel4.xRot = 0;
		}
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