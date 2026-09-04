package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.CoffeeBeanEntity;
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
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CoffeeBeanModel extends PVZPlantModel<CoffeeBeanEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "coffee_bean"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart right_wing;
	private final ModelPart left_wing;




public CoffeeBeanModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = root.getChild("body");
		this.cube_r1 = root.getChild("cube_r1");
		this.cube_r2 = root.getChild("cube_r2");
		this.right_wing = root.getChild("right_wing");
		this.left_wing = root.getChild("left_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition cube_r1_pd = body_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -13.5F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = body_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 9).addBox(-3.0F, -7.0F, 0.5F, 6.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition right_wing_pd = total_pd.addOrReplaceChild("right_wing",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition left_wing_pd = total_pd.addOrReplaceChild("left_wing",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 10.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}


	@Override
	public void setupAnim(CoffeeBeanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.left_wing.zRot = Mth.sin(ageInTicks / 10) * 3.14159f / 4;
		this.right_wing.zRot = - Mth.sin(ageInTicks / 10) * 3.14159f / 4;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<CoffeeBeanEntity> getPlantModel() {
		return this;
	}
}