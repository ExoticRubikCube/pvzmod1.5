package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.FlowerPotEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class FlowerPotModel extends PVZPlantModel<FlowerPotEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "flower_pot"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone2;




public FlowerPotModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone2 = this.body.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 53).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F)
				.texOffs(0, 50).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 2.0F, 12.0F)
				.texOffs(0, 47).addBox(-7.0F, -6.0F, -7.0F, 14.0F, 3.0F, 14.0F)
				.texOffs(0, 0).addBox(-8.0F, -12.0F, -8.0F, 16.0F, 6.0F, 16.0F)
				.texOffs(0, 48).addBox(-8.0F, -13.0F, -8.0F, 1.0F, 1.0F, 15.0F)
				.texOffs(2, 31).addBox(7.0F, -13.0F, -8.0F, 1.0F, 1.0F, 15.0F)
				.texOffs(1, 32).addBox(-7.0F, -13.0F, -8.0F, 14.0F, 1.0F, 1.0F)
				.texOffs(2, 36).addBox(-8.0F, -13.0F, 7.0F, 16.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(55, 48).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F),
			PartPose.offsetAndRotation(1.0F, -11.5F, 5.5F, -0.1309F, 0.0F, -0.3054F));
		PartDefinition bone_pd = body_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(55, 55).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bone2_pd = body_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(55, 44).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-0.25F, -3.75F, 0.0F, 0.0F, 0.0F, 0.6545F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(FlowerPotEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}
}