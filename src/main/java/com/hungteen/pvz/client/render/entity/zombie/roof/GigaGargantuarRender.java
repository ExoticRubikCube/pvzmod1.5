package com.hungteen.pvz.client.render.entity.zombie.roof;

import com.hungteen.pvz.client.model.entity.zombie.roof.GargantuarModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.roof.GigaGargantuarEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GigaGargantuarRender extends PVZZombieRender<GigaGargantuarEntity> {

	public GigaGargantuarRender(EntityRendererProvider.Context context) {
		super(context, new GargantuarModel<>(context.bakeLayer(GargantuarModel.LAYER)), 1F);
	}

}