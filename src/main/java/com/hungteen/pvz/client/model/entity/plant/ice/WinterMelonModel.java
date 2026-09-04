package com.hungteen.pvz.client.model.entity.plant.ice;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.ice.WinterMelonEntity;
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
public class WinterMelonModel extends PVZPlantModel<WinterMelonEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "winter_melon"), "main");

	private final ModelPart total;
	private final ModelPart leaves;
	private final ModelPart leave1;
	private final ModelPart leave2;
	private final ModelPart leave3;
	private final ModelPart leave4;
	private final ModelPart body;
	private final ModelPart pult;
	private final ModelPart basket;
	private final ModelPart melon;
	private final ModelPart cube_r1;
	private final ModelPart ice;
	private final ModelPart ice1;
	private final ModelPart bone;
	private final ModelPart cube_r2;
	private final ModelPart bone2;
	private final ModelPart cube_r3;
	private final ModelPart bone3;
	private final ModelPart cube_r4;
	private final ModelPart bone4;
	private final ModelPart cube_r5;
	private final ModelPart bone5;
	private final ModelPart cube_r6;
	private final ModelPart bone6;
	private final ModelPart cube_r7;
	private final ModelPart bone7;
	private final ModelPart cube_r8;
	private final ModelPart ice2;
	private final ModelPart bone13;
	private final ModelPart cube_r9;
	private final ModelPart bone14;
	private final ModelPart cube_r10;
	private final ModelPart bone15;
	private final ModelPart cube_r11;
	private final ModelPart bone16;
	private final ModelPart cube_r12;
	private final ModelPart bone17;
	private final ModelPart cube_r13;
	private final ModelPart bone18;
	private final ModelPart cube_r14;
	private final ModelPart bone19;
	private final ModelPart cube_r15;
	private final ModelPart ice3;
	private final ModelPart bone8;
	private final ModelPart cube_r16;
	private final ModelPart bone9;
	private final ModelPart cube_r17;
	private final ModelPart bone10;
	private final ModelPart cube_r18;
	private final ModelPart bone11;
	private final ModelPart cube_r19;
	private final ModelPart bone12;
	private final ModelPart cube_r20;
	private final ModelPart ice4;
	private final ModelPart bone20;
	private final ModelPart cube_r21;
	private final ModelPart bone21;
	private final ModelPart cube_r22;
	private final ModelPart bone22;
	private final ModelPart cube_r23;
	private final ModelPart bone23;
	private final ModelPart cube_r24;
	private final ModelPart bone24;
	private final ModelPart cube_r25;
	private final ModelPart face;




public WinterMelonModel(ModelPart root) {
		this.total = root.getChild("total");
		this.leaves = root.getChild("leaves");
		this.leave1 = root.getChild("leave1");
		this.leave2 = root.getChild("leave2");
		this.leave3 = root.getChild("leave3");
		this.leave4 = root.getChild("leave4");
		this.body = root.getChild("body");
		this.pult = root.getChild("pult");
		this.basket = root.getChild("basket");
		this.melon = root.getChild("melon");
		this.cube_r1 = root.getChild("cube_r1");
		this.ice = root.getChild("ice");
		this.ice1 = root.getChild("ice1");
		this.bone = root.getChild("bone");
		this.cube_r2 = root.getChild("cube_r2");
		this.bone2 = root.getChild("bone2");
		this.cube_r3 = root.getChild("cube_r3");
		this.bone3 = root.getChild("bone3");
		this.cube_r4 = root.getChild("cube_r4");
		this.bone4 = root.getChild("bone4");
		this.cube_r5 = root.getChild("cube_r5");
		this.bone5 = root.getChild("bone5");
		this.cube_r6 = root.getChild("cube_r6");
		this.bone6 = root.getChild("bone6");
		this.cube_r7 = root.getChild("cube_r7");
		this.bone7 = root.getChild("bone7");
		this.cube_r8 = root.getChild("cube_r8");
		this.ice2 = root.getChild("ice2");
		this.bone13 = root.getChild("bone13");
		this.cube_r9 = root.getChild("cube_r9");
		this.bone14 = root.getChild("bone14");
		this.cube_r10 = root.getChild("cube_r10");
		this.bone15 = root.getChild("bone15");
		this.cube_r11 = root.getChild("cube_r11");
		this.bone16 = root.getChild("bone16");
		this.cube_r12 = root.getChild("cube_r12");
		this.bone17 = root.getChild("bone17");
		this.cube_r13 = root.getChild("cube_r13");
		this.bone18 = root.getChild("bone18");
		this.cube_r14 = root.getChild("cube_r14");
		this.bone19 = root.getChild("bone19");
		this.cube_r15 = root.getChild("cube_r15");
		this.ice3 = root.getChild("ice3");
		this.bone8 = root.getChild("bone8");
		this.cube_r16 = root.getChild("cube_r16");
		this.bone9 = root.getChild("bone9");
		this.cube_r17 = root.getChild("cube_r17");
		this.bone10 = root.getChild("bone10");
		this.cube_r18 = root.getChild("cube_r18");
		this.bone11 = root.getChild("bone11");
		this.cube_r19 = root.getChild("cube_r19");
		this.bone12 = root.getChild("bone12");
		this.cube_r20 = root.getChild("cube_r20");
		this.ice4 = root.getChild("ice4");
		this.bone20 = root.getChild("bone20");
		this.cube_r21 = root.getChild("cube_r21");
		this.bone21 = root.getChild("bone21");
		this.cube_r22 = root.getChild("cube_r22");
		this.bone22 = root.getChild("bone22");
		this.cube_r23 = root.getChild("cube_r23");
		this.bone23 = root.getChild("bone23");
		this.cube_r24 = root.getChild("cube_r24");
		this.bone24 = root.getChild("bone24");
		this.cube_r25 = root.getChild("cube_r25");
		this.face = root.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 23.75F, 0.0F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.25F, 0.0F));
		PartDefinition leave1_pd = leaves_pd.addOrReplaceChild("leave1",
			CubeListBuilder.create()
				.texOffs(48, 97).addBox(0.0F, -1.0F, 2.0F, 3.0F, 1.0F, 3.0F)
				.texOffs(60, 98).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(-9.0F, 0.0F, -9.0F));
		PartDefinition leave2_pd = leaves_pd.addOrReplaceChild("leave2",
			CubeListBuilder.create()
				.texOffs(68, 97).addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F)
				.texOffs(78, 97).addBox(2.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(6.0F, 0.0F, -5.0F));
		PartDefinition leave3_pd = leaves_pd.addOrReplaceChild("leave3",
			CubeListBuilder.create()
				.texOffs(0, 85).addBox(-7.0F, -1.0F, 2.0F, 3.0F, 1.0F, 3.0F)
				.texOffs(0, 82).addBox(-8.0F, -1.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(-2.0F, 0.0F, 2.0F));
		PartDefinition leave4_pd = leaves_pd.addOrReplaceChild("leave4",
			CubeListBuilder.create()
				.texOffs(8, 80).addBox(4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 3.0F)
				.texOffs(0, 79).addBox(6.0F, -1.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(2.0F, 0.0F, 2.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 106).addBox(-8.0F, -11.0F, -6.0F, 16.0F, 10.0F, 12.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 112).addBox(-6.5F, -9.5F, -6.25F, 13.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(56, 112).addBox(-8.25F, -9.5F, -4.5F, 1.0F, 7.0F, 9.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 112).addBox(7.25F, -9.5F, -4.5F, 1.0F, 7.0F, 9.0F, new CubeDeformation(-0.2F))
				.texOffs(100, 120).addBox(-6.5F, -9.5F, 5.25F, 13.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(84, 102).addBox(-6.5F, -11.25F, -4.5F, 13.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F))
				.texOffs(49, 101).addBox(-6.5F, -1.75F, -4.5F, 13.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition pult_pd = total_pd.addOrReplaceChild("pult",
			CubeListBuilder.create()
				.texOffs(102, 80).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.2F))
				.texOffs(75, 89).addBox(-1.0F, -1.0F, 8.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -6.5F, 6.0F));
		PartDefinition basket_pd = pult_pd.addOrReplaceChild("basket",
			CubeListBuilder.create()
				.texOffs(96, 93).addBox(-4.0F, 0.0F, 12.0F, 8.0F, 1.0F, 8.0F)
				.texOffs(0, 103).addBox(-4.0F, -2.0F, 11.0F, 8.0F, 2.0F, 1.0F)
				.texOffs(0, 100).addBox(-4.0F, -2.0F, 20.0F, 8.0F, 2.0F, 1.0F)
				.texOffs(34, 79).addBox(-5.0F, -2.0F, 11.0F, 1.0F, 2.0F, 10.0F)
				.texOffs(51, 83).addBox(4.0F, -2.0F, 11.0F, 1.0F, 2.0F, 10.0F),
			PartPose.offset(0.0F, 0.75F, 1.75F));
		PartDefinition melon_pd = basket_pd.addOrReplaceChild("melon",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-0.5F, 0.0F, 12.5F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r1_pd = melon_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(10, 82).addBox(-3.0F, -6.0541F, -0.2441F, 7.0F, 6.0F, 10.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition ice_pd = basket_pd.addOrReplaceChild("ice",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 15.5F));
		PartDefinition ice1_pd = ice_pd.addOrReplaceChild("ice1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = ice1_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition cube_r2_pd = bone_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone2_pd = ice1_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 5.0F));
		PartDefinition cube_r3_pd = bone2_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone3_pd = ice1_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(4.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition cube_r4_pd = bone3_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(5.0F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone4_pd = ice1_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-3.0F, 0.0F, 5.0F));
		PartDefinition cube_r5_pd = bone4_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone5_pd = ice1_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-1.5F, 0.0F, 5.0F));
		PartDefinition cube_r6_pd = bone5_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone6_pd = ice1_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(1.5F, 0.0F, 5.0F));
		PartDefinition cube_r7_pd = bone6_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone7_pd = ice1_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(3.0F, 0.0F, 5.0F));
		PartDefinition cube_r8_pd = bone7_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition ice2_pd = ice_pd.addOrReplaceChild("ice2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, -9.0F));
		PartDefinition bone13_pd = ice2_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition cube_r9_pd = bone13_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone14_pd = ice2_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 5.0F));
		PartDefinition cube_r10_pd = bone14_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone15_pd = ice2_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(4.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 5.0F));
		PartDefinition cube_r11_pd = bone15_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(5.0F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone16_pd = ice2_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-3.0F, 0.0F, 5.0F));
		PartDefinition cube_r12_pd = bone16_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone17_pd = ice2_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-1.5F, 0.0F, 5.0F));
		PartDefinition cube_r13_pd = bone17_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone18_pd = ice2_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(1.5F, 0.0F, 5.0F));
		PartDefinition cube_r14_pd = bone18_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone19_pd = ice2_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(3.0F, 0.0F, 5.0F));
		PartDefinition cube_r15_pd = bone19_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.5F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition ice3_pd = ice_pd.addOrReplaceChild("ice3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone8_pd = ice3_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 3.5F));
		PartDefinition cube_r16_pd = bone8_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone9_pd = ice3_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 2.0F));
		PartDefinition cube_r17_pd = bone9_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone10_pd = ice3_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 0.5F));
		PartDefinition cube_r18_pd = bone10_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone11_pd = ice3_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, -1.0F));
		PartDefinition cube_r19_pd = bone11_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone12_pd = bone11_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r20_pd = bone12_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, -1.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition ice4_pd = ice_pd.addOrReplaceChild("ice4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone20_pd = ice4_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(8.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 3.5F));
		PartDefinition cube_r21_pd = bone20_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone21_pd = ice4_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(8.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 2.0F));
		PartDefinition cube_r22_pd = bone21_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone22_pd = ice4_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(8.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, 0.5F));
		PartDefinition cube_r23_pd = bone22_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone23_pd = ice4_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(8.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(-4.5F, 0.0F, -1.0F));
		PartDefinition cube_r24_pd = bone23_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(9.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone24_pd = bone23_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(8.5F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r25_pd = bone24_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(0, 74).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(9.0F, 1.0F, -1.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(0, 114).addBox(-4.0F, -7.5F, -4.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(0, 110).addBox(2.0F, -7.5F, -4.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, 0.75F, -2.25F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(WinterMelonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.melon.visible = (percent < 0.5);
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.melon.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<WinterMelonEntity> getPlantModel() {
		return this;
	}
}