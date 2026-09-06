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
	private final ModelPart left_flower;
	private final ModelPart head2;
	private final ModelPart HUABAN7;
	private final ModelPart HUABAN8;
	private final ModelPart HUABAN9;
	private final ModelPart HUABAN10;
	private final ModelPart HUABAN11;
	private final ModelPart HUABAN12;
	private final ModelPart body2;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart cube_r1;
	private final ModelPart left_hand2;
	private final ModelPart right_hand2;
	private final ModelPart right_flower;
	private final ModelPart body3;
	private final ModelPart right_hand3;
	private final ModelPart left_hand3;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart cube_r2;
	private final ModelPart head3;
	private final ModelPart HUABAN2;
	private final ModelPart HUABAN3;
	private final ModelPart HUABAN4;
	private final ModelPart HUABAN5;
	private final ModelPart HUABAN6;
	private final ModelPart HUABAN13;
	private final ModelPart leaves;
	private final ModelPart YEZI_1;
	private final ModelPart YEZI_2;
	private final ModelPart YEZI_3;
	private final ModelPart YEZI_4;




public TwinSunFlowerModel(ModelPart root) {
		this.total = root.getChild("total");
		this.left_flower = this.total.getChild("left_flower");
		this.head2 = this.left_flower.getChild("head2");
		this.HUABAN7 = this.head2.getChild("HUABAN7");
		this.HUABAN8 = this.HUABAN7.getChild("HUABAN8");
		this.HUABAN9 = this.HUABAN8.getChild("HUABAN9");
		this.HUABAN10 = this.head2.getChild("HUABAN10");
		this.HUABAN11 = this.HUABAN10.getChild("HUABAN11");
		this.HUABAN12 = this.HUABAN11.getChild("HUABAN12");
		this.body2 = this.left_flower.getChild("body2");
		this.bone = this.body2.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.cube_r1 = this.bone2.getChild("cube_r1");
		this.left_hand2 = this.body2.getChild("left_hand2");
		this.right_hand2 = this.body2.getChild("right_hand2");
		this.right_flower = this.total.getChild("right_flower");
		this.body3 = this.right_flower.getChild("body3");
		this.right_hand3 = this.body3.getChild("right_hand3");
		this.left_hand3 = this.body3.getChild("left_hand3");
		this.bone3 = this.body3.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.cube_r2 = this.bone4.getChild("cube_r2");
		this.head3 = this.right_flower.getChild("head3");
		this.HUABAN2 = this.head3.getChild("HUABAN2");
		this.HUABAN3 = this.HUABAN2.getChild("HUABAN3");
		this.HUABAN4 = this.HUABAN3.getChild("HUABAN4");
		this.HUABAN5 = this.head3.getChild("HUABAN5");
		this.HUABAN6 = this.HUABAN5.getChild("HUABAN6");
		this.HUABAN13 = this.HUABAN6.getChild("HUABAN13");
		this.leaves = this.total.getChild("leaves");
		this.YEZI_1 = this.leaves.getChild("YEZI_1");
		this.YEZI_2 = this.leaves.getChild("YEZI_2");
		this.YEZI_3 = this.leaves.getChild("YEZI_3");
		this.YEZI_4 = this.leaves.getChild("YEZI_4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_flower_pd = total_pd.addOrReplaceChild("left_flower",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head2_pd = left_flower_pd.addOrReplaceChild("head2",
			CubeListBuilder.create()
				.texOffs(73, 100).addBox(-11.0F, -15.0F, -5.99F, 22.0F, 21.0F, 4.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 123).addBox(-5.0F, 5.9F, -6.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)),
			PartPose.offset(16.0F, -46.0F, 0.0F));
		PartDefinition HUABAN7_pd = head2_pd.addOrReplaceChild("HUABAN7",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0F, -18.0F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-3.0F, 9.8564F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(10.9282F, -4.0718F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.9282F, -4.0718F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition HUABAN8_pd = HUABAN7_pd.addOrReplaceChild("HUABAN8",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.4641F, -17.8564F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-2.4641F, 10.0F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(11.4641F, -3.9282F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.3923F, -3.9282F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN9_pd = HUABAN8_pd.addOrReplaceChild("HUABAN9",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.0718F, -17.4641F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-2.0718F, 10.3923F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(11.8564F, -3.5359F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.0F, -3.5359F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN10_pd = head2_pd.addOrReplaceChild("HUABAN10",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-4.0F, 9.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(10.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition HUABAN11_pd = HUABAN10_pd.addOrReplaceChild("HUABAN11",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.4641F, -15.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.4641F, 10.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.4641F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.3923F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN12_pd = HUABAN11_pd.addOrReplaceChild("HUABAN12",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0718F, -15.4641F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.0718F, 10.3923F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.8564F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.0F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition body2_pd = left_flower_pd.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(112, 43).addBox(-2.0F, -31.0F, -2.0F, 4.0F, 32.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone_pd = body2_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.2679F, -17.0F, -2.0F, 4.0F, 18.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -31.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone2_pd = bone_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition cube_r1_pd = bone2_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F),
			PartPose.offsetAndRotation(-0.2679F, 2.3512F, 0.5254F, 0.7418F, 0.0F, 0.0F));
		PartDefinition left_hand2_pd = body2_pd.addOrReplaceChild("left_hand2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(2.0563F, -1.2443F, -1.0F, 6.0F, 3.0F, 2.0F)
				.texOffs(0, 0).addBox(-3.0197F, -0.3761F, 0.0F, 8.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.134F, -28.5F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition right_hand2_pd = body2_pd.addOrReplaceChild("right_hand2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-8.4088F, -1.1233F, -1.0F, 6.0F, 3.0F, 2.0F)
				.texOffs(0, 0).addBox(-2.4088F, -0.1233F, 0.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.634F, -28.634F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition right_flower_pd = total_pd.addOrReplaceChild("right_flower",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body3_pd = right_flower_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(112, 43).addBox(-2.0F, -27.0F, -2.0F, 4.0F, 28.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition right_hand3_pd = body3_pd.addOrReplaceChild("right_hand3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.9848F, -0.8264F, -1.0F, 6.0F, 3.0F, 2.0F)
				.texOffs(0, 0).addBox(-1.9848F, 0.1736F, 0.0F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-1.7679F, -19.4019F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition left_hand3_pd = body3_pd.addOrReplaceChild("left_hand3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.9848F, -0.8264F, -1.0F, 6.0F, 3.0F, 2.0F)
				.texOffs(0, 0).addBox(-2.1063F, 0.2155F, 0.0F, 8.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.2321F, -19.4019F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone3_pd = body3_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.9319F, -7.4824F, -2.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone4_pd = bone3_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = bone4_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(23, 0).addBox(-2.0F, -4.0F, -3.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offsetAndRotation(0.0681F, -8.1895F, -0.1213F, 0.7854F, 0.0F, 0.0F));
		PartDefinition head3_pd = right_flower_pd.addOrReplaceChild("head3",
			CubeListBuilder.create()
				.texOffs(73, 100).addBox(-11.0F, -15.0F, -5.99F, 22.0F, 21.0F, 4.0F, new CubeDeformation(-0.02F))
				.texOffs(0, 123).addBox(-5.0F, 5.9F, -6.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)),
			PartPose.offset(-16.0F, -33.0F, 0.0F));
		PartDefinition HUABAN2_pd = head3_pd.addOrReplaceChild("HUABAN2",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0F, -18.0F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-3.0F, 9.8564F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(10.9282F, -4.0718F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.9282F, -4.0718F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition HUABAN3_pd = HUABAN2_pd.addOrReplaceChild("HUABAN3",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.4641F, -17.8564F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-2.4641F, 10.0F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(11.4641F, -3.9282F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.3923F, -3.9282F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN4_pd = HUABAN3_pd.addOrReplaceChild("HUABAN4",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-2.0718F, -17.4641F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(29, 63).addBox(-2.0718F, 10.3923F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(42, 36).addBox(11.8564F, -3.5359F, -6.0F, 6.0F, 6.0F, 3.0F)
				.texOffs(73, 73).addBox(-16.0F, -3.5359F, -6.0F, 6.0F, 6.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN5_pd = head3_pd.addOrReplaceChild("HUABAN5",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-4.0F, 9.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(10.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.9282F, -5.0718F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offset(0.0F, -3.0F, 0.0F));
		PartDefinition HUABAN6_pd = HUABAN5_pd.addOrReplaceChild("HUABAN6",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.4641F, -15.8564F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.4641F, 10.0F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.4641F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.3923F, -4.9282F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition HUABAN13_pd = HUABAN6_pd.addOrReplaceChild("HUABAN13",
			CubeListBuilder.create()
				.texOffs(0, 62).addBox(-3.0718F, -15.4641F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(29, 63).addBox(-3.0718F, 10.3923F, -6.0F, 8.0F, 4.0F, 4.0F)
				.texOffs(42, 36).addBox(11.8564F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F)
				.texOffs(73, 73).addBox(-14.0F, -4.5359F, -6.0F, 4.0F, 8.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition YEZI_1_pd = leaves_pd.addOrReplaceChild("YEZI_1",
			CubeListBuilder.create()
				.texOffs(114, 0).addBox(0.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F)
				.texOffs(79, 0).addBox(3.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F),
			PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition YEZI_2_pd = leaves_pd.addOrReplaceChild("YEZI_2",
			CubeListBuilder.create()
				.texOffs(78, 12).addBox(-4.0F, -2.0F, 3.0F, 8.0F, 2.0F, 8.0F)
				.texOffs(114, 9).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 1.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition YEZI_3_pd = leaves_pd.addOrReplaceChild("YEZI_3",
			CubeListBuilder.create()
				.texOffs(114, 19).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 3.0F)
				.texOffs(0, 36).addBox(-4.0F, -2.0F, -11.0F, 8.0F, 2.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition YEZI_4_pd = leaves_pd.addOrReplaceChild("YEZI_4",
			CubeListBuilder.create()
				.texOffs(78, 26).addBox(-11.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F)
				.texOffs(114, 28).addBox(-3.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F),
			PartPose.offset(-2.0F, -1.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(TwinSunFlowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		if(tick > 0 && tick < entity.getAnimGenCD() || entity.isPlantInSuperMode()) {
			final int T = 10;
			this.left_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.left_hand3.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand3.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
		} else {
			this.left_hand2.zRot = 0;
			this.right_hand2.zRot = 0;
			this.left_hand3.zRot = 0;
			this.right_hand3.zRot = 0;
		}
		final int T = 60;
		final int time = entity.getExistTick() % 60;
		final float degree = 5F;
		this.left_flower.zRot = AnimationUtil.getUpDown(time, T, degree);
		this.right_flower.zRot = AnimationUtil.getUpDown(time, T, - degree);
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