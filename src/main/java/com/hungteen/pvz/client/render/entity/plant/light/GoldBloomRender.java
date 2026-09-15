package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.GoldBloomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.fullskin.GoldBloomLightLayer;
import com.hungteen.pvz.common.entity.plant.light.GoldBloomEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldBloomRender extends PVZPlantRender<GoldBloomEntity> {

	public GoldBloomRender(EntityRendererProvider.Context context) {
		super(context, new GoldBloomModel(context.bakeLayer(GoldBloomModel.LAYER)), 0.4F);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new GoldBloomLightLayer(this));
	}

}
