package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.SnorkelZombieModel;
import com.hungteen.pvz.common.entity.zombie.pool.SnorkelZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SnorkelZombieRender extends AbstractSwimmerRender<SnorkelZombieEntity>{

	public SnorkelZombieRender(EntityRendererProvider.Context context) {
		super(context, new SnorkelZombieModel(context.bakeLayer(SnorkelZombieModel.LAYER)), 0.5f);
	}
	
}