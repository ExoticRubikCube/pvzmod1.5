package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.zombie.custom.GigaTombStoneEntity;
import com.hungteen.pvz.common.entity.zombie.grass.AbstractTombStoneEntity;
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

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports
public class TombStoneModel<T extends AbstractTombStoneEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "tomb_stone"), "main");

	private final ModelPart total;
	private final ModelPart logo;
	private final ModelPart red_logo;




public TombStoneModel(ModelPart root) {
		this.total = root.getChild("total");
		this.logo = this.total.getChild("logo");
		this.red_logo = this.total.getChild("red_logo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(56, 105).addBox(-9.0F, -4.0F, -9.0F, 18.0F, 4.0F, 18.0F)
				.texOffs(56, 81).addBox(-9.0F, -38.0F, -9.0F, 18.0F, 4.0F, 18.0F)
				.texOffs(0, 82).addBox(-8.0F, -34.0F, -8.0F, 2.0F, 30.0F, 16.0F)
				.texOffs(92, 0).addBox(6.0F, -34.0F, -8.0F, 2.0F, 30.0F, 16.0F)
				.texOffs(3, 5).addBox(-6.0F, -34.0F, -7.0F, 12.0F, 30.0F, 15.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition logo_pd = total_pd.addOrReplaceChild("logo",
			CubeListBuilder.create()
				.texOffs(0, 51).addBox(-3.0F, -30.0F, -7.1F, 6.0F, 7.0F, 1.0F)
				.texOffs(1, 60).addBox(-4.0F, -29.0F, -7.1F, 1.0F, 5.0F, 1.0F)
				.texOffs(6, 60).addBox(3.0F, -29.0F, -7.1F, 1.0F, 5.0F, 1.0F)
				.texOffs(1, 68).addBox(-2.0F, -31.0F, -7.1F, 4.0F, 1.0F, 1.0F)
				.texOffs(1, 72).addBox(-2.0F, -23.0F, -7.1F, 4.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition red_logo_pd = total_pd.addOrReplaceChild("red_logo",
			CubeListBuilder.create()
				.texOffs(18, 51).addBox(-3.0F, -30.0F, -7.1F, 6.0F, 7.0F, 1.0F)
				.texOffs(16, 60).addBox(-4.0F, -29.0F, -7.1F, 1.0F, 5.0F, 1.0F)
				.texOffs(22, 60).addBox(3.0F, -29.0F, -7.1F, 1.0F, 5.0F, 1.0F)
				.texOffs(16, 68).addBox(-2.0F, -31.0F, -7.1F, 4.0F, 1.0F, 1.0F)
				.texOffs(14, 72).addBox(-2.0F, -23.0F, -7.1F, 4.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final boolean red = entity instanceof GigaTombStoneEntity;
		this.red_logo.visible = red;
		this.logo.visible = ! red;
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