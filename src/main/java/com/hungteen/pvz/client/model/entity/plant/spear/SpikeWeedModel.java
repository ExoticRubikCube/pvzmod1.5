package com.hungteen.pvz.client.model.entity.plant.spear;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.spear.SpikeWeedEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SpikeWeedModel extends PVZPlantModel<SpikeWeedEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "spike_weed"), "main");
	private final ModelPart total;
	private final ModelPart bone;


	public SpikeWeedModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 19).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F)
				.texOffs(0, 0).addBox(-8.0F, -3.2F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = total.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(32, 38).addBox(-8.0F, -6.0F, -4.0F, 16.0F, 4.0F, 0.0F)
				.texOffs(32, 42).addBox(-8.0F, -6.0F, 4.0F, 16.0F, 4.0F, 0.0F)
				.texOffs(0, 22).addBox(-4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F)
				.texOffs(0, 26).addBox(4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(SpikeWeedEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SpikeWeedEntity> getPlantModel() {
		return this;
	}
}