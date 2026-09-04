package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.SunFlowerModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.light.SunFlowerEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SunFlowerRender extends PVZPlantRender<SunFlowerEntity>{
	
	public SunFlowerRender(EntityRendererProvider.Context context) {
		super(context, new SunFlowerModel(context.bakeLayer(SunFlowerModel.LAYER)), 0.4f);
	}

}