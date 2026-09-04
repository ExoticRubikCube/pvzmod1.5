package com.hungteen.pvz.client.render.entity.zombie.roof;

import com.hungteen.pvz.client.model.entity.zombie.roof.LadderZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.roof.LadderZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LadderZombieRender extends PVZZombieRender<LadderZombieEntity> {

	public LadderZombieRender(EntityRendererProvider.Context context) {
		super(context, new LadderZombieModel(context.bakeLayer(LadderZombieModel.LAYER)), 0.5F);
	}

}