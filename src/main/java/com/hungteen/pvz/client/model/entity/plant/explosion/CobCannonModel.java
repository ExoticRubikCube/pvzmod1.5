package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CobCannonEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CobCannonModel extends PVZPlantModel<CobCannonEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "cob_cannon"), "main");
	private final ModelPart total;
	private final ModelPart wheels;
	private final ModelPart wheel1;
	private final ModelPart wheel8_r1;
	private final ModelPart wheel7_r1;
	private final ModelPart wheel6_r1;
	private final ModelPart wheel5_r1;
	private final ModelPart wheel4_r1;
	private final ModelPart wheel3_r1;
	private final ModelPart wheel2_r1;
	private final ModelPart wheel1_r1;
	private final ModelPart wheel2;
	private final ModelPart wheel9_r1;
	private final ModelPart wheel8_r2;
	private final ModelPart wheel7_r2;
	private final ModelPart wheel6_r2;
	private final ModelPart wheel5_r2;
	private final ModelPart wheel4_r2;
	private final ModelPart wheel3_r2;
	private final ModelPart wheel2_r2;
	private final ModelPart wheel3;
	private final ModelPart wheel9_r2;
	private final ModelPart wheel8_r3;
	private final ModelPart wheel7_r3;
	private final ModelPart wheel6_r3;
	private final ModelPart wheel5_r3;
	private final ModelPart wheel4_r3;
	private final ModelPart wheel3_r3;
	private final ModelPart wheel2_r3;
	private final ModelPart wheel4;
	private final ModelPart wheel10_r1;
	private final ModelPart wheel9_r3;
	private final ModelPart wheel8_r4;
	private final ModelPart wheel7_r4;
	private final ModelPart wheel6_r4;
	private final ModelPart wheel5_r4;
	private final ModelPart wheel4_r4;
	private final ModelPart wheel3_r4;
	private final ModelPart base;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart base_r1;
	private final ModelPart body;
	private final ModelPart corn;
	private final ModelPart outer;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart leaves;
	private final ModelPart tail;



	public CobCannonModel(ModelPart root) {
		this.total = root.getChild("total");
		this.wheels = this.total.getChild("wheels");
		this.wheel1 = this.wheels.getChild("wheel1");
		this.wheel8_r1 = this.wheel1.getChild("wheel8_r1");
		this.wheel7_r1 = this.wheel1.getChild("wheel7_r1");
		this.wheel6_r1 = this.wheel1.getChild("wheel6_r1");
		this.wheel5_r1 = this.wheel1.getChild("wheel5_r1");
		this.wheel4_r1 = this.wheel1.getChild("wheel4_r1");
		this.wheel3_r1 = this.wheel1.getChild("wheel3_r1");
		this.wheel2_r1 = this.wheel1.getChild("wheel2_r1");
		this.wheel1_r1 = this.wheel1.getChild("wheel1_r1");
		this.wheel2 = this.wheels.getChild("wheel2");
		this.wheel9_r1 = this.wheel2.getChild("wheel9_r1");
		this.wheel8_r2 = this.wheel2.getChild("wheel8_r2");
		this.wheel7_r2 = this.wheel2.getChild("wheel7_r2");
		this.wheel6_r2 = this.wheel2.getChild("wheel6_r2");
		this.wheel5_r2 = this.wheel2.getChild("wheel5_r2");
		this.wheel4_r2 = this.wheel2.getChild("wheel4_r2");
		this.wheel3_r2 = this.wheel2.getChild("wheel3_r2");
		this.wheel2_r2 = this.wheel2.getChild("wheel2_r2");
		this.wheel3 = this.wheels.getChild("wheel3");
		this.wheel9_r2 = this.wheel3.getChild("wheel9_r2");
		this.wheel8_r3 = this.wheel3.getChild("wheel8_r3");
		this.wheel7_r3 = this.wheel3.getChild("wheel7_r3");
		this.wheel6_r3 = this.wheel3.getChild("wheel6_r3");
		this.wheel5_r3 = this.wheel3.getChild("wheel5_r3");
		this.wheel4_r3 = this.wheel3.getChild("wheel4_r3");
		this.wheel3_r3 = this.wheel3.getChild("wheel3_r3");
		this.wheel2_r3 = this.wheel3.getChild("wheel2_r3");
		this.wheel4 = this.wheels.getChild("wheel4");
		this.wheel10_r1 = this.wheel4.getChild("wheel10_r1");
		this.wheel9_r3 = this.wheel4.getChild("wheel9_r3");
		this.wheel8_r4 = this.wheel4.getChild("wheel8_r4");
		this.wheel7_r4 = this.wheel4.getChild("wheel7_r4");
		this.wheel6_r4 = this.wheel4.getChild("wheel6_r4");
		this.wheel5_r4 = this.wheel4.getChild("wheel5_r4");
		this.wheel4_r4 = this.wheel4.getChild("wheel4_r4");
		this.wheel3_r4 = this.wheel4.getChild("wheel3_r4");
		this.base = this.total.getChild("base");
		this.cube_r1 = this.base.getChild("cube_r1");
		this.cube_r2 = this.base.getChild("cube_r2");
		this.base_r1 = this.base.getChild("base_r1");
		this.body = this.total.getChild("body");
		this.corn = this.body.getChild("corn");
		this.outer = this.body.getChild("outer");
		this.cube_r3 = this.outer.getChild("cube_r3");
		this.cube_r4 = this.outer.getChild("cube_r4");
		this.cube_r5 = this.outer.getChild("cube_r5");
		this.cube_r6 = this.outer.getChild("cube_r6");
		this.cube_r7 = this.outer.getChild("cube_r7");
		this.cube_r8 = this.outer.getChild("cube_r8");
		this.cube_r9 = this.outer.getChild("cube_r9");
		this.cube_r10 = this.outer.getChild("cube_r10");
		this.leaves = this.outer.getChild("leaves");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition wheels = total.addOrReplaceChild("wheels",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition wheel1 = wheels.addOrReplaceChild("wheel1",
			CubeListBuilder.create()
				.texOffs(0, 15).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F),
			PartPose.offset(8.0F, 0.0F, -8.0F));
		PartDefinition wheel8_r1 = wheel1.addOrReplaceChild("wheel8_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7835F, 0.0617F, 0.0618F));
		PartDefinition wheel7_r1 = wheel1.addOrReplaceChild("wheel7_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7835F, -0.0617F, 0.0618F));
		PartDefinition wheel6_r1 = wheel1.addOrReplaceChild("wheel6_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3581F, -0.0617F, -0.0618F));
		PartDefinition wheel5_r1 = wheel1.addOrReplaceChild("wheel5_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3581F, 0.0617F, -0.0618F));
		PartDefinition wheel4_r1 = wheel1.addOrReplaceChild("wheel4_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0873F, 0.0F));
		PartDefinition wheel3_r1 = wheel1.addOrReplaceChild("wheel3_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.0873F, 0.0F));
		PartDefinition wheel2_r1 = wheel1.addOrReplaceChild("wheel2_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, -0.0873F));
		PartDefinition wheel1_r1 = wheel1.addOrReplaceChild("wheel1_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wheel2 = wheels.addOrReplaceChild("wheel2",
			CubeListBuilder.create()
				.texOffs(0, 11).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F),
			PartPose.offset(-8.0F, 0.0F, -8.0F));
		PartDefinition wheel9_r1 = wheel2.addOrReplaceChild("wheel9_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7835F, -0.0617F, -0.0618F));
		PartDefinition wheel8_r2 = wheel2.addOrReplaceChild("wheel8_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7835F, 0.0617F, -0.0618F));
		PartDefinition wheel7_r2 = wheel2.addOrReplaceChild("wheel7_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3581F, 0.0617F, 0.0618F));
		PartDefinition wheel6_r2 = wheel2.addOrReplaceChild("wheel6_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3581F, -0.0617F, 0.0618F));
		PartDefinition wheel5_r2 = wheel2.addOrReplaceChild("wheel5_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.0873F, 0.0F));
		PartDefinition wheel4_r2 = wheel2.addOrReplaceChild("wheel4_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0873F, 0.0F));
		PartDefinition wheel3_r2 = wheel2.addOrReplaceChild("wheel3_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0873F));
		PartDefinition wheel2_r2 = wheel2.addOrReplaceChild("wheel2_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition wheel3 = wheels.addOrReplaceChild("wheel3",
			CubeListBuilder.create()
				.texOffs(18, 11).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offset(8.25F, -1.0F, 7.0F));
		PartDefinition wheel9_r2 = wheel3.addOrReplaceChild("wheel9_r2",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7835F, 0.0617F, 0.0618F));
		PartDefinition wheel8_r3 = wheel3.addOrReplaceChild("wheel8_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7835F, -0.0617F, 0.0618F));
		PartDefinition wheel7_r3 = wheel3.addOrReplaceChild("wheel7_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3581F, -0.0617F, -0.0618F));
		PartDefinition wheel6_r3 = wheel3.addOrReplaceChild("wheel6_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3581F, 0.0617F, -0.0618F));
		PartDefinition wheel5_r3 = wheel3.addOrReplaceChild("wheel5_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0873F, 0.0F));
		PartDefinition wheel4_r3 = wheel3.addOrReplaceChild("wheel4_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -0.0873F, 0.0F));
		PartDefinition wheel3_r3 = wheel3.addOrReplaceChild("wheel3_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -0.0873F));
		PartDefinition wheel2_r3 = wheel3.addOrReplaceChild("wheel2_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition wheel4 = wheels.addOrReplaceChild("wheel4",
			CubeListBuilder.create()
				.texOffs(18, 11).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offset(-8.25F, -1.0F, 7.0F));
		PartDefinition wheel10_r1 = wheel4.addOrReplaceChild("wheel10_r1",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7835F, -0.0617F, -0.0618F));
		PartDefinition wheel9_r3 = wheel4.addOrReplaceChild("wheel9_r3",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7835F, 0.0617F, -0.0618F));
		PartDefinition wheel8_r4 = wheel4.addOrReplaceChild("wheel8_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3581F, 0.0617F, 0.0618F));
		PartDefinition wheel7_r4 = wheel4.addOrReplaceChild("wheel7_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3581F, -0.0617F, 0.0618F));
		PartDefinition wheel6_r4 = wheel4.addOrReplaceChild("wheel6_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -0.0873F, 0.0F));
		PartDefinition wheel5_r4 = wheel4.addOrReplaceChild("wheel5_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0873F, 0.0F));
		PartDefinition wheel4_r4 = wheel4.addOrReplaceChild("wheel4_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 0.0873F));
		PartDefinition wheel3_r4 = wheel4.addOrReplaceChild("wheel3_r4",
			CubeListBuilder.create()
				.texOffs(18, 0).mirror().addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition base = total.addOrReplaceChild("base",
			CubeListBuilder.create()
				.texOffs(36, 28).mirror().addBox(-7.0F, 1.0F, -13.0F, 3.0F, 4.0F, 26.0F)
				.texOffs(36, 28).addBox(4.0F, 1.0F, -13.0F, 3.0F, 4.0F, 26.0F),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -10.0F, -21.0F, 1.0F, 10.0F, 30.0F),
			PartPose.offsetAndRotation(-5.0F, 2.0F, 11.0F, 0.1725F, 0.0189F, -0.4792F));
		PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(0.0F, -10.0F, -21.0F, 1.0F, 10.0F, 30.0F),
			PartPose.offsetAndRotation(5.0F, 2.0F, 11.0F, 0.1725F, -0.0189F, 0.4792F));
		PartDefinition base_r1 = base.addOrReplaceChild("base_r1",
			CubeListBuilder.create()
				.texOffs(32, 0).addBox(-4.0F, -1.2F, -12.95F, 8.0F, 2.0F, 26.0F),
			PartPose.offsetAndRotation(0.0F, 3.25F, 0.0F, 0.0698F, 0.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -10.5F, 6.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition corn = body.addOrReplaceChild("corn",
			CubeListBuilder.create()
				.texOffs(0, 79).addBox(-4.5F, -28.0F, -1.5F, 9.0F, 29.0F, 9.0F)
				.texOffs(74, 0).addBox(-4.0F, -30.75F, -1.0F, 8.0F, 3.0F, 8.0F),
			PartPose.offset(0.0F, 4.0F, -2.0F));
		PartDefinition outer = body.addOrReplaceChild("outer",
			CubeListBuilder.create()
				.texOffs(0, 46).addBox(-6.0F, -14.0F, -5.0F, 12.0F, 21.0F, 12.0F)
				.texOffs(48, 58).addBox(-4.5F, -20.0F, -4.25F, 9.0F, 26.0F, 10.0F, new CubeDeformation(0.1F))
				.texOffs(68, 28).addBox(-5.0F, -21.0F, -5.0F, 10.0F, 7.0F, 11.0F),
			PartPose.offset(0.0F, 1.0F, 0.5F));
		PartDefinition cube_r3 = outer.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 22).addBox(0.0F, -1.0F, 0.0F, 8.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(-4.0F, -23.8191F, 7.0261F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r4 = outer.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(32, 9).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(4.0F, -21.0F, 6.0F, 1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r5 = outer.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(32, 5).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -27.1495F, -7.2272F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r6 = outer.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(32, 0).addBox(-10.0F, -4.0F, 0.0F, 10.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(5.0F, -21.0F, -5.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r7 = outer.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-4.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.5516F, -20.2329F, 5.5F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r8 = outer.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(0.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.5516F, -20.2329F, 5.5F, 0.0F, 0.0F, -1.1345F));
		PartDefinition cube_r9 = outer.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 11).mirror().addBox(-4.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-6.4116F, -24.0431F, 5.5F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r10 = outer.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 11).addBox(0.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(6.4116F, -24.0431F, 5.5F, 0.0F, 0.0F, -0.5236F));
		PartDefinition leaves = outer.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail",
			CubeListBuilder.create()
				.texOffs(32, 13).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 7.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, 7.0F, 2.0F, -0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(CobCannonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.isPlayerRiding()) {
			this.wheel1.xRot = ageInTicks / 2;
			this.wheel2.xRot = ageInTicks / 2;
			this.wheel3.xRot = ageInTicks / 2;
			this.wheel4.xRot = ageInTicks / 2;
		} else {
			this.wheel1.xRot = 0;
			this.wheel2.xRot = 0;
			this.wheel3.xRot = 0;
			this.wheel4.xRot = 0;
		}
		if(entity.getAttackTime() > 0) {
			int time = entity.getAnimCD() - entity.getAttackTime() + 1;
			this.body.xRot = 1.5708F - AnimationUtil.getUpDown(time, entity.getAnimCD(), 90);
			this.corn.visible = (time < entity.getAnimCD() / 2);
		} else {
			this.corn.visible = (entity.getCornNum() > 0);
			this.body.xRot = 1.5708F;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<CobCannonEntity> getPlantModel() {
		return this;
	}
}