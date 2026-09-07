package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.ThreePeaterEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantShooterEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ThreePeaterModel extends PlantShooterModel<ThreePeaterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "three_peater"), "main");
	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart mid_up;
	private final ModelPart mid_body;
	private final ModelPart stick_r2_r1;
	private final ModelPart stick_r1_r1;
	private final ModelPart mid_head;
	private final ModelPart hair;
	private final ModelPart leafl_r1;
	private final ModelPart hair2;
	private final ModelPart leafl_r2;
	private final ModelPart left_up;
	private final ModelPart left_body;
	private final ModelPart stick_r3_r1;
	private final ModelPart stick_r2_r2;
	private final ModelPart left_head;
	private final ModelPart hair3;
	private final ModelPart leafl_r3;
	private final ModelPart hair4;
	private final ModelPart leafl_r4;
	private final ModelPart hair5;
	private final ModelPart leafl_r5;
	private final ModelPart right_up;
	private final ModelPart right_body;
	private final ModelPart stick_r4_r1;
	private final ModelPart stick_r3_r2;
	private final ModelPart right_head;
	private final ModelPart hair8;
	private final ModelPart leafl_r8;
	private final ModelPart leaves;
	private final ModelPart n_r1;
	private final ModelPart w_r1;
	private final ModelPart e_r1;
	private final ModelPart s_r1;


	public ThreePeaterModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.mid_up = this.body.getChild("mid_up");
		this.mid_body = this.mid_up.getChild("mid_body");
		this.stick_r2_r1 = this.mid_body.getChild("stick_r2_r1");
		this.stick_r1_r1 = this.mid_body.getChild("stick_r1_r1");
		this.mid_head = this.mid_up.getChild("mid_head");
		this.hair = this.mid_head.getChild("hair");
		this.leafl_r1 = this.hair.getChild("leafl_r1");
		this.hair2 = this.mid_head.getChild("hair2");
		this.leafl_r2 = this.hair2.getChild("leafl_r2");
		this.left_up = this.body.getChild("left_up");
		this.left_body = this.left_up.getChild("left_body");
		this.stick_r3_r1 = this.left_body.getChild("stick_r3_r1");
		this.stick_r2_r2 = this.left_body.getChild("stick_r2_r2");
		this.left_head = this.left_up.getChild("left_head");
		this.hair3 = this.left_head.getChild("hair3");
		this.leafl_r3 = this.hair3.getChild("leafl_r3");
		this.hair4 = this.left_head.getChild("hair4");
		this.leafl_r4 = this.hair4.getChild("leafl_r4");
		this.hair5 = this.left_head.getChild("hair5");
		this.leafl_r5 = this.hair5.getChild("leafl_r5");
		this.right_up = this.body.getChild("right_up");
		this.right_body = this.right_up.getChild("right_body");
		this.stick_r4_r1 = this.right_body.getChild("stick_r4_r1");
		this.stick_r3_r2 = this.right_body.getChild("stick_r3_r2");
		this.right_head = this.right_up.getChild("right_head");
		this.hair8 = this.right_head.getChild("hair8");
		this.leafl_r8 = this.hair8.getChild("leafl_r8");
		this.leaves = this.total.getChild("leaves");
		this.n_r1 = this.leaves.getChild("n_r1");
		this.w_r1 = this.leaves.getChild("w_r1");
		this.e_r1 = this.leaves.getChild("e_r1");
		this.s_r1 = this.leaves.getChild("s_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mid_up = body.addOrReplaceChild("mid_up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mid_body = mid_up.addOrReplaceChild("mid_body",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition stick_r2_r1 = mid_body.addOrReplaceChild("stick_r2_r1",
			CubeListBuilder.create()
				.texOffs(14, 27).addBox(-1.0F, -9.1008F, -0.5716F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(0.0F, -9.3168F, 2.0468F, 0.3491F, 0.0F, 0.0F));
		PartDefinition stick_r1_r1 = mid_body.addOrReplaceChild("stick_r1_r1",
			CubeListBuilder.create()
				.texOffs(14, 27).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition mid_head = mid_up.addOrReplaceChild("mid_head",
			CubeListBuilder.create()
				.texOffs(0, 27).addBox(-1.0F, -15.75F, -4.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 5).addBox(-1.0F, -15.825F, -5.75F, 4.0F, 4.0F, 2.0F)
				.texOffs(0, 0).addBox(-2.5F, -18.0F, -2.5F, 7.0F, 7.0F, 7.0F)
				.texOffs(20, 22).addBox(-1.0F, -11.0F, -1.0F, 4.0F, 3.0F, 4.0F),
			PartPose.offset(-1.0F, -5.0F, 0.0F));
		PartDefinition hair = mid_head.addOrReplaceChild("hair",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-0.75F, -15.5F, 5.0F, 0.0436F, -0.48F, 0.0F));
		PartDefinition leafl_r1 = hair.addOrReplaceChild("leafl_r1",
			CubeListBuilder.create()
				.texOffs(28, 11).addBox(-1.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).addBox(0.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition hair2 = mid_head.addOrReplaceChild("hair2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(2.75F, -15.5F, 5.0F, 0.0436F, 0.48F, 0.0F));
		PartDefinition leafl_r2 = hair2.addOrReplaceChild("leafl_r2",
			CubeListBuilder.create()
				.texOffs(28, 11).mirror().addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).mirror().addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition left_up = body.addOrReplaceChild("left_up",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.7418F));
		PartDefinition left_body = left_up.addOrReplaceChild("left_body",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.087F, 0.0076F, 0.0869F));
		PartDefinition stick_r3_r1 = left_body.addOrReplaceChild("stick_r3_r1",
			CubeListBuilder.create()
				.texOffs(14, 27).addBox(-1.0F, -9.1008F, -0.5716F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(0.0F, -9.3168F, 2.0468F, 0.7171F, 0.1313F, -0.3712F));
		PartDefinition stick_r2_r2 = left_body.addOrReplaceChild("stick_r2_r2",
			CubeListBuilder.create()
				.texOffs(14, 27).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition left_head = left_up.addOrReplaceChild("left_head",
			CubeListBuilder.create()
				.texOffs(0, 27).addBox(-2.0F, -2.8562F, -3.0625F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 5).addBox(-2.0F, -2.9312F, -4.3125F, 4.0F, 4.0F, 2.0F)
				.texOffs(0, 0).addBox(-3.5F, -5.1062F, -1.0625F, 7.0F, 7.0F, 7.0F)
				.texOffs(20, 22).addBox(-2.0F, 1.8938F, 0.4375F, 4.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(-3.0F, -16.8938F, -4.4375F, 0.1745F, 0.0F, -0.7418F));
		PartDefinition hair3 = left_head.addOrReplaceChild("hair3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.75F, -2.6062F, 6.4375F, 0.0436F, -0.48F, 0.0F));
		PartDefinition leafl_r3 = hair3.addOrReplaceChild("leafl_r3",
			CubeListBuilder.create()
				.texOffs(28, 11).addBox(-1.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).addBox(0.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition hair4 = left_head.addOrReplaceChild("hair4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(1.75F, -2.6062F, 6.4375F, 0.0436F, 0.48F, 0.0F));
		PartDefinition leafl_r4 = hair4.addOrReplaceChild("leafl_r4",
			CubeListBuilder.create()
				.texOffs(28, 11).mirror().addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).mirror().addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition hair5 = left_head.addOrReplaceChild("hair5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(1.0F, -1.8562F, 6.4375F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leafl_r5 = hair5.addOrReplaceChild("leafl_r5",
			CubeListBuilder.create()
				.texOffs(28, 11).mirror().addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).mirror().addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition right_up = body.addOrReplaceChild("right_up",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, -0.7418F));
		PartDefinition right_body = right_up.addOrReplaceChild("right_body",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0866F, -0.0114F, -0.1304F));
		PartDefinition stick_r4_r1 = right_body.addOrReplaceChild("stick_r4_r1",
			CubeListBuilder.create()
				.texOffs(14, 27).mirror().addBox(0.0F, -7.1008F, -1.8216F, 2.0F, 10.0F, 2.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(0.0F, -9.3168F, 2.0468F, 0.4553F, -0.1313F, 0.3712F));
		PartDefinition stick_r3_r2 = right_body.addOrReplaceChild("stick_r3_r2",
			CubeListBuilder.create()
				.texOffs(14, 27).mirror().addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition right_head = right_up.addOrReplaceChild("right_head",
			CubeListBuilder.create()
				.texOffs(0, 27).mirror().addBox(-2.0F, -2.8562F, -3.0625F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 5).mirror().addBox(-2.0F, -2.9312F, -4.3125F, 4.0F, 4.0F, 2.0F)
				.texOffs(0, 0).mirror().addBox(-3.5F, -5.1062F, -1.0625F, 7.0F, 7.0F, 7.0F)
				.texOffs(20, 22).mirror().addBox(-2.0F, 1.8938F, 0.4375F, 4.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(2.0F, -14.8938F, -1.4375F, -0.1329F, 0.173F, 0.7188F));
		PartDefinition hair8 = right_head.addOrReplaceChild("hair8",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.0F, -1.8562F, 6.4375F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leafl_r8 = hair8.addOrReplaceChild("leafl_r8",
			CubeListBuilder.create()
				.texOffs(28, 11).addBox(-2.0F, -1.55F, 0.0F, 4.0F, 6.0F, 1.0F)
				.texOffs(22, 29).addBox(-1.0F, -1.95F, -2.0F, 2.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(1.0F, 2.1224F, 1.3125F, 0.3927F, 0.0F, 0.0F));
		PartDefinition leaves = total.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r1 = leaves.addOrReplaceChild("n_r1",
			CubeListBuilder.create()
				.texOffs(14, 15).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition w_r1 = leaves.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(0, 22).addBox(1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, -0.1745F));
		PartDefinition e_r1 = leaves.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(21, 0).addBox(-7.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.1745F));
		PartDefinition s_r1 = leaves.addOrReplaceChild("s_r1",
			CubeListBuilder.create()
				.texOffs(0, 14).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(ThreePeaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		final float OFFSET = 0.78F;
		this.left_head.xRot = 0;
		this.mid_head.xRot = 0;
		this.right_head.xRot = 0;
		this.body.xRot = 0;
		this.right_up.zRot = - OFFSET;
		this.right_head.zRot = OFFSET;
		this.left_up.zRot = OFFSET;
		this.left_head.zRot = - OFFSET;
		if(entity.isPlantInSuperMode()) {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getSuperTime() % T;
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle() / 5);
			} 
		} else {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getShootTick() + T - entity.getShootCD();
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle());
			} else {//idle
				final int TT = 40;
				final int tt = entity.getExistTick() % TT;
				final float CHANGE = 3;
				this.mid_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE / 4);
				this.left_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
				this.left_head.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_up.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_head.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
			}
		}
	}
	
	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

}