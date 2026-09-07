package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.FumeShroomEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class FumeShroomModel extends PVZPlantModel<FumeShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "fume_shroom"), "main");
	private final ModelPart total;
	private final ModelPart total_r1;
	private final ModelPart total_r2;
	private final ModelPart total_r3;
	private final ModelPart total_r4;


	public FumeShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.total_r1 = this.total.getChild("total_r1");
		this.total_r2 = this.total.getChild("total_r2");
		this.total_r3 = this.total.getChild("total_r3");
		this.total_r4 = this.total.getChild("total_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 26).addBox(-6.5F, -9.0F, -6.5F, 13.0F, 9.0F, 13.0F)
				.texOffs(0, 0).addBox(-8.0F, -18.0F, -8.0F, 16.0F, 10.0F, 16.0F)
				.texOffs(0, 8).addBox(-2.0F, -15.0F, -11.0F, 4.0F, 4.0F, 3.0F)
				.texOffs(0, 0).addBox(-3.0F, -16.0F, -13.0F, 6.0F, 6.0F, 2.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition total_r1 = total.addOrReplaceChild("total_r1",
			CubeListBuilder.create()
				.texOffs(0, 28).addBox(-1.0F, -1.0F, -0.375F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(-3.0562F, -1.3175F, -6.525F, 0.0F, 0.0F, -0.0436F));
		PartDefinition total_r2 = total.addOrReplaceChild("total_r2",
			CubeListBuilder.create()
				.texOffs(39, 26).addBox(-3.25F, -1.0F, -0.85F, 6.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.1379F, -2.0988F, -6.025F, 0.0F, 0.0F, -0.0873F));
		PartDefinition total_r3 = total.addOrReplaceChild("total_r3",
			CubeListBuilder.create()
				.texOffs(0, 26).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-3.5F, -6.5F, -6.25F, 0.0F, 0.0F, 0.2618F));
		PartDefinition total_r4 = total.addOrReplaceChild("total_r4",
			CubeListBuilder.create()
				.texOffs(0, 26).mirror().addBox(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(3.5F, -6.5F, -6.25F, 0.0F, 0.0F, -0.2618F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(FumeShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<FumeShroomEntity> getPlantModel() {
		return this;
	}
}