package com.hungteen.pvz.client.render.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.magic.HypnoShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.magic.HypnoShroomEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class HypnoShroomRender extends PVZPlantRender<HypnoShroomEntity>{

	public HypnoShroomRender(EntityRendererProvider.Context context) {
		super(context, new HypnoShroomModel(context.bakeLayer(HypnoShroomModel.LAYER)), 0.5f);
	}

}