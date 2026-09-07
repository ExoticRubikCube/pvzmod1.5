package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.ButterPultEntity;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity.CornTypes;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class KernelPultModel<T extends KernelPultEntity> extends PVZPlantModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "kernel_pult"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart leaves;
	private final ModelPart leaves_r1;
	private final ModelPart bone;
	private final ModelPart leave1;
	private final ModelPart cube_r5_r1;
	private final ModelPart cube_r4_r1;
	private final ModelPart cube_r3_r1;
	private final ModelPart bone5;
	private final ModelPart leave5;
	private final ModelPart cube_r6_r1;
	private final ModelPart cube_r5_r2;
	private final ModelPart cube_r4_r2;
	private final ModelPart bone6;
	private final ModelPart leave6;
	private final ModelPart cube_r7_r1;
	private final ModelPart cube_r6_r2;
	private final ModelPart cube_r5_r3;
	private final ModelPart bone2;
	private final ModelPart leave2;
	private final ModelPart cube_r6_r3;
	private final ModelPart cube_r5_r4;
	private final ModelPart cube_r4_r3;
	private final ModelPart bone3;
	private final ModelPart leave3;
	private final ModelPart cube_r7_r2;
	private final ModelPart cube_r6_r4;
	private final ModelPart cube_r5_r5;
	private final ModelPart bone4;
	private final ModelPart leave4;
	private final ModelPart cube_r8_r1;
	private final ModelPart cube_r7_r3;
	private final ModelPart cube_r6_r5;
	private final ModelPart pult;
	private final ModelPart cube_r27;
	private final ModelPart cube_r27_r1;
	private final ModelPart cube_r28;
	private final ModelPart cube_r28_r1;
	private final ModelPart cube_r29;
	private final ModelPart basket;
	private final ModelPart butter;
	private final ModelPart kernel;


	public KernelPultModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.leaves = this.total.getChild("leaves");
		this.leaves_r1 = this.leaves.getChild("leaves_r1");
		this.bone = this.leaves.getChild("bone");
		this.leave1 = this.bone.getChild("leave1");
		this.cube_r5_r1 = this.leave1.getChild("cube_r5_r1");
		this.cube_r4_r1 = this.leave1.getChild("cube_r4_r1");
		this.cube_r3_r1 = this.leave1.getChild("cube_r3_r1");
		this.bone5 = this.leaves.getChild("bone5");
		this.leave5 = this.bone5.getChild("leave5");
		this.cube_r6_r1 = this.leave5.getChild("cube_r6_r1");
		this.cube_r5_r2 = this.leave5.getChild("cube_r5_r2");
		this.cube_r4_r2 = this.leave5.getChild("cube_r4_r2");
		this.bone6 = this.leaves.getChild("bone6");
		this.leave6 = this.bone6.getChild("leave6");
		this.cube_r7_r1 = this.leave6.getChild("cube_r7_r1");
		this.cube_r6_r2 = this.leave6.getChild("cube_r6_r2");
		this.cube_r5_r3 = this.leave6.getChild("cube_r5_r3");
		this.bone2 = this.leaves.getChild("bone2");
		this.leave2 = this.bone2.getChild("leave2");
		this.cube_r6_r3 = this.leave2.getChild("cube_r6_r3");
		this.cube_r5_r4 = this.leave2.getChild("cube_r5_r4");
		this.cube_r4_r3 = this.leave2.getChild("cube_r4_r3");
		this.bone3 = this.leaves.getChild("bone3");
		this.leave3 = this.bone3.getChild("leave3");
		this.cube_r7_r2 = this.leave3.getChild("cube_r7_r2");
		this.cube_r6_r4 = this.leave3.getChild("cube_r6_r4");
		this.cube_r5_r5 = this.leave3.getChild("cube_r5_r5");
		this.bone4 = this.leaves.getChild("bone4");
		this.leave4 = this.bone4.getChild("leave4");
		this.cube_r8_r1 = this.leave4.getChild("cube_r8_r1");
		this.cube_r7_r3 = this.leave4.getChild("cube_r7_r3");
		this.cube_r6_r5 = this.leave4.getChild("cube_r6_r5");
		this.pult = this.total.getChild("pult");
		this.cube_r27 = this.pult.getChild("cube_r27");
		this.cube_r27_r1 = this.cube_r27.getChild("cube_r27_r1");
		this.cube_r28 = this.pult.getChild("cube_r28");
		this.cube_r28_r1 = this.cube_r28.getChild("cube_r28_r1");
		this.cube_r29 = this.pult.getChild("cube_r29");
		this.basket = this.pult.getChild("basket");
		this.butter = this.basket.getChild("butter");
		this.kernel = this.basket.getChild("kernel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 23.8F, 0.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 9.0F, 9.0F)
				.texOffs(27, 24).addBox(-4.5F, -8.0071F, -4.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(27, 24).mirror().addBox(1.5F, -8.0071F, -4.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
				.texOffs(0, 28).addBox(-3.5F, -11.0F, -3.5F, 7.0F, 3.0F, 7.0F),
			PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition leaves = total.addOrReplaceChild("leaves",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));
		PartDefinition leaves_r1 = leaves.addOrReplaceChild("leaves_r1",
			CubeListBuilder.create()
				.texOffs(0, 18).addBox(-4.5F, -0.5F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.2F)),
			PartPose.offsetAndRotation(0.0F, -0.375F, 0.0F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bone = leaves.addOrReplaceChild("bone",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));
		PartDefinition leave1 = bone.addOrReplaceChild("leave1",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r5_r1 = leave1.addOrReplaceChild("cube_r5_r1",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r4_r1 = leave1.addOrReplaceChild("cube_r4_r1",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r3_r1 = leave1.addOrReplaceChild("cube_r3_r1",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone5 = leaves.addOrReplaceChild("bone5",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leave5 = bone5.addOrReplaceChild("leave5",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r6_r1 = leave5.addOrReplaceChild("cube_r6_r1",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5_r2 = leave5.addOrReplaceChild("cube_r5_r2",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r4_r2 = leave5.addOrReplaceChild("cube_r4_r2",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone6 = leaves.addOrReplaceChild("bone6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition leave6 = bone6.addOrReplaceChild("leave6",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r7_r1 = leave6.addOrReplaceChild("cube_r7_r1",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r6_r2 = leave6.addOrReplaceChild("cube_r6_r2",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r5_r3 = leave6.addOrReplaceChild("cube_r5_r3",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone2 = leaves.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));
		PartDefinition leave2 = bone2.addOrReplaceChild("leave2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r6_r3 = leave2.addOrReplaceChild("cube_r6_r3",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r5_r4 = leave2.addOrReplaceChild("cube_r5_r4",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r4_r3 = leave2.addOrReplaceChild("cube_r4_r3",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone3 = leaves.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition leave3 = bone3.addOrReplaceChild("leave3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r7_r2 = leave3.addOrReplaceChild("cube_r7_r2",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r6_r4 = leave3.addOrReplaceChild("cube_r6_r4",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r5_r5 = leave3.addOrReplaceChild("cube_r5_r5",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition bone4 = leaves.addOrReplaceChild("bone4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition leave4 = bone4.addOrReplaceChild("leave4",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r8_r1 = leave4.addOrReplaceChild("cube_r8_r1",
			CubeListBuilder.create()
				.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r7_r3 = leave4.addOrReplaceChild("cube_r7_r3",
			CubeListBuilder.create()
				.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F),
			PartPose.offsetAndRotation(-3.0F, -0.8933F, -11.5646F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r6_r5 = leave4.addOrReplaceChild("cube_r6_r5",
			CubeListBuilder.create()
				.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F),
			PartPose.offsetAndRotation(0.0F, -0.5043F, -5.5708F, -0.5236F, 0.0F, 0.0F));
		PartDefinition pult = total.addOrReplaceChild("pult",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition cube_r27 = pult.addOrReplaceChild("cube_r27",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -1.6192F, 9.0169F, -1.6144F, 0.0F, 0.0F));
		PartDefinition cube_r27_r1 = cube_r27.addOrReplaceChild("cube_r27_r1",
			CubeListBuilder.create()
				.texOffs(0, 18).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, -0.3846F, 0.6958F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r28 = pult.addOrReplaceChild("cube_r28",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(0.0F, -3.8077F, 1.2387F, -1.8326F, 0.0F, 0.0F));
		PartDefinition cube_r28_r1 = cube_r28.addOrReplaceChild("cube_r28_r1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, -4.0142F, 1.8391F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r29 = pult.addOrReplaceChild("cube_r29",
			CubeListBuilder.create()
				.texOffs(0, 38).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.4F)),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition basket = pult.addOrReplaceChild("basket",
			CubeListBuilder.create()
				.texOffs(27, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 3.0F, 5.0F)
				.texOffs(34, 36).addBox(-1.5F, -2.0F, 1.0F, 3.0F, 2.0F, 3.0F),
			PartPose.offsetAndRotation(0.0F, -0.5F, 9.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition butter = basket.addOrReplaceChild("butter",
			CubeListBuilder.create()
				.texOffs(21, 28).addBox(-3.0F, -4.0F, 0.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F))
				.texOffs(24, 35).addBox(-4.0F, -2.25F, 0.5F, 1.0F, 5.0F, 4.0F),
			PartPose.offset(1.0F, 0.0F, 0.0F));
		PartDefinition kernel = basket.addOrReplaceChild("kernel",
			CubeListBuilder.create()
				.texOffs(36, 8).addBox(-2.5F, -4.5F, 1.0F, 3.0F, 4.0F, 3.0F),
			PartPose.offset(1.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(KernelPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.kernel.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.KERNEL;
			this.butter.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.BUTTER;
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.butter.visible = (entity instanceof ButterPultEntity);
			this.kernel.visible = ! this.butter.visible;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}