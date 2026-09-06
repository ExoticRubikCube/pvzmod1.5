package com.hungteen.pvz.client.model.entity.plant.assist;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.enums.MetalTypes;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.assist.MagnetShroomEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class MagnetShroomModel extends PVZPlantModel<MagnetShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "magnet_shroom"), "main");

	private final ModelPart total;
	private final ModelPart plate;
	private final ModelPart bone3;
	private final ModelPart cube_r1;
	private final ModelPart bone4;
	private final ModelPart face;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart elect;
	private final ModelPart magnets;
	private final ModelPart magnet;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart rest_magnet;
	private final ModelPart bone2;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart absorb_magnet;
	private final ModelPart bone24;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart bone29;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart bone32;
	private final ModelPart bone33;




public MagnetShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.plate = this.total.getChild("plate");
		this.bone3 = this.plate.getChild("bone3");
		this.cube_r1 = this.bone3.getChild("cube_r1");
		this.bone4 = this.plate.getChild("bone4");
		this.face = this.total.getChild("face");
		this.cube_r2 = this.face.getChild("cube_r2");
		this.cube_r3 = this.face.getChild("cube_r3");
		this.elect = this.total.getChild("elect");
		this.magnets = this.total.getChild("magnets");
		this.magnet = this.magnets.getChild("magnet");
		this.bone5 = this.magnet.getChild("bone5");
		this.bone6 = this.magnet.getChild("bone6");
		this.bone7 = this.magnet.getChild("bone7");
		this.bone8 = this.magnet.getChild("bone8");
		this.bone9 = this.magnet.getChild("bone9");
		this.bone10 = this.magnet.getChild("bone10");
		this.bone11 = this.magnet.getChild("bone11");
		this.bone12 = this.magnet.getChild("bone12");
		this.bone13 = this.magnet.getChild("bone13");
		this.bone14 = this.magnet.getChild("bone14");
		this.rest_magnet = this.magnets.getChild("rest_magnet");
		this.bone2 = this.rest_magnet.getChild("bone2");
		this.bone15 = this.rest_magnet.getChild("bone15");
		this.bone16 = this.rest_magnet.getChild("bone16");
		this.bone17 = this.rest_magnet.getChild("bone17");
		this.bone18 = this.rest_magnet.getChild("bone18");
		this.bone19 = this.rest_magnet.getChild("bone19");
		this.bone20 = this.rest_magnet.getChild("bone20");
		this.bone21 = this.rest_magnet.getChild("bone21");
		this.bone22 = this.rest_magnet.getChild("bone22");
		this.bone23 = this.rest_magnet.getChild("bone23");
		this.absorb_magnet = this.magnets.getChild("absorb_magnet");
		this.bone24 = this.absorb_magnet.getChild("bone24");
		this.bone25 = this.absorb_magnet.getChild("bone25");
		this.bone26 = this.absorb_magnet.getChild("bone26");
		this.bone27 = this.absorb_magnet.getChild("bone27");
		this.bone28 = this.absorb_magnet.getChild("bone28");
		this.bone29 = this.absorb_magnet.getChild("bone29");
		this.bone30 = this.absorb_magnet.getChild("bone30");
		this.bone31 = this.absorb_magnet.getChild("bone31");
		this.bone32 = this.absorb_magnet.getChild("bone32");
		this.bone33 = this.absorb_magnet.getChild("bone33");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 61).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F)
				.texOffs(0, 54).addBox(-1.0F, -5.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 49).addBox(-1.0F, -7.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition plate_pd = total_pd.addOrReplaceChild("plate",
			CubeListBuilder.create()
				.texOffs(9, 59).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition bone3_pd = plate_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r1_pd = bone3_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(9, 56).addBox(0.25F, -1.0F, 0.0F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-1.75F, -0.134F, 1.75F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone4_pd = plate_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(9, 53).addBox(-1.5F, -0.241F, -3.5825F, 3.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 1.5708F, 0.0F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(11, 40).addBox(-2.5F, 0.0F, -1.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(33, 40).addBox(0.5F, 0.0F, -1.75F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -11.0F, 0.0F));
		PartDefinition cube_r2_pd = face_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(57, 41).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(1.75F, -0.5F, -1.75F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r3_pd = face_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(19, 39).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.75F, -0.5F, -1.75F, 0.0F, 0.0F, -0.1745F));
		PartDefinition elect_pd = total_pd.addOrReplaceChild("elect",
			CubeListBuilder.create()
				.texOffs(1, 38).addBox(-1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, -16.25F, 0.0F));
		PartDefinition magnets_pd = total_pd.addOrReplaceChild("magnets",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition magnet_pd = magnets_pd.addOrReplaceChild("magnet",
			CubeListBuilder.create()
				.texOffs(25, 57).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -0.75F, 0.0F));
		PartDefinition bone5_pd = magnet_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(38, 58).addBox(0.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone6_pd = magnet_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(20, 50).addBox(-2.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone7_pd = magnet_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(51, 52).addBox(0.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone8_pd = magnet_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(38, 51).addBox(-3.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone9_pd = magnet_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(31, 47).addBox(-4.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition bone10_pd = magnet_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(10, 45).addBox(-4.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone11_pd = magnet_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(51, 44).addBox(1.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone12_pd = magnet_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(1, 41).addBox(2.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition bone13_pd = magnet_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(40, 41).addBox(-5.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone14_pd = magnet_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(21, 42).addBox(2.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition rest_magnet_pd = magnets_pd.addOrReplaceChild("rest_magnet",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -0.75F, 0.0F));
		PartDefinition bone2_pd = rest_magnet_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(1, 7).addBox(0.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone15_pd = rest_magnet_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(1, 13).addBox(-2.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone16_pd = rest_magnet_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(0.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone17_pd = rest_magnet_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-3.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone18_pd = rest_magnet_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(1, 13).addBox(-4.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition bone19_pd = rest_magnet_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(-4.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone20_pd = rest_magnet_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(1, 1).addBox(1.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone21_pd = rest_magnet_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(2, 3).addBox(2.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition bone22_pd = rest_magnet_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(1, 20).addBox(-5.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone23_pd = rest_magnet_pd.addOrReplaceChild("bone23",
			CubeListBuilder.create()
				.texOffs(1, 26).addBox(2.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition absorb_magnet_pd = magnets_pd.addOrReplaceChild("absorb_magnet",
			CubeListBuilder.create()
				.texOffs(16, 1).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, -0.75F, 0.0F));
		PartDefinition bone24_pd = absorb_magnet_pd.addOrReplaceChild("bone24",
			CubeListBuilder.create()
				.texOffs(15, 1).addBox(0.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bone25_pd = absorb_magnet_pd.addOrReplaceChild("bone25",
			CubeListBuilder.create()
				.texOffs(16, 2).addBox(-2.4575F, -1.4755F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition bone26_pd = absorb_magnet_pd.addOrReplaceChild("bone26",
			CubeListBuilder.create()
				.texOffs(15, 2).addBox(0.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone27_pd = absorb_magnet_pd.addOrReplaceChild("bone27",
			CubeListBuilder.create()
				.texOffs(15, 1).addBox(-3.1585F, -0.0425F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone28_pd = absorb_magnet_pd.addOrReplaceChild("bone28",
			CubeListBuilder.create()
				.texOffs(16, 2).addBox(-4.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition bone29_pd = absorb_magnet_pd.addOrReplaceChild("bone29",
			CubeListBuilder.create()
				.texOffs(15, 2).addBox(-4.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone30_pd = absorb_magnet_pd.addOrReplaceChild("bone30",
			CubeListBuilder.create()
				.texOffs(16, 3).addBox(1.4373F, -7.364F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone31_pd = absorb_magnet_pd.addOrReplaceChild("bone31",
			CubeListBuilder.create()
				.texOffs(16, 3).addBox(2.8246F, 0.3592F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition bone32_pd = absorb_magnet_pd.addOrReplaceChild("bone32",
			CubeListBuilder.create()
				.texOffs(15, 11).addBox(-5.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone33_pd = absorb_magnet_pd.addOrReplaceChild("bone33",
			CubeListBuilder.create()
				.texOffs(15, 17).addBox(2.609F, -8.0288F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(MagnetShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final boolean isRest = ! entity.isMagnetActive();
		final boolean hasReach = entity.getMetalType() != MetalTypes.EMPTY;
		this.magnet.visible = ! isRest;
		this.rest_magnet.visible = (isRest && hasReach);
		this.absorb_magnet.visible = (isRest && ! hasReach);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<MagnetShroomEntity> getPlantModel() {
		return this;
	}
}