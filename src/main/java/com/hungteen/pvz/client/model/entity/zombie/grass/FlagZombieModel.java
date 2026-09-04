package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.FlagZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class FlagZombieModel extends PVZZombieModel<FlagZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "flag_zombie"), "main");

	
	private final ModelPart total;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;




public FlagZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.left_leg = this.total.getChild("left_leg");
		this.right_leg = this.total.getChild("right_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-3.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-5.0F, -24.0F, 0.0F));
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
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F)
				.texOffs(3, 207).addBox(-1.0F, 20.0F, -18.0F, 2.0F, 2.0F, 26.0F)
				.texOffs(83, 157).addBox(-1.0F, -6.0F, -36.0F, 1.0F, 28.0F, 18.0F),
			PartPose.offsetAndRotation(-12.0F, -20.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 96).addBox(-8.0F, -15.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	
	@Override
	public void refreshAnim() {
		this.right_hand.xRot = -1.5708F;
	}
	
	@Override
	public void updateFreeParts(FlagZombieEntity entity) {
		super.updateFreeParts(entity);
		this.isRightHandFree = false;
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