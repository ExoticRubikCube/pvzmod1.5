package com.hungteen.pvz.client.render.entity.zombie.other;

import com.hungteen.pvz.client.model.entity.zombie.other.MournerZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.other.MournerZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MournerZombieRender extends PVZZombieRender<MournerZombieEntity>{

	public MournerZombieRender(EntityRendererProvider.Context context) {
		super(context, new MournerZombieModel(context.bakeLayer(MournerZombieModel.LAYER)), 0.5f);
	}

}