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
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "water_guard"), "main");

	private final ModelPart total;
	private final ModelPart side;
	private final ModelPart side2;
	private final ModelPart side3;
	private final ModelPart side4;
	private final ModelPart side5;
	private final ModelPart side6;

	public WaterGuardModel(ModelPart root) {
		this.total = root.getChild("total");
		this.side = this.total.getChild("side");
		this.side2 = this.total.getChild("side2");
		this.side3 = this.total.getChild("side3");
		this.side4 = this.total.getChild("side4");
		this.side5 = this.total.getChild("side5");
		this.side6 = this.total.getChild("side6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(188, 221).addBox(-8.0F, -17.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition side_pd = total_pd.addOrReplaceChild("side",
			CubeListBuilder.create()
				.texOffs(144, 234).mirror().addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(165, 214).mirror().addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(221, 202).mirror().addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(202, 199).mirror().addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(189, 202).mirror().addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(136, 233).mirror().addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(147, 211).mirror().addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(154, 193).mirror().addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(228, 186).mirror().addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(204, 186).mirror().addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(186, 187).mirror().addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition side2_pd = total_pd.addOrReplaceChild("side2",
			CubeListBuilder.create()
				.texOffs(92, 235).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(69, 229).addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(109, 216).addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(89, 211).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(75, 248).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(48, 244).addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(22, 241).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(39, 225).addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(3, 236).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(21, 223).addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(5, 221).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(-8.0F, -9.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition side3_pd = total_pd.addOrReplaceChild("side3",
			CubeListBuilder.create()
				.texOffs(43, 205).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(10, 198).addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(82, 192).addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(121, 200).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(144, 195).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(66, 192).addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(35, 189).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(6, 179).addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(112, 184).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(160, 179).addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(140, 184).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(8.0F, -9.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition side4_pd = total_pd.addOrReplaceChild("side4",
			CubeListBuilder.create()
				.texOffs(213, 163).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(189, 157).addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(34, 170).addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(71, 175).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(104, 183).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(6, 166).addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(59, 163).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(22, 154).addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(131, 169).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(115, 167).addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(160, 168).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition side5_pd = total_pd.addOrReplaceChild("side5",
			CubeListBuilder.create()
				.texOffs(212, 140).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(161, 146).addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(121, 147).addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(86, 156).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(9, 150).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(50, 147).addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(77, 140).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(104, 134).addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(148, 138).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(192, 139).addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(30, 144).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, -8.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition side6_pd = total_pd.addOrReplaceChild("side6",
			CubeListBuilder.create()
				.texOffs(7, 121).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 16.0F)
				.texOffs(53, 121).addBox(2.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(91, 115).addBox(-4.0F, -1.0F, -7.0F, 2.0F, 1.0F, 14.0F)
				.texOffs(133, 122).addBox(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(173, 131).addBox(-8.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F)
				.texOffs(209, 126).addBox(-7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(230, 118).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(9, 102).addBox(-5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F)
				.texOffs(41, 105).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 10.0F)
				.texOffs(76, 108).addBox(6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F)
				.texOffs(121, 107).addBox(7.0F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, 8.0F, -1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(WaterGuardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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