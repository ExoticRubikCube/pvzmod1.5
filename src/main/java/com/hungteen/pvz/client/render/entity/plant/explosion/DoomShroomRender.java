package com.hungteen.pvz.client.render.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.explosion.DoomShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.explosion.DoomShroomEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DoomShroomRender extends PVZPlantRender<DoomShroomEntity>{

	public DoomShroomRender(EntityRendererProvider.Context context) {
		super(context, new DoomShroomModel(context.bakeLayer(DoomShroomModel.LAYER)), 0.5f);
	}

	@Override
	public float getScaleByEntity(DoomShroomEntity entity) {
		float plus = entity.getAttackTime() * 1f / entity.getReadyTime();
		return 1f + plus * plus * 0.5f;
	}

}