package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.YetiZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.YetiZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class YetiZombieRender extends PVZZombieRender<YetiZombieEntity>{

	public YetiZombieRender(EntityRendererProvider.Context context) {
		super(context, new YetiZombieModel(context.bakeLayer(YetiZombieModel.LAYER)), 0.5f);
	}

}