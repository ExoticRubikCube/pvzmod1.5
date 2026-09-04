package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.client.render.layer.DuckyTubeLayer;
import com.hungteen.pvz.client.render.layer.ZombieBeardLayer;
import com.hungteen.pvz.common.entity.zombie.grass.NormalZombieEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractNormalRender<T extends NormalZombieEntity> extends PVZZombieRender<T>{

	public AbstractNormalRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn,
			float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
	}
	
	@Override
	protected void addZombieLayers() {
		super.addZombieLayers();
		this.addLayer(new ZombieBeardLayer<>(this));
		this.addLayer(new DuckyTubeLayer<T>(this));
	}
	
	@Override
	public Vec3 getTranslateVec(T entity) {
		if(entity.getAnimTime() >= 0 && entity.isInWater()) {//offset for render ducky tube.
			return new Vec3(0, 0.6f, 0);
		}
		return super.getTranslateVec(entity);
	}

}