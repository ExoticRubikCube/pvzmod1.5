package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.UmbrellaLeafEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class UmbrellaLeafModel extends PVZPlantModel<UmbrellaLeafEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "umbrella_leaf"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart leaves;
	private final ModelPart leaf1;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart leaf2;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart leaf3;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart leaf4;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart leaf5;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart cube_r20;
	private final ModelPart leaf6;
	private final ModelPart cube_r21;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart leaf7;
	private final ModelPart cube_r25;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart face;




public UmbrellaLeafModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.leaves = this.total.getChild("leaves");
		this.leaf1 = this.leaves.getChild("leaf1");
		this.cube_r1 = this.leaf1.getChild("cube_r1");
		this.cube_r2 = this.leaf1.getChild("cube_r2");
		this.cube_r3 = this.leaf1.getChild("cube_r3");
		this.cube_r4 = this.leaf1.getChild("cube_r4");
		this.leaf2 = this.leaves.getChild("leaf2");
		this.cube_r5 = this.leaf2.getChild("cube_r5");
		this.cube_r6 = this.leaf2.getChild("cube_r6");
		this.cube_r7 = this.leaf2.getChild("cube_r7");
		this.cube_r8 = this.leaf2.getChild("cube_r8");
		this.leaf3 = this.leaves.getChild("leaf3");
		this.cube_r9 = this.leaf3.getChild("cube_r9");
		this.cube_r10 = this.leaf3.getChild("cube_r10");
		this.cube_r11 = this.leaf3.getChild("cube_r11");
		this.cube_r12 = this.leaf3.getChild("cube_r12");
		this.leaf4 = this.leaves.getChild("leaf4");
		this.cube_r13 = this.leaf4.getChild("cube_r13");
		this.cube_r14 = this.leaf4.getChild("cube_r14");
		this.cube_r15 = this.leaf4.getChild("cube_r15");
		this.cube_r16 = this.leaf4.getChild("cube_r16");
		this.leaf5 = this.leaves.getChild("leaf5");
		this.cube_r17 = this.leaf5.getChild("cube_r17");
		this.cube_r18 = this.leaf5.getChild("cube_r18");
		this.cube_r19 = this.leaf5.getChild("cube_r19");
		this.cube_r20 = this.leaf5.getChild("cube_r20");
		this.leaf6 = this.leaves.getChild("leaf6");
		this.cube_r21 = this.leaf6.getChild("cube_r21");
		this.cube_r22 = this.leaf6.getChild("cube_r22");
		this.cube_r23 = this.leaf6.getChild("cube_r23");
		this.cube_r24 = this.leaf6.getChild("cube_r24");
		this.leaf7 = this.leaves.getChild("leaf7");
		this.cube_r25 = this.leaf7.getChild("cube_r25");
		this.cube_r26 = this.leaf7.getChild("cube_r26");
		this.cube_r27 = this.leaf7.getChild("cube_r27");
		this.cube_r28 = this.leaf7.getChild("cube_r28");
		this.face = this.total.getChild("face");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(52, 58).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F)
				.texOffs(21, 46).addBox(-2.5F, -6.0F, -2.5F, 5.0F, 4.0F, 5.0F)
				.texOffs(0, 50).addBox(-3.5F, -13.0F, -3.5F, 7.0F, 7.0F, 7.0F)
				.texOffs(28, 55).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 1.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -11.0F, -4.1F));
		PartDefinition leaf1_pd = leaves_pd.addOrReplaceChild("leaf1",
			CubeListBuilder.create(),
			PartPose.offset(-0.5F, -3.0F, 4.1F));
		PartDefinition cube_r1_pd = leaf1_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r2_pd = leaf1_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r3_pd = leaf1_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4_pd = leaf1_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf2_pd = leaves_pd.addOrReplaceChild("leaf2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -3.0F, 3.1F, -0.0873F, -0.9599F, 0.0F));
		PartDefinition cube_r5_pd = leaf2_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r6_pd = leaf2_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r7_pd = leaf2_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r8_pd = leaf2_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf3_pd = leaves_pd.addOrReplaceChild("leaf3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-0.5F, -3.0F, 5.6F, -0.0873F, 0.9599F, 0.0F));
		PartDefinition cube_r9_pd = leaf3_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(0.0155F, -1.1382F, -12.8742F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r10_pd = leaf3_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-0.9845F, -1.1F, -10.875F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r11_pd = leaf3_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(0.0155F, -0.7369F, -1.8345F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r12_pd = leaf3_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(0.0155F, 0.4698F, -3.293F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(1.0155F, 0.4698F, -2.093F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf4_pd = leaves_pd.addOrReplaceChild("leaf4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.25F, -3.0F, 4.1F, 0.0F, 1.9635F, 0.0F));
		PartDefinition cube_r13_pd = leaf4_pd.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r14_pd = leaf4_pd.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r15_pd = leaf4_pd.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r16_pd = leaf4_pd.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf5_pd = leaves_pd.addOrReplaceChild("leaf5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -3.0F, 3.35F, 0.0F, -1.9635F, 0.0F));
		PartDefinition cube_r17_pd = leaf5_pd.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r18_pd = leaf5_pd.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r19_pd = leaf5_pd.addOrReplaceChild("cube_r19",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r20_pd = leaf5_pd.addOrReplaceChild("cube_r20",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf6_pd = leaves_pd.addOrReplaceChild("leaf6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -3.0F, 4.6F, -0.0873F, 2.7053F, 0.0F));
		PartDefinition cube_r21_pd = leaf6_pd.addOrReplaceChild("cube_r21",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r22_pd = leaf6_pd.addOrReplaceChild("cube_r22",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r23_pd = leaf6_pd.addOrReplaceChild("cube_r23",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r24_pd = leaf6_pd.addOrReplaceChild("cube_r24",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition leaf7_pd = leaves_pd.addOrReplaceChild("leaf7",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.75F, -3.0F, 4.1F, -0.0873F, -2.7053F, 0.0F));
		PartDefinition cube_r25_pd = leaf7_pd.addOrReplaceChild("cube_r25",
			CubeListBuilder.create()
				.texOffs(36, 47).addBox(-1.5F, -1.1F, -12.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.2608F, -5.47F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r26_pd = leaf7_pd.addOrReplaceChild("cube_r26",
			CubeListBuilder.create()
				.texOffs(0, 35).addBox(-2.5F, -1.1F, -10.0F, 9.0F, 1.0F, 10.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.6544F, -5.2564F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r27_pd = leaf7_pd.addOrReplaceChild("cube_r27",
			CubeListBuilder.create()
				.texOffs(41, 52).addBox(-1.5F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-1.5F, 0.7075F, -5.26F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r28_pd = leaf7_pd.addOrReplaceChild("cube_r28",
			CubeListBuilder.create()
				.texOffs(8, 47).addBox(-1.5F, 0.1F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(0, 48).addBox(-0.5F, 0.1F, -1.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(-0.5F, 0.5F, -2.4F, -0.3491F, 0.0F, 0.0F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(28, 55).addBox(1.25F, -11.75F, -3.92F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F))
				.texOffs(28, 59).addBox(-3.25F, -11.75F, -3.92F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(UmbrellaLeafEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
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