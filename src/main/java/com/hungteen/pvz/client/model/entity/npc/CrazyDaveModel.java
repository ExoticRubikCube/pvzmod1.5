package com.hungteen.pvz.client.model.entity.npc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.npc.CrazyDaveEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CrazyDaveModel extends EntityModel<CrazyDaveEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "crazy_dave"), "main");

	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart eye_right;
	private final ModelPart eye_left;
	private final ModelPart hat;
	private final ModelPart body;
	private final ModelPart right_hand;
	private final ModelPart left_hand;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public CrazyDaveModel(ModelPart total) {
		this.total = total.getChild("total");
		this.head = this.total.getChild("head");
		this.eye_right = this.head.getChild("eye_right");
		this.eye_left = this.head.getChild("eye_left");
		this.hat = this.head.getChild("hat");
		this.body = this.total.getChild("body");
		this.right_hand = this.total.getChild("right_hand");
		this.left_hand = this.total.getChild("left _hand");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition total = partdefinition.addOrReplaceChild("total", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition head = total.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(24, 5).addBox(-3.0F, -1.75F, -4.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition eye_right = head.addOrReplaceChild("eye_right", CubeListBuilder.create().texOffs(24, 0).addBox(3.0F, -2.0F, -0.8F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(24, 4).addBox(-0.9F, -1.1F, -0.81F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -2.0F, -3.25F));

		PartDefinition eye_left = head.addOrReplaceChild("eye_left", CubeListBuilder.create().texOffs(24, 2).addBox(-1.0F, -2.0F, -0.8F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(24, 4).addBox(3.5F, -1.5F, -0.81F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -2.0F, -3.25F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, -12.5F, -4.25F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-4.5F, -8.5F, -4.75F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.25F));

		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 32).addBox(-1.0F, -0.1958F, -6.7628F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -9.0F, -4.25F, 0.0F, -0.7854F, 0.0F));

		PartDefinition body = total.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition right_hand = total.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -10.0F, 0.0F));

		PartDefinition left_hand = total.addOrReplaceChild("left _hand", CubeListBuilder.create().texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -10.0F, 0.0F));

		PartDefinition right_leg = total.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 0.0F, 0.0F));

		PartDefinition left_leg = total.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(CrazyDaveEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
        this.head.xRot = headPitch / (180F / (float)Math.PI);
        this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.right_hand.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_hand.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.hat.yRot= ageInTicks;
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