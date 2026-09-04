package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.defence.PumpkinEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PumpkinRender extends PVZPlantRender<PumpkinEntity>{

	public PumpkinRender(EntityRendererProvider.Context context) {
		super(context, new PumpkinModel(context.bakeLayer(PumpkinModel.LAYER)), 1f);
	}

}