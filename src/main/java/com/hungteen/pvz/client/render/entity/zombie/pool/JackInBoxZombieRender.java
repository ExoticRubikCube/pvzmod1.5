package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.JackInBoxZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.JackInBoxZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class JackInBoxZombieRender extends PVZZombieRender<JackInBoxZombieEntity>{

	public JackInBoxZombieRender(EntityRendererProvider.Context context) {
		super(context, new JackInBoxZombieModel(context.bakeLayer(JackInBoxZombieModel.LAYER)), 0.45f);
	}
	
	@Override
	protected boolean isShaking(JackInBoxZombieEntity p_230495_1_) {
		return true;
	}

}