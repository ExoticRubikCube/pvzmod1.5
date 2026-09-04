package com.hungteen.pvz.client.model.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.LivingEntity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ConeHeadModel extends HumanoidModel<LivingEntity> {

	public ConeHeadModel(float scale) {
		super(buildMesh().getRoot().bake(64, 64));
	}

	private static MeshDefinition buildMesh() {
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		head.addOrReplaceChild("cone_body",
			CubeListBuilder.create()
				.texOffs(1, 33).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 3.0F, 10.0F)
				.texOffs(2, 47).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 1.0F, 2.0F)
				.texOffs(1, 51).addBox(-6.0F, 0.0F, 4.0F, 12.0F, 1.0F, 2.0F)
				.texOffs(1, 54).addBox(4.0F, 0.0F, -4.0F, 2.0F, 1.0F, 8.0F)
				.texOffs(42, 43).addBox(-6.0F, 0.0F, -4.0F, 2.0F, 1.0F, 8.0F)
				.texOffs(31, 53).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 3.0F, 8.0F)
				.texOffs(40, 33).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 3.0F, 6.0F)
				.texOffs(15, 55).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 3.0F, 4.0F)
				.texOffs(1, 35).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 3.0F, 2.0F),
			PartPose.offset(0.0F, -8.0F, 0.0F));
		return mesh;
	}
}
