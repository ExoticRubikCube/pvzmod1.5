package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.GatlingPeaZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.GatlingPeaZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GatlingPeaZombieRender extends AbstractZombotanyRender<GatlingPeaZombieEntity> {

	public GatlingPeaZombieRender(EntityRendererProvider.Context context) {
		super(context, new GatlingPeaZombieModel(context.bakeLayer(GatlingPeaZombieModel.LAYER)), 0.4F);
	}

}