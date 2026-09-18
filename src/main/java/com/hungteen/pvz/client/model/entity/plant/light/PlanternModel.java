package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.PlanternEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
public class PlanternModel extends PVZPlantModel<PlanternEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "plantern"), "main");
	private final ModelPart total;
	private final ModelPart bottom;
	private final ModelPart stick;
	private final ModelPart head;
	private final ModelPart cover;
	private final ModelPart eyes_closed;
	private final ModelPart eyes_open;
	private final ModelPart inner_light;

	public PlanternModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bottom = this.total.getChild("bottom");
		this.stick = this.total.getChild("stick");
		this.head = this.stick.getChild("head");
		this.cover = this.head.getChild("cover");
		this.eyes_closed = this.head.getChild("eyes_closed");
		this.eyes_open = this.head.getChild("eyes_open");
		this.inner_light = this.head.getChild("inner_light");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition total = partdefinition.addOrReplaceChild("total", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bottom = total.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(42, 50).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -3.0F, -5.0F, 0.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition stick = total.addOrReplaceChild("stick", CubeListBuilder.create().texOffs(89, 0).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = stick.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(89, 12).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition head = stick.addOrReplaceChild("head", CubeListBuilder.create().texOffs(45, 53).addBox(-5.5F, -25.0F, -5.5F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(0, 64).addBox(-5.0F, -25.0F, -5.0F, 10.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-7.0F, -15.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cover = head.addOrReplaceChild("cover", CubeListBuilder.create().texOffs(2, 1).addBox(-9.0F, -23.0F, -9.0F, 18.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.0F, -33.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-9.0F, -26.0F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
				.texOffs(42, 47).addBox(-6.0F, -29.0F, 0.0F, 12.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(42, 32).addBox(0.0F, -29.0F, -6.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes_closed = head.addOrReplaceChild("eyes_closed", CubeListBuilder.create().texOffs(30, 95).addBox(-5.0F, -25.0F, -4.9F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes_open = head.addOrReplaceChild("eyes_open", CubeListBuilder.create().texOffs(10, 95).addBox(-5.0F, -25.0F, -4.9F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition inner_light = head.addOrReplaceChild("inner_light", CubeListBuilder.create().texOffs(73, 0).addBox(-2.0F, -22.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(PlanternEntity plantern, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		eyes_open.visible = plantern.tickCount % 100 >= 3;
		eyes_closed.visible = ! eyes_open.visible;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		total.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<PlanternEntity> getPlantModel() {
		return this;
	}
}