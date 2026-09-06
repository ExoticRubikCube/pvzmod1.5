package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.model.entity.ComponentModel;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.WallNutEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
public class WallNutModel<T extends WallNutEntity> extends PVZPlantModel<T> {
	public static final ModelLayerLocation LAYER = new ModelLayerLocation(new ResourceLocation(PVZMod.MOD_ID, "wall_nut"), "main");

	private final ModelPart body;




public WallNutModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
	
		PartDefinition body_pd = partdefinition.addOrReplaceChild("body",
			CubeListBuilder.create()
				.texOffs(0, 42).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F)
				.texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 14.0F, 13.0F, 14.0F)
				.texOffs(0, 27).addBox(-6.0F, -17.0F, -6.0F, 12.0F, 3.0F, 12.0F)
				.texOffs(0, 57).addBox(-7.0F, -14.0F, -6.6F, 14.0F, 13.0F, 1.0F)
				.texOffs(56, 0).addBox(-3.0F, -12.0F, -3.0F, 6.0F, 6.0F, 6.0F),
			PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public ModelPart getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}

	public static class WallNutArmorModel extends ComponentModel<WallNutEntity> {

		private final ModelPart body;

		public WallNutArmorModel() {
			this(createBodyLayer().bakeRoot());
		}

		private WallNutArmorModel(ModelPart root) {
			this.body = root.getChild("body");
		}

		private static LayerDefinition createBodyLayer() {
			MeshDefinition mesh = new MeshDefinition();
			PartDefinition root = mesh.getRoot();
			root.addOrReplaceChild("body",
				CubeListBuilder.create()
					.texOffs(0, 0).addBox(-8.0F, -15.0F, -8.0F, 16.0F, 13.0F, 16.0F)
					.texOffs(0, 29).addBox(-7.0F, -18.0F, -7.0F, 14.0F, 3.0F, 14.0F),
				PartPose.offset(0.0F, 24.0F, 0.0F));
			return LayerDefinition.create(mesh, 64, 64);
		}

		@Override
		public ModelPart getTotalModel() {
			return this.body;
		}
	}
}