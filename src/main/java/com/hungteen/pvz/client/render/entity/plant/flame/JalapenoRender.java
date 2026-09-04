package com.hungteen.pvz.client.render.entity.plant.flame;

import com.hungteen.pvz.client.model.entity.plant.flame.JalapenoModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.flame.JalapenoEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class JalapenoRender extends PVZPlantRender<JalapenoEntity>{

	public JalapenoRender(EntityRendererProvider.Context context) {
		super(context, new JalapenoModel(context.bakeLayer(JalapenoModel.LAYER)), 0.4f);
	}

	@Override
	public float getScaleByEntity(JalapenoEntity entity) {
		float plus = entity.getAttackTime() * 1f / entity.getReadyTime();
		return 0.8F + plus/20F;
	}

}