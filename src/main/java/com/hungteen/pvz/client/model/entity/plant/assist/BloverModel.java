package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.BloverEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class BloverModel extends PVZPlantModel<BloverEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "blover"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart fan;
	private final ModelPart bone4;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart bone3;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart bone2;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart body;




public BloverModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.bone = this.head.getChild("bone");
		this.cube_r1 = this.bone.getChild("cube_r1");
		this.cube_r2 = this.bone.getChild("cube_r2");
		this.cube_r3 = this.bone.getChild("cube_r3");
		this.cube_r4 = this.bone.getChild("cube_r4");
		this.cube_r5 = this.bone.getChild("cube_r5");
		this.cube_r6 = this.bone.getChild("cube_r6");
		this.cube_r7 = this.bone.getChild("cube_r7");
		this.cube_r8 = this.bone.getChild("cube_r8");
		this.cube_r9 = this.bone.getChild("cube_r9");
		this.cube_r10 = this.bone.getChild("cube_r10");
		this.cube_r11 = this.bone.getChild("cube_r11");
		this.fan = this.head.getChild("fan");
		this.bone4 = this.fan.getChild("bone4");
		this.cube_r12 = this.bone4.getChild("cube_r12");
		this.cube_r13 = this.bone4.getChild("cube_r13");
		this.cube_r14 = this.bone4.getChild("cube_r14");
		this.cube_r15 = this.bone4.getChild("cube_r15");
		this.cube_r16 = this.bone4.getChild("cube_r16");
		this.cube_r17 = this.bone4.getChild("cube_r17");
		this.cube_r18 = this.bone4.getChild("cube_r18");
		this.cube_r19 = this.bone4.getChild("cube_r19");
		this.bone3 = this.fan.getChild("bone3");
		this.cube_r20 = this.bone3.getChild("cube_r20");
		this.cube_r21 = this.bone3.getChild("cube_r21");
		this.cube_r22 = this.bone3.getChild("cube_r22");
		this.cube_r23 = this.bone3.getChild("cube_r23");
		this.cube_r24 = this.bone3.getChild("cube_r24");
		this.cube_r25 = this.bone3.getChild("cube_r25");
		this.cube_r26 = this.bone3.getChild("cube_r26");
		this.cube_r27 = this.bone3.getChild("cube_r27");
		this.bone2 = this.fan.getChild("bone2");
		this.cube_r28 = this.bone2.getChild("cube_r28");
		this.cube_r29 = this.bone2.getChild("cube_r29");
		this.cube_r30 = this.bone2.getChild("cube_r30");
		this.cube_r31 = this.bone2.getChild("cube_r31");
		this.cube_r32 = this.bone2.getChild("cube_r32");
		this.cube_r33 = this.bone2.getChild("cube_r33");
		this.cube_r34 = this.bone2.getChild("cube_r34");
		this.cube_r35 = this.bone2.getChild("cube_r35");
		this.body = this.total.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 9.0F, -0.5F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 24).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(-0.28F))
				.texOffs(26, 20).addBox(-2.25F, -2.0F, -2.14F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(20, 20).addBox(0.25F, -2.0F, -2.14F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(26, 17).addBox(-1.0F, 0.5F, -2.03F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = head_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(8, 29).addBox(-1.0F, 4.0F, 1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, -1.25F, -3.0F));
		PartDefinition cube_r1_pd = bone_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(24, 8).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-0.634F, 0.1699F, 1.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r2_pd = bone_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(16, 14).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-1.0981F, 0.634F, 1.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r3_pd = bone_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(24, 11).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-1.2679F, 1.2679F, 1.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r4_pd = bone_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(12, 20).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-1.0981F, 1.9019F, 1.0F, 0.0F, 0.0F, -2.0944F));
		PartDefinition cube_r5_pd = bone_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(18, 17).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-0.634F, 2.366F, 1.0F, 0.0F, 0.0F, -2.618F));
		PartDefinition cube_r6_pd = bone_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(24, 14).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 2.5359F, 1.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r7_pd = bone_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.634F, 2.366F, 1.0F, 0.0F, 0.0F, 2.618F));
		PartDefinition cube_r8_pd = bone_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(10, 23).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(1.0981F, 1.9019F, 1.0F, 0.0F, 0.0F, 2.0944F));
		PartDefinition cube_r9_pd = bone_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(8, 26).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(1.2679F, 1.2679F, 1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r10_pd = bone_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 26).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(1.0981F, 0.634F, 1.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r11_pd = bone_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 29).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.634F, 0.1699F, 1.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition fan_pd = head_pd.addOrReplaceChild("fan",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, -2.5F));
		PartDefinition bone4_pd = fan_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(22, 0).addBox(-2.0F, -7.5F, 1.0F, 4.0F, 3.0F, 1.0F)
				.texOffs(12, 17).addBox(-1.5F, -4.6F, 1.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(18, 11).addBox(-1.5F, -8.5F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0944F));
		PartDefinition cube_r12_pd = bone4_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 17).addBox(-2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.4142F, -4.7198F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r13_pd = bone4_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(2, 19).addBox(-1.0F, -1.0F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-2.4142F, -4.7198F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r14_pd = bone4_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(1, 21).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.5F, -7.0858F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r15_pd = bone4_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(6, 22).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.5F, -7.0858F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r16_pd = bone4_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(10, 19).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -5.5858F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r17_pd = bone4_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(22, 8).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -6.0858F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r18_pd = bone4_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(22, 14).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -6.0858F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r19_pd = bone4_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(6, 29).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -5.5858F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bone3_pd = fan_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(12, 0).addBox(-2.0F, -7.5F, 1.0F, 4.0F, 3.0F, 1.0F)
				.texOffs(24, 4).addBox(-1.5F, -4.6F, 1.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(24, 6).addBox(-1.5F, -8.5F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0944F));
		PartDefinition cube_r20_pd = bone3_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(10, 10).addBox(-2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.4142F, -4.7198F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r21_pd = bone3_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(11, 8).addBox(-1.0F, -1.0F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-2.4142F, -4.7198F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r22_pd = bone3_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(10, 4).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.5F, -7.0858F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r23_pd = bone3_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(14, 6).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.5F, -7.0858F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r24_pd = bone3_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(16, 4).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -5.5858F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r25_pd = bone3_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(18, 9).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -6.0858F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r26_pd = bone3_pd.addOrReplaceChild("cube_r26",
			CubeListBuilder.create()
				.texOffs(20, 6).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -6.0858F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r27_pd = bone3_pd.addOrReplaceChild("cube_r27",
			CubeListBuilder.create()
				.texOffs(20, 4).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -5.5858F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bone2_pd = fan_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(8, 12).addBox(-2.0F, -7.5F, 1.0F, 4.0F, 3.0F, 1.0F)
				.texOffs(6, 6).addBox(-1.5F, -4.6F, 1.0F, 3.0F, 1.0F, 1.0F)
				.texOffs(3, 8).addBox(-1.5F, -8.5F, 1.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r28_pd = bone2_pd.addOrReplaceChild("cube_r28",
			CubeListBuilder.create()
				.texOffs(0, 32).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.4142F, -4.7198F, 1.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r29_pd = bone2_pd.addOrReplaceChild("cube_r29",
			CubeListBuilder.create()
				.texOffs(4, 2).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-2.4142F, -4.7198F, 1.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r30_pd = bone2_pd.addOrReplaceChild("cube_r30",
			CubeListBuilder.create()
				.texOffs(6, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.5F, -7.0858F, 1.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r31_pd = bone2_pd.addOrReplaceChild("cube_r31",
			CubeListBuilder.create()
				.texOffs(2, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.5F, -7.0858F, 1.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r32_pd = bone2_pd.addOrReplaceChild("cube_r32",
			CubeListBuilder.create()
				.texOffs(4, 12).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -5.5858F, 1.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r33_pd = bone2_pd.addOrReplaceChild("cube_r33",
			CubeListBuilder.create()
				.texOffs(6, 10).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -6.0858F, 1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r34_pd = bone2_pd.addOrReplaceChild("cube_r34",
			CubeListBuilder.create()
				.texOffs(6, 26).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.9142F, -6.0858F, 1.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r35_pd = bone2_pd.addOrReplaceChild("cube_r35",
			CubeListBuilder.create()
				.texOffs(9, 16).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.9142F, -5.5858F, 1.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(32, 0).addBox(-0.5F, -15.0F, -0.5F, 1.0F, 15.0F, 1.0F)
				.texOffs(36, 0).addBox(-1.0F, -16.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.35F))
				.texOffs(36, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, 15.0F, 0.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(BloverEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.fan.zRot = ageInTicks / 1.5F;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<BloverEntity> getPlantModel() {
		return this;
	}
}