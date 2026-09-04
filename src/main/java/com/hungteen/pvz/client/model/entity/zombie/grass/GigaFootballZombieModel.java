package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.GigaFootballZombieEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Optional;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.util.Mth;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GigaFootballZombieModel extends PVZZombieModel<GigaFootballZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "giga_football_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart left_hand;
	private final ModelPart bone;
	private final ModelPart hand;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart right_hand;
	private final ModelPart bone2;
	private final ModelPart hand2;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart head;
	private final ModelPart helmet;
	private final ModelPart body;




public GigaFootballZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.up = root.getChild("up");
		this.left_hand = root.getChild("left_hand");
		this.bone = root.getChild("bone");
		this.hand = root.getChild("hand");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.right_hand = root.getChild("right_hand");
		this.bone2 = root.getChild("bone2");
		this.hand2 = root.getChild("hand2");
		this.bone8 = root.getChild("bone8");
		this.bone9 = root.getChild("bone9");
		this.bone10 = root.getChild("bone10");
		this.bone11 = root.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.head = root.getChild("head");
		this.helmet = root.getChild("helmet");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(32, 236).addBox(-1.0F, 16.0F, -2.0F, 4.0F, 12.0F, 4.0F)
				.texOffs(54, 242).addBox(-2.0F, 28.0F, -6.0F, 6.0F, 3.0F, 9.0F)
				.texOffs(88, 251).addBox(-2.0F, 27.0F, -6.0F, 6.0F, 1.0F, 1.0F)
				.texOffs(108, 232).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 18.0F, 6.0F),
			PartPose.offset(-6.0F, -31.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(236, 237).addBox(-2.0F, 16.0F, -2.0F, 4.0F, 12.0F, 4.0F)
				.texOffs(202, 241).addBox(-3.0F, 28.0F, -6.0F, 6.0F, 3.0F, 9.0F)
				.texOffs(237, 229).addBox(-3.0F, 27.0F, -6.0F, 6.0F, 1.0F, 1.0F)
				.texOffs(2, 232).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 18.0F, 6.0F),
			PartPose.offset(5.0F, -31.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -31.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(3, 214).addBox(-5.0F, -5.0F, -5.0F, 21.0F, 1.0F, 10.0F)
				.texOffs(60, 216).addBox(-5.0F, -4.0F, -6.0F, 16.0F, 6.0F, 1.0F)
				.texOffs(106, 213).addBox(-5.0F, -4.0F, 5.0F, 16.0F, 6.0F, 1.0F)
				.texOffs(144, 201).addBox(-5.0F, -4.0F, -5.0F, 1.0F, 6.0F, 10.0F)
				.texOffs(4, 193).addBox(-5.0F, 2.0F, -5.0F, 15.0F, 3.0F, 10.0F)
				.texOffs(100, 199).addBox(11.0F, -4.0F, -6.0F, 2.0F, 4.0F, 1.0F)
				.texOffs(115, 203).addBox(13.0F, -4.0F, -6.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(128, 200).addBox(11.0F, -4.0F, 5.0F, 2.0F, 4.0F, 1.0F)
				.texOffs(171, 204).addBox(13.0F, -4.0F, 5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(126, 174).addBox(-5.0F, 5.0F, -5.0F, 10.0F, 6.0F, 10.0F)
				.texOffs(70, 76).addBox(0.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(120, 64).addBox(5.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(99, 52).addBox(10.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offset(14.0F, -27.0F, 0.0F));
		PartDefinition bone_pd = left_hand_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(60, 197).addBox(2.0F, -1.0F, -5.0F, 8.0F, 1.0F, 10.0F),
			PartPose.offsetAndRotation(9.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition hand_pd = left_hand_pd.addOrReplaceChild("hand",
			CubeListBuilder.create()
				.texOffs(4, 160).addBox(-4.0F, -5.0F, -20.0F, 4.0F, 4.0F, 24.0F),
			PartPose.offset(2.0F, 11.0F, -1.0F));
		PartDefinition bone3_pd = hand_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(66, 183).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(-4.0F, -3.0F, -20.0F, 0.0F, 0.0F, -1.1345F));
		PartDefinition bone4_pd = hand_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(76, 184).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(-3.0F, -5.0F, -20.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone5_pd = hand_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(88, 184).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 5.0F, 1.0F),
			PartPose.offset(-2.0F, -5.0F, -20.0F));
		PartDefinition bone6_pd = hand_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(101, 185).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(-1.0F, -5.0F, -20.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition bone7_pd = hand_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(114, 184).addBox(0.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(-1.0F, -4.0F, -20.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(4, 143).addBox(-5.0F, -5.0F, -5.0F, 21.0F, 1.0F, 10.0F)
				.texOffs(53, 160).addBox(-5.0F, -4.0F, -6.0F, 16.0F, 6.0F, 1.0F)
				.texOffs(62, 146).addBox(-5.0F, -4.0F, 5.0F, 16.0F, 6.0F, 1.0F)
				.texOffs(100, 157).addBox(-5.0F, -4.0F, -5.0F, 1.0F, 6.0F, 10.0F)
				.texOffs(4, 124).addBox(-5.0F, 2.0F, -5.0F, 15.0F, 3.0F, 10.0F)
				.texOffs(107, 142).addBox(11.0F, -4.0F, -6.0F, 2.0F, 4.0F, 1.0F)
				.texOffs(124, 151).addBox(13.0F, -4.0F, -6.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(135, 160).addBox(11.0F, -4.0F, 5.0F, 2.0F, 4.0F, 1.0F)
				.texOffs(172, 172).addBox(13.0F, -4.0F, 5.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(7, 97).addBox(-5.0F, 5.0F, -5.0F, 10.0F, 6.0F, 10.0F)
				.texOffs(72, 46).addBox(0.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(49, 58).addBox(5.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(36, 80).addBox(10.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-14.0F, -27.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone2_pd = right_hand_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(63, 127).addBox(2.0F, -1.0F, -5.0F, 8.0F, 1.0F, 10.0F),
			PartPose.offsetAndRotation(9.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition hand2_pd = right_hand_pd.addOrReplaceChild("hand2",
			CubeListBuilder.create()
				.texOffs(61, 92).addBox(0.0609F, -1.0F, -20.605499F, 4.0F, 4.0F, 24.0F),
			PartPose.offsetAndRotation(2.0F, 7.0F, 1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone8_pd = hand2_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(131, 129).addBox(-1.4226F, -1.0937F, 0.0F, 1.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(5.0609F, 2.0F, -20.6055F, 0.0F, 0.0F, 1.1345F));
		PartDefinition bone9_pd = hand2_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(156, 136).addBox(-0.9128F, -2.9962F, 0.0F, 1.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(1.0609F, 0.0F, -20.6055F, 0.0F, 0.0F, -0.6981F));
		PartDefinition bone10_pd = hand2_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(180, 152).addBox(-0.9128F, -3.9962F, 0.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(2.0609F, 0.0F, -20.6055F, 0.0F, 0.0F, -0.3491F));
		PartDefinition bone11_pd = hand2_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(153, 92).addBox(-1.9962F, -3.9128F, 0.0F, 1.0F, 5.0F, 1.0F),
			PartPose.offset(4.0609F, -1.0F, -20.6055F));
		PartDefinition bone12_pd = hand2_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(169, 120).addBox(-0.8051F, -4.5F, 0.0F, 1.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(3.0F, 1.0F, -20.6055F, 0.0F, 0.0F, 0.5236F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(189, 49).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition helmet_pd = head_pd.addOrReplaceChild("helmet",
			CubeListBuilder.create()
				.texOffs(30, 227).addBox(2.0F, -16.0F, -10.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(178, 86).addBox(-9.0F, -18.0F, -10.0F, 18.0F, 2.0F, 19.0F)
				.texOffs(194, 111).addBox(-7.0F, -19.0F, -7.0F, 14.0F, 1.0F, 14.0F)
				.texOffs(214, 132).addBox(9.0F, -16.0F, -9.0F, 1.0F, 16.0F, 18.0F)
				.texOffs(215, 172).addBox(-9.0F, -16.0F, 9.0F, 18.0F, 16.0F, 1.0F)
				.texOffs(208, 195).addBox(-9.0F, 0.0F, 5.0F, 18.0F, 1.0F, 4.0F)
				.texOffs(247, 207).addBox(-9.0F, -4.0F, -10.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(246, 217).addBox(8.0F, -4.0F, -10.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(152, 220).addBox(-10.0F, -16.0F, -9.0F, 1.0F, 16.0F, 18.0F)
				.texOffs(197, 231).addBox(-8.0F, -1.0F, -10.0F, 16.0F, 1.0F, 1.0F)
				.texOffs(192, 219).addBox(-8.0F, -4.0F, -10.0F, 16.0F, 1.0F, 1.0F)
				.texOffs(182, 212).addBox(-7.0F, -16.0F, -10.0F, 1.0F, 15.0F, 1.0F)
				.texOffs(140, 225).addBox(6.0F, -16.0F, -10.0F, 1.0F, 15.0F, 1.0F)
				.texOffs(86, 239).addBox(2.0F, -3.0F, -10.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(56, 240).addBox(-3.0F, -3.0F, -10.0F, 1.0F, 2.0F, 1.0F)
				.texOffs(57, 233).addBox(-3.0F, -16.0F, -10.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(197, 4).addBox(-9.0F, -32.0F, -5.0F, 18.0F, 32.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(GigaFootballZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() == 0) {
			this.up.xRot = 0.5f;
			this.head.xRot = - 0.5f;
			this.head.yRot = 0f;
			this.right_hand.xRot = 0.5f;
			this.left_hand.xRot = - 0.5f;
		} else {
			this.up.xRot = 0f;
		}
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}
	
	
	@Override
	protected void doWalkAnimation(float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch) {
		this.right_leg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 1.5f;
	    this.left_leg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 1.5f;
	    if(this.isHeadFree) {
	    	this.head.yRot = netHeadYaw / (180F / (float)Math.PI);
	        this.head.xRot = headPitch / (180F / (float)Math.PI);
	    }
	    if(this.isLeftHandFree)  this.left_hand.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / 3;
	    if(this.isRightHandFree) this.right_hand.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / 3;
	}
	
	@Override
	protected void doPreAttackPose() {
		//can hand attack
		if(this.isLeftHandFree || this.isRightHandFree) {
			if(this.isLeftHandFree) {
				this.getZombieLeftHand().xRot = HAND_MAX_ANGLE / 3;
			}
			if(this.isRightHandFree) {
				this.getZombieRightHand().xRot = - HAND_MAX_ANGLE / 3;
			}
		} 
	}
	
	@Override
	protected void doHandEat(GigaFootballZombieEntity entity) {
		if(this.isLeftHandFree) {
			this.getZombieLeftHand().xRot = HAND_MAX_ANGLE / 3 - AnimationUtil.getUpDown(MAX_ANIM_CD - entity.getAnimTime(), MAX_ANIM_CD, - 70);
		}
		if(this.isRightHandFree) {
			this.getZombieRightHand().xRot = - HAND_MAX_ANGLE / 3 + AnimationUtil.getUpDown(MAX_ANIM_CD - entity.getAnimTime(), MAX_ANIM_CD, - 70);
		}
	}
	
	@Override
	public void updateFreeParts(GigaFootballZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasMetal = entity.hasMetal();
		this.helmet.visible = hasMetal;
		final boolean isRushing = (entity.getAttackTime() == 0);
		this.isLeftHandFree = ! isRushing;
		this.isRightHandFree = ! isRushing;
	}
	
	@Override
	public Optional<ModelPart> getHelmet() {
		return Optional.ofNullable(this.helmet);
	}
	
	@Override
	public ModelPart getZombieLeftHand() {
		return this.left_hand;
	}

	@Override
	public ModelPart getZombieRightHand() {
		return this.right_hand;
	}

	@Override
	public ModelPart getZombieLeftLeg() {
		return this.left_leg;
	}

	@Override
	public ModelPart getZombieRightLeg() {
		return this.right_leg;
	}

	@Override
	public ModelPart getZombieHead() {
		return this.head;
	}
	
	@Override
	public ModelPart getZombieUpBody() {
		return this.up;
	}

	@Override
	public ModelPart getZombieWholeBody() {
		return this.total;
	}

}