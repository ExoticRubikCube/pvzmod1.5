package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.WallNutZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.WallNutZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WallNutZombieRender extends AbstractZombotanyRender<WallNutZombieEntity> {

	public WallNutZombieRender(EntityRendererProvider.Context context) {
		super(context, new WallNutZombieModel(context.bakeLayer(WallNutZombieModel.LAYER)), 0.4F);
	}
	
}