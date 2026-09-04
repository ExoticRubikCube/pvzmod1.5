package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.FireCrackerEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FireCrackerRender extends BulletRender<FireCrackerEntity> {

	public FireCrackerRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(FireCrackerEntity entity) {
		return 1F;
	}

}