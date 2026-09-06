package com.hungteen.pvz.client.model.entity.misc;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.FireCrackersEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class FireCrackersModel extends EntityModel<FireCrackersEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "fire_crackers"), "main");

	private final ModelPart total;
	private final ModelPart bombs;
	private final ModelPart bone;
	private final ModelPart bomb1;
	private final ModelPart bomb2;
	private final ModelPart bone2;
	private final ModelPart bomb3;
	private final ModelPart bomb4;
	private final ModelPart bone3;
	private final ModelPart bomb5;
	private final ModelPart bomb6;
	private final ModelPart bone4;
	private final ModelPart bomb7;
	private final ModelPart bomb8;
	private final ModelPart bone5;
	private final ModelPart bomb9;
	private final ModelPart bomb10;
	private final ModelPart bone6;
	private final ModelPart bomb11;
	private final ModelPart bomb12;
	private final ModelPart bone7;
	private final ModelPart bomb13;
	private final ModelPart bomb14;
	private final ModelPart bone8;
	private final ModelPart bomb15;
	private final ModelPart bomb16;
	private final ModelPart bone9;
	private final ModelPart bomb17;
	private final ModelPart bomb18;
	private final ModelPart bone10;
	private final ModelPart bomb19;
	private final ModelPart bomb20;
	private final ModelPart bone11;
	private final ModelPart bomb21;
	private final ModelPart bomb22;
	private final ModelPart bone12;
	private final ModelPart bomb23;
	private final ModelPart bomb24;
	private final ModelPart bone13;
	private final ModelPart bomb25;
	private final ModelPart bomb26;
	private final ModelPart bone14;
	private final ModelPart bomb27;
	private final ModelPart bomb28;




public FireCrackersModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bombs = this.total.getChild("bombs");
		this.bone = this.bombs.getChild("bone");
		this.bomb1 = this.bone.getChild("bomb1");
		this.bomb2 = this.bone.getChild("bomb2");
		this.bone2 = this.bombs.getChild("bone2");
		this.bomb3 = this.bone2.getChild("bomb3");
		this.bomb4 = this.bone2.getChild("bomb4");
		this.bone3 = this.bombs.getChild("bone3");
		this.bomb5 = this.bone3.getChild("bomb5");
		this.bomb6 = this.bone3.getChild("bomb6");
		this.bone4 = this.bombs.getChild("bone4");
		this.bomb7 = this.bone4.getChild("bomb7");
		this.bomb8 = this.bone4.getChild("bomb8");
		this.bone5 = this.bombs.getChild("bone5");
		this.bomb9 = this.bone5.getChild("bomb9");
		this.bomb10 = this.bone5.getChild("bomb10");
		this.bone6 = this.bombs.getChild("bone6");
		this.bomb11 = this.bone6.getChild("bomb11");
		this.bomb12 = this.bone6.getChild("bomb12");
		this.bone7 = this.bombs.getChild("bone7");
		this.bomb13 = this.bone7.getChild("bomb13");
		this.bomb14 = this.bone7.getChild("bomb14");
		this.bone8 = this.bombs.getChild("bone8");
		this.bomb15 = this.bone8.getChild("bomb15");
		this.bomb16 = this.bone8.getChild("bomb16");
		this.bone9 = this.bombs.getChild("bone9");
		this.bomb17 = this.bone9.getChild("bomb17");
		this.bomb18 = this.bone9.getChild("bomb18");
		this.bone10 = this.bombs.getChild("bone10");
		this.bomb19 = this.bone10.getChild("bomb19");
		this.bomb20 = this.bone10.getChild("bomb20");
		this.bone11 = this.bombs.getChild("bone11");
		this.bomb21 = this.bone11.getChild("bomb21");
		this.bomb22 = this.bone11.getChild("bomb22");
		this.bone12 = this.bombs.getChild("bone12");
		this.bomb23 = this.bone12.getChild("bomb23");
		this.bomb24 = this.bone12.getChild("bomb24");
		this.bone13 = this.bombs.getChild("bone13");
		this.bomb25 = this.bone13.getChild("bomb25");
		this.bomb26 = this.bone13.getChild("bomb26");
		this.bone14 = this.bombs.getChild("bone14");
		this.bomb27 = this.bone14.getChild("bomb27");
		this.bomb28 = this.bone14.getChild("bomb28");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 46).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(-0.8F))
				.texOffs(0, 46).addBox(-1.0F, -1.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)),
			PartPose.offsetAndRotation(0.0F, 21.25F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bombs_pd = total_pd.addOrReplaceChild("bombs",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition bone_pd = bombs_pd.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 8.0F));
		PartDefinition bomb1_pd = bone_pd.addOrReplaceChild("bomb1",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb2_pd = bone_pd.addOrReplaceChild("bomb2",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone2_pd = bombs_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition bomb3_pd = bone2_pd.addOrReplaceChild("bomb3",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb4_pd = bone2_pd.addOrReplaceChild("bomb4",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone3_pd = bombs_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 6.0F));
		PartDefinition bomb5_pd = bone3_pd.addOrReplaceChild("bomb5",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, -2.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, -2.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb6_pd = bone3_pd.addOrReplaceChild("bomb6",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, 0.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, 0.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone4_pd = bombs_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition bomb7_pd = bone4_pd.addOrReplaceChild("bomb7",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, -2.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, -2.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb8_pd = bone4_pd.addOrReplaceChild("bomb8",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, 0.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, 0.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone5_pd = bombs_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition bomb9_pd = bone5_pd.addOrReplaceChild("bomb9",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-6.0F, -2.0F, -4.4641F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-4.0F, -2.0F, -4.4641F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb10_pd = bone5_pd.addOrReplaceChild("bomb10",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-6.0F, -2.0F, 2.4641F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-4.0F, -2.0F, 2.4641F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone6_pd = bombs_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition bomb11_pd = bone6_pd.addOrReplaceChild("bomb11",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-7.0F, -2.0F, -6.1962F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-5.0F, -2.0F, -6.1962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb12_pd = bone6_pd.addOrReplaceChild("bomb12",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-7.0F, -2.0F, 4.1962F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-5.0F, -2.0F, 4.1962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone7_pd = bombs_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 4.0F));
		PartDefinition bomb13_pd = bone7_pd.addOrReplaceChild("bomb13",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-8.0F, -2.0F, -7.9282F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-6.0F, -2.0F, -7.9282F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 0.0F, -1.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb14_pd = bone7_pd.addOrReplaceChild("bomb14",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-8.0F, -2.0F, 5.9282F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-6.0F, -2.0F, 5.9282F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 0.0F, -1.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone8_pd = bombs_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb15_pd = bone8_pd.addOrReplaceChild("bomb15",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb16_pd = bone8_pd.addOrReplaceChild("bomb16",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-4.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone9_pd = bombs_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb17_pd = bone9_pd.addOrReplaceChild("bomb17",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, -2.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, -2.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb18_pd = bone9_pd.addOrReplaceChild("bomb18",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-5.0F, -2.0F, 0.7321F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-3.0F, -2.0F, 0.7321F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone10_pd = bombs_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb19_pd = bone10_pd.addOrReplaceChild("bomb19",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-6.0F, -2.0F, -4.4641F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-4.0F, -2.0F, -4.4641F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb20_pd = bone10_pd.addOrReplaceChild("bomb20",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-6.0F, -2.0F, 2.4641F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-4.0F, -2.0F, 2.4641F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone11_pd = bombs_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb21_pd = bone11_pd.addOrReplaceChild("bomb21",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-7.0F, -2.0F, -6.1962F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-5.0F, -2.0F, -6.1962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb22_pd = bone11_pd.addOrReplaceChild("bomb22",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-7.0F, -2.0F, 4.1962F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-5.0F, -2.0F, 4.1962F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone12_pd = bombs_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb23_pd = bone12_pd.addOrReplaceChild("bomb23",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-8.0F, -2.0F, -7.9282F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-6.0F, -2.0F, -7.9282F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb24_pd = bone12_pd.addOrReplaceChild("bomb24",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-8.0F, -2.0F, 5.9282F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-6.0F, -2.0F, 5.9282F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone13_pd = bombs_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb25_pd = bone13_pd.addOrReplaceChild("bomb25",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-9.0F, -2.0F, -9.6603F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-7.0F, -2.0F, -9.6603F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb26_pd = bone13_pd.addOrReplaceChild("bomb26",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-9.0F, -2.0F, 7.6603F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-7.0F, -2.0F, 7.6603F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		PartDefinition bone14_pd = bombs_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 6.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition bomb27_pd = bone14_pd.addOrReplaceChild("bomb27",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-10.0F, -2.0F, -11.3923F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-8.0F, -2.0F, -11.3923F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bomb28_pd = bone14_pd.addOrReplaceChild("bomb28",
			CubeListBuilder.create()
				.texOffs(0, 58).addBox(-10.0F, -2.0F, 9.3923F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
				.texOffs(0, 54).addBox(-8.0F, -2.0F, 9.3923F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.82F)),
			PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, 0.0F, -2.618F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(FireCrackersEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}