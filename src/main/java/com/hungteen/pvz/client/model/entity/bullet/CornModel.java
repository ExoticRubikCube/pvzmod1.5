package com.hungteen.pvz.client.model.entity.bullet;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.bullet.CornEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CornModel extends EntityModel<CornEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "corn"), "main");

	private final ModelPart total;
	private final ModelPart corn;




public CornModel(ModelPart root) {
		this.total = root.getChild("total");
		this.corn = this.total.getChild("corn");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition corn_pd = total_pd.addOrReplaceChild("corn",
			CubeListBuilder.create()
				.texOffs(0, 26).addBox(-4.5F, -28.0F, -2.5F, 9.0F, 29.0F, 9.0F)
				.texOffs(36, 56).addBox(-3.5F, -28.75F, -1.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -1.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(CornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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