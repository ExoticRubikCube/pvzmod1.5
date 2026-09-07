package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.StrangeCatEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class StrangeCatModel extends PVZPlantModel<StrangeCatEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "strange_cat"), "main");
	private final ModelPart bone;
	private final ModelPart buttom;
	private final ModelPart head;
	private final ModelPart hat_r1;
	private final ModelPart left_ear;
	private final ModelPart in_r1;
	private final ModelPart lear_r1;
	private final ModelPart right_ear;
	private final ModelPart in_r2;
	private final ModelPart rear_r1;
	private final ModelPart tail;
	private final ModelPart spike_r1;
	private final ModelPart sec_r1;
	private final ModelPart fir_r1;


	public StrangeCatModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.buttom = this.bone.getChild("buttom");
		this.head = this.bone.getChild("head");
		this.hat_r1 = this.head.getChild("hat_r1");
		this.left_ear = this.head.getChild("left_ear");
		this.in_r1 = this.left_ear.getChild("in_r1");
		this.lear_r1 = this.left_ear.getChild("lear_r1");
		this.right_ear = this.head.getChild("right_ear");
		this.in_r2 = this.right_ear.getChild("in_r2");
		this.rear_r1 = this.right_ear.getChild("rear_r1");
		this.tail = this.bone.getChild("tail");
		this.spike_r1 = this.tail.getChild("spike_r1");
		this.sec_r1 = this.tail.getChild("sec_r1");
		this.fir_r1 = this.tail.getChild("fir_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition buttom = bone.addOrReplaceChild("buttom",
			CubeListBuilder.create()
				.texOffs(24, 12).addBox(-6.0F, -2.0F, -8.0F, 6.0F, 2.0F, 6.0F)
				.texOffs(26, 29).addBox(0.0F, -2.0F, 1.0F, 5.0F, 2.0F, 5.0F)
				.texOffs(0, 28).addBox(1.0F, -1.0F, -7.0F, 6.0F, 1.0F, 6.0F)
				.texOffs(26, 22).addBox(-7.0F, -1.0F, 0.0F, 6.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 8.0F)
				.texOffs(0, 7).addBox(-2.0F, -3.0F, -5.5F, 4.0F, 2.0F, 1.0F)
				.texOffs(0, 12).addBox(-1.0F, -3.05F, -5.7F, 2.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hat_r1 = head.addOrReplaceChild("hat_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F),
			PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition left_ear = head.addOrReplaceChild("left_ear",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -6.0F, -1.0F));
		PartDefinition in_r1 = left_ear.addOrReplaceChild("in_r1",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-1.4F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F)
				.texOffs(21, 39).addBox(-1.3F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(2.5F, -4.5F, 2.5F, 0.1745F, 0.0F, 0.1745F));
		PartDefinition lear_r1 = left_ear.addOrReplaceChild("lear_r1",
			CubeListBuilder.create()
				.texOffs(41, 4).addBox(3.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.5236F, 0.0F));
		PartDefinition right_ear = head.addOrReplaceChild("right_ear",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -6.0F, -1.0F));
		PartDefinition in_r2 = right_ear.addOrReplaceChild("in_r2",
			CubeListBuilder.create()
				.texOffs(9, 38).addBox(-1.6F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F)
				.texOffs(32, 36).addBox(-1.7F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F),
			PartPose.offsetAndRotation(-2.5F, -4.5F, 2.5F, 0.1745F, 0.0F, -0.1745F));
		PartDefinition rear_r1 = right_ear.addOrReplaceChild("rear_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.5236F, 0.0F));
		PartDefinition tail = bone.addOrReplaceChild("tail",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -1.5F, 3.0F));
		PartDefinition spike_r1 = tail.addOrReplaceChild("spike_r1",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(-1.0F, 1.18F, 6.05F, 2.0F, 2.0F, 5.0F)
				.texOffs(15, 28).addBox(-0.5F, 1.68F, 3.05F, 1.0F, 1.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, -2.18F, 3.95F, 2.2253F, 0.0F, 0.0F));
		PartDefinition sec_r1 = tail.addOrReplaceChild("sec_r1",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-0.5F, 0.39F, 0.95F, 1.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.59F, 2.05F, 1.4399F, 0.0F, 0.0F));
		PartDefinition fir_r1 = tail.addOrReplaceChild("fir_r1",
			CubeListBuilder.create()
				.texOffs(40, 38).addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 1.5F, -3.0F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(StrangeCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int time = entity.getAttackTime();
		if(entity.isResting()) {
			this.tail.xRot = 0;
		} else if(time == 0) {
			final int T = 20;
			final int now = entity.getExistTick() % T;
			this.tail.xRot = AnimationUtil.getUpDownUpDown(now, T, 30);
		} else {
			final int tick = StrangeCatEntity.ANIM_CD - time;
		    final float v = 3.14159F / StrangeCatEntity.ANIM_CD / 2;
		    this.tail.xRot = 0.8F - 0.8F * Math.abs(Mth.cos(v * tick));
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.bone;
	}

	@Override
	public EntityModel<StrangeCatEntity> getPlantModel() {
		return this;
	}
}