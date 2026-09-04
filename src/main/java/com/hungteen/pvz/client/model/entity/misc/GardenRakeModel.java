package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.GardenRakeEntity;
import com.hungteen.pvz.utils.AnimationUtil;
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

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GardenRakeModel extends EntityModel<GardenRakeEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "garden_rake"), "main");

	private final ModelPart total;
	private final ModelPart bone;
	private final ModelPart bone2;




public GardenRakeModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
		this.bone2 = this.total.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(75, 124).addBox(-12.0F, -1.0F, 1.0F, 24.0F, 1.0F, 2.0F)
				.texOffs(0, 0).addBox(-12.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(-10.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(-8.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(-6.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(-4.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(-2.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(11.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(9.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(7.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(5.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(3.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(0, 0).addBox(0.0F, -4.0F, 0.0F, 2.0F, 3.0F, 1.0F)
				.texOffs(23, 5).addBox(-1.0F, -1.0F, 3.0F, 2.0F, 1.0F, 48.0F),
			PartPose.offset(0.0F, 24.0F, -3.0F));
		PartDefinition bone_pd = total_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(40, 117).addBox(-1.0F, -1.0F, 0.0F, 15.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(1.0F, 0.0F, 12.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone2_pd = total_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(28, 123).addBox(-14.0F, -1.0F, 0.0F, 15.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 12.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(GardenRakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		int time = entity.getAttackTime();
		if(time > 0) {
			int max = entity.getAnimTime();
			this.total.xRot = AnimationUtil.getUp(time, max, 120);
		} else {
			this.total.xRot = 0;
		}
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