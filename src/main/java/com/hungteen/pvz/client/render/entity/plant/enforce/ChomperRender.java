package com.hungteen.pvz.client.render.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.enforce.ChomperModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.enforce.ChomperEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ChomperRender extends PVZPlantRender<ChomperEntity>{

	public ChomperRender(EntityRendererProvider.Context context) {
		super(context, new ChomperModel(context.bakeLayer(ChomperModel.LAYER)), 0.5f);
	}
	
}