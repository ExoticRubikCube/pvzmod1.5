package com.hungteen.pvz.client.model.entity.zombie.zombotany;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.GatlingPeaZombieEntity;
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
public class GatlingPeaZombieModel extends PVZZombieModel<GatlingPeaZombieEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "gatlingpea_zombie"), "main");

	private final ModelPart total;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart up;
	private final ModelPart body;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart head;
	private final ModelPart gar;
	private final ModelPart helmet;
	private final ModelPart bone;
	private final ModelPart bone2;




public GatlingPeaZombieModel(ModelPart root) {
		this.total = root.getChild("total");
		this.right_leg = this.total.getChild("right_leg");
		this.left_leg = this.total.getChild("left_leg");
		this.up = this.total.getChild("up");
		this.body = this.up.getChild("body");
		this.left_hand = this.up.getChild("left_hand");
		this.right_hand = this.up.getChild("right_hand");
		this.head = this.up.getChild("head");
		this.gar = this.head.getChild("gar");
		this.helmet = this.head.getChild("helmet");
		this.bone = this.helmet.getChild("bone");
		this.bone2 = this.helmet.getChild("bone2");
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
				.texOffs(4, 243).addBox(-5.0F, -10.0F, 7.0F, 10.0F, 10.0F, 1.0F)
				.texOffs(200, 224).addBox(-7.0F, -12.0F, -7.0F, 14.0F, 14.0F, 14.0F)
				.texOffs(183, 236).addBox(7.0F, -10.0F, -5.0F, 1.0F, 10.0F, 6.0F)
				.texOffs(164, 234).addBox(-8.0F, -10.0F, -5.0F, 1.0F, 10.0F, 6.0F)
				.texOffs(122, 241).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 1.0F, 10.0F)
				.texOffs(224, 190).addBox(-3.0F, -6.0F, -17.0F, 6.0F, 6.0F, 10.0F)
				.texOffs(234, 169).addBox(-4.0F, -6.0F, -17.0F, 1.0F, 6.0F, 10.0F)
				.texOffs(179, 203).addBox(-3.0F, -7.0F, -17.0F, 6.0F, 1.0F, 10.0F)
				.texOffs(198, 177).addBox(3.0F, -6.0F, -17.0F, 1.0F, 6.0F, 10.0F)
				.texOffs(144, 187).addBox(-3.0F, 0.0F, -17.0F, 6.0F, 1.0F, 10.0F),
			PartPose.offset(0.0F, -26.0F, -1.0F));
		PartDefinition gar_pd = head_pd.addOrReplaceChild("gar",
			CubeListBuilder.create()
				.texOffs(102, 244).addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F)
				.texOffs(83, 246).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 2.0F, 5.0F)
				.texOffs(64, 246).addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F)
				.texOffs(44, 245).addBox(-1.0F, 1.0F, -5.0F, 2.0F, 2.0F, 5.0F),
			PartPose.offset(0.0F, -3.0F, -17.0F));
		PartDefinition helmet_pd = head_pd.addOrReplaceChild("helmet",
			CubeListBuilder.create()
				.texOffs(4, 222).addBox(-9.0F, -12.0F, 1.0F, 2.0F, 15.0F, 2.0F)
				.texOffs(21, 221).addBox(7.0F, -13.0F, 1.0F, 2.0F, 16.0F, 2.0F)
				.texOffs(32, 219).addBox(-9.0F, -15.0F, -8.0F, 18.0F, 3.0F, 18.0F)
				.texOffs(112, 210).addBox(-8.0F, -12.0F, 3.0F, 16.0F, 13.0F, 8.0F)
				.texOffs(2, 194).addBox(-8.0F, -17.0F, -7.0F, 16.0F, 2.0F, 16.0F)
				.texOffs(2, 176).addBox(-6.0F, -19.0F, -5.0F, 12.0F, 2.0F, 12.0F)
				.texOffs(230, 210).addBox(-4.0F, 2.0F, -7.0F, 8.0F, 4.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone_pd = helmet_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(77, 211).addBox(-0.5255F, -0.4837F, -3.3539F, 9.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(-7.0F, 2.0F, 2.0F, 0.0F, 0.7854F, 0.4363F));
		PartDefinition bone2_pd = helmet_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(176, 224).addBox(-7.8337F, -1.0611F, -3.9948F, 9.0F, 1.0F, 2.0F),
			PartPose.offsetAndRotation(7.0F, 3.0F, 2.0F, 0.0F, -0.7854F, -0.4363F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(GatlingPeaZombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.gar.zRot = ageInTicks / 5;
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