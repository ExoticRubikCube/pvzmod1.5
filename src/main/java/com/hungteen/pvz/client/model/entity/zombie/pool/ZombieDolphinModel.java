package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.zombie.pool.ZombieDolphinEntity;
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
import net.minecraft.util.Mth;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ZombieDolphinModel extends EntityModel<ZombieDolphinEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "zombie_dolphin"), "main");

	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart tail;
	private final ModelPart tail_fin;
	private final ModelPart back_fin;
	private final ModelPart left_fin;
	private final ModelPart right_fin;




public ZombieDolphinModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.nose = this.head.getChild("nose");
		this.tail = this.body.getChild("tail");
		this.tail_fin = this.tail.getChild("tail_fin");
		this.back_fin = this.body.getChild("back_fin");
		this.left_fin = this.body.getChild("left_fin");
		this.right_fin = this.body.getChild("right_fin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body_pd = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(21, 43).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F),
			PartPose.offset(0.0F, 24.0F, -3.0F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition nose_pd = head_pd.addOrReplaceChild("nose",
			CubeListBuilder.create()
				.texOffs(30, 2).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, -10.0F));
		PartDefinition tail_pd = body_pd.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(33, 12).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 5.0F, 11.0F),
			PartPose.offsetAndRotation(0.0F, -2.5F, 14.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tail_fin_pd = tail_pd.addOrReplaceChild("tail_fin",
			CubeListBuilder.create()
				.texOffs(29, 31).addBox(-5.0F, -0.5F, -1.0F, 10.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.1396F, 0.0F, 0.0F));
		PartDefinition back_fin_pd = body_pd.addOrReplaceChild("back_fin",
			CubeListBuilder.create()
				.texOffs(18, 16).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 4.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 5.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition left_fin_pd = body_pd.addOrReplaceChild("left_fin",
			CubeListBuilder.create()
				.texOffs(1, 15).addBox(0.0F, -4.0F, -1.5F, 1.0F, 4.0F, 7.0F),
			PartPose.offsetAndRotation(3.0F, -2.0F, 5.0F, 0.9599F, 0.0F, 1.8675F));
		PartDefinition right_fin_pd = body_pd.addOrReplaceChild("right_fin",
			CubeListBuilder.create()
				.texOffs(1, 27).mirror().addBox(-1.0F, -4.0F, -1.5F, 1.0F, 4.0F, 7.0F),
			PartPose.offsetAndRotation(-3.0F, -2.0F, 5.0F, 0.9599F, 0.0F, -1.8675F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(ZombieDolphinEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		this.body.xRot = headPitch * ((float) Math.PI / 180F);
		this.body.yRot = netHeadYaw * ((float) Math.PI / 180F);
		if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-7D) {
			this.body.xRot += -0.05F + -0.05F * Mth.cos(ageInTicks * 0.3F);
			this.tail.xRot = -0.1F * Mth.cos(ageInTicks * 0.3F);
			this.tail_fin.xRot = -0.2F * Mth.cos(ageInTicks * 0.3F);
		}
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}