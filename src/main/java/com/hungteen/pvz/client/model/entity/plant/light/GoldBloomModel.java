package com.hungteen.pvz.client.model.entity.plant.light;
// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.GoldBloomEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class GoldBloomModel extends PVZPlantModel<GoldBloomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "gold_bloom"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart eyesOpen;
	private final ModelPart eyesClosed;
	private final ModelPart close1;
	private final ModelPart open1;
	private final ModelPart close2;
	private final ModelPart open2;
	private final ModelPart close3;
	private final ModelPart open3;
	private final ModelPart ne;
	private final ModelPart se;
	private final ModelPart sw;
	private final ModelPart nw;

	public GoldBloomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		final ModelPart eyes = this.head.getChild("eyes");
		this.eyesOpen = eyes.getChild("eyes_open");
		this.eyesClosed = eyes.getChild("eyes_closed");
		this.ne = this.head.getChild("ne");
		this.se = this.head.getChild("se");
		this.sw = this.head.getChild("sw");
		this.nw = this.head.getChild("nw");
		final ModelPart flowers = this.head.getChild("flowers");
		final ModelPart flower1 = flowers.getChild("flower1");
		this.close1 = flower1.getChild("close1");
		this.open1 = flower1.getChild("open1");
		final ModelPart flower2 = flowers.getChild("flower2");
		this.close2 = flower2.getChild("close2");
		this.open2 = flower2.getChild("open2");
		final ModelPart flower3 = flowers.getChild("flower3");
		this.close3 = flower3.getChild("close3");
		this.open3 = flower3.getChild("open3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition total = partdefinition.addOrReplaceChild("total", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = total.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 14).addBox(-3.5F, -8.0F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes_open = eyes.addOrReplaceChild("eyes_open", CubeListBuilder.create().texOffs(29, 36).addBox(-3.0F, -6.0F, -3.505F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyes_closed = eyes.addOrReplaceChild("eyes_closed", CubeListBuilder.create().texOffs(28, 5).addBox(-3.0F, -6.0F, -3.505F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ne = head.addOrReplaceChild("ne", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = ne.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-6.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));

		PartDefinition se = head.addOrReplaceChild("se", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r2 = se.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 27).addBox(-6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition sw = head.addOrReplaceChild("sw", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r3 = sw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 0).addBox(0.0F, 0.0F, 0.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0873F));

		PartDefinition nw = head.addOrReplaceChild("nw", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r4 = nw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));

		PartDefinition flowers = head.addOrReplaceChild("flowers", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition flower1 = flowers.addOrReplaceChild("flower1", CubeListBuilder.create().texOffs(46, -5).addBox(0.0F, -4.0F, 0.0F, 0.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition close1 = flower1.addOrReplaceChild("close1", CubeListBuilder.create(), PartPose.offset(-0.5F, -3.5F, 3.5F));

		PartDefinition cube_r5 = close1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -4.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -1.1999F, -0.4014F, 0.7069F));

		PartDefinition open1 = flower1.addOrReplaceChild("open1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = open1.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-10, 53).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 4.0F, -0.829F, -0.5672F, 0.5672F));

		PartDefinition cube_r7 = open1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 41).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.0F, 4.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition flower2 = flowers.addOrReplaceChild("flower2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = flower2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 30).addBox(0.0F, -3.0F, -6.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition close2 = flower2.addOrReplaceChild("close2", CubeListBuilder.create(), PartPose.offset(-3.5F, -2.0F, -3.5F));

		PartDefinition cube_r9 = close2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(23, 22).addBox(-3.5F, -2.0F, -3.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, -0.6109F, -0.1745F, 0.2618F));

		PartDefinition open2 = flower2.addOrReplaceChild("open2", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.0F, -4.0F));

		PartDefinition open2_r1 = open2.addOrReplaceChild("open2_r1", CubeListBuilder.create().texOffs(31, 57).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.6981F, -0.1309F, -0.4363F));

		PartDefinition open2_r2 = open2.addOrReplaceChild("open2_r2", CubeListBuilder.create().texOffs(-10, 53).addBox(-5.0F, 1.0F, -5.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.6981F, -0.1309F, -0.4363F));

		PartDefinition flower3 = flowers.addOrReplaceChild("flower3", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, -5.0F));

		PartDefinition cube_r10 = flower3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(29, 26).addBox(0.0F, -3.0F, -6.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 5.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition close3 = flower3.addOrReplaceChild("close3", CubeListBuilder.create(), PartPose.offset(0.0F, -2.5F, 2.0F));

		PartDefinition cube_r11 = close3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 8).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, -1.0F, -0.9599F, -0.6109F, 0.8727F));

		PartDefinition open3 = flower3.addOrReplaceChild("open3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = open3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(13, 55).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-12, 41).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.2618F, -0.6981F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(GoldBloomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		//reset pose every frame.
		this.head.xRot = 0.0F;
		this.head.yRot = 0.0F;
		this.head.zRot = 0.0F;
		this.head.x = 0.0F;
		this.head.y = 0.0F;
		this.head.z = 0.0F;
		this.ne.xRot = 0.0F;
		this.ne.zRot = 0.0F;
		this.se.xRot = 0.0F;
		this.se.zRot = 0.0F;
		this.sw.xRot = 0.0F;
		this.sw.zRot = 0.0F;
		this.nw.xRot = 0.0F;
		this.nw.zRot = 0.0F;
		this.close1.xScale = this.close1.yScale = this.close1.zScale = 1.0F;
		this.open1.xScale = this.open1.yScale = this.open1.zScale = 1.0F;
		this.close2.xScale = this.close2.yScale = this.close2.zScale = 1.0F;
		this.open2.xScale = this.open2.yScale = this.open2.zScale = 1.0F;
		this.close3.xScale = this.close3.yScale = this.close3.zScale = 1.0F;
		this.open3.xScale = this.open3.yScale = this.open3.zScale = 1.0F;
		this.eyesOpen.visible = true;
		this.eyesClosed.visible = false;
		this.close1.visible = true;
		this.open1.visible = false;
		this.close2.visible = true;
		this.open2.visible = false;
		this.close3.visible = true;
		this.open3.visible = false;
		//bomber-style charging: body inflates stepwise, each step ends with a bud popping open.
		float bodyScale;
		if(tick >= 69) {
			bodyScale = tick > 80 ? 0.0F : AnimationUtil.down(tick - 69, 11, 1.12F);
		} else if(tick >= 41) {
			bodyScale = 1.12F;
		} else if(tick >= 38) {
			bodyScale = 1.09F + AnimationUtil.up(tick - 38, 3, 0.03F);
		} else if(tick >= 30) {
			bodyScale = 1.09F;
		} else if(tick >= 27) {
			bodyScale = 1.05F + AnimationUtil.up(tick - 27, 3, 0.04F);
		} else if(tick >= 17) {
			bodyScale = 1.05F;
		} else if(tick >= 14) {
			bodyScale = 1.0F + AnimationUtil.up(tick - 14, 3, 0.05F);
		} else {
			bodyScale = 1.0F;
		}
		//three buds pop open with the three sun waves.
		if(tick >= 17) {
			this.close3.visible = false;
			this.open3.visible = true;
			if(tick < 21) {
				final float s = 1.0F + AnimationUtil.down(tick - 17, 4, 0.3F);
				this.open3.xScale = this.open3.yScale = this.open3.zScale = s;
			}
		}
		if(tick >= 30) {
			this.close2.visible = false;
			this.open2.visible = true;
			if(tick < 34) {
				final float s = 1.0F + AnimationUtil.down(tick - 30, 4, 0.3F);
				this.open2.xScale = this.open2.yScale = this.open2.zScale = s;
			}
		}
		if(tick >= 41) {
			this.close1.visible = false;
			this.open1.visible = true;
			if(tick < 45) {
				final float s = 1.0F + AnimationUtil.down(tick - 41, 4, 0.3F);
				this.open1.xScale = this.open1.yScale = this.open1.zScale = s;
			}
		}
		//eyes shut while producing.
		if((tick >= 9 && tick <= 55) || (tick >= 64 && tick <= 78)) {
			this.eyesOpen.visible = false;
			this.eyesClosed.visible = true;
		}
		//head leans and hops at each wave.
		if(tick >= 17 && tick < 27) {
			this.head.zRot = - AnimationUtil.getUpDown(tick - 17, 10, 20.0F);
			this.head.y = AnimationUtil.upDown(tick - 17, 10, 0.3125F);
		} else if(tick >= 29 && tick < 39) {
			this.head.zRot = AnimationUtil.getUpDown(tick - 29, 10, 20.0F);
			this.head.y = AnimationUtil.upDown(tick - 29, 10, 0.3125F);
		} else if(tick >= 41 && tick < 51) {
			this.head.xRot = AnimationUtil.getUpDown(tick - 41, 10, 15.0F);
			this.head.y = AnimationUtil.upDown(tick - 41, 10, 0.3125F);
			this.head.z = - AnimationUtil.upDown(tick - 41, 10, 0.0625F);
		}
		//four petals flap together with each wave.
		float flap = 0.0F;
		if(tick >= 17 && tick < 23) {
			flap = AnimationUtil.getUpDown(tick - 17, 6, 15.0F);
		} else if(tick >= 29 && tick < 35) {
			flap = AnimationUtil.getUpDown(tick - 29, 6, 15.0F);
		} else if(tick >= 41 && tick < 47) {
			flap = AnimationUtil.getUpDown(tick - 41, 6, 15.0F);
		}
		final float tilt = flap * 0.5F;
		this.ne.xRot = tilt;
		this.ne.zRot = - flap;
		this.se.xRot = - tilt;
		this.se.zRot = - flap;
		this.sw.xRot = - tilt;
		this.sw.zRot = flap;
		this.nw.xRot = tilt;
		this.nw.zRot = flap;
		this.head.xScale = this.head.yScale = this.head.zScale = bodyScale;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}
}