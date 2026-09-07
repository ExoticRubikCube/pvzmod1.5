package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.UmbrellaLeafEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class UmbrellaLeafModel extends PVZPlantModel<UmbrellaLeafEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "umbrella_leaf"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart leaves;
	private final ModelPart flower;
	private final ModelPart open;
	private final ModelPart open2;
	private final ModelPart open2_r1;
	private final ModelPart open1;
	private final ModelPart closed;
	private final ModelPart swe;
	private final ModelPart swd;
	private final ModelPart nw;
	private final ModelPart e;
	private final ModelPart sw;


	public UmbrellaLeafModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.leaves = this.head.getChild("leaves");
		this.flower = this.leaves.getChild("flower");
		this.open = this.leaves.getChild("open");
		this.open2 = this.open.getChild("open2");
		this.open2_r1 = this.open2.getChild("open2_r1");
		this.open1 = this.open.getChild("open1");
		this.closed = this.leaves.getChild("closed");
		this.swe = this.closed.getChild("swe");
		this.swd = this.closed.getChild("swd");
		this.nw = this.closed.getChild("nw");
		this.e = this.closed.getChild("e");
		this.sw = this.closed.getChild("sw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -12.5F, -1.0F, 2.0F, 2.0F, 2.0F)
				.texOffs(0, 49).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 11.0F, 6.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaves = head.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition flower = leaves.addOrReplaceChild("flower",
			CubeListBuilder.create()
				.texOffs(-7, 4).addBox(-3.5F, -0.15F, -3.5F, 7.0F, 0.0F, 7.0F)
				.texOffs(-7, 11).addBox(-3.5F, -0.01F, -3.5F, 7.0F, 0.0F, 7.0F),
			PartPose.offset(0.0F, -12.9F, 0.0F));
		PartDefinition open = leaves.addOrReplaceChild("open",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition open2 = open.addOrReplaceChild("open2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition open2_r1 = open2.addOrReplaceChild("open2_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-21.0F, -12.0F, -21.0F, 42.0F, 0.0F, 42.0F),
			PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition open1 = open.addOrReplaceChild("open1",
			CubeListBuilder.create()
				.texOffs(0, 42).addBox(-21.0F, 0.0F, -21.0F, 42.0F, 0.0F, 42.0F),
			PartPose.offset(0.0F, 0.75F, 0.0F));
		PartDefinition closed = leaves.addOrReplaceChild("closed",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition swe = closed.addOrReplaceChild("swe",
			CubeListBuilder.create()
				.texOffs(0, 71).addBox(-5.0F, 0.5F, -1.0F, 6.0F, 10.0F, 5.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition swd = closed.addOrReplaceChild("swd",
			CubeListBuilder.create()
				.texOffs(18, 60).addBox(-1.0F, -0.15F, -1.01F, 6.0F, 10.0F, 6.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition nw = closed.addOrReplaceChild("nw",
			CubeListBuilder.create()
				.texOffs(0, 18).addBox(-2.0F, -0.5F, -7.0F, 8.0F, 10.0F, 7.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition e = closed.addOrReplaceChild("e",
			CubeListBuilder.create()
				.texOffs(0, 86).addBox(-7.0F, 0.0F, -5.0F, 8.0F, 10.0F, 11.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition sw = closed.addOrReplaceChild("sw",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-1.0F, -0.25F, -1.0F, 8.0F, 6.0F, 8.0F),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(UmbrellaLeafEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
		if(entity.getAttackTime() > 0){
			this.open.visible = true;
			this.closed.visible = false;
		}else {
			this.open.visible = false;
			this.closed.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<UmbrellaLeafEntity> getPlantModel() {
		return this;
	}
}