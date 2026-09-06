package com.hungteen.pvz.client.model.entity.plant.flame;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
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
public class TorchWoodModel extends PVZPlantModel<TorchWoodEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "torch_wood"), "main");

	private final ModelPart total;




public TorchWoodModel(ModelPart root) {
		this.total = root.getChild("total");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(48, 11).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 2.0F, 14.0F)
				.texOffs(0, 25).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F)
				.texOffs(0, 0).addBox(-7.5F, -10.0F, -7.5F, 15.0F, 10.0F, 15.0F)
				.texOffs(0, 44).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 12.0F, 14.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void setupAnim(TorchWoodEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		this.yellow.visible = entity.getFlameType() == FlameTypes.YELLOW;
//		this.blue.visible = entity.getFlameType() == FlameTypes.BLUE;
//		this.purple.visible = entity.getFlameType() == FlameTypes.PURPLE;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<TorchWoodEntity> getPlantModel() {
		return this;
	}
}