package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.DoomShroomEntity;
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
public class DoomShroomModel extends PVZPlantModel<DoomShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "doom_shroom"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart head_r1;
	private final ModelPart head_r2;


	public DoomShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.head_r1 = this.head.getChild("head_r1");
		this.head_r2 = this.head.getChild("head_r2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 28).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-9.0F, -10.0F, -9.0F, 18.0F, 10.0F, 18.0F),
			PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-5.25F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, -7.5F, -8.5F, -0.2559F, -0.056F, -0.211F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.75F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(-5.0F, -7.5F, -8.5F, -0.2559F, 0.056F, 0.211F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(DoomShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<DoomShroomEntity> getPlantModel() {
		return this;
	}
}