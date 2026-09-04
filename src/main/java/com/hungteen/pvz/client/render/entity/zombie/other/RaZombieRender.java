package com.hungteen.pvz.client.render.entity.zombie.other;

import com.hungteen.pvz.client.model.entity.zombie.other.RaZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.other.RaZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RaZombieRender extends PVZZombieRender<RaZombieEntity> {

	public RaZombieRender(EntityRendererProvider.Context context) {
		super(context, new RaZombieModel(context.bakeLayer(RaZombieModel.LAYER)), 0.5F);
	}

}