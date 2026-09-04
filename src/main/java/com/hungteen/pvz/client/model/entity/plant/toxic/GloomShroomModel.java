package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.GloomShroomEntity;
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
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GloomShroomModel extends PVZPlantModel<GloomShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "gloom_shroom"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart face;
	private final ModelPart shoot;
	private final ModelPart shoot1;
	private final ModelPart shoot2;
	private final ModelPart cube_r1;
	private final ModelPart shoot3;
	private final ModelPart cube_r2;
	private final ModelPart shoot4;
	private final ModelPart shoot5;
	private final ModelPart shoot6;
	private final ModelPart cube_r3;
	private final ModelPart shoot7;
	private final ModelPart cube_r4;
	private final ModelPart shoot8;




public GloomShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = root.getChild("head");
		this.face = root.getChild("face");
		this.shoot = root.getChild("shoot");
		this.shoot1 = root.getChild("shoot1");
		this.shoot2 = root.getChild("shoot2");
		this.cube_r1 = root.getChild("cube_r1");
		this.shoot3 = root.getChild("shoot3");
		this.cube_r2 = root.getChild("cube_r2");
		this.shoot4 = root.getChild("shoot4");
		this.shoot5 = root.getChild("shoot5");
		this.shoot6 = root.getChild("shoot6");
		this.cube_r3 = root.getChild("cube_r3");
		this.shoot7 = root.getChild("shoot7");
		this.cube_r4 = root.getChild("cube_r4");
		this.shoot8 = root.getChild("shoot8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(46, 28).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 5.0F, 12.0F)
				.texOffs(42, 48).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.1F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 40).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 7.0F, 13.0F, new CubeDeformation(-0.3F))
				.texOffs(45, 8).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 6.0F, 13.0F)
				.texOffs(0, 0).addBox(-5.5F, -11.0F, -7.5F, 11.0F, 6.0F, 15.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 21).addBox(-7.5F, -11.0F, -5.5F, 15.0F, 6.0F, 11.0F, new CubeDeformation(-0.2F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition face_pd = head_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-5.0F, -12.0F, 0.0F, 3.0F, 1.0F, 3.0F)
				.texOffs(0, 0).addBox(2.0F, -12.0F, 0.0F, 3.0F, 1.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition shoot_pd = head_pd.addOrReplaceChild("shoot",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition shoot1_pd = shoot_pd.addOrReplaceChild("shoot1",
			CubeListBuilder.create()
				.texOffs(50, 28).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(41, 45).addBox(-1.5F, -1.5F, -3.25F, 3.0F, 3.0F, 2.0F),
			PartPose.offset(0.0F, -8.5F, -7.25F));
		PartDefinition shoot2_pd = shoot_pd.addOrReplaceChild("shoot2",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-3.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(-6.25F, -8.5F, -6.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r1_pd = shoot2_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(5, 47).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.25F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot3_pd = shoot_pd.addOrReplaceChild("shoot3",
			CubeListBuilder.create()
				.texOffs(0, 40).addBox(-3.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F),
			PartPose.offset(-7.25F, -8.5F, 0.0F));
		PartDefinition cube_r2_pd = shoot3_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 46).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.25F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot4_pd = shoot_pd.addOrReplaceChild("shoot4",
			CubeListBuilder.create()
				.texOffs(56, 4).addBox(-0.5F, -0.5F, -1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(43, 0).addBox(-1.5F, -1.5F, 1.25F, 3.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(-6.25F, -8.5F, 6.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition shoot5_pd = shoot_pd.addOrReplaceChild("shoot5",
			CubeListBuilder.create()
				.texOffs(56, 0).addBox(-0.5F, -0.5F, -1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(43, 5).addBox(-1.5F, -1.5F, 1.25F, 3.0F, 3.0F, 2.0F),
			PartPose.offset(0.0F, -8.5F, 7.25F));
		PartDefinition shoot6_pd = shoot_pd.addOrReplaceChild("shoot6",
			CubeListBuilder.create()
				.texOffs(0, 27).addBox(1.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(6.25F, -8.5F, 6.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r3_pd = shoot6_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(45, 27).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.75F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot7_pd = shoot_pd.addOrReplaceChild("shoot7",
			CubeListBuilder.create()
				.texOffs(0, 21).addBox(1.25F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F),
			PartPose.offset(7.25F, -8.5F, 0.0F));
		PartDefinition cube_r4_pd = shoot7_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(7, 11).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.75F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot8_pd = shoot_pd.addOrReplaceChild("shoot8",
			CubeListBuilder.create()
				.texOffs(51, 2).addBox(-0.5F, -0.5F, -1.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(43, 10).addBox(-1.5F, -1.5F, -3.25F, 3.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(6.25F, -8.5F, -6.25F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(GloomShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GloomShroomEntity> getPlantModel() {
		return this;
	}
}