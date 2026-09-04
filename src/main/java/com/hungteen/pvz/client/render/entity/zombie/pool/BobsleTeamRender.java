package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.client.model.entity.zombie.pool.BobsleTeamModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.BobsleTeamEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BobsleTeamRender extends PVZZombieRender<BobsleTeamEntity>{

	public BobsleTeamRender(EntityRendererProvider.Context context) {
		super(context, new BobsleTeamModel(context.bakeLayer(BobsleTeamModel.LAYER)), 0.6f);
	}

}