package com.hungteen.pvz.client.render.entity.plant.spear;

import com.hungteen.pvz.client.model.entity.plant.spear.SpikeRockModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.spear.SpikeRockEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpikeRockRender extends PVZPlantRender<SpikeRockEntity>{

	public SpikeRockRender(EntityRendererProvider.Context context) {
		super(context, new SpikeRockModel(context.bakeLayer(SpikeRockModel.LAYER)), 0.4f);
	}

}