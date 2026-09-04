package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CherryBombEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.EntityModel;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CherryBombModel extends PVZPlantModel<CherryBombEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "cherry_bomb"), "main");

	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart head1;
	private final ModelPart head2;




public CherryBombModel(ModelPart root) {
		this.body = root.getChild("body");
		this.bone = root.getChild("bone");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
		this.head1 = root.getChild("head1");
		this.head2 = root.getChild("head2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body_pd = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone_pd = body_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(52, 105).addBox(-2.0F, -17.0F, -1.0F, 2.0F, 20.0F, 2.0F),
			PartPose.offsetAndRotation(-9.0F, -18.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone3_pd = bone_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(36, 113).addBox(-1.0F, -8.0F, -3.0F, 1.0F, 8.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, -0.3491F, 0.6981F));
		PartDefinition bone2_pd = body_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(23, 108).addBox(0.0F, -13.0F, -1.0F, 2.0F, 16.0F, 2.0F),
			PartPose.offsetAndRotation(9.0F, -18.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition head1_pd = body_pd.addOrReplaceChild("head1",
			CubeListBuilder.create()
				.texOffs(63, 61).addBox(-8.0F, 1.0F, -8.0F, 16.0F, 16.0F, 16.0F)
				.texOffs(97, 30).addBox(8.0F, 2.0F, -7.0F, 1.0F, 14.0F, 14.0F)
				.texOffs(64, 31).addBox(-9.0F, 2.0F, -7.0F, 1.0F, 14.0F, 14.0F)
				.texOffs(97, 14).addBox(-7.0F, 2.0F, -9.0F, 14.0F, 14.0F, 1.0F)
				.texOffs(64, 13).addBox(-7.0F, 2.0F, 8.0F, 14.0F, 14.0F, 1.0F)
				.texOffs(0, 85).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 1.0F, 14.0F)
				.texOffs(1, 68).addBox(-7.0F, 17.0F, -7.0F, 14.0F, 1.0F, 14.0F),
			PartPose.offsetAndRotation(-11.0F, -18.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition head2_pd = body_pd.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(63, 95).addBox(-8.0F, 1.0F, -8.0F, 16.0F, 16.0F, 16.0F)
				.texOffs(29, 37).addBox(8.0F, 2.0F, -7.0F, 1.0F, 14.0F, 14.0F)
				.texOffs(3, 7).addBox(-9.0F, 2.0F, -7.0F, 1.0F, 14.0F, 14.0F)
				.texOffs(4, 140).addBox(-7.0F, 2.0F, -9.0F, 14.0F, 14.0F, 1.0F)
				.texOffs(44, 139).addBox(-7.0F, 2.0F, 8.0F, 14.0F, 14.0F, 1.0F)
				.texOffs(84, 138).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 1.0F, 14.0F)
				.texOffs(8, 163).addBox(-7.0F, 17.0F, -7.0F, 14.0F, 1.0F, 14.0F),
			PartPose.offsetAndRotation(11.0F, -18.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(CherryBombEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<CherryBombEntity> getPlantModel() {
		return this;
	}
}