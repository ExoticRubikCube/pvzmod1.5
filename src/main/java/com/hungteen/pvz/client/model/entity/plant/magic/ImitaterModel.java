package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.ImitaterEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class ImitaterModel extends PVZPlantModel<ImitaterEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "imitater"), "main");

	private final ModelPart total;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart hands;
	private final ModelPart hand1;
	private final ModelPart hand2;
	private final ModelPart hand3;
	private final ModelPart hand4;
	private final ModelPart face;
	private final ModelPart cube_r3;




public ImitaterModel(ModelPart root) {
		this.total = root.getChild("total");
		this.body = this.total.getChild("body");
		this.head = this.total.getChild("head");
		this.cube_r1 = this.head.getChild("cube_r1");
		this.cube_r2 = this.head.getChild("cube_r2");
		this.hands = this.total.getChild("hands");
		this.hand1 = this.hands.getChild("hand1");
		this.hand2 = this.hands.getChild("hand2");
		this.hand3 = this.hands.getChild("hand3");
		this.hand4 = this.hands.getChild("hand4");
		this.face = this.total.getChild("face");
		this.cube_r3 = this.face.getChild("cube_r3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 53).addBox(-4.5F, -17.0F, -3.0F, 9.0F, 5.0F, 6.0F)
				.texOffs(30, 52).addBox(-4.5F, -6.25F, -3.0F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.4F))
				.texOffs(0, 41).addBox(-4.5F, -12.25F, -3.0F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.2F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_pd = total_pd.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 57).addBox(-1.0F, -2.25F, 0.0F, 1.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, -17.0F, 0.0F));
		PartDefinition cube_r1_pd = head_pd.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(48, 35).addBox(-4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 7.0F),
			PartPose.offsetAndRotation(-1.5F, -0.75F, -1.5F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r2_pd = head_pd.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(32, 43).addBox(-4.0F, -1.0F, -2.0F, 9.0F, 2.0F, 7.0F, new CubeDeformation(0.1F)),
			PartPose.offsetAndRotation(-0.75F, -0.5F, -1.5F, 0.0F, 0.0F, -0.1309F));
		PartDefinition hands_pd = total_pd.addOrReplaceChild("hands",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hand1_pd = hands_pd.addOrReplaceChild("hand1",
			CubeListBuilder.create()
				.texOffs(56, 56).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-4.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition hand2_pd = hands_pd.addOrReplaceChild("hand2",
			CubeListBuilder.create()
				.texOffs(56, 54).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 0.0F, 0.48F, -0.1745F));
		PartDefinition hand3_pd = hands_pd.addOrReplaceChild("hand3",
			CubeListBuilder.create()
				.texOffs(56, 52).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(4.0F, -3.0F, 0.0F, 0.0F, -2.6616F, 0.6981F));
		PartDefinition hand4_pd = hands_pd.addOrReplaceChild("hand4",
			CubeListBuilder.create()
				.texOffs(28, 56).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
			PartPose.offsetAndRotation(3.0F, -14.0F, 2.0F, 0.0F, 2.7053F, 0.6981F));
		PartDefinition face_pd = total_pd.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(31, 46).addBox(-3.5F, 2.0F, -4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(32, 53).addBox(-2.5F, 3.0F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(32, 53).addBox(1.5F, 3.0F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(24, 43).addBox(0.5F, 2.0F, -4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.45F)),
			PartPose.offset(0.0F, -18.0F, 0.5F));
		PartDefinition cube_r3_pd = face_pd.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 54).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F))
				.texOffs(32, 53).addBox(-4.5F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
			PartPose.offsetAndRotation(2.0F, 4.5F, -3.5F, -0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(ImitaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.total.yRot = ageInTicks / 3;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<ImitaterEntity> getPlantModel() {
		return this;
	}
}