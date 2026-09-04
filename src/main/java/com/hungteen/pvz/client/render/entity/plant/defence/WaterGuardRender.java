package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.WaterGuardModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.defence.WaterGuardEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WaterGuardRender extends PVZPlantRender<WaterGuardEntity>{

	public WaterGuardRender(EntityRendererProvider.Context context) {
		super(context, new WaterGuardModel(context.bakeLayer(WaterGuardModel.LAYER)), 0f);
	}

}