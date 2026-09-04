package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.SunFlowerEntity;
import com.hungteen.pvz.utils.AnimationUtil;
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
// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class SunFlowerModel extends PVZPlantModel<SunFlowerEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "sun_flower"), "main");

	private final ModelPart total;
	private final ModelPart leaves;
	private final ModelPart w_r1;
	private final ModelPart w_r2;
	private final ModelPart e_r1;
	private final ModelPart e_r2;
	private final ModelPart body;
	private final ModelPart stickd_r1;
	private final ModelPart head;
	private final ModelPart right_hand;
	private final ModelPart leafw_r1;
	private final ModelPart left_hand;
	private final ModelPart leafe_r1;




public SunFlowerModel(ModelPart root) {
		this.total = root.getChild("total");
		this.leaves = root.getChild("leaves");
		this.w_r1 = root.getChild("w_r1");
		this.w_r2 = root.getChild("w_r2");
		this.e_r1 = root.getChild("e_r1");
		this.e_r2 = root.getChild("e_r2");
		this.body = root.getChild("body");
		this.stickd_r1 = root.getChild("stickd_r1");
		this.head = root.getChild("head");
		this.right_hand = root.getChild("right_hand");
		this.leafw_r1 = root.getChild("leafw_r1");
		this.left_hand = root.getChild("left_hand");
		this.leafe_r1 = root.getChild("leafe_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(-8.0F, 1.0F, 8.0F));
		PartDefinition w_r1_pd = leaves_pd.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(0, 24).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition w_r2_pd = leaves_pd.addOrReplaceChild("w_r2",
			CubeListBuilder.create()
				.texOffs(24, 7).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition e_r1_pd = leaves_pd.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(26, 14).addBox(1.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition e_r2_pd = leaves_pd.addOrReplaceChild("e_r2",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(-7.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(26, 30).addBox(-1.0F, -14.0F, 1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offset(-8.0F, 0.0F, 7.0F));
		PartDefinition stickd_r1_pd = body_pd.addOrReplaceChild("stickd_r1",
			CubeListBuilder.create()
				.texOffs(18, 30).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(22, 20).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F)
				.texOffs(0, 13).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 8.0F, 3.0F)
				.texOffs(0, 0).addBox(-7.0F, -7.0F, -2.0F, 14.0F, 12.0F, 1.0F),
			PartPose.offset(0.0F, -13.0F, 1.0F));
		PartDefinition right_hand_pd = body_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create(),
			PartPose.offset(-0.5F, -3.5F, 1.0F));
		PartDefinition leafw_r1_pd = right_hand_pd.addOrReplaceChild("leafw_r1",
			CubeListBuilder.create()
				.texOffs(8, 32).addBox(-3.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition left_hand_pd = body_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create(),
			PartPose.offset(0.5F, -4.5F, 1.0F));
		PartDefinition leafe_r1_pd = left_hand_pd.addOrReplaceChild("leafe_r1",
			CubeListBuilder.create()
				.texOffs(0, 31).addBox(0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(SunFlowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		if(tick > 0 && tick < entity.getAnimGenCD() || entity.isPlantInSuperMode()) {
			final int T = 10;
			this.left_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
		} else {
			this.left_hand.zRot = 0;
			this.right_hand.zRot = 0;
		}
		final int T = 60;
		final int time = entity.getExistTick() % 60;
		final float degree = 7.5F;
		this.body.zRot = AnimationUtil.getUpDownUpDown(time, T, degree);
		this.head.zRot = AnimationUtil.getUpDownUpDown(time, T, - degree);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SunFlowerEntity> getPlantModel() {
		return this;
	}
}