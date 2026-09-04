package com.hungteen.pvz.client.render.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.enforce.TangleKelpModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.enforce.TangleKelpEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TangleKelpRender extends PVZPlantRender<TangleKelpEntity>{

	public TangleKelpRender(EntityRendererProvider.Context context) {
		super(context, new TangleKelpModel(context.bakeLayer(TangleKelpModel.LAYER)), 0.3f);
	}

}