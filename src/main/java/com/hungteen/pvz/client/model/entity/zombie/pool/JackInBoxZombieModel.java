package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.JackInBoxZombieEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

import java.util.Optional;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class JackInBoxZombieModel extends PVZZombieModel<JackInBoxZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "jack_in_box_zombie"), "main");

	private final ModelPart total;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart bone;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart box;
	private final ModelPart jack;
	private final ModelPart jack_head;
	private final ModelPart h1;
	private final ModelPart h3;
	private final ModelPart h2;
	private final ModelPart top;
	private final ModelPart cube_r1;




public JackInBoxZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.left_leg = this.total.getChild("left_leg");
		this.right_leg = this.total.getChild("right_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.bone = this.left_hand.getChild("bone");
		this.box = this.left_hand.getChild("box");
		this.jack = this.box.getChild("jack");
		this.jack_head = this.jack.getChild("jack_head");
		this.h1 = this.jack_head.getChild("h1");
		this.h3 = this.jack_head.getChild("h3");
		this.h2 = this.jack_head.getChild("h2");
		this.top = this.box.getChild("top");
		this.cube_r1 = this.top.getChild("cube_r1");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F)
				.texOffs(0, 31).addBox(-3.0F, 23.0F, -6.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(25, 0).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F)
				.texOffs(0, 35).addBox(-3.0F, 23.0F, -6.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(51, 0).addBox(-8.0F, -24.0F, -5.0F, 16.0F, 24.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(21, 31).addBox(-4.0F, -4.0F, -3.0F, 6.0F, 26.0F, 6.0F),
			PartPose.offsetAndRotation(12.0F, -20.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone_pd = left_hand_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(1, 40).addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition box_pd = left_hand_pd.addOrReplaceChild("box",
			CubeListBuilder.create()
				.texOffs(1, 97).addBox(-5.0F, -1.0F, -7.0F, 12.0F, 1.0F, 12.0F)
				.texOffs(75, 35).addBox(-5.0F, -11.0F, -7.0F, 1.0F, 10.0F, 12.0F)
				.texOffs(75, 59).addBox(6.0F, -11.0F, -7.0F, 1.0F, 10.0F, 12.0F)
				.texOffs(50, 69).addBox(-4.0F, -11.0F, -7.0F, 10.0F, 10.0F, 1.0F)
				.texOffs(58, 83).addBox(-4.0F, -11.0F, 4.0F, 10.0F, 10.0F, 1.0F),
			PartPose.offsetAndRotation(-10.0F, 27.0F, -3.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition jack_pd = box_pd.addOrReplaceChild("jack",
			CubeListBuilder.create()
				.texOffs(106, 1).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F),
			PartPose.offsetAndRotation(1.0F, -1.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition jack_head_pd = jack_pd.addOrReplaceChild("jack_head",
			CubeListBuilder.create()
				.texOffs(106, 22).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition h1_pd = jack_head_pd.addOrReplaceChild("h1",
			CubeListBuilder.create()
				.texOffs(106, 32).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition h3_pd = jack_head_pd.addOrReplaceChild("h3",
			CubeListBuilder.create()
				.texOffs(103, 40).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition h2_pd = jack_head_pd.addOrReplaceChild("h2",
			CubeListBuilder.create()
				.texOffs(104, 50).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition top_pd = box_pd.addOrReplaceChild("top",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(1.0F, -11.0F, -6.0F, 2.0944F, 0.0F, 0.0F));
		PartDefinition cube_r1_pd = top_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(2, 112).addBox(-2.0F, -1.0F, 0.0F, 10.0F, 1.0F, 11.0F),
			PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -2.0944F, 0.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(48, 35).addBox(-2.0F, -4.0F, -4.0F, 6.0F, 26.0F, 6.0F)
				.texOffs(2, 49).addBox(0.0F, 22.0F, 1.0F, 2.0F, 1.0F, 6.0F),
			PartPose.offsetAndRotation(-12.0F, -20.0F, 0.0F, -0.6981F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 68).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(JackInBoxZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		if(entity.getAttackTime() >= 0  && entity.getAttackTime() <= JackInBoxZombieEntity.JACK_EXPLODE_CD) {
			final int tick = JackInBoxZombieEntity.JACK_EXPLODE_CD - entity.getAttackTime();
			this.top.xRot = 2.0944F - tick / 10f;
		} else {
			this.top.xRot = 2.0944F;
			this.right_hand.xRot = Mth.sin(ageInTicks) / 4f - 1f;
		}
	}
	
	@Override
	public void renderBody(IBodyEntity entity, PoseStack stack, VertexConsumer buffer, int packedLight,
			int packedOverlay) {
		if(entity.getBodyType() == BodyType.HAND) {
			this.box.visible = false;
		}
		this.jack.visible = false;
		super.renderBody(entity, stack, buffer, packedLight, packedOverlay);
	}
	
	@Override
	public void updateFreeParts(JackInBoxZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasBox = entity.hasMetal();
		this.isLeftHandFree = ! hasBox;
		this.box.visible = hasBox;
		this.jack.visible = (entity.getAttackTime() >= 0 && entity.getAttackTime() < JackInBoxZombieEntity.JACK_EXPLODE_CD / 4);
	}
	
	@Override
	public Optional<ModelPart> getHandDefence() {
		return Optional.ofNullable(this.box);
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