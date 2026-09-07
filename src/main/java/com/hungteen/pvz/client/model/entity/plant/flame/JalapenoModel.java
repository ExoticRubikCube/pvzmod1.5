package com.hungteen.pvz.client.model.entity.plant.flame;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.flame.JalapenoEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class JalapenoModel extends PVZPlantModel<JalapenoEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "jalapeno"), "main");
	private final ModelPart total;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;


	public JalapenoModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cube_r1 = this.total.getChild("cube_r1");
		this.cube_r2 = this.total.getChild("cube_r2");
		this.cube_r3 = this.total.getChild("cube_r3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -20.0F, -5.0F, 10.0F, 13.0F, 10.0F)
				.texOffs(0, 38).addBox(-5.0F, -20.0F, -5.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 30).addBox(0.0F, -29.0F, -7.0F, 0.0F, 9.0F, 8.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = total.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(32, 15).addBox(-4.0F, -1.3F, -4.25F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.6F))
				.texOffs(24, 30).addBox(-4.0F, -1.5F, -4.25F, 8.0F, 3.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -20.5F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = total.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-4.0F, -4.5F, -4.75F, 8.0F, 7.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r3 = total.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(-3.0F, 1.5F, -3.0F, 6.0F, 5.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, -0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(JalapenoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<JalapenoEntity> getPlantModel() {
		return this;
	}
}