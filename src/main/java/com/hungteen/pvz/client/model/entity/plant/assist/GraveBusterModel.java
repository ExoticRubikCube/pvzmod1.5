package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.GraveBusterEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GraveBusterModel extends PVZPlantModel<GraveBusterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "grave_buster"), "main");
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
		this.body = this.total.getChild("body");
		this.mouse = this.total.getChild("mouse");
		this.front = this.mouse.getChild("front");
		this.bone = this.front.getChild("bone");
		this.bone2 = this.front.getChild("bone2");
		this.m1 = this.front.getChild("m1");
		this.m2 = this.front.getChild("m2");
		this.back = this.mouse.getChild("back");
		this.bone5 = this.back.getChild("bone5");
		this.bone6 = this.back.getChild("bone6");
		this.m5 = this.back.getChild("m5");
		this.m6 = this.back.getChild("m6");
		this.left = this.mouse.getChild("left");
		this.bone9 = this.left.getChild("bone9");
		this.m4 = this.left.getChild("m4");
		this.m3 = this.left.getChild("m3");
		this.bone12 = this.left.getChild("bone12");
		this.right = this.mouse.getChild("right");
		this.bone13 = this.right.getChild("bone13");
		this.m7 = this.right.getChild("m7");
		this.m8 = this.right.getChild("m8");
		this.bone16 = this.right.getChild("bone16");
		this.head = this.total.getChild("head");
		this.right_wine = this.head.getChild("right_wine");
		this.bone17 = this.right_wine.getChild("bone17");
		this.bone18 = this.right_wine.getChild("bone18");
		this.bone19 = this.right_wine.getChild("bone19");
		this.bone20 = this.right_wine.getChild("bone20");
		this.left_wine = this.head.getChild("left_wine");
		this.bone25 = this.left_wine.getChild("bone25");
		this.bone26 = this.left_wine.getChild("bone26");
		this.bone31 = this.left_wine.getChild("bone31");
		this.bone32 = this.left_wine.getChild("bone32");
		this.back_wine = this.head.getChild("back_wine");
		this.bone21 = this.back_wine.getChild("bone21");
		this.bone22 = this.back_wine.getChild("bone22");
		this.bone29 = this.back_wine.getChild("bone29");
		this.bone30 = this.bone29.getChild("bone30");
		this.front_wine = this.head.getChild("front_wine");
		this.bone24 = this.front_wine.getChild("bone24");
		this.bone23 = this.front_wine.getChild("bone23");
		this.bone28 = this.front_wine.getChild("bone28");
		this.bone27 = this.bone28.getChild("bone27");
		this.bone33 = this.head.getChild("bone33");
		this.bone34 = this.head.getChild("bone34");
		this.bone35 = this.head.getChild("bone35");
		this.bone36 = this.head.getChild("bone36");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(1, 99).addBox(-8.0F, -32.0F, -6.0F, 16.0F, 16.0F, 12.0F)
				.texOffs(59, 110).addBox(-7.0F, -32.0F, -7.0F, 14.0F, 16.0F, 1.0F)
				.texOffs(92, 110).addBox(-6.0F, -32.0F, 7.0F, 12.0F, 16.0F, 1.0F)
				.texOffs(97, 91).addBox(-7.0F, -32.0F, 6.0F, 14.0F, 16.0F, 1.0F)
				.texOffs(69, 91).addBox(-6.0F, -32.0F, -8.0F, 12.0F, 16.0F, 1.0F),
			PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition mouse = total.addOrReplaceChild("mouse",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition front = mouse.addOrReplaceChild("front",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -16.0F, -7.0F));
		PartDefinition bone = front.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(58, 97).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition bone2 = front.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(48, 99).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition m1 = front.addOrReplaceChild("m1",
			CubeListBuilder.create()
				.texOffs(54, 84).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition m2 = front.addOrReplaceChild("m2",
			CubeListBuilder.create()
				.texOffs(40, 84).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition back = mouse.addOrReplaceChild("back",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -16.0F, 7.0F));
		PartDefinition bone5 = back.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(29, 85).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(-5.0F, 0.0F, 0.0F));
		PartDefinition bone6 = back.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(18, 84).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(6.0F, 0.0F, 0.0F));
		PartDefinition m5 = back.addOrReplaceChild("m5",
			CubeListBuilder.create()
				.texOffs(3, 83).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition m6 = back.addOrReplaceChild("m6",
			CubeListBuilder.create()
				.texOffs(115, 77).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition left = mouse.addOrReplaceChild("left",
			CubeListBuilder.create(),
			PartPose.offset(-7.0F, -16.0F, 0.0F));
		PartDefinition bone9 = left.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(104, 77).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition m4 = left.addOrReplaceChild("m4",
			CubeListBuilder.create()
				.texOffs(89, 76).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition m3 = left.addOrReplaceChild("m3",
			CubeListBuilder.create()
				.texOffs(74, 76).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone12 = left.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(118, 65).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition right = mouse.addOrReplaceChild("right",
			CubeListBuilder.create(),
			PartPose.offset(7.0F, -16.0F, 0.0F));
		PartDefinition bone13 = right.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(107, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition m7 = right.addOrReplaceChild("m7",
			CubeListBuilder.create()
				.texOffs(92, 62).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition m8 = right.addOrReplaceChild("m8",
			CubeListBuilder.create()
				.texOffs(77, 62).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition bone16 = right.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(64, 68).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(73, 49).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(84, 43).addBox(-6.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(63, 50).addBox(-6.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(56, 48).addBox(5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(48, 48).addBox(5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition right_wine = head.addOrReplaceChild("right_wine",
			CubeListBuilder.create()
				.texOffs(30, 74).addBox(-2.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offset(-8.0F, 0.0F, 0.0F));
		PartDefinition bone17 = right_wine.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(46, 73).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.0F, 0.0F, 5.0F, -0.5236F, 1.0472F, 0.0F));
		PartDefinition bone18 = right_wine.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(99, 38).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.0F, 0.0F, -5.0F, 0.5236F, -1.0472F, 0.0F));
		PartDefinition bone19 = right_wine.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(15, 76).addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-1.0F, -1.0F, -2.0F, -0.5236F, -0.2618F, 0.0F));
		PartDefinition bone20 = right_wine.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(3, 74).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-1.0F, -1.0F, 2.0F, 0.5236F, 0.2618F, 0.0F));
		PartDefinition left_wine = head.addOrReplaceChild("left_wine",
			CubeListBuilder.create()
				.texOffs(26, 64).addBox(1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition bone25 = left_wine.addOrReplaceChild("bone25",
			CubeListBuilder.create()
				.texOffs(61, 57).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, 0.5236F, 1.0472F, 0.0F));
		PartDefinition bone26 = left_wine.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(43, 64).addBox(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, -0.5236F, -1.0472F, 0.0F));
		PartDefinition bone31 = left_wine.addOrReplaceChild("bone31",
			CubeListBuilder.create()
				.texOffs(12, 68).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, -0.5236F, 0.2618F, 0.0F));
		PartDefinition bone32 = left_wine.addOrReplaceChild("bone32",
			CubeListBuilder.create()
				.texOffs(3, 62).addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, 2.0F, 0.5236F, -0.2618F, 0.0F));
		PartDefinition back_wine = head.addOrReplaceChild("back_wine",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone21 = back_wine.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(123, 53).addBox(-1.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(-5.0F, 1.0F, -1.0F, -0.2618F, 0.0F, 1.0472F));
		PartDefinition bone22 = back_wine.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(116, 54).addBox(0.0F, -7.0F, 0.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, 1.0F, -1.0F, -0.2618F, 0.0F, -1.0472F));
		PartDefinition bone29 = back_wine.addOrReplaceChild("bone29",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone30 = bone29.addOrReplaceChild("bone30",
			CubeListBuilder.create()
				.texOffs(105, 58).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition front_wine = head.addOrReplaceChild("front_wine",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone24 = front_wine.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(123, 43).addBox(0.0F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, 1.0F, 1.0F, 0.2618F, 0.0F, -1.0472F));
		PartDefinition bone23 = front_wine.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(116, 43).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(-5.0F, 1.0F, 1.0F, 0.2618F, 0.0F, 1.0472F));
		PartDefinition bone28 = front_wine.addOrReplaceChild("bone28",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone27 = bone28.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(104, 50).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone33 = head.addOrReplaceChild("bone33",
			CubeListBuilder.create()
				.texOffs(83, 50).addBox(0.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 4.0F, -0.2618F, -0.7854F, 0.0F));
		PartDefinition bone34 = head.addOrReplaceChild("bone34",
			CubeListBuilder.create()
				.texOffs(40, 52).addBox(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, 4.0F, -0.2618F, 0.7854F, 0.0F));
		PartDefinition bone35 = head.addOrReplaceChild("bone35",
			CubeListBuilder.create()
				.texOffs(19, 51).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, -4.0F, 0.2618F, 0.7854F, 0.0F));
		PartDefinition bone36 = head.addOrReplaceChild("bone36",
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