package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.BobsleZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.BobsleZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BobsleZombieRender extends PVZZombieRender<BobsleZombieEntity>{

	public BobsleZombieRender(EntityRendererProvider.Context context) {
		super(context, new BobsleZombieModel(context.bakeLayer(BobsleZombieModel.LAYER)), 0.5f);
	}

}