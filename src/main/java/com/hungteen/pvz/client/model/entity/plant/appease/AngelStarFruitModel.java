package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.appease.AngelStarFruitEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class AngelStarFruitModel extends PVZPlantModel<AngelStarFruitEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "angel_star_fruit"), "main");

	
	private final ModelPart total;
	private final ModelPart base;
	private final ModelPart b1;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart b2;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart b3;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart body;
	private final ModelPart face;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart eye;
	private final ModelPart body2;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart body3;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart body4;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart body5;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;




public AngelStarFruitModel(ModelPart root) {
		this.total = root.getChild("total");
		this.base = this.total.getChild("base");
		this.b1 = this.base.getChild("b1");
		this.cube_r1 = this.b1.getChild("cube_r1");
		this.cube_r2 = this.b1.getChild("cube_r2");
		this.cube_r3 = this.b1.getChild("cube_r3");
		this.cube_r4 = this.b1.getChild("cube_r4");
		this.b2 = this.base.getChild("b2");
		this.cube_r5 = this.b2.getChild("cube_r5");
		this.cube_r6 = this.b2.getChild("cube_r6");
		this.cube_r7 = this.b2.getChild("cube_r7");
		this.cube_r8 = this.b2.getChild("cube_r8");
		this.b3 = this.base.getChild("b3");
		this.cube_r9 = this.b3.getChild("cube_r9");
		this.cube_r10 = this.b3.getChild("cube_r10");
		this.cube_r11 = this.b3.getChild("cube_r11");
		this.cube_r12 = this.b3.getChild("cube_r12");
		this.body = this.total.getChild("body");
		this.face = this.body.getChild("face");
		this.cube_r13 = this.face.getChild("cube_r13");
		this.cube_r14 = this.face.getChild("cube_r14");
		this.cube_r15 = this.face.getChild("cube_r15");
		this.cube_r16 = this.face.getChild("cube_r16");
		this.cube_r17 = this.face.getChild("cube_r17");
		this.cube_r18 = this.face.getChild("cube_r18");
		this.eye = this.face.getChild("eye");
		this.body2 = this.body.getChild("body2");
		this.cube_r19 = this.body2.getChild("cube_r19");
		this.cube_r20 = this.body2.getChild("cube_r20");
		this.cube_r21 = this.body2.getChild("cube_r21");
		this.cube_r22 = this.body2.getChild("cube_r22");
		this.body3 = this.body.getChild("body3");
		this.cube_r23 = this.body3.getChild("cube_r23");
		this.cube_r24 = this.body3.getChild("cube_r24");
		this.cube_r25 = this.body3.getChild("cube_r25");
		this.cube_r26 = this.body3.getChild("cube_r26");
		this.body4 = this.body.getChild("body4");
		this.cube_r27 = this.body4.getChild("cube_r27");
		this.cube_r28 = this.body4.getChild("cube_r28");
		this.cube_r29 = this.body4.getChild("cube_r29");
		this.cube_r30 = this.body4.getChild("cube_r30");
		this.body5 = this.body.getChild("body5");
		this.cube_r31 = this.body5.getChild("cube_r31");
		this.cube_r32 = this.body5.getChild("cube_r32");
		this.cube_r33 = this.body5.getChild("cube_r33");
		this.cube_r34 = this.body5.getChild("cube_r34");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition base_pd = total_pd.addOrReplaceChild("base",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition b1_pd = base_pd.addOrReplaceChild("b1",
			CubeListBuilder.create()
				.texOffs(10, 13).addBox(-8.0F, -1.95F, 5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 1.1F, 0.0F, 0.0F, 0.1571F, 0.0F));
		PartDefinition cube_r1_pd = b1_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(10, 13).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-8.8205F, -1.45F, -4.4943F, 0.0F, -1.2566F, 0.0F));
		PartDefinition cube_r2_pd = b1_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(10, 13).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(1.5486F, -1.45F, -9.7776F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r3_pd = b1_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(10, 13).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(9.7776F, -1.45F, -1.5486F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r4_pd = b1_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(10, 13).addBox(-1.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(4.4943F, -1.45F, 8.8205F, 0.0F, 1.2566F, 0.0F));
		PartDefinition b2_pd = base_pd.addOrReplaceChild("b2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.955F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 1.2F, 0.0F, 0.0F, 0.3665F, 0.0F));
		PartDefinition cube_r5_pd = b2_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.955F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r6_pd = b2_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.955F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r7_pd = b2_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.955F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r8_pd = b2_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.955F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition b3_pd = base_pd.addOrReplaceChild("b3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.95F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 1.2F, 0.0F, 0.0F, -0.0524F, 0.0F));
		PartDefinition cube_r9_pd = b3_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.95F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r10_pd = b3_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.95F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r11_pd = b3_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.95F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r12_pd = b3_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.95F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition face_pd = body_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(0, 5).addBox(0.0F, -3.81F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 0).addBox(-1.0F, -3.81F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -0.45F, 0.0F));
		PartDefinition cube_r13_pd = face_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(3.0611F, -1.35F, -2.3772F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r14_pd = face_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(1.5405F, -1.35F, -3.7629F, 0.0F, -0.3054F, 0.0F));
		PartDefinition cube_r15_pd = face_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(2.9383F, -1.35F, -3.0735F, 0.0F, -0.6109F, 0.0F));
		PartDefinition cube_r16_pd = face_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-1.5405F, -1.35F, -3.7629F, 0.0F, 0.3054F, 0.0F));
		PartDefinition cube_r17_pd = face_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-2.4875F, -1.35F, -1.558F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r18_pd = face_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-2.9383F, -1.35F, -3.0735F, 0.0F, 0.6109F, 0.0F));
		PartDefinition eye_pd = face_pd.addOrReplaceChild("eye",
			CubeListBuilder.create()
				.texOffs(0, 13).addBox(-3.0F, -2.46F, 0.0F, 2.0F, 1.0F, 3.0F)
				.texOffs(0, 17).addBox(1.0F, -2.46F, 0.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offset(0.0F, -1.1F, 1.0F));
		PartDefinition body2_pd = body_pd.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -1.01F, 0.0F, 7.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r19_pd = body2_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -1.01F, 0.0F, 7.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r20_pd = body2_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -1.01F, 0.0F, 7.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r21_pd = body2_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -1.01F, 0.0F, 7.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r22_pd = body2_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -1.01F, 0.0F, 7.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition body3_pd = body_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.011F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r23_pd = body3_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.011F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r24_pd = body3_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.011F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r25_pd = body3_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.011F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r26_pd = body3_pd.addOrReplaceChild("cube_r26",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.011F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition body4_pd = body_pd.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r27_pd = body4_pd.addOrReplaceChild("cube_r27",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r28_pd = body4_pd.addOrReplaceChild("cube_r28",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r29_pd = body4_pd.addOrReplaceChild("cube_r29",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r30_pd = body4_pd.addOrReplaceChild("cube_r30",
			CubeListBuilder.create()
				.texOffs(2, 24).addBox(-6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition body5_pd = body_pd.addOrReplaceChild("body5",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-6.0F, -4.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r31_pd = body5_pd.addOrReplaceChild("cube_r31",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-6.0F, -4.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r32_pd = body5_pd.addOrReplaceChild("cube_r32",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-6.0F, -4.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r33_pd = body5_pd.addOrReplaceChild("cube_r33",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-6.0F, -4.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r34_pd = body5_pd.addOrReplaceChild("cube_r34",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-6.0F, -4.0F, -1.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}


	@Override
	public void setupAnim(AngelStarFruitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.total.yRot = 3.14159F;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<AngelStarFruitEntity> getPlantModel() {
		return this;
	}
	
}