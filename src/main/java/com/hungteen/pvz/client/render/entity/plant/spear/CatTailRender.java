package com.hungteen.pvz.client.render.entity.plant.spear;

import com.hungteen.pvz.client.model.entity.plant.spear.CatTailModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.spear.CatTailEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;

public class CatTailRender extends PVZPlantRender<CatTailEntity>{

	public CatTailRender(EntityRendererProvider.Context context) {
		super(context, new CatTailModel(context.bakeLayer(CatTailModel.LAYER)), 0);
	}

	@Override
	public Vec3 getTranslateVec(CatTailEntity entity) {
		if(entity.isInWater()) {
			return new Vec3(0, - 0.5D, 0);
		}
		return new Vec3(0, 0, 0);
	}

}