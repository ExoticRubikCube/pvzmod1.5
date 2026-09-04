package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.SnorkelZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SnorkelZombieModel extends PVZZombieModel<SnorkelZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "snorkel_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart right_foot;
	private final ModelPart left_leg;
	private final ModelPart left_foot;
	private final ModelPart up;
	private final ModelPart left_hand;
	private final ModelPart armor;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart right_hand;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart bone6;
	private final ModelPart bone7;




public SnorkelZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.right_foot = this.right_leg.getChild("right_foot");
		this.left_leg = this.total.getChild("left_leg");
		this.left_foot = this.left_leg.getChild("left_foot");
		this.up = this.total.getChild("up");
		this.left_hand = this.up.getChild("left_hand");
		this.armor = this.left_hand.getChild("armor");
		this.bone = this.armor.getChild("bone");
		this.bone2 = this.armor.getChild("bone2");
		this.right_hand = this.up.getChild("right_hand");
		this.bone3 = this.right_hand.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.right_hand.getChild("bone5");
		this.body = this.up.getChild("body");
		this.head = this.up.getChild("head");
		this.bone6 = this.head.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(1, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(-4.0F, -25.0F, 0.0F));
		PartDefinition right_foot_pd = right_leg_pd.addOrReplaceChild("right_foot",
			CubeListBuilder.create()
				.texOffs(22, 73).addBox(-2.0F, -1.0F, -11.0F, 4.0F, 2.0F, 14.0F)
				.texOffs(56, 95).addBox(2.0F, -1.0F, -10.0F, 1.0F, 2.0F, 6.0F)
				.texOffs(65, 81).addBox(-3.0F, -1.0F, -10.0F, 1.0F, 2.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(57, 2).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 23.0F, 4.0F),
			PartPose.offset(4.0F, -25.0F, 0.0F));
		PartDefinition left_foot_pd = left_leg_pd.addOrReplaceChild("left_foot",
			CubeListBuilder.create()
				.texOffs(62, 62).addBox(-2.0F, -1.0F, -11.0F, 4.0F, 2.0F, 14.0F)
				.texOffs(49, 64).addBox(2.0F, -1.0F, -10.0F, 1.0F, 2.0F, 6.0F)
				.texOffs(60, 50).addBox(-3.0F, -1.0F, -10.0F, 1.0F, 2.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(94, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 25.0F, 4.0F),
			PartPose.offset(10.0F, -23.0F, 0.0F));
		PartDefinition armor_pd = left_hand_pd.addOrReplaceChild("armor",
			CubeListBuilder.create()
				.texOffs(76, 3).addBox(0.0F, -2.0F, -3.0F, 1.0F, 5.0F, 6.0F),
			PartPose.offset(2.0F, 3.0F, 0.0F));
		PartDefinition bone_pd = armor_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(79, 18).addBox(-0.866F, -2.0F, -0.5F, 1.0F, 5.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition bone2_pd = armor_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(80, 35).addBox(0.0F, -3.0F, -4.0F, 1.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(112, 1).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 25.0F, 4.0F),
			PartPose.offset(-10.0F, -23.0F, 0.0F));
		PartDefinition bone3_pd = right_hand_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(80, 89).addBox(-5.0F, 3.0F, -3.0F, 1.0F, 5.0F, 6.0F),
			PartPose.offset(2.0F, -2.0F, 0.0F));
		PartDefinition bone4_pd = bone3_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(76, 103).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(-4.0F, 5.0F, -2.0F, 0.0F, -1.1345F, 0.0F));
		PartDefinition bone5_pd = right_hand_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(96, 47).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(-2.0F, 3.0F, 2.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(1, 93).addBox(-8.0F, -25.0F, -3.0F, 16.0F, 25.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(80, 104).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(102, 89).addBox(6.0F, -8.0F, -6.0F, 1.0F, 2.0F, 12.0F)
				.texOffs(102, 73).addBox(-7.0F, -8.0F, -6.0F, 1.0F, 2.0F, 12.0F)
				.texOffs(102, 68).addBox(-6.0F, -8.0F, 6.0F, 12.0F, 2.0F, 1.0F)
				.texOffs(102, 60).addBox(-6.0F, -9.0F, -7.0F, 12.0F, 4.0F, 1.0F)
				.texOffs(110, 56).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 1.0F, 1.0F)
				.texOffs(110, 52).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition bone6_pd = head_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(118, 45).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F)
				.texOffs(110, 39).addBox(-8.0F, -2.0F, -2.0F, 7.0F, 2.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, -7.0F));
		PartDefinition bone7_pd = bone6_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(40, 109).addBox(-1.6428F, -1.6943F, -0.3237F, 2.0F, 2.0F, 17.0F),
			PartPose.offsetAndRotation(-7.0F, -1.0F, 0.0F, 1.309F, -0.6981F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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