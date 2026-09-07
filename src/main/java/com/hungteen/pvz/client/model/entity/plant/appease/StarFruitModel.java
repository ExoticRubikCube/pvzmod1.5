package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.appease.StarFruitEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class StarFruitModel extends PVZPlantModel<StarFruitEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "star_fruit"), "main");

	private final ModelPart total;
	private final ModelPart base;
	private final ModelPart leave;
	private final ModelPart cube_r1;
	private final ModelPart leave2;
	private final ModelPart cube_r2;
	private final ModelPart leave3;
	private final ModelPart cube_r3;
	private final ModelPart leave4;
	private final ModelPart cube_r4;
	private final ModelPart leave5;
	private final ModelPart cube_r5;
	private final ModelPart mainbody;
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart cube_r6;
	private final ModelPart body2;
	private final ModelPart cube_r7;
	private final ModelPart bone3;
	private final ModelPart body5;
	private final ModelPart cube_r8;
	private final ModelPart body6;
	private final ModelPart cube_r9;
	private final ModelPart bone4;
	private final ModelPart body7;
	private final ModelPart cube_r10;
	private final ModelPart body8;
	private final ModelPart cube_r11;
	private final ModelPart bone5;
	private final ModelPart body9;
	private final ModelPart cube_r12;
	private final ModelPart body10;
	private final ModelPart cube_r13;
	private final ModelPart bone2;
	private final ModelPart body3;
	private final ModelPart cube_r14;
	private final ModelPart body4;
	private final ModelPart cube_r15;
	private final ModelPart face;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart cube_r18;


	public StarFruitModel(ModelPart root) {
		this.total = root.getChild("total");
		this.base = this.total.getChild("base");
		this.leave = this.base.getChild("leave");
		this.cube_r1 = this.leave.getChild("cube_r1");
		this.leave2 = this.base.getChild("leave2");
		this.cube_r2 = this.leave2.getChild("cube_r2");
		this.leave3 = this.base.getChild("leave3");
		this.cube_r3 = this.leave3.getChild("cube_r3");
		this.leave4 = this.base.getChild("leave4");
		this.cube_r4 = this.leave4.getChild("cube_r4");
		this.leave5 = this.base.getChild("leave5");
		this.cube_r5 = this.leave5.getChild("cube_r5");
		this.mainbody = this.total.getChild("mainbody");
		this.bone = this.mainbody.getChild("bone");
		this.body = this.bone.getChild("body");
		this.cube_r6 = this.body.getChild("cube_r6");
		this.body2 = this.bone.getChild("body2");
		this.cube_r7 = this.body2.getChild("cube_r7");
		this.bone3 = this.mainbody.getChild("bone3");
		this.body5 = this.bone3.getChild("body5");
		this.cube_r8 = this.body5.getChild("cube_r8");
		this.body6 = this.bone3.getChild("body6");
		this.cube_r9 = this.body6.getChild("cube_r9");
		this.bone4 = this.mainbody.getChild("bone4");
		this.body7 = this.bone4.getChild("body7");
		this.cube_r10 = this.body7.getChild("cube_r10");
		this.body8 = this.bone4.getChild("body8");
		this.cube_r11 = this.body8.getChild("cube_r11");
		this.bone5 = this.mainbody.getChild("bone5");
		this.body9 = this.bone5.getChild("body9");
		this.cube_r12 = this.body9.getChild("cube_r12");
		this.body10 = this.bone5.getChild("body10");
		this.cube_r13 = this.body10.getChild("cube_r13");
		this.bone2 = this.mainbody.getChild("bone2");
		this.body3 = this.bone2.getChild("body3");
		this.cube_r14 = this.body3.getChild("cube_r14");
		this.body4 = this.bone2.getChild("body4");
		this.cube_r15 = this.body4.getChild("cube_r15");
		this.face = this.total.getChild("face");
		this.cube_r16 = this.face.getChild("cube_r16");
		this.cube_r17 = this.face.getChild("cube_r17");
		this.cube_r18 = this.face.getChild("cube_r18");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition base = total.addOrReplaceChild("base",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition leave = base.addOrReplaceChild("leave",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = leave.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leave2 = base.addOrReplaceChild("leave2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition cube_r2 = leave2.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leave3 = base.addOrReplaceChild("leave3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition cube_r3 = leave3.addOrReplaceChild("cube_r3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leave4 = base.addOrReplaceChild("leave4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition cube_r4 = leave4.addOrReplaceChild("cube_r4",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leave5 = base.addOrReplaceChild("leave5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition cube_r5 = leave5.addOrReplaceChild("cube_r5",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition mainbody = total.addOrReplaceChild("mainbody",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition bone = mainbody.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -2.425F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 0.6109F, 0.0F, -0.0873F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, 1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body2 = bone.addOrReplaceChild("body2",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 2.5307F, 0.0F, -0.0873F));
		PartDefinition cube_r7 = body2.addOrReplaceChild("cube_r7",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, -1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone3 = mainbody.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.425F, 0.0F, 0.0F, 1.2566F, 0.0F));
		PartDefinition body5 = bone3.addOrReplaceChild("body5",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 0.6109F, 0.0F, -0.0873F));
		PartDefinition cube_r8 = body5.addOrReplaceChild("cube_r8",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, 1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body6 = bone3.addOrReplaceChild("body6",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 2.5307F, 0.0F, -0.0873F));
		PartDefinition cube_r9 = body6.addOrReplaceChild("cube_r9",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, -1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone4 = mainbody.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.425F, 0.0F, 0.0F, -2.5133F, 0.0F));
		PartDefinition body7 = bone4.addOrReplaceChild("body7",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 0.6109F, 0.0F, -0.0873F));
		PartDefinition cube_r10 = body7.addOrReplaceChild("cube_r10",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, 1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body8 = bone4.addOrReplaceChild("body8",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 2.5307F, 0.0F, -0.0873F));
		PartDefinition cube_r11 = body8.addOrReplaceChild("cube_r11",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, -1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone5 = mainbody.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.425F, 0.0F, 0.0F, 2.5133F, 0.0F));
		PartDefinition body9 = bone5.addOrReplaceChild("body9",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 0.6109F, 0.0F, -0.0873F));
		PartDefinition cube_r12 = body9.addOrReplaceChild("cube_r12",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, 1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body10 = bone5.addOrReplaceChild("body10",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 2.5307F, 0.0F, -0.0873F));
		PartDefinition cube_r13 = body10.addOrReplaceChild("cube_r13",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, -1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone2 = mainbody.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -2.425F, 0.0F, 0.0F, -1.2566F, 0.0F));
		PartDefinition body3 = bone2.addOrReplaceChild("body3",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 0.6109F, 0.0F, -0.0873F));
		PartDefinition cube_r14 = body3.addOrReplaceChild("cube_r14",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, 1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body4 = bone2.addOrReplaceChild("body4",
			CubeListBuilder.create()
				.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
			PartPose.offsetAndRotation(0.01F, -0.0034F, 0.0F, 2.5307F, 0.0F, -0.0873F));
		PartDefinition cube_r15 = body4.addOrReplaceChild("cube_r15",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F)
				.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F)
				.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-4.546F, -1.01F, -3.1909F, 0.0F, 0.3927F, 0.0F));
		PartDefinition face = total.addOrReplaceChild("face",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition cube_r16 = face.addOrReplaceChild("cube_r16",
			CubeListBuilder.create()
				.texOffs(0, 12).addBox(-3.25F, -0.5F, -0.5F, 8.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -0.75F, -2.5F, 0.132F, -0.1298F, -0.0172F));
		PartDefinition cube_r17 = face.addOrReplaceChild("cube_r17",
			CubeListBuilder.create()
				.texOffs(18, 16).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(2.0F, -1.0F, 0.5F, 0.0324F, 0.1341F, 0.2668F));
		PartDefinition cube_r18 = face.addOrReplaceChild("cube_r18",
			CubeListBuilder.create()
				.texOffs(18, 16).addBox(-0.75F, -0.5F, -0.5F, 2.0F, 2.0F, 4.0F),
			PartPose.offsetAndRotation(-2.0F, -1.0F, 0.5F, 0.0324F, -0.1341F, -0.2668F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}


	@Override
	public void setupAnim(StarFruitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<StarFruitEntity> getPlantModel() {
		return this;
	}
	
}