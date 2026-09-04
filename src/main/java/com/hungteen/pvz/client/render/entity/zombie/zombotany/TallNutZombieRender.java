package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.TallNutZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.TallNutZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TallNutZombieRender extends AbstractZombotanyRender<TallNutZombieEntity> {

	public TallNutZombieRender(EntityRendererProvider.Context context) {
		super(context, new TallNutZombieModel(context.bakeLayer(TallNutZombieModel.LAYER)), 0.4F);
	}

}