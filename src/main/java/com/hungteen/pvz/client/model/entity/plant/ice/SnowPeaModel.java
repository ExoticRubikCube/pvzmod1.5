package com.hungteen.pvz.client.model.entity.plant.ice;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.ice.SnowPeaEntity;
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
public class SnowPeaModel extends PlantShooterModel<SnowPeaEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "snow_pea"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart hair;
	private final ModelPart u_r1;
	private final ModelPart m_r1;
	private final ModelPart wu_r1;
	private final ModelPart wd_r1;
	private final ModelPart ed_r1;
	private final ModelPart eu_r1;
	private final ModelPart down;
	private final ModelPart n_r1;
	private final ModelPart w_r1;
	private final ModelPart e_r1;
	private final ModelPart s_r1;




public SnowPeaModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.head = this.body.getChild("head");
		this.hair = this.head.getChild("hair");
		this.u_r1 = this.hair.getChild("u_r1");
		this.m_r1 = this.hair.getChild("m_r1");
		this.wu_r1 = this.hair.getChild("wu_r1");
		this.wd_r1 = this.hair.getChild("wd_r1");
		this.ed_r1 = this.hair.getChild("ed_r1");
		this.eu_r1 = this.hair.getChild("eu_r1");
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
				.texOffs(30, 0).addBox(-2.0F, -5.0F, -8.0F, 4.0F, 4.0F, 3.0F)
				.texOffs(44, 0).addBox(-3.0F, -6.0F, -9.0F, 6.0F, 6.0F, 2.0F)
				.texOffs(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F)
				.texOffs(40, 8).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition hair_pd = head_pd.addOrReplaceChild("hair",
			CubeListBuilder.create()
				.texOffs(0, 56).addBox(-2.0F, -3.5F, 0.0F, 6.0F, 6.0F, 2.0F)
				.texOffs(2, 49).addBox(-1.0F, 0.5F, -1.0F, 3.0F, 3.0F, 4.0F),
			PartPose.offset(-1.0F, -4.5F, 5.0F));
		PartDefinition u_r1_pd = hair_pd.addOrReplaceChild("u_r1",
			CubeListBuilder.create()
				.texOffs(16, 55).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 6.0F),
			PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.2618F, -0.1745F, 0.0873F));
		PartDefinition m_r1_pd = hair_pd.addOrReplaceChild("m_r1",
			CubeListBuilder.create()
				.texOffs(32, 49).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 5.0F),
			PartPose.offsetAndRotation(2.5F, -1.0F, 0.0F, -0.1745F, 0.2618F, 0.0F));
		PartDefinition wu_r1_pd = hair_pd.addOrReplaceChild("wu_r1",
			CubeListBuilder.create()
				.texOffs(48, 56).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 5.0F),
			PartPose.offsetAndRotation(3.5F, -3.0F, 0.0F, 0.5236F, 0.2618F, 0.0F));
		PartDefinition wd_r1_pd = hair_pd.addOrReplaceChild("wd_r1",
			CubeListBuilder.create()
				.texOffs(48, 48).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 5.0F),
			PartPose.offsetAndRotation(3.5F, 2.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));
		PartDefinition ed_r1_pd = hair_pd.addOrReplaceChild("ed_r1",
			CubeListBuilder.create()
				.texOffs(16, 47).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 5.0F),
			PartPose.offsetAndRotation(-1.5F, 2.0F, 0.0F, -0.4363F, -0.5236F, 0.0F));
		PartDefinition eu_r1_pd = hair_pd.addOrReplaceChild("eu_r1",
			CubeListBuilder.create()
				.texOffs(34, 57).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F),
			PartPose.offsetAndRotation(-1.5F, -3.0F, 0.0F, 0.5236F, -0.5236F, 0.0F));
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