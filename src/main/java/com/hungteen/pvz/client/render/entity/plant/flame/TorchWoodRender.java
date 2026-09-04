package com.hungteen.pvz.client.render.entity.plant.flame;

import com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TorchWoodRender extends PVZPlantRender<TorchWoodEntity>{

	public TorchWoodRender(EntityRendererProvider.Context context) {
		super(context, new TorchWoodModel(context.bakeLayer(TorchWoodModel.LAYER)), 0.4f);
	}

}