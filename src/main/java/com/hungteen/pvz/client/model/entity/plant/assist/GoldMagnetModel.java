package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.GoldMagnetEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GoldMagnetModel extends PVZPlantModel<GoldMagnetEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "gold_magnet"), "main");

	private final ModelPart total;
	private final ModelPart plate;
	private final ModelPart bone3;
	private final ModelPart cube_r1;
	private final ModelPart bone4;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart magnet;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart face;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart elect;
	private final ModelPart base;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart leave1;




public GoldMagnetModel(ModelPart root) {
		this.total = root.getChild("total");
		this.plate = this.total.getChild("plate");
		this.bone3 = this.plate.getChild("bone3");
		this.cube_r1 = this.bone3.getChild("cube_r1");
		this.bone4 = this.plate.getChild("bone4");
		this.bone15 = this.plate.getChild("bone15");
		this.bone16 = this.plate.getChild("bone16");
		this.bone17 = this.plate.getChild("bone17");
		this.bone18 = this.plate.getChild("bone18");
		this.bone19 = this.plate.getChild("bone19");
		this.bone20 = this.plate.getChild("bone20");
		this.magnet = this.total.getChild("magnet");
		this.bone5 = this.magnet.getChild("bone5");
		this.bone6 = this.magnet.getChild("bone6");
		this.bone7 = this.magnet.getChild("bone7");
		this.bone8 = this.magnet.getChild("bone8");
		this.bone9 = this.magnet.getChild("bone9");
		this.bone10 = this.magnet.getChild("bone10");
		this.bone11 = this.magnet.getChild("bone11");
		this.bone12 = this.magnet.getChild("bone12");
		this.bone13 = this.magnet.getChild("bone13");
		this.bone14 = this.magnet.getChild("bone14");
		this.face = this.total.getChild("face");
		this.cube_r2 = this.face.getChild("cube_r2");
		this.cube_r3 = this.face.getChild("cube_r3");
		this.elect = this.total.getChild("elect");
		this.base = this.total.getChild("base");
		this.bone = this.base.getChild("bone");
		this.bone2 = this.base.getChild("bone2");
		this.leave1 = this.base.getChild("leave1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 52).addBox(-0.9443F, -8.2791F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.28F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition plate_pd = total_pd.addOrReplaceChild("plate",
			CubeListBuilder.create()
				.texOffs(8, 59).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition bone3_pd = plate_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r1_pd = bone3_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(9, 56).addBox(-0.25F, -1.2165F, 0.125F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(-1.75F, -0.1402F, 1.5902F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone4_pd = plate_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(9, 53).addBox(-2.0F, -0.5428F, -2.5722F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 1.5708F, 0.0F));
		PartDefinition bone15_pd = plate_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(53, 37).addBox(-2.75F, -0.75F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(-1.75F, -0.75F, -1.0F, 0.5236F, -0.5236F, -0.5236F));
		PartDefinition bone16_pd = plate_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(42, 37).addBox(-0.25F, -0.75F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(1.75F, -0.75F, -1.0F, 0.5236F, 0.5236F, 0.5236F));
		PartDefinition bone17_pd = plate_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(32, 37).addBox(-2.75F, -0.75F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(-1.75F, -0.75F, 1.0F, -0.5236F, 0.5236F, -0.5236F));
		PartDefinition bone18_pd = plate_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(24, 35).addBox(-0.25F, -0.75F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(1.75F, -0.75F, 1.0F, -0.5236F, -0.5236F, 0.5236F));
		PartDefinition bone19_pd = plate_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(53, 37).addBox(-2.75F, -0.75F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(-1.75F, -0.75F, 0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition bone20_pd = plate_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(42, 37).addBox(-0.25F, -0.75F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(1.75F, -0.75F, 0.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition magnet_pd = total_pd.addOrReplaceChild("magnet",
			CubeListBuilder.create()
				.texOffs(25, 57).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -8.75F, 0.0F));
		PartDefinition bone5_pd = magnet_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(38, 58).addBox(0.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone6_pd = magnet_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(20, 50).addBox(-2.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone7_pd = magnet_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(51, 52).addBox(0.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone8_pd = magnet_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(38, 51).addBox(-3.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone9_pd = magnet_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(31, 47).addBox(-4.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition bone10_pd = magnet_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(10, 45).addBox(-4.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11_pd = magnet_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(51, 44).addBox(1.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone12_pd = magnet_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(1, 41).addBox(2.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition bone13_pd = magnet_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(40, 41).addBox(-5.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone14_pd = magnet_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(21, 42).addBox(2.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(11, 40).addBox(-2.5F, 0.0F, -1.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(33, 40).addBox(0.5F, 0.0F, -1.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -11.0F, 0.0F));
		PartDefinition cube_r2_pd = face_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(57, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.75F, -0.5F, -1.75F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r3_pd = face_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(19, 39).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.75F, -0.5F, -1.75F, 0.0F, 0.0F, -0.1745F));
		PartDefinition elect_pd = total_pd.addOrReplaceChild("elect",
			CubeListBuilder.create()
				.texOffs(1, 38).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -16.25F, 0.0F));
		PartDefinition base_pd = total_pd.addOrReplaceChild("base",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = base_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(56, 58).addBox(-1.171F, -3.2198F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone2_pd = base_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-1.2479F, -3.7826F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.75F, -2.25F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition leave1_pd = base_pd.addOrReplaceChild("leave1",
			CubeListBuilder.create()
				.texOffs(20, 56).addBox(-0.25F, -0.75F, -1.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)),
			PartPose.offsetAndRotation(0.75F, -2.25F, 0.0F, -0.0873F, 0.0F, -0.1309F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GoldMagnetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GoldMagnetEntity> getPlantModel() {
		return this;
	}
}