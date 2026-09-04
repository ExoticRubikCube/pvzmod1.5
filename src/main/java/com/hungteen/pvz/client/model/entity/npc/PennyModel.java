package com.hungteen.pvz.client.model.entity.npc;

import com.hungteen.pvz.common.entity.npc.PennyEntity;
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
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class PennyModel extends EntityModel<PennyEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "panney"), "main");

	private final ModelPart car;
	private final ModelPart head;
	private final ModelPart bone10;
	private final ModelPart bone;
	private final ModelPart light;
	private final ModelPart bone9;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart body;
	private final ModelPart top;
	private final ModelPart tail;
	private final ModelPart tyres;
	private final ModelPart tyre_1;
	private final ModelPart bone14;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart tyre_2;
	private final ModelPart bone8;
	private final ModelPart bone11;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart tyre_3;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart tyre_4;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart bone33;




public PennyModel(ModelPart root) {
		this.car = root.getChild("car");
		this.head = root.getChild("head");
		this.bone10 = root.getChild("bone10");
		this.bone = root.getChild("bone");
		this.light = root.getChild("light");
		this.bone9 = root.getChild("bone9");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone6 = root.getChild("bone6");
		this.bone5 = root.getChild("bone5");
		this.body = root.getChild("body");
		this.top = root.getChild("top");
		this.tail = root.getChild("tail");
		this.tyres = root.getChild("tyres");
		this.tyre_1 = root.getChild("tyre_1");
		this.bone14 = root.getChild("bone14");
		this.bone12 = root.getChild("bone12");
		this.bone13 = root.getChild("bone13");
		this.bone15 = root.getChild("bone15");
		this.bone16 = root.getChild("bone16");
		this.bone17 = root.getChild("bone17");
		this.tyre_2 = root.getChild("tyre_2");
		this.bone8 = root.getChild("bone8");
		this.bone11 = root.getChild("bone11");
		this.bone18 = root.getChild("bone18");
		this.bone19 = root.getChild("bone19");
		this.bone20 = root.getChild("bone20");
		this.bone21 = root.getChild("bone21");
		this.tyre_3 = root.getChild("tyre_3");
		this.bone22 = root.getChild("bone22");
		this.bone23 = root.getChild("bone23");
		this.bone24 = root.getChild("bone24");
		this.bone25 = root.getChild("bone25");
		this.bone26 = root.getChild("bone26");
		this.bone27 = root.getChild("bone27");
		this.tyre_4 = root.getChild("tyre_4");
		this.bone28 = root.getChild("bone28");
		this.bone29 = root.getChild("bone29");
		this.bone30 = root.getChild("bone30");
		this.bone31 = root.getChild("bone31");
		this.bone32 = root.getChild("bone32");
		this.bone33 = root.getChild("bone33");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition car_pd = partdefinition.addOrReplaceChild("car",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.5F, -21.0F, -10.0F, 15.0F, 18.0F, 32.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = car_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 50).addBox(-16.5F, 2.0F, -17.0F, 15.0F, 2.0F, 13.0F),
			PartPose.offset(9.0F, -7.0F, -6.0F));
		PartDefinition bone10_pd = head_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(45, 50).addBox(-16.5F, -27.0F, -14.0F, 15.0F, 5.0F, 5.0F),
			PartPose.offset(0.0F, 13.0F, 5.0F));
		PartDefinition bone_pd = bone10_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(60, 60).addBox(-15.5F, 4.6002F, -6.8003F, 15.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(-1.0F, -32.0F, -16.0F, 0.9275F, 0.0F, 0.0F));
		PartDefinition light_pd = bone10_pd.addOrReplaceChild("light",
			CubeListBuilder.create()
				.texOffs(34, 92).addBox(-11.0F, -27.5F, -1.5F, 4.0F, 1.0F, 4.0F)
				.texOffs(45, 60).addBox(-10.5F, -29.0F, -1.0F, 3.0F, 2.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition bone9_pd = head_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(36, 67).addBox(-13.5F, -10.0F, -8.0F, 9.0F, 11.0F, 0.0F),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bone2_pd = bone9_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(54, 62).addBox(-0.422F, 5.0F, 4.6991F, 0.0F, 11.0F, 5.0F),
			PartPose.offsetAndRotation(-7.0F, -15.0F, -12.0F, 0.0F, 0.6458F, 0.0F));
		PartDefinition bone3_pd = bone9_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 45).addBox(-2.7725F, 5.0F, 7.1063F, 0.0F, 11.0F, 5.0F),
			PartPose.offsetAndRotation(-7.0F, -15.0F, -12.0F, 0.0F, -0.6458F, 0.0F));
		PartDefinition bone4_pd = head_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-15.0F, -4.5F, -15.0F, 2.0F, 6.0F, 9.0F)
				.texOffs(62, 16).addBox(-5.5F, -4.5F, -15.0F, 2.0F, 6.0F, 9.0F)
				.texOffs(0, 0).addBox(-12.5F, -1.75F, -17.0F, 7.0F, 3.0F, 9.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone6_pd = bone4_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone5_pd = bone4_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(62, 0).addBox(-2.5F, 10.3111F, -9.708F, 7.0F, 1.0F, 10.0F),
			PartPose.offsetAndRotation(-10.0F, -15.0F, -12.0F, 0.3944F, 0.0F, 0.0F));
		PartDefinition body_pd = car_pd.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(9.0F, -7.0F, -6.0F));
		PartDefinition top_pd = body_pd.addOrReplaceChild("top",
			CubeListBuilder.create()
				.texOffs(62, 11).addBox(-15.5F, -35.0F, 50.0F, 13.0F, 1.0F, 4.0F)
				.texOffs(88, 77).addBox(-3.5F, -34.0F, 50.0F, 1.0F, 3.0F, 4.0F)
				.texOffs(90, 23).addBox(-15.5F, -34.0F, 50.0F, 1.0F, 3.0F, 4.0F),
			PartPose.offset(0.0F, 17.0F, -29.0F));
		PartDefinition tail_pd = car_pd.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-16.5F, -12.0F, 60.0F, 12.0F, 12.0F, 1.0F),
			PartPose.offset(10.0F, -5.0F, -38.0F));
		PartDefinition tyres_pd = car_pd.addOrReplaceChild("tyres",
			CubeListBuilder.create(),
			PartPose.offset(9.0F, 0.0F, 11.0F));
		PartDefinition tyre_1_pd = tyres_pd.addOrReplaceChild("tyre_1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, -29.0F));
		PartDefinition bone14_pd = tyre_1_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -10.0F, -68.0F));
		PartDefinition bone12_pd = bone14_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(24, 90).addBox(-2.5F, 6.0F, 68.0F, 2.0F, 4.0F, 3.0F)
				.texOffs(10, 90).addBox(-2.5F, 2.7574F, 68.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone13_pd = bone14_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(50, 89).addBox(-2.5F, -71.8787F, 14.8787F, 2.0F, 4.0F, 3.0F)
				.texOffs(60, 89).addBox(-2.5F, -75.1213F, 14.8787F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone15_pd = tyre_1_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -12.0F, -70.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone16_pd = bone15_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(0, 89).addBox(-2.5F, -45.012199F, 54.9828F, 2.0F, 4.0F, 3.0F)
				.texOffs(88, 67).addBox(-2.5F, -48.254799F, 54.9828F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone17_pd = bone15_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(83, 88).addBox(-2.5F, -58.861401F, -36.133499F, 2.0F, 4.0F, 3.0F)
				.texOffs(86, 0).addBox(-2.5F, -62.104099F, -36.133499F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_2_pd = tyres_pd.addOrReplaceChild("tyre_2",
			CubeListBuilder.create(),
			PartPose.offset(-15.0F, 0.0F, -29.0F));
		PartDefinition bone8_pd = tyre_2_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -10.0F, -68.0F));
		PartDefinition bone11_pd = bone8_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(17, 86).addBox(-2.5F, 6.0F, 68.0F, 2.0F, 4.0F, 3.0F)
				.texOffs(85, 50).addBox(-2.5F, 2.7574F, 68.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone18_pd = bone8_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(73, 85).addBox(-2.5F, -71.8787F, 14.8787F, 2.0F, 4.0F, 3.0F)
				.texOffs(43, 85).addBox(-2.5F, -75.1213F, 14.8787F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone19_pd = tyre_2_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -12.0F, -70.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone20_pd = bone19_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(33, 85).addBox(-2.5F, -45.012199F, 54.9828F, 2.0F, 4.0F, 3.0F)
				.texOffs(84, 20).addBox(-2.5F, -48.254799F, 54.9828F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone21_pd = bone19_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(63, 82).addBox(-2.5F, -58.861401F, -36.133499F, 2.0F, 4.0F, 3.0F)
				.texOffs(53, 82).addBox(-2.5F, -62.104099F, -36.133499F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_3_pd = tyres_pd.addOrReplaceChild("tyre_3",
			CubeListBuilder.create(),
			PartPose.offset(-15.0F, 0.0F, 0.0F));
		PartDefinition bone22_pd = tyre_3_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -10.0F, -68.0F));
		PartDefinition bone23_pd = bone22_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(10, 82).addBox(-2.5F, 6.0F, 68.0F, 2.0F, 4.0F, 3.0F)
				.texOffs(0, 82).addBox(-2.5F, 2.7574F, 68.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone24_pd = bone22_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(81, 74).addBox(-2.5F, -71.8787F, 14.8787F, 2.0F, 4.0F, 3.0F)
				.texOffs(81, 81).addBox(-2.5F, -75.1213F, 14.8787F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone25_pd = tyre_3_pd.addOrReplaceChild("bone25",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -12.0F, -70.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone26_pd = bone25_pd.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(78, 67).addBox(-2.5F, -45.012199F, 54.9828F, 2.0F, 4.0F, 3.0F)
				.texOffs(71, 78).addBox(-2.5F, -48.254799F, 54.9828F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone27_pd = bone25_pd.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(46, 78).addBox(-2.5F, -58.861401F, -36.133499F, 2.0F, 4.0F, 3.0F)
				.texOffs(36, 78).addBox(-2.5F, -62.104099F, -36.133499F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_4_pd = tyres_pd.addOrReplaceChild("tyre_4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone28_pd = tyre_4_pd.addOrReplaceChild("bone28",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -10.0F, -68.0F));
		PartDefinition bone29_pd = bone28_pd.addOrReplaceChild("bone29",
			CubeListBuilder.create()
				.texOffs(75, 16).addBox(-2.5F, 6.0F, 68.0F, 2.0F, 4.0F, 3.0F)
				.texOffs(61, 75).addBox(-2.5F, 2.7574F, 68.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone30_pd = bone28_pd.addOrReplaceChild("bone30",
			CubeListBuilder.create()
				.texOffs(71, 71).addBox(-2.5F, -71.8787F, 14.8787F, 2.0F, 4.0F, 3.0F)
				.texOffs(64, 67).addBox(-2.5F, -75.1213F, 14.8787F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone31_pd = tyre_4_pd.addOrReplaceChild("bone31",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -12.0F, -70.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone32_pd = bone31_pd.addOrReplaceChild("bone32",
			CubeListBuilder.create()
				.texOffs(62, 0).addBox(-2.5F, -45.012199F, 54.9828F, 2.0F, 4.0F, 3.0F)
				.texOffs(20, 25).addBox(-2.5F, -48.254799F, 54.9828F, 2.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone33_pd = bone31_pd.addOrReplaceChild("bone33",
			CubeListBuilder.create()
				.texOffs(10, 25).addBox(-2.5F, -58.861401F, -36.133499F, 2.0F, 4.0F, 3.0F)
				.texOffs(0, 25).addBox(-2.5F, -62.104099F, -36.133499F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(PennyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		car.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}