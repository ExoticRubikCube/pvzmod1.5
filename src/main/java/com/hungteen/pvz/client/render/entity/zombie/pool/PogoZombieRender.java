package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.PogoZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.PogoZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;

public class PogoZombieRender extends PVZZombieRender<PogoZombieEntity>{

	public PogoZombieRender(EntityRendererProvider.Context context) {
		super(context, new PogoZombieModel(context.bakeLayer(PogoZombieModel.LAYER)), 0.45f);
	}

	@Override
	public Vec3 getTranslateVec(PogoZombieEntity entity) {
		if(! entity.hasMetal()) return new Vec3(0, 0.4, 0);
		return super.getTranslateVec(entity);
	}
	
}