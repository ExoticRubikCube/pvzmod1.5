package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.PlanternEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class PlanternModel extends PVZPlantModel<PlanternEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "plantern"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart bottom;
	private final ModelPart stick1;
	private final ModelPart stick2;
	private final ModelPart stick3;
	private final ModelPart stick4;
	private final ModelPart stick5;
	private final ModelPart stick6;




public PlanternModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.bottom = this.total.getChild("bottom");
		this.stick1 = this.total.getChild("stick1");
		this.stick2 = this.total.getChild("stick2");
		this.stick3 = this.total.getChild("stick3");
		this.stick4 = this.total.getChild("stick4");
		this.stick5 = this.total.getChild("stick5");
		this.stick6 = this.total.getChild("stick6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, -33.0F, -2.0F, 4.0F, 4.0F, 4.0F)
				.texOffs(42, 47).addBox(-6.0F, -29.0F, 0.0F, 12.0F, 3.0F, 0.0F)
				.texOffs(42, 32).addBox(0.0F, -29.0F, -6.0F, 0.0F, 3.0F, 12.0F)
				.texOffs(0, 23).addBox(-9.0F, -26.0F, -9.0F, 18.0F, 3.0F, 18.0F)
				.texOffs(0, 0).addBox(-9.5F, -23.0F, -9.5F, 19.0F, 4.0F, 19.0F)
				.texOffs(45, 53).addBox(-5.5F, -25.0F, -5.5F, 11.0F, 11.0F, 11.0F)
				.texOffs(0, 64).addBox(-5.0F, -25.0F, -5.0F, 10.0F, 11.0F, 10.0F)
				.texOffs(0, 44).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 6.0F, 14.0F)
				.texOffs(89, 0).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bottom_pd = total_pd.addOrReplaceChild("bottom",
			CubeListBuilder.create()
				.texOffs(42, 50).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 3.0F, 0.0F)
				.texOffs(0, 0).addBox(0.0F, -3.0F, -5.0F, 0.0F, 3.0F, 10.0F)
				.texOffs(89, 12).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick1_pd = total_pd.addOrReplaceChild("stick1",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick2_pd = total_pd.addOrReplaceChild("stick2",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick3_pd = total_pd.addOrReplaceChild("stick3",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick4_pd = total_pd.addOrReplaceChild("stick4",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick5_pd = total_pd.addOrReplaceChild("stick5",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition stick6_pd = total_pd.addOrReplaceChild("stick6",
			CubeListBuilder.create()
				.texOffs(106, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(-0.01F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void setupAnim(PlanternEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<PlanternEntity> getPlantModel() {
		return this;
	}
}