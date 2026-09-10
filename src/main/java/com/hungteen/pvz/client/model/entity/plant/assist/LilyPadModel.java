package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.LilyPadEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
public class LilyPadModel extends PVZPlantModel<LilyPadEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "lily_pad"), "main");
	private final ModelPart total;

	public LilyPadModel(ModelPart root) {
		this.total = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -4.0F, 1.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-9.0F, -0.5F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 22).addBox(-15.0F, -0.05F, 1.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 22.5F, -8.0F));

		PartDefinition eyes = bone.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(0, 18).addBox(-7.0F, -4.0F, -7.1F, 14.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(LilyPadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}
}