package com.hungteen.pvz.client.model.entity.plant.flame;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class TorchWoodModel extends PVZPlantModel<TorchWoodEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "torch_wood"), "main");
	private final ModelPart total;

	public TorchWoodModel(ModelPart root) {
		this.total = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 40).addBox(-9.0F, -3.0001F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition in = bone.addOrReplaceChild("in", CubeListBuilder.create().texOffs(64, 20).addBox(-8.0F, -10.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 63).addBox(-8.0F, -13.0F, -8.0F, 16.0F, 13.0F, 16.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyebrow = in.addOrReplaceChild("eyebrow", CubeListBuilder.create().texOffs(67, 1).addBox(-8.5F, -10.5F, -8.5F, 17.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition out = bone.addOrReplaceChild("out", CubeListBuilder.create().texOffs(0, 7).addBox(-8.5F, -6.0F, -8.5F, 17.0F, 6.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(TorchWoodEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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