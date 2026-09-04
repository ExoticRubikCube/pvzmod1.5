package com.hungteen.pvz.client.model.entity.zombie.roof;

import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.zombie.roof.GargantuarEntity.GargantuarType;
import com.hungteen.pvz.common.entity.zombie.roof.GargantuarEntity;
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
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GargantuarModel<T extends GargantuarEntity> extends PVZEntityModel<T> implements IZombieModel<T>{
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "gargantuar"), "main");

	private final ModelPart total;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart up;
	private final ModelPart back;
	private final ModelPart imp;
	private final ModelPart left_leg3;
	private final ModelPart right_leg3;
	private final ModelPart up3;
	private final ModelPart body3;
	private final ModelPart right_arm2;
	private final ModelPart cube_r1;
	private final ModelPart left_arm2;
	private final ModelPart cube_r2;
	private final ModelPart head3;
	private final ModelPart head;
	private final ModelPart angry;
	private final ModelPart bone3;
	private final ModelPart hurt2;
	private final ModelPart hurt21;
	private final ModelPart hurt22;
	private final ModelPart hurt23;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart hurt1;
	private final ModelPart hurt11;
	private final ModelPart pole;
	private final ModelPart sign;
	private final ModelPart bone;
	private final ModelPart doll;
	private final ModelPart right_leg2;
	private final ModelPart rightleg_r1;
	private final ModelPart left_leg2;
	private final ModelPart leftleg_r1;
	private final ModelPart up2;
	private final ModelPart body2;
	private final ModelPart body_r1;
	private final ModelPart left_hand;
	private final ModelPart lefthand_r1;
	private final ModelPart right_hand;
	private final ModelPart righthand_r1;
	private final ModelPart head2;
	private final ModelPart head_r1;
	private final ModelPart body;




public GargantuarModel(ModelPart root) {
		this.total = root.getChild("total");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.up = root.getChild("up");
		this.back = root.getChild("back");
		this.imp = root.getChild("imp");
		this.left_leg3 = root.getChild("left_leg3");
		this.right_leg3 = root.getChild("right_leg3");
		this.up3 = root.getChild("up3");
		this.body3 = root.getChild("body3");
		this.right_arm2 = root.getChild("right_arm2");
		this.cube_r1 = root.getChild("cube_r1");
		this.left_arm2 = root.getChild("left_arm2");
		this.cube_r2 = root.getChild("cube_r2");
		this.head3 = root.getChild("head3");
		this.head = root.getChild("head");
		this.angry = root.getChild("angry");
		this.bone3 = root.getChild("bone3");
		this.hurt2 = root.getChild("hurt2");
		this.hurt21 = root.getChild("hurt21");
		this.hurt22 = root.getChild("hurt22");
		this.hurt23 = root.getChild("hurt23");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.hurt1 = root.getChild("hurt1");
		this.hurt11 = root.getChild("hurt11");
		this.pole = root.getChild("pole");
		this.sign = root.getChild("sign");
		this.bone = root.getChild("bone");
		this.doll = root.getChild("doll");
		this.right_leg2 = root.getChild("right_leg2");
		this.rightleg_r1 = root.getChild("rightleg_r1");
		this.left_leg2 = root.getChild("left_leg2");
		this.leftleg_r1 = root.getChild("leftleg_r1");
		this.up2 = root.getChild("up2");
		this.body2 = root.getChild("body2");
		this.body_r1 = root.getChild("body_r1");
		this.left_hand = root.getChild("left_hand");
		this.lefthand_r1 = root.getChild("lefthand_r1");
		this.right_hand = root.getChild("right_hand");
		this.righthand_r1 = root.getChild("righthand_r1");
		this.head2 = root.getChild("head2");
		this.head_r1 = root.getChild("head_r1");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(199, 235).addBox(-6.0F, 36.0F, -9.0F, 12.0F, 3.0F, 16.0F)
				.texOffs(3, 205).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 40.0F, 10.0F),
			PartPose.offset(7.0F, -39.0F, 1.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(198, 211).addBox(-5.0F, 36.0F, -9.0F, 12.0F, 3.0F, 16.0F)
				.texOffs(47, 204).addBox(-4.0F, -4.0F, -5.0F, 10.0F, 40.0F, 10.0F),
			PartPose.offset(-8.0F, -39.0F, 1.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -39.0F, 0.0F));
		PartDefinition back_pd = up_pd.addOrReplaceChild("back",
			CubeListBuilder.create()
				.texOffs(93, 236).addBox(-8.0F, -15.0F, -10.0F, 16.0F, 17.0F, 1.0F)
				.texOffs(186, 186).addBox(-8.0F, 2.0F, -10.0F, 16.0F, 1.0F, 17.0F)
				.texOffs(5, 167).addBox(8.0F, -15.0F, -10.0F, 1.0F, 17.0F, 18.0F)
				.texOffs(50, 184).addBox(-8.0F, -15.0F, 7.0F, 16.0F, 17.0F, 1.0F)
				.texOffs(94, 192).addBox(-9.0F, -15.0F, -10.0F, 1.0F, 17.0F, 18.0F),
			PartPose.offset(0.0F, -25.0F, 23.0F));
		PartDefinition imp_pd = back_pd.addOrReplaceChild("imp",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 3.0F, -1.0F));
		PartDefinition left_leg3_pd = imp_pd.addOrReplaceChild("left_leg3",
			CubeListBuilder.create()
				.texOffs(408, 42).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F),
			PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition right_leg3_pd = imp_pd.addOrReplaceChild("right_leg3",
			CubeListBuilder.create()
				.texOffs(408, 24).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F),
			PartPose.offset(-3.0F, -12.0F, 0.0F));
		PartDefinition up3_pd = imp_pd.addOrReplaceChild("up3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition body3_pd = up3_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(408, 4).addBox(-5.0F, -16.0F, -2.0F, 10.0F, 15.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_arm2_pd = up3_pd.addOrReplaceChild("right_arm2",
			CubeListBuilder.create(),
			PartPose.offset(-7.0F, -14.0F, 0.0F));
		PartDefinition cube_r1_pd = right_arm2_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(455, 29).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_arm2_pd = up3_pd.addOrReplaceChild("left_arm2",
			CubeListBuilder.create(),
			PartPose.offset(7.0F, -14.0F, 0.0F));
		PartDefinition cube_r2_pd = left_arm2_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(437, 19).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition head3_pd = up3_pd.addOrReplaceChild("head3",
			CubeListBuilder.create()
				.texOffs(424, 39).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F),
			PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(192, 148).addBox(-8.0F, -8.0F, -14.0F, 16.0F, 17.0F, 14.0F),
			PartPose.offset(0.0F, -40.0F, -11.0F));
		PartDefinition angry_pd = head_pd.addOrReplaceChild("angry",
			CubeListBuilder.create()
				.texOffs(3, 140).addBox(2.0F, -6.0F, -14.05F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.02F))
				.texOffs(28, 141).addBox(-6.0F, -5.0F, -14.05F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.02F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone3_pd = head_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(4, 160).addBox(-8.0F, -1.0F, 0.0F, 16.0F, 1.0F, 1.0F)
				.texOffs(4, 152).addBox(-9.0F, -1.0F, -12.0F, 18.0F, 1.0F, 1.0F)
				.texOffs(49, 158).addBox(-9.0F, -1.0F, -11.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(47, 140).addBox(8.0F, -1.0F, -11.0F, 1.0F, 1.0F, 12.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 1.2217F, 0.0F, 0.0F));
		PartDefinition hurt2_pd = head_pd.addOrReplaceChild("hurt2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hurt21_pd = hurt2_pd.addOrReplaceChild("hurt21",
			CubeListBuilder.create()
				.texOffs(240, 239).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(242, 242).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(8.5F, 2.0F, -8.75F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hurt22_pd = hurt2_pd.addOrReplaceChild("hurt22",
			CubeListBuilder.create()
				.texOffs(207, 239).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(242, 231).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-7.5F, -5.0F, -3.25F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hurt23_pd = hurt2_pd.addOrReplaceChild("hurt23",
			CubeListBuilder.create()
				.texOffs(208, 231).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(189, 240).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.0F, -8.5F, -10.75F, -0.3927F, 0.0F, -1.5708F));
		PartDefinition right_arm_pd = up_pd.addOrReplaceChild("right_arm",
			CubeListBuilder.create()
				.texOffs(100, 25).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 52.0F, 12.0F),
			PartPose.offset(-19.0F, -34.0F, 1.0F));
		PartDefinition left_arm_pd = up_pd.addOrReplaceChild("left_arm",
			CubeListBuilder.create()
				.texOffs(207, 79).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 52.0F, 12.0F),
			PartPose.offset(19.0F, -34.0F, 1.0F));
		PartDefinition hurt1_pd = left_arm_pd.addOrReplaceChild("hurt1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hurt11_pd = hurt1_pd.addOrReplaceChild("hurt11",
			CubeListBuilder.create()
				.texOffs(0, 203).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(193, 239).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(6.5F, 14.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition pole_pd = left_arm_pd.addOrReplaceChild("pole",
			CubeListBuilder.create()
				.texOffs(0, 257).addBox(-2.0F, -3.0F, -50.0F, 4.0F, 4.0F, 72.0F)
				.texOffs(0, 300).addBox(-2.0F, -13.0F, -36.0F, 4.0F, 24.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(16, 307).addBox(-2.0F, -9.0F, -46.0F, 4.0F, 16.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(48, 300).addBox(-1.0F, -7.0F, -49.0F, 2.0F, 2.0F, 4.0F)
				.texOffs(29, 297).addBox(-1.0F, 3.0F, -49.0F, 2.0F, 2.0F, 4.0F)
				.texOffs(49, 320).addBox(-1.0F, -10.0F, -39.0F, 2.0F, 2.0F, 4.0F)
				.texOffs(34, 317).addBox(-1.0F, 7.0F, -39.0F, 2.0F, 2.0F, 4.0F),
			PartPose.offset(0.0F, 43.0F, -11.0F));
		PartDefinition sign_pd = left_arm_pd.addOrReplaceChild("sign",
			CubeListBuilder.create()
				.texOffs(0, 337).addBox(-2.0F, -2.0F, -37.0F, 4.0F, 4.0F, 52.0F, new CubeDeformation(-1.2F))
				.texOffs(0, 378).addBox(-2.0F, -2.0F, 13.0F, 4.0F, 4.0F, 4.0F)
				.texOffs(0, 257).addBox(-1.0F, -1.0F, -67.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F))
				.texOffs(3, 337).addBox(-2.0F, -4.0F, 12.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(5, 345).addBox(0.0F, -2.0F, 12.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(37, 381).addBox(-4.0F, -2.0F, 12.25F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(21, 381).addBox(-2.0F, 0.0F, 12.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(0, 257).addBox(-2.0F, -2.0F, -67.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-1.2F)),
			PartPose.offset(0.0F, 42.0F, 0.0F));
		PartDefinition bone_pd = sign_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 335).addBox(-1.0F, -12.8284F, -7.1716F, 2.0F, 20.0F, 20.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, -53.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition doll_pd = left_arm_pd.addOrReplaceChild("doll",
			CubeListBuilder.create(),
			PartPose.offset(-19.0F, 69.0F, 4.0F));
		PartDefinition right_leg2_pd = doll_pd.addOrReplaceChild("right_leg2",
			CubeListBuilder.create(),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition rightleg_r1_pd = right_leg2_pd.addOrReplaceChild("rightleg_r1",
			CubeListBuilder.create()
				.texOffs(306, 1).addBox(-8.0F, -24.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(23.0F, -3.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition left_leg2_pd = doll_pd.addOrReplaceChild("left_leg2",
			CubeListBuilder.create(),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition leftleg_r1_pd = left_leg2_pd.addOrReplaceChild("leftleg_r1",
			CubeListBuilder.create()
				.texOffs(261, 1).addBox(0.0F, -24.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(15.0F, -3.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition up2_pd = doll_pd.addOrReplaceChild("up2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body2_pd = up2_pd.addOrReplaceChild("body2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition body_r1_pd = body2_pd.addOrReplaceChild("body_r1",
			CubeListBuilder.create()
				.texOffs(262, 42).addBox(-8.0F, -48.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(19.0F, 4.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition left_hand_pd = up2_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create(),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition lefthand_r1_pd = left_hand_pd.addOrReplaceChild("lefthand_r1",
			CubeListBuilder.create()
				.texOffs(358, 61).addBox(8.0F, -48.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(7.0F, 17.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition right_hand_pd = up2_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create(),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition righthand_r1_pd = right_hand_pd.addOrReplaceChild("righthand_r1",
			CubeListBuilder.create()
				.texOffs(358, 1).addBox(-16.0F, -48.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offsetAndRotation(31.0F, 17.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition head2_pd = up2_pd.addOrReplaceChild("head2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition head_r1_pd = head2_pd.addOrReplaceChild("head_r1",
			CubeListBuilder.create()
				.texOffs(278, 97).addBox(-8.0F, -64.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offsetAndRotation(19.0F, 21.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(153, 4).addBox(-13.0F, -79.0F, -11.0F, 26.0F, 40.0F, 24.0F)
				.texOffs(83, 122).addBox(-6.0F, -80.0F, -10.0F, 1.0F, 1.0F, 24.0F)
				.texOffs(146, 123).addBox(5.0F, -80.0F, -10.0F, 1.0F, 1.0F, 24.0F),
			PartPose.offset(0.0F, 39.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
        this.head.xRot = headPitch / (180F / (float)Math.PI);
        if(entity.getAttackTime() == 0) {
            this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.up.xRot = 0;
		} else if(entity.getAttackTime() > 0) {// normal attack
			int total = entity.getCrushCD();
			int now = total - entity.getAttackTime();
			int frontT = total * 2 / 3;
			if(now < frontT) {
				this.left_arm.xRot = AnimationUtil.getUpDown(now, frontT, - 120);
				this.left_arm.yRot = 0;
			} else {
				this.left_arm.xRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
				this.left_arm.yRot = AnimationUtil.getUpDown(now - frontT , total - frontT, 30);
			}
			this.up.xRot = AnimationUtil.getUpDownUpDown(now, total, - 15);
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.right_arm.xRot = 0;
		} else {
			int total = entity.getThrowCD();
			int now = total + entity.getAttackTime();
			int frontT = total * 3 / 4;
			if(now < frontT) {
				this.right_arm.xRot = AnimationUtil.getUp(now, frontT, - 225);
			} else {
				this.right_arm.xRot = AnimationUtil.getDown(now - frontT, total - frontT, - 225);
			}
			this.left_arm.xRot = 0;
			this.right_leg.xRot = 0;
			this.left_leg.xRot = 0;
			this.up.xRot = 0;
		}
        this.pole.visible = (entity.getToolType() == GargantuarType.POLE);
        this.sign.visible = (entity.getToolType() == GargantuarType.SIGN);
        this.doll.visible = (entity.getToolType() == GargantuarType.DOLL);
        this.hurt1.visible = (entity.getHealth() / entity.getMaxHealth() < 2F / 3);
        this.hurt2.visible = (entity.getHealth() / entity.getMaxHealth() < 1F / 3);
        this.angry.visible = entity.isSad;
        this.imp.visible = entity.hasImp();
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
		final int cd = GargantuarEntity.DEATH_ANIM_CD;
		final int time = entity.getAnimTime();
		final int roundT = 40;
		if(time < roundT) {
			this.up.xRot = AnimationUtil.getUpDownUpDown(time, roundT, 15);
			this.total.xRot = AnimationUtil.getUpDownUpDown(time - roundT, roundT, 5);
		} else if(time < roundT * 2) {
			this.up.xRot = AnimationUtil.getUpDownUpDown(time - roundT, roundT, 30);
			this.total.xRot = AnimationUtil.getUpDownUpDown(time - roundT, roundT, 10);
		} else {
			this.total.xRot = AnimationUtil.getUp(time - 2 * roundT, cd - 2 * roundT, 80);
		}
	}

	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		this.pole.visible = false;
		this.sign.visible = false;
		this.doll.visible = false;
		this.angry.visible = entity.hasHandDefence();
		this.imp.visible = false;
		this.total.render(stack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<T> getZombieModel() {
		return this;
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.total.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	
}