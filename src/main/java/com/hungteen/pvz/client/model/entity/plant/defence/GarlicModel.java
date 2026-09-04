package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.GarlicEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.EntityModel;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GarlicModel extends PVZPlantModel<GarlicEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "garlic"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart hair;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart face;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;




public GarlicModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = root.getChild("body");
		this.hair = root.getChild("hair");
		this.cube_r1 = root.getChild("cube_r1");
		this.cube_r2 = root.getChild("cube_r2");
		this.cube_r3 = root.getChild("cube_r3");
		this.face = root.getChild("face");
		this.cube_r4 = root.getChild("cube_r4");
		this.cube_r5 = root.getChild("cube_r5");
		this.cube_r6 = root.getChild("cube_r6");
		this.cube_r7 = root.getChild("cube_r7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(-4.0F, 18.0F, -5.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(0.0F, 5.0F, 1.0F, 8.0F, 1.0F, 8.0F)
				.texOffs(0, 24).addBox(-1.0F, 4.0F, 0.0F, 10.0F, 1.0F, 10.0F)
				.texOffs(0, 44).addBox(-1.0F, -4.0F, -1.0F, 10.0F, 8.0F, 12.0F)
				.texOffs(46, 57).addBox(0.0F, -3.0F, -1.75F, 8.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(46, 50).addBox(0.0F, -3.0F, 11.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 32).addBox(-2.0F, -4.0F, 0.0F, 1.0F, 8.0F, 10.0F)
				.texOffs(34, 28).addBox(-2.75F, -3.0F, 1.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(-0.1F))
				.texOffs(46, 18).addBox(9.75F, -3.0F, 1.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 0).addBox(9.0F, -4.0F, 0.0F, 1.0F, 8.0F, 10.0F)
				.texOffs(0, 13).addBox(0.0F, -5.0F, 0.0F, 8.0F, 1.0F, 10.0F)
				.texOffs(32, 49).addBox(0.0F, -6.0F, 2.0F, 1.0F, 1.0F, 6.0F)
				.texOffs(24, 34).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(28, 14).addBox(8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(40, 19).addBox(7.0F, -6.0F, 2.0F, 1.0F, 1.0F, 6.0F)
				.texOffs(0, 0).addBox(1.0F, -6.0F, 1.0F, 6.0F, 1.0F, 8.0F)
				.texOffs(32, 0).addBox(2.0F, -7.0F, 2.0F, 4.0F, 1.0F, 6.0F)
				.texOffs(58, 39).addBox(5.0F, -8.0F, 4.0F, 1.0F, 1.0F, 2.0F)
				.texOffs(58, 36).addBox(2.0F, -8.0F, 4.0F, 1.0F, 1.0F, 2.0F)
				.texOffs(0, 51).addBox(3.0F, -8.0F, 3.0F, 2.0F, 1.0F, 4.0F)
				.texOffs(0, 46).addBox(1.0F, -7.0F, 3.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(32, 44).addBox(6.0F, -7.0F, 3.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hair_pd = body_pd.addOrReplaceChild("hair",
			CubeListBuilder.create()
				.texOffs(56, 18).addBox(3.0F, -5.0F, 4.0F, 2.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition cube_r1_pd = hair_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(60, 20).addBox(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F),
			PartPose.offsetAndRotation(3.0F, -4.0F, 5.0F, -0.8727F, 0.0F, 0.3927F));
		PartDefinition cube_r2_pd = hair_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(54, 32).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(3.25F, -4.25F, 6.0F, 0.5672F, 0.0F, -0.7854F));
		PartDefinition cube_r3_pd = hair_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(54, 37).addBox(0.0F, -5.0F, -1.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(3.5F, -4.0F, 6.0F, 0.5672F, 0.0F, 0.3927F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(0, 39).addBox(0.5F, -2.75F, -2.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 25).addBox(5.5F, -2.75F, -2.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 10).addBox(1.5F, 0.0F, -2.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 18).addBox(1.25F, 0.25F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 15).addBox(2.25F, 0.25F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4_pd = face_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 10).addBox(-1.5F, -0.5F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(7.1871F, 0.4045F, -2.25F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r5_pd = face_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 10).addBox(-1.5F, -0.5F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.8091F, 0.4917F, -2.25F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r6_pd = face_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 30).addBox(-2.75F, -0.7F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(2.5F, -3.5F, -1.75F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r7_pd = face_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-0.25F, -0.75F, 0.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(5.25F, -3.5F, -1.75F, 0.0F, 0.0F, 0.2182F));
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