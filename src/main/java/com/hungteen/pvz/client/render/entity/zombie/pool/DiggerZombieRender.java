package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.DiggerZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.DiggerZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DiggerZombieRender extends PVZZombieRender<DiggerZombieEntity>{

	public DiggerZombieRender(EntityRendererProvider.Context context) {
		super(context, new DiggerZombieModel(context.bakeLayer(DiggerZombieModel.LAYER)), 0.3f);
	}

	@Override
	public Vec3 getTranslateVec(DiggerZombieEntity entity) {
		double maxOffset = 4D;
		int now = entity.getAttackTime();
		int max = DiggerZombieEntity.MAX_OUT_TIME;
		return new Vec3(0, maxOffset * ( 1 - now * 1.0D / max), 0);
	}

}