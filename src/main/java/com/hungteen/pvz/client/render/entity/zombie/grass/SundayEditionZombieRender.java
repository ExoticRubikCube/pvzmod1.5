package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.SundayEditionZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.SundayEditionZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SundayEditionZombieRender extends PVZZombieRender<SundayEditionZombieEntity>{

	public SundayEditionZombieRender(EntityRendererProvider.Context context) {
		super(context, new SundayEditionZombieModel(context.bakeLayer(SundayEditionZombieModel.LAYER)), 0.51F);
	}

	
}