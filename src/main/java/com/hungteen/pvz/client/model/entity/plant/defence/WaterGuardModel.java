package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.WaterGuardEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class WaterGuardModel extends PVZPlantModel<WaterGuardEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "water_guard"), "main");
	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart head;
	private final ModelPart cube_r3;
	private final ModelPart petal;
	private final ModelPart petal2;
	private final ModelPart petal3;
	private final ModelPart petal4;
	private final ModelPart petal5;
	private final ModelPart petal6;
	private final ModelPart petal7;
	private final ModelPart petal8;
	private final ModelPart petal9;
	private final ModelPart petal10;
	private final ModelPart petal25;
	private final ModelPart petal26;
	private final ModelPart petal27;
	private final ModelPart petal28;
	private final ModelPart petal29;
	private final ModelPart petal30;
	private final ModelPart petal39;
	private final ModelPart petal40;
	private final ModelPart petal31;
	private final ModelPart petal32;
	private final ModelPart petal33;
	private final ModelPart petal34;
	private final ModelPart petal35;
	private final ModelPart petal36;
	private final ModelPart petal37;
	private final ModelPart petal38;
	private final ModelPart petal19;
	private final ModelPart petal20;
	private final ModelPart petal23;
	private final ModelPart petal24;
	private final ModelPart petal21;
	private final ModelPart petal22;
	private final ModelPart petal13;
	private final ModelPart petal14;
	private final ModelPart petal17;
	private final ModelPart petal18;
	private final ModelPart petal15;
	private final ModelPart petal16;
	private final ModelPart petal11;
	private final ModelPart petal12;
	private final ModelPart eyes;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart leaves;
	private final ModelPart leaf1;
	private final ModelPart leaf2;
	private final ModelPart leaf3;
	private final ModelPart leaf4;
	private final ModelPart cube_r4;


	public WaterGuardModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.cube_r1 = this.body.getChild("cube_r1");
		this.cube_r2 = this.body.getChild("cube_r2");
		this.head = this.body.getChild("head");
		this.cube_r3 = this.head.getChild("cube_r3");
		this.petal = this.head.getChild("petal");
		this.petal2 = this.petal.getChild("petal2");
		this.petal3 = this.head.getChild("petal3");
		this.petal4 = this.petal3.getChild("petal4");
		this.petal5 = this.head.getChild("petal5");
		this.petal6 = this.petal5.getChild("petal6");
		this.petal7 = this.head.getChild("petal7");
		this.petal8 = this.petal7.getChild("petal8");
		this.petal9 = this.head.getChild("petal9");
		this.petal10 = this.petal9.getChild("petal10");
		this.petal25 = this.head.getChild("petal25");
		this.petal26 = this.petal25.getChild("petal26");
		this.petal27 = this.head.getChild("petal27");
		this.petal28 = this.petal27.getChild("petal28");
		this.petal29 = this.head.getChild("petal29");
		this.petal30 = this.petal29.getChild("petal30");
		this.petal39 = this.head.getChild("petal39");
		this.petal40 = this.petal39.getChild("petal40");
		this.petal31 = this.head.getChild("petal31");
		this.petal32 = this.petal31.getChild("petal32");
		this.petal33 = this.head.getChild("petal33");
		this.petal34 = this.petal33.getChild("petal34");
		this.petal35 = this.head.getChild("petal35");
		this.petal36 = this.petal35.getChild("petal36");
		this.petal37 = this.head.getChild("petal37");
		this.petal38 = this.petal37.getChild("petal38");
		this.petal19 = this.head.getChild("petal19");
		this.petal20 = this.petal19.getChild("petal20");
		this.petal23 = this.head.getChild("petal23");
		this.petal24 = this.petal23.getChild("petal24");
		this.petal21 = this.head.getChild("petal21");
		this.petal22 = this.petal21.getChild("petal22");
		this.petal13 = this.head.getChild("petal13");
		this.petal14 = this.petal13.getChild("petal14");
		this.petal17 = this.head.getChild("petal17");
		this.petal18 = this.petal17.getChild("petal18");
		this.petal15 = this.head.getChild("petal15");
		this.petal16 = this.petal15.getChild("petal16");
		this.petal11 = this.head.getChild("petal11");
		this.petal12 = this.petal11.getChild("petal12");
		this.eyes = this.head.getChild("eyes");
		this.eye = this.eyes.getChild("eye");
		this.eye2 = this.eyes.getChild("eye2");
		this.leaves = this.total.getChild("leaves");
		this.leaf1 = this.leaves.getChild("leaf1");
		this.leaf2 = this.leaves.getChild("leaf2");
		this.leaf3 = this.leaves.getChild("leaf3");
		this.leaf4 = this.leaves.getChild("leaf4");
		this.cube_r4 = this.leaf4.getChild("cube_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(16, 33).addBox(-1.5F, -7.5F, -1.5F, 3.0F, 18.0F, 3.0F)
				.texOffs(12, 49).addBox(-2.5F, -7.5F, 1.5F, 1.0F, 18.0F, 1.0F)
				.texOffs(8, 49).addBox(-2.5F, -7.5F, -2.5F, 1.0F, 18.0F, 1.0F)
				.texOffs(4, 49).addBox(1.5F, -7.5F, -2.5F, 1.0F, 18.0F, 1.0F)
				.texOffs(0, 49).addBox(1.5F, -7.5F, 1.5F, 1.0F, 18.0F, 1.0F),
			PartPose.offset(0.0F, -6.5F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(28, 34).addBox(0.0F, -8.5F, -1.5F, 1.0F, 21.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 18.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(28, 34).addBox(0.0F, -8.5F, -1.5F, 1.0F, 21.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, 18.5F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(36, 34).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 2.0F, 5.0F)
				.texOffs(36, 41).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 5.0F, 4.0F),
			PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(32, 18).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 2.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition petal = head.addOrReplaceChild("petal",
			CubeListBuilder.create()
				.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.4326F, -0.678F, -0.6346F));
		PartDefinition petal2 = petal.addOrReplaceChild("petal2",
			CubeListBuilder.create()
				.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition petal3 = head.addOrReplaceChild("petal3",
			CubeListBuilder.create()
				.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 2.709F, -0.678F, -2.507F));
		PartDefinition petal4 = petal3.addOrReplaceChild("petal4",
			CubeListBuilder.create()
				.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition petal5 = head.addOrReplaceChild("petal5",
			CubeListBuilder.create()
				.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -2.709F, 0.678F, -2.507F));
		PartDefinition petal6 = petal5.addOrReplaceChild("petal6",
			CubeListBuilder.create()
				.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition petal7 = head.addOrReplaceChild("petal7",
			CubeListBuilder.create()
				.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.4326F, 0.678F, -0.6346F));
		PartDefinition petal8 = petal7.addOrReplaceChild("petal8",
			CubeListBuilder.create()
				.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition petal9 = head.addOrReplaceChild("petal9",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition petal10 = petal9.addOrReplaceChild("petal10",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal25 = head.addOrReplaceChild("petal25",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.0361F, -0.3911F, 0.0944F));
		PartDefinition petal26 = petal25.addOrReplaceChild("petal26",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal27 = head.addOrReplaceChild("petal27",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.5607F, -1.1418F, 0.6601F));
		PartDefinition petal28 = petal27.addOrReplaceChild("petal28",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal29 = head.addOrReplaceChild("petal29",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -2.8245F, -0.7798F, 2.7049F));
		PartDefinition petal30 = petal29.addOrReplaceChild("petal30",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal39 = head.addOrReplaceChild("petal39",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, -0.2954F, -0.6105F, 0.3624F));
		PartDefinition petal40 = petal39.addOrReplaceChild("petal40",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal31 = head.addOrReplaceChild("petal31",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 3.1301F, 0.1304F, 3.0536F));
		PartDefinition petal32 = petal31.addOrReplaceChild("petal32",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal33 = head.addOrReplaceChild("petal33",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.25F, -0.75F, 2.6802F, 1.029F, 2.6158F));
		PartDefinition petal34 = petal33.addOrReplaceChild("petal34",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal35 = head.addOrReplaceChild("petal35",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.1659F, 1.0836F, 0.1873F));
		PartDefinition petal36 = petal35.addOrReplaceChild("petal36",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal37 = head.addOrReplaceChild("petal37",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.1318F, 0.5034F, 0.3473F));
		PartDefinition petal38 = petal37.addOrReplaceChild("petal38",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.4835F));
		PartDefinition petal19 = head.addOrReplaceChild("petal19",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition petal20 = petal19.addOrReplaceChild("petal20",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal23 = head.addOrReplaceChild("petal23",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.098F, 0.7844F, -3.0799F));
		PartDefinition petal24 = petal23.addOrReplaceChild("petal24",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal21 = head.addOrReplaceChild("petal21",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.7844F, -0.0617F));
		PartDefinition petal22 = petal21.addOrReplaceChild("petal22",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal13 = head.addOrReplaceChild("petal13",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.25F, 0.0F, -1.5708F, 0.0F));
		PartDefinition petal14 = petal13.addOrReplaceChild("petal14",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal17 = head.addOrReplaceChild("petal17",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition petal18 = petal17.addOrReplaceChild("petal18",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal15 = head.addOrReplaceChild("petal15",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.25F, 3.098F, -0.7844F, -3.0799F));
		PartDefinition petal16 = petal15.addOrReplaceChild("petal16",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition petal11 = head.addOrReplaceChild("petal11",
			CubeListBuilder.create()
				.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(1.25F, 0.0F, 0.75F, 0.0436F, -0.7844F, -0.0617F));
		PartDefinition petal12 = petal11.addOrReplaceChild("petal12",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.3526F));
		PartDefinition eyes = head.addOrReplaceChild("eyes",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition eye = eyes.addOrReplaceChild("eye",
			CubeListBuilder.create()
				.texOffs(46, 26).addBox(-3.5F, -2.0F, -0.5F, 7.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(-4.4136F, -4.2519F, -7.0F, 0.023F, 0.173F, 0.3947F));
		PartDefinition eye2 = eyes.addOrReplaceChild("eye2",
			CubeListBuilder.create()
				.texOffs(46, 26).mirror().addBox(-3.5F, -2.0F, -0.5F, 7.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(4.4136F, -4.2519F, -7.0F, 0.023F, -0.173F, -0.3947F));
		PartDefinition leaves = total.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaf1 = leaves.addOrReplaceChild("leaf1",
			CubeListBuilder.create()
				.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F)
				.texOffs(0, 17).addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F)
				.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F),
			PartPose.offset(0.0F, 3.0F, -1.0F));
		PartDefinition leaf2 = leaves.addOrReplaceChild("leaf2",
			CubeListBuilder.create()
				.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F)
				.texOffs(0, 17).addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F)
				.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F),
			PartPose.offsetAndRotation(-1.0F, 3.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition leaf3 = leaves.addOrReplaceChild("leaf3",
			CubeListBuilder.create()
				.texOffs(0, 25).mirror().addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F)
				.texOffs(0, 17).mirror().addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F)
				.texOffs(0, 0).mirror().addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F),
			PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition leaf4 = leaves.addOrReplaceChild("leaf4",
			CubeListBuilder.create()
				.texOffs(0, 25).mirror().addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F)
				.texOffs(0, 0).mirror().addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r4 = leaf4.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 17).mirror().addBox(-7.0F, -15.0F, 7.0F, 14.0F, 14.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, -0.016F, -0.0013F, -0.0406F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(WaterGuardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leaves.yRot = ageInTicks / 5;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<WaterGuardEntity> getPlantModel() {
		return this;
	}
}