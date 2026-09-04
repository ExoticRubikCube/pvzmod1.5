package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.LavaZombieModel;
import com.hungteen.pvz.common.entity.zombie.custom.LavaZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LavaZombieRender extends AbstractSwimmerRender<LavaZombieEntity>{

	public LavaZombieRender(EntityRendererProvider.Context context) {
		super(context, new LavaZombieModel(context.bakeLayer(LavaZombieModel.LAYER)), 0.5f);
	}

}