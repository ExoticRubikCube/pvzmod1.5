package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.PlanternModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.fullskin.PlanternLayerRender;
import com.hungteen.pvz.common.entity.plant.light.PlanternEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class PlanternRender extends PVZPlantRender<PlanternEntity> {

	public PlanternRender(EntityRendererProvider.Context context) {
		super(context, new PlanternModel(context.bakeLayer(PlanternModel.LAYER)), 0.4f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new PlanternLayerRender(this));
	}
	
	@Nullable
	protected RenderType func_230042_a_(PlanternEntity p_230042_1_, boolean p_230042_2_, boolean p_230042_3_) {
		ResourceLocation resourcelocation = this.getTextureLocation(p_230042_1_);
		return RenderType.entityTranslucentCull(resourcelocation);
	}
	
}