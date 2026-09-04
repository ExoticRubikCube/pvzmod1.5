package com.hungteen.pvz.client.render.entity.plant.ice;

import com.hungteen.pvz.client.model.entity.plant.ice.IcebergLettuceModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.ice.IcebergLettuceEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IcebergLettuceRender extends PVZPlantRender<IcebergLettuceEntity> {

	public IcebergLettuceRender(EntityRendererProvider.Context context) {
		super(context, new IcebergLettuceModel(context.bakeLayer(IcebergLettuceModel.LAYER)), 0.3F);
	}

}