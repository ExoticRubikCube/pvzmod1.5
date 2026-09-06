package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.ConeHeadZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ConeHeadZombieModel extends PVZZombieModel<ConeHeadZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "conehead_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart defence;
	private final ModelPart defence1;
	private final ModelPart defence2;
	private final ModelPart defence3;




public ConeHeadZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.defence = this.head.getChild("defence");
		this.defence1 = this.defence.getChild("defence1");
		this.defence2 = this.defence.getChild("defence2");
		this.defence3 = this.defence.getChild("defence3");
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
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 41).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(96, 60).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -44.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(96, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -44.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(16, 96).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -48.0F, 0.0F));
		PartDefinition defence_pd = head_pd.addOrReplaceChild("defence",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition defence1_pd = defence_pd.addOrReplaceChild("defence1",
			CubeListBuilder.create()
				.texOffs(139, 2).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 2.0F, 16.0F)
				.texOffs(216, 4).addBox(-9.0F, -3.0F, -9.0F, 18.0F, 3.0F, 1.0F)
				.texOffs(215, 15).addBox(-9.0F, -3.0F, 8.0F, 18.0F, 3.0F, 1.0F)
				.texOffs(139, 30).addBox(-9.0F, -3.0F, -8.0F, 1.0F, 3.0F, 16.0F)
				.texOffs(181, 28).addBox(8.0F, -3.0F, -8.0F, 1.0F, 3.0F, 16.0F)
				.texOffs(139, 56).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 6.0F, 14.0F),
			PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition defence2_pd = defence_pd.addOrReplaceChild("defence2",
			CubeListBuilder.create()
				.texOffs(142, 81).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 4.0F, 6.0F)
				.texOffs(217, 26).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 5.0F, 10.0F),
			PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition defence3_pd = defence_pd.addOrReplaceChild("defence3",
			CubeListBuilder.create()
				.texOffs(205, 59).addBox(-2.0F, -37.0F, -2.0F, 4.0F, 3.0F, 4.0F)
				.texOffs(234, 60).addBox(-1.0F, -39.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offset(0.0F, 17.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	
	@Override
	public void updateFreeParts(ConeHeadZombieEntity entity) {
		super.updateFreeParts(entity);
		this.defence3.visible = entity.hasConeHead(3);
		this.defence2.visible = entity.hasConeHead(2);
		this.defence1.visible = entity.hasConeHead(1);
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
	
	@Override
	public Optional<ModelPart> getHelmet() {
		return Optional.ofNullable(this.defence);
	}

}