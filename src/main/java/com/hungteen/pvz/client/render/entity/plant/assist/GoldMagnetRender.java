package com.hungteen.pvz.client.render.entity.plant.assist;

import com.hungteen.pvz.client.model.entity.plant.assist.GoldMagnetModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.assist.GoldMagnetEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldMagnetRender extends PVZPlantRender<GoldMagnetEntity> {

	public GoldMagnetRender(EntityRendererProvider.Context context) {
		super(context, new GoldMagnetModel(context.bakeLayer(GoldMagnetModel.LAYER)), 0.3F);
	}

}