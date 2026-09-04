package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.StrangeCatEntity;
import com.hungteen.pvz.utils.AnimationUtil;
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
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class StrangeCatModel extends PVZPlantModel<StrangeCatEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "strange_cat"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart legs;
	private final ModelPart left_ear;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart right_ear;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart tail;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart tail6;




public StrangeCatModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = root.getChild("body");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.legs = root.getChild("legs");
		this.left_ear = root.getChild("left_ear");
		this.bone3 = root.getChild("bone3");
		this.bone2 = root.getChild("bone2");
		this.right_ear = root.getChild("right_ear");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.tail = root.getChild("tail");
		this.tail1 = root.getChild("tail1");
		this.tail2 = root.getChild("tail2");
		this.tail3 = root.getChild("tail3");
		this.tail4 = root.getChild("tail4");
		this.tail5 = root.getChild("tail5");
		this.bone10 = root.getChild("bone10");
		this.bone11 = root.getChild("bone11");
		this.tail6 = root.getChild("tail6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(256, 384).addBox(-33.330101F, -68.0F, -32.0F, 64.0F, 64.0F, 64.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4_pd = body_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition bone5_pd = bone4_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(367, 0).addBox(-71.330101F, 0.0F, 0.0F, 3.0F, 10.0F, 70.0F)
				.texOffs(214, 0).addBox(-4.3301F, 0.0F, 0.0F, 3.0F, 10.0F, 70.0F),
			PartPose.offsetAndRotation(35.0F, -68.0F, -32.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone6_pd = bone4_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(288, 11).addBox(-36.330101F, -49.882702F, 31.614799F, 70.0F, 10.0F, 4.0F)
				.texOffs(294, 40).addBox(-36.330101F, -68.0F, -35.0F, 70.0F, 10.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition legs_pd = total_pd.addOrReplaceChild("legs",
			CubeListBuilder.create()
				.texOffs(368, 338).addBox(-43.330101F, -4.0F, 6.0F, 36.0F, 4.0F, 36.0F)
				.texOffs(368, 298).addBox(4.6699F, -4.0F, 6.0F, 36.0F, 4.0F, 36.0F)
				.texOffs(368, 258).addBox(-43.330101F, -4.0F, -42.0F, 36.0F, 4.0F, 36.0F)
				.texOffs(367, 217).addBox(4.6699F, -4.0F, -42.0F, 36.0F, 4.0F, 36.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_ear_pd = total_pd.addOrReplaceChild("left_ear",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(32.0F, -66.0F, -6.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bone3_pd = left_ear_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(479, 302).addBox(-15.0486F, -5.4591F, -3.999F, 9.0F, 20.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone2_pd = left_ear_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(459, 0).addBox(-13.855F, 1.0189F, -4.0F, 19.0F, 7.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition right_ear_pd = total_pd.addOrReplaceChild("right_ear",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-35.0F, -66.0F, -6.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition bone7_pd = right_ear_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(479, 262).mirror().addBox(6.0486F, -5.4591F, -3.99F, 9.0F, 20.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone8_pd = right_ear_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(459, 32).mirror().addBox(-5.145F, 1.0189F, -4.0F, 19.0F, 7.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition tail_pd = total_pd.addOrReplaceChild("tail",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.8669F, 35.9447F));
		PartDefinition tail1_pd = tail_pd.addOrReplaceChild("tail1",
			CubeListBuilder.create()
				.texOffs(6, 448).addBox(-5.3301F, -5.0F, -5.0F, 8.0F, 8.0F, 37.0F),
			PartPose.offset(0.0F, 9.8669F, -7.9447F));
		PartDefinition tail2_pd = tail_pd.addOrReplaceChild("tail2",
			CubeListBuilder.create()
				.texOffs(304, 323).addBox(-5.32F, -29.243799F, -2.3326F, 8.0F, 32.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 6.7538F, 22.5237F, -0.8727F, 0.0F, 0.0F));
		PartDefinition tail3_pd = tail_pd.addOrReplaceChild("tail3",
			CubeListBuilder.create()
				.texOffs(222, 331).addBox(-5.3301F, -28.5396F, -11.7591F, 8.0F, 8.0F, 25.0F),
			PartPose.offsetAndRotation(0.0F, -23.3801F, 21.2917F, -1.6581F, 0.0F, 0.0F));
		PartDefinition tail4_pd = tail_pd.addOrReplaceChild("tail4",
			CubeListBuilder.create()
				.texOffs(168, 372).addBox(-5.3301F, -2.336F, 43.056599F, 8.0F, 4.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -21.0F, 1.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition tail5_pd = tail_pd.addOrReplaceChild("tail5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(2.6699F, -19.5361F, -3.1281F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone10_pd = tail5_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.2426F, -28.974501F, 43.955502F, 6.0F, 27.0F, 7.0F)
				.texOffs(0, 0).addBox(-7.2426F, -28.974501F, 51.4408F, 6.0F, 27.0F, 7.0F)
				.texOffs(0, 0).addBox(-11.4853F, -28.974501F, 48.1982F, 7.0F, 27.0F, 6.0F)
				.texOffs(0, 0).addBox(-4.0F, -28.974501F, 48.1982F, 7.0F, 27.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11_pd = tail5_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-42.202599F, -28.974501F, 25.9599F, 6.0F, 27.0F, 7.0F)
				.texOffs(0, 0).addBox(-42.202599F, -28.974501F, 33.445202F, 6.0F, 27.0F, 7.0F)
				.texOffs(0, 0).addBox(-46.445202F, -28.974501F, 30.2026F, 7.0F, 27.0F, 6.0F)
				.texOffs(0, 0).addBox(-38.9599F, -28.974501F, 30.2026F, 7.0F, 27.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition tail6_pd = tail_pd.addOrReplaceChild("tail6",
			CubeListBuilder.create()
				.texOffs(377, 272).addBox(4.6394F, -8.0881F, -8.206F, 4.0F, 4.0F, 4.0F)
				.texOffs(368, 225).addBox(7.6394F, -10.0881F, -10.206F, 3.0F, 3.0F, 3.0F)
				.texOffs(475, 226).addBox(-1.3606F, -6.0881F, -6.206F, 8.0F, 8.0F, 8.0F),
			PartPose.offsetAndRotation(-2.0F, -61.0F, 39.0F, -0.2618F, -0.1745F, -0.6981F));
		return LayerDefinition.create(meshdefinition, 512, 512);
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
		return this.total;
	}

	@Override
	public EntityModel<StrangeCatEntity> getPlantModel() {
		return this;
	}
}