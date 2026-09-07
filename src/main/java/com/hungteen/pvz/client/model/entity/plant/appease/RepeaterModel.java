package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.RepeaterEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class RepeaterModel extends PlantShooterModel<RepeaterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "repeater"), "main");
	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart eyebrow;
	private final ModelPart hair;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart down;
	private final ModelPart n_r1;
	private final ModelPart w_r1;
	private final ModelPart e_r1;
	private final ModelPart s_r1;


	public RepeaterModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.head = this.body.getChild("head");
		this.eyebrow = this.head.getChild("eyebrow");
		this.hair = this.head.getChild("hair");
		this.cube_r1 = this.hair.getChild("cube_r1");
		this.cube_r2 = this.hair.getChild("cube_r2");
		this.cube_r3 = this.hair.getChild("cube_r3");
		this.cube_r4 = this.hair.getChild("cube_r4");
		this.down = this.total.getChild("down");
		this.n_r1 = this.down.getChild("n_r1");
		this.w_r1 = this.down.getChild("w_r1");
		this.e_r1 = this.down.getChild("e_r1");
		this.s_r1 = this.down.getChild("s_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = total.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 31).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(-2.0F, -5.0F, -8.0F, 4.0F, 4.0F, 3.0F)
				.texOffs(44, 0).addBox(-3.0F, -6.0F, -9.0F, 6.0F, 6.0F, 2.0F)
				.texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F)
				.texOffs(40, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition eyebrow = head.addOrReplaceChild("eyebrow",
			CubeListBuilder.create()
				.texOffs(39, 30).addBox(-5.0F, -22.25F, -4.2F, 10.0F, 10.0F, 1.0F),
			PartPose.offset(0.0F, 12.0F, -1.0F));
		PartDefinition hair = head.addOrReplaceChild("hair",
			CubeListBuilder.create()
				.texOffs(44, 45).addBox(-2.0F, -2.0F, 0.2F, 4.0F, 4.0F, 5.0F),
			PartPose.offset(0.0F, -4.5F, 5.0F));
		PartDefinition cube_r1 = hair.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(26, 47).addBox(-6.0F, -3.0F, -2.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));
		PartDefinition cube_r2 = hair.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(10, 47).addBox(2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition cube_r3 = hair.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(24, 39).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r4 = hair.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(8, 39).addBox(-3.0F, 2.0F, -2.0F, 6.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition down = total.addOrReplaceChild("down",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r1 = down.addOrReplaceChild("n_r1",
			CubeListBuilder.create()
				.texOffs(4, 20).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition w_r1 = down.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(6, 27).addBox(1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, -0.1745F));
		PartDefinition e_r1 = down.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.1745F));
		PartDefinition s_r1 = down.addOrReplaceChild("s_r1",
			CubeListBuilder.create()
				.texOffs(24, 20).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public Optional<ModelPart> getHeadModel() {
		return Optional.ofNullable(this.head);
	}
	
	@Override
	public Optional<ModelPart> getBodyModel() {
		return Optional.ofNullable(this.body);
	}
	
	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}
	
}