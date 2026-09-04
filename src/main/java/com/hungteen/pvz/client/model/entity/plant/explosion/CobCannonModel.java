package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CobCannonEntity;
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
public class CobCannonModel extends PVZPlantModel<CobCannonEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "cob_cannon"), "main");

	private final ModelPart total;
	private final ModelPart wheels;
	private final ModelPart wheel1;
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
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart wheel2;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart wheel3;
	private final ModelPart cube_r31;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;
	private final ModelPart cube_r38;
	private final ModelPart cube_r39;
	private final ModelPart cube_r40;
	private final ModelPart cube_r41;
	private final ModelPart cube_r42;
	private final ModelPart cube_r43;
	private final ModelPart cube_r44;
	private final ModelPart cube_r45;
	private final ModelPart wheel4;
	private final ModelPart cube_r46;
	private final ModelPart cube_r47;
	private final ModelPart cube_r48;
	private final ModelPart cube_r49;
	private final ModelPart cube_r50;
	private final ModelPart cube_r51;
	private final ModelPart cube_r52;
	private final ModelPart cube_r53;
	private final ModelPart cube_r54;
	private final ModelPart cube_r55;
	private final ModelPart cube_r56;
	private final ModelPart cube_r57;
	private final ModelPart cube_r58;
	private final ModelPart cube_r59;
	private final ModelPart cube_r60;
	private final ModelPart base;
	private final ModelPart body;
	private final ModelPart corn;
	private final ModelPart outer;
	private final ModelPart layer1;
	private final ModelPart layer2;
	private final ModelPart layer3;
	private final ModelPart layer4;
	private final ModelPart leaves;
	private final ModelPart leaf1;
	private final ModelPart l1;
	private final ModelPart cube_r61;
	private final ModelPart bone;
	private final ModelPart leaf2;
	private final ModelPart l2;
	private final ModelPart cube_r62;
	private final ModelPart bone2;
	private final ModelPart leaf3;
	private final ModelPart l3;
	private final ModelPart cube_r63;
	private final ModelPart bone3;
	private final ModelPart leaf4;
	private final ModelPart l4;
	private final ModelPart cube_r64;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart cube_r65;
	private final ModelPart cube_r66;
	private final ModelPart cube_r67;
	private final ModelPart cube_r68;
	private final ModelPart face;




public CobCannonModel(ModelPart root) {
		this.total = root.getChild("total");
		this.wheels = this.total.getChild("wheels");
		this.wheel1 = this.wheels.getChild("wheel1");
		this.cube_r1 = this.wheel1.getChild("cube_r1");
		this.cube_r2 = this.wheel1.getChild("cube_r2");
		this.cube_r3 = this.wheel1.getChild("cube_r3");
		this.cube_r4 = this.wheel1.getChild("cube_r4");
		this.cube_r5 = this.wheel1.getChild("cube_r5");
		this.cube_r6 = this.wheel1.getChild("cube_r6");
		this.cube_r7 = this.wheel1.getChild("cube_r7");
		this.cube_r8 = this.wheel1.getChild("cube_r8");
		this.cube_r9 = this.wheel1.getChild("cube_r9");
		this.cube_r10 = this.wheel1.getChild("cube_r10");
		this.cube_r11 = this.wheel1.getChild("cube_r11");
		this.cube_r12 = this.wheel1.getChild("cube_r12");
		this.cube_r13 = this.wheel1.getChild("cube_r13");
		this.cube_r14 = this.wheel1.getChild("cube_r14");
		this.cube_r15 = this.wheel1.getChild("cube_r15");
		this.wheel2 = this.wheels.getChild("wheel2");
		this.cube_r16 = this.wheel2.getChild("cube_r16");
		this.cube_r17 = this.wheel2.getChild("cube_r17");
		this.cube_r18 = this.wheel2.getChild("cube_r18");
		this.cube_r19 = this.wheel2.getChild("cube_r19");
		this.cube_r20 = this.wheel2.getChild("cube_r20");
		this.cube_r21 = this.wheel2.getChild("cube_r21");
		this.cube_r22 = this.wheel2.getChild("cube_r22");
		this.cube_r23 = this.wheel2.getChild("cube_r23");
		this.cube_r24 = this.wheel2.getChild("cube_r24");
		this.cube_r25 = this.wheel2.getChild("cube_r25");
		this.cube_r26 = this.wheel2.getChild("cube_r26");
		this.cube_r27 = this.wheel2.getChild("cube_r27");
		this.cube_r28 = this.wheel2.getChild("cube_r28");
		this.cube_r29 = this.wheel2.getChild("cube_r29");
		this.cube_r30 = this.wheel2.getChild("cube_r30");
		this.wheel3 = this.wheels.getChild("wheel3");
		this.cube_r31 = this.wheel3.getChild("cube_r31");
		this.cube_r32 = this.wheel3.getChild("cube_r32");
		this.cube_r33 = this.wheel3.getChild("cube_r33");
		this.cube_r34 = this.wheel3.getChild("cube_r34");
		this.cube_r35 = this.wheel3.getChild("cube_r35");
		this.cube_r36 = this.wheel3.getChild("cube_r36");
		this.cube_r37 = this.wheel3.getChild("cube_r37");
		this.cube_r38 = this.wheel3.getChild("cube_r38");
		this.cube_r39 = this.wheel3.getChild("cube_r39");
		this.cube_r40 = this.wheel3.getChild("cube_r40");
		this.cube_r41 = this.wheel3.getChild("cube_r41");
		this.cube_r42 = this.wheel3.getChild("cube_r42");
		this.cube_r43 = this.wheel3.getChild("cube_r43");
		this.cube_r44 = this.wheel3.getChild("cube_r44");
		this.cube_r45 = this.wheel3.getChild("cube_r45");
		this.wheel4 = this.wheels.getChild("wheel4");
		this.cube_r46 = this.wheel4.getChild("cube_r46");
		this.cube_r47 = this.wheel4.getChild("cube_r47");
		this.cube_r48 = this.wheel4.getChild("cube_r48");
		this.cube_r49 = this.wheel4.getChild("cube_r49");
		this.cube_r50 = this.wheel4.getChild("cube_r50");
		this.cube_r51 = this.wheel4.getChild("cube_r51");
		this.cube_r52 = this.wheel4.getChild("cube_r52");
		this.cube_r53 = this.wheel4.getChild("cube_r53");
		this.cube_r54 = this.wheel4.getChild("cube_r54");
		this.cube_r55 = this.wheel4.getChild("cube_r55");
		this.cube_r56 = this.wheel4.getChild("cube_r56");
		this.cube_r57 = this.wheel4.getChild("cube_r57");
		this.cube_r58 = this.wheel4.getChild("cube_r58");
		this.cube_r59 = this.wheel4.getChild("cube_r59");
		this.cube_r60 = this.wheel4.getChild("cube_r60");
		this.base = this.total.getChild("base");
		this.body = this.total.getChild("body");
		this.corn = this.body.getChild("corn");
		this.outer = this.body.getChild("outer");
		this.layer1 = this.outer.getChild("layer1");
		this.layer2 = this.outer.getChild("layer2");
		this.layer3 = this.outer.getChild("layer3");
		this.layer4 = this.outer.getChild("layer4");
		this.leaves = this.outer.getChild("leaves");
		this.leaf1 = this.leaves.getChild("leaf1");
		this.l1 = this.leaf1.getChild("l1");
		this.cube_r61 = this.l1.getChild("cube_r61");
		this.bone = this.l1.getChild("bone");
		this.leaf2 = this.leaves.getChild("leaf2");
		this.l2 = this.leaf2.getChild("l2");
		this.cube_r62 = this.l2.getChild("cube_r62");
		this.bone2 = this.l2.getChild("bone2");
		this.leaf3 = this.leaves.getChild("leaf3");
		this.l3 = this.leaf3.getChild("l3");
		this.cube_r63 = this.l3.getChild("cube_r63");
		this.bone3 = this.l3.getChild("bone3");
		this.leaf4 = this.leaves.getChild("leaf4");
		this.l4 = this.leaf4.getChild("l4");
		this.cube_r64 = this.l4.getChild("cube_r64");
		this.bone4 = this.l4.getChild("bone4");
		this.tail = this.body.getChild("tail");
		this.cube_r65 = this.tail.getChild("cube_r65");
		this.cube_r66 = this.tail.getChild("cube_r66");
		this.cube_r67 = this.tail.getChild("cube_r67");
		this.cube_r68 = this.tail.getChild("cube_r68");
		this.face = this.body.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition wheels_pd = total_pd.addOrReplaceChild("wheels",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition wheel1_pd = wheels_pd.addOrReplaceChild("wheel1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F)
				.texOffs(61, 77).addBox(-0.25F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(9.0F, 0.0F, -10.0F));
		PartDefinition cube_r1_pd = wheel1_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = wheel1_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r3_pd = wheel1_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r4_pd = wheel1_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r5_pd = wheel1_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r6_pd = wheel1_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r7_pd = wheel1_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8_pd = wheel1_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r9_pd = wheel1_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r10_pd = wheel1_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r11_pd = wheel1_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r12_pd = wheel1_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r13_pd = wheel1_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r14_pd = wheel1_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r15_pd = wheel1_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wheel2_pd = wheels_pd.addOrReplaceChild("wheel2",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F)
				.texOffs(45, 102).addBox(-1.75F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(-9.0F, 0.0F, -10.0F));
		PartDefinition cube_r16_pd = wheel2_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r17_pd = wheel2_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r18_pd = wheel2_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r19_pd = wheel2_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r20_pd = wheel2_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r21_pd = wheel2_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r22_pd = wheel2_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r23_pd = wheel2_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r24_pd = wheel2_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r25_pd = wheel2_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r26_pd = wheel2_pd.addOrReplaceChild("cube_r26",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r27_pd = wheel2_pd.addOrReplaceChild("cube_r27",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r28_pd = wheel2_pd.addOrReplaceChild("cube_r28",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r29_pd = wheel2_pd.addOrReplaceChild("cube_r29",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r30_pd = wheel2_pd.addOrReplaceChild("cube_r30",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wheel3_pd = wheels_pd.addOrReplaceChild("wheel3",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F)
				.texOffs(58, 85).addBox(-0.25F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(9.0F, 0.0F, 11.0F));
		PartDefinition cube_r31_pd = wheel3_pd.addOrReplaceChild("cube_r31",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r32_pd = wheel3_pd.addOrReplaceChild("cube_r32",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r33_pd = wheel3_pd.addOrReplaceChild("cube_r33",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r34_pd = wheel3_pd.addOrReplaceChild("cube_r34",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r35_pd = wheel3_pd.addOrReplaceChild("cube_r35",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r36_pd = wheel3_pd.addOrReplaceChild("cube_r36",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r37_pd = wheel3_pd.addOrReplaceChild("cube_r37",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r38_pd = wheel3_pd.addOrReplaceChild("cube_r38",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r39_pd = wheel3_pd.addOrReplaceChild("cube_r39",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r40_pd = wheel3_pd.addOrReplaceChild("cube_r40",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r41_pd = wheel3_pd.addOrReplaceChild("cube_r41",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r42_pd = wheel3_pd.addOrReplaceChild("cube_r42",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r43_pd = wheel3_pd.addOrReplaceChild("cube_r43",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r44_pd = wheel3_pd.addOrReplaceChild("cube_r44",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r45_pd = wheel3_pd.addOrReplaceChild("cube_r45",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wheel4_pd = wheels_pd.addOrReplaceChild("wheel4",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F)
				.texOffs(58, 93).addBox(-1.75F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(-9.0F, 0.0F, 11.0F));
		PartDefinition cube_r46_pd = wheel4_pd.addOrReplaceChild("cube_r46",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r47_pd = wheel4_pd.addOrReplaceChild("cube_r47",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r48_pd = wheel4_pd.addOrReplaceChild("cube_r48",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r49_pd = wheel4_pd.addOrReplaceChild("cube_r49",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r50_pd = wheel4_pd.addOrReplaceChild("cube_r50",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r51_pd = wheel4_pd.addOrReplaceChild("cube_r51",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r52_pd = wheel4_pd.addOrReplaceChild("cube_r52",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r53_pd = wheel4_pd.addOrReplaceChild("cube_r53",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r54_pd = wheel4_pd.addOrReplaceChild("cube_r54",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));
		PartDefinition cube_r55_pd = wheel4_pd.addOrReplaceChild("cube_r55",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r56_pd = wheel4_pd.addOrReplaceChild("cube_r56",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r57_pd = wheel4_pd.addOrReplaceChild("cube_r57",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r58_pd = wheel4_pd.addOrReplaceChild("cube_r58",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r59_pd = wheel4_pd.addOrReplaceChild("cube_r59",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r60_pd = wheel4_pd.addOrReplaceChild("cube_r60",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition base_pd = total_pd.addOrReplaceChild("base",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-8.0F, 1.0F, -16.0F, 3.0F, 4.0F, 32.0F)
				.texOffs(40, 4).addBox(5.0F, 1.0F, -16.0F, 3.0F, 4.0F, 32.0F)
				.texOffs(79, 0).addBox(-5.0F, 3.0F, -16.0F, 10.0F, 2.0F, 32.0F)
				.texOffs(72, 76).addBox(-9.0F, 2.0F, -6.5F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.75F))
				.texOffs(93, 62).addBox(7.0F, 2.0F, -6.5F, 2.0F, 2.0F, 14.0F, new CubeDeformation(-0.75F)),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -9.0F, 10.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition corn_pd = body_pd.addOrReplaceChild("corn",
			CubeListBuilder.create()
				.texOffs(0, 37).addBox(-4.5F, -28.0F, -2.5F, 9.0F, 29.0F, 9.0F)
				.texOffs(41, 19).addBox(-3.5F, -28.75F, -1.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 3.0F, -2.0F));
		PartDefinition outer_pd = body_pd.addOrReplaceChild("outer",
			CubeListBuilder.create()
				.texOffs(99, 35).addBox(-5.0F, 4.25F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(-0.25F))
				.texOffs(106, 48).addBox(-4.0F, 4.5F, -4.0F, 8.0F, 1.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition layer1_pd = outer_pd.addOrReplaceChild("layer1",
			CubeListBuilder.create()
				.texOffs(10, 23).addBox(-5.25F, -22.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(38, 41).addBox(-5.25F, -19.0F, -5.0F, 1.0F, 24.0F, 10.0F, new CubeDeformation(-0.25F))
				.texOffs(20, 22).addBox(-5.25F, -20.5F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(10, 16).addBox(-5.25F, -20.5F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(22, 16).addBox(-5.25F, -22.0F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(11, 10).addBox(-5.25F, -23.5F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(21, 10).addBox(-5.25F, -23.5F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition layer2_pd = outer_pd.addOrReplaceChild("layer2",
			CubeListBuilder.create()
				.texOffs(10, 0).addBox(-5.25F, -22.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(60, 41).addBox(-5.25F, -19.0F, -5.0F, 1.0F, 24.0F, 10.0F, new CubeDeformation(-0.25F))
				.texOffs(20, 1).addBox(-5.25F, -20.5F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(41, 0).addBox(-5.25F, -20.5F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(54, 0).addBox(-5.25F, -22.0F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 8).addBox(-5.25F, -23.5F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(40, 14).addBox(-5.25F, -23.5F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(9.5F, 0.0F, 0.0F));
		PartDefinition layer3_pd = outer_pd.addOrReplaceChild("layer3",
			CubeListBuilder.create()
				.texOffs(51, 8).addBox(-5.25F, -22.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(83, 40).addBox(-5.25F, -19.0F, -5.0F, 1.0F, 24.0F, 10.0F, new CubeDeformation(-0.25F))
				.texOffs(80, 0).addBox(-5.25F, -20.5F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(80, 8).addBox(-5.25F, -20.5F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(81, 16).addBox(-5.25F, -22.0F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(82, 24).addBox(-5.25F, -23.5F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(92, 24).addBox(-5.25F, -23.5F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition layer4_pd = outer_pd.addOrReplaceChild("layer4",
			CubeListBuilder.create()
				.texOffs(92, 16).addBox(-5.25F, -22.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 76).addBox(-5.25F, -19.0F, -5.0F, 1.0F, 24.0F, 10.0F, new CubeDeformation(-0.25F))
				.texOffs(93, 0).addBox(-5.25F, -20.5F, 1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(92, 8).addBox(-5.25F, -20.5F, -5.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
				.texOffs(14, 77).addBox(-5.25F, -22.0F, 2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 78).addBox(-5.25F, -23.5F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(0, 38).addBox(-5.25F, -23.5F, 3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition leaves_pd = outer_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaf1_pd = leaves_pd.addOrReplaceChild("leaf1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition l1_pd = leaf1_pd.addOrReplaceChild("l1",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-4.25F, -22.5F, 4.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r61_pd = l1_pd.addOrReplaceChild("cube_r61",
			CubeListBuilder.create()
				.texOffs(25, 77).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone_pd = l1_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(23, 82).addBox(-1.0F, -1.2013F, -0.8827F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -0.5F, 1.5F));
		PartDefinition leaf2_pd = leaves_pd.addOrReplaceChild("leaf2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition l2_pd = leaf2_pd.addOrReplaceChild("l2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-4.25F, -22.5F, 4.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r62_pd = l2_pd.addOrReplaceChild("cube_r62",
			CubeListBuilder.create()
				.texOffs(23, 86).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone2_pd = l2_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(24, 92).addBox(-1.0F, -1.2013F, -0.8827F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -0.5F, 1.5F));
		PartDefinition leaf3_pd = leaves_pd.addOrReplaceChild("leaf3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition l3_pd = leaf3_pd.addOrReplaceChild("l3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-4.25F, -22.5F, 4.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r63_pd = l3_pd.addOrReplaceChild("cube_r63",
			CubeListBuilder.create()
				.texOffs(24, 98).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone3_pd = l3_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(24, 104).addBox(-1.0F, -1.2013F, -0.8827F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -0.5F, 1.5F));
		PartDefinition leaf4_pd = leaves_pd.addOrReplaceChild("leaf4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition l4_pd = leaf4_pd.addOrReplaceChild("l4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-4.25F, -22.5F, 4.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r64_pd = l4_pd.addOrReplaceChild("cube_r64",
			CubeListBuilder.create()
				.texOffs(37, 77).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone4_pd = l4_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(35, 82).addBox(-1.0F, -1.2013F, -0.8827F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -0.5F, 1.5F));
		PartDefinition tail_pd = body_pd.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(49, 76).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.75F))
				.texOffs(45, 88).addBox(-1.0F, 1.2474F, -2.0557F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition cube_r65_pd = tail_pd.addOrReplaceChild("cube_r65",
			CubeListBuilder.create()
				.texOffs(45, 94).addBox(-1.0F, -2.8192F, -1.5736F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 4.1305F, -0.6718F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r66_pd = tail_pd.addOrReplaceChild("cube_r66",
			CubeListBuilder.create()
				.texOffs(35, 102).addBox(-1.0F, -2.5F, -1.866F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 4.0681F, -1.2443F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r67_pd = tail_pd.addOrReplaceChild("cube_r67",
			CubeListBuilder.create()
				.texOffs(36, 94).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 2.5516F, -1.6933F, -1.6581F, 0.0F, 0.0F));
		PartDefinition cube_r68_pd = tail_pd.addOrReplaceChild("cube_r68",
			CubeListBuilder.create()
				.texOffs(34, 88).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 1.0382F, -2.3037F, 0.7418F, 0.0F, 0.0F));
		PartDefinition face_pd = body_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(77, 79).addBox(-5.5F, -7.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F))
				.texOffs(58, 101).addBox(4.5F, -7.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(CobCannonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.isPlayerRiding()) {
			this.wheel1.xRot = ageInTicks / 2;
			this.wheel2.xRot = ageInTicks / 2;
			this.wheel3.xRot = ageInTicks / 2;
			this.wheel4.xRot = ageInTicks / 2;
		} else {
			this.wheel1.xRot = 0;
			this.wheel2.xRot = 0;
			this.wheel3.xRot = 0;
			this.wheel4.xRot = 0;
		}
		if(entity.getAttackTime() > 0) {
			int time = entity.getAnimCD() - entity.getAttackTime() + 1;
			this.body.xRot = 1.5708F - AnimationUtil.getUpDown(time, entity.getAnimCD(), 90);
			this.corn.visible = (time < entity.getAnimCD() / 2);
		} else {
			this.corn.visible = (entity.getCornNum() > 0);
			this.body.xRot = 1.5708F;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<CobCannonEntity> getPlantModel() {
		return this;
	}
}