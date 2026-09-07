package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.SquashEntity;
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
public class SquashModel extends PVZPlantModel<SquashEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "squash"), "main");
	private final ModelPart body;
	private final ModelPart bone;


	public SquashModel(ModelPart root) {
		this.body = root.getChild("body");
		this.bone = this.body.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(125, 202).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 16.0F, 32.0F)
				.texOffs(138, 153).addBox(-14.0F, -32.0F, -14.0F, 28.0F, 16.0F, 28.0F)
				.texOffs(40, 148).addBox(-11.0F, -44.0F, -11.0F, 22.0F, 12.0F, 22.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(235, 130).addBox(1.0F, -1.8038F, -2.0F, 4.0F, 9.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -50.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(SquashEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<SquashEntity> getPlantModel() {
		return this;
	}
}