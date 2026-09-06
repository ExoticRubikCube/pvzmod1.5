package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;
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
public class TallNutModel extends PVZPlantModel<TallNutEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "tall_nut"), "main");

	private final ModelPart body;




public TallNutModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body_pd = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(416, 486).addBox(-11.0F, -1.0F, -11.0F, 22.0F, 1.0F, 22.0F)
				.texOffs(272, 476).addBox(-15.0F, -3.0F, -15.0F, 30.0F, 2.0F, 30.0F)
				.texOffs(6, 408).addBox(-17.0F, -71.0F, -17.0F, 34.0F, 68.0F, 34.0F)
				.texOffs(156, 420).addBox(17.0F, -69.0F, -14.0F, 2.0F, 64.0F, 28.0F)
				.texOffs(0, 308).addBox(-19.0F, -69.0F, -14.0F, 2.0F, 64.0F, 28.0F)
				.texOffs(84, 334).addBox(-14.0F, -69.0F, -19.0F, 28.0F, 64.0F, 2.0F)
				.texOffs(174, 348).addBox(-14.0F, -69.0F, 17.0F, 28.0F, 64.0F, 2.0F)
				.texOffs(246, 428).addBox(-14.0F, -73.0F, -14.0F, 28.0F, 2.0F, 28.0F)
				.texOffs(380, 442).addBox(-11.0F, -75.0F, -11.0F, 22.0F, 2.0F, 22.0F)
				.texOffs(466, 354).addBox(-20.0F, -66.0F, -10.0F, 1.0F, 57.0F, 20.0F)
				.texOffs(410, 342).addBox(19.0F, -64.0F, -10.0F, 1.0F, 55.0F, 20.0F)
				.texOffs(346, 356).addBox(-11.0F, -65.0F, -20.0F, 22.0F, 57.0F, 1.0F)
				.texOffs(278, 344).addBox(-11.0F, -65.0F, 19.0F, 22.0F, 57.0F, 1.0F)
				.texOffs(458, 326).addBox(-7.0F, -77.0F, -7.0F, 14.0F, 2.0F, 14.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
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