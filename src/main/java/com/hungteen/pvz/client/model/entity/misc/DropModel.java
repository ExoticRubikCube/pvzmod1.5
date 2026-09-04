package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.drop.DropEntity;
import com.hungteen.pvz.common.entity.misc.drop.SunEntity;
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

public class DropModel<T extends DropEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "drop"), "main");

	private final ModelPart body;




public DropModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body_pd = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-32.0F, -32.0F, 0.0F, 64.0F, 64.0F, 0.0F),
			PartPose.offset(0.0F, -8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity instanceof SunEntity) {
			this.body.zRot = ageInTicks / 50;
		} else {
			this.body.zRot = 0;
		}
		this.body.xRot = 0;
		this.body.yRot = 0;
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}