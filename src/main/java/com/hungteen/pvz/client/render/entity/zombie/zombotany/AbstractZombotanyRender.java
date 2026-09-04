package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.client.render.layer.DuckyTubeLayer;
import com.hungteen.pvz.common.entity.zombie.zombotany.AbstractZombotanyEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractZombotanyRender<T extends AbstractZombotanyEntity> extends PVZZombieRender<T>{

	public AbstractZombotanyRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn,
			float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
	}
	
	@Override
	protected void addZombieLayers() {
		super.addZombieLayers();
		this.addLayer(new DuckyTubeLayer<T>(this));
	}
	
	@Override
	public Vec3 getTranslateVec(T entity) {
		if(entity.getAttackTime() >= 0 && entity.isInWater()) {
			return new Vec3(0, 0.6f, 0);
		}
		return super.getTranslateVec(entity);
	}
	
}