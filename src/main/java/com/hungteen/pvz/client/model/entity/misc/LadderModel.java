package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
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
public class LadderModel<T extends PVZPlantEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "ladder"), "main");

	private final ModelPart total;
	private final ModelPart floor;




public LadderModel(ModelPart root) {
		this.total = root.getChild("total");
		this.floor = this.total.getChild("floor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(14, 10).addBox(-12.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(0, 10).addBox(9.0F, -22.0F, -2.0F, 3.0F, 50.0F, 4.0F, new CubeDeformation(0.1F))
				.texOffs(28, 50).addBox(8.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F)
				.texOffs(28, 57).addBox(-13.0F, 28.0F, -3.0F, 5.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition floor_pd = total_pd.addOrReplaceChild("floor",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-9.0F, 20.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(0, 4).addBox(-9.0F, 12.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(0, 4).addBox(-9.0F, 4.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(0, 4).addBox(-9.0F, -4.0F, -2.0F, 18.0F, 2.0F, 4.0F)
				.texOffs(0, 4).addBox(-9.0F, -12.0F, -2.0F, 18.0F, 2.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	
	public void render(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}