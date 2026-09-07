package com.hungteen.pvz.client.model.entity.plant.ice;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.ice.IcebergLettuceEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class IcebergLettuceModel extends PVZPlantModel<IcebergLettuceEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "iceberg_lettuce"), "main");
	private final ModelPart total;
	private final ModelPart berg;


	public IcebergLettuceModel(ModelPart root) {
		this.total = root.getChild("total");
		this.berg = this.total.getChild("berg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition berg = total.addOrReplaceChild("berg",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-3.0F, -5.5F, -3.0F, 6.0F, 6.0F, 6.0F)
				.texOffs(0, 13).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}


	@Override
	public void setupAnim(IcebergLettuceEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<IcebergLettuceEntity> getPlantModel() {
		return this;
	}
}