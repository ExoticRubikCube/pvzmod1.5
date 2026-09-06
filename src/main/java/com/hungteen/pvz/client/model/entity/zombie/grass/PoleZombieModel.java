package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.PoleZombieEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class PoleZombieModel extends PVZZombieModel<PoleZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "pole_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart left_hand2;
	private final ModelPart right_hand;
	private final ModelPart right_hand2;
	private final ModelPart pole;
	private final ModelPart head;




public PoleZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.left_hand2 = this.left_hand.getChild("left_hand2");
		this.right_hand = this.up.getChild("right_hand");
		this.right_hand2 = this.right_hand.getChild("right_hand2");
		this.pole = this.right_hand2.getChild("pole");
		this.head = this.up.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(161, 220).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 24.0F, 4.0F)
				.texOffs(124, 239).addBox(-3.0F, 24.0F, -7.0F, 6.0F, 2.0F, 10.0F)
				.texOffs(158, 202).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 4.0F, 6.0F),
			PartPose.offset(-4.0F, -26.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(228, 219).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 24.0F, 4.0F)
				.texOffs(190, 238).addBox(-3.0F, 24.0F, -7.0F, 6.0F, 2.0F, 10.0F)
				.texOffs(190, 198).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 4.0F, 6.0F),
			PartPose.offset(4.0F, -26.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -26.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(2, 222).addBox(-8.0F, -26.0F, -3.0F, 16.0F, 26.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(49, 221).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 26.0F, 6.0F, new CubeDeformation(-0.05F)),
			PartPose.offset(11.0F, -23.0F, 0.0F));
		PartDefinition left_hand2_pd = left_hand_pd.addOrReplaceChild("left_hand2",
			CubeListBuilder.create()
				.texOffs(228, 195).addBox(-1.0F, 3.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.05F)),
			PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(49, 221).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(-11.0F, -23.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition right_hand2_pd = right_hand_pd.addOrReplaceChild("right_hand2",
			CubeListBuilder.create()
				.texOffs(228, 195).addBox(-1.0F, 3.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.05F)),
			PartPose.offsetAndRotation(-2.0F, 12.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition pole_pd = right_hand2_pd.addOrReplaceChild("pole",
			CubeListBuilder.create()
				.texOffs(76, 4).addBox(1.0F, 2.1472F, -45.361698F, 2.0F, 2.0F, 85.0F),
			PartPose.offset(0.0F, 9.0F, 1.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(196, 104).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F),
			PartPose.offset(0.0F, -26.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(PoleZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		if(entity.getAttackTime() > 0) {
			int time = entity.getPoleJumpCD() - entity.getAttackTime();
			final int T = entity.getPoleJumpCD() / 4;
			if(time < T) {
				this.right_hand.xRot = - AnimationUtil.byDegree(90) + AnimationUtil.getUp(time, T, 90);
			} else if(time < T * 3) {
				this.right_hand.xRot = AnimationUtil.getUp(time - T, T * 2, 90);
				this.up.xRot = - AnimationUtil.getUp(time - T, T * 2, 90);
				this.left_leg.xRot = - AnimationUtil.getUp(time - T, T * 2, 120);
				this.right_leg.xRot = - AnimationUtil.getUp(time - T, T * 2, 120);
			} else {
				this.right_hand.xRot = AnimationUtil.byDegree(90) - AnimationUtil.getUp(time - 3 * T, T, 90);
				this.up.xRot = - AnimationUtil.byDegree(90) + AnimationUtil.getUp(time - 3 * T, T, 90);
				this.left_leg.xRot = - AnimationUtil.byDegree(120) + AnimationUtil.getUp(time - 3 * T, T, 120);
				this.right_leg.xRot = - AnimationUtil.byDegree(120) + AnimationUtil.getUp(time - 3 * T, T, 120);
			}
		}
	}
	
	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
		if(entity.getBodyType() == BodyType.BODY) {
			this.right_hand2.xRot = ! entity.hasHandDefence() ? 0 : -1.5708F;
		}
	}
	
	@Override
	public void refreshAnim() {
		this.right_hand.xRot = -1.5708F;
		this.up.xRot = 0;
	}
	
	@Override
	public void updateFreeParts(PoleZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasPole = entity.hasPole();
		this.pole.visible = hasPole;
		this.isRightHandFree = ! hasPole;
		this.right_hand2.xRot = this.isRightHandFree ? 0 : -1.5708F;
	}

	@Override
	public Optional<ModelPart> getHandDefence() {
		return Optional.ofNullable(this.pole);
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