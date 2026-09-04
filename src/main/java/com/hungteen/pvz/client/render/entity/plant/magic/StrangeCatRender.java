package com.hungteen.pvz.client.render.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.magic.StrangeCatModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.magic.StrangeCatEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class StrangeCatRender extends PVZPlantRender<StrangeCatEntity> {

	public StrangeCatRender(EntityRendererProvider.Context context) {
		super(context, new StrangeCatModel(context.bakeLayer(StrangeCatModel.LAYER)), 0.4F);
	}

}