package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.BalloonZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.BalloonZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BalloonZombieRender extends PVZZombieRender<BalloonZombieEntity> {

	public BalloonZombieRender(EntityRendererProvider.Context context) {
		super(context, new BalloonZombieModel(context.bakeLayer(BalloonZombieModel.LAYER)), 0);
	}

}