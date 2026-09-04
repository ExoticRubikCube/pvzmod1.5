package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.ChomperEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ChomperModel extends PVZPlantModel<ChomperEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(PVZMod.MOD_ID, "chomper"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone22;
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
	private final ModelPart root;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;




	public ChomperModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone22 = this.bone3.getChild("bone22");
		this.head = this.body.getChild("head");
		this.bone14 = this.head.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.up_mouse = this.head.getChild("up_mouse");
		this.bone9 = this.up_mouse.getChild("bone9");
		this.bone8 = this.bone9.getChild("bone8");
		this.bone10 = this.up_mouse.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone12 = this.up_mouse.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.down_mouse = this.head.getChild("down_mouse");
		this.leaf = this.head.getChild("leaf");
		this.bone16 = this.leaf.getChild("bone16");
		this.bone17 = this.leaf.getChild("bone17");
		this.bone18 = this.leaf.getChild("bone18");
		this.bone19 = this.leaf.getChild("bone19");
		this.bone20 = this.leaf.getChild("bone20");
		this.bone21 = this.leaf.getChild("bone21");
		this.tongue = this.head.getChild("tongue");
		this.tongue2 = this.tongue.getChild("tongue2");
		this.root = this.total.getChild("root");
		this.bone4 = this.root.getChild("bone4");
		this.bone5 = this.root.getChild("bone5");
		this.bone6 = this.root.getChild("bone6");
		this.bone7 = this.root.getChild("bone7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(2, 118).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 7.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone_pd = body_pd.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(14, 118).addBox(-1.0F, 2.5352F, 3.5905F, 2.0F, 6.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -16.9572F, 1.3474F, -0.6545F, 0.0F, 0.0F));
		PartDefinition bone2_pd = bone_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create()
				.texOffs(27, 116).addBox(-1.0F, -1.07F, 0.2365F, 2.0F, 2.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -2.8145F, -0.7628F, -0.829F, 0.0F, 0.0F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(49, 118).addBox(-1.0F, -7.5847F, 0.6528F, 2.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 3.3053F, -5.9933F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bone22_pd = bone3_pd.addOrReplaceChild("bone22",
			CubeListBuilder.create()
				.texOffs(61, 120).addBox(-1.0F, -1.7939F, -9.8869F, 2.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 4.7601F, -3.6526F, -2.4871F, 0.0F, 0.0F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(72, 113).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 10.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -22.0F, -2.0F, 0.25F, 0.0F, 0.0F));
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
			PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, -0.5236F, 0.0F, 0.0F));
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
			PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
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
		PartDefinition root_pd = total_pd.addOrReplaceChild("root",
			CubeListBuilder.create()
				.texOffs(44, 52).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone4_pd = root_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(68, 50).addBox(-7.0F, -1.0F, -2.0F, 7.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone5_pd = root_pd.addOrReplaceChild("bone5",
			CubeListBuilder.create()
				.texOffs(97, 50).addBox(0.0F, -1.0F, -2.0F, 7.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition bone6_pd = root_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(102, 37).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone7_pd = root_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(75, 38).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(ChomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		final int T = ChomperEntity.ATTACK_ANIM_CD;
		if(tick > 0 && tick <= T / 2) {//1 - 10
			this.body.xRot = 0.05f * tick;//0.5
			this.head.xRot = 0.25f - 0.075f * tick;//0.25 - -0.5
			if(tick <= T / 3) {//1 - 6
				this.up_mouse.xRot = - 0.52f - 0.05f*tick;
				this.down_mouse.xRot = 0.52f + 0.05f*tick;
			}else {// 7 - 10 ( 1 - 4)
				float tmp = tick - T * 2f / 3;
				this.up_mouse.xRot = - 0.82f + 0.2f * tmp;
				this.down_mouse.xRot = 0.82f - 0.2f * tmp;
			}
		} else if(tick > T / 2){// 11 - 20 (1 - 10)
			final int tmp = tick - T / 2;
			this.body.xRot = 0.5f - 0.05f * tmp;
			this.head.xRot = - 0.5f + 0.075f * tmp;
			this.up_mouse.xRot = -0.05f * tmp;
			this.down_mouse.xRot = 0.05f * tmp;
		} else {
			this.body.xRot = 0;
			if(entity.getRestTick() > 0) {
				this.tongue.xRot = entity.getRandom().nextFloat() - 0.5f;
				this.tongue2.xRot = entity.getRandom().nextFloat() - 0.5f;
				this.head.xRot = 1.04f;
				this.up_mouse.xRot = - 0.15f;
				this.down_mouse.xRot = 0.15f;
				this.leaf.zRot = 0.52f;
			}else {
				this.tongue.xRot = 0;
				this.tongue2.xRot = 0;
				this.head.xRot = 0.25f;
				this.up_mouse.xRot = -0.52f;
				this.down_mouse.xRot = 0.52f;
				this.leaf.zRot = 0;
			}
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<ChomperEntity> getPlantModel() {
		return this;
	}
	
}