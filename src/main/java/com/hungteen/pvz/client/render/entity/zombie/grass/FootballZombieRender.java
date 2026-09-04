package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.FootballZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.FootballZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FootballZombieRender extends PVZZombieRender<FootballZombieEntity>{

	public FootballZombieRender(EntityRendererProvider.Context context) {
		super(context, new FootballZombieModel(context.bakeLayer(FootballZombieModel.LAYER)), 0.5f);
	}

}