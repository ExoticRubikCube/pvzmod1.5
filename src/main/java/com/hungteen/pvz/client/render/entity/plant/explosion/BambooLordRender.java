package com.hungteen.pvz.client.render.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.explosion.BambooLordModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.explosion.BambooLordEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BambooLordRender extends PVZPlantRender<BambooLordEntity> {

	public BambooLordRender(EntityRendererProvider.Context context) {
		super(context, new BambooLordModel(context.bakeLayer(BambooLordModel.LAYER)), 0.4F);
	}

}