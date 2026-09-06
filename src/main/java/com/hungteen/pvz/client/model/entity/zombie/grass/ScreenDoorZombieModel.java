package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.ScreenDoorZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ScreenDoorZombieModel extends PVZZombieModel<ScreenDoorZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "screendoor_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart door;




public ScreenDoorZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.door = this.right_hand.getChild("door");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(96, 60).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(12.0F, -20.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(-12.0F, -20.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition door_pd = right_hand_pd.addOrReplaceChild("door",
			CubeListBuilder.create()
				.texOffs(192, 186).addBox(-10.0F, -22.0F, -1.0F, 20.0F, 42.0F, 2.0F)
				.texOffs(58, 196).addBox(-13.0F, -22.0F, -2.0F, 3.0F, 42.0F, 4.0F)
				.texOffs(103, 197).addBox(10.0F, -22.0F, -2.0F, 3.0F, 42.0F, 4.0F)
				.texOffs(137, 172).addBox(-13.0F, -25.0F, -2.0F, 26.0F, 3.0F, 4.0F)
				.texOffs(132, 128).addBox(-13.0F, 20.0F, -2.0F, 26.0F, 5.0F, 4.0F)
				.texOffs(16, 240).addBox(10.0F, -1.0F, 2.0F, 3.0F, 3.0F, 4.0F)
				.texOffs(21, 222).addBox(10.0F, -1.0F, -6.0F, 3.0F, 3.0F, 1.0F)
				.texOffs(27, 203).addBox(11.0F, 0.0F, -5.0F, 1.0F, 1.0F, 3.0F)
				.texOffs(46, 179).addBox(-14.0F, 17.0F, -2.0F, 1.0F, 5.0F, 1.0F)
				.texOffs(30, 179).addBox(-14.0F, -22.0F, -2.0F, 1.0F, 5.0F, 1.0F)
				.texOffs(12, 182).addBox(-14.0F, -3.0F, -2.0F, 1.0F, 5.0F, 1.0F),
			PartPose.offsetAndRotation(12.0F, 23.0F, 1.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void updateFreeParts(ScreenDoorZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean isPartDestroyed = ! entity.hasMetal();
		this.door.visible = ! isPartDestroyed;
		this.isLeftHandFree = isPartDestroyed;
		this.isRightHandFree = isPartDestroyed;
	}
	
	@Override
	public void refreshAnim() {
		this.getZombieLeftHand().xRot = -1.0472F;
		this.getZombieRightHand().xRot = -1.0472F;
	}

	@Override
	public Optional<ModelPart> getHandDefence() {
		return Optional.ofNullable(this.door);
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