package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.LilyPadEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class LilyPadModel extends PVZPlantModel<LilyPadEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "lily_pad"), "main");

	private final ModelPart total;




public LilyPadModel(ModelPart root) {
		this.total = root.getChild("total");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(23, 46).addBox(6.0F, 7.0F, -16.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(31, 30).addBox(10.0F, 7.0F, -15.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(31, 14).addBox(4.0F, 7.0F, -15.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(37, 1).addBox(12.0F, 7.0F, -14.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(1, 1).addBox(0.0F, 7.0F, -10.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(13, 1).addBox(1.0F, 7.0F, -12.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(11, 11).addBox(2.0F, 7.0F, -13.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(2, 24).addBox(3.0F, 7.0F, -14.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(3, 38).addBox(13.0F, 7.0F, -13.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(2, 50).addBox(14.0F, 7.0F, -12.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(1, 12).addBox(15.0F, 7.0F, -10.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offset(-8.0F, 16.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(LilyPadEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

}