package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.base.SwimmerZombieEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractSwimmerRender<T extends SwimmerZombieEntity> extends PVZZombieRender<T>{

	public AbstractSwimmerRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn,
			float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
	}
	
	@Override
	public Vec3 getTranslateVec(T entity) {
		if(! entity.isMiniZombie()) {
			if(entity.getPose() == Pose.SWIMMING) return new Vec3(0, 2.5f, 0);
			if(entity.getPose() == Pose.SPIN_ATTACK) return new Vec3(0, 1.25f, 0);
		}
		return super.getTranslateVec(entity);
	}

}