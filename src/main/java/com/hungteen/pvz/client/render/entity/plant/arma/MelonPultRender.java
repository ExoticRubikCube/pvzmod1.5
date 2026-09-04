package com.hungteen.pvz.client.render.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.arma.MelonPultModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MelonPultRender extends PVZPlantRender<MelonPultEntity> {

	public MelonPultRender(EntityRendererProvider.Context context) {
		super(context, new MelonPultModel(context.bakeLayer(MelonPultModel.LAYER)), 0.5F);
	}

}