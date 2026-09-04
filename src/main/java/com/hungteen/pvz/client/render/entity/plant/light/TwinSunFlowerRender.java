package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.TwinSunFlowerModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.light.TwinSunFlowerEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TwinSunFlowerRender extends PVZPlantRender<TwinSunFlowerEntity> {

	public TwinSunFlowerRender(EntityRendererProvider.Context context) {
		super(context, new TwinSunFlowerModel(context.bakeLayer(TwinSunFlowerModel.LAYER)), 0.48f);
	}

}