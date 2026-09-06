package com.hungteen.pvz.client.model.entity.zombie.grass;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.OldZombieEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class OldZombieModel extends PVZZombieModel<OldZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "old_zombie"), "main");

	private final ModelPart total;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart bone3;
	private final ModelPart normal_eyes;
	private final ModelPart red_eyes;
	private final ModelPart right_hand;
	private final ModelPart left_hand;
	private final ModelPart paper;
	private final ModelPart bone2;
	private final ModelPart bone;




public OldZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.left_leg = this.total.getChild("left_leg");
		this.right_leg = this.total.getChild("right_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.head = this.up.getChild("head");
		this.bone3 = this.head.getChild("bone3");
		this.normal_eyes = this.head.getChild("normal_eyes");
		this.red_eyes = this.head.getChild("red_eyes");
		this.right_hand = this.up.getChild("right_hand");
		this.left_hand = this.up.getChild("left_hand");
		this.paper = this.right_hand.getChild("paper");
		this.bone2 = this.paper.getChild("bone2");
		this.bone = this.paper.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition left_leg_pd = total_pd.addOrReplaceChild("left_leg",
			CubeListBuilder.create()
				.texOffs(230, 225).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 22.0F, 6.0F)
				.texOffs(196, 242).addBox(-3.0F, 22.0F, -5.0F, 6.0F, 2.0F, 9.0F),
			PartPose.offset(4.0F, -24.0F, 0.0F));
		PartDefinition right_leg_pd = total_pd.addOrReplaceChild("right_leg",
			CubeListBuilder.create()
				.texOffs(230, 192).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 22.0F, 6.0F)
				.texOffs(191, 220).addBox(-3.0F, 22.0F, -5.0F, 6.0F, 2.0F, 9.0F),
			PartPose.offset(-4.0F, -24.0F, 0.0F));
		PartDefinition up_pd = total_pd.addOrReplaceChild("up",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition body_pd = up_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(3, 221).addBox(-8.0F, -24.0F, -4.0F, 16.0F, 24.0F, 8.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_pd = up_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(66, 182).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 14.0F, 14.0F)
				.texOffs(130, 207).addBox(-7.0F, -15.0F, 2.0F, 13.0F, 1.0F, 1.0F)
				.texOffs(169, 208).addBox(-6.0F, -15.0F, -3.0F, 13.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition bone3_pd = head_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(200, 188).addBox(-8.0F, -1.0F, -10.0F, 1.0F, 1.0F, 11.0F)
				.texOffs(140, 180).addBox(7.0F, -1.0F, -10.0F, 1.0F, 1.0F, 11.0F)
				.texOffs(183, 187).addBox(-7.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(206, 172).addBox(5.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(227, 175).addBox(-1.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F)
				.texOffs(241, 169).addBox(-5.0F, -2.0F, -10.0F, 4.0F, 3.0F, 1.0F)
				.texOffs(174, 175).addBox(1.0F, -2.0F, -10.0F, 4.0F, 3.0F, 1.0F),
			PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition normal_eyes_pd = head_pd.addOrReplaceChild("normal_eyes",
			CubeListBuilder.create()
				.texOffs(49, 178).addBox(-6.0F, -11.0F, 4.95F, 5.0F, 5.0F, 1.0F)
				.texOffs(50, 186).addBox(1.0F, -11.0F, 4.95F, 5.0F, 5.0F, 1.0F),
			PartPose.offset(0.0F, -2.0F, -12.0F));
		PartDefinition red_eyes_pd = head_pd.addOrReplaceChild("red_eyes",
			CubeListBuilder.create()
				.texOffs(49, 169).addBox(1.0F, -11.0F, 4.95F, 5.0F, 5.0F, 1.0F)
				.texOffs(50, 160).addBox(-6.0F, -11.0F, 4.95F, 5.0F, 5.0F, 1.0F),
			PartPose.offset(0.0F, -2.0F, -12.0F));
		PartDefinition right_hand_pd = up_pd.addOrReplaceChild("right_hand",
			CubeListBuilder.create()
				.texOffs(148, 222).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(-11.0F, -21.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition paper_pd = right_hand_pd.addOrReplaceChild("paper",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(11.0F, 16.0F, -10.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition bone2_pd = paper_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(88, 212).addBox(0.0F, -2.0F, -13.0F, 1.0F, 16.0F, 25.0F),
			PartPose.offsetAndRotation(10.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bone_pd = paper_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(5, 174).addBox(-1.0F, -2.0F, -13.0F, 1.0F, 15.0F, 25.0F),
			PartPose.offsetAndRotation(-10.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition left_hand_pd = up_pd.addOrReplaceChild("left_hand",
			CubeListBuilder.create()
				.texOffs(59, 221).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 24.0F, 6.0F),
			PartPose.offsetAndRotation(11.0F, -21.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void updateFreeParts(OldZombieEntity entity) {
		super.updateFreeParts(entity);
		final boolean isPaperDestroyed = entity.isAngry();
		this.isLeftHandFree = isPaperDestroyed;
		this.isRightHandFree = isPaperDestroyed;
		this.red_eyes.visible = isPaperDestroyed;
		this.normal_eyes.visible = ! isPaperDestroyed;
		this.paper.visible = ! isPaperDestroyed;
	}
	
	@Override
	public void refreshAnim() {
		this.getZombieLeftHand().xRot = -1.0472F;
		this.getZombieRightHand().xRot = -1.0472F;
	}
	
	@Override
	protected boolean isZombieAngry(OldZombieEntity entity) {
		return entity.isAngry() || super.isZombieAngry(entity);
	}
	
	@Override
	public Optional<ModelPart> getHandDefence() {
		return Optional.ofNullable(this.paper);
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