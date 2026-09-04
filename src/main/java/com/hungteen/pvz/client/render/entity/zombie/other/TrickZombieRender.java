package com.hungteen.pvz.client.render.entity.zombie.other;

import com.hungteen.pvz.client.model.entity.zombie.other.TrickZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.other.TrickZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TrickZombieRender extends PVZZombieRender<TrickZombieEntity>{

	public TrickZombieRender(EntityRendererProvider.Context context) {
		super(context, new TrickZombieModel(context.bakeLayer(TrickZombieModel.LAYER)), 0.3f);
	}

}