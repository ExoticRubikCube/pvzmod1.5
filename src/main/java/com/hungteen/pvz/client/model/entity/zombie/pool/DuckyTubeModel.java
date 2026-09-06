package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.DuckyTubeEntity;
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
public class DuckyTubeModel extends EntityModel<DuckyTubeEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "ducky_tube"), "main");

	private final ModelPart total;
	private final ModelPart bone;

	public DuckyTubeModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(80, 103).addBox(-11.0F, -5.0F, -10.0F, 4.0F, 5.0F, 20.0F)
				.texOffs(90, 90).addBox(-7.0F, -5.0F, 5.0F, 14.0F, 5.0F, 5.0F)
				.texOffs(88, 78).addBox(-7.0F, -5.0F, -10.0F, 14.0F, 5.0F, 6.0F)
				.texOffs(80, 51).addBox(7.0F, -5.0F, -10.0F, 4.0F, 5.0F, 20.0F)
				.texOffs(110, 37).addBox(-3.0F, -7.0F, -12.0F, 6.0F, 7.0F, 3.0F)
				.texOffs(102, 22).addBox(-3.0F, -14.0F, -15.0F, 6.0F, 7.0F, 7.0F)
				.texOffs(110, 14).addBox(-3.0F, -9.0F, -18.0F, 6.0F, 1.0F, 3.0F)
				.texOffs(62, 123).addBox(-2.0F, -14.0F, -8.0F, 4.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone_pd = total_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(68, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -5.0F, 10.0F, 0.5236F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(DuckyTubeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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