package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.MetalItemEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MetalItemRender extends BulletRender<MetalItemEntity> {

	public MetalItemRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(MetalItemEntity entity) {
		return 1;
	}

}