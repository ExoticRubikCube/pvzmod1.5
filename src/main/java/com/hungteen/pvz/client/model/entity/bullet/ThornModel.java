package com.hungteen.pvz.client.model.entity.bullet;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.bullet.ThornEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ThornModel extends EntityModel<ThornEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "thorn"), "main");

	private final ModelPart total;
	private final ModelPart bone;
	private final ModelPart bone2;




public ThornModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
		this.bone2 = this.total.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone_pd = total_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 5).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone2_pd = total_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 9).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}


	@Override
	public void setupAnim(ThornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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