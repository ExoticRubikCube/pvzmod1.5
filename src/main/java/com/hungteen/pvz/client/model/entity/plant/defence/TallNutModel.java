package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class TallNutModel extends PVZPlantModel<TallNutEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "tall_nut"), "main");
	private final ModelPart body;


	public TallNutModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(42, 45).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F)
				.texOffs(0, 59).addBox(-7.0F, -27.0F, -7.0F, 14.0F, 25.0F, 1.0F)
				.texOffs(0, 0).addBox(-1.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F)
				.texOffs(16, 70).addBox(-7.0F, -25.0F, -7.975F, 6.0F, 1.0F, 1.0F)
				.texOffs(16, 70).addBox(-7.0F, -21.0F, -7.975F, 6.0F, 1.0F, 1.0F)
				.texOffs(16, 70).mirror().addBox(1.0F, -21.0F, -7.975F, 6.0F, 1.0F, 1.0F)
				.texOffs(16, 70).mirror().addBox(1.0F, -25.0F, -7.975F, 6.0F, 1.0F, 1.0F)
				.texOffs(0, 0).addBox(-8.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 0).mirror().addBox(6.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 0).addBox(-8.0F, -27.0F, -8.0F, 16.0F, 25.0F, 16.0F)
				.texOffs(0, 41).addBox(-7.0F, -31.0F, -7.0F, 14.0F, 4.0F, 14.0F)
				.texOffs(48, 0).addBox(-3.0F, -21.0F, -3.0F, 6.0F, 9.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(TallNutEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<TallNutEntity> getPlantModel() {
		return this;
	}
}