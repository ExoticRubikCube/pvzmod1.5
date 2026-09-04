package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.PoleZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.PoleZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PoleZombieRender extends PVZZombieRender<PoleZombieEntity>{

	public PoleZombieRender(EntityRendererProvider.Context context) {
		super(context, new PoleZombieModel(context.bakeLayer(PoleZombieModel.LAYER)), 0.5f);
	}

}