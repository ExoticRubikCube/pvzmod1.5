package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.DancingZombieEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class DancingZombieModel extends PVZZombieModel<DancingZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "dancing_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart body;




public DancingZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.left_hand = root.getChild("left_hand");
		this.right_hand = root.getChild("right_hand");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(218, 239).addBox(-4.0F, 24.0F, -6.0F, 8.0F, 6.0F, 11.0F)
				.texOffs(0, 226).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offset(5.0F, -30.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(36, 239).addBox(-4.0F, 24.0F, -6.0F, 8.0F, 6.0F, 11.0F)
				.texOffs(96, 226).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offset(-5.0F, -30.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -30.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(60, 188).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offset(11.0F, -21.0F, 1.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(6, 179).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offset(-11.0F, -22.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.0F, -12.0F, -5.0F, 12.0F, 12.0F, 12.0F)
				.texOffs(200, 204).addBox(-7.0F, -18.0F, -5.0F, 14.0F, 6.0F, 14.0F)
				.texOffs(232, 177).addBox(-8.0F, -12.0F, -1.0F, 2.0F, 5.0F, 10.0F)
				.texOffs(132, 204).addBox(6.0F, -12.0F, -1.0F, 2.0F, 5.0F, 10.0F)
				.texOffs(162, 212).addBox(-6.0F, -12.0F, 7.0F, 12.0F, 5.0F, 2.0F)
				.texOffs(70, 228).addBox(-7.0F, -9.0F, -7.0F, 1.0F, 1.0F, 6.0F)
				.texOffs(31, 228).addBox(6.0F, -9.0F, -7.0F, 1.0F, 1.0F, 6.0F)
				.texOffs(110, 216).addBox(-1.0F, -9.0F, -7.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(198, 197).addBox(-6.0F, -11.0F, -7.0F, 5.0F, 5.0F, 1.0F)
				.texOffs(205, 176).addBox(1.0F, -11.0F, -7.0F, 5.0F, 5.0F, 1.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(141, 224).addBox(-8.0F, -24.0F, -3.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(DancingZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getSummonTime() > 0) {
			this.total.yRot = 0;
			this.left_hand.xRot = 0;
			this.right_hand.xRot = - 2.5f;
			this.left_leg.xRot = 0;
			this.right_leg.xRot = 0;
			return ;
		}
		if(entity.getAttackTime() > 0) {
			int tick = entity.getAttackTime();
			int max = DancingZombieEntity.DANCE_CD;
			this.total.yRot = - Mth.sin(3.14159f * 2 * tick / max);
			this.right_hand.xRot = - 3 * Mth.abs(Mth.sin(3.14159f * 4 * tick / max));
			this.left_hand.xRot = - 3 * Mth.abs(Mth.sin(3.14159f * 4 * tick / max));
			this.left_leg.xRot = 0;
			this.right_leg.xRot = 0;
			return ;
		}
		
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void refreshAnim() {
		this.total.yRot = 0;
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