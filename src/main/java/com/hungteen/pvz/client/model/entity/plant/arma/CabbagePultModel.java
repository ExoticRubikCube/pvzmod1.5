package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.CabbagePultEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class CabbagePultModel extends PVZPlantModel<CabbagePultEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "cabbage_pult"), "main");

	private final ModelPart total;
	private final ModelPart cabbage;
	private final ModelPart dicoration;
	private final ModelPart pult;
	private final ModelPart out;
	private final ModelPart bullet;




public CabbagePultModel(ModelPart root) {
		this.total = root.getChild("total");
		this.cabbage = this.total.getChild("cabbage");
		this.dicoration = this.cabbage.getChild("dicoration");
		this.pult = this.total.getChild("pult");
		this.out = this.pult.getChild("out");
		this.bullet = this.out.getChild("bullet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cabbage_pd = total_pd.addOrReplaceChild("cabbage",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -1.0F, -7.0F, 14.0F, 1.0F, 14.0F)
				.texOffs(4, 47).addBox(-6.0F, -0.1F, -6.0F, 12.0F, 1.0F, 12.0F)
				.texOffs(0, 28).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F)
				.texOffs(32, 20).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition dicoration_pd = cabbage_pd.addOrReplaceChild("dicoration",
			CubeListBuilder.create()
				.texOffs(0, 15).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 3.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pult_pd = total_pd.addOrReplaceChild("pult",
			CubeListBuilder.create()
				.texOffs(8, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition out_pd = pult_pd.addOrReplaceChild("out",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 6.0F, 2.0F)
				.texOffs(42, 0).addBox(-3.0F, -12.0F, 0.0F, 6.0F, 6.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, -1.309F, 0.0F, 0.0F));
		PartDefinition bullet_pd = out_pd.addOrReplaceChild("bullet",
			CubeListBuilder.create()
				.texOffs(0, 45).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F)
				.texOffs(0, 53).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
			PartPose.offsetAndRotation(0.0F, -9.0F, 1.0F, 1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(CabbagePultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.bullet.visible = (percent < 0.5);
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.bullet.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<CabbagePultEntity> getPlantModel() {
		return this;
	}
}