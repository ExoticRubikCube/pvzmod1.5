package com.hungteen.pvz.client.render.entity.plant.assist;

import com.hungteen.pvz.client.model.entity.plant.assist.GraveBusterModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.assist.GraveBusterEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GraveBusterRender extends PVZPlantRender<GraveBusterEntity>{

	public GraveBusterRender(EntityRendererProvider.Context context) {
		super(context, new GraveBusterModel(context.bakeLayer(GraveBusterModel.LAYER)), 0);
	}

	@Override
	public Vec3 getTranslateVec(GraveBusterEntity entity) {
		if(entity.isEatingTomb()) {
			final float height = 1.5f;
			final float downOffset = (1 - entity.getAttackTime() * 1.0f / entity.getEatTombCD()) * height;
		    return new Vec3(0, - downOffset, 0);
		}
		return super.getTranslateVec(entity);
	}
	
}