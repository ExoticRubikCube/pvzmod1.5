package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.TangleKelpEntity;
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
public class TangleKelpModel extends PVZPlantModel<TangleKelpEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "tangle_kelp"), "main");

	private final ModelPart total;
	private final ModelPart c1;
	private final ModelPart c2;
	private final ModelPart f1;
	private final ModelPart n_r1;
	private final ModelPart s_r1;
	private final ModelPart f2;
	private final ModelPart n_r2;
	private final ModelPart s_r2;
	private final ModelPart f3;
	private final ModelPart n_r3;
	private final ModelPart s_r3;
	private final ModelPart f4;
	private final ModelPart n_r4;
	private final ModelPart s_r4;




public TangleKelpModel(ModelPart root) {
		this.total = root.getChild("total");
		this.c1 = this.total.getChild("c1");
		this.c2 = this.total.getChild("c2");
		this.f1 = this.total.getChild("f1");
		this.n_r1 = this.f1.getChild("n_r1");
		this.s_r1 = this.f1.getChild("s_r1");
		this.f2 = this.total.getChild("f2");
		this.n_r2 = this.f2.getChild("n_r2");
		this.s_r2 = this.f2.getChild("s_r2");
		this.f3 = this.total.getChild("f3");
		this.n_r3 = this.f3.getChild("n_r3");
		this.s_r3 = this.f3.getChild("s_r3");
		this.f4 = this.total.getChild("f4");
		this.n_r4 = this.f4.getChild("n_r4");
		this.s_r4 = this.f4.getChild("s_r4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(94, 0).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F)
				.texOffs(104, 16).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 8.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition c1_pd = total_pd.addOrReplaceChild("c1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.5F, -18.0F, -5.0F, 11.0F, 19.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition c2_pd = total_pd.addOrReplaceChild("c2",
			CubeListBuilder.create()
				.texOffs(0, 29).addBox(-5.5F, -18.0F, -5.0F, 11.0F, 19.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition f1_pd = total_pd.addOrReplaceChild("f1",
			CubeListBuilder.create()
				.texOffs(54, -10).addBox(0.0F, -22.0F, -5.0F, 0.0F, 16.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r1_pd = f1_pd.addOrReplaceChild("n_r1",
			CubeListBuilder.create()
				.texOffs(48, 0).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition s_r1_pd = f1_pd.addOrReplaceChild("s_r1",
			CubeListBuilder.create()
				.texOffs(48, 44).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition f2_pd = total_pd.addOrReplaceChild("f2",
			CubeListBuilder.create()
				.texOffs(54, 12).addBox(0.0F, -22.0F, -5.0F, 0.0F, 16.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r2_pd = f2_pd.addOrReplaceChild("n_r2",
			CubeListBuilder.create()
				.texOffs(48, 22).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition s_r2_pd = f2_pd.addOrReplaceChild("s_r2",
			CubeListBuilder.create()
				.texOffs(48, 66).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition f3_pd = total_pd.addOrReplaceChild("f3",
			CubeListBuilder.create()
				.texOffs(54, 34).addBox(0.0F, -22.0F, -5.0F, 0.0F, 16.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r3_pd = f3_pd.addOrReplaceChild("n_r3",
			CubeListBuilder.create()
				.texOffs(48, 44).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition s_r3_pd = f3_pd.addOrReplaceChild("s_r3",
			CubeListBuilder.create()
				.texOffs(48, 0).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition f4_pd = total_pd.addOrReplaceChild("f4",
			CubeListBuilder.create()
				.texOffs(54, 56).addBox(0.0F, -22.0F, -5.0F, 0.0F, 16.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition n_r4_pd = f4_pd.addOrReplaceChild("n_r4",
			CubeListBuilder.create()
				.texOffs(48, 66).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition s_r4_pd = f4_pd.addOrReplaceChild("s_r4",
			CubeListBuilder.create()
				.texOffs(48, 22).addBox(-8.0F, -11.0F, 0.0F, 16.0F, 22.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(TangleKelpEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.c1.visible = entity.getExistTick() % 12 > 6;
		this.c2.visible = entity.getExistTick() % 12 <= 6;
		this.f1.visible = false;
		this.f2.visible = false;
		this.f3.visible = false;
		this.f4.visible = false;
		if (entity.getExistTick() % 12 < 3) {
			this.f1.visible = true;
		}
		else if (entity.getExistTick() % 12 < 6) {
			this.f2.visible = true;
		}
		else if (entity.getExistTick() % 12 < 9) {
			this.f3.visible = true;
		}
		else {
			this.f4.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<TangleKelpEntity> getPlantModel() {
		return this;
	}
}