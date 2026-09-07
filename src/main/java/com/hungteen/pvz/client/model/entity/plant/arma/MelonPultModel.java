package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class MelonPultModel extends PVZPlantModel<MelonPultEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "melon_pult"), "main");
	private final ModelPart total;
	private final ModelPart head;
	private final ModelPart eye_brow;
	private final ModelPart eyes_closed;
	private final ModelPart pult;
	private final ModelPart bone2;
	private final ModelPart cube_r1;
	private final ModelPart bone3;
	private final ModelPart cube_r2;
	private final ModelPart busket;
	private final ModelPart melon;
	private final ModelPart n_leaves;
	private final ModelPart ne_r1;
	private final ModelPart nw_r1;
	private final ModelPart s_leaves;
	private final ModelPart sw_r1;
	private final ModelPart se_r1;


	public MelonPultModel(ModelPart root) {
		this.total = root.getChild("total");
		this.head = this.total.getChild("head");
		this.eye_brow = this.head.getChild("eye_brow");
		this.eyes_closed = this.head.getChild("eyes_closed");
		this.pult = this.head.getChild("pult");
		this.bone2 = this.pult.getChild("bone2");
		this.cube_r1 = this.bone2.getChild("cube_r1");
		this.bone3 = this.bone2.getChild("bone3");
		this.cube_r2 = this.bone3.getChild("cube_r2");
		this.busket = this.bone3.getChild("busket");
		this.melon = this.busket.getChild("melon");
		this.n_leaves = this.total.getChild("n_leaves");
		this.ne_r1 = this.n_leaves.getChild("ne_r1");
		this.nw_r1 = this.n_leaves.getChild("nw_r1");
		this.s_leaves = this.total.getChild("s_leaves");
		this.sw_r1 = this.s_leaves.getChild("sw_r1");
		this.se_r1 = this.s_leaves.getChild("se_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = total.addOrReplaceChild("head",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-7.0F, -10.5F, -5.0F, 14.0F, 10.0F, 10.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition eye_brow = head.addOrReplaceChild("eye_brow",
			CubeListBuilder.create()
				.texOffs(32, 44).addBox(-7.0F, -8.0F, -5.2F, 14.0F, 2.0F, 0.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition eyes_closed = head.addOrReplaceChild("eyes_closed",
			CubeListBuilder.create()
				.texOffs(0, 56).addBox(-6.0F, -7.5F, -4.991F, 12.0F, 6.0F, 0.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition pult = head.addOrReplaceChild("pult",
			CubeListBuilder.create()
				.texOffs(52, 46).addBox(-1.5F, -1.5657F, -0.3848F, 4.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -9.0F, 5.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition bone2 = pult.addOrReplaceChild("bone2",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.9343F, 1.6152F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1",
			CubeListBuilder.create()
				.texOffs(52, 52).addBox(-2.5F, -3.0F, 0.0F, 4.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, -0.1745F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
			CubeListBuilder.create()
				.texOffs(52, 58).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.75F, -0.2618F, 0.0F, 0.0F));
		PartDefinition busket = bone3.addOrReplaceChild("busket",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -0.5671F, 0.0474F, 2.0F, 2.0F, 1.0F)
				.texOffs(0, 20).addBox(-5.0F, -1.5671F, 1.0474F, 10.0F, 5.0F, 10.0F)
				.texOffs(0, 35).addBox(-4.0F, -1.5671F, 2.0474F, 8.0F, 4.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition melon = busket.addOrReplaceChild("melon",
			CubeListBuilder.create()
				.texOffs(32, 27).addBox(-4.0F, -3.5F, -3.0F, 8.0F, 9.0F, 8.0F),
			PartPose.offsetAndRotation(0.0F, -5.0671F, 6.0474F, -0.6545F, 0.0F, 0.0F));
		PartDefinition n_leaves = total.addOrReplaceChild("n_leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ne_r1 = n_leaves.addOrReplaceChild("ne_r1",
			CubeListBuilder.create()
				.texOffs(39, 18).addBox(-10.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0873F));
		PartDefinition nw_r1 = n_leaves.addOrReplaceChild("nw_r1",
			CubeListBuilder.create()
				.texOffs(29, 0).addBox(-1.0F, 0.0F, -8.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.0873F));
		PartDefinition s_leaves = total.addOrReplaceChild("s_leaves",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sw_r1 = s_leaves.addOrReplaceChild("sw_r1",
			CubeListBuilder.create()
				.texOffs(13, 47).addBox(-1.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, -0.0873F));
		PartDefinition se_r1 = s_leaves.addOrReplaceChild("se_r1",
			CubeListBuilder.create()
				.texOffs(-9, 47).addBox(-10.0F, 0.0F, -1.0F, 11.0F, 0.0F, 9.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0873F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void setupAnim(MelonPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - Mth.abs(Mth.cos(percent * 3.14159F))) * 1.5F;
			this.melon.visible = (percent < 0.5);
		} else {
			pult.xRot = Mth.sin(ageInTicks / 10) / 8;
			this.melon.visible = true;
		}
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<MelonPultEntity> getPlantModel() {
		return this;
	}
}