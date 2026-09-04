package com.hungteen.pvz.client.model.entity.zombie.pool;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.DiggerZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class DiggerZombieModel extends PVZZombieModel<DiggerZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "digger_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart pickaxe;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart hat;




public DiggerZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.pickaxe = this.right_hand.getChild("pickaxe");
		this.bone = this.pickaxe.getChild("bone");
		this.head = this.up.getChild("head");
		this.hat = this.head.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(221, 221).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(182, 220).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(122, 217).addBox(-8.0F, -17.0F, -5.0F, 16.0F, 24.0F, 11.0F),
			PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(83, 220).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(12.0F, -20.0F, 0.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(43, 219).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F),
			PartPose.offset(-12.0F, -20.0F, 0.0F));
		PartDefinition pickaxe_pd = right_hand_pd.addOrReplaceChild("pickaxe",
			CubeListBuilder.create()
				.texOffs(8, 231).addBox(-1.0F, -11.0434F, -18.753799F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.1F))
				.texOffs(193, 177).addBox(-1.0F, -1.0F, -19.0F, 2.0F, 2.0F, 28.0F, new CubeDeformation(-0.1F)),
			PartPose.offsetAndRotation(0.0F, 18.5858F, -6.2426F, -0.1745F, 0.0F, 0.0F));
		PartDefinition bone_pd = pickaxe_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(27, 243).addBox(-1.0F, -1.1439F, -0.1677F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(0.0F, 6.0F, -18.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(118, 177).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition hat_pd = head_pd.addOrReplaceChild("hat",
			CubeListBuilder.create()
				.texOffs(44, 192).addBox(-9.0F, -1.0F, -8.0F, 18.0F, 1.0F, 17.0F)
				.texOffs(52, 173).addBox(-8.0F, -3.0F, -6.0F, 16.0F, 2.0F, 12.0F)
				.texOffs(57, 159).addBox(-8.0F, -5.0F, -3.0F, 16.0F, 2.0F, 7.0F)
				.texOffs(120, 168).addBox(-8.0F, -6.0F, 0.0F, 16.0F, 1.0F, 3.0F)
				.texOffs(170, 161).addBox(-1.0F, -4.0F, -9.0F, 2.0F, 2.0F, 6.0F)
				.texOffs(200, 161).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 4.0F, 2.0F)
				.texOffs(213, 143).addBox(-9.0F, 0.0F, 8.0F, 18.0F, 2.0F, 1.0F)
				.texOffs(166, 143).addBox(-9.0F, 0.0F, -9.0F, 18.0F, 1.0F, 1.0F)
				.texOffs(123, 131).addBox(8.0F, 0.0F, -8.0F, 1.0F, 1.0F, 16.0F)
				.texOffs(79, 132).addBox(-9.0F, 0.0F, -8.0F, 1.0F, 1.0F, 16.0F),
			PartPose.offset(0.0F, -16.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(DiggerZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0 && entity.getAttackTime() < DiggerZombieEntity.MAX_OUT_TIME) {
			total.yRot = ageInTicks;
		} else {
			total.yRot = 0;
		}
		if(entity.hasPickaxe()) {
	        this.right_hand.xRot = - 1.57F + Mth.sin(ageInTicks) * 0.5F;
		} else {
			this.right_hand.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		}
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.pickaxe.visible = entity.hasMetal();
	}
	
	@Override
	public void updateFreeParts(DiggerZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean hasPickaxe = entity.hasPickaxe();
		this.pickaxe.visible = hasPickaxe;
		this.isRightHandFree = ! hasPickaxe;
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