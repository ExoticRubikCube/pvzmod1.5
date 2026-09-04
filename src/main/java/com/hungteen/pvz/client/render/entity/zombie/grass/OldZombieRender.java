package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.OldZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.OldZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OldZombieRender extends PVZZombieRender<OldZombieEntity>{

	public OldZombieRender(EntityRendererProvider.Context context) {
		super(context, new OldZombieModel(context.bakeLayer(OldZombieModel.LAYER)), 0.5F);
	}

}