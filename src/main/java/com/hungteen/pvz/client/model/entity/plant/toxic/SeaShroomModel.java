package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.SeaShroomEntity;
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
public class SeaShroomModel extends PVZPlantModel<SeaShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "sea_shroom"), "main");

	private final ModelPart total;
	private final ModelPart tail;
	private final ModelPart bone;
	private final ModelPart cube_r1;
	private final ModelPart bone2;
	private final ModelPart cube_r2;
	private final ModelPart bone3;
	private final ModelPart cube_r3;
	private final ModelPart bone4;
	private final ModelPart cube_r4;
	private final ModelPart bone5;
	private final ModelPart cube_r5;
	private final ModelPart bone6;
	private final ModelPart cube_r6;
	private final ModelPart bone7;
	private final ModelPart cube_r7;
	private final ModelPart bone8;
	private final ModelPart cube_r8;
	private final ModelPart bone9;
	private final ModelPart cube_r9;
	private final ModelPart bone10;
	private final ModelPart cube_r10;
	private final ModelPart bone11;
	private final ModelPart cube_r11;
	private final ModelPart bone12;
	private final ModelPart cube_r12;
	private final ModelPart bone13;
	private final ModelPart cube_r13;
	private final ModelPart bone14;
	private final ModelPart cube_r14;
	private final ModelPart bone15;
	private final ModelPart cube_r15;




public SeaShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.tail = root.getChild("tail");
		this.bone = root.getChild("bone");
		this.cube_r1 = root.getChild("cube_r1");
		this.bone2 = root.getChild("bone2");
		this.cube_r2 = root.getChild("cube_r2");
		this.bone3 = root.getChild("bone3");
		this.cube_r3 = root.getChild("cube_r3");
		this.bone4 = root.getChild("bone4");
		this.cube_r4 = root.getChild("cube_r4");
		this.bone5 = root.getChild("bone5");
		this.cube_r5 = root.getChild("cube_r5");
		this.bone6 = root.getChild("bone6");
		this.cube_r6 = root.getChild("cube_r6");
		this.bone7 = root.getChild("bone7");
		this.cube_r7 = root.getChild("cube_r7");
		this.bone8 = root.getChild("bone8");
		this.cube_r8 = root.getChild("cube_r8");
		this.bone9 = root.getChild("bone9");
		this.cube_r9 = root.getChild("cube_r9");
		this.bone10 = root.getChild("bone10");
		this.cube_r10 = root.getChild("cube_r10");
		this.bone11 = root.getChild("bone11");
		this.cube_r11 = root.getChild("cube_r11");
		this.bone12 = root.getChild("bone12");
		this.cube_r12 = root.getChild("cube_r12");
		this.bone13 = root.getChild("bone13");
		this.cube_r13 = root.getChild("cube_r13");
		this.bone14 = root.getChild("bone14");
		this.cube_r14 = root.getChild("cube_r14");
		this.bone15 = root.getChild("bone15");
		this.cube_r15 = root.getChild("cube_r15");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(31, 47).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(14, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 4.0F)
				.texOffs(0, 0).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 4.0F, 12.0F)
				.texOffs(0, 17).addBox(-5.0F, -15.0F, -5.0F, 10.0F, 3.0F, 10.0F)
				.texOffs(0, 31).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 1.0F, 8.0F)
				.texOffs(1, 42).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(9, 41).addBox(-2.0F, -5.0F, -8.0F, 4.0F, 4.0F, 2.0F),
			PartPose.offset(0.0F, 14.0F, 0.0F));
		PartDefinition tail_pd = total_pd.addOrReplaceChild("tail",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = tail_pd.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.1309F));
		PartDefinition cube_r1_pd = bone_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(58, 50).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone2_pd = bone_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 3.9772F, 0.348F));
		PartDefinition cube_r2_pd = bone2_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(59, 43).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3_pd = bone3_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(54, 40).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 3.8941F, 0.863F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone4_pd = tail_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.1309F, 0.0F, -0.1309F));
		PartDefinition cube_r4_pd = bone4_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(9, 59).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.9914F, 0.8706F, 0.017F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone5_pd = bone4_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offset(0.9914F, 3.8478F, 0.365F));
		PartDefinition cube_r5_pd = bone5_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(4, 58).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone6_pd = bone5_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6_pd = bone6_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 47).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 3.8941F, 0.863F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone7_pd = tail_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.1309F, -1.0472F, 0.1309F));
		PartDefinition cube_r7_pd = bone7_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(1, 54).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone8_pd = bone7_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 3.9772F, 0.348F));
		PartDefinition cube_r8_pd = bone8_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(6, 48).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone9_pd = bone8_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9_pd = bone9_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(11, 49).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 3.8941F, 0.863F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone10_pd = tail_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(2.0F, 0.0F, -2.0F, 0.1309F, 1.0472F, -0.1309F));
		PartDefinition cube_r10_pd = bone10_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(17, 48).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.4957F, 0.7585F, -0.8342F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone11_pd = bone10_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create(),
			PartPose.offset(0.4957F, 3.7357F, -0.4863F));
		PartDefinition cube_r11_pd = bone11_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(22, 50).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition bone12_pd = bone11_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r12_pd = bone12_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(22, 41).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 3.8941F, 0.863F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bone13_pd = tail_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, -3.0F));
		PartDefinition cube_r13_pd = bone13_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(28, 42).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone14_pd = bone13_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 3.9772F, 0.348F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r14_pd = bone14_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(34, 41).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.2046F, 0.0979F, -0.7978F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition bone15_pd = bone14_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r15_pd = bone15_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(59, 35).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.8752F, 3.9011F, -0.3679F, -0.0873F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(SeaShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SeaShroomEntity> getPlantModel() {
		return this;
	}
}