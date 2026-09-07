package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.GloomShroomEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class GloomShroomModel extends PVZPlantModel<GloomShroomEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "gloom_shroom"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart face;
	private final ModelPart shoot;
	private final ModelPart shoot1;
	private final ModelPart shoot5;
	private final ModelPart shoot2;
	private final ModelPart shoot4;
	private final ModelPart shoot3_r1;
	private final ModelPart shoot6;
	private final ModelPart shoot4_r1;
	private final ModelPart shoot3;
	private final ModelPart shoot7;
	private final ModelPart shoot8;


	public GloomShroomModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.face = this.head.getChild("face");
		this.shoot = this.head.getChild("shoot");
		this.shoot1 = this.shoot.getChild("shoot1");
		this.shoot5 = this.shoot.getChild("shoot5");
		this.shoot2 = this.shoot.getChild("shoot2");
		this.shoot4 = this.shoot.getChild("shoot4");
		this.shoot3_r1 = this.shoot4.getChild("shoot3_r1");
		this.shoot6 = this.shoot.getChild("shoot6");
		this.shoot4_r1 = this.shoot6.getChild("shoot4_r1");
		this.shoot3 = this.shoot.getChild("shoot3");
		this.shoot7 = this.shoot.getChild("shoot7");
		this.shoot8 = this.shoot.getChild("shoot8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 22).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 5.0F, 12.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 40).addBox(-6.5F, -8.0F, -6.5F, 13.0F, 7.0F, 13.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 0).addBox(-7.5F, -7.75F, -7.5F, 15.0F, 7.0F, 15.0F),
			PartPose.offsetAndRotation(0.0F, -3.0F, 0.5F, 0.2182F, 0.0F, 0.0F));
		PartDefinition face = head.addOrReplaceChild("face",
			CubeListBuilder.create()
				.texOffs(36, 22).addBox(-6.0F, -12.0F, 0.0F, 4.0F, 1.0F, 4.0F)
				.texOffs(36, 22).mirror().addBox(2.0F, -12.0F, 0.0F, 4.0F, 1.0F, 4.0F),
			PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition shoot = head.addOrReplaceChild("shoot",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition shoot1 = shoot.addOrReplaceChild("shoot1",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offset(0.0F, -8.5F, -7.25F));
		PartDefinition shoot5 = shoot.addOrReplaceChild("shoot5",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.25F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).addBox(-2.5F, -2.5F, 1.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offset(0.0F, -8.5F, 7.25F));
		PartDefinition shoot2 = shoot.addOrReplaceChild("shoot2",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(-6.0F, -8.5F, -6.25F, 0.0F, 0.7854F, 0.0F));
		PartDefinition shoot4 = shoot.addOrReplaceChild("shoot4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-6.0F, -8.5F, -6.25F, 0.0F, 0.7854F, 0.0F));
		PartDefinition shoot3_r1 = shoot4.addOrReplaceChild("shoot3_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -11.0F, -12.0F, 5.0F, 5.0F, 2.0F)
				.texOffs(0, 7).addBox(-3.0F, -10.0F, -10.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.0F, 8.5F, 7.25F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot6 = shoot.addOrReplaceChild("shoot6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(6.0F, -8.5F, -6.25F, 0.0F, -0.7854F, 0.0F));
		PartDefinition shoot4_r1 = shoot6.addOrReplaceChild("shoot4_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.0F, -11.0F, -12.0F, 5.0F, 5.0F, 2.0F)
				.texOffs(0, 7).mirror().addBox(0.0F, -10.0F, -10.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.0F, 8.5F, 7.25F, 0.0F, -1.5708F, 0.0F));
		PartDefinition shoot3 = shoot.addOrReplaceChild("shoot3",
			CubeListBuilder.create()
				.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(-7.5F, -8.5F, -0.25F, 0.0F, 1.5708F, 0.0F));
		PartDefinition shoot7 = shoot.addOrReplaceChild("shoot7",
			CubeListBuilder.create()
				.texOffs(0, 7).mirror().addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).mirror().addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(7.5F, -8.5F, -0.25F, 0.0F, -1.5708F, 0.0F));
		PartDefinition shoot8 = shoot.addOrReplaceChild("shoot8",
			CubeListBuilder.create()
				.texOffs(0, 7).mirror().addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.2F))
				.texOffs(0, 0).mirror().addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F),
			PartPose.offsetAndRotation(6.0F, -8.5F, -6.25F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(GloomShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GloomShroomEntity> getPlantModel() {
		return this;
	}
}