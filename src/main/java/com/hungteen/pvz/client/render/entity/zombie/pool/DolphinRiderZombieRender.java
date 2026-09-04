package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.DolphinRiderZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DolphinRiderZombieRender extends AbstractSwimmerRender<DolphinRiderZombieEntity>{

	public DolphinRiderZombieRender(EntityRendererProvider.Context context) {
		super(context, new DolphinRiderZombieModel(context.bakeLayer(DolphinRiderZombieModel.LAYER)), 0.4f);
	}

}