package com.hungteen.pvz.client.model.entity.plant.ice;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.ice.IceShroomEntity;
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
public class IceShroomModel extends PVZPlantModel<IceShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "ice_shroom"), "main");

	private final ModelPart total;
	private final ModelPart hat;





	public IceShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(72, 64).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 9.0F, 14.0F)
				.texOffs(72, 87).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.4F))
				.texOffs(0, 105).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hat_pd = total_pd.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(0, 51).addBox(-9.0F, -15.0F, -9.0F, 18.0F, 6.0F, 18.0F)
				.texOffs(0, 25).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 1.0F, 16.0F)
				.texOffs(0, 0).addBox(-9.0F, -16.0F, -9.0F, 18.0F, 7.0F, 18.0F, new CubeDeformation(0.4F))
				.texOffs(60, 107).addBox(-8.5F, -9.0F, -8.5F, 17.0F, 4.0F, 17.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(IceShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<IceShroomEntity> getPlantModel() {
		return this;
	}
}