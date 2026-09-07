package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.ChomperEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ChomperModel extends PVZPlantModel<ChomperEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "chomper"), "main");
	private final ModelPart total;
	private final ModelPart root;
	private final ModelPart leafw;
	private final ModelPart cube_r1;
	private final ModelPart leafe;
	private final ModelPart cube_r2;
	private final ModelPart leafs;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart leaf;
	private final ModelPart leafuw;
	private final ModelPart cube_r3;
	private final ModelPart leafue;
	private final ModelPart cube_r4;
	private final ModelPart leafu;
	private final ModelPart head;
	private final ModelPart up_mouse;
	private final ModelPart down_mouse;
	private final ModelPart saliva;
	private final ModelPart saliva2;
	private final ModelPart tongue;
	private final ModelPart tongue2;
	private final ModelPart tongue3;


	public ChomperModel(ModelPart root) {
		this.total = root.getChild("total");
		this.root = this.total.getChild("root");
		this.leafw = this.root.getChild("leafw");
		this.cube_r1 = this.leafw.getChild("cube_r1");
		this.leafe = this.root.getChild("leafe");
		this.cube_r2 = this.leafe.getChild("cube_r2");
		this.leafs = this.root.getChild("leafs");
		this.body = this.total.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.leaf = this.bone2.getChild("leaf");
		this.leafuw = this.leaf.getChild("leafuw");
		this.cube_r3 = this.leafuw.getChild("cube_r3");
		this.leafue = this.leaf.getChild("leafue");
		this.cube_r4 = this.leafue.getChild("cube_r4");
		this.leafu = this.leaf.getChild("leafu");
		this.head = this.body.getChild("head");
		this.up_mouse = this.head.getChild("up_mouse");
		this.down_mouse = this.head.getChild("down_mouse");
		this.saliva = this.down_mouse.getChild("saliva");
		this.saliva2 = this.saliva.getChild("saliva2");
		this.tongue = this.head.getChild("tongue");
		this.tongue2 = this.tongue.getChild("tongue2");
		this.tongue3 = this.tongue2.getChild("tongue3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition root = total.addOrReplaceChild("root",
			CubeListBuilder.create()
				.texOffs(80, 0).addBox(-3.5F, -5.0F, -3.5F, 7.0F, 5.0F, 7.0F)
				.texOffs(96, 112).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leafw = root.addOrReplaceChild("leafw",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = leafw.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-3.0F, -2.75F, 6.0F, 13.0F, 0.0F, 15.0F)
				.texOffs(39, 15).addBox(-3.0F, -3.0F, 6.0F, 13.0F, 0.0F, 15.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition leafe = root.addOrReplaceChild("leafe",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leafe.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(39, 45).addBox(-10.0F, -2.75F, 6.0F, 13.0F, 0.0F, 15.0F)
				.texOffs(26, 60).addBox(-10.0F, -3.0F, 6.0F, 13.0F, 0.0F, 15.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition leafs = root.addOrReplaceChild("leafs",
			CubeListBuilder.create()
				.texOffs(0, 55).addBox(-6.5F, -3.0F, 3.0F, 13.0F, 0.0F, 15.0F)
				.texOffs(39, 30).addBox(-6.5F, -2.75F, 3.0F, 13.0F, 0.0F, 15.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(81, 20).addBox(-3.0F, -12.0F, -2.0F, 6.0F, 12.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone = body.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(22, 90).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 10.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.6545F, 0.0F, 0.0F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 55).addBox(-1.5F, -9.0F, -1.5F, 3.0F, 10.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 1.3526F, 0.0F, 0.0F));
		PartDefinition leaf = bone2.addOrReplaceChild("leaf",
			CubeListBuilder.create()
				.texOffs(80, 37).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition leafuw = leaf.addOrReplaceChild("leafuw",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition cube_r3 = leafuw.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(80, 49).addBox(-5.0F, -4.0F, 2.75F, 11.0F, 13.0F, 0.0F)
				.texOffs(67, 84).addBox(-5.0F, -4.0F, 3.0F, 11.0F, 13.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, 6.0F, -1.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition leafue = leaf.addOrReplaceChild("leafue",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition cube_r4 = leafue.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(89, 84).addBox(-5.0F, 0.0F, 2.75F, 11.0F, 13.0F, 0.0F)
				.texOffs(0, 90).addBox(-5.0F, 0.0F, 3.0F, 11.0F, 13.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition leafu = leaf.addOrReplaceChild("leafu",
			CubeListBuilder.create()
				.texOffs(89, 97).addBox(-5.0F, 2.0F, 2.0F, 11.0F, 13.0F, 0.0F)
				.texOffs(67, 97).addBox(-5.0F, 2.0F, 1.75F, 11.0F, 13.0F, 0.0F),
			PartPose.offset(0.0F, -2.0F, 2.0F));
		PartDefinition head = body.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(96, 113).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 2.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -24.0F, -2.0F, 1.6144F, 0.0F, 0.0F));
		PartDefinition up_mouse = head.addOrReplaceChild("up_mouse",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-8.0F, -14.0F, -3.0F, 16.0F, 17.0F, 11.0F)
				.texOffs(38, 61).addBox(0.0F, -13.0F, 2.0F, 0.0F, 19.0F, 14.0F)
				.texOffs(67, 62).addBox(-8.5F, -15.0F, -0.25F, 17.0F, 19.0F, 3.0F, new CubeDeformation(-0.01F)),
			PartPose.offsetAndRotation(0.0F, -3.5F, 2.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition down_mouse = head.addOrReplaceChild("down_mouse",
			CubeListBuilder.create()
				.texOffs(0, 28).addBox(-8.0F, -14.5F, 0.0F, 16.0F, 16.0F, 11.0F, new CubeDeformation(0.05F))
				.texOffs(0, 70).addBox(-8.5F, -16.0F, 4.75F, 17.0F, 18.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.5F, -3.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition saliva = down_mouse.addOrReplaceChild("saliva",
			CubeListBuilder.create()
				.texOffs(-5, 105).addBox(-8.0F, 8.0F, -6.0F, 16.0F, 0.0F, 5.0F),
			PartPose.offset(0.0F, -24.0F, 8.0F));
		PartDefinition saliva2 = saliva.addOrReplaceChild("saliva2",
			CubeListBuilder.create()
				.texOffs(-5, 110).addBox(-8.0F, 8.0F, -6.0F, 16.0F, 0.0F, 5.0F),
			PartPose.offset(0.0F, 0.0F, -5.0F));
		PartDefinition tongue = head.addOrReplaceChild("tongue",
			CubeListBuilder.create()
				.texOffs(51, 95).addBox(-3.0F, -6.0F, 1.0F, 6.0F, 6.0F, -1.0F),
			PartPose.offset(0.0F, -4.0F, -1.0F));
		PartDefinition tongue2 = tongue.addOrReplaceChild("tongue2",
			CubeListBuilder.create()
				.texOffs(23, 94).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F),
			PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition tongue3 = tongue2.addOrReplaceChild("tongue3",
			CubeListBuilder.create()
				.texOffs(38, 94).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 9.0F, 0.0F),
			PartPose.offset(0.0F, -9.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(ChomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		final int T = ChomperEntity.ATTACK_ANIM_CD;

		if(tick > 0 && tick <= T / 2) {//1 - 10
			this.body.xRot = 0.05f * tick;//0.5
			this.head.xRot = 0.25f - 0.075f * tick;//0.25 - -0.5
			if(tick <= T / 3) {//1 - 6
				this.up_mouse.xRot = - 0.52f - 0.05f*tick;
				this.down_mouse.xRot = 0.52f + 0.05f*tick;
			}else {// 7 - 10 ( 1 - 4)
				float tmp = tick - T * 2f / 3;
				this.up_mouse.xRot = - 0.82f + 0.2f * tmp;
				this.down_mouse.xRot = 0.82f - 0.2f * tmp;
			}
		} else if(tick > T / 2) {// 11 - 20 (1 - 10)
			final int tmp = tick - T / 2;
			this.body.xRot = 0.3f - 0.02f * tmp; // 减小幅度
			this.head.xRot = -0.3f + 0.05f * tmp; // 减小幅度
			this.up_mouse.xRot = -0.03f * tmp; // 减小幅度
			this.down_mouse.xRot = 0.03f * tmp;
		} else {
			this.body.xRot = 0;
			if(entity.getRestTick() > 0) {
				this.tongue.xRot = 0;
				this.tongue2.xRot = 0;
				this.head.xRot = 1.04f;
				this.up_mouse.xRot = - 0.15f;
				this.down_mouse.xRot = 0.15f;
				this.leaf.zRot = 0;
			}else {
				this.tongue.xRot = 0;
				this.tongue2.xRot = 0;
				this.head.xRot = -0.25f;
				this.up_mouse.xRot = -0.52f;
				this.down_mouse.xRot = 0.52f;
				this.leaf.zRot = 0;
			}
		}
		this.head.xRot += 1.30899694f;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<ChomperEntity> getPlantModel() {
		return this;
	}
	
}