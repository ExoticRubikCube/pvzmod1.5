package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.SplitPeaEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SplitPeaModel extends PlantShooterModel<SplitPeaEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "split_pea"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart back;
	private final ModelPart mouth_r1;
	private final ModelPart head_r1;
	private final ModelPart front;
	private final ModelPart down;
	private final ModelPart n_r1;
	private final ModelPart w_r1;
	private final ModelPart e_r1;
	private final ModelPart s_r1;




public SplitPeaModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.head = this.body.getChild("head");
		this.back = this.head.getChild("back");
		this.mouth_r1 = this.back.getChild("mouth_r1");
		this.head_r1 = this.back.getChild("head_r1");
		this.front = this.head.getChild("front");
		this.down = this.total.getChild("down");
		this.n_r1 = this.down.getChild("n_r1");
		this.w_r1 = this.down.getChild("w_r1");
		this.e_r1 = this.down.getChild("e_r1");
		this.s_r1 = this.down.getChild("s_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 31).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(40, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition back_pd = head_pd.addOrReplaceChild("back",
			CubeListBuilder.create()
				.texOffs(30, 0).addBox(-2.0F, -1.0F, -0.7F, 4.0F, 4.0F, 3.0F)
				.texOffs(10, 32).addBox(-5.0F, -5.0F, 1.0F, 10.0F, 1.0F, 0.0F),
			PartPose.offset(0.0F, -2.6F, 8.2F));
		PartDefinition mouth_r1_pd = back_pd.addOrReplaceChild("mouth_r1",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 6.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 1.0F, 3.2F, 0.0F, 3.1416F, 0.0F));
		PartDefinition head_r1_pd = back_pd.addOrReplaceChild("head_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(-0.5F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition front_pd = head_pd.addOrReplaceChild("front",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -22.0F, -9.0F, 10.0F, 10.0F, 10.0F)
				.texOffs(30, 0).addBox(-2.0F, -17.0F, -12.0F, 4.0F, 4.0F, 3.0F)
				.texOffs(44, 0).addBox(-3.0F, -18.0F, -13.0F, 6.0F, 6.0F, 2.0F),
			PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition down_pd = total_pd.addOrReplaceChild("down",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r1_pd = down_pd.addOrReplaceChild("n_r1",
			CubeListBuilder.create()
				.texOffs(4, 20).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition w_r1_pd = down_pd.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(6, 27).addBox(1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, -0.1745F));
		PartDefinition e_r1_pd = down_pd.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(26, 27).addBox(-7.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.1745F));
		PartDefinition s_r1_pd = down_pd.addOrReplaceChild("s_r1",
			CubeListBuilder.create()
				.texOffs(24, 20).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(SplitPeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.total.yRot = entity.getRoundTick() * 3.1415926F / 10;
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
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
	public EntityModel<SplitPeaEntity> getPlantModel() {
		return this;
	}
	
}