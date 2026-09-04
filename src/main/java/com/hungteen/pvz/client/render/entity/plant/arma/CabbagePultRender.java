package com.hungteen.pvz.client.render.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.arma.CabbagePultModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.arma.CabbagePultEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CabbagePultRender extends PVZPlantRender<CabbagePultEntity> {

	public CabbagePultRender(EntityRendererProvider.Context context) {
		super(context, new CabbagePultModel(context.bakeLayer(CabbagePultModel.LAYER)), 0.5F);
	}

}