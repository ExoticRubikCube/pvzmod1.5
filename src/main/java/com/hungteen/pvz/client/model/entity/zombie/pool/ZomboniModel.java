package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.zombie.pool.ZomboniEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
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

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ZomboniModel extends PVZEntityModel<ZomboniEntity> implements IZombieModel<ZomboniEntity>{
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "zomboni"), "main");

	private final ModelPart total;
	private final ModelPart car;
	private final ModelPart lunzi;
	private final ModelPart tyre_leftfront;
	private final ModelPart bone14;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart tyre_leftfront2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart tyre_leftfront3;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart tyre_leftfront4;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart chair;
	private final ModelPart bone;
	private final ModelPart mid;
	private final ModelPart bone26;
	private final ModelPart ice;
	private final ModelPart front;
	private final ModelPart level1;
	private final ModelPart level2;
	private final ModelPart gai;
	private final ModelPart ice2;
	private final ModelPart zombie;
	private final ModelPart head;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart right_hand;
	private final ModelPart left_hand;
	private final ModelPart body;
	private final ModelPart right_leg;
	private final ModelPart left_leg;




public ZomboniModel(ModelPart root) {
		this.total = root.getChild("total");
		this.car = this.total.getChild("car");
		this.lunzi = this.car.getChild("lunzi");
		this.tyre_leftfront = this.lunzi.getChild("tyre_leftfront");
		this.bone14 = this.tyre_leftfront.getChild("bone14");
		this.bone12 = this.bone14.getChild("bone12");
		this.bone13 = this.bone14.getChild("bone13");
		this.bone15 = this.tyre_leftfront.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.bone17 = this.bone15.getChild("bone17");
		this.tyre_leftfront2 = this.lunzi.getChild("tyre_leftfront2");
		this.bone2 = this.tyre_leftfront2.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone2.getChild("bone4");
		this.bone5 = this.tyre_leftfront2.getChild("bone5");
		this.bone6 = this.bone5.getChild("bone6");
		this.bone7 = this.bone5.getChild("bone7");
		this.tyre_leftfront3 = this.lunzi.getChild("tyre_leftfront3");
		this.bone8 = this.tyre_leftfront3.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone10 = this.bone8.getChild("bone10");
		this.bone11 = this.tyre_leftfront3.getChild("bone11");
		this.bone18 = this.bone11.getChild("bone18");
		this.bone19 = this.bone11.getChild("bone19");
		this.tyre_leftfront4 = this.lunzi.getChild("tyre_leftfront4");
		this.bone20 = this.tyre_leftfront4.getChild("bone20");
		this.bone21 = this.bone20.getChild("bone21");
		this.bone22 = this.bone20.getChild("bone22");
		this.bone23 = this.tyre_leftfront4.getChild("bone23");
		this.bone24 = this.bone23.getChild("bone24");
		this.bone25 = this.bone23.getChild("bone25");
		this.chair = this.car.getChild("chair");
		this.bone = this.chair.getChild("bone");
		this.mid = this.car.getChild("mid");
		this.bone26 = this.mid.getChild("bone26");
		this.ice = this.mid.getChild("ice");
		this.front = this.car.getChild("front");
		this.level1 = this.front.getChild("level1");
		this.level2 = this.front.getChild("level2");
		this.gai = this.front.getChild("gai");
		this.ice2 = this.front.getChild("ice2");
		this.zombie = this.total.getChild("zombie");
		this.head = this.zombie.getChild("head");
		this.bone27 = this.head.getChild("bone27");
		this.bone28 = this.head.getChild("bone28");
		this.bone29 = this.head.getChild("bone29");
		this.right_hand = this.zombie.getChild("right_hand");
		this.left_hand = this.zombie.getChild("left_hand");
		this.body = this.zombie.getChild("body");
		this.right_leg = this.zombie.getChild("right_leg");
		this.left_leg = this.zombie.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition car_pd = total_pd.addOrReplaceChild("car",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 1.0F, -3.0F));
		PartDefinition lunzi_pd = car_pd.addOrReplaceChild("lunzi",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tyre_leftfront_pd = lunzi_pd.addOrReplaceChild("tyre_leftfront",
			CubeListBuilder.create(),
			PartPose.offset(19.0F, -7.0F, -45.0F));
		PartDefinition bone14_pd = tyre_leftfront_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -3.0F, -34.0F));
		PartDefinition bone12_pd = bone14_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(478, 459).addBox(-4.0F, 3.0F, 31.0F, 4.0F, 7.0F, 6.0F)
				.texOffs(481, 436).addBox(-4.0F, -4.4853F, 31.0F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone13_pd = bone14_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(478, 412).addBox(-4.0F, -35.757401F, 9.7574F, 4.0F, 7.0F, 6.0F)
				.texOffs(481, 390).addBox(-4.0F, -43.242599F, 9.7574F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone15_pd = tyre_leftfront_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -5.0F, -36.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone16_pd = bone15_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(481, 372).addBox(-4.0F, -21.849199F, 25.819799F, 4.0F, 7.0F, 6.0F)
				.texOffs(480, 345).addBox(-4.0F, -29.334499F, 25.819799F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone17_pd = bone15_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(478, 324).addBox(-4.0F, -30.5772F, -15.0919F, 4.0F, 7.0F, 6.0F)
				.texOffs(480, 297).addBox(-4.0F, -38.062401F, -15.0919F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_leftfront2_pd = lunzi_pd.addOrReplaceChild("tyre_leftfront2",
			CubeListBuilder.create(),
			PartPose.offset(19.0F, -7.0F, -12.0F));
		PartDefinition bone2_pd = tyre_leftfront2_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -3.0F, -34.0F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(481, 270).addBox(-4.0F, 3.0F, 31.0F, 4.0F, 7.0F, 6.0F)
				.texOffs(481, 241).addBox(-4.0F, -4.4853F, 31.0F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4_pd = bone2_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(486, 216).addBox(-4.0F, -35.757401F, 9.7574F, 4.0F, 7.0F, 6.0F)
				.texOffs(486, 192).addBox(-4.0F, -43.242599F, 9.7574F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone5_pd = tyre_leftfront2_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -5.0F, -36.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone6_pd = bone5_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(488, 145).addBox(-4.0F, -21.849199F, 25.819799F, 4.0F, 7.0F, 6.0F)
				.texOffs(484, 169).addBox(-4.0F, -29.334499F, 25.819799F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone7_pd = bone5_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(486, 124).addBox(-4.0F, -30.5772F, -15.0919F, 4.0F, 7.0F, 6.0F)
				.texOffs(486, 100).addBox(-4.0F, -38.062401F, -15.0919F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_leftfront3_pd = lunzi_pd.addOrReplaceChild("tyre_leftfront3",
			CubeListBuilder.create(),
			PartPose.offset(-18.0F, -7.0F, -45.0F));
		PartDefinition bone8_pd = tyre_leftfront3_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create(),
			PartPose.offset(37.0F, -3.0F, -34.0F));
		PartDefinition bone9_pd = bone8_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(486, 75).addBox(-38.0F, 3.0F, 31.0F, 4.0F, 7.0F, 6.0F)
				.texOffs(484, 56).addBox(-38.0F, -4.4853F, 31.0F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone10_pd = bone8_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(486, 36).addBox(-38.0F, -35.757401F, 9.7574F, 4.0F, 7.0F, 6.0F)
				.texOffs(486, 12).addBox(-38.0F, -43.242599F, 9.7574F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone11_pd = tyre_leftfront3_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(37.0F, -5.0F, -36.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone18_pd = bone11_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(456, 11).addBox(-38.0F, -21.849199F, 25.819799F, 4.0F, 7.0F, 6.0F)
				.texOffs(452, 38).addBox(-38.0F, -29.334499F, 25.819799F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone19_pd = bone11_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(456, 57).addBox(-38.0F, -30.5772F, -15.0919F, 4.0F, 7.0F, 6.0F)
				.texOffs(457, 80).addBox(-38.0F, -38.062401F, -15.0919F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition tyre_leftfront4_pd = lunzi_pd.addOrReplaceChild("tyre_leftfront4",
			CubeListBuilder.create(),
			PartPose.offset(-17.0F, -7.0F, -12.0F));
		PartDefinition bone20_pd = tyre_leftfront4_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create(),
			PartPose.offset(36.0F, -3.0F, -34.0F));
		PartDefinition bone21_pd = bone20_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(449, 100).addBox(-38.0F, 3.0F, 31.0F, 4.0F, 7.0F, 6.0F)
				.texOffs(454, 124).addBox(-38.0F, -4.4853F, 31.0F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone22_pd = bone20_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(454, 152).addBox(-38.0F, -35.757401F, 9.7574F, 4.0F, 7.0F, 6.0F)
				.texOffs(457, 176).addBox(-38.0F, -43.242599F, 9.7574F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone23_pd = tyre_leftfront4_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(36.0F, -5.0F, -36.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone24_pd = bone23_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(454, 200).addBox(-38.0F, -21.849199F, 25.819799F, 4.0F, 7.0F, 6.0F)
				.texOffs(454, 220).addBox(-38.0F, -29.334499F, 25.819799F, 4.0F, 7.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone25_pd = bone23_pd.addOrReplaceChild("bone25",
			CubeListBuilder.create()
				.texOffs(452, 246).addBox(-38.0F, -30.5772F, -15.0919F, 4.0F, 7.0F, 6.0F)
				.texOffs(452, 268).addBox(-38.0F, -38.062401F, -15.0919F, 4.0F, 7.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition chair_pd = car_pd.addOrReplaceChild("chair",
			CubeListBuilder.create()
				.texOffs(438, 492).addBox(-10.0F, -1.0F, -12.0F, 20.0F, 1.0F, 14.0F),
			PartPose.offset(0.0F, -26.0F, 20.0F));
		PartDefinition bone_pd = chair_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(384, 483).addBox(-10.0F, -22.9848F, -0.1736F, 20.0F, 22.0F, 1.0F)
				.texOffs(454, 472).addBox(10.0F, -2.9848F, -1.1736F, 1.0F, 3.0F, 2.0F)
				.texOffs(459, 457).addBox(-11.0F, -2.9848F, -1.1736F, 1.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition mid_pd = car_pd.addOrReplaceChild("mid",
			CubeListBuilder.create()
				.texOffs(4, 491).addBox(-15.0F, -1.0F, -7.0F, 30.0F, 3.0F, 15.0F)
				.texOffs(89, 488).addBox(-15.0F, -16.0F, 8.0F, 30.0F, 18.0F, 1.0F)
				.texOffs(171, 491).addBox(-15.0F, -16.0F, 9.0F, 29.0F, 8.0F, 8.0F)
				.texOffs(299, 497).addBox(-8.0F, -8.0F, 9.0F, 16.0F, 4.0F, 4.0F),
			PartPose.offset(0.0F, -10.0F, 2.0F));
		PartDefinition bone26_pd = mid_pd.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(262, 497).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, 17.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition ice_pd = mid_pd.addOrReplaceChild("ice",
			CubeListBuilder.create()
				.texOffs(400, 472).addBox(-8.0F, 1.0F, 0.0F, 16.0F, 4.0F, 1.0F)
				.texOffs(4, 470).addBox(-9.0F, 5.0F, -1.0F, 18.0F, 1.0F, 3.0F)
				.texOffs(56, 467).addBox(-11.0F, 6.0F, -3.0F, 22.0F, 1.0F, 7.0F)
				.texOffs(372, 374).addBox(-13.0F, 7.0F, -5.0F, 26.0F, 2.0F, 11.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition front_pd = car_pd.addOrReplaceChild("front",
			CubeListBuilder.create()
				.texOffs(6, 363).addBox(-15.0F, -35.0F, -50.0F, 30.0F, 38.0F, 48.0F),
			PartPose.offset(0.0F, -10.0F, -3.0F));
		PartDefinition level1_pd = front_pd.addOrReplaceChild("level1",
			CubeListBuilder.create()
				.texOffs(176, 452).addBox(1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 16.0F),
			PartPose.offsetAndRotation(9.0F, -28.0F, -1.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition level2_pd = front_pd.addOrReplaceChild("level2",
			CubeListBuilder.create()
				.texOffs(230, 459).addBox(1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 16.0F),
			PartPose.offsetAndRotation(-13.0F, -28.0F, -1.0F, 1.1345F, 0.0F, 0.0F));
		PartDefinition gai_pd = front_pd.addOrReplaceChild("gai",
			CubeListBuilder.create()
				.texOffs(4, 291).addBox(-17.0F, -7.0F, 0.0F, 34.0F, 21.0F, 45.0F),
			PartPose.offset(0.0F, -36.0F, -52.0F));
		PartDefinition ice2_pd = front_pd.addOrReplaceChild("ice2",
			CubeListBuilder.create()
				.texOffs(432, 359).addBox(-8.0F, 1.0F, 0.0F, 16.0F, 1.0F, 1.0F)
				.texOffs(338, 359).addBox(-9.0F, 2.0F, -1.0F, 18.0F, 1.0F, 3.0F)
				.texOffs(263, 348).addBox(-11.0F, 3.0F, -3.0F, 22.0F, 2.0F, 7.0F),
			PartPose.offset(0.0F, 2.0F, -25.0F));
		PartDefinition zombie_pd = total_pd.addOrReplaceChild("zombie",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -32.0F, 12.0F));
		PartDefinition head_pd = zombie_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(291, 449).addBox(-7.0F, -13.0F, -7.0F, 14.0F, 14.0F, 14.0F)
				.texOffs(369, 440).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 3.0F, 16.0F)
				.texOffs(294, 435).addBox(-7.0F, -17.0F, 0.0F, 14.0F, 1.0F, 8.0F),
			PartPose.offset(0.0F, -25.0F, 0.0F));
		PartDefinition bone27_pd = head_pd.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(179, 443).addBox(0.0F, 0.0F, -2.0F, 8.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(8.0F, -14.0F, 0.0F, 0.0F, -0.3491F, 1.3963F));
		PartDefinition bone28_pd = head_pd.addOrReplaceChild("bone28",
			CubeListBuilder.create()
				.texOffs(219, 446).mirror().addBox(-7.0F, -1.0F, -2.0F, 8.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-8.0F, -13.0F, 0.0F, 0.0F, 0.3491F, -1.3963F));
		PartDefinition bone29_pd = head_pd.addOrReplaceChild("bone29",
			CubeListBuilder.create()
				.texOffs(264, 444).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -17.0F, 8.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition right_hand_pd = zombie_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(176, 403).addBox(-7.0F, -3.0F, -3.0F, 6.0F, 21.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, -21.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = zombie_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(217, 406).addBox(0.0F, -3.0F, -3.0F, 6.0F, 21.0F, 6.0F),
			PartPose.offsetAndRotation(8.0F, -21.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
		PartDefinition body_pd = zombie_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(252, 400).addBox(-8.0F, -23.0F, -4.0F, 16.0F, 24.0F, 8.0F)
				.texOffs(321, 409).addBox(-2.0F, 1.0F, -4.0F, 4.0F, 6.0F, 8.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition right_leg_pd = zombie_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(358, 398).addBox(-2.0F, 0.0F, -13.0F, 6.0F, 6.0F, 17.0F)
				.texOffs(414, 418).addBox(-3.0F, 18.0F, -16.0F, 8.0F, 4.0F, 10.0F)
				.texOffs(168, 377).addBox(-2.0F, 6.0F, -13.0F, 6.0F, 12.0F, 6.0F),
			PartPose.offset(-6.0F, 0.0F, 0.0F));
		PartDefinition left_leg_pd = zombie_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(212, 366).addBox(-2.0F, 0.0F, -13.0F, 6.0F, 6.0F, 17.0F)
				.texOffs(274, 375).addBox(-3.0F, 18.0F, -16.0F, 8.0F, 4.0F, 10.0F)
				.texOffs(326, 373).addBox(-2.0F, 6.0F, -13.0F, 6.0F, 12.0F, 6.0F),
			PartPose.offset(4.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}


	@Override
	public void setupAnim(ZomboniEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.ice2.xRot=Mth.sin(ageInTicks/20)/2;
		this.tyre_leftfront.xRot=ageInTicks%360;
		this.tyre_leftfront2.xRot=ageInTicks%360;
		this.tyre_leftfront3.xRot=ageInTicks%360;
		this.tyre_leftfront4.xRot=ageInTicks%360;
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void tickPartAnim(IBodyEntity entity, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		this.zombie.visible = false;
		this.total.render(stack, buffer, packedLight, packedOverlay);
	}

	@Override
	public EntityModel<ZomboniEntity> getZombieModel() {
		return this;
	}

}