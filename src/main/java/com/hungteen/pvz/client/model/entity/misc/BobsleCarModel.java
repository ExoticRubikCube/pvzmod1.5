package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.BobsleCarEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
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
public class BobsleCarModel extends EntityModel<BobsleCarEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "bobsle_car"), "main");

	private final ModelPart total;
	private final ModelPart mid;
	private final ModelPart left;
	private final ModelPart right;
	private final ModelPart Head;
	private final ModelPart wheal;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart wheal2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart wheal3;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart wheal4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart tail;




public BobsleCarModel(ModelPart root) {
		this.total = root.getChild("total");
		this.mid = this.total.getChild("mid");
		this.left = this.mid.getChild("left");
		this.right = this.mid.getChild("right");
		this.Head = this.total.getChild("Head");
		this.wheal = this.total.getChild("wheal");
		this.bone = this.wheal.getChild("bone");
		this.bone2 = this.wheal.getChild("bone2");
		this.wheal2 = this.total.getChild("wheal2");
		this.bone3 = this.wheal2.getChild("bone3");
		this.bone4 = this.wheal2.getChild("bone4");
		this.wheal3 = this.total.getChild("wheal3");
		this.bone5 = this.wheal3.getChild("bone5");
		this.bone6 = this.wheal3.getChild("bone6");
		this.wheal4 = this.total.getChild("wheal4");
		this.bone7 = this.wheal4.getChild("bone7");
		this.bone8 = this.wheal4.getChild("bone8");
		this.tail = this.total.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition mid_pd = total_pd.addOrReplaceChild("mid",
			CubeListBuilder.create()
				.texOffs(284, 421).addBox(-14.0F, 4.0F, -17.0F, 28.0F, 1.0F, 84.0F)
				.texOffs(459, 402).addBox(-8.0F, -4.0F, -3.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(402, 399).addBox(-8.0F, -4.0F, 17.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(463, 372).addBox(-8.0F, -4.0F, 37.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(402, 368).addBox(-8.0F, -4.0F, 57.0F, 16.0F, 8.0F, 6.0F)
				.texOffs(440, 350).addBox(-14.0F, -2.0F, 67.0F, 28.0F, 7.0F, 1.0F),
			PartPose.offset(0.0F, -14.0F, 3.0F));
		PartDefinition left_pd = mid_pd.addOrReplaceChild("left",
			CubeListBuilder.create()
				.texOffs(9, 399).addBox(1.0F, -24.0F, -41.0F, 1.0F, 25.0F, 84.0F),
			PartPose.offset(13.0F, 4.0F, 24.0F));
		PartDefinition right_pd = mid_pd.addOrReplaceChild("right",
			CubeListBuilder.create()
				.texOffs(336, 7).addBox(-2.0F, -24.0F, -42.0F, 1.0F, 25.0F, 84.0F),
			PartPose.offset(-13.0F, 4.0F, 25.0F));
		PartDefinition Head_pd = total_pd.addOrReplaceChild("Head",
			CubeListBuilder.create()
				.texOffs(188, 449).addBox(-15.0F, -25.0F, -12.0F, 30.0F, 25.0F, 20.0F)
				.texOffs(129, 436).addBox(-13.0F, -15.0F, -17.0F, 26.0F, 15.0F, 5.0F)
				.texOffs(13, 378).addBox(-10.0F, -7.0F, -22.0F, 20.0F, 7.0F, 5.0F)
				.texOffs(11, 340).addBox(-15.0F, -27.0F, -2.0F, 30.0F, 2.0F, 21.0F),
			PartPose.offset(0.0F, -9.0F, -22.0F));
		PartDefinition wheal_pd = total_pd.addOrReplaceChild("wheal",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-1.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, -6.0F, -20.0F));
		PartDefinition bone_pd = wheal_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone2_pd = wheal_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal2_pd = total_pd.addOrReplaceChild("wheal2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-27.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, -6.0F, -20.0F));
		PartDefinition bone3_pd = wheal2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone4_pd = wheal2_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal3_pd = total_pd.addOrReplaceChild("wheal3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.0F, 70.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 68.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, -3.0F, 84.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 85.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 76.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 1.0F, 67.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-1.0F, 3.0F, 65.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, -6.0F, -20.0F));
		PartDefinition bone5_pd = wheal3_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -48.851898F, 55.219398F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone6_pd = wheal3_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, 49.494598F, 56.985401F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition wheal4_pd = total_pd.addOrReplaceChild("wheal4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, -1.0F, -6.0F, 2.0F, 2.0F, 16.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, -8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, -3.0F, 8.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, 0.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-28.0F, 1.0F, -9.0F, 4.0F, 2.0F, 4.0F)
				.texOffs(0, 0).addBox(-27.0F, 3.0F, -11.0F, 2.0F, 3.0F, 26.0F),
			PartPose.offset(13.0F, -6.0F, 55.0F));
		PartDefinition bone7_pd = wheal4_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.0F, -3.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, -11.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition bone8_pd = wheal4_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-27.0F, 0.6428F, -1.234F, 2.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 14.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition tail_pd = total_pd.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(261, 382).addBox(14.0F, -11.0F, 0.0F, 1.0F, 11.0F, 18.0F)
				.texOffs(184, 378).addBox(-15.0F, -11.0F, 0.0F, 1.0F, 11.0F, 18.0F),
			PartPose.offsetAndRotation(0.0F, -22.0F, 70.0F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}


	@Override
	public void setupAnim(BobsleCarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}