package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class MelonPultModel extends PVZPlantModel<MelonPultEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "melon_pult"), "main");

	private final ModelPart total;
	private final ModelPart nw_r1;
	private final ModelPart sw_r1;
	private final ModelPart se_r1;
	private final ModelPart ne_r1;
	private final ModelPart pult;
	private final ModelPart bone;
	private final ModelPart melon;



	public MelonPultModel(ModelPart root) {
		this.total = root.getChild("total");
		this.nw_r1 = this.total.getChild("nw_r1");
		this.sw_r1 = this.total.getChild("sw_r1");
		this.se_r1 = this.total.getChild("se_r1");
		this.ne_r1 = this.total.getChild("ne_r1");
		this.pult = this.total.getChild("pult");
		this.bone = this.pult.getChild("bone");
		this.melon = this.bone.getChild("melon");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -10.5F, -5.0F, 14.0F, 10.0F, 10.0F)
				.texOffs(32, 44).addBox(-7.0F, -8.0F, -5.2F, 14.0F, 2.0F, 0.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition nw_r1_pd = total_pd.addOrReplaceChild("nw_r1",
			CubeListBuilder.create()
				.texOffs(29, 0).addBox(-1.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.0873F));
		PartDefinition sw_r1_pd = total_pd.addOrReplaceChild("sw_r1",
			CubeListBuilder.create()
				.texOffs(13, 47).addBox(-1.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));
		PartDefinition se_r1_pd = total_pd.addOrReplaceChild("se_r1",
			CubeListBuilder.create()
				.texOffs(-9, 47).addBox(-10.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));
		PartDefinition ne_r1_pd = total_pd.addOrReplaceChild("ne_r1",
			CubeListBuilder.create()
				.texOffs(39, 18).addBox(-10.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0873F));
		PartDefinition pult_pd = total_pd.addOrReplaceChild("pult",
			CubeListBuilder.create()
				.texOffs(38, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F),
			PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone_pd = pult_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(48, 9).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 5.0F)
				.texOffs(0, 20).addBox(-5.0F, -2.0F, 3.0F, 10.0F, 5.0F, 10.0F)
				.texOffs(0, 44).addBox(-4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition melon_pd = bone_pd.addOrReplaceChild("melon",
			CubeListBuilder.create()
				.texOffs(32, 27).addBox(-4.0F, -3.5F, -3.0F, 8.0F, 9.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -5.5F, 8.0F, -0.6545F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(MelonPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.melon.visible = (percent < 0.5);
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.melon.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<MelonPultEntity> getPlantModel() {
		return this;
	}
}