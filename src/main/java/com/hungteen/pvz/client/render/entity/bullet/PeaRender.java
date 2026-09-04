package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.PeaEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PeaRender extends BulletRender<PeaEntity> {

	public PeaRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	protected float getScaleByEntity(PeaEntity entity) {
		PeaEntity.Type type=entity.getPeaType();
		if(type==PeaEntity.Type.BIG) return 2.5f;
		if(type==PeaEntity.Type.HUGE) return 5f;
		return 1f;
	}
}