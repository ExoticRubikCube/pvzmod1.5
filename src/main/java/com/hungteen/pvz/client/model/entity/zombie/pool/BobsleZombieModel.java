package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.BobsleZombieEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class BobsleZombieModel extends PVZZombieModel<BobsleZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "bobsle_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;




public BobsleZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.body = root.getChild("body");
		this.left_hand = root.getChild("left_hand");
		this.right_hand = root.getChild("right_hand");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(184, 229).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 21.0F, 4.0F)
				.texOffs(149, 238).addBox(-3.0F, 21.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offset(-4.0F, -25.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(238, 228).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 21.0F, 4.0F)
				.texOffs(203, 240).addBox(-3.0F, 21.0F, -6.0F, 6.0F, 4.0F, 9.0F),
			PartPose.offset(4.0F, -25.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(5, 224).addBox(-8.0F, -23.0F, -3.0F, 16.0F, 23.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(54, 227).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(10.0F, -21.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(77, 224).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(-10.0F, -21.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
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
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public ModelPart getZombieLeftHand() {
		return this.left_hand;
	}

	@Override
	public ModelPart getZombieRightHand() {
		return this.right_hand;
	}

	@Override
	public ModelPart getZombieLeftLeg() {
		return this.left_leg;
	}

	@Override
	public ModelPart getZombieRightLeg() {
		return this.right_leg;
	}

	@Override
	public ModelPart getZombieHead() {
		return this.head;
	}
	
	@Override
	public ModelPart getZombieUpBody() {
		return this.up;
	}

	@Override
	public ModelPart getZombieWholeBody() {
		return this.total;
	}
	
}