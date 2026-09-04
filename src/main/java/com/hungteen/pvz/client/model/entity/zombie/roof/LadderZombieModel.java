package com.hungteen.pvz.client.model.entity.zombie.roof;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.roof.LadderZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class LadderZombieModel extends PVZZombieModel<LadderZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "ladder_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart hammer;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart sting;
	private final ModelPart cube_r1;
	private final ModelPart beard;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart ladder;
	private final ModelPart floor;




public LadderZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.hammer = this.body.getChild("hammer");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.sting = this.head.getChild("sting");
		this.cube_r1 = this.sting.getChild("cube_r1");
		this.beard = this.head.getChild("beard");
		this.cube_r2 = this.beard.getChild("cube_r2");
		this.cube_r3 = this.beard.getChild("cube_r3");
		this.ladder = this.up.getChild("ladder");
		this.floor = this.ladder.getChild("floor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -23.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -23.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -25.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, -23.0F, 0.0F));
		PartDefinition hammer_pd = body_pd.addOrReplaceChild("hammer",
			CubeListBuilder.create()
				.texOffs(0, 163).addBox(-1.0F, -6.0F, -0.5F, 1.0F, 9.0F, 1.0F)
				.texOffs(0, 175).addBox(-1.0F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 179).addBox(-1.0F, -5.75F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F))
				.texOffs(6, 163).addBox(-1.0F, -5.75F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(9.0F, -1.0F, 0.5F, 0.4363F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(96, 60).addBox(0.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(8.0F, -48.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-8.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(-8.0F, -48.0F, 0.0F, -0.8727F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition sting_pd = head_pd.addOrReplaceChild("sting",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(9.0F, -17.0F, -1.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r1_pd = sting_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 146).addBox(-0.8227F, -1.5736F, 0.7997F, 2.0F, 2.0F, 13.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));
		PartDefinition beard_pd = head_pd.addOrReplaceChild("beard",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.5F, 0.0F));
		PartDefinition cube_r2_pd = beard_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 140).addBox(0.0F, -1.0F, 0.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.75F, -6.0F, -8.5F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r3_pd = beard_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 133).addBox(-7.0F, -1.0F, 0.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.25F, -6.0F, -8.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition ladder_pd = up_pd.addOrReplaceChild("ladder",
			CubeListBuilder.create()
				.texOffs(15, 202).addBox(-12.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(0, 202).addBox(9.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(0, 194).addBox(8.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F)
				.texOffs(0, 185).addBox(-13.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -38.0F, -20.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition floor_pd = ladder_pd.addOrReplaceChild("floor",
			CubeListBuilder.create()
				.texOffs(31, 250).addBox(-9.0F, 20.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(31, 242).addBox(-9.0F, 12.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(30, 234).addBox(-9.0F, 4.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(32, 225).addBox(-9.0F, -4.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(30, 217).addBox(-9.0F, -12.0F, -2.0F, 18.0F, 2.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void updateFreeParts(LadderZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasLadder = entity.hasMetal();
		this.ladder.visible = hasLadder;
		this.isLeftHandFree = ! hasLadder;
		this.isRightHandFree = ! hasLadder;
	}
	
	@Override
	public void refreshAnim() {
		super.refreshAnim();
		this.right_hand.xRot = -0.8727F;
		this.left_hand.xRot = -0.8727F;
	}
	
	@Override
	public Optional<ModelPart> getHandDefence() {
		return Optional.ofNullable(this.ladder);
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