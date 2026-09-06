package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.PogoZombieEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class PogoZombieModel extends PVZZombieModel<PogoZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "pogo_zombie"), "main");

	private final ModelPart total;
	private final ModelPart zombie;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart bone3;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart pogo;




public PogoZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.zombie = this.total.getChild("zombie");
		this.up = this.zombie.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.bone3 = this.head.getChild("bone3");
		this.left_leg = this.zombie.getChild("left_leg");
		this.right_leg = this.zombie.getChild("right_leg");
		this.pogo = this.total.getChild("pogo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 24.0F, 2.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition zombie_pd = total_pd.addOrReplaceChild("zombie",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -6.0F, 5.0F));
		PartDefinition up_pd = zombie_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(80, 96).addBox(-8.0F, -17.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(104, 62).addBox(-4.0F, -4.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(12.0F, -20.0F, 0.0F, -0.4363F, 0.0873F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(103, 26).addBox(-2.0F, -4.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(-12.0F, -20.0F, 0.0F, -0.4363F, -0.0873F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(20, 100).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition bone3_pd = head_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(76, 12).addBox(-8.0F, -5.2921F, -0.2749F, 1.0F, 1.0F, 10.0F)
				.texOffs(105, 12).addBox(7.0F, -5.2921F, -0.2749F, 1.0F, 1.0F, 10.0F)
				.texOffs(56, 18).addBox(-7.0F, -5.2921F, -0.2749F, 2.0F, 1.0F, 1.0F)
				.texOffs(36, 14).addBox(5.0F, -5.2921F, -0.2749F, 2.0F, 1.0F, 1.0F)
				.texOffs(16, 21).addBox(-1.0F, -5.2921F, -0.2749F, 2.0F, 1.0F, 1.0F)
				.texOffs(20, 4).addBox(-5.0F, -6.2921F, -0.2749F, 4.0F, 3.0F, 1.0F)
				.texOffs(2, 10).addBox(1.0F, -6.2921F, -0.2749F, 4.0F, 3.0F, 1.0F),
			PartPose.offset(0.0F, -3.091F, -8.0834F));
		PartDefinition left_leg_pd = zombie_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(58, 62).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(4.0F, -24.0F, 0.0F, -0.4363F, -0.2618F, 0.0F));
		PartDefinition right_leg_pd = zombie_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(67, 27).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(-4.0F, -24.0F, 0.0F, -0.4363F, 0.2618F, 0.0F));
		PartDefinition pogo_pd = total_pd.addOrReplaceChild("pogo",
			CubeListBuilder.create()
				.texOffs(24, 85).addBox(-1.0F, -10.0F, -6.0F, 2.0F, 10.0F, 2.0F)
				.texOffs(36, 66).addBox(-2.0F, -22.0F, -7.0F, 4.0F, 12.0F, 4.0F)
				.texOffs(32, 32).addBox(-3.0F, -38.0F, -8.0F, 6.0F, 16.0F, 6.0F)
				.texOffs(0, 87).addBox(3.0F, -34.0F, -6.0F, 9.0F, 2.0F, 2.0F)
				.texOffs(6, 51).addBox(-8.0F, -8.0F, -6.0F, 7.0F, 2.0F, 2.0F)
				.texOffs(2, 67).addBox(1.0F, -8.0F, -6.0F, 7.0F, 2.0F, 2.0F)
				.texOffs(4, 37).addBox(-12.0F, -34.0F, -6.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(PogoZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.hasPogo()) {
			this.left_hand.xRot = -0.4363F;
			this.left_hand.yRot = 0.0873F;
			this.right_hand.xRot = -0.4363F;
			this.right_hand.yRot = -0.0873F;
			this.left_leg.xRot = -0.4363F;
			this.left_leg.yRot = -0.2618F;
			this.right_leg.xRot = -0.4363F;
			this.right_leg.yRot = 0.2618F;
			this.total.xRot = 0.0873F;
			this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
            this.head.xRot = headPitch / (180F / (float)Math.PI);
		} else {
	        this.left_hand.yRot = 0;
	        this.right_hand.yRot = 0;
			this.left_leg.yRot = 0;
	        this.right_leg.yRot = 0;
	        this.total.xRot = 0;
	        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
		this.updateFreeParts(entity);
		this.pogo.visible = entity.hasMetal();
	}
	
	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		this.left_hand.yRot = 0;
        this.right_hand.yRot = 0;
		this.left_leg.yRot = 0;
        this.right_leg.yRot = 0;
        this.left_leg.xRot = 0;
        this.right_leg.xRot = 0;
        this.total.xRot = 0;
		super.tickPartAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		this.pogo.visible = false;
		super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
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