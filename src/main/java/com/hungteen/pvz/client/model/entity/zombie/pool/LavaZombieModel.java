package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.custom.LavaZombieEntity;
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
public class LavaZombieModel extends PVZZombieModel<LavaZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "lava_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart right_foot;
	private final ModelPart left_leg;
	private final ModelPart left_foot;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart left_hand;
	private final ModelPart armor;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart right_hand;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;




public LavaZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.right_foot = root.getChild("right_foot");
		this.left_leg = root.getChild("left_leg");
		this.left_foot = root.getChild("left_foot");
		this.up = root.getChild("up");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.left_hand = root.getChild("left_hand");
		this.armor = root.getChild("armor");
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.right_hand = root.getChild("right_hand");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(29, 186).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 23.0F, 6.0F),
			PartPose.offset(-4.0F, -25.0F, 0.0F));
		PartDefinition right_foot_pd = right_leg_pd.addOrReplaceChild("right_foot",
			CubeListBuilder.create()
				.texOffs(65, 202).addBox(-3.0F, -1.0F, -12.0F, 6.0F, 2.0F, 17.0F)
				.texOffs(124, 218).addBox(3.0F, -1.0F, -11.0F, 1.0F, 2.0F, 7.0F)
				.texOffs(146, 214).addBox(-4.0F, -1.0F, -11.0F, 1.0F, 2.0F, 7.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(6, 154).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 23.0F, 6.0F),
			PartPose.offset(4.0F, -25.0F, 0.0F));
		PartDefinition left_foot_pd = left_leg_pd.addOrReplaceChild("left_foot",
			CubeListBuilder.create()
				.texOffs(77, 170).addBox(-3.0F, -1.0F, -12.0F, 6.0F, 2.0F, 17.0F)
				.texOffs(55, 171).addBox(3.0F, -1.0F, -11.0F, 1.0F, 2.0F, 7.0F)
				.texOffs(134, 196).addBox(-4.0F, -1.0F, -11.0F, 1.0F, 2.0F, 7.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 223).addBox(-8.0F, -25.0F, -4.0F, 16.0F, 25.0F, 8.0F)
				.texOffs(54, 226).addBox(-8.0F, -22.0F, 4.0F, 7.0F, 21.0F, 7.0F)
				.texOffs(90, 224).addBox(1.0F, -22.0F, 4.0F, 7.0F, 21.0F, 7.0F)
				.texOffs(125, 251).addBox(-5.0F, -23.0F, 7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(127, 242).addBox(-5.0F, -1.0F, 7.0F, 10.0F, 1.0F, 1.0F)
				.texOffs(147, 233).addBox(-5.0F, -13.0F, 11.0F, 10.0F, 2.0F, 1.0F)
				.texOffs(5, 193).addBox(-1.0F, -21.0F, 4.0F, 2.0F, 19.0F, 5.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(200, 228).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F)
				.texOffs(163, 236).addBox(7.0F, -9.0F, -8.0F, 1.0F, 4.0F, 15.0F)
				.texOffs(224, 206).addBox(-8.0F, -9.0F, -8.0F, 1.0F, 4.0F, 15.0F)
				.texOffs(180, 218).addBox(-7.0F, -9.0F, 7.0F, 14.0F, 4.0F, 1.0F)
				.texOffs(226, 193).addBox(-7.0F, -10.0F, -8.0F, 14.0F, 6.0F, 1.0F)
				.texOffs(191, 204).addBox(-6.0F, -4.0F, -8.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(230, 184).addBox(-6.0F, -11.0F, -8.0F, 12.0F, 1.0F, 1.0F)
				.texOffs(238, 176).addBox(-4.0F, -3.0F, -8.0F, 8.0F, 1.0F, 1.0F)
				.texOffs(238, 167).addBox(-4.0F, -12.0F, -8.0F, 8.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(202, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 25.0F, 6.0F),
			PartPose.offset(11.0F, -22.0F, 0.0F));
		PartDefinition armor_pd = left_hand_pd.addOrReplaceChild("armor",
			CubeListBuilder.create()
				.texOffs(208, 36).addBox(0.0F, -2.0F, -4.0F, 1.0F, 6.0F, 8.0F),
			PartPose.offset(3.0F, 2.0F, 0.0F));
		PartDefinition bone_pd = armor_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(216, 56).addBox(0.0403F, -2.0F, -0.0774F, 1.0F, 6.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition bone2_pd = armor_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(219, 76).addBox(0.9063F, -3.0F, -6.4226F, 1.0F, 6.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(232, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 25.0F, 6.0F),
			PartPose.offset(-11.0F, -22.0F, 0.0F));
		PartDefinition bone3_pd = right_hand_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(238, 54).addBox(-5.0F, 3.0F, -4.0F, 1.0F, 6.0F, 8.0F),
			PartPose.offset(1.0F, -3.0F, 0.0F));
		PartDefinition bone4_pd = bone3_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(242, 36).addBox(-1.9063F, -2.0F, -6.4226F, 1.0F, 6.0F, 6.0F),
			PartPose.offsetAndRotation(-4.0F, 5.0F, -2.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition bone5_pd = right_hand_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(242, 74).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 6.0F, 6.0F),
			PartPose.offsetAndRotation(-3.0F, 2.0F, 3.0F, 0.0F, 1.1345F, 0.0F));
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