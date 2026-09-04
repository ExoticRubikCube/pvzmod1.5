package com.hungteen.pvz.client.model.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.LivingEntity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class BucketHeadModel extends HumanoidModel<LivingEntity> {
	private final ModelPart total;
	private final ModelPart pole;
	public BucketHeadModel(ModelPart root) {
        super(root);
		this.total = root.getChild("total");
		this.pole = this.total.getChild("pole");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition total = partdefinition.addOrReplaceChild("total", CubeListBuilder.create()
						.texOffs(23, 43).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F)
						.texOffs(0, 52).addBox(-5.0F, 0.0F, -5.0F, 1.0F, 1.0F, 10.0F)
						.texOffs(0, 40).addBox(4.0F, 0.0F, -5.0F, 1.0F, 1.0F, 10.0F)
						.texOffs(1, 35).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 1.0F, 1.0F)
						.texOffs(23, 35).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 1.0F, 1.0F),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition pole = total.addOrReplaceChild("pole", CubeListBuilder.create()
						.texOffs(0, 40).addBox(5.0F, -1.0F, -8.0F, 1.0F, 1.0F, 10.0F)
						.texOffs(0, 40).addBox(-6.0F, -1.0F, -8.0F, 1.0F, 1.0F, 10.0F)
						.texOffs(0, 40).addBox(-5.0F, -1.0F, -8.0F, 10.0F, 1.0F, 1.0F),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}