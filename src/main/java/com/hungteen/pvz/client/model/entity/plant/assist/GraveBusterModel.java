package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.GraveBusterEntity;
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
public class GraveBusterModel extends PVZPlantModel<GraveBusterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "grave_buster"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart mouse;
	private final ModelPart front;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart m1;
	private final ModelPart m2;
	private final ModelPart back;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart m5;
	private final ModelPart m6;
	private final ModelPart left;
	private final ModelPart bone9;
	private final ModelPart m4;
	private final ModelPart m3;
	private final ModelPart bone12;
	private final ModelPart right;
	private final ModelPart bone13;
	private final ModelPart m7;
	private final ModelPart m8;
	private final ModelPart bone16;
	private final ModelPart head;
	private final ModelPart right_wine;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart left_wine;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart back_wine;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart front_wine;
	private final ModelPart bone24;
	private final ModelPart bone23;
	private final ModelPart bone28;
	private final ModelPart bone27;
	private final ModelPart bone33;
	private final ModelPart bone34;
	private final ModelPart bone35;
	private final ModelPart bone36;




public GraveBusterModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = root.getChild("body");
		this.mouse = root.getChild("mouse");
		this.front = root.getChild("front");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.m1 = root.getChild("m1");
		this.m2 = root.getChild("m2");
		this.back = root.getChild("back");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.m5 = root.getChild("m5");
		this.m6 = root.getChild("m6");
		this.left = root.getChild("left");
		this.bone9 = root.getChild("bone9");
		this.m4 = root.getChild("m4");
		this.m3 = root.getChild("m3");
		this.bone12 = root.getChild("bone12");
		this.right = root.getChild("right");
		this.bone13 = root.getChild("bone13");
		this.m7 = root.getChild("m7");
		this.m8 = root.getChild("m8");
		this.bone16 = root.getChild("bone16");
		this.head = root.getChild("head");
		this.right_wine = root.getChild("right_wine");
		this.bone17 = root.getChild("bone17");
		this.bone18 = root.getChild("bone18");
		this.bone19 = root.getChild("bone19");
		this.bone20 = root.getChild("bone20");
		this.left_wine = root.getChild("left_wine");
		this.bone25 = root.getChild("bone25");
		this.bone26 = root.getChild("bone26");
		this.bone31 = root.getChild("bone31");
		this.bone32 = root.getChild("bone32");
		this.back_wine = root.getChild("back_wine");
		this.bone21 = root.getChild("bone21");
		this.bone22 = root.getChild("bone22");
		this.bone29 = root.getChild("bone29");
		this.bone30 = root.getChild("bone30");
		this.front_wine = root.getChild("front_wine");
		this.bone24 = root.getChild("bone24");
		this.bone23 = root.getChild("bone23");
		this.bone28 = root.getChild("bone28");
		this.bone27 = root.getChild("bone27");
		this.bone33 = root.getChild("bone33");
		this.bone34 = root.getChild("bone34");
		this.bone35 = root.getChild("bone35");
		this.bone36 = root.getChild("bone36");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(1, 99).addBox(-8.0F, -32.0F, -6.0F, 16.0F, 16.0F, 12.0F)
				.texOffs(59, 110).addBox(-7.0F, -32.0F, -7.0F, 14.0F, 16.0F, 1.0F)
				.texOffs(92, 110).addBox(-6.0F, -32.0F, 7.0F, 12.0F, 16.0F, 1.0F)
				.texOffs(97, 91).addBox(-7.0F, -32.0F, 6.0F, 14.0F, 16.0F, 1.0F)
				.texOffs(69, 91).addBox(-6.0F, -32.0F, -8.0F, 12.0F, 16.0F, 1.0F),
			PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition mouse_pd = total_pd.addOrReplaceChild("mouse",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition front_pd = mouse_pd.addOrReplaceChild("front",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -16.0F, -7.0F));
		PartDefinition bone_pd = front_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(58, 97).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition bone2_pd = front_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(48, 99).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition m1_pd = front_pd.addOrReplaceChild("m1",
			CubeListBuilder.create()
				.texOffs(54, 84).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition m2_pd = front_pd.addOrReplaceChild("m2",
			CubeListBuilder.create()
				.texOffs(40, 84).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition back_pd = mouse_pd.addOrReplaceChild("back",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -16.0F, 7.0F));
		PartDefinition bone5_pd = back_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(29, 85).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition bone6_pd = back_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(18, 84).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition m5_pd = back_pd.addOrReplaceChild("m5",
			CubeListBuilder.create()
				.texOffs(3, 83).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition m6_pd = back_pd.addOrReplaceChild("m6",
			CubeListBuilder.create()
				.texOffs(115, 77).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left_pd = mouse_pd.addOrReplaceChild("left",
			CubeListBuilder.create(),
			PartPose.offset(-7.0F, -16.0F, 0.0F));
		PartDefinition bone9_pd = left_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(104, 77).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition m4_pd = left_pd.addOrReplaceChild("m4",
			CubeListBuilder.create()
				.texOffs(89, 76).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition m3_pd = left_pd.addOrReplaceChild("m3",
			CubeListBuilder.create()
				.texOffs(74, 76).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone12_pd = left_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(118, 65).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition right_pd = mouse_pd.addOrReplaceChild("right",
			CubeListBuilder.create(),
			PartPose.offset(7.0F, -16.0F, 0.0F));
		PartDefinition bone13_pd = right_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(107, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition m7_pd = right_pd.addOrReplaceChild("m7",
			CubeListBuilder.create()
				.texOffs(92, 62).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition m8_pd = right_pd.addOrReplaceChild("m8",
			CubeListBuilder.create()
				.texOffs(77, 62).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone16_pd = right_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(64, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(73, 49).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(84, 43).addBox(-6.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(63, 50).addBox(-6.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(56, 48).addBox(5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(48, 48).addBox(5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition right_wine_pd = head_pd.addOrReplaceChild("right_wine",
			CubeListBuilder.create()
				.texOffs(30, 74).addBox(-2.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition bone17_pd = right_wine_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(46, 73).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.0F, 0.0F, 5.0F, -0.5236F, 1.0472F, 0.0F));
		PartDefinition bone18_pd = right_wine_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(99, 38).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.5236F, -1.0472F, 0.0F));
		PartDefinition bone19_pd = right_wine_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(15, 76).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, -0.5236F, -0.2618F, 0.0F));
		PartDefinition bone20_pd = right_wine_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(3, 74).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-1.0F, -1.0F, 2.0F, 0.5236F, 0.2618F, 0.0F));
		PartDefinition left_wine_pd = head_pd.addOrReplaceChild("left_wine",
			CubeListBuilder.create()
				.texOffs(26, 64).addBox(1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition bone25_pd = left_wine_pd.addOrReplaceChild("bone25",
			CubeListBuilder.create()
				.texOffs(61, 57).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.5236F, 1.0472F, 0.0F));
		PartDefinition bone26_pd = left_wine_pd.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(43, 64).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, -0.5236F, -1.0472F, 0.0F));
		PartDefinition bone31_pd = left_wine_pd.addOrReplaceChild("bone31",
			CubeListBuilder.create()
				.texOffs(12, 68).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, -0.5236F, 0.2618F, 0.0F));
		PartDefinition bone32_pd = left_wine_pd.addOrReplaceChild("bone32",
			CubeListBuilder.create()
				.texOffs(3, 62).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, 2.0F, 0.5236F, -0.2618F, 0.0F));
		PartDefinition back_wine_pd = head_pd.addOrReplaceChild("back_wine",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone21_pd = back_wine_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(123, 53).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(-5.0F, 1.0F, -1.0F, -0.2618F, 0.0F, 1.0472F));
		PartDefinition bone22_pd = back_wine_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(116, 54).addBox(0.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, 1.0F, -1.0F, -0.2618F, 0.0F, -1.0472F));
		PartDefinition bone29_pd = back_wine_pd.addOrReplaceChild("bone29",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone30_pd = bone29_pd.addOrReplaceChild("bone30",
			CubeListBuilder.create()
				.texOffs(105, 58).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition front_wine_pd = head_pd.addOrReplaceChild("front_wine",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone24_pd = front_wine_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(123, 43).addBox(0.0F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, 1.0F, 1.0F, 0.2618F, 0.0F, -1.0472F));
		PartDefinition bone23_pd = front_wine_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(116, 43).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(-5.0F, 1.0F, 1.0F, 0.2618F, 0.0F, 1.0472F));
		PartDefinition bone28_pd = front_wine_pd.addOrReplaceChild("bone28",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone27_pd = bone28_pd.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(104, 50).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone33_pd = head_pd.addOrReplaceChild("bone33",
			CubeListBuilder.create()
				.texOffs(83, 50).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 4.0F, -0.2618F, -0.7854F, 0.0F));
		PartDefinition bone34_pd = head_pd.addOrReplaceChild("bone34",
			CubeListBuilder.create()
				.texOffs(40, 52).addBox(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, 4.0F, -0.2618F, 0.7854F, 0.0F));
		PartDefinition bone35_pd = head_pd.addOrReplaceChild("bone35",
			CubeListBuilder.create()
				.texOffs(19, 51).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, -4.0F, 0.2618F, 0.7854F, 0.0F));
		PartDefinition bone36_pd = head_pd.addOrReplaceChild("bone36",
			CubeListBuilder.create()
				.texOffs(3, 45).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, -4.0F, 0.2618F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(GraveBusterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final float angle = 0.15f;
		if(entity.isEatingTomb()) {
			int x = entity.getAttackTime();
			final int times = 7;
			float T = entity.getEatTombCD() * 1.0f / times;
			double w = 2 * Math.PI / T;
			this.m1.xRot = (float) - Math.cos(w * x) * angle;
			this.m2.xRot = (float) Math.cos(w * x) * angle;
			this.m3.zRot = (float) Math.cos(w * x) * angle;
			this.m4.zRot = (float) - Math.cos(w * x) * angle;
			this.m5.xRot = (float) Math.cos(w * x) * angle;
			this.m6.xRot = (float) - Math.cos(w * x) * angle;
			this.m7.zRot = (float) - Math.cos(w * x) * angle;
			this.m8.zRot = (float) Math.cos(w * x) * angle;
		}else {
			this.m1.xRot = -angle;
			this.m2.xRot = angle;
			this.m3.zRot = angle;
			this.m4.zRot = -angle;
			this.m5.xRot = angle;
			this.m6.xRot = -angle;
			this.m7.zRot = -angle;
			this.m8.zRot = angle;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GraveBusterEntity> getPlantModel() {
		return this;
	}
}