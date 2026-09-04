package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.zombie.pool.DolphinRiderEntity;
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
public class DolphinRiderModel extends EntityModel<DolphinRiderEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "dolphin_rider"), "main");

	private final ModelPart total;
	private final ModelPart zombie;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart dolphin;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;




public DolphinRiderModel(ModelPart root) {
		this.total = root.getChild("total");
		this.zombie = this.total.getChild("zombie");
		this.left_leg = this.zombie.getChild("left_leg");
		this.right_leg = this.zombie.getChild("right_leg");
		this.body = this.zombie.getChild("body");
		this.left_hand = this.zombie.getChild("left_hand");
		this.right_hand = this.zombie.getChild("right_hand");
		this.head = this.zombie.getChild("head");
		this.dolphin = this.total.getChild("dolphin");
		this.bone = this.dolphin.getChild("bone");
		this.bone2 = this.dolphin.getChild("bone2");
		this.bone3 = this.dolphin.getChild("bone3");
		this.bone4 = this.dolphin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition zombie_pd = total_pd.addOrReplaceChild("zombie",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 12.0F, 9.0F));
		PartDefinition left_leg_pd = zombie_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(112, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 24.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 22.0F, -6.0F, 4.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(4.0F, -24.0F, 0.0F, -0.7854F, 0.0F, -0.5236F));
		PartDefinition right_leg_pd = zombie_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(93, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 24.0F, 4.0F)
				.texOffs(0, 0).addBox(-2.0F, 22.0F, -6.0F, 4.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(-4.0F, -24.0F, 0.0F, -0.7854F, 0.0F, 0.5236F));
		PartDefinition body_pd = zombie_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -17.0F, -3.0F, 14.0F, 24.0F, 6.0F),
			PartPose.offset(0.0F, -31.0F, 0.0F));
		PartDefinition left_hand_pd = zombie_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(112, 66).addBox(0.0F, -2.0F, -2.0F, 4.0F, 24.0F, 4.0F),
			PartPose.offset(7.0F, -46.0F, 0.0F));
		PartDefinition right_hand_pd = zombie_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(112, 66).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 24.0F, 4.0F),
			PartPose.offset(-7.0F, -46.0F, 0.0F));
		PartDefinition head_pd = zombie_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 104).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F),
			PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition dolphin_pd = total_pd.addOrReplaceChild("dolphin",
			CubeListBuilder.create()
				.texOffs(43, 1).addBox(-7.0F, -12.0F, -8.0F, 14.0F, 12.0F, 28.0F)
				.texOffs(1, 32).addBox(-3.0F, -5.0F, -20.0F, 6.0F, 4.0F, 12.0F)
				.texOffs(1, 50).addBox(-4.0F, -6.0F, 20.0F, 8.0F, 6.0F, 8.0F)
				.texOffs(2, 67).addBox(-3.0F, -5.0F, 28.0F, 6.0F, 4.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = dolphin_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(3, 77).addBox(8.0F, -1.0F, 0.0F, 16.0F, 1.0F, 12.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.1745F));
		PartDefinition bone2_pd = dolphin_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(41, 43).addBox(-24.0F, -1.0F, 0.0F, 17.0F, 1.0F, 12.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.1745F));
		PartDefinition bone3_pd = dolphin_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(2, 94).addBox(-6.0F, -1.0F, -1.0F, 12.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 32.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bone4_pd = dolphin_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(44, 92).addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 10.0F, -0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(DolphinRiderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
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