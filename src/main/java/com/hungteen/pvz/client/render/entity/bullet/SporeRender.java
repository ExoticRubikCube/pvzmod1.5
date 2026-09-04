package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.SporeEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SporeRender extends BulletRender<SporeEntity>{

	public SporeRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(SporeEntity entity) {
		return 1f;
	}

}