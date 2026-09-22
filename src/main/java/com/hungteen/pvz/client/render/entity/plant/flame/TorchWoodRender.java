package com.hungteen.pvz.client.render.entity.plant.flame;

import com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.TorchWoodFireLayer;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TorchWoodRender extends PVZPlantRender<TorchWoodEntity>{

	private static final ResourceLocation BLUE = StringUtil.prefix("textures/entity/plant/flame/torch_wood_blue.png");

	public TorchWoodRender(EntityRendererProvider.Context context) {
		super(context, new TorchWoodModel(context.bakeLayer(TorchWoodModel.LAYER)), 0.4f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new TorchWoodFireLayer(this));
	}

	@Override
	public ResourceLocation getTextureLocation(TorchWoodEntity entity) {
		return entity.getFlameType() == TorchWoodEntity.FlameTypes.BLUE ? BLUE : super.getTextureLocation(entity);
	}

}