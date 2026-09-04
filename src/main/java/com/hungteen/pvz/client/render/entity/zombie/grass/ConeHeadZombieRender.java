package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.ConeHeadZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.ConeHeadZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ConeHeadZombieRender extends AbstractNormalRender<ConeHeadZombieEntity>{

	public ConeHeadZombieRender(EntityRendererProvider.Context context) {
		super(context, new ConeHeadZombieModel(context.bakeLayer(ConeHeadZombieModel.LAYER)),0.5f);
	}

}