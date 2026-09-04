package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.BucketHeadZombieEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Optional;
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
// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class BucketHeadZombieModel extends PVZZombieModel<BucketHeadZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "buckethead_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart bucket;
	private final ModelPart defence1;
	private final ModelPart bar;
	private final ModelPart defence2;
	private final ModelPart defence3;




public BucketHeadZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.body = root.getChild("body");
		this.left_hand = root.getChild("left_hand");
		this.right_hand = root.getChild("right_hand");
		this.head = root.getChild("head");
		this.bucket = root.getChild("bucket");
		this.defence1 = root.getChild("defence1");
		this.bar = root.getChild("bar");
		this.defence2 = root.getChild("defence2");
		this.defence3 = root.getChild("defence3");
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
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 96).addBox(-8.0F, -15.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition bucket_pd = head_pd.addOrReplaceChild("bucket",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition defence1_pd = bucket_pd.addOrReplaceChild("defence1",
			CubeListBuilder.create()
				.texOffs(137, 2).addBox(-9.0F, -2.0F, -9.0F, 18.0F, 2.0F, 1.0F)
				.texOffs(138, 8).addBox(-9.0F, -2.0F, 8.0F, 18.0F, 2.0F, 1.0F)
				.texOffs(138, 15).mirror().addBox(-9.0F, -2.0F, -8.0F, 1.0F, 2.0F, 16.0F)
				.texOffs(138, 38).addBox(8.0F, -2.0F, -8.0F, 1.0F, 2.0F, 16.0F)
				.texOffs(184, 2).addBox(-9.0F, -7.0F, -9.0F, 18.0F, 5.0F, 18.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bar_pd = defence1_pd.addOrReplaceChild("bar",
			CubeListBuilder.create()
				.texOffs(182, 31).addBox(-11.0F, -1.0F, -15.0F, 22.0F, 1.0F, 1.0F)
				.texOffs(138, 60).addBox(-11.0F, -1.0F, -14.0F, 1.0F, 1.0F, 16.0F)
				.texOffs(137, 82).addBox(10.0F, -1.0F, -14.0F, 1.0F, 1.0F, 16.0F)
				.texOffs(181, 38).addBox(9.0F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F)
				.texOffs(195, 38).addBox(-10.0F, -2.0F, 0.0F, 1.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition defence2_pd = bucket_pd.addOrReplaceChild("defence2",
			CubeListBuilder.create()
				.texOffs(181, 48).addBox(-9.0F, -14.0F, -9.0F, 18.0F, 7.0F, 18.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition defence3_pd = bucket_pd.addOrReplaceChild("defence3",
			CubeListBuilder.create()
				.texOffs(182, 76).addBox(-9.0F, -20.0F, -9.0F, 18.0F, 6.0F, 18.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void updateFreeParts(BucketHeadZombieEntity entity) {
		super.updateFreeParts(entity);
        this.defence3.visible = entity.hasBucketHead(3);
		this.defence2.visible = entity.hasBucketHead(2);
		this.defence1.visible = entity.hasBucketHead(1);
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
	
	@Override
	public Optional<ModelPart> getHelmet() {
		return Optional.ofNullable(this.bucket);
	}

}