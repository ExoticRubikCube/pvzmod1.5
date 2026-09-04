package com.hungteen.pvz.client.render.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.magic.ImitaterModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.magic.ImitaterEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ImitaterRender extends PVZPlantRender<ImitaterEntity> {

	public ImitaterRender(EntityRendererProvider.Context context) {
		super(context, new ImitaterModel(context.bakeLayer(ImitaterModel.LAYER)), 0);
	}

}