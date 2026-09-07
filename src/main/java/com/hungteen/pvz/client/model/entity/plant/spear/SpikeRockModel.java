package com.hungteen.pvz.client.model.entity.plant.spear;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.spear.SpikeRockEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class SpikeRockModel extends PVZPlantModel<SpikeRockEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "spike_rock"), "main");
	private final ModelPart total;
	private final ModelPart bone;
	private final ModelPart t1;
	private final ModelPart spike1;
	private final ModelPart t2;
	private final ModelPart spike2;
	private final ModelPart t3;
	private final ModelPart spike3;


	public SpikeRockModel(ModelPart root) {
		this.total = root.getChild("total");
		this.bone = this.total.getChild("bone");
		this.t1 = this.total.getChild("t1");
		this.spike1 = this.t1.getChild("spike1");
		this.t2 = this.total.getChild("t2");
		this.spike2 = this.t2.getChild("spike2");
		this.t3 = this.total.getChild("t3");
		this.spike3 = this.t3.getChild("spike3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(0, 19).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F)
				.texOffs(0, 0).addBox(-8.0F, -3.2F, -8.0F, 16.0F, 3.0F, 16.0F, new CubeDeformation(0.3F)),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = total.addOrReplaceChild("bone",
			CubeListBuilder.create()
				.texOffs(32, 42).addBox(-8.0F, -6.0F, -4.0F, 16.0F, 4.0F, 0.0F)
				.texOffs(32, 38).addBox(-8.0F, -6.0F, 4.0F, 16.0F, 4.0F, 0.0F)
				.texOffs(0, 26).addBox(-4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F)
				.texOffs(0, 22).addBox(4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition t1 = total.addOrReplaceChild("t1",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spike1 = t1.addOrReplaceChild("spike1",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F)
				.texOffs(0, 5).addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition t2 = total.addOrReplaceChild("t2",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(6.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition spike2 = t2.addOrReplaceChild("spike2",
			CubeListBuilder.create()
				.texOffs(0, 0).mirror().addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F)
				.texOffs(0, 5).mirror().addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition t3 = total.addOrReplaceChild("t3",
			CubeListBuilder.create(),
			PartPose.offsetAndRotation(-6.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition spike3 = t3.addOrReplaceChild("spike3",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F)
				.texOffs(0, 5).addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}



	@Override
	public void setupAnim(SpikeRockEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.t2.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 2F / 3);
		this.t3.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 1F / 3);
		this.t1.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 0);
		final int tot = SpikeRockEntity.ATTACK_ANIM_CD;
		final int now = tot - entity.getAttackTime();
		final float angle = 25F;
		this.t3.zRot = AnimationUtil.getUpDown(now, tot, angle);
		this.t2.zRot = AnimationUtil.getUpDown(now, tot, - angle);
		this.t1.xRot = AnimationUtil.getUpDownUpDown(now, tot, angle);
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SpikeRockEntity> getPlantModel() {
		return this;
	}
}