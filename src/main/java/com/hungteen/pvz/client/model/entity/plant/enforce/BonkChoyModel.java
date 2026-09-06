package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.BonkChoyEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class BonkChoyModel extends PVZPlantModel<BonkChoyEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "bonk_choy"), "main");

	private final ModelPart total;
	private final ModelPart hair;
	private final ModelPart bone2;
	private final ModelPart cube_r1;
	private final ModelPart bone7;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart right_arm;
	private final ModelPart right1;
	private final ModelPart right2;
	private final ModelPart right3;
	private final ModelPart right4;
	private final ModelPart right5;
	private final ModelPart left_arm;
	private final ModelPart left1;
	private final ModelPart left2;
	private final ModelPart left3;
	private final ModelPart left4;
	private final ModelPart left5;
	private final ModelPart face;
	private final ModelPart body;




	public BonkChoyModel(ModelPart root) {
		this.total = root.getChild("total");
		this.hair = this.total.getChild("hair");
		this.bone2 = this.hair.getChild("bone2");
		this.cube_r1 = this.bone2.getChild("cube_r1");
		this.bone7 = this.hair.getChild("bone7");
		this.bone5 = this.hair.getChild("bone5");
		this.bone6 = this.hair.getChild("bone6");
		this.bone3 = this.hair.getChild("bone3");
		this.bone4 = this.hair.getChild("bone4");
		this.right_arm = this.total.getChild("right_arm");
		this.right1 = this.right_arm.getChild("right1");
		this.right2 = this.right1.getChild("right2");
		this.right3 = this.right2.getChild("right3");
		this.right4 = this.right3.getChild("right4");
		this.right5 = this.right4.getChild("right5");
		this.left_arm = this.total.getChild("left_arm");
		this.left1 = this.left_arm.getChild("left1");
		this.left2 = this.left1.getChild("left2");
		this.left3 = this.left2.getChild("left3");
		this.left4 = this.left3.getChild("left4");
		this.left5 = this.left4.getChild("left5");
		this.face = this.total.getChild("face");
		this.body = this.total.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hair_pd = total_pd.addOrReplaceChild("hair",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -18.25F, -1.0F));
		PartDefinition bone2_pd = hair_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(82, 110).addBox(-5.0F, -2.5F, -3.5F, 10.0F, 2.0F, 2.0F)
				.texOffs(72, 103).addBox(-6.0F, -7.5F, -3.5F, 12.0F, 5.0F, 2.0F),
			PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition cube_r1_pd = bone2_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(32, 67).addBox(-4.0F, -0.5F, 0.5F, 8.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.1645F, -3.7418F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bone7_pd = hair_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(48, 97).addBox(-4.0F, -15.5F, -3.5F, 8.0F, 3.0F, 2.0F)
				.texOffs(104, 108).addBox(-5.0F, -17.5F, -3.5F, 10.0F, 2.0F, 2.0F)
				.texOffs(100, 101).addBox(-6.0F, -22.5F, -3.5F, 12.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 10.0F, -2.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone5_pd = hair_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(72, 96).addBox(-4.0F, -15.5F, -3.5F, 8.0F, 5.0F, 2.0F)
				.texOffs(104, 97).addBox(-5.0F, -17.5F, -3.5F, 10.0F, 2.0F, 2.0F)
				.texOffs(36, 88).addBox(-6.0F, -22.5F, -3.5F, 12.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(10.0F, 7.0F, 0.0F, -0.2182F, 0.0F, -0.8727F));
		PartDefinition bone6_pd = hair_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(62, 89).addBox(-4.0F, -15.5F, -3.5F, 8.0F, 5.0F, 2.0F)
				.texOffs(104, 93).addBox(-5.0F, -17.5F, -3.5F, 10.0F, 2.0F, 2.0F)
				.texOffs(36, 81).addBox(-6.0F, -22.5F, -3.5F, 12.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(-9.0F, 7.0F, 1.0F, -0.2182F, 0.0F, 0.8727F));
		PartDefinition bone3_pd = hair_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(82, 90).addBox(-4.0F, -15.5F, -3.5F, 8.0F, 4.0F, 2.0F)
				.texOffs(104, 89).addBox(-5.0F, -17.5F, -3.5F, 10.0F, 2.0F, 2.0F)
				.texOffs(100, 82).addBox(-6.0F, -22.5F, -3.5F, 12.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(5.0F, 9.0F, 2.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone4_pd = hair_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(80, 83).addBox(-4.0F, -15.5F, -3.501F, 8.0F, 4.0F, 2.0F)
				.texOffs(104, 78).addBox(-5.0F, -17.5F, -3.501F, 10.0F, 2.0F, 2.0F)
				.texOffs(0, 76).addBox(-6.0F, -22.5F, -3.501F, 12.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(-4.0F, 9.0F, 2.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition right_arm_pd = total_pd.addOrReplaceChild("right_arm",
			CubeListBuilder.create()
				.texOffs(89, 80).addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F),
			PartPose.offset(-5.0F, -0.75F, 0.0F));
		PartDefinition right1_pd = right_arm_pd.addOrReplaceChild("right1",
			CubeListBuilder.create()
				.texOffs(63, 78).addBox(-2.8706F, -0.517F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition right2_pd = right1_pd.addOrReplaceChild("right2",
			CubeListBuilder.create()
				.texOffs(114, 113).addBox(-3.75F, -0.567F, -0.5F, 4.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition right3_pd = right2_pd.addOrReplaceChild("right3",
			CubeListBuilder.create()
				.texOffs(64, 85).addBox(-4.6464F, -0.6464F, -0.5F, 5.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition right4_pd = right3_pd.addOrReplaceChild("right4",
			CubeListBuilder.create()
				.texOffs(97, 72).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.05F)),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition right5_pd = right4_pd.addOrReplaceChild("right5",
			CubeListBuilder.create()
				.texOffs(14, 67).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition left_arm_pd = total_pd.addOrReplaceChild("left_arm",
			CubeListBuilder.create()
				.texOffs(73, 78).addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(5.0F, -0.75F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition left1_pd = left_arm_pd.addOrReplaceChild("left1",
			CubeListBuilder.create()
				.texOffs(57, 123).addBox(-2.8706F, -0.517F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition left2_pd = left1_pd.addOrReplaceChild("left2",
			CubeListBuilder.create()
				.texOffs(38, 74).addBox(-3.75F, -0.567F, -2.0F, 4.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition left3_pd = left2_pd.addOrReplaceChild("left3",
			CubeListBuilder.create()
				.texOffs(52, 74).addBox(-4.6464F, -0.6464F, -2.0F, 5.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition left4_pd = left3_pd.addOrReplaceChild("left4",
			CubeListBuilder.create()
				.texOffs(83, 75).addBox(-5.0F, -1.0F, -1.5F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.05F)),
			PartPose.offsetAndRotation(-3.8232F, -0.1768F, -0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition left5_pd = left4_pd.addOrReplaceChild("left5",
			CubeListBuilder.create()
				.texOffs(68, 69).addBox(-4.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(56, 116).addBox(0.5F, -11.0F, -6.5F, 5.0F, 6.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(0, 88).addBox(-5.5F, -11.0F, -6.5F, 5.0F, 6.0F, 1.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -2.25F, -1.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(96, 117).addBox(1.0F, -19.0F, -4.0F, 8.0F, 1.0F, 8.0F)
				.texOffs(0, 83).addBox(-1.0F, -4.5F, -6.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(0.4F))
				.texOffs(0, 100).addBox(-2.0F, -14.5F, -7.0F, 14.0F, 14.0F, 14.0F)
				.texOffs(42, 102).addBox(0.0F, -18.0F, -5.0F, 10.0F, 2.0F, 10.0F)
				.texOffs(56, 114).addBox(-1.0F, -16.25F, -6.0F, 12.0F, 2.0F, 12.0F),
			PartPose.offset(-5.0F, -0.75F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(BonkChoyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() == 0) {
			this.left_arm.xRot = 0;
			this.left_arm.yRot = 3.1416F;
			this.left_arm.zRot = 0;
			this.right_arm.xRot = 0;
			this.right_arm.yRot = 0;
			this.right_arm.zRot = 0;
		} else if(entity.getAttackTime() < 0) {
			int now = entity.getAttackTime();
			int tot = entity.getAttackCD();
			this.right_arm.xRot = AnimationUtil.getUpDown(now, tot, 60);
			this.right_arm.yRot = AnimationUtil.getUpDown(now, tot, - 60);
		} else {
			int now = - entity.getAttackTime();
			int tot = entity.getAttackCD();
			this.left_arm.xRot = AnimationUtil.getUpDown(now, tot, - 60);
			this.left_arm.yRot = - (3.1416F - AnimationUtil.getUpDown(now, tot, 60));
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<BonkChoyEntity> getPlantModel() {
		return this;
	}
}