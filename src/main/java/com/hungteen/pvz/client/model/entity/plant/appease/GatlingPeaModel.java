package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.GatlingPeaEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GatlingPeaModel extends PlantShooterModel<GatlingPeaEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "gatling_pea"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart barrel;
	private final ModelPart eyebrow;
	private final ModelPart down;
	private final ModelPart n_r1;
	private final ModelPart w_r1;
	private final ModelPart e_r1;
	private final ModelPart s_r1;




public GatlingPeaModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.head = this.body.getChild("head");
		this.barrel = this.head.getChild("barrel");
		this.eyebrow = this.head.getChild("eyebrow");
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
				.texOffs(30, 0).addBox(-2.0F, -5.0F, -7.0F, 4.0F, 4.0F, 3.0F)
				.texOffs(44, 0).addBox(-3.0F, -6.0F, -8.0F, 6.0F, 6.0F, 2.0F)
				.texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F)
				.texOffs(40, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F)
				.texOffs(0, 46).addBox(-5.5F, -6.0F, -4.5F, 11.0F, 7.0F, 11.0F)
				.texOffs(20, 30).addBox(-5.5F, -11.0F, -5.5F, 11.0F, 5.0F, 11.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition barrel_pd = head_pd.addOrReplaceChild("barrel",
			CubeListBuilder.create()
				.texOffs(50, 20).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F),
			PartPose.offset(0.0F, -3.0F, -9.5F));
		PartDefinition eyebrow_pd = head_pd.addOrReplaceChild("eyebrow",
			CubeListBuilder.create()
				.texOffs(41, 19).addBox(-5.0F, -21.25F, -4.6F, 10.0F, 1.0F, 0.0F),
			PartPose.offset(0.0F, 12.0F, -1.0F));
		PartDefinition down_pd = total_pd.addOrReplaceChild("down",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r1_pd = down_pd.addOrReplaceChild("n_r1",
			CubeListBuilder.create()
				.texOffs(4, 20).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 0.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition w_r1_pd = down_pd.addOrReplaceChild("w_r1",
			CubeListBuilder.create()
				.texOffs(6, 26).addBox(1.0F, -1.0F, -2.0F, 6.0F, 0.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, -0.1745F));
		PartDefinition e_r1_pd = down_pd.addOrReplaceChild("e_r1",
			CubeListBuilder.create()
				.texOffs(26, 26).addBox(-7.0F, -1.0F, -2.0F, 6.0F, 0.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, -0.1745F, -0.7854F, 0.1745F));
		PartDefinition s_r1_pd = down_pd.addOrReplaceChild("s_r1",
			CubeListBuilder.create()
				.texOffs(24, 20).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 0.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.8F, 0.0F, 0.1745F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GatlingPeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.animTime > 0) {
			this.barrel.zRot = ageInTicks / 5.0f % 100;
		} else {
			this.barrel.zRot = ageInTicks / 20.0f % 100;
		}
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

}