package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.PuffShroomEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class PuffShroomModel extends PVZPlantModel<PuffShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "puff_shroom"), "main");

	private final ModelPart total;
	private final ModelPart eyes_closed;
	private final ModelPart hat;
	private final ModelPart mouth;

	public PuffShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.eyes_closed = this.total.getChild("eyes_closed");
		this.hat = this.total.getChild("hat");
		this.mouth = this.total.getChild("mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition total = partdefinition.addOrReplaceChild("total", CubeListBuilder.create().texOffs(0, 25).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition eyes_closed = total.addOrReplaceChild("eyes_closed", CubeListBuilder.create().texOffs(0, 37).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, 6.0F, -1.0F));

		PartDefinition hat = total.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.75F, -4.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-5.0F, -0.25F, -4.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -1.0F));

		PartDefinition mouth = total.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.75F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 5.5F, -4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(PuffShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<PuffShroomEntity> getPlantModel() {
		return this;
	}
}