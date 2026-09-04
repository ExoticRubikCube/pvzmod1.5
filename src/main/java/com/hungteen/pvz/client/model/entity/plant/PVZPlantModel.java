package com.hungteen.pvz.client.model.entity.plant;

import com.hungteen.pvz.api.paz.IPlantModel;
import com.hungteen.pvz.client.model.entity.PVZEntityModel;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;

public abstract class PVZPlantModel<T extends PVZPlantEntity> extends PVZEntityModel<T> implements IPlantModel<T>{

	@Override
	public void renderToBuffer(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.getPlantWholeBody().render(matrixStack, buffer, packedLight, packedOverlay);
	}
	
	public abstract ModelPart getPlantWholeBody();
	
	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}