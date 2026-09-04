package com.hungteen.pvz.client.model.entity.zombie.other;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.other.RaZombieEntity;
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
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class RaZombieModel extends PVZZombieModel<RaZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "ra_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart collector;
	private final ModelPart cube_r1;
	private final ModelPart group2;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart group3;
	private final ModelPart cube_r4;
	private final ModelPart head;
	private final ModelPart bone;


public RaZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.body = root.getChild("body");
		this.left_hand = root.getChild("left_hand");
		this.right_hand = root.getChild("right_hand");
		this.collector = root.getChild("collector");
		this.cube_r1 = root.getChild("cube_r1");
		this.group2 = root.getChild("group2");
		this.cube_r2 = root.getChild("cube_r2");
		this.cube_r3 = root.getChild("cube_r3");
		this.group3 = root.getChild("group3");
		this.cube_r4 = root.getChild("cube_r4");
		this.head = root.getChild("head");
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(0, 96).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(32, 96).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(80, 96).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(96, 64).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(64, 64).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(-12.0F, -20.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition collector_pd = right_hand_pd.addOrReplaceChild("collector",
			CubeListBuilder.create()
				.texOffs(88, 54).addBox(-5.0F, -0.49F, -5.0F, 10.0F, 0.0F, 10.0F),
			PartPose.offsetAndRotation(1.0F, -1.5F, -24.0F, -1.5708F, -1.5708F, 0.0F));
		PartDefinition cube_r1_pd = collector_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 26).mirror().addBox(-1.5F, -2.02F, -2.0F, 3.0F, 1.0F, 37.0F),
			PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition group2_pd = collector_pd.addOrReplaceChild("group2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r2_pd = group2_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(56, 98).addBox(-1.5F, -1.01F, -10.0F, 3.0F, 1.0F, 5.0F)
				.texOffs(64, 104).addBox(5.0F, -1.01F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(64, 108).addBox(-1.5F, -1.01F, 5.0F, 3.0F, 1.0F, 5.0F)
				.texOffs(64, 114).addBox(-10.0F, -1.01F, -1.5F, 5.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r3_pd = group2_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(64, 118).addBox(5.0F, -1.01F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(64, 122).addBox(-1.5F, -1.01F, 5.0F, 3.0F, 1.0F, 5.0F)
				.texOffs(72, 96).addBox(-10.0F, -1.01F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(81, 58).addBox(-1.5F, -1.01F, -10.0F, 3.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition group3_pd = collector_pd.addOrReplaceChild("group3",
			CubeListBuilder.create()
				.texOffs(0, 76).addBox(-10.0F, 6.98F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(0, 70).addBox(-1.5F, 6.98F, 5.0F, 3.0F, 1.0F, 5.0F)
				.texOffs(0, 66).addBox(5.0F, 6.98F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(48, 69).addBox(-1.5F, 6.98F, -10.0F, 3.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition cube_r4_pd = group3_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(54, 59).addBox(5.0F, -1.02F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(88, 66).mirror().addBox(-1.5F, -1.02F, 5.0F, 3.0F, 1.0F, 5.0F)
				.texOffs(48, 75).addBox(-10.0F, -1.02F, -1.5F, 5.0F, 1.0F, 3.0F)
				.texOffs(24, 97).addBox(-1.5F, -1.02F, -10.0F, 3.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 64).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F)
				.texOffs(74, 1).addBox(-9.0F, -20.0F, -9.0F, 18.0F, 7.0F, 9.0F)
				.texOffs(0, 43).addBox(8.0F, -19.0F, -8.0F, 4.0F, 14.0F, 5.0F)
				.texOffs(0, 23).addBox(-12.0F, -19.0F, -8.0F, 4.0F, 14.0F, 5.0F)
				.texOffs(45, 49).addBox(-9.0F, -19.0F, 0.0F, 18.0F, 5.0F, 3.0F)
				.texOffs(87, 48).addBox(-9.0F, -18.0F, 3.0F, 18.0F, 4.0F, 2.0F)
				.texOffs(43, 43).addBox(-9.0F, -17.0F, 5.0F, 18.0F, 3.0F, 4.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition bone_pd = head_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(20, 57).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(0.0F, -14.0F, -9.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void setupAnim(RaZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        if(entity.checkCanWorkNow()) {
        	this.right_hand.xRot = - 1F;
        }
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void updateFreeParts(RaZombieEntity entity) {
		super.updateFreeParts(entity);
		this.isRightHandFree = ! entity.checkCanWorkNow();
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