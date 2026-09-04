package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.GarlicModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.defence.GarlicEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GarlicRender extends PVZPlantRender<GarlicEntity> {

	public GarlicRender(EntityRendererProvider.Context context) {
		super(context, new GarlicModel(context.bakeLayer(GarlicModel.LAYER)), 0.5F);
	}

}