package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.GarlicEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GarlicModel extends PVZPlantModel<GarlicEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "garlic"), "main");
	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;


	public GarlicModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.cube_r1 = this.body.getChild("cube_r1");
		this.cube_r2 = this.body.getChild("cube_r2");
		this.cube_r3 = this.body.getChild("cube_r3");
		this.cube_r4 = this.body.getChild("cube_r4");
		this.cube_r5 = this.body.getChild("cube_r5");
		this.cube_r6 = this.body.getChild("cube_r6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.024F, -0.6812F, -3.5641F, 10.0F, 7.0F, 10.0F),
			PartPose.offset(-0.976F, -6.3188F, -1.4359F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 4).mirror().addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F),
			PartPose.offsetAndRotation(3.452F, -1.0F, -3.25F, -0.2964F, -0.2615F, -0.7025F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F),
			PartPose.offsetAndRotation(-1.5F, -1.0F, -3.25F, -0.2964F, 0.2615F, 0.7025F));
		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 7).mirror().addBox(0.0F, -5.0F, -10.0F, 0.0F, 5.0F, 10.0F),
			PartPose.offsetAndRotation(4.5116F, -0.6812F, 4.9714F, 0.0436F, 0.7854F, 0.0F));
		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(0.0F, -5.5F, -10.6569F, 0.0F, 5.0F, 10.0F),
			PartPose.offsetAndRotation(-3.024F, -0.1812F, 5.4359F, 0.0873F, -0.7854F, 0.0F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.25F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(3.476F, 1.5688F, -3.2891F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.75F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-1.524F, 1.5688F, -3.2891F, 0.0F, 0.0F, 0.3054F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GarlicEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GarlicEntity> getPlantModel() {
		return this;
	}
}