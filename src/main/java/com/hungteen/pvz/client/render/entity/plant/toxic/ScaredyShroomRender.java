package com.hungteen.pvz.client.render.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.toxic.ScaredyShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.toxic.ScaredyShroomEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ScaredyShroomRender extends PVZPlantRender<ScaredyShroomEntity>{

	public ScaredyShroomRender(EntityRendererProvider.Context context) {
		super(context, new ScaredyShroomModel(context.bakeLayer(ScaredyShroomModel.LAYER)), 0.4f);
	}

	@Override
	public Vec3 getTranslateVec(ScaredyShroomEntity entity) {
		if(entity.isScared()) {
			final double percent = entity.getScareTime() * 1.0 / ScaredyShroomEntity.SCARE_ANIM_CD;
		    final double change = 1.38;
		    return new Vec3(0, change * percent, 0);
		}
		return super.getTranslateVec(entity);
	}
	
}