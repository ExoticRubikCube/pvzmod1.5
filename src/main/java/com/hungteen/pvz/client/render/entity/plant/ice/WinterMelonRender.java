package com.hungteen.pvz.client.render.entity.plant.ice;

import com.hungteen.pvz.client.model.entity.plant.ice.WinterMelonModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.ice.WinterMelonEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WinterMelonRender extends PVZPlantRender<WinterMelonEntity> {

	public WinterMelonRender(EntityRendererProvider.Context context) {
		super(context, new WinterMelonModel(context.bakeLayer(WinterMelonModel.LAYER)), 0.5F);
	}

}