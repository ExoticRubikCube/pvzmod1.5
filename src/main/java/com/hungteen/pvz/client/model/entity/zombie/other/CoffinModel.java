package com.hungteen.pvz.client.model.entity.zombie.other;

import com.hungteen.pvz.common.entity.zombie.other.CoffinEntity;
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
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CoffinModel extends EntityModel<CoffinEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "coffin"), "main");


	private final ModelPart total;
	private final ModelPart coffin;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart zombie1;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart righthand_r1;
	private final ModelPart head;
	private final ModelPart bone4;
	private final ModelPart zombie2;
	private final ModelPart right_leg2;
	private final ModelPart left_leg2;
	private final ModelPart up2;
	private final ModelPart body2;
	private final ModelPart left_hand2;
	private final ModelPart lefthand_r1;
	private final ModelPart right_hand2;
	private final ModelPart head2;
	private final ModelPart bone5;
	private final ModelPart zombie3;
	private final ModelPart right_leg3;
	private final ModelPart left_leg3;
	private final ModelPart up3;
	private final ModelPart body3;
	private final ModelPart left_hand3;
	private final ModelPart right_hand3;
	private final ModelPart righthand_r2;
	private final ModelPart head3;
	private final ModelPart bone6;
	private final ModelPart zombie4;
	private final ModelPart right_leg4;
	private final ModelPart left_leg4;
	private final ModelPart up4;
	private final ModelPart body4;
	private final ModelPart left_hand4;
	private final ModelPart right_hand4;
	private final ModelPart head4;
	private final ModelPart bone7;




public CoffinModel(ModelPart root) {
		this.total = root.getChild("total");
		this.coffin = root.getChild("coffin");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone = root.getChild("bone");
		this.zombie1 = root.getChild("zombie1");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.body = root.getChild("body");
		this.left_hand = root.getChild("left_hand");
		this.right_hand = root.getChild("right_hand");
		this.righthand_r1 = root.getChild("righthand_r1");
		this.head = root.getChild("head");
		this.bone4 = root.getChild("bone4");
		this.zombie2 = root.getChild("zombie2");
		this.right_leg2 = root.getChild("right_leg2");
		this.left_leg2 = root.getChild("left_leg2");
		this.up2 = root.getChild("up2");
		this.body2 = root.getChild("body2");
		this.left_hand2 = root.getChild("left_hand2");
		this.lefthand_r1 = root.getChild("lefthand_r1");
		this.right_hand2 = root.getChild("right_hand2");
		this.head2 = root.getChild("head2");
		this.bone5 = root.getChild("bone5");
		this.zombie3 = root.getChild("zombie3");
		this.right_leg3 = root.getChild("right_leg3");
		this.left_leg3 = root.getChild("left_leg3");
		this.up3 = root.getChild("up3");
		this.body3 = root.getChild("body3");
		this.left_hand3 = root.getChild("left_hand3");
		this.right_hand3 = root.getChild("right_hand3");
		this.righthand_r2 = root.getChild("righthand_r2");
		this.head3 = root.getChild("head3");
		this.bone6 = root.getChild("bone6");
		this.zombie4 = root.getChild("zombie4");
		this.right_leg4 = root.getChild("right_leg4");
		this.left_leg4 = root.getChild("left_leg4");
		this.up4 = root.getChild("up4");
		this.body4 = root.getChild("body4");
		this.left_hand4 = root.getChild("left_hand4");
		this.right_hand4 = root.getChild("right_hand4");
		this.head4 = root.getChild("head4");
		this.bone7 = root.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition coffin_pd = total_pd.addOrReplaceChild("coffin",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition bone2_pd = coffin_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(213, 64).addBox(-16.0F, -24.017099F, -47.214901F, 32.0F, 11.0F, 96.0F)
				.texOffs(219, 197).addBox(-15.0F, -13.0171F, -46.214901F, 30.0F, 11.0F, 94.0F)
				.texOffs(206, 334).addBox(-18.0F, -2.0171F, -49.214901F, 36.0F, 2.0F, 100.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = coffin_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(18, 259).addBox(-19.0F, -28.017099F, -50.214901F, 38.0F, 3.0F, 102.0F)
				.texOffs(38, 389).addBox(-15.0F, -25.017099F, -46.214901F, 30.0F, 1.0F, 94.0F)
				.texOffs(14, 128).addBox(-17.0F, -29.017099F, -48.214901F, 34.0F, 1.0F, 98.0F)
				.texOffs(24, 13).addBox(-15.0F, -31.017099F, -44.214901F, 30.0F, 2.0F, 90.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition zombie1_pd = total_pd.addOrReplaceChild("zombie1",
			CubeListBuilder.create(),
			PartPose.offset(29.0F, 0.0F, -16.0F));
		PartDefinition right_leg_pd = zombie1_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg_pd = zombie1_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = zombie1_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -17.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(196, 6).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create(),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition righthand_r1_pd = right_hand_pd.addOrReplaceChild("righthand_r1",
			CubeListBuilder.create()
				.texOffs(455, 41).addBox(-3.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 132).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition bone4_pd = head_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(415, 18).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 7.0F, 12.0F),
			PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition zombie2_pd = total_pd.addOrReplaceChild("zombie2",
			CubeListBuilder.create(),
			PartPose.offset(-28.0F, 0.0F, -16.0F));
		PartDefinition right_leg2_pd = zombie2_pd.addOrReplaceChild("right_leg2",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg2_pd = zombie2_pd.addOrReplaceChild("left_leg2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up2_pd = zombie2_pd.addOrReplaceChild("up2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body2_pd = up2_pd.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand2_pd = up2_pd.addOrReplaceChild("left_hand2",
			CubeListBuilder.create(),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition lefthand_r1_pd = left_hand2_pd.addOrReplaceChild("lefthand_r1",
			CubeListBuilder.create()
				.texOffs(196, 6).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition right_hand2_pd = up2_pd.addOrReplaceChild("right_hand2",
			CubeListBuilder.create()
				.texOffs(455, 41).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition head2_pd = up2_pd.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(16, 132).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition bone5_pd = head2_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(415, 18).addBox(-6.0F, -71.0F, -6.0F, 12.0F, 7.0F, 12.0F),
			PartPose.offset(0.0F, 48.0F, 0.0F));
		PartDefinition zombie3_pd = total_pd.addOrReplaceChild("zombie3",
			CubeListBuilder.create(),
			PartPose.offset(29.0F, 0.0F, 32.0F));
		PartDefinition right_leg3_pd = zombie3_pd.addOrReplaceChild("right_leg3",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 1.0F));
		PartDefinition left_leg3_pd = zombie3_pd.addOrReplaceChild("left_leg3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 1.0F));
		PartDefinition up3_pd = zombie3_pd.addOrReplaceChild("up3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, -45.0F));
		PartDefinition body3_pd = up3_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -17.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, -7.0F, 45.0F));
		PartDefinition left_hand3_pd = up3_pd.addOrReplaceChild("left_hand3",
			CubeListBuilder.create()
				.texOffs(196, 6).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -20.0F, 45.0F));
		PartDefinition right_hand3_pd = up3_pd.addOrReplaceChild("right_hand3",
			CubeListBuilder.create(),
			PartPose.offset(-12.0F, -20.0F, 45.0F));
		PartDefinition righthand_r2_pd = right_hand3_pd.addOrReplaceChild("righthand_r2",
			CubeListBuilder.create()
				.texOffs(455, 41).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition head3_pd = up3_pd.addOrReplaceChild("head3",
			CubeListBuilder.create()
				.texOffs(16, 132).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 45.0F));
		PartDefinition bone6_pd = head3_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(415, 18).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 7.0F, 12.0F),
			PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition zombie4_pd = total_pd.addOrReplaceChild("zombie4",
			CubeListBuilder.create(),
			PartPose.offset(-28.0F, 0.0F, 32.0F));
		PartDefinition right_leg4_pd = zombie4_pd.addOrReplaceChild("right_leg4",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg4_pd = zombie4_pd.addOrReplaceChild("left_leg4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up4_pd = zombie4_pd.addOrReplaceChild("up4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, -1.0F));
		PartDefinition body4_pd = up4_pd.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 1.0F));
		PartDefinition left_hand4_pd = up4_pd.addOrReplaceChild("left_hand4",
			CubeListBuilder.create()
				.texOffs(196, 6).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(12.0F, -20.0F, 1.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition right_hand4_pd = up4_pd.addOrReplaceChild("right_hand4",
			CubeListBuilder.create()
				.texOffs(455, 41).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -20.0F, 1.0F));
		PartDefinition head4_pd = up4_pd.addOrReplaceChild("head4",
			CubeListBuilder.create()
				.texOffs(16, 132).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 1.0F));
		PartDefinition bone7_pd = head4_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(415, 18).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 7.0F, 12.0F),
			PartPose.offset(0.0F, -17.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}


	@Override
	public void setupAnim(CoffinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.updateParts(entity);
		// front left
		this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.left_hand.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		// front right
		this.left_leg2.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_leg2.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.right_hand2.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		// back left
		this.left_leg3.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_leg3.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.left_hand3.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		// back right
		this.left_leg4.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_leg4.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.right_hand4.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		// coffin angry
		float percent = entity.getHealth() / entity.getMaxHealth();
		if (percent <= 1f / 6) {
			this.coffin.zRot = Mth.sin(ageInTicks * 0.8f) * 0.2f;
		} else {
			this.coffin.zRot = 0;
		}
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void updateParts(CoffinEntity entity) {
		float percent = entity.getHealth() / entity.getMaxHealth();
		this.zombie1.visible = percent > 5f / 6;
		this.zombie2.visible = percent > 4f / 6;
		this.zombie3.visible = percent > 3f / 6;
		this.zombie4.visible = percent > 2f / 6;
	}
}