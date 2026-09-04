package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.TombStoneModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.TombStoneEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TombStoneRender extends PVZZombieRender<TombStoneEntity>{

	public TombStoneRender(EntityRendererProvider.Context context) {
		super(context, new TombStoneModel<>(context.bakeLayer(TombStoneModel.LAYER)), 0.4f);
	}

	@Override
	protected float getScaleByEntity(TombStoneEntity entity) {
		return 0.6f;
	}
	
	@Override
	protected float getOffsetRisingHeight() {
		return 1f;
	}

}