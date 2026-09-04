package com.hungteen.pvz.client.render.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.enforce.SquashModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.enforce.SquashEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SquashRender extends PVZPlantRender<SquashEntity>{

	public SquashRender(EntityRendererProvider.Context context) {
		super(context, new SquashModel(context.bakeLayer(SquashModel.LAYER)), 0.5f);
	}

}