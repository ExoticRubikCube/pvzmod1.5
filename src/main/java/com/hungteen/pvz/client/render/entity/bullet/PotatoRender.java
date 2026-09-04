package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.PotatoEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PotatoRender extends BulletRender<PotatoEntity>{

	public PotatoRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(PotatoEntity entity) {
		return 1f;
	}
}