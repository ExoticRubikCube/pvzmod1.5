package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.HypnoShroomEntity;
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
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class HypnoShroomModel extends PVZPlantModel<HypnoShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "hypno_shroom"), "main");

	private final ModelPart total;
	private final ModelPart reye;
	private final ModelPart leye;
	private final ModelPart hat;




public HypnoShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.reye = root.getChild("reye");
		this.leye = root.getChild("leye");
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 32).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition reye_pd = total_pd.addOrReplaceChild("reye",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F),
			PartPose.offset(-3.0F, -4.0F, -4.25F));
		PartDefinition leye_pd = total_pd.addOrReplaceChild("leye",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F),
			PartPose.offset(3.0F, -4.0F, -4.25F));
		PartDefinition hat_pd = total_pd.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 5.0F, 12.0F)
				.texOffs(0, 17).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 5.0F, 10.0F)
				.texOffs(30, 17).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 3.0F, 6.0F),
			PartPose.offset(0.0F, -10.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(HypnoShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.hat.yRot = ageInTicks / 30;
//		this.leye.zRot = entity.getExistTick() / 10f;
//		this.reye.zRot = entity.getExistTick() / 10f;

	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<HypnoShroomEntity> getPlantModel() {
		return this;
	}
}