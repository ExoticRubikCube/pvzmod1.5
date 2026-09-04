package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.NormalZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.NormalZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NormalZombieRender extends AbstractNormalRender<NormalZombieEntity>{

	public NormalZombieRender(EntityRendererProvider.Context context) {
		super(context, new NormalZombieModel(context.bakeLayer(NormalZombieModel.LAYER)), 0.5f);
	}

}