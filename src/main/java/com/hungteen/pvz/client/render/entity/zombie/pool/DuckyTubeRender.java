package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.DuckyTubeModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieToolRender;
import com.hungteen.pvz.common.entity.misc.DuckyTubeEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class DuckyTubeRender extends PVZZombieToolRender<DuckyTubeEntity>{

	public DuckyTubeRender(EntityRendererProvider.Context context) {
		super(context, new DuckyTubeModel(context.bakeLayer(DuckyTubeModel.LAYER)), 0);
	}

	@Override
	protected float getScaleByEntity(DuckyTubeEntity entity) {
		return 0.6f;
	}

	@Override
	public ResourceLocation getTextureLocation(DuckyTubeEntity entity) {
		return StringUtil.prefix("textures/entity/zombie/poolday/ducky_tube.png");
	}

}