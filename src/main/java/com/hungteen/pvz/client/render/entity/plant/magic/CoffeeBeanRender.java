package com.hungteen.pvz.client.render.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.magic.CoffeeBeanModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.magic.CoffeeBeanEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CoffeeBeanRender extends PVZPlantRender<CoffeeBeanEntity>{

	public CoffeeBeanRender(EntityRendererProvider.Context context) {
		super(context, new CoffeeBeanModel(context.bakeLayer(CoffeeBeanModel.LAYER)), 0.3f);
	}

}