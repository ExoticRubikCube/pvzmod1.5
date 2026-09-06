package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.PotatoMineEntity;
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
public class PotatoMineModel extends PVZPlantModel<PotatoMineEntity> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "potato_mine"), "main");

	private final ModelPart total;
	private final ModelPart dirt;
	private final ModelPart ne;
	private final ModelPart sw;
	private final ModelPart se;
	private final ModelPart nw;
	private final ModelPart body;
	private final ModelPart red;
	private final ModelPart white;




public PotatoMineModel(ModelPart root) {
		this.total = root.getChild("total");
		this.dirt = this.total.getChild("dirt");
		this.ne = this.dirt.getChild("ne");
		this.sw = this.dirt.getChild("sw");
		this.se = this.dirt.getChild("se");
		this.nw = this.dirt.getChild("nw");
		this.body = this.total.getChild("body");
		this.red = this.body.getChild("red");
		this.white = this.body.getChild("white");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition total_pd = partdefinition.addOrReplaceChild("total",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 25.0F, 0.0F));
		PartDefinition dirt_pd = total_pd.addOrReplaceChild("dirt",
			CubeListBuilder.create(),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ne_pd = dirt_pd.addOrReplaceChild("ne",
			CubeListBuilder.create()
				.texOffs(5, 56).mirror().addBox(-6.5F, -4.0F, -6.5F, 2.0F, 3.0F, 2.0F)
				.texOffs(4, 55).mirror().addBox(-4.5F, -2.0F, -6.5F, 1.0F, 1.0F, 2.0F)
				.texOffs(5, 57).mirror().addBox(-2.5F, -2.0F, -6.5F, 2.0F, 1.0F, 2.0F)
				.texOffs(0, 58).mirror().addBox(-6.5F, -3.0F, -4.5F, 2.0F, 2.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sw_pd = dirt_pd.addOrReplaceChild("sw",
			CubeListBuilder.create()
				.texOffs(2, 51).mirror().addBox(0.5F, -2.0F, 4.5F, 3.0F, 1.0F, 2.0F)
				.texOffs(2, 59).mirror().addBox(3.5F, -3.0F, 3.5F, 3.0F, 2.0F, 3.0F)
				.texOffs(5, 55).mirror().addBox(4.5F, -2.0F, 0.5F, 2.0F, 1.0F, 3.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition se_pd = dirt_pd.addOrReplaceChild("se",
			CubeListBuilder.create()
				.texOffs(1, 55).mirror().addBox(-6.5F, -4.0F, 3.5F, 4.0F, 3.0F, 3.0F)
				.texOffs(0, 58).mirror().addBox(-6.5F, -2.0F, -0.5F, 3.0F, 1.0F, 4.0F)
				.texOffs(4, 52).mirror().addBox(-2.5F, -2.0F, 4.5F, 1.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition nw_pd = dirt_pd.addOrReplaceChild("nw",
			CubeListBuilder.create()
				.texOffs(1, 55).mirror().addBox(4.5F, -3.0F, -6.5F, 2.0F, 2.0F, 3.0F)
				.texOffs(0, 53).mirror().addBox(1.5F, -2.0F, -6.5F, 3.0F, 1.0F, 2.0F)
				.texOffs(2, 58).mirror().addBox(5.5F, -2.0F, -3.5F, 1.0F, 1.0F, 2.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_pd = total_pd.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 0).addBox(-6.0F, -7.0038F, -5.9128F, 12.0F, 8.0F, 12.0F)
				.texOffs(0, 25).addBox(0.0F, -10.0038F, -0.9128F, 0.0F, 3.0F, 2.0F)
				.texOffs(40, 25).addBox(-3.0F, -7.5038F, -2.9128F, 6.0F, 1.0F, 6.0F)
				.texOffs(14, 27).addBox(-1.0F, -10.0038F, 0.0872F, 2.0F, 3.0F, 0.0F),
			PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition red_pd = body_pd.addOrReplaceChild("red",
			CubeListBuilder.create()
				.texOffs(48, 8).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 4.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition white_pd = body_pd.addOrReplaceChild("white",
			CubeListBuilder.create()
				.texOffs(48, 0).addBox(-2.0F, -14.0038F, -1.9128F, 4.0F, 4.0F, 4.0F),
			PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}


	@Override
	public void setupAnim(PotatoMineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int T = (entity.getSignChangeCD() << 1);
		final int current = entity.getExistTick() % T;
		final boolean flag = (current < (T >> 1));
		this.red.visible = flag;
		this.white.visible = !flag;
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<PotatoMineEntity> getPlantModel() {
		return this;
	}
}