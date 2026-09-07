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
	private final ModelPart cube_r1;
	private final ModelPart leaf;
	private final ModelPart leaf2;
	private final ModelPart leaf3;
	private final ModelPart leaf4;
	private final ModelPart leaf5;
	private final ModelPart leaf6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart mouth;
	private final ModelPart tooth;
	private final ModelPart eyegeneral;
	private final ModelPart eyebrow;
	private final ModelPart eyebrow2;
	private final ModelPart eyebrow3;
	private final ModelPart eyebrow4;
	private final ModelPart eye;
	private final ModelPart eyeball;
	private final ModelPart eye2;
	private final ModelPart eyeball2;
	private final ModelPart left_arm;
	private final ModelPart left1;
	private final ModelPart left2;
	private final ModelPart left3;
	private final ModelPart left4;
	private final ModelPart left5;
	private final ModelPart fist7;
	private final ModelPart fist8;
	private final ModelPart fist9;
	private final ModelPart right_arm;
	private final ModelPart right1;
	private final ModelPart right2;
	private final ModelPart right3;
	private final ModelPart right4;
	private final ModelPart right5;
	private final ModelPart fist16;
	private final ModelPart fist17;
	private final ModelPart fist18;
	private final ModelPart special;


	public BonkChoyModel(ModelPart root) {
		this.total = root.getChild("total");
		this.hair = this.total.getChild("hair");
		this.cube_r1 = this.hair.getChild("cube_r1");
		this.leaf = this.hair.getChild("leaf");
		this.leaf2 = this.leaf.getChild("leaf2");
		this.leaf3 = this.hair.getChild("leaf3");
		this.leaf4 = this.leaf3.getChild("leaf4");
		this.leaf5 = this.hair.getChild("leaf5");
		this.leaf6 = this.leaf5.getChild("leaf6");
		this.body = this.total.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.mouth = this.body.getChild("mouth");
		this.tooth = this.mouth.getChild("tooth");
		this.eyegeneral = this.body.getChild("eyegeneral");
		this.eyebrow = this.eyegeneral.getChild("eyebrow");
		this.eyebrow2 = this.eyegeneral.getChild("eyebrow2");
		this.eyebrow3 = this.eyegeneral.getChild("eyebrow3");
		this.eyebrow4 = this.eyegeneral.getChild("eyebrow4");
		this.eye = this.eyegeneral.getChild("eye");
		this.eyeball = this.eye.getChild("eyeball");
		this.eye2 = this.eyegeneral.getChild("eye2");
		this.eyeball2 = this.eye2.getChild("eyeball2");
		this.left_arm = this.total.getChild("left_arm");
		this.left1 = this.left_arm.getChild("left1");
		this.left2 = this.left1.getChild("left2");
		this.left3 = this.left2.getChild("left3");
		this.left4 = this.left3.getChild("left4");
		this.left5 = this.left4.getChild("left5");
		this.fist7 = this.left5.getChild("fist7");
		this.fist8 = this.fist7.getChild("fist8");
		this.fist9 = this.fist8.getChild("fist9");
		this.right_arm = this.total.getChild("right_arm");
		this.right1 = this.right_arm.getChild("right1");
		this.right2 = this.right1.getChild("right2");
		this.right3 = this.right2.getChild("right3");
		this.right4 = this.right3.getChild("right4");
		this.right5 = this.right4.getChild("right5");
		this.fist16 = this.right5.getChild("fist16");
		this.fist17 = this.fist16.getChild("fist17");
		this.fist18 = this.fist17.getChild("fist18");
		this.special = this.total.getChild("special");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition hair = total.addOrReplaceChild("hair",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -9.0F, -2.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(15, 25).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 4.0F, 4.0F),
			PartPose.offsetAndRotation(-0.5F, -2.0F, 1.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition leaf = hair.addOrReplaceChild("leaf",
			CubeListBuilder.create()
				.texOffs(0, 42).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F),
			PartPose.offset(0.0F, -1.0F, 1.0F));
		PartDefinition leaf2 = leaf.addOrReplaceChild("leaf2",
			CubeListBuilder.create()
				.texOffs(33, 40).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition leaf3 = hair.addOrReplaceChild("leaf3",
			CubeListBuilder.create()
				.texOffs(22, 35).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 4.0F, 0.0F),
			PartPose.offset(0.0F, -1.0F, 2.0F));
		PartDefinition leaf4 = leaf3.addOrReplaceChild("leaf4",
			CubeListBuilder.create()
				.texOffs(13, 39).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 3.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf5 = hair.addOrReplaceChild("leaf5",
			CubeListBuilder.create()
				.texOffs(0, 34).addBox(-5.5F, -3.0F, 0.0F, 11.0F, 3.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition leaf6 = leaf5.addOrReplaceChild("leaf6",
			CubeListBuilder.create()
				.texOffs(20, 14).addBox(-5.5F, -3.0F, 0.0F, 11.0F, 3.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(19, 17).addBox(-3.5F, -1.0F, -3.5F, 7.0F, 1.0F, 7.0F)
				.texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition body2 = body.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-3.5F, -4.0F, -1.0F, 7.0F, 4.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -6.0F, -2.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition mouth = body.addOrReplaceChild("mouth",
			CubeListBuilder.create()
				.texOffs(22, 33).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(-1.25F, -1.75F, -3.825F, 0.0F, 0.0F, 0.3491F));
		PartDefinition tooth = mouth.addOrReplaceChild("tooth",
			CubeListBuilder.create()
				.texOffs(0, 16).addBox(-0.75F, -0.75F, -1.01F, 2.0F, 1.5F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(-0.5F, 0.525F, 0.425F));
		PartDefinition eyegeneral = body.addOrReplaceChild("eyegeneral",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition eyebrow = eyegeneral.addOrReplaceChild("eyebrow",
			CubeListBuilder.create()
				.texOffs(16, 42).addBox(-1.625F, -1.0F, -0.5F, 3.25F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-1.9891F, -6.4355F, -3.8188F, -0.1745F, 0.0F, 0.3054F));
		PartDefinition eyebrow2 = eyegeneral.addOrReplaceChild("eyebrow2",
			CubeListBuilder.create()
				.texOffs(0, 5).addBox(-1.625F, -1.0F, -0.5F, 3.25F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(1.9891F, -6.4355F, -3.8188F, -0.1745F, 0.0F, -0.3054F));
		PartDefinition eyebrow3 = eyegeneral.addOrReplaceChild("eyebrow3",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.125F, -0.5F, -0.5F, 2.25F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-2.0F, -2.9708F, -3.7306F, 0.1745F, 0.0F, 0.0F));
		PartDefinition eyebrow4 = eyegeneral.addOrReplaceChild("eyebrow4",
			CubeListBuilder.create()
				.texOffs(0, 14).mirror().addBox(-1.125F, -0.5F, -0.5F, 2.25F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.0F, -2.9708F, -3.7306F, 0.1745F, 0.0F, 0.0F));
		PartDefinition eye = eyegeneral.addOrReplaceChild("eye",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.25F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F),
			PartPose.offset(-1.75F, -4.5F, -3.05F));
		PartDefinition eyeball = eye.addOrReplaceChild("eyeball",
			CubeListBuilder.create()
				.texOffs(20, 17).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offset(0.5F, 0.5F, -0.1F));
		PartDefinition eye2 = eyegeneral.addOrReplaceChild("eye2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-0.75F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F),
			PartPose.offset(1.75F, -4.5F, -3.05F));
		PartDefinition eyeball2 = eye2.addOrReplaceChild("eyeball2",
			CubeListBuilder.create()
				.texOffs(20, 17).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offset(0.0F, 0.5F, -0.1F));
		PartDefinition left_arm = total.addOrReplaceChild("left_arm",
			CubeListBuilder.create()
				.texOffs(20, 0).addBox(0.0F, 0.0F, -2.5F, 9.0F, 0.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.1745F, 0.3491F, -0.0873F));
		PartDefinition left1 = left_arm.addOrReplaceChild("left1",
			CubeListBuilder.create()
				.texOffs(28, 30).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition left2 = left1.addOrReplaceChild("left2",
			CubeListBuilder.create()
				.texOffs(0, 24).addBox(0.0F, 0.0F, -3.0F, 7.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition left3 = left2.addOrReplaceChild("left3",
			CubeListBuilder.create()
				.texOffs(0, 29).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition left4 = left3.addOrReplaceChild("left4",
			CubeListBuilder.create()
				.texOffs(27, 8).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.7017F));
		PartDefinition left5 = left4.addOrReplaceChild("left5",
			CubeListBuilder.create()
				.texOffs(37, 5).addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.4835F));
		PartDefinition fist7 = left5.addOrReplaceChild("fist7",
			CubeListBuilder.create()
				.texOffs(35, 17).addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.7453F));
		PartDefinition fist8 = fist7.addOrReplaceChild("fist8",
			CubeListBuilder.create()
				.texOffs(38, 25).addBox(1.0F, 0.0F, -3.0F, 2.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition fist9 = fist8.addOrReplaceChild("fist9",
			CubeListBuilder.create()
				.texOffs(37, 10).addBox(0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition right_arm = total.addOrReplaceChild("right_arm",
			CubeListBuilder.create()
				.texOffs(20, 4).addBox(-8.0F, 0.0F, -2.5F, 8.0F, 0.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, -0.0873F, 0.0873F));
		PartDefinition right1 = right_arm.addOrReplaceChild("right1",
			CubeListBuilder.create()
				.texOffs(37, 0).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition right2 = right1.addOrReplaceChild("right2",
			CubeListBuilder.create()
				.texOffs(28, 25).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition right3 = right2.addOrReplaceChild("right3",
			CubeListBuilder.create()
				.texOffs(0, 37).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition right4 = right3.addOrReplaceChild("right4",
			CubeListBuilder.create()
				.texOffs(27, 8).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.7017F));
		PartDefinition right5 = right4.addOrReplaceChild("right5",
			CubeListBuilder.create()
				.texOffs(37, 35).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition fist16 = right5.addOrReplaceChild("fist16",
			CubeListBuilder.create()
				.texOffs(35, 17).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.7453F));
		PartDefinition fist17 = fist16.addOrReplaceChild("fist17",
			CubeListBuilder.create()
				.texOffs(38, 30).addBox(-2.5F, 0.0F, -3.0F, 1.5F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition fist18 = fist17.addOrReplaceChild("fist18",
			CubeListBuilder.create()
				.texOffs(37, 10).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F),
			PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition special = total.addOrReplaceChild("special",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(BonkChoyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() == 0) {
			this.left_arm.xRot = 0;
			this.left_arm.yRot = 0;
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
			//this.left_arm.yRot = - (3.1416F - AnimationUtil.getUpDown(now, tot, 60));
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