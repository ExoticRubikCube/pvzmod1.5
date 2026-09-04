package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.ZombieDolphinModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.ZombieDolphinEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ZombieDolphinRender extends PVZZombieRender<ZombieDolphinEntity>{

	public ZombieDolphinRender(EntityRendererProvider.Context context) {
		super(context, new ZombieDolphinModel(context.bakeLayer(ZombieDolphinModel.LAYER)), 0);
	}

}