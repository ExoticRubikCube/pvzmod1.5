package com.hungteen.pvz.client.model.entity.plant.spear;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.spear.CactusEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CactusModel extends PlantShooterModel<CactusEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "cactus"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart branch;
	private final ModelPart mouse;
	private final ModelPart hat;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart small1;
	private final ModelPart small2;
	private final ModelPart small3;
	private final ModelPart spikes3;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart blue_spikes3;
	private final ModelPart bone46;
	private final ModelPart bone47;
	private final ModelPart bone48;
	private final ModelPart bone49;
	private final ModelPart bone50;
	private final ModelPart bone51;
	private final ModelPart bone52;
	private final ModelPart right_hand;
	private final ModelPart spikes1;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart blue_spikes1;
	private final ModelPart bone53;
	private final ModelPart bone54;
	private final ModelPart bone55;
	private final ModelPart bone56;
	private final ModelPart bone57;
	private final ModelPart bone58;
	private final ModelPart bone59;
	private final ModelPart left_hand;
	private final ModelPart spikes2;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart blue_spikes2;
	private final ModelPart bone60;
	private final ModelPart bone61;
	private final ModelPart bone62;
	private final ModelPart bone63;
	private final ModelPart bone64;
	private final ModelPart bone65;
	private final ModelPart bone66;
	private final ModelPart body2;
	private final ModelPart spikes4;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart blue_spikes4;
	private final ModelPart bone67;
	private final ModelPart bone68;
	private final ModelPart bone69;
	private final ModelPart bone70;
	private final ModelPart bone71;
	private final ModelPart bone72;
	private final ModelPart body3;
	private final ModelPart spikes5;
	private final ModelPart bone22;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart bone33;
	private final ModelPart blue_spikes5;
	private final ModelPart bone73;
	private final ModelPart bone74;
	private final ModelPart bone75;
	private final ModelPart bone76;
	private final ModelPart bone77;
	private final ModelPart bone78;
	private final ModelPart body4;
	private final ModelPart spikes6;
	private final ModelPart bone34;
	private final ModelPart bone35;
	private final ModelPart bone36;
	private final ModelPart bone37;
	private final ModelPart bone38;
	private final ModelPart bone39;
	private final ModelPart blue_spikes6;
	private final ModelPart bone79;
	private final ModelPart bone80;
	private final ModelPart bone81;
	private final ModelPart bone82;
	private final ModelPart bone83;
	private final ModelPart bone84;
	private final ModelPart body5;
	private final ModelPart spikes7;
	private final ModelPart bone40;
	private final ModelPart bone41;
	private final ModelPart bone42;
	private final ModelPart bone43;
	private final ModelPart bone44;
	private final ModelPart bone45;
	private final ModelPart blue_spikes7;
	private final ModelPart bone85;
	private final ModelPart bone86;
	private final ModelPart bone87;
	private final ModelPart bone88;
	private final ModelPart bone89;
	private final ModelPart bone90;




public CactusModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.branch = this.body.getChild("branch");
		this.mouse = this.body.getChild("mouse");
		this.hat = this.body.getChild("hat");
		this.cube_r1 = this.hat.getChild("cube_r1");
		this.cube_r2 = this.hat.getChild("cube_r2");
		this.cube_r3 = this.hat.getChild("cube_r3");
		this.cube_r4 = this.hat.getChild("cube_r4");
		this.cube_r5 = this.hat.getChild("cube_r5");
		this.cube_r6 = this.hat.getChild("cube_r6");
		this.cube_r7 = this.hat.getChild("cube_r7");
		this.cube_r8 = this.hat.getChild("cube_r8");
		this.small1 = this.hat.getChild("small1");
		this.small2 = this.hat.getChild("small2");
		this.small3 = this.hat.getChild("small3");
		this.spikes3 = this.body.getChild("spikes3");
		this.bone15 = this.spikes3.getChild("bone15");
		this.bone16 = this.spikes3.getChild("bone16");
		this.bone17 = this.spikes3.getChild("bone17");
		this.bone18 = this.spikes3.getChild("bone18");
		this.bone19 = this.spikes3.getChild("bone19");
		this.bone20 = this.spikes3.getChild("bone20");
		this.bone21 = this.spikes3.getChild("bone21");
		this.blue_spikes3 = this.body.getChild("blue_spikes3");
		this.bone46 = this.blue_spikes3.getChild("bone46");
		this.bone47 = this.blue_spikes3.getChild("bone47");
		this.bone48 = this.blue_spikes3.getChild("bone48");
		this.bone49 = this.blue_spikes3.getChild("bone49");
		this.bone50 = this.blue_spikes3.getChild("bone50");
		this.bone51 = this.blue_spikes3.getChild("bone51");
		this.bone52 = this.blue_spikes3.getChild("bone52");
		this.right_hand = this.total.getChild("right_hand");
		this.spikes1 = this.right_hand.getChild("spikes1");
		this.bone = this.spikes1.getChild("bone");
		this.bone2 = this.spikes1.getChild("bone2");
		this.bone3 = this.spikes1.getChild("bone3");
		this.bone4 = this.spikes1.getChild("bone4");
		this.bone5 = this.spikes1.getChild("bone5");
		this.bone6 = this.spikes1.getChild("bone6");
		this.bone7 = this.spikes1.getChild("bone7");
		this.blue_spikes1 = this.right_hand.getChild("blue_spikes1");
		this.bone53 = this.blue_spikes1.getChild("bone53");
		this.bone54 = this.blue_spikes1.getChild("bone54");
		this.bone55 = this.blue_spikes1.getChild("bone55");
		this.bone56 = this.blue_spikes1.getChild("bone56");
		this.bone57 = this.blue_spikes1.getChild("bone57");
		this.bone58 = this.blue_spikes1.getChild("bone58");
		this.bone59 = this.blue_spikes1.getChild("bone59");
		this.left_hand = this.total.getChild("left_hand");
		this.spikes2 = this.left_hand.getChild("spikes2");
		this.bone8 = this.spikes2.getChild("bone8");
		this.bone9 = this.spikes2.getChild("bone9");
		this.bone10 = this.spikes2.getChild("bone10");
		this.bone11 = this.spikes2.getChild("bone11");
		this.bone12 = this.spikes2.getChild("bone12");
		this.bone13 = this.spikes2.getChild("bone13");
		this.bone14 = this.spikes2.getChild("bone14");
		this.blue_spikes2 = this.left_hand.getChild("blue_spikes2");
		this.bone60 = this.blue_spikes2.getChild("bone60");
		this.bone61 = this.blue_spikes2.getChild("bone61");
		this.bone62 = this.blue_spikes2.getChild("bone62");
		this.bone63 = this.blue_spikes2.getChild("bone63");
		this.bone64 = this.blue_spikes2.getChild("bone64");
		this.bone65 = this.blue_spikes2.getChild("bone65");
		this.bone66 = this.blue_spikes2.getChild("bone66");
		this.body2 = this.total.getChild("body2");
		this.spikes4 = this.body2.getChild("spikes4");
		this.bone23 = this.spikes4.getChild("bone23");
		this.bone24 = this.spikes4.getChild("bone24");
		this.bone25 = this.spikes4.getChild("bone25");
		this.bone26 = this.spikes4.getChild("bone26");
		this.bone27 = this.spikes4.getChild("bone27");
		this.bone28 = this.spikes4.getChild("bone28");
		this.blue_spikes4 = this.body2.getChild("blue_spikes4");
		this.bone67 = this.blue_spikes4.getChild("bone67");
		this.bone68 = this.blue_spikes4.getChild("bone68");
		this.bone69 = this.blue_spikes4.getChild("bone69");
		this.bone70 = this.blue_spikes4.getChild("bone70");
		this.bone71 = this.blue_spikes4.getChild("bone71");
		this.bone72 = this.blue_spikes4.getChild("bone72");
		this.body3 = this.total.getChild("body3");
		this.spikes5 = this.body3.getChild("spikes5");
		this.bone22 = this.spikes5.getChild("bone22");
		this.bone29 = this.spikes5.getChild("bone29");
		this.bone30 = this.spikes5.getChild("bone30");
		this.bone31 = this.spikes5.getChild("bone31");
		this.bone32 = this.spikes5.getChild("bone32");
		this.bone33 = this.spikes5.getChild("bone33");
		this.blue_spikes5 = this.body3.getChild("blue_spikes5");
		this.bone73 = this.blue_spikes5.getChild("bone73");
		this.bone74 = this.blue_spikes5.getChild("bone74");
		this.bone75 = this.blue_spikes5.getChild("bone75");
		this.bone76 = this.blue_spikes5.getChild("bone76");
		this.bone77 = this.blue_spikes5.getChild("bone77");
		this.bone78 = this.blue_spikes5.getChild("bone78");
		this.body4 = this.total.getChild("body4");
		this.spikes6 = this.body4.getChild("spikes6");
		this.bone34 = this.spikes6.getChild("bone34");
		this.bone35 = this.spikes6.getChild("bone35");
		this.bone36 = this.spikes6.getChild("bone36");
		this.bone37 = this.spikes6.getChild("bone37");
		this.bone38 = this.spikes6.getChild("bone38");
		this.bone39 = this.spikes6.getChild("bone39");
		this.blue_spikes6 = this.body4.getChild("blue_spikes6");
		this.bone79 = this.blue_spikes6.getChild("bone79");
		this.bone80 = this.blue_spikes6.getChild("bone80");
		this.bone81 = this.blue_spikes6.getChild("bone81");
		this.bone82 = this.blue_spikes6.getChild("bone82");
		this.bone83 = this.blue_spikes6.getChild("bone83");
		this.bone84 = this.blue_spikes6.getChild("bone84");
		this.body5 = this.total.getChild("body5");
		this.spikes7 = this.body5.getChild("spikes7");
		this.bone40 = this.spikes7.getChild("bone40");
		this.bone41 = this.spikes7.getChild("bone41");
		this.bone42 = this.spikes7.getChild("bone42");
		this.bone43 = this.spikes7.getChild("bone43");
		this.bone44 = this.spikes7.getChild("bone44");
		this.bone45 = this.spikes7.getChild("bone45");
		this.blue_spikes7 = this.body5.getChild("blue_spikes7");
		this.bone85 = this.blue_spikes7.getChild("bone85");
		this.bone86 = this.blue_spikes7.getChild("bone86");
		this.bone87 = this.blue_spikes7.getChild("bone87");
		this.bone88 = this.blue_spikes7.getChild("bone88");
		this.bone89 = this.blue_spikes7.getChild("bone89");
		this.bone90 = this.blue_spikes7.getChild("bone90");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(47, 81).addBox(-4.0F, -28.0F, -5.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(16, 73).addBox(0.0F, -28.0F, -5.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition branch_pd = body_pd.addOrReplaceChild("branch",
			CubeListBuilder.create()
				.texOffs(0, 97).addBox(-4.0F, -31.0F, -5.0F, 8.0F, 30.0F, 1.0F)
				.texOffs(18, 88).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 32.0F, 8.0F)
				.texOffs(50, 97).addBox(-4.0F, -31.0F, 4.0F, 8.0F, 30.0F, 1.0F)
				.texOffs(68, 90).addBox(-5.0F, -31.0F, -4.0F, 1.0F, 30.0F, 8.0F)
				.texOffs(86, 90).addBox(4.0F, -31.0F, -4.0F, 1.0F, 30.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mouse_pd = body_pd.addOrReplaceChild("mouse",
			CubeListBuilder.create()
				.texOffs(0, 90).addBox(-1.5F, -22.5F, -11.5F, 3.0F, 3.0F, 4.0F)
				.texOffs(0, 82).addBox(-2.5F, -22.5F, -12.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(-0.5F))
				.texOffs(20, 78).addBox(-1.5F, -23.5F, -12.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(-0.5F))
				.texOffs(42, 89).addBox(-2.5F, -23.5F, -13.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(54, 83).addBox(-3.5F, -23.5F, -14.002F, 7.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 72).addBox(-2.5F, -24.5F, -14.001F, 5.0F, 7.0F, 3.0F, new CubeDeformation(-0.5F))
				.texOffs(36, 83).addBox(-2.0F, -23.0F, -14.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offset(0.0F, 0.5F, 3.0F));
		PartDefinition hat_pd = body_pd.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(116, 27).addBox(-1.25F, -2.0F, -1.25F, 3.0F, 3.0F, 3.0F)
				.texOffs(98, 32).addBox(-1.25F, -5.0F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.5F)),
			PartPose.offset(-0.25F, -32.75F, -0.5F));
		PartDefinition cube_r1_pd = hat_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(116, 23).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.75F, -4.0F, 0.75F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = hat_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(104, 26).addBox(-2.0F, -1.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.75F, -2.0F, 1.75F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r3_pd = hat_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(102, 29).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.75F, -4.0F, -0.25F, 1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r4_pd = hat_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(93, 31).addBox(-2.0F, -1.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.75F, -2.0F, -1.25F, 1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r5_pd = hat_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(120, 24).addBox(-0.7F, -1.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-1.25F, -4.0F, -0.25F, 0.0F, 0.0F, 0.5672F));
		PartDefinition cube_r6_pd = hat_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(109, 26).addBox(-0.7F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-2.25F, -2.0F, -0.25F, 0.0F, 0.0F, 0.5672F));
		PartDefinition cube_r7_pd = hat_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(108, 30).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.75F, -4.0F, 0.75F, 0.0F, 0.0F, -0.5672F));
		PartDefinition cube_r8_pd = hat_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(88, 34).addBox(-0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(1.75F, -2.0F, -0.25F, 0.0F, 0.0F, -0.5672F));
		PartDefinition small1_pd = hat_pd.addOrReplaceChild("small1",
			CubeListBuilder.create()
				.texOffs(32, 59).addBox(-0.25F, -2.0F, -0.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(18, 67).addBox(-0.25F, -2.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition small2_pd = hat_pd.addOrReplaceChild("small2",
			CubeListBuilder.create()
				.texOffs(37, 59).addBox(-0.75F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(42, 57).addBox(-0.75F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.0F, -4.5F, 0.25F, -0.3927F, -0.4363F, 0.0F));
		PartDefinition small3_pd = hat_pd.addOrReplaceChild("small3",
			CubeListBuilder.create()
				.texOffs(49, 67).addBox(-0.25F, -2.0F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(121, 20).addBox(-0.25F, -2.0F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)),
			PartPose.offsetAndRotation(0.5F, -4.5F, 0.5F, -0.3927F, 0.3927F, 0.0F));
		PartDefinition spikes3_pd = body_pd.addOrReplaceChild("spikes3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone15_pd = spikes3_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(31, 78).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(35, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(3.0F, -29.0F, -3.0F, 0.5236F, 0.0F, 0.7854F));
		PartDefinition bone16_pd = spikes3_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(4, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone17_pd = spikes3_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(8, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(12, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone18_pd = spikes3_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(26, 74).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(16, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone19_pd = spikes3_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(70, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(65, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone20_pd = spikes3_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(57, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(39, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone21_pd = spikes3_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(78, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition blue_spikes3_pd = body_pd.addOrReplaceChild("blue_spikes3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone46_pd = blue_spikes3_pd.addOrReplaceChild("bone46",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(3.0F, -29.0F, -3.0F, 0.5236F, 0.0F, 0.7854F));
		PartDefinition bone47_pd = blue_spikes3_pd.addOrReplaceChild("bone47",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone48_pd = blue_spikes3_pd.addOrReplaceChild("bone48",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone49_pd = blue_spikes3_pd.addOrReplaceChild("bone49",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone50_pd = blue_spikes3_pd.addOrReplaceChild("bone50",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone51_pd = blue_spikes3_pd.addOrReplaceChild("bone51",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone52_pd = blue_spikes3_pd.addOrReplaceChild("bone52",
			CubeListBuilder.create()
				.texOffs(1, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition right_hand_pd = total_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(97, 65).addBox(-9.0F, -2.0F, -3.5F, 9.0F, 4.0F, 6.0F)
				.texOffs(94, 75).addBox(-10.0F, -3.0F, -3.5F, 11.0F, 6.0F, 6.0F, new CubeDeformation(-0.5F))
				.texOffs(104, 108).addBox(-11.0F, -12.0F, -3.5F, 6.0F, 14.0F, 6.0F, new CubeDeformation(-0.6F))
				.texOffs(104, 87).addBox(-11.0F, -13.0F, -3.5F, 6.0F, 15.0F, 6.0F, new CubeDeformation(-1.0F))
				.texOffs(69, 61).addBox(-12.0F, -12.0F, -3.5F, 8.0F, 14.0F, 6.0F, new CubeDeformation(-1.0F)),
			PartPose.offset(-5.0F, -17.0F, 0.0F));
		PartDefinition spikes1_pd = right_hand_pd.addOrReplaceChild("spikes1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = spikes1_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(105, 109).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(105, 89).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-9.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone2_pd = spikes1_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(98, 92).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(98, 88).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -7.0F, 1.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition bone3_pd = spikes1_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(87, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(89, 89).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -8.0F, -1.0F, 0.7854F, 0.0F, 0.5236F));
		PartDefinition bone4_pd = spikes1_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(83, 89).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(78, 90).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -3.0F, -1.0F, 0.0F, 0.0F, -2.0944F));
		PartDefinition bone5_pd = spikes1_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(90, 85).addBox(-4.8301F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(90, 82).addBox(-4.8301F, -4.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, -3.0F, -1.0F, 0.2182F, 0.0F, -2.3998F));
		PartDefinition bone6_pd = spikes1_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(86, 82).addBox(-4.8301F, -6.5F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 86).addBox(-4.8301F, -4.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -3.0F, -1.0F, -0.4363F, 0.0F, -2.6616F));
		PartDefinition bone7_pd = spikes1_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(82, 81).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(78, 87).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -6.0F, 1.0F, -0.7854F, 0.0F, 0.2618F));
		PartDefinition blue_spikes1_pd = right_hand_pd.addOrReplaceChild("blue_spikes1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone53_pd = blue_spikes1_pd.addOrReplaceChild("bone53",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-9.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone54_pd = blue_spikes1_pd.addOrReplaceChild("bone54",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -7.0F, 1.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition bone55_pd = blue_spikes1_pd.addOrReplaceChild("bone55",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -8.0F, -1.0F, 0.7854F, 0.0F, 0.5236F));
		PartDefinition bone56_pd = blue_spikes1_pd.addOrReplaceChild("bone56",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -3.0F, -1.0F, 0.0F, 0.0F, -2.0944F));
		PartDefinition bone57_pd = blue_spikes1_pd.addOrReplaceChild("bone57",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-4.8301F, -5.5F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(1, 59).addBox(-4.8301F, -4.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, -3.0F, -1.0F, 0.2182F, 0.0F, -2.3998F));
		PartDefinition bone58_pd = blue_spikes1_pd.addOrReplaceChild("bone58",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-4.8301F, -6.5F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-4.8301F, -4.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -3.0F, -1.0F, -0.4363F, 0.0F, -2.6616F));
		PartDefinition bone59_pd = blue_spikes1_pd.addOrReplaceChild("bone59",
			CubeListBuilder.create()
				.texOffs(1, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(1, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -6.0F, 1.0F, -0.7854F, 0.0F, 0.2618F));
		PartDefinition left_hand_pd = total_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(39, 70).addBox(-9.0F, -2.0F, -3.5F, 9.0F, 4.0F, 6.0F)
				.texOffs(94, 53).addBox(-10.0F, -3.0F, -3.5F, 11.0F, 6.0F, 6.0F, new CubeDeformation(-0.5F))
				.texOffs(104, 33).addBox(-11.0F, -12.0F, -3.5F, 6.0F, 14.0F, 6.0F, new CubeDeformation(-0.6F))
				.texOffs(75, 38).addBox(-11.0F, -13.0F, -3.5F, 6.0F, 15.0F, 6.0F, new CubeDeformation(-1.0F))
				.texOffs(47, 46).addBox(-12.0F, -12.0F, -3.5F, 8.0F, 14.0F, 6.0F, new CubeDeformation(-1.0F)),
			PartPose.offsetAndRotation(5.0F, -17.0F, -1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition spikes2_pd = left_hand_pd.addOrReplaceChild("spikes2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone8_pd = spikes2_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(39, 70).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(34, 75).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, -10.0F, 1.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone9_pd = spikes2_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(34, 70).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(30, 71).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -8.0F, 0.0F, -0.3927F, 0.0F, -1.0472F));
		PartDefinition bone10_pd = spikes2_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(43, 65).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(38, 67).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -8.0F, -2.0F, 0.7854F, 0.0F, 0.5236F));
		PartDefinition bone11_pd = spikes2_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(26, 69).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(21, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 1.0F, -2.618F, 0.0F, -0.5236F));
		PartDefinition bone12_pd = spikes2_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(64, 69).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(32, 68).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 1.0F, -2.618F, 0.0F, 0.0F));
		PartDefinition bone13_pd = spikes2_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(38, 62).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(33, 64).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, 0.0F, -1.0F, -2.0944F, -1.309F, 0.0F));
		PartDefinition bone14_pd = spikes2_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(29, 64).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(23, 66).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-3.0F, 1.0F, -2.0F, -1.309F, 2.8798F, 0.0F));
		PartDefinition blue_spikes2_pd = left_hand_pd.addOrReplaceChild("blue_spikes2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone60_pd = blue_spikes2_pd.addOrReplaceChild("bone60",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, -10.0F, 1.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone61_pd = blue_spikes2_pd.addOrReplaceChild("bone61",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, -8.0F, 0.0F, -0.3927F, 0.0F, -1.0472F));
		PartDefinition bone62_pd = blue_spikes2_pd.addOrReplaceChild("bone62",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-7.0F, -8.0F, -2.0F, 0.7854F, 0.0F, 0.5236F));
		PartDefinition bone63_pd = blue_spikes2_pd.addOrReplaceChild("bone63",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 1.0F, -2.618F, 0.0F, -0.5236F));
		PartDefinition bone64_pd = blue_spikes2_pd.addOrReplaceChild("bone64",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 1.0F, -2.618F, 0.0F, 0.0F));
		PartDefinition bone65_pd = blue_spikes2_pd.addOrReplaceChild("bone65",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-10.0F, 0.0F, -1.0F, -2.0944F, -1.309F, 0.0F));
		PartDefinition bone66_pd = blue_spikes2_pd.addOrReplaceChild("bone66",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-3.0F, 1.0F, -2.0F, -1.309F, 2.8798F, 0.0F));
		PartDefinition body2_pd = total_pd.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(2, 106).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 10.0F, 8.0F)
				.texOffs(26, 110).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 10.0F, 1.0F)
				.texOffs(24, 107).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 10.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spikes4_pd = body2_pd.addOrReplaceChild("spikes4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone23_pd = spikes4_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(4, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone24_pd = spikes4_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(8, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(12, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone25_pd = spikes4_pd.addOrReplaceChild("bone25",
			CubeListBuilder.create()
				.texOffs(26, 74).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(16, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone26_pd = spikes4_pd.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(70, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(65, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone27_pd = spikes4_pd.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(57, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(39, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone28_pd = spikes4_pd.addOrReplaceChild("bone28",
			CubeListBuilder.create()
				.texOffs(78, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition blue_spikes4_pd = body2_pd.addOrReplaceChild("blue_spikes4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone67_pd = blue_spikes4_pd.addOrReplaceChild("bone67",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone68_pd = blue_spikes4_pd.addOrReplaceChild("bone68",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone69_pd = blue_spikes4_pd.addOrReplaceChild("bone69",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone70_pd = blue_spikes4_pd.addOrReplaceChild("bone70",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone71_pd = blue_spikes4_pd.addOrReplaceChild("bone71",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone72_pd = blue_spikes4_pd.addOrReplaceChild("bone72",
			CubeListBuilder.create()
				.texOffs(2, 60).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 60).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition body3_pd = total_pd.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(2, 106).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 10.0F, 8.0F)
				.texOffs(26, 110).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 10.0F, 1.0F)
				.texOffs(24, 107).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 10.0F, 1.0F),
			PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition spikes5_pd = body3_pd.addOrReplaceChild("spikes5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone22_pd = spikes5_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(4, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone29_pd = spikes5_pd.addOrReplaceChild("bone29",
			CubeListBuilder.create()
				.texOffs(8, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(12, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone30_pd = spikes5_pd.addOrReplaceChild("bone30",
			CubeListBuilder.create()
				.texOffs(26, 74).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(16, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone31_pd = spikes5_pd.addOrReplaceChild("bone31",
			CubeListBuilder.create()
				.texOffs(70, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(65, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone32_pd = spikes5_pd.addOrReplaceChild("bone32",
			CubeListBuilder.create()
				.texOffs(57, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(39, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone33_pd = spikes5_pd.addOrReplaceChild("bone33",
			CubeListBuilder.create()
				.texOffs(78, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition blue_spikes5_pd = body3_pd.addOrReplaceChild("blue_spikes5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone73_pd = blue_spikes5_pd.addOrReplaceChild("bone73",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone74_pd = blue_spikes5_pd.addOrReplaceChild("bone74",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone75_pd = blue_spikes5_pd.addOrReplaceChild("bone75",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone76_pd = blue_spikes5_pd.addOrReplaceChild("bone76",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone77_pd = blue_spikes5_pd.addOrReplaceChild("bone77",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone78_pd = blue_spikes5_pd.addOrReplaceChild("bone78",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition body4_pd = total_pd.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(2, 106).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 10.0F, 8.0F)
				.texOffs(26, 110).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 10.0F, 1.0F)
				.texOffs(24, 107).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 10.0F, 1.0F),
			PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition spikes6_pd = body4_pd.addOrReplaceChild("spikes6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition bone34_pd = spikes6_pd.addOrReplaceChild("bone34",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(4, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone35_pd = spikes6_pd.addOrReplaceChild("bone35",
			CubeListBuilder.create()
				.texOffs(8, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(12, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone36_pd = spikes6_pd.addOrReplaceChild("bone36",
			CubeListBuilder.create()
				.texOffs(26, 74).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(16, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone37_pd = spikes6_pd.addOrReplaceChild("bone37",
			CubeListBuilder.create()
				.texOffs(70, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(65, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone38_pd = spikes6_pd.addOrReplaceChild("bone38",
			CubeListBuilder.create()
				.texOffs(57, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(39, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone39_pd = spikes6_pd.addOrReplaceChild("bone39",
			CubeListBuilder.create()
				.texOffs(78, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition blue_spikes6_pd = body4_pd.addOrReplaceChild("blue_spikes6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition bone79_pd = blue_spikes6_pd.addOrReplaceChild("bone79",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone80_pd = blue_spikes6_pd.addOrReplaceChild("bone80",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone81_pd = blue_spikes6_pd.addOrReplaceChild("bone81",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone82_pd = blue_spikes6_pd.addOrReplaceChild("bone82",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone83_pd = blue_spikes6_pd.addOrReplaceChild("bone83",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone84_pd = blue_spikes6_pd.addOrReplaceChild("bone84",
			CubeListBuilder.create()
				.texOffs(2, 58).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 58).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition body5_pd = total_pd.addOrReplaceChild("body5",
			CubeListBuilder.create()
				.texOffs(2, 106).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 10.0F, 8.0F)
				.texOffs(26, 110).addBox(-4.0F, -1.0F, -5.0F, 8.0F, 10.0F, 1.0F)
				.texOffs(24, 107).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 10.0F, 1.0F),
			PartPose.offset(0.0F, 30.0F, 0.0F));
		PartDefinition spikes7_pd = body5_pd.addOrReplaceChild("spikes7",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone40_pd = spikes7_pd.addOrReplaceChild("bone40",
			CubeListBuilder.create()
				.texOffs(0, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(4, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone41_pd = spikes7_pd.addOrReplaceChild("bone41",
			CubeListBuilder.create()
				.texOffs(8, 67).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(12, 69).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone42_pd = spikes7_pd.addOrReplaceChild("bone42",
			CubeListBuilder.create()
				.texOffs(26, 74).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(16, 70).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone43_pd = spikes7_pd.addOrReplaceChild("bone43",
			CubeListBuilder.create()
				.texOffs(70, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(65, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone44_pd = spikes7_pd.addOrReplaceChild("bone44",
			CubeListBuilder.create()
				.texOffs(57, 91).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(39, 80).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone45_pd = spikes7_pd.addOrReplaceChild("bone45",
			CubeListBuilder.create()
				.texOffs(78, 93).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(82, 95).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		PartDefinition blue_spikes7_pd = body5_pd.addOrReplaceChild("blue_spikes7",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.0F, -0.5672F, 0.0F));
		PartDefinition bone85_pd = blue_spikes7_pd.addOrReplaceChild("bone85",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(2.0F, -3.0F, -3.0F, 0.7854F, 0.0F, 1.0472F));
		PartDefinition bone86_pd = blue_spikes7_pd.addOrReplaceChild("bone86",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -0.2182F, 0.0F, 1.309F));
		PartDefinition bone87_pd = blue_spikes7_pd.addOrReplaceChild("bone87",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 2.1817F, -0.5236F, 1.309F));
		PartDefinition bone88_pd = blue_spikes7_pd.addOrReplaceChild("bone88",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -23.0F, 4.0F, -1.309F, 0.0F, 0.2618F));
		PartDefinition bone89_pd = blue_spikes7_pd.addOrReplaceChild("bone89",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, -10.0F, 4.0F, -1.309F, 0.0F, -2.3126F));
		PartDefinition bone90_pd = blue_spikes7_pd.addOrReplaceChild("bone90",
			CubeListBuilder.create()
				.texOffs(2, 59).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F)
				.texOffs(2, 59).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 3.0107F, -0.5236F, 1.309F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(CactusEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final float height = entity.getCactusHeight();
		final boolean powered = entity.isCactusPowered();
		//body
		this.body2.visible = height > 0;
		this.body3.visible = height > CactusEntity.SEGMENT_HEIGHT;
		this.body4.visible = height > 2 * CactusEntity.SEGMENT_HEIGHT;
		this.body5.visible = height > 3 * CactusEntity.SEGMENT_HEIGHT;
		//spikes
		this.spikes1.visible = ! powered;
		this.blue_spikes1.visible = powered;
		this.spikes2.visible = ! powered;
		this.blue_spikes2.visible = powered;
		this.spikes3.visible = ! powered;
		this.blue_spikes3.visible = powered;
		if(this.body2.visible) {
			this.spikes4.visible = ! powered;
			this.blue_spikes4.visible = powered;
		}
		if(this.body3.visible) {
			this.spikes5.visible = ! powered;
			this.blue_spikes5.visible = powered;
		}
		if(this.body4.visible) {
			this.spikes6.visible = ! powered;
			this.blue_spikes6.visible = powered;
		}
		if(this.body5.visible) {
			this.spikes7.visible = ! powered;
			this.blue_spikes7.visible = powered;
		}
//		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}
	
	@Override
	public Optional<ModelPart> getBodyModel() {
		return Optional.ofNullable(this.total);
	}
	
	@Override
	public float getMaxRotAngle() {
		return 10F;
	}
	
}