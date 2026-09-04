package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.NutEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class NutRender extends BulletRender<NutEntity> {

	public NutRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(NutEntity entity) {
		return 0.5F;
	}

}