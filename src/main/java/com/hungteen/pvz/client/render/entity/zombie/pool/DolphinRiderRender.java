package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.DolphinRiderEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DolphinRiderRender extends PVZZombieRender<DolphinRiderEntity>{

	public DolphinRiderRender(EntityRendererProvider.Context context) {
		super(context, new DolphinRiderModel(context.bakeLayer(DolphinRiderModel.LAYER)), 0);
	}

}