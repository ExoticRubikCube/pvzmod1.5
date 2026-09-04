package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.ButterPultEntity;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity.CornTypes;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity;
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
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class KernelPultModel<T extends KernelPultEntity> extends PVZPlantModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "kernel_pult"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart face;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart leaves;
	private final ModelPart leave1;
	private final ModelPart cube_r3;
	private final ModelPart bone;
	private final ModelPart cube_r4;
	private final ModelPart bone3;
	private final ModelPart cube_r5;
	private final ModelPart bone2;
	private final ModelPart cube_r6;
	private final ModelPart leave2;
	private final ModelPart cube_r7;
	private final ModelPart bone4;
	private final ModelPart cube_r8;
	private final ModelPart bone5;
	private final ModelPart cube_r9;
	private final ModelPart bone6;
	private final ModelPart cube_r10;
	private final ModelPart leave3;
	private final ModelPart cube_r11;
	private final ModelPart bone7;
	private final ModelPart cube_r12;
	private final ModelPart bone8;
	private final ModelPart cube_r13;
	private final ModelPart bone9;
	private final ModelPart cube_r14;
	private final ModelPart leave4;
	private final ModelPart cube_r15;
	private final ModelPart bone10;
	private final ModelPart cube_r16;
	private final ModelPart bone11;
	private final ModelPart cube_r17;
	private final ModelPart bone12;
	private final ModelPart cube_r18;
	private final ModelPart leave5;
	private final ModelPart cube_r19;
	private final ModelPart bone13;
	private final ModelPart cube_r20;
	private final ModelPart bone14;
	private final ModelPart cube_r21;
	private final ModelPart bone15;
	private final ModelPart cube_r22;
	private final ModelPart leave6;
	private final ModelPart cube_r23;
	private final ModelPart bone16;
	private final ModelPart cube_r24;
	private final ModelPart bone17;
	private final ModelPart cube_r25;
	private final ModelPart bone18;
	private final ModelPart cube_r26;
	private final ModelPart pult;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart cube_r29;
	private final ModelPart basket;
	private final ModelPart butter;
	private final ModelPart kernel;




public KernelPultModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = root.getChild("head");
		this.face = root.getChild("face");
		this.cube_r1 = root.getChild("cube_r1");
		this.cube_r2 = root.getChild("cube_r2");
		this.leaves = root.getChild("leaves");
		this.leave1 = root.getChild("leave1");
		this.cube_r3 = root.getChild("cube_r3");
		this.bone = root.getChild("bone");
		this.cube_r4 = root.getChild("cube_r4");
		this.bone3 = root.getChild("bone3");
		this.cube_r5 = root.getChild("cube_r5");
		this.bone2 = root.getChild("bone2");
		this.cube_r6 = root.getChild("cube_r6");
		this.leave2 = root.getChild("leave2");
		this.cube_r7 = root.getChild("cube_r7");
		this.bone4 = root.getChild("bone4");
		this.cube_r8 = root.getChild("cube_r8");
		this.bone5 = root.getChild("bone5");
		this.cube_r9 = root.getChild("cube_r9");
		this.bone6 = root.getChild("bone6");
		this.cube_r10 = root.getChild("cube_r10");
		this.leave3 = root.getChild("leave3");
		this.cube_r11 = root.getChild("cube_r11");
		this.bone7 = root.getChild("bone7");
		this.cube_r12 = root.getChild("cube_r12");
		this.bone8 = root.getChild("bone8");
		this.cube_r13 = root.getChild("cube_r13");
		this.bone9 = root.getChild("bone9");
		this.cube_r14 = root.getChild("cube_r14");
		this.leave4 = root.getChild("leave4");
		this.cube_r15 = root.getChild("cube_r15");
		this.bone10 = root.getChild("bone10");
		this.cube_r16 = root.getChild("cube_r16");
		this.bone11 = root.getChild("bone11");
		this.cube_r17 = root.getChild("cube_r17");
		this.bone12 = root.getChild("bone12");
		this.cube_r18 = root.getChild("cube_r18");
		this.leave5 = root.getChild("leave5");
		this.cube_r19 = root.getChild("cube_r19");
		this.bone13 = root.getChild("bone13");
		this.cube_r20 = root.getChild("cube_r20");
		this.bone14 = root.getChild("bone14");
		this.cube_r21 = root.getChild("cube_r21");
		this.bone15 = root.getChild("bone15");
		this.cube_r22 = root.getChild("cube_r22");
		this.leave6 = root.getChild("leave6");
		this.cube_r23 = root.getChild("cube_r23");
		this.bone16 = root.getChild("bone16");
		this.cube_r24 = root.getChild("cube_r24");
		this.bone17 = root.getChild("bone17");
		this.cube_r25 = root.getChild("cube_r25");
		this.bone18 = root.getChild("bone18");
		this.cube_r26 = root.getChild("cube_r26");
		this.pult = root.getChild("pult");
		this.cube_r27 = root.getChild("cube_r27");
		this.cube_r28 = root.getChild("cube_r28");
		this.cube_r29 = root.getChild("cube_r29");
		this.basket = root.getChild("basket");
		this.butter = root.getChild("butter");
		this.kernel = root.getChild("kernel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 111).addBox(-6.0F, -4.5F, -6.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(-0.4F))
				.texOffs(48, 111).addBox(-6.0F, -8.25F, -6.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(-0.8F))
				.texOffs(0, 95).addBox(-6.0F, -11.25F, -6.0F, 12.0F, 5.0F, 12.0F, new CubeDeformation(-1.2F))
				.texOffs(48, 98).addBox(-5.0F, -12.25F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(-0.7F))
				.texOffs(88, 109).addBox(-5.0F, -13.75F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(-1.3F))
				.texOffs(88, 102).addBox(-3.0F, -13.25F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
				.texOffs(44, 117).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition face_pd = head_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(2, 84).addBox(-3.0F, -7.75F, -5.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(1, 89).addBox(0.5F, -7.75F, -5.65F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1_pd = face_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(98, 123).addBox(-3.0F, 0.0F, 0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(3.3279F, -8.2351F, -5.5F, 0.0F, 0.0F, 0.2443F));
		PartDefinition cube_r2_pd = face_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(98, 126).addBox(-3.0F, -1.0F, 0.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.75F, -8.0F, -5.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create()
				.texOffs(0, 82).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 1.0F, 12.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leave1_pd = leaves_pd.addOrReplaceChild("leave1",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-5.0F, 0.0F, -3.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition cube_r3_pd = leave1_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(36, 100).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone_pd = leave1_pd.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r4_pd = bone_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(43, 111).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone3_pd = bone_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r5_pd = bone3_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(79, 102).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone2_pd = bone3_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r6_pd = bone2_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(37, 112).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition leave2_pd = leaves_pd.addOrReplaceChild("leave2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r7_pd = leave2_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(108, 100).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone4_pd = leave2_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r8_pd = bone4_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(97, 96).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone5_pd = bone4_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r9_pd = bone5_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(49, 93).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone6_pd = bone5_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r10_pd = bone6_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(79, 99).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition leave3_pd = leaves_pd.addOrReplaceChild("leave3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(5.0F, 0.0F, -3.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition cube_r11_pd = leave3_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(64, 91).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone7_pd = leave3_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r12_pd = bone7_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(85, 92).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone8_pd = bone7_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r13_pd = bone8_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(114, 95).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone9_pd = bone8_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r14_pd = bone9_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(108, 96).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition leave4_pd = leaves_pd.addOrReplaceChild("leave4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 3.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r15_pd = leave4_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(36, 86).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone10_pd = leave4_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r16_pd = bone10_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(50, 86).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone11_pd = bone10_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r17_pd = bone11_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(96, 91).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone12_pd = bone11_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r18_pd = bone12_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(118, 125).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition leave5_pd = leaves_pd.addOrReplaceChild("leave5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r19_pd = leave5_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(108, 88).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone13_pd = leave5_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r20_pd = bone13_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(98, 85).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone14_pd = bone13_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r21_pd = bone14_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(84, 87).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone15_pd = bone14_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r22_pd = bone15_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(108, 125).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition leave6_pd = leaves_pd.addOrReplaceChild("leave6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(5.0F, 0.0F, 3.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition cube_r23_pd = leave6_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(64, 84).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone16_pd = leave6_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r24_pd = bone16_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(112, 82).addBox(-3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.4377F, -0.6026F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone17_pd = bone16_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.9981F, -0.0872F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r25_pd = bone17_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(79, 82).addBox(-4.9981F, -1.0872F, 2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(2.9218F, -0.5407F, -4.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone18_pd = bone17_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-3.0019F, 0.0872F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r26_pd = bone18_pd.addOrReplaceChild("cube_r26",
			CubeListBuilder.create()
				.texOffs(93, 83).addBox(-2.9676F, -0.3365F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0857F, -2.3915F, -1.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition pult_pd = total_pd.addOrReplaceChild("pult",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -13.0F, 0.0F));
		PartDefinition cube_r27_pd = pult_pd.addOrReplaceChild("cube_r27",
			CubeListBuilder.create()
				.texOffs(120, 108).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, -1.6192F, 9.0169F, -1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r28_pd = pult_pd.addOrReplaceChild("cube_r28",
			CubeListBuilder.create()
				.texOffs(0, 112).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, -3.8077F, 1.2387F, -1.8326F, 0.0F, 0.0F));
		PartDefinition cube_r29_pd = pult_pd.addOrReplaceChild("cube_r29",
			CubeListBuilder.create()
				.texOffs(90, 111).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition basket_pd = pult_pd.addOrReplaceChild("basket",
			CubeListBuilder.create()
				.texOffs(37, 79).addBox(-4.0F, -1.0F, 0.0F, 6.0F, 1.0F, 6.0F)
				.texOffs(55, 81).addBox(-4.0F, -4.0F, 6.0F, 6.0F, 3.0F, 1.0F)
				.texOffs(103, 81).addBox(-4.0F, -4.0F, -1.0F, 6.0F, 3.0F, 1.0F)
				.texOffs(28, 73).addBox(2.0F, -4.0F, 0.0F, 1.0F, 3.0F, 6.0F)
				.texOffs(14, 73).addBox(-5.0F, -4.0F, 0.0F, 1.0F, 3.0F, 6.0F),
			PartPose.offset(0.0F, 0.5F, 18.0F));
		PartDefinition butter_pd = basket_pd.addOrReplaceChild("butter",
			CubeListBuilder.create()
				.texOffs(104, 69).addBox(-4.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition kernel_pd = basket_pd.addOrReplaceChild("kernel",
			CubeListBuilder.create()
				.texOffs(0, 99).addBox(-2.0F, -5.0F, 2.0F, 2.0F, 5.0F, 2.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(KernelPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.kernel.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.KERNEL;
			this.butter.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.BUTTER;
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.butter.visible = (entity instanceof ButterPultEntity);
			this.kernel.visible = ! this.butter.visible;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}