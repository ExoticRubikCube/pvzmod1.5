package com.hungteen.pvz.client.render.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.arma.CabbagePultModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.arma.CabbagePultEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CabbagePultRender extends PVZPlantRender<CabbagePultEntity> {

	private static final ResourceLocation ICE_CABBAGE_PULT_TEX = StringUtil.prefix("textures/entity/plant/ice/ice_cabbage_pult.png");

	public CabbagePultRender(EntityRendererProvider.Context context) {
		super(context, new CabbagePultModel(context.bakeLayer(CabbagePultModel.LAYER)), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(CabbagePultEntity entity) {
		if(entity.isIceCabbage()) {
			return ICE_CABBAGE_PULT_TEX;
		}
		return super.getTextureLocation(entity);
	}

}