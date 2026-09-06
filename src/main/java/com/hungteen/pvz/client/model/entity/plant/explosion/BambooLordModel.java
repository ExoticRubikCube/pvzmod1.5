package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.BambooLordEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class BambooLordModel extends PVZPlantModel<BambooLordEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "bamboo_lord"), "main");

	private final ModelPart total;
	private final ModelPart worm;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart body;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart down;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart head;
	private final ModelPart cube_r8;
	private final ModelPart face;
	private final ModelPart leaves;
	private final ModelPart leaf1;
	private final ModelPart cube_r9;
	private final ModelPart bone2;
	private final ModelPart cube_r10;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart leaf2;
	private final ModelPart cube_r11;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart leaf3;
	private final ModelPart cube_r12;
	private final ModelPart bone9;
	private final ModelPart bone10;




public BambooLordModel(ModelPart root) {
		this.total = root.getChild("total");
		this.worm = this.total.getChild("worm");
		this.cube_r1 = this.worm.getChild("cube_r1");
		this.cube_r2 = this.worm.getChild("cube_r2");
		this.cube_r3 = this.worm.getChild("cube_r3");
		this.body = this.total.getChild("body");
		this.cube_r4 = this.body.getChild("cube_r4");
		this.cube_r5 = this.body.getChild("cube_r5");
		this.down = this.body.getChild("down");
		this.cube_r6 = this.down.getChild("cube_r6");
		this.cube_r7 = this.down.getChild("cube_r7");
		this.head = this.body.getChild("head");
		this.cube_r8 = this.head.getChild("cube_r8");
		this.face = this.total.getChild("face");
		this.leaves = this.total.getChild("leaves");
		this.leaf1 = this.leaves.getChild("leaf1");
		this.cube_r9 = this.leaf1.getChild("cube_r9");
		this.bone2 = this.leaf1.getChild("bone2");
		this.cube_r10 = this.bone2.getChild("cube_r10");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.leaf2 = this.leaves.getChild("leaf2");
		this.cube_r11 = this.leaf2.getChild("cube_r11");
		this.bone6 = this.leaf2.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.leaf3 = this.leaves.getChild("leaf3");
		this.cube_r12 = this.leaf3.getChild("cube_r12");
		this.bone9 = this.leaf3.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition worm_pd = total_pd.addOrReplaceChild("worm",
			CubeListBuilder.create(),
			PartPose.offset(1.0F, -10.25F, 0.0F));
		PartDefinition cube_r1_pd = worm_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 18).addBox(-0.5F, 5.4F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-10.2695F, -6.5331F, 0.0F, 0.0F, 0.0F, -1.9199F));
		PartDefinition cube_r2_pd = worm_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(-1.0F, 4.8F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-7.3079F, -12.6447F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cube_r3_pd = worm_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(14, 30).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)),
			PartPose.offsetAndRotation(-2.25F, -8.5F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(24, 0).addBox(-2.25F, -9.0F, -4.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F))
				.texOffs(0, 14).addBox(-3.5F, -1.5F, -4.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(-0.1F))
				.texOffs(21, 21).addBox(-3.5F, -1.0F, -4.5F, 7.0F, 1.0F, 7.0F)
				.texOffs(0, 45).addBox(-2.0F, -13.25F, -3.0F, 5.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r4_pd = body_pd.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(21, 8).addBox(-3.0F, -0.7F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.25F)),
			PartPose.offsetAndRotation(0.6351F, -9.1122F, 1.001F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r5_pd = body_pd.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(21, 15).addBox(-2.0F, -3.7F, -8.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offsetAndRotation(1.0F, -9.0F, 5.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition down_pd = body_pd.addOrReplaceChild("down",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r6_pd = down_pd.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 23).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.0F, -0.25F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r7_pd = down_pd.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 8.0F, 6.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition head_pd = body_pd.addOrReplaceChild("head",
			CubeListBuilder.create(),
			PartPose.offset(-0.25F, 0.0F, 0.0F));
		PartDefinition cube_r8_pd = head_pd.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 30).addBox(2.0F, -7.7F, -5.0F, 1.0F, 8.0F, 6.0F)
				.texOffs(18, 29).addBox(-3.0F, -7.7F, -5.0F, 1.0F, 8.0F, 6.0F)
				.texOffs(32, 39).addBox(-2.0F, -7.7F, 0.0F, 4.0F, 8.0F, 1.0F)
				.texOffs(42, 42).addBox(-2.0F, -7.7F, -5.0F, 4.0F, 8.0F, 1.0F),
			PartPose.offsetAndRotation(1.0F, -9.0F, 1.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(21, 15).addBox(1.5F, -12.5F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(21, 17).addBox(-1.5F, -12.5F, -3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaves_pd = total_pd.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaf1_pd = leaves_pd.addOrReplaceChild("leaf1",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r9_pd = leaf1_pd.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(18, 18).addBox(0.0F, -2.0F, -4.0F, 0.0F, 2.0F, 5.0F),
			PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.1309F));
		PartDefinition bone2_pd = leaf1_pd.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r10_pd = bone2_pd.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(26, 26).addBox(0.0F, -2.0F, -3.5F, 0.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone3_pd = bone2_pd.addOrReplaceChild("bone3",
			CubeListBuilder.create()
				.texOffs(0, 13).addBox(-5.0F, -6.0F, -3.0F, 0.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(1.162F, -1.906F, 0.1305F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone4_pd = bone3_pd.addOrReplaceChild("bone4",
			CubeListBuilder.create()
				.texOffs(4, 4).addBox(-5.0F, -7.0F, -2.0F, 0.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaf2_pd = leaves_pd.addOrReplaceChild("leaf2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 2.0F, 1.0F, 0.0F, -1.5708F, 0.0436F));
		PartDefinition cube_r11_pd = leaf2_pd.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(18, 21).addBox(0.0F, -2.0F, -3.5F, 0.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone6_pd = leaf2_pd.addOrReplaceChild("bone6",
			CubeListBuilder.create()
				.texOffs(0, 11).addBox(-5.0F, -6.0F, -3.0F, 0.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(1.162F, -1.906F, 0.1305F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone7_pd = bone6_pd.addOrReplaceChild("bone7",
			CubeListBuilder.create()
				.texOffs(2, 4).addBox(-5.0F, -7.0F, -2.0F, 0.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaf3_pd = leaves_pd.addOrReplaceChild("leaf3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-2.0F, 2.0F, -2.0F, 3.1416F, 0.0F, -3.098F));
		PartDefinition cube_r12_pd = leaf3_pd.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(18, 0).addBox(0.0F, -2.0F, -3.5F, 0.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone9_pd = leaf3_pd.addOrReplaceChild("bone9",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-5.0F, -6.0F, -3.0F, 0.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(1.162F, -1.906F, 0.1305F, 0.0F, 0.0F, -0.4363F));
		PartDefinition bone10_pd = bone9_pd.addOrReplaceChild("bone10",
			CubeListBuilder.create()
				.texOffs(0, 4).addBox(-5.0F, -7.0F, -2.0F, 0.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(BambooLordEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.worm.visible = (entity.getAttackTime() == 0);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<BambooLordEntity> getPlantModel() {
		return this;
	}
}