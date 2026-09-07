package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.MariGoldEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class MariGoldModel<T extends MariGoldEntity> extends PVZPlantModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "marigold"), "main");
	private final ModelPart total;
	private final ModelPart leaves;
	private final ModelPart YEZI_2;
	private final ModelPart YEZI_3;
	private final ModelPart YEZI_1;
	private final ModelPart YEZI_4;
	private final ModelPart body;
	private final ModelPart stickd_r1;
	private final ModelPart head;
	private final ModelPart head_r1;
	private final ModelPart head_r2;
	private final ModelPart petals;
	private final ModelPart petal12;
	private final ModelPart petal2;
	private final ModelPart petal3;
	private final ModelPart petal4;
	private final ModelPart petal5;
	private final ModelPart petal6;
	private final ModelPart petal7;
	private final ModelPart petal8;
	private final ModelPart petal10;
	private final ModelPart petal9;
	private final ModelPart petal11;


	public MariGoldModel(ModelPart root) {
		this.total = root.getChild("total");
		this.leaves = this.total.getChild("leaves");
		this.YEZI_2 = this.leaves.getChild("YEZI_2");
		this.YEZI_3 = this.leaves.getChild("YEZI_3");
		this.YEZI_1 = this.leaves.getChild("YEZI_1");
		this.YEZI_4 = this.leaves.getChild("YEZI_4");
		this.body = this.total.getChild("body");
		this.stickd_r1 = this.body.getChild("stickd_r1");
		this.head = this.body.getChild("head");
		this.head_r1 = this.head.getChild("head_r1");
		this.head_r2 = this.head.getChild("head_r2");
		this.petals = this.head.getChild("petals");
		this.petal12 = this.petals.getChild("petal12");
		this.petal2 = this.petals.getChild("petal2");
		this.petal3 = this.petals.getChild("petal3");
		this.petal4 = this.petals.getChild("petal4");
		this.petal5 = this.petals.getChild("petal5");
		this.petal6 = this.petals.getChild("petal6");
		this.petal7 = this.petals.getChild("petal7");
		this.petal8 = this.petals.getChild("petal8");
		this.petal10 = this.petals.getChild("petal10");
		this.petal9 = this.petals.getChild("petal9");
		this.petal11 = this.petals.getChild("petal11");
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
		PartDefinition YEZI_2 = leaves.addOrReplaceChild("YEZI_2",
			CubeListBuilder.create()
				.texOffs(18, 6).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition YEZI_3 = leaves.addOrReplaceChild("YEZI_3",
			CubeListBuilder.create()
				.texOffs(14, 16).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition YEZI_1 = leaves.addOrReplaceChild("YEZI_1",
			CubeListBuilder.create()
				.texOffs(20, 23).addBox(1.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition YEZI_4 = leaves.addOrReplaceChild("YEZI_4",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-7.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(8, 28).addBox(-1.0F, -13.5939F, 0.7078F, 2.0F, 6.0F, 2.0F),
			PartPose.offset(-8.0F, 0.0F, 7.0F));
		PartDefinition stickd_r1 = body.addOrReplaceChild("stickd_r1",
			CubeListBuilder.create()
				.texOffs(0, 28).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F)
				.texOffs(0, 0).addBox(-4.5F, -6.0F, -3.0F, 9.0F, 9.0F, 3.0F),
			PartPose.offset(0.0F, -12.0F, 1.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
			CubeListBuilder.create()
				.texOffs(16, 13).mirror().addBox(-1.75F, -2.25F, 0.375F, 4.0F, 2.0F, 1.0F),
			PartPose.offsetAndRotation(-2.0F, -4.0F, -3.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
			CubeListBuilder.create()
				.texOffs(16, 13).addBox(-2.25F, -2.25F, 0.375F, 4.0F, 2.0F, 1.0F),
			PartPose.offsetAndRotation(2.0F, -4.0F, -3.5F, 0.0F, 0.0F, 0.4363F));
		PartDefinition petals = head.addOrReplaceChild("petals",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -1.275F, 0.75F));
		PartDefinition petal12 = petals.addOrReplaceChild("petal12",
			CubeListBuilder.create()
				.texOffs(54, 0).addBox(-0.7831F, -4.0272F, -0.0819F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).addBox(-0.2831F, -5.0272F, -0.0819F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.425F, -3.0F, -1.5F, 0.0852F, 0.0189F, 0.1317F));
		PartDefinition petal2 = petals.addOrReplaceChild("petal2",
			CubeListBuilder.create()
				.texOffs(54, 0).mirror().addBox(-3.2169F, -4.0272F, -0.0819F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).mirror().addBox(-2.7169F, -5.0272F, -0.0819F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-0.425F, -3.0F, -1.5F, 0.0852F, -0.0189F, -0.1317F));
		PartDefinition petal3 = petals.addOrReplaceChild("petal3",
			CubeListBuilder.create()
				.texOffs(54, 0).mirror().addBox(-1.7077F, -4.2941F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).addBox(-1.2077F, -5.2941F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(2.75F, -2.0F, -1.75F, 0.0791F, -0.0368F, 0.7839F));
		PartDefinition petal4 = petals.addOrReplaceChild("petal4",
			CubeListBuilder.create()
				.texOffs(54, 0).addBox(-2.2923F, -4.2941F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).mirror().addBox(-1.7923F, -5.2941F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-2.75F, -2.0F, -1.75F, 0.0791F, 0.0368F, -0.7839F));
		PartDefinition petal5 = petals.addOrReplaceChild("petal5",
			CubeListBuilder.create()
				.texOffs(54, 0).addBox(-0.9576F, -4.0013F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).addBox(-0.4576F, -5.0013F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(3.5F, -2.0F, -1.5F, 0.0263F, -0.0832F, 1.6133F));
		PartDefinition petal6 = petals.addOrReplaceChild("petal6",
			CubeListBuilder.create()
				.texOffs(54, 0).mirror().addBox(-3.0424F, -4.0013F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).mirror().addBox(-2.5424F, -5.0013F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-3.5F, -2.0F, -1.5F, 0.0263F, 0.0832F, -1.6133F));
		PartDefinition petal7 = petals.addOrReplaceChild("petal7",
			CubeListBuilder.create()
				.texOffs(54, 0).addBox(-0.3584F, -4.2335F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).addBox(0.1416F, -5.2335F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(3.95F, -0.475F, -2.0F, -0.027F, -0.083F, 2.2351F));
		PartDefinition petal8 = petals.addOrReplaceChild("petal8",
			CubeListBuilder.create()
				.texOffs(54, 0).mirror().addBox(-3.6416F, -4.2335F, -0.0298F, 4.0F, 5.0F, 1.0F)
				.texOffs(56, 62).mirror().addBox(-3.1416F, -5.2335F, -0.0298F, 3.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(-3.95F, -0.475F, -2.0F, -0.027F, 0.083F, -2.2351F));
		PartDefinition petal10 = petals.addOrReplaceChild("petal10",
			CubeListBuilder.create()
				.texOffs(15, 22).mirror().addBox(-1.6993F, -0.9501F, -0.0831F, 3.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(2.55F, 3.25F, -1.5F, -0.087F, -0.0072F, -0.388F));
		PartDefinition petal9 = petals.addOrReplaceChild("petal9",
			CubeListBuilder.create()
				.texOffs(15, 22).addBox(-1.3007F, -0.9501F, -0.0831F, 3.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(-2.55F, 3.25F, -1.5F, -0.087F, 0.0072F, 0.388F));
		PartDefinition petal11 = petals.addOrReplaceChild("petal11",
			CubeListBuilder.create()
				.texOffs(15, 22).mirror().addBox(-1.5F, -0.9914F, -0.1305F, 3.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 3.85F, -1.75F, -0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(MariGoldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}