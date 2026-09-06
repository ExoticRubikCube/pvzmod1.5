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
	private final ModelPart t1;
	private final ModelPart spike1;
	private final ModelPart t2;
	private final ModelPart spike2;
	private final ModelPart t3;
	private final ModelPart spike3;
	private final ModelPart spikes;
	private final ModelPart spike15;
	private final ModelPart spike14;
	private final ModelPart spike13;
	private final ModelPart spike12;
	private final ModelPart spike11;
	private final ModelPart spike10;
	private final ModelPart spike9;
	private final ModelPart spike8;
	private final ModelPart spike7;
	private final ModelPart spike6;
	private final ModelPart spike5;
	private final ModelPart spike4;




public SpikeRockModel(ModelPart root) {
		this.total = root.getChild("total");
		this.t1 = this.total.getChild("t1");
		this.spike1 = this.t1.getChild("spike1");
		this.t2 = this.total.getChild("t2");
		this.spike2 = this.t2.getChild("spike2");
		this.t3 = this.total.getChild("t3");
		this.spike3 = this.t3.getChild("spike3");
		this.spikes = this.total.getChild("spikes");
		this.spike15 = this.spikes.getChild("spike15");
		this.spike14 = this.spikes.getChild("spike14");
		this.spike13 = this.spikes.getChild("spike13");
		this.spike12 = this.spikes.getChild("spike12");
		this.spike11 = this.spikes.getChild("spike11");
		this.spike10 = this.spikes.getChild("spike10");
		this.spike9 = this.spikes.getChild("spike9");
		this.spike8 = this.spikes.getChild("spike8");
		this.spike7 = this.spikes.getChild("spike7");
		this.spike6 = this.spikes.getChild("spike6");
		this.spike5 = this.spikes.getChild("spike5");
		this.spike4 = this.spikes.getChild("spike4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create()
				.texOffs(31, 102).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 1.0F, 24.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition t1_pd = total_pd.addOrReplaceChild("t1",
			CubeListBuilder.create()
				.texOffs(119, 89).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spike1_pd = t1_pd.addOrReplaceChild("spike1",
			CubeListBuilder.create()
				.texOffs(119, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition t2_pd = total_pd.addOrReplaceChild("t2",
			CubeListBuilder.create()
				.texOffs(108, 87).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition spike2_pd = t2_pd.addOrReplaceChild("spike2",
			CubeListBuilder.create()
				.texOffs(108, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition t3_pd = total_pd.addOrReplaceChild("t3",
			CubeListBuilder.create()
				.texOffs(98, 87).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.05F)),
			PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition spike3_pd = t3_pd.addOrReplaceChild("spike3",
			CubeListBuilder.create()
				.texOffs(96, 95).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition spikes_pd = total_pd.addOrReplaceChild("spikes",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition spike15_pd = spikes_pd.addOrReplaceChild("spike15",
			CubeListBuilder.create()
				.texOffs(90, 72).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(5.0F, -1.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition spike14_pd = spikes_pd.addOrReplaceChild("spike14",
			CubeListBuilder.create()
				.texOffs(105, 72).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-5.0F, -1.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition spike13_pd = spikes_pd.addOrReplaceChild("spike13",
			CubeListBuilder.create()
				.texOffs(118, 74).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(6.0F, -1.0F, 5.0F, 0.7854F, 0.7854F, 0.0F));
		PartDefinition spike12_pd = spikes_pd.addOrReplaceChild("spike12",
			CubeListBuilder.create()
				.texOffs(75, 81).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-6.0F, -1.0F, 5.0F, -0.7854F, -0.7854F, 0.0F));
		PartDefinition spike11_pd = spikes_pd.addOrReplaceChild("spike11",
			CubeListBuilder.create()
				.texOffs(85, 81).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, 9.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition spike10_pd = spikes_pd.addOrReplaceChild("spike10",
			CubeListBuilder.create()
				.texOffs(95, 80).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(10.0F, -1.0F, 9.0F, -0.7854F, -0.7854F, 0.0F));
		PartDefinition spike9_pd = spikes_pd.addOrReplaceChild("spike9",
			CubeListBuilder.create()
				.texOffs(106, 80).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-10.0F, -1.0F, 9.0F, 0.7854F, 0.7854F, 0.0F));
		PartDefinition spike8_pd = spikes_pd.addOrReplaceChild("spike8",
			CubeListBuilder.create()
				.texOffs(117, 81).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(6.0F, -1.0F, -5.0F, -0.7854F, -0.7854F, 0.0F));
		PartDefinition spike7_pd = spikes_pd.addOrReplaceChild("spike7",
			CubeListBuilder.create()
				.texOffs(76, 88).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-6.0F, -1.0F, -5.0F, -0.7854F, 0.7854F, 0.0F));
		PartDefinition spike6_pd = spikes_pd.addOrReplaceChild("spike6",
			CubeListBuilder.create()
				.texOffs(75, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(-10.0F, -1.0F, -9.0F, -0.7854F, -0.7854F, 0.0F));
		PartDefinition spike5_pd = spikes_pd.addOrReplaceChild("spike5",
			CubeListBuilder.create()
				.texOffs(87, 89).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(10.0F, -1.0F, -9.0F, -0.7854F, 0.7854F, 0.0F));
		PartDefinition spike4_pd = spikes_pd.addOrReplaceChild("spike4",
			CubeListBuilder.create()
				.texOffs(86, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
			PartPose.offsetAndRotation(0.0F, -1.0F, -9.0F, 0.0F, 0.0F, 0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
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