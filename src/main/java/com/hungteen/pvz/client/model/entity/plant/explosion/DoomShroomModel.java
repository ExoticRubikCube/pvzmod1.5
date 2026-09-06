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




public DoomShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(69, 89).addBox(-5.0F, -12.0F, -5.0F, 10.0F, 12.0F, 10.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(4, 70).addBox(-6.0F, -8.0F, -5.0F, 12.0F, 2.0F, 10.0F)
				.texOffs(3, 88).addBox(-7.0F, -6.0F, -6.0F, 14.0F, 3.0F, 12.0F)
				.texOffs(1, 108).addBox(-8.0F, -3.0F, -7.0F, 16.0F, 3.0F, 14.0F)
				.texOffs(69, 118).addBox(-4.0F, -9.0F, -3.0F, 8.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
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