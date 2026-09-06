package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.ThreePeaterEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantShooterEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ThreePeaterModel extends PlantShooterModel<ThreePeaterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "three_peater"), "main");

	private final ModelPart total;
	private final ModelPart leaves;
	private final ModelPart body;
	private final ModelPart left_up;
	private final ModelPart left_body;
	private final ModelPart left_head;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart mid_up;
	private final ModelPart mid_body;
	private final ModelPart mid_head;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart right_up;
	private final ModelPart right_body;
	private final ModelPart right_head;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;




public ThreePeaterModel(ModelPart root) {
		this.total = root.getChild("total");
		this.leaves = this.total.getChild("leaves");
		this.body = this.total.getChild("body");
		this.left_up = this.body.getChild("left_up");
		this.left_body = this.left_up.getChild("left_body");
		this.left_head = this.left_up.getChild("left_head");
		this.bone7 = this.left_head.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone13 = this.left_head.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.bone16 = this.left_head.getChild("bone16");
		this.bone17 = this.bone16.getChild("bone17");
		this.bone18 = this.bone17.getChild("bone18");
		this.mid_up = this.body.getChild("mid_up");
		this.mid_body = this.mid_up.getChild("mid_body");
		this.mid_head = this.mid_up.getChild("mid_head");
		this.bone4 = this.mid_head.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone10 = this.mid_head.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone12 = this.bone11.getChild("bone12");
		this.right_up = this.body.getChild("right_up");
		this.right_body = this.right_up.getChild("right_body");
		this.right_head = this.right_up.getChild("right_head");
		this.bone = this.right_head.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create()
				.texOffs(14, 30).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(13, 36).addBox(-2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(1, 30).addBox(-2.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(1, 35).addBox(-4.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(2, 45).addBox(2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(0, 55).addBox(-3.0F, -1.0F, 3.0F, 4.0F, 1.0F, 3.0F)
				.texOffs(41, 1).addBox(-7.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(42, 30).addBox(-3.0F, -1.0F, -6.0F, 4.0F, 1.0F, 3.0F),
			PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_up_pd = body_pd.addOrReplaceChild("left_up",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition left_body_pd = left_up_pd.addOrReplaceChild("left_body",
			CubeListBuilder.create()
				.texOffs(34, 38).addBox(0.0F, -3.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(-1.0F, -13.0F, 0.0F));
		PartDefinition left_head_pd = left_up_pd.addOrReplaceChild("left_head",
			CubeListBuilder.create()
				.texOffs(38, 15).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 4.0F, 2.0F)
				.texOffs(1, 19).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(0, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(46, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-0.7071F, -15.7071F, 0.0F, 0.0F, -0.1309F, -0.7854F));
		PartDefinition bone7_pd = left_head_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 0.6109F, 0.7418F, 0.0F));
		PartDefinition bone8_pd = bone7_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone9_pd = bone8_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone13_pd = left_head_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 0.6109F, -0.6981F, 0.0F));
		PartDefinition bone14_pd = bone13_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone15_pd = bone14_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone16_pd = left_head_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition bone17_pd = bone16_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone18_pd = bone17_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition mid_up_pd = body_pd.addOrReplaceChild("mid_up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mid_body_pd = mid_up_pd.addOrReplaceChild("mid_body",
			CubeListBuilder.create()
				.texOffs(55, 44).addBox(0.0F, -2.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(-1.0F, -16.0F, 0.0F));
		PartDefinition mid_head_pd = mid_up_pd.addOrReplaceChild("mid_head",
			CubeListBuilder.create()
				.texOffs(38, 15).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 4.0F, 2.0F)
				.texOffs(1, 19).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(0, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(46, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition bone4_pd = mid_head_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 0.6109F, 0.6981F, 0.0F));
		PartDefinition bone5_pd = bone4_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone6_pd = bone5_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone10_pd = mid_head_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 0.6109F, -0.6981F, 0.0F));
		PartDefinition bone11_pd = bone10_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone12_pd = bone11_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition right_up_pd = body_pd.addOrReplaceChild("right_up",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right_body_pd = right_up_pd.addOrReplaceChild("right_body",
			CubeListBuilder.create()
				.texOffs(45, 46).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition right_head_pd = right_up_pd.addOrReplaceChild("right_head",
			CubeListBuilder.create()
				.texOffs(38, 15).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 4.0F, 2.0F)
				.texOffs(1, 19).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(0, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(46, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.7071F, -15.7071F, 0.0F, 0.0F, 0.1309F, 0.7854F));
		PartDefinition bone_pd = right_head_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(3, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 0.6109F, 0.0F, 0.0F));
		PartDefinition bone2_pd = bone_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(54, 10).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.8192F, 0.4264F, -0.48F, 0.0F, 0.0F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(33, 57).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(ThreePeaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		final float OFFSET = 0.78F;
		this.left_head.xRot = 0;
		this.mid_head.xRot = 0;
		this.right_head.xRot = 0;
		this.body.xRot = 0;
		this.right_up.zRot = - OFFSET;
		this.right_head.zRot = OFFSET;
		this.left_up.zRot = OFFSET;
		this.left_head.zRot = - OFFSET;
		if(entity.isPlantInSuperMode()) {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getSuperTime() % T;
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle() / 5);
			} 
		} else {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getShootTick() + T - entity.getShootCD();
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle());
			} else {//idle
				final int TT = 40;
				final int tt = entity.getExistTick() % TT;
				final float CHANGE = 3;
				this.mid_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE / 4);
				this.left_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
				this.left_head.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_up.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_head.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
			}
		}
	}
	
	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

}