package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.GoldLeafModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.light.GoldLeafEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldLeafRender extends PVZPlantRender<GoldLeafEntity> {

	public GoldLeafRender(EntityRendererProvider.Context context) {
		super(context, new GoldLeafModel(context.bakeLayer(GoldLeafModel.LAYER)), 0.35F);
	}

}