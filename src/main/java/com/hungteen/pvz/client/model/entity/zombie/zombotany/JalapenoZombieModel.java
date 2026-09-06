package com.hungteen.pvz.client.model.entity.zombie.zombotany;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.JalapenoZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class JalapenoZombieModel extends PVZZombieModel<JalapenoZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "jalapeno_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;




public JalapenoZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.bone8 = this.head.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone11 = this.head.getChild("bone11");
		this.bone12 = this.bone11.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone14 = this.bone13.getChild("bone14");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(44, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(96, 60).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(191, 221).addBox(-8.0F, -21.0F, -8.0F, 16.0F, 16.0F, 16.0F)
				.texOffs(194, 196).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 2.0F, 14.0F)
				.texOffs(202, 168).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F)
				.texOffs(210, 141).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 4.0F, 10.0F)
				.texOffs(212, 114).addBox(-4.0F, 4.0F, -5.0F, 8.0F, 5.0F, 8.0F)
				.texOffs(225, 95).addBox(-3.0F, 9.0F, -6.0F, 5.0F, 4.0F, 7.0F)
				.texOffs(224, 70).addBox(-3.0F, 13.0F, -8.0F, 6.0F, 3.0F, 7.0F)
				.texOffs(227, 54).addBox(-3.0F, 16.0F, -12.0F, 6.0F, 3.0F, 8.0F)
				.texOffs(72, 237).addBox(-7.0F, -22.0F, -7.0F, 14.0F, 1.0F, 14.0F)
				.texOffs(10, 235).addBox(-6.0F, -23.0F, -6.0F, 12.0F, 1.0F, 12.0F),
			PartPose.offset(0.0F, -24.0F, -2.0F));
		PartDefinition bone8_pd = head_pd.addOrReplaceChild("bone8",
			CubeListBuilder.create()
				.texOffs(226, 32).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, 16.0F, -12.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition bone9_pd = bone8_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(164, 224).addBox(-2.0F, -0.6428F, -0.766F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.6981F, 0.0F, 0.0F));
		PartDefinition bone10_pd = bone9_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(150, 236).addBox(-1.0F, -0.0261F, -0.2521F, 2.0F, 4.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -0.0152F, 2.8264F, 0.9599F, 0.0F, 0.0F));
		PartDefinition bone11_pd = head_pd.addOrReplaceChild("bone11",
			CubeListBuilder.create()
				.texOffs(127, 207).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone12_pd = bone11_pd.addOrReplaceChild("bone12",
			CubeListBuilder.create()
				.texOffs(87, 213).addBox(-2.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(1.2247F, -5.2929F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone13_pd = bone12_pd.addOrReplaceChild("bone13",
			CubeListBuilder.create()
				.texOffs(58, 204).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(4.6375F, 2.1433F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition bone14_pd = bone13_pd.addOrReplaceChild("bone14",
			CubeListBuilder.create()
				.texOffs(101, 183).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.7071F, -0.1213F, 0.0F, 0.0F, 0.0F, -1.9199F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public ModelPart getZombieLeftHand() {
		return this.left_hand;
	}

	@Override
	public ModelPart getZombieRightHand() {
		return this.right_hand;
	}

	@Override
	public ModelPart getZombieLeftLeg() {
		return this.left_leg;
	}

	@Override
	public ModelPart getZombieRightLeg() {
		return this.right_leg;
	}

	@Override
	public ModelPart getZombieHead() {
		return this.head;
	}
	
	@Override
	public ModelPart getZombieUpBody() {
		return this.up;
	}

	@Override
	public ModelPart getZombieWholeBody() {
		return this.total;
	}
}