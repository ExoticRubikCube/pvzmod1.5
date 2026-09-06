package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.ZombieHandEntity;
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

// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ZombieHandModel extends EntityModel<ZombieHandEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "zombie_hand"), "main");

	private final ModelPart total;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;




public ZombieHandModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
		this.bone2 = this.total.getChild("bone2");
		this.bone3 = this.total.getChild("bone3");
		this.bone4 = this.total.getChild("bone4");
		this.bone5 = this.total.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(1, 31).addBox(-4.0F, -24.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone_pd = total_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(35, 53).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(-3.0F, -24.0F, 2.0F, -0.7854F, -0.2618F, 0.0F));
		PartDefinition bone2_pd = total_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(45, 53).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -24.0F, 3.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone3_pd = total_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(55, 53).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(3.0F, -24.0F, 2.0F, -0.7854F, 0.2618F, 0.0F));
		PartDefinition bone4_pd = total_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(34, 42).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(-3.0F, -24.0F, -2.0F, -1.0472F, -1.0472F, 0.0F));
		PartDefinition bone5_pd = total_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(45, 41).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(3.0F, -24.0F, -2.0F, -1.0472F, 1.0472F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(ZombieHandEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		int tick = entity.getTick();
		this.bone.xRot = - 0.785f + tick * 0.08f / 4;
		this.bone2.xRot = - 0.523f + tick * 0.08f / 4;
		this.bone3.xRot = - 0.785f + tick * 0.08f / 4;
		this.bone4.xRot = - 1.047f + tick * 0.14f / 4;
		this.bone5.xRot = - 1.047f + tick * 0.14f / 4;
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