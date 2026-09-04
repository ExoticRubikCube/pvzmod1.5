package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.toxic.ScaredyShroomEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Optional;
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
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ScaredyShroomModel extends PlantShooterModel<ScaredyShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "scaredy_shroom"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart hat;




public ScaredyShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(17, 55).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 2.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 40).addBox(-2.0F, -17.25F, -2.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(-0.1F)),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(52, 2).addBox(-1.0F, -4.0F, -5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(1, 3).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 2.0F)
				.texOffs(31, 33).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(17, 55).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition hat_pd = head_pd.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.0F, -10.1161F, -3.4601F, 12.0F, 12.0F, 13.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, -1.0F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public Optional<ModelPart> getHeadModel() {
		return Optional.ofNullable(this.head);
	}
	
	@Override
	public Optional<ModelPart> getBodyModel() {
		return Optional.ofNullable(this.body);
	}
	
	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

}