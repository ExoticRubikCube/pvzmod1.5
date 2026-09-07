package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CherryBombEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CherryBombModel extends PVZPlantModel<CherryBombEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "cherry_bomb"), "main");
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart head1;
	private final ModelPart head3_r1;
	private final ModelPart head2_r1;
	private final ModelPart head1_r1;
	private final ModelPart head2;
	private final ModelPart head4_r1;
	private final ModelPart head3_r2;


	public CherryBombModel(ModelPart root) {
		this.body = root.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.bone.getChild("bone3");
		this.bone2 = this.body.getChild("bone2");
		this.head1 = this.body.getChild("head1");
		this.head3_r1 = this.head1.getChild("head3_r1");
		this.head2_r1 = this.head1.getChild("head2_r1");
		this.head1_r1 = this.head1.getChild("head1_r1");
		this.head2 = this.body.getChild("head2");
		this.head4_r1 = this.head2.getChild("head4_r1");
		this.head3_r2 = this.head2.getChild("head3_r2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(40, 24).addBox(-2.0F, -13.0F, -1.0F, 16.0F, 16.0F, 0.0F),
			PartPose.offset(-9.0F, -11.0F, 0.0F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(10, 38).addBox(-1.0F, -8.0F, -3.0F, 0.0F, 8.0F, 6.0F),
			PartPose.offsetAndRotation(7.0F, -12.0F, 0.0F, 0.2182F, -0.3491F, 0.6981F));
		PartDefinition bone2 = body.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(40, 40).addBox(-11.0F, -6.0F, -1.0F, 12.0F, 16.0F, 0.0F),
			PartPose.offset(9.0F, -18.0F, 0.0F));
		PartDefinition head1 = body.addOrReplaceChild("head1",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-10.491F, -6.5F, 1.4165F, 0.0F, 0.2618F, 0.0F));
		PartDefinition head3_r1 = head1.addOrReplaceChild("head3_r1",
			CubeListBuilder.create()
				.texOffs(0, 44).addBox(-0.5F, -5.25F, -5.5F, 1.0F, 6.0F, 8.0F),
			PartPose.offsetAndRotation(6.8032F, 1.7679F, -7.25F, 0.0F, -1.5708F, -0.4363F));
		PartDefinition head2_r1 = head1.addOrReplaceChild("head2_r1",
			CubeListBuilder.create()
				.texOffs(36, 0).addBox(-0.5F, -3.25F, -2.75F, 1.0F, 4.0F, 6.0F),
			PartPose.offsetAndRotation(-1.125F, -0.5F, -7.25F, 0.0F, -1.5708F, 0.5236F));
		PartDefinition head1_r1 = head1.addOrReplaceChild("head1_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F),
			PartPose.offsetAndRotation(2.875F, 0.5F, -1.5F, 0.0F, -1.5708F, 0.0F));
		PartDefinition head2 = body.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(0, 24).addBox(-9.0F, 8.0F, -5.0F, 10.0F, 10.0F, 10.0F),
			PartPose.offsetAndRotation(11.0F, -19.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition head4_r1 = head2.addOrReplaceChild("head4_r1",
			CubeListBuilder.create()
				.texOffs(22, 44).addBox(-3.0F, -1.25F, -0.5F, 6.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 11.5F, -4.75F, 0.0F, 0.0F, -0.5672F));
		PartDefinition head3_r2 = head2.addOrReplaceChild("head3_r2",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(-6.0F, 11.0F, -4.75F, 0.0F, 0.0F, 0.48F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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