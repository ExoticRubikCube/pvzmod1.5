package com.hungteen.pvz.client.render.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.appease.GatlingPeaModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.appease.GatlingPeaEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GatlingPeaRender extends PVZPlantRender<GatlingPeaEntity>{

	public GatlingPeaRender(EntityRendererProvider.Context context) {
		super(context, new GatlingPeaModel(context.bakeLayer(GatlingPeaModel.LAYER)), 0.4f);
	}

}