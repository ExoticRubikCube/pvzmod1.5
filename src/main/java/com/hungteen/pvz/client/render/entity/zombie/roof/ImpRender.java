package com.hungteen.pvz.client.render.entity.zombie.roof;

import com.hungteen.pvz.client.model.entity.zombie.roof.ImpModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.roof.ImpEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ImpRender extends PVZZombieRender<ImpEntity> {

	public ImpRender(EntityRendererProvider.Context context) {
		super(context, new ImpModel(context.bakeLayer(ImpModel.LAYER)), 0.3F);
	}

}