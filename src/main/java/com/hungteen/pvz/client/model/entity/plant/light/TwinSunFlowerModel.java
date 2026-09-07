package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.TwinSunFlowerEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class TwinSunFlowerModel extends PVZPlantModel<TwinSunFlowerEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "twin_sunflower"), "main");
	private final ModelPart total;
	private final ModelPart leaves;
	private final ModelPart w_r1;
	private final ModelPart w_r2;
	private final ModelPart e_r1;
	private final ModelPart e_r2;
	private final ModelPart left_flower;
	private final ModelPart body_r1;
	private final ModelPart stickd_r1;
	private final ModelPart stickd_r2;
	private final ModelPart stickd_r2_r1;
	private final ModelPart head;
	private final ModelPart right_hand;
	private final ModelPart leafw_r1;
	private final ModelPart left_hand;
	private final ModelPart leafe_r1;
	private final ModelPart right_flower;
	private final ModelPart body_r2;
	private final ModelPart stickd_r3;
	private final ModelPart stickd_r4;
	private final ModelPart head2;
	private final ModelPart right_hand2;
	private final ModelPart leafw_r2;
	private final ModelPart left_hand2;
	private final ModelPart leafe_r2;


	public TwinSunFlowerModel(ModelPart root) {
		this.total = root.getChild("total");
		this.leaves = this.total.getChild("leaves");
		this.w_r1 = this.leaves.getChild("w_r1");
		this.w_r2 = this.leaves.getChild("w_r2");
		this.e_r1 = this.leaves.getChild("e_r1");
		this.e_r2 = this.leaves.getChild("e_r2");
		this.left_flower = this.total.getChild("left_flower");
		this.body_r1 = this.left_flower.getChild("body_r1");
		this.stickd_r1 = this.left_flower.getChild("stickd_r1");
		this.stickd_r2 = this.stickd_r1.getChild("stickd_r2");
		this.stickd_r2_r1 = this.stickd_r2.getChild("stickd_r2_r1");
		this.head = this.left_flower.getChild("head");
		this.right_hand = this.left_flower.getChild("right_hand");
		this.leafw_r1 = this.right_hand.getChild("leafw_r1");
		this.left_hand = this.left_flower.getChild("left_hand");
		this.leafe_r1 = this.left_hand.getChild("leafe_r1");
		this.right_flower = this.total.getChild("right_flower");
		this.body_r2 = this.right_flower.getChild("body_r2");
		this.stickd_r3 = this.right_flower.getChild("stickd_r3");
		this.stickd_r4 = this.stickd_r3.getChild("stickd_r4");
		this.head2 = this.right_flower.getChild("head2");
		this.right_hand2 = this.right_flower.getChild("right_hand2");
		this.leafw_r2 = this.right_hand2.getChild("leafw_r2");
		this.left_hand2 = this.right_flower.getChild("left_hand2");
		this.leafe_r2 = this.left_hand2.getChild("leafe_r2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition leaves = total.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(-8.0F, 1.0F, 8.0F));
		PartDefinition w_r1 = leaves.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(24, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition w_r2 = leaves.addOrReplaceChild("w_r2",
			CubeListBuilder.create()
				.texOffs(0, 24).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition e_r1 = leaves.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(1.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition e_r2 = leaves.addOrReplaceChild("e_r2",
			CubeListBuilder.create()
				.texOffs(26, 14).addBox(-7.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_flower = total.addOrReplaceChild("left_flower",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition body_r1 = left_flower.addOrReplaceChild("body_r1",
			CubeListBuilder.create()
				.texOffs(0, 31).addBox(4.25F, -19.5F, 0.75F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.7359F, 0.5894F, 0.0F, 0.0F, -0.3054F));
		PartDefinition stickd_r1 = left_flower.addOrReplaceChild("stickd_r1",
			CubeListBuilder.create()
				.texOffs(18, 30).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.258F, 0.045F, 0.1687F));
		PartDefinition stickd_r2 = stickd_r1.addOrReplaceChild("stickd_r2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(1.0F, -8.0F, 1.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition stickd_r2_r1 = stickd_r2.addOrReplaceChild("stickd_r2_r1",
			CubeListBuilder.create()
				.texOffs(8, 31).addBox(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition head = left_flower.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(22, 20).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F)
				.texOffs(0, 13).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 8.0F, 3.0F)
				.texOffs(0, 0).addBox(-7.0F, -7.0F, -2.0F, 14.0F, 12.0F, 1.0F),
			PartPose.offsetAndRotation(-1.0F, -20.0F, 1.75F, 0.0F, 0.0F, -0.3491F));
		PartDefinition right_hand = left_flower.addOrReplaceChild("right_hand",
			CubeListBuilder.create(),
			PartPose.offset(0.75F, -11.75F, 2.25F));
		PartDefinition leafw_r1 = right_hand.addOrReplaceChild("leafw_r1",
			CubeListBuilder.create()
				.texOffs(34, 33).addBox(-3.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition left_hand = left_flower.addOrReplaceChild("left_hand",
			CubeListBuilder.create(),
			PartPose.offset(1.5F, -11.5F, 2.5F));
		PartDefinition leafe_r1 = left_hand.addOrReplaceChild("leafe_r1",
			CubeListBuilder.create()
				.texOffs(34, 30).addBox(0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition right_flower = total.addOrReplaceChild("right_flower",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 7.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition body_r2 = right_flower.addOrReplaceChild("body_r2",
			CubeListBuilder.create()
				.texOffs(14, 24).addBox(-0.75F, -6.5F, -1.75F, 2.0F, 3.0F, 2.0F)
				.texOffs(0, 31).mirror().addBox(-0.75F, -3.5F, -1.75F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(-0.2429F, -9.3017F, 2.3394F, 0.0F, 0.0F, 0.3054F));
		PartDefinition stickd_r3 = right_flower.addOrReplaceChild("stickd_r3",
			CubeListBuilder.create()
				.texOffs(26, 30).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.258F, -0.045F, -0.1687F));
		PartDefinition stickd_r4 = stickd_r3.addOrReplaceChild("stickd_r4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-0.525F, -8.0F, 0.75F, 0.0F, 0.0F, 0.5672F));
		PartDefinition head2 = right_flower.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(22, 20).mirror().addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F)
				.texOffs(0, 13).mirror().addBox(-5.0F, -5.0F, -3.0F, 10.0F, 8.0F, 3.0F)
				.texOffs(0, 0).mirror().addBox(-7.0F, -7.0F, -2.0F, 14.0F, 12.0F, 1.0F),
			PartPose.offsetAndRotation(2.0F, -15.0F, 1.75F, 0.0F, 0.0F, 0.5672F));
		PartDefinition right_hand2 = right_flower.addOrReplaceChild("right_hand2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-0.75F, -5.75F, 1.25F, 0.0F, 0.0F, 0.1745F));
		PartDefinition leafw_r2 = right_hand2.addOrReplaceChild("leafw_r2",
			CubeListBuilder.create()
				.texOffs(34, 33).mirror().addBox(0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition left_hand2 = right_flower.addOrReplaceChild("left_hand2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-1.5F, -5.5F, 1.5F, 0.0F, 0.0F, 0.5672F));
		PartDefinition leafe_r2 = left_hand2.addOrReplaceChild("leafe_r2",
			CubeListBuilder.create()
				.texOffs(34, 30).mirror().addBox(-3.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(TwinSunFlowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		if(tick > 0 && tick < entity.getAnimGenCD() || entity.isPlantInSuperMode()) {
			final int T = 10;
			this.left_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.left_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
		} else {
			this.left_hand.zRot = 0;
			this.right_hand.zRot = 0;
			this.left_hand2.zRot = 0;
			this.right_hand2.zRot = 0;
		}
		final int T = 60;
		final int time = entity.getExistTick() % 60;
		final float degree = 5F;
		//this.left_flower.zRot = AnimationUtil.getUpDown(time, T, degree);
		//this.right_flower.zRot = AnimationUtil.getUpDown(time, T, - degree);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<TwinSunFlowerEntity> getPlantModel() {
		return this;
	}
}