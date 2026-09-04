package com.hungteen.pvz.client.render.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.arma.KernelPultModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KernelPultRender extends PVZPlantRender<KernelPultEntity> {

	public KernelPultRender(EntityRendererProvider.Context context) {
		super(context, new KernelPultModel<>(context.bakeLayer(KernelPultModel.LAYER)), 0.5F);
	}

}