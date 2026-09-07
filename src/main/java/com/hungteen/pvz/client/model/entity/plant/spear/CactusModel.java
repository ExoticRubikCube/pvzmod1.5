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
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "cactus"), "main");
	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart branch;
	private final ModelPart blue_eyes;
	private final ModelPart mouse;
	private final ModelPart hat;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart hat2;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart spikes3;
	private final ModelPart blue_spikes3;
	private final ModelPart right_hand;
	private final ModelPart right_hand_r1;
	private final ModelPart spikes1;
	private final ModelPart right_hand_r2;
	private final ModelPart right_hand_r3;
	private final ModelPart right_hand_r4;
	private final ModelPart blue_spikes1;
	private final ModelPart right_hand_r5;
	private final ModelPart right_hand_r6;
	private final ModelPart right_hand_r7;
	private final ModelPart right_hand_r8;
	private final ModelPart left_hand;
	private final ModelPart left_hand_r1;
	private final ModelPart spikes2;
	private final ModelPart left_hand_r2;
	private final ModelPart left_hand_r3;
	private final ModelPart left_hand_r4;
	private final ModelPart blue_spikes2;
	private final ModelPart left_hand_r5;
	private final ModelPart left_hand_r6;
	private final ModelPart left_hand_r7;
	private final ModelPart left_hand_r8;
	private final ModelPart body2;
	private final ModelPart spikes4;
	private final ModelPart blue_spikes4;
	private final ModelPart body3;
	private final ModelPart spikes5;
	private final ModelPart blue_spikes5;
	private final ModelPart body4;
	private final ModelPart spikes6;
	private final ModelPart blue_spikes6;
	private final ModelPart body5;
	private final ModelPart spikes7;
	private final ModelPart blue_spikes7;


	public CactusModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.branch = this.body.getChild("branch");
		this.blue_eyes = this.branch.getChild("blue_eyes");
		this.mouse = this.body.getChild("mouse");
		this.hat = this.body.getChild("hat");
		this.cube_r1 = this.hat.getChild("cube_r1");
		this.cube_r2 = this.hat.getChild("cube_r2");
		this.cube_r3 = this.hat.getChild("cube_r3");
		this.cube_r4 = this.hat.getChild("cube_r4");
		this.cube_r5 = this.hat.getChild("cube_r5");
		this.cube_r6 = this.hat.getChild("cube_r6");
		this.cube_r7 = this.hat.getChild("cube_r7");
		this.hat2 = this.hat.getChild("hat2");
		this.cube_r8 = this.hat2.getChild("cube_r8");
		this.cube_r9 = this.hat2.getChild("cube_r9");
		this.cube_r10 = this.hat2.getChild("cube_r10");
		this.cube_r11 = this.hat2.getChild("cube_r11");
		this.cube_r12 = this.hat2.getChild("cube_r12");
		this.cube_r13 = this.hat2.getChild("cube_r13");
		this.bone = this.hat2.getChild("bone");
		this.bone3 = this.hat2.getChild("bone3");
		this.bone2 = this.hat2.getChild("bone2");
		this.spikes3 = this.body.getChild("spikes3");
		this.blue_spikes3 = this.body.getChild("blue_spikes3");
		this.right_hand = this.total.getChild("right_hand");
		this.right_hand_r1 = this.right_hand.getChild("right_hand_r1");
		this.spikes1 = this.right_hand.getChild("spikes1");
		this.right_hand_r2 = this.spikes1.getChild("right_hand_r2");
		this.right_hand_r3 = this.spikes1.getChild("right_hand_r3");
		this.right_hand_r4 = this.spikes1.getChild("right_hand_r4");
		this.blue_spikes1 = this.right_hand.getChild("blue_spikes1");
		this.right_hand_r5 = this.blue_spikes1.getChild("right_hand_r5");
		this.right_hand_r6 = this.blue_spikes1.getChild("right_hand_r6");
		this.right_hand_r7 = this.blue_spikes1.getChild("right_hand_r7");
		this.right_hand_r8 = this.blue_spikes1.getChild("right_hand_r8");
		this.left_hand = this.total.getChild("left_hand");
		this.left_hand_r1 = this.left_hand.getChild("left_hand_r1");
		this.spikes2 = this.left_hand.getChild("spikes2");
		this.left_hand_r2 = this.spikes2.getChild("left_hand_r2");
		this.left_hand_r3 = this.spikes2.getChild("left_hand_r3");
		this.left_hand_r4 = this.spikes2.getChild("left_hand_r4");
		this.blue_spikes2 = this.left_hand.getChild("blue_spikes2");
		this.left_hand_r5 = this.blue_spikes2.getChild("left_hand_r5");
		this.left_hand_r6 = this.blue_spikes2.getChild("left_hand_r6");
		this.left_hand_r7 = this.blue_spikes2.getChild("left_hand_r7");
		this.left_hand_r8 = this.blue_spikes2.getChild("left_hand_r8");
		this.body2 = this.total.getChild("body2");
		this.spikes4 = this.body2.getChild("spikes4");
		this.blue_spikes4 = this.body2.getChild("blue_spikes4");
		this.body3 = this.total.getChild("body3");
		this.spikes5 = this.body3.getChild("spikes5");
		this.blue_spikes5 = this.body3.getChild("blue_spikes5");
		this.body4 = this.total.getChild("body4");
		this.spikes6 = this.body4.getChild("spikes6");
		this.blue_spikes6 = this.body4.getChild("blue_spikes6");
		this.body5 = this.total.getChild("body5");
		this.spikes7 = this.body5.getChild("spikes7");
		this.blue_spikes7 = this.body5.getChild("blue_spikes7");
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
		PartDefinition branch = body.addOrReplaceChild("branch",
			CubeListBuilder.create()
				.texOffs(0, 64).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F)
				.texOffs(52, 23).addBox(-6.5F, -29.75F, -6.5F, 13.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition blue_eyes = branch.addOrReplaceChild("blue_eyes",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-4.0F, -28.0F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(39, 0).mirror().addBox(3.0F, -28.0F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)),
			PartPose.offset(-0.5F, 0.0F, 0.0F));
		PartDefinition mouse = body.addOrReplaceChild("mouse",
			CubeListBuilder.create()
				.texOffs(78, 33).addBox(-2.5F, -24.5F, -12.5F, 5.0F, 5.0F, 4.0F)
				.texOffs(91, 0).addBox(-3.0F, -25.0F, -13.5F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offset(0.0F, -0.5F, 3.0F));
		PartDefinition hat = body.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(0, 5).addBox(-1.25F, -0.5F, -1.0F, 3.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(-0.25F, -31.75F, -0.5F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.2618F, -0.8727F, 0.0F));
		PartDefinition cube_r2 = hat.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.8798F, -1.4399F, -3.1416F));
		PartDefinition cube_r3 = hat.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.8798F, -0.4363F, 3.1416F));
		PartDefinition cube_r4 = hat.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.8798F, 0.5236F, 3.1416F));
		PartDefinition cube_r5 = hat.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.8798F, 1.4399F, 3.1416F));
		PartDefinition cube_r6 = hat.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.2618F, 0.8727F, 0.0F));
		PartDefinition cube_r7 = hat.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.2618F, 0.0F, 0.0F));
		PartDefinition hat2 = hat.addOrReplaceChild("hat2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.25F, -0.5F, -1.0F, 3.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition cube_r8 = hat2.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.5744F, -1.5272F, 3.1415F));
		PartDefinition cube_r9 = hat2.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.5744F, -0.5236F, 3.1416F));
		PartDefinition cube_r10 = hat2.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, 2.5744F, 0.7418F, 3.1416F));
		PartDefinition cube_r11 = hat2.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.5672F, 1.1781F, 0.0F));
		PartDefinition cube_r12 = hat2.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.5672F, -0.6545F, 0.0F));
		PartDefinition cube_r13 = hat2.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.25F, 0.0F, 0.5F, -0.5672F, 0.2618F, 0.0F));
		PartDefinition bone = hat2.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(0, 45).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F)
				.texOffs(9, 0).addBox(-1.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.75F, 0.0F, 0.75F, 0.049F, 0.5865F, -0.347F));
		PartDefinition bone3 = hat2.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 45).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F)
				.texOffs(9, 0).addBox(-1.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.75F, 0.0F, 0.75F, -3.0272F, -0.0041F, -2.8545F));
		PartDefinition bone2 = hat2.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(0, 45).mirror().addBox(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F)
				.texOffs(9, 0).mirror().addBox(0.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.75F, 0.5721F, -0.323F, 0.1579F));
		PartDefinition spikes3 = body.addOrReplaceChild("spikes3",
			CubeListBuilder.create()
				.texOffs(39, 32).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F, new CubeDeformation(0.3F))
				.texOffs(8, 121).addBox(6.775F, -32.0F, -7.8F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(0, 121).addBox(6.775F, -32.0F, 6.8F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(72, 112).addBox(-7.775F, -32.0F, 6.8F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(4, 121).addBox(-7.775F, -32.0F, -7.8F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition blue_spikes3 = body.addOrReplaceChild("blue_spikes3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F, new CubeDeformation(0.31F))
				.texOffs(68, 112).addBox(7.12F, -32.0F, -8.12F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(64, 112).addBox(7.12F, -32.0F, 7.12F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(60, 112).addBox(-8.12F, -32.0F, 7.12F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(56, 112).addBox(-8.12F, -32.0F, -8.12F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_hand = total.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(0, 109).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F),
			PartPose.offset(-5.0F, -17.0F, 0.0F));
		PartDefinition right_hand_r1 = right_hand.addOrReplaceChild("right_hand_r1",
			CubeListBuilder.create()
				.texOffs(102, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(-10.01F, 4.01F, -3.51F, 0.0F, 0.0F, -0.1745F));
		PartDefinition spikes1 = right_hand.addOrReplaceChild("spikes1",
			CubeListBuilder.create()
				.texOffs(52, 100).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.3F))
				.texOffs(16, 57).addBox(-10.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 30).addBox(-10.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 28).addBox(-10.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_hand_r2 = spikes1.addOrReplaceChild("right_hand_r2",
			CubeListBuilder.create()
				.texOffs(24, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(28, 121).addBox(0.01F, -13.01F, 7.81F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(-3.7072F, 2.8987F, -4.91F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_hand_r3 = spikes1.addOrReplaceChild("right_hand_r3",
			CubeListBuilder.create()
				.texOffs(126, 109).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(-11.3887F, 4.2531F, 2.89F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_hand_r4 = spikes1.addOrReplaceChild("right_hand_r4",
			CubeListBuilder.create()
				.texOffs(78, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(-10.01F, 4.01F, -3.51F, 0.0F, 0.0F, -0.1745F));
		PartDefinition blue_spikes1 = right_hand.addOrReplaceChild("blue_spikes1",
			CubeListBuilder.create()
				.texOffs(0, 45).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.31F))
				.texOffs(52, 26).addBox(-10.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(39, 11).addBox(-10.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(39, 9).addBox(-10.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_hand_r5 = blue_spikes1.addOrReplaceChild("right_hand_r5",
			CubeListBuilder.create()
				.texOffs(12, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(-3.6875F, 2.8952F, -4.93F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_hand_r6 = blue_spikes1.addOrReplaceChild("right_hand_r6",
			CubeListBuilder.create()
				.texOffs(16, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(-3.7072F, 2.8987F, 2.89F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_hand_r7 = blue_spikes1.addOrReplaceChild("right_hand_r7",
			CubeListBuilder.create()
				.texOffs(20, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(-11.4084F, 4.2566F, 2.91F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_hand_r8 = blue_spikes1.addOrReplaceChild("right_hand_r8",
			CubeListBuilder.create()
				.texOffs(32, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(-10.01F, 4.01F, -3.51F, 0.0F, 0.0F, -0.1745F));
		PartDefinition left_hand = total.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(0, 109).mirror().addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F),
			PartPose.offset(5.0F, -17.0F, 0.0F));
		PartDefinition left_hand_r1 = left_hand.addOrReplaceChild("left_hand_r1",
			CubeListBuilder.create()
				.texOffs(102, 109).mirror().addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(10.01F, 4.01F, -3.51F, 0.0F, 0.0F, 0.1745F));
		PartDefinition spikes2 = left_hand.addOrReplaceChild("spikes2",
			CubeListBuilder.create()
				.texOffs(52, 100).mirror().addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.3F))
				.texOffs(16, 57).mirror().addBox(0.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 30).mirror().addBox(0.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 28).mirror().addBox(0.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_r2 = spikes2.addOrReplaceChild("left_hand_r2",
			CubeListBuilder.create()
				.texOffs(24, 121).mirror().addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(28, 121).mirror().addBox(-1.01F, -13.01F, 7.81F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(3.7072F, 2.8987F, -4.91F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_hand_r3 = spikes2.addOrReplaceChild("left_hand_r3",
			CubeListBuilder.create()
				.texOffs(126, 109).mirror().addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(11.3887F, 4.2531F, 2.89F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_hand_r4 = spikes2.addOrReplaceChild("left_hand_r4",
			CubeListBuilder.create()
				.texOffs(78, 109).mirror().addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(10.01F, 4.01F, -3.51F, 0.0F, 0.0F, 0.1745F));
		PartDefinition blue_spikes2 = left_hand.addOrReplaceChild("blue_spikes2",
			CubeListBuilder.create()
				.texOffs(0, 45).mirror().addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.31F))
				.texOffs(52, 26).mirror().addBox(0.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(39, 11).mirror().addBox(0.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(39, 9).mirror().addBox(0.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_r5 = blue_spikes2.addOrReplaceChild("left_hand_r5",
			CubeListBuilder.create()
				.texOffs(12, 121).mirror().addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(3.6875F, 2.8952F, -4.93F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_hand_r6 = blue_spikes2.addOrReplaceChild("left_hand_r6",
			CubeListBuilder.create()
				.texOffs(16, 121).mirror().addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(3.7072F, 2.8987F, 2.89F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_hand_r7 = blue_spikes2.addOrReplaceChild("left_hand_r7",
			CubeListBuilder.create()
				.texOffs(20, 121).mirror().addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(11.4084F, 4.2566F, 2.91F, 0.0F, 0.0F, 0.1745F));
		PartDefinition left_hand_r8 = blue_spikes2.addOrReplaceChild("left_hand_r8",
			CubeListBuilder.create()
				.texOffs(32, 109).mirror().addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.21F)),
			PartPose.offsetAndRotation(10.01F, 4.01F, -3.51F, 0.0F, 0.0F, 0.1745F));
		PartDefinition body2 = total.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(91, 87).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 9.0F, 13.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spikes4 = body2.addOrReplaceChild("spikes4",
			CubeListBuilder.create()
				.texOffs(91, 55).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 9.0F, 13.0F, new CubeDeformation(0.3F))
				.texOffs(99, 55).addBox(-8.1F, -11.0F, -8.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(96, 33).addBox(7.1F, -11.0F, -8.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(95, 77).addBox(7.1F, -11.0F, 7.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(95, 55).addBox(-8.1F, -11.0F, 7.1F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition blue_spikes4 = body2.addOrReplaceChild("blue_spikes4",
			CubeListBuilder.create()
				.texOffs(91, 33).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 9.0F, 13.0F, new CubeDeformation(0.31F))
				.texOffs(91, 77).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(91, 55).addBox(7.12F, -11.0F, -8.12F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(86, 23).addBox(7.12F, -11.0F, 7.12F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(82, 23).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition body3 = total.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F),
			PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition spikes5 = body3.addOrReplaceChild("spikes5",
			CubeListBuilder.create()
				.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.3F))
				.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition blue_spikes5 = body3.addOrReplaceChild("blue_spikes5",
			CubeListBuilder.create()
				.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.31F))
				.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition body4 = total.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F),
			PartPose.offset(0.0F, 19.0F, 0.0F));
		PartDefinition spikes6 = body4.addOrReplaceChild("spikes6",
			CubeListBuilder.create()
				.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.3F))
				.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition blue_spikes6 = body4.addOrReplaceChild("blue_spikes6",
			CubeListBuilder.create()
				.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.31F))
				.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition body5 = total.addOrReplaceChild("body5",
			CubeListBuilder.create()
				.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F),
			PartPose.offset(0.0F, 29.0F, 0.0F));
		PartDefinition spikes7 = body5.addOrReplaceChild("spikes7",
			CubeListBuilder.create()
				.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.3F))
				.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition blue_spikes7 = body5.addOrReplaceChild("blue_spikes7",
			CubeListBuilder.create()
				.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, new CubeDeformation(0.31F))
				.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F))
				.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.31F)),
			PartPose.offset(0.0F, 11.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
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
		this.blue_eyes.visible = powered;
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