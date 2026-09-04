package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.MariGoldEntity;
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
public class MariGoldModel<T extends MariGoldEntity> extends PVZPlantModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "marigold"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart HUABAN;
	private final ModelPart HUABAN2;
	private final ModelPart HUABAN3;
	private final ModelPart HUABAN4;
	private final ModelPart HUABAN5;
	private final ModelPart HUABAN6;
	private final ModelPart body;
	private final ModelPart cube_r3;
	private final ModelPart YEZI_4;
	private final ModelPart YEZI_3;
	private final ModelPart YEZI_1;
	private final ModelPart YEZI_2;




public MariGoldModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = root.getChild("head");
		this.cube_r1 = root.getChild("cube_r1");
		this.cube_r2 = root.getChild("cube_r2");
		this.HUABAN = root.getChild("HUABAN");
		this.HUABAN2 = root.getChild("HUABAN2");
		this.HUABAN3 = root.getChild("HUABAN3");
		this.HUABAN4 = root.getChild("HUABAN4");
		this.HUABAN5 = root.getChild("HUABAN5");
		this.HUABAN6 = root.getChild("HUABAN6");
		this.body = root.getChild("body");
		this.cube_r3 = root.getChild("cube_r3");
		this.YEZI_4 = root.getChild("YEZI_4");
		this.YEZI_3 = root.getChild("YEZI_3");
		this.YEZI_1 = root.getChild("YEZI_1");
		this.YEZI_2 = root.getChild("YEZI_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(73, 100).addBox(-11.0F, -15.0F, -5.99F, 22.0F, 21.0F, 4.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 123).addBox(-5.0F, 5.95F, -5.99F, 10.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F))
				.texOffs(85, 100).addBox(-1.5F, -0.25F, -6.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition cube_r1_pd = head_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(107, 88).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-4.2776F, -11.4466F, -5.75F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r2_pd = head_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(106, 94).addBox(-4.0F, 0.0F, 0.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(5.5F, -12.25F, -6.25F, 0.0F, 0.0F, 0.3054F));
		PartDefinition HUABAN_pd = head_pd.addOrReplaceChild("HUABAN",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0F, -18.0F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(29, 63).addBox(-3.0F, 9.8564F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(42, 36).addBox(10.9282F, -4.0718F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(73, 73).addBox(-16.9282F, -4.0718F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition HUABAN2_pd = HUABAN_pd.addOrReplaceChild("HUABAN2",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.4641F, -17.8564F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(29, 63).addBox(-2.4641F, 10.0F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(42, 36).addBox(11.4641F, -3.9282F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(73, 73).addBox(-16.3923F, -3.9282F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN3_pd = HUABAN2_pd.addOrReplaceChild("HUABAN3",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.0718F, -17.4641F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(29, 63).addBox(-2.0718F, 10.3923F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(42, 36).addBox(11.8564F, -3.5359F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
				.texOffs(73, 73).addBox(-16.0F, -3.5359F, -7.1F, 6.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN4_pd = head_pd.addOrReplaceChild("HUABAN4",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-4.0F, 9.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(10.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition HUABAN5_pd = HUABAN4_pd.addOrReplaceChild("HUABAN5",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.4641F, -15.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.4641F, 10.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.4641F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.3923F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN6_pd = HUABAN5_pd.addOrReplaceChild("HUABAN6",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0718F, -15.4641F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.0718F, 10.3923F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.8564F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.0F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(112, 43).addBox(-2.0F, -34.0F, -2.0F, 4.0F, 35.0F, 4.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition cube_r3_pd = body_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(23, 0).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -34.7071F, -0.1213F, 0.7854F, 0.0F, 0.0F));
		PartDefinition YEZI_4_pd = total_pd.addOrReplaceChild("YEZI_4",
			CubeListBuilder.create()
				.texOffs(78, 26).addBox(-11.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F)
				.texOffs(114, 28).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F),
			PartPose.offset(-2.0F, -1.0F, 0.0F));
		PartDefinition YEZI_3_pd = total_pd.addOrReplaceChild("YEZI_3",
			CubeListBuilder.create()
				.texOffs(114, 19).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F)
				.texOffs(0, 36).addBox(-4.0F, -2.0F, -11.0F, 8.0F, 2.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition YEZI_1_pd = total_pd.addOrReplaceChild("YEZI_1",
			CubeListBuilder.create()
				.texOffs(114, 0).addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(79, 0).addBox(3.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F),
			PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition YEZI_2_pd = total_pd.addOrReplaceChild("YEZI_2",
			CubeListBuilder.create()
				.texOffs(78, 12).addBox(-4.0F, -2.0F, 3.0F, 8.0F, 2.0F, 8.0F)
				.texOffs(114, 9).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 2.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(MariGoldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}