package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.SquashZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.SquashZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SquashZombieRender extends AbstractZombotanyRender<SquashZombieEntity> {

	public SquashZombieRender(EntityRendererProvider.Context context) {
		super(context, new SquashZombieModel(context.bakeLayer(SquashZombieModel.LAYER)), 0.4F);
	}

}