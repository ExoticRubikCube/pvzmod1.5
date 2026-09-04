package com.hungteen.pvz.client.model.entity.plant.spear;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.spear.CatTailEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class CatTailModel extends PVZPlantModel<CatTailEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "cat_tail"), "main");

	private final ModelPart bone;
	private final ModelPart buttom;
	private final ModelPart head;
	private final ModelPart hat_r1;
	private final ModelPart left_ear;
	private final ModelPart in_r1;
	private final ModelPart lear_r1;
	private final ModelPart right_ear;
	private final ModelPart in_r2;
	private final ModelPart rear_r1;
	private final ModelPart tail;
	private final ModelPart spike_r1;
	private final ModelPart sec_r1;
	private final ModelPart fir_r1;




public CatTailModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.buttom = this.bone.getChild("buttom");
		this.head = this.bone.getChild("head");
		this.hat_r1 = this.head.getChild("hat_r1");
		this.left_ear = this.head.getChild("left_ear");
		this.in_r1 = this.left_ear.getChild("in_r1");
		this.lear_r1 = this.left_ear.getChild("lear_r1");
		this.right_ear = this.head.getChild("right_ear");
		this.in_r2 = this.right_ear.getChild("in_r2");
		this.rear_r1 = this.right_ear.getChild("rear_r1");
		this.tail = this.bone.getChild("tail");
		this.spike_r1 = this.tail.getChild("spike_r1");
		this.sec_r1 = this.tail.getChild("sec_r1");
		this.fir_r1 = this.tail.getChild("fir_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition bone_pd = partdefinition.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition buttom_pd = bone_pd.addOrReplaceChild("buttom",
			CubeListBuilder.create()
				.texOffs(24, 12).addBox(-6.0F, -2.0F, -8.0F, 6.0F, 2.0F, 6.0F)
				.texOffs(26, 29).addBox(0.0F, -2.0F, 1.0F, 5.0F, 2.0F, 5.0F)
				.texOffs(0, 28).addBox(1.0F, -1.0F, -7.0F, 6.0F, 1.0F, 6.0F)
				.texOffs(26, 22).addBox(-7.0F, -1.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_pd = bone_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(32, 0).addBox(-2.0F, -3.0F, -5.5F, 4.0F, 2.0F, 1.0F)
				.texOffs(0, 7).addBox(-1.0F, -3.05F, -5.7F, 2.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hat_r1_pd = head_pd.addOrReplaceChild("hat_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F),
			PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition left_ear_pd = head_pd.addOrReplaceChild("left_ear",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -6.0F, -1.0F));
		PartDefinition in_r1_pd = left_ear_pd.addOrReplaceChild("in_r1",
			CubeListBuilder.create()
				.texOffs(44, 18).addBox(-1.4F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F)
				.texOffs(43, 6).addBox(-1.3F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(2.5F, -4.5F, 2.5F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition lear_r1_pd = left_ear_pd.addOrReplaceChild("lear_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(3.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.5236F, 0.0F));
		PartDefinition right_ear_pd = head_pd.addOrReplaceChild("right_ear",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -6.0F, -1.0F));
		PartDefinition in_r2_pd = right_ear_pd.addOrReplaceChild("in_r2",
			CubeListBuilder.create()
				.texOffs(42, 12).addBox(-1.6F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F)
				.texOffs(42, 0).addBox(-1.7F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(-2.5F, -4.5F, 2.5F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition rear_r1_pd = right_ear_pd.addOrReplaceChild("rear_r1",
			CubeListBuilder.create()
				.texOffs(32, 36).addBox(-5.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.5236F, 0.0F));
		PartDefinition tail_pd = bone_pd.addOrReplaceChild("tail",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -1.5F, 3.0F));
		PartDefinition spike_r1_pd = tail_pd.addOrReplaceChild("spike_r1",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-1.0F, 1.18F, 6.05F, 2.0F, 2.0F, 5.0F)
				.texOffs(15, 28).addBox(-0.5F, 1.68F, 3.05F, 1.0F, 1.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, -2.18F, 3.95F, 2.2253F, 0.0F, 0.0F));
		PartDefinition sec_r1_pd = tail_pd.addOrReplaceChild("sec_r1",
			CubeListBuilder.create()
				.texOffs(30, 4).addBox(-0.5F, 0.39F, 0.95F, 1.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.59F, 2.05F, 1.4399F, 0.0F, 0.0F));
		PartDefinition fir_r1_pd = tail_pd.addOrReplaceChild("fir_r1",
			CubeListBuilder.create()
				.texOffs(9, 35).addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}




	@Override
	public void setupAnim(CatTailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		int tick = entity.getAttackTime();
		float v = 3.14159F / entity.getAnimCD();
		this.tail.xRot = 0.8F - 0.8F * Math.abs(Mth.cos(v * tick));
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.bone;
	}

	@Override
	public EntityModel<CatTailEntity> getPlantModel() {
		return this;
	}
}