package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.GoldLeafEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GoldLeafModel extends PVZPlantModel<GoldLeafEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "gold_leaf"), "main");
	private final ModelPart total;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart hair;
	private final ModelPart outer;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart face;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart left;
	private final ModelPart right;


	public GoldLeafModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cube_r1 = this.total.getChild("cube_r1");
		this.cube_r2 = this.total.getChild("cube_r2");
		this.cube_r3 = this.total.getChild("cube_r3");
		this.cube_r4 = this.total.getChild("cube_r4");
		this.hair = this.total.getChild("hair");
		this.outer = this.hair.getChild("outer");
		this.bone = this.outer.getChild("bone");
		this.bone2 = this.outer.getChild("bone2");
		this.bone3 = this.outer.getChild("bone3");
		this.bone4 = this.outer.getChild("bone4");
		this.bone5 = this.outer.getChild("bone5");
		this.bone6 = this.outer.getChild("bone6");
		this.face = this.total.getChild("face");
		this.cube_r5 = this.face.getChild("cube_r5");
		this.cube_r6 = this.face.getChild("cube_r6");
		this.left = this.total.getChild("left");
		this.right = this.total.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(40, 41).addBox(-5.0F, -10.0F, -1.0F, 10.0F, 10.0F, 2.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = total.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(24, 45).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(6.132F, -7.6264F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r2 = total.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(24, 45).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(-6.1439F, -7.7346F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r3 = total.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(24, 45).addBox(-2.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(-4.25F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r4 = total.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(32, 47).addBox(0.5F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(3.75F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition hair = total.addOrReplaceChild("hair",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-2.0F, -3.0F, -1.0F, 6.0F, 4.0F, 2.0F)
				.texOffs(16, 60).addBox(0.0F, -4.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
				.texOffs(18, 57).addBox(-3.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F)
				.texOffs(14, 56).addBox(4.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F)
				.texOffs(58, 56).addBox(0.5052F, -5.4466F, -1.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(54, 55).addBox(0.5052F, -5.4466F, -0.85F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)),
			PartPose.offset(-1.0F, -11.0F, 0.0F));
		PartDefinition outer = hair.addOrReplaceChild("outer",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = outer.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(24, 56).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F),
			PartPose.offsetAndRotation(6.0F, 5.75F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition bone2 = outer.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(32, 56).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F),
			PartPose.offsetAndRotation(-4.0F, 5.75F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone3 = outer.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(40, 58).addBox(-2.3489F, -4.1825F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone4 = outer.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(48, 58).addBox(0.3489F, -4.1825F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone5 = outer.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(56, 59).addBox(-1.5274F, -3.9477F, -1.0F, 2.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(-2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone6 = outer.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(0, 53).addBox(-0.4726F, -3.9477F, -1.0F, 2.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(4.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition face = total.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(18, 48).addBox(-3.0F, -5.75F, -1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 49).addBox(1.0F, -5.75F, -1.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(10, 50).addBox(-1.0F, -1.75F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = face.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(8, 56).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.6707F, -1.2725F, -1.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r6 = face.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(26, 54).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.6366F, -1.5313F, -1.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition left = total.addOrReplaceChild("left",
			CubeListBuilder.create()
				.texOffs(40, 53).addBox(-0.7071F, -2.7071F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition right = total.addOrReplaceChild("right",
			CubeListBuilder.create()
				.texOffs(9, 52).addBox(-3.5858F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(-6.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GoldLeafEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.total.yRot = entity.getAttackTime() * 0.5F;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GoldLeafEntity> getPlantModel() {
		return this;
	}
}