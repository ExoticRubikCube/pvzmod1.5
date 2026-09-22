package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.component.TallNutArmorLayer;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TallNutRender extends PVZPlantRender<TallNutEntity>{

	public TallNutRender(EntityRendererProvider.Context context) {
		super(context, new TallNutModel(context.bakeLayer(TallNutModel.LAYER)), 0.45f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new TallNutArmorLayer(this));
	}

}