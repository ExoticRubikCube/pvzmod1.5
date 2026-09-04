package com.hungteen.pvz.client.render.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.appease.PeaShooterModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.appease.PeaShooterEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PeaShooterRender extends PVZPlantRender<PeaShooterEntity>{

	public PeaShooterRender(EntityRendererProvider.Context context) {
		super(context, new PeaShooterModel(context.bakeLayer(PeaShooterModel.LAYER)), 0.4f);
	}

}