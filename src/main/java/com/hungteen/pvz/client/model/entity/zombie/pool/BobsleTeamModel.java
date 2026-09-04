package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.zombie.pool.BobsleTeamEntity;
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
public class BobsleTeamModel extends PVZEntityModel<BobsleTeamEntity> implements IZombieModel<BobsleTeamEntity>{
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "bobsle_team"), "main");

	
	private final ModelPart total;
	private final ModelPart z1;
	private final ModelPart head;
	private final ModelPart right_hand;
	private final ModelPart left_hand;
	private final ModelPart body;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart z2;
	private final ModelPart head2;
	private final ModelPart right_hand2;
	private final ModelPart left_hand2;
	private final ModelPart body2;
	private final ModelPart right_leg2;
	private final ModelPart left_leg2;
	private final ModelPart mid;
	private final ModelPart left;
	private final ModelPart right;
	private final ModelPart z3;
	private final ModelPart head3;
	private final ModelPart right_hand3;
	private final ModelPart left_hand3;
	private final ModelPart body3;
	private final ModelPart right_leg3;
	private final ModelPart left_leg3;
	private final ModelPart z4;
	private final ModelPart head4;
	private final ModelPart right_hand4;
	private final ModelPart left_hand4;
	private final ModelPart body4;
	private final ModelPart right_leg4;
	private final ModelPart left_leg4;
	private final ModelPart Head;
	private final ModelPart wheal;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart wheal2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart wheal3;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart wheal4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart tail;




public BobsleTeamModel(ModelPart root) {
		this.total = root.getChild("total");
		this.z1 = root.getChild("z1");
		this.head = root.getChild("head");
		this.right_hand = root.getChild("right_hand");
		this.left_hand = root.getChild("left_hand");
		this.body = root.getChild("body");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.z2 = root.getChild("z2");
		this.head2 = root.getChild("head2");
		this.right_hand2 = root.getChild("right_hand2");
		this.left_hand2 = root.getChild("left_hand2");
		this.body2 = root.getChild("body2");
		this.right_leg2 = root.getChild("right_leg2");
		this.left_leg2 = root.getChild("left_leg2");
		this.mid = root.getChild("mid");
		this.left = root.getChild("left");
		this.right = root.getChild("right");
		this.z3 = root.getChild("z3");
		this.head3 = root.getChild("head3");
		this.right_hand3 = root.getChild("right_hand3");
		this.left_hand3 = root.getChild("left_hand3");
		this.body3 = root.getChild("body3");
		this.right_leg3 = root.getChild("right_leg3");
		this.left_leg3 = root.getChild("left_leg3");
		this.z4 = root.getChild("z4");
		this.head4 = root.getChild("head4");
		this.right_hand4 = root.getChild("right_hand4");
		this.left_hand4 = root.getChild("left_hand4");
		this.body4 = root.getChild("body4");
		this.right_leg4 = root.getChild("right_leg4");
		this.left_leg4 = root.getChild("left_leg4");
		this.Head = root.getChild("Head");
		this.wheal = root.getChild("wheal");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.wheal2 = root.getChild("wheal2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.wheal3 = root.getChild("wheal3");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.wheal4 = root.getChild("wheal4");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 2.0F, -8.0F));
		PartDefinition z1_pd = total_pd.addOrReplaceChild("z1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 29.0F));
		PartDefinition head_pd = z1_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(3, 192).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(109, 234).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(59, 199).addBox(-7.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(100, 201).addBox(6.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(142, 200).addBox(6.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(187, 214).addBox(-6.0F, -6.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(222, 217).addBox(-6.0F, -10.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(181, 192).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 5.0F, 1.0F)
				.texOffs(222, 198).addBox(-5.0F, -11.0F, -7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(134, 187).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -23.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition right_hand_pd = z1_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(77, 224).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(-9.0F, -21.0F, 0.0F));
		PartDefinition left_hand_pd = z1_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(54, 227).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(10.0F, -21.0F, 0.0F));
		PartDefinition body_pd = z1_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(5, 224).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 23.0F, 6.0F),
			PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition right_leg_pd = z1_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(184, 229).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(149, 238).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -1.309F, -0.7854F, 0.0F));
		PartDefinition left_leg_pd = z1_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(238, 228).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(203, 240).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -1.309F, 0.7854F, 0.0F));
		PartDefinition z2_pd = total_pd.addOrReplaceChild("z2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 49.0F));
		PartDefinition head2_pd = z2_pd.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(3, 192).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(109, 234).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(59, 199).addBox(-7.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(100, 201).addBox(6.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(142, 200).addBox(6.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(187, 214).addBox(-6.0F, -6.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(222, 217).addBox(-6.0F, -10.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(181, 192).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 5.0F, 1.0F)
				.texOffs(222, 198).addBox(-5.0F, -11.0F, -7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(134, 187).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -23.0F, 0.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition right_hand2_pd = z2_pd.addOrReplaceChild("right_hand2",
			CubeListBuilder.create()
				.texOffs(77, 224).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(-9.0F, -21.0F, 0.0F));
		PartDefinition left_hand2_pd = z2_pd.addOrReplaceChild("left_hand2",
			CubeListBuilder.create()
				.texOffs(54, 227).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(10.0F, -21.0F, 0.0F));
		PartDefinition body2_pd = z2_pd.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(5, 224).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 23.0F, 6.0F),
			PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition right_leg2_pd = z2_pd.addOrReplaceChild("right_leg2",
			CubeListBuilder.create()
				.texOffs(184, 229).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(149, 238).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -1.309F, -0.7854F, 0.0F));
		PartDefinition left_leg2_pd = z2_pd.addOrReplaceChild("left_leg2",
			CubeListBuilder.create()
				.texOffs(238, 228).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(203, 240).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -1.309F, 0.7854F, 0.0F));
		PartDefinition mid_pd = total_pd.addOrReplaceChild("mid",
			CubeListBuilder.create()
				.texOffs(284, 421).addBox(-14.0F, 4.0F, -17.0F, 28.0F, 1.0F, 84.0F)
				.texOffs(459, 402).addBox(-8.0F, -4.0F, -3.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(402, 399).addBox(-8.0F, -4.0F, 17.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(463, 372).addBox(-8.0F, -4.0F, 37.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(402, 368).addBox(-8.0F, -4.0F, 57.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(440, 350).addBox(-14.0F, -2.0F, 67.0F, 28.0F, 7.0F, 1.0F),
			PartPose.offset(0.0F, 8.0F, 29.0F));
		PartDefinition left_pd = mid_pd.addOrReplaceChild("left",
			CubeListBuilder.create()
				.texOffs(9, 399).addBox(1.0F, -24.0F, -41.0F, 1.0F, 25.0F, 84.0F),
			PartPose.offset(13.0F, 4.0F, 24.0F));
		PartDefinition right_pd = mid_pd.addOrReplaceChild("right",
			CubeListBuilder.create()
				.texOffs(336, 7).addBox(-2.0F, -24.0F, -42.0F, 1.0F, 25.0F, 84.0F),
			PartPose.offset(-13.0F, 4.0F, 25.0F));
		PartDefinition z3_pd = total_pd.addOrReplaceChild("z3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 69.0F));
		PartDefinition head3_pd = z3_pd.addOrReplaceChild("head3",
			CubeListBuilder.create()
				.texOffs(3, 192).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(109, 234).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(59, 199).addBox(-7.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(100, 201).addBox(6.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(142, 200).addBox(6.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(187, 214).addBox(-6.0F, -6.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(222, 217).addBox(-6.0F, -10.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(181, 192).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 5.0F, 1.0F)
				.texOffs(222, 198).addBox(-5.0F, -11.0F, -7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(134, 187).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -23.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition right_hand3_pd = z3_pd.addOrReplaceChild("right_hand3",
			CubeListBuilder.create()
				.texOffs(77, 224).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offsetAndRotation(-9.0F, -21.0F, 0.0F, -1.309F, 0.1745F, 0.0F));
		PartDefinition left_hand3_pd = z3_pd.addOrReplaceChild("left_hand3",
			CubeListBuilder.create()
				.texOffs(54, 227).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(10.0F, -21.0F, 0.0F));
		PartDefinition body3_pd = z3_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(5, 224).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 23.0F, 6.0F),
			PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition right_leg3_pd = z3_pd.addOrReplaceChild("right_leg3",
			CubeListBuilder.create()
				.texOffs(184, 229).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(149, 238).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -1.309F, -0.7854F, 0.0F));
		PartDefinition left_leg3_pd = z3_pd.addOrReplaceChild("left_leg3",
			CubeListBuilder.create()
				.texOffs(238, 228).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(203, 240).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -1.309F, 0.7854F, 0.0F));
		PartDefinition z4_pd = total_pd.addOrReplaceChild("z4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 89.0F));
		PartDefinition head4_pd = z4_pd.addOrReplaceChild("head4",
			CubeListBuilder.create()
				.texOffs(3, 192).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(109, 234).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(59, 199).addBox(-7.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(100, 201).addBox(6.0F, -6.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(142, 200).addBox(6.0F, -10.0F, -7.0F, 1.0F, 1.0F, 14.0F)
				.texOffs(187, 214).addBox(-6.0F, -6.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(222, 217).addBox(-6.0F, -10.0F, 6.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(181, 192).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 5.0F, 1.0F)
				.texOffs(222, 198).addBox(-5.0F, -11.0F, -7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(134, 187).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -23.0F, 0.0F));
		PartDefinition right_hand4_pd = z4_pd.addOrReplaceChild("right_hand4",
			CubeListBuilder.create()
				.texOffs(77, 224).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(-9.0F, -21.0F, 0.0F));
		PartDefinition left_hand4_pd = z4_pd.addOrReplaceChild("left_hand4",
			CubeListBuilder.create()
				.texOffs(54, 227).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offsetAndRotation(10.0F, -21.0F, 0.0F, -2.0071F, 0.0F, 0.0F));
		PartDefinition body4_pd = z4_pd.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(5, 224).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 23.0F, 6.0F),
			PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition right_leg4_pd = z4_pd.addOrReplaceChild("right_leg4",
			CubeListBuilder.create()
				.texOffs(184, 229).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(149, 238).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -1.309F, -0.7854F, 0.0F));
		PartDefinition left_leg4_pd = z4_pd.addOrReplaceChild("left_leg4",
			CubeListBuilder.create()
				.texOffs(238, 228).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 17.0F, 4.0F)
				.texOffs(203, 240).addBox(-3.0F, 17.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, -1.309F, 0.7854F, 0.0F));
		PartDefinition Head_pd = total_pd.addOrReplaceChild("Head",
			CubeListBuilder.create()
				.texOffs(188, 449).addBox(-15.0F, -25.0F, -12.0F, 30.0F, 25.0F, 20.0F)
				.texOffs(129, 436).addBox(-13.0F, -15.0F, -17.0F, 26.0F, 15.0F, 5.0F)
				.texOffs(13, 378).addBox(-10.0F, -7.0F, -22.0F, 20.0F, 7.0F, 5.0F)
				.texOffs(11, 340).addBox(-15.0F, -27.0F, -2.0F, 30.0F, 2.0F, 21.0F),
			PartPose.offset(0.0F, 13.0F, 4.0F));
		PartDefinition wheal_pd = total_pd.addOrReplaceChild("wheal",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-1.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, 16.0F, 6.0F));
		PartDefinition bone_pd = wheal_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone2_pd = wheal_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal2_pd = total_pd.addOrReplaceChild("wheal2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-27.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, 16.0F, 6.0F));
		PartDefinition bone3_pd = wheal2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone4_pd = wheal2_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal3_pd = total_pd.addOrReplaceChild("wheal3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.0F, 70.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 68.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 84.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 85.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 76.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 67.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-1.0F, 3.0F, 65.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, 16.0F, 6.0F));
		PartDefinition bone5_pd = wheal3_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -48.851898F, 55.219398F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone6_pd = wheal3_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 49.494598F, 56.985401F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal4_pd = total_pd.addOrReplaceChild("wheal4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-27.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, 16.0F, 81.0F));
		PartDefinition bone7_pd = wheal4_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone8_pd = wheal4_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition tail_pd = total_pd.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(261, 382).addBox(14.0F, -11.0F, 0.0F, 1.0F, 11.0F, 18.0F)
				.texOffs(184, 378).addBox(-15.0F, -11.0F, 0.0F, 1.0F, 11.0F, 18.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 96.0F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}


	@Override
	public void setupAnim(BobsleTeamEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		
	}

	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		this.z1.visible = false;
		this.z2.visible = false;
		this.z3.visible = false;
		this.z4.visible = false;
		total.render(stack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<BobsleTeamEntity> getZombieModel() {
		return this;
	}
}