package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.common.entity.misc.SmallChomperEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.EntityModel;


import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SmallChomperModel extends EntityModel<SmallChomperEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "small_chomper"), "main");

	private final ModelPart head;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart up_mouse;
	private final ModelPart bone9;
	private final ModelPart bone8;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart down_mouse;
	private final ModelPart leaf;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart tongue;
	private final ModelPart tongue2;




public SmallChomperModel(ModelPart root) {
		this.head = root.getChild("head");
		this.bone14 = root.getChild("bone14");
		this.bone15 = root.getChild("bone15");
		this.up_mouse = root.getChild("up_mouse");
		this.bone9 = root.getChild("bone9");
		this.bone8 = root.getChild("bone8");
		this.bone10 = root.getChild("bone10");
		this.bone11 = root.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.bone13 = root.getChild("bone13");
		this.down_mouse = root.getChild("down_mouse");
		this.leaf = root.getChild("leaf");
		this.bone16 = root.getChild("bone16");
		this.bone17 = root.getChild("bone17");
		this.bone18 = root.getChild("bone18");
		this.bone19 = root.getChild("bone19");
		this.bone20 = root.getChild("bone20");
		this.bone21 = root.getChild("bone21");
		this.tongue = root.getChild("tongue");
		this.tongue2 = root.getChild("tongue2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition head_pd = partdefinition.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(72, 113).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 10.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, 21.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition bone14_pd = head_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(105, 107).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.9599F, 0.0F, 0.0F));
		PartDefinition bone15_pd = bone14_pd.addOrReplaceChild("bone15",
			CubeListBuilder.create()
				.texOffs(35, 45).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition up_mouse_pd = head_pd.addOrReplaceChild("up_mouse",
			CubeListBuilder.create()
				.texOffs(75, 94).addBox(6.0F, -2.0F, -11.0F, 1.0F, 4.0F, 11.0F)
				.texOffs(22, 96).addBox(-6.0F, -3.0F, -12.0F, 12.0F, 5.0F, 12.0F)
				.texOffs(103, 89).addBox(-5.0F, -2.0F, -13.0F, 10.0F, 4.0F, 1.0F)
				.texOffs(100, 70).addBox(-7.0F, -2.0F, -11.0F, 1.0F, 4.0F, 11.0F)
				.texOffs(13, 110).addBox(-6.0F, 2.0F, -7.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-6.0F, 2.0F, -5.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-6.0F, 2.0F, -3.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-6.0F, 2.0F, -9.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-6.0F, 2.0F, -11.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-5.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-3.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(-1.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(1.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(3.0F, 2.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(5.0F, 2.0F, -12.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(5.0F, 2.0F, -10.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(5.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(5.0F, 2.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(13, 110).addBox(5.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition bone9_pd = up_mouse_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(9, 99).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, -10.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bone8_pd = bone9_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(51, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone10_pd = up_mouse_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(4, 90).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, -6.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone11_pd = bone10_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(62, 44).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone12_pd = up_mouse_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(32, 89).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition bone13_pd = bone12_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(19, 91).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition down_mouse_pd = head_pd.addOrReplaceChild("down_mouse",
			CubeListBuilder.create()
				.texOffs(46, 79).addBox(6.0F, -2.0F, -11.0F, 1.0F, 3.0F, 11.0F)
				.texOffs(5, 63).addBox(-6.0F, -2.0F, -12.0F, 12.0F, 4.0F, 12.0F)
				.texOffs(74, 88).addBox(-5.0F, -2.0F, -13.0F, 10.0F, 3.0F, 1.0F)
				.texOffs(73, 71).addBox(-7.0F, -2.0F, -11.0F, 1.0F, 3.0F, 11.0F)
				.texOffs(5, 110).addBox(-6.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(5.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-6.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-6.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-6.0F, -3.0F, -10.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-6.0F, -3.0F, -12.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-4.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(-2.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(0.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(2.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(4.0F, -3.0F, -13.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(5.0F, -3.0F, -11.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(5.0F, -3.0F, -9.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(5.0F, -3.0F, -7.0F, 1.0F, 1.0F, 1.0F)
				.texOffs(5, 110).addBox(5.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition leaf_pd = head_pd.addOrReplaceChild("leaf",
			CubeListBuilder.create()
				.texOffs(64, 73).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition bone16_pd = leaf_pd.addOrReplaceChild("bone16",
			CubeListBuilder.create()
				.texOffs(58, 65).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone17_pd = leaf_pd.addOrReplaceChild("bone17",
			CubeListBuilder.create()
				.texOffs(70, 64).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, 1.0472F));
		PartDefinition bone18_pd = leaf_pd.addOrReplaceChild("bone18",
			CubeListBuilder.create()
				.texOffs(92, 64).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, 2.0944F));
		PartDefinition bone19_pd = leaf_pd.addOrReplaceChild("bone19",
			CubeListBuilder.create()
				.texOffs(108, 61).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.2618F, 0.0F, -3.1416F));
		PartDefinition bone20_pd = leaf_pd.addOrReplaceChild("bone20",
			CubeListBuilder.create()
				.texOffs(119, 61).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, -1.0472F));
		PartDefinition bone21_pd = leaf_pd.addOrReplaceChild("bone21",
			CubeListBuilder.create()
				.texOffs(81, 57).addBox(-1.0F, -4.866F, -1.5F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.5236F, 0.0F, -2.0944F));
		PartDefinition tongue_pd = head_pd.addOrReplaceChild("tongue",
			CubeListBuilder.create()
				.texOffs(7, 53).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, -1.0F, -5.0F));
		PartDefinition tongue2_pd = tongue_pd.addOrReplaceChild("tongue2",
			CubeListBuilder.create()
				.texOffs(23, 52).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, -4.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(SmallChomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		int tick = entity.getTick();//1 - 20
		this.up_mouse.xRot = -1f + tick*0.05f;
		this.down_mouse.xRot = 1f - tick*0.05f;
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}