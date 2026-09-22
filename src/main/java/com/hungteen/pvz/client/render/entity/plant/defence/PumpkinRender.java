package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.component.PumpkinArmorLayer;
import com.hungteen.pvz.common.entity.plant.defence.PumpkinEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PumpkinRender extends PVZPlantRender<PumpkinEntity>{

	private final ResourceLocation TEX0 = StringUtil.prefix("textures/entity/plant/defence/pumpkin.png");
	private final ResourceLocation TEX1 = StringUtil.prefix("textures/entity/plant/defence/pumpkin_1.png");
	private final ResourceLocation TEX2 = StringUtil.prefix("textures/entity/plant/defence/pumpkin_2.png");

	public PumpkinRender(EntityRendererProvider.Context context) {
		super(context, new PumpkinModel(context.bakeLayer(PumpkinModel.LAYER)), 1f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new PumpkinArmorLayer(this));
	}

	@Override
	public ResourceLocation getTextureLocation(PumpkinEntity entity) {
		final double percent = entity.getHealth() / entity.getMaxHealth();
		return percent > 2 / 3F ? TEX0 : percent > 1 / 3F ? TEX1 : TEX2;
	}

}