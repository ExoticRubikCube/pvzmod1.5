package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.SunShroomEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SunShroomModel extends PVZPlantModel<SunShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "sun_shroom"), "main");
	private final ModelPart body;
	private final ModelPart hat;


	public SunShroomModel(ModelPart root) {
		this.body = root.getChild("body");
		this.hat = this.body.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition hat = body.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(2, 97).addBox(-11.0F, -7.0F, -11.0F, 22.0F, 7.0F, 22.0F)
				.texOffs(1, 32).addBox(-10.0F, -12.0F, -10.0F, 20.0F, 5.0F, 20.0F)
				.texOffs(62, 4).addBox(-8.0F, -15.0F, -8.0F, 16.0F, 3.0F, 16.0F)
				.texOffs(77, 27).addBox(-6.0F, -16.0F, -6.0F, 12.0F, 1.0F, 12.0F),
			PartPose.offset(0.0F, -14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(SunShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<SunShroomEntity> getPlantModel() {
		return this;
	}
}