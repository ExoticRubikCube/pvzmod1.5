package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.PumpkinZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.PumpkinZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PumpkinZombieRender extends AbstractZombotanyRender<PumpkinZombieEntity>{

	public PumpkinZombieRender(EntityRendererProvider.Context context) {
		super(context, new PumpkinZombieModel(context.bakeLayer(PumpkinZombieModel.LAYER)), 0.5f);
	}

}