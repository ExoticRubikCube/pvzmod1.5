package com.hungteen.pvz.client.render.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.appease.RepeaterModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.appease.RepeaterEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RepeaterRender extends PVZPlantRender<RepeaterEntity>{

	public RepeaterRender(EntityRendererProvider.Context context) {
		super(context, new RepeaterModel(context.bakeLayer(RepeaterModel.LAYER)), 0.4f);
	}

}