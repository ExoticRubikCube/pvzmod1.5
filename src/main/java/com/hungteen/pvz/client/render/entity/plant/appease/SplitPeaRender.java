package com.hungteen.pvz.client.render.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.appease.SplitPeaModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.appease.SplitPeaEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SplitPeaRender extends PVZPlantRender<SplitPeaEntity>{

	public SplitPeaRender(EntityRendererProvider.Context context) {
		super(context, new SplitPeaModel(context.bakeLayer(SplitPeaModel.LAYER)), 0.4f);
	}

}