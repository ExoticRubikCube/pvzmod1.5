package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.model.entity.bullet.CabbageModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.bullet.itembullet.IceCabbageEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IceCabbageRender extends PVZEntityRender<IceCabbageEntity> {

	private static final ResourceLocation ICE_CABBAGE_TEX = StringUtil.prefix("textures/entity/bullet/ice_cabbage.png");

	public IceCabbageRender(EntityRendererProvider.Context context) {
		super(context, new CabbageModel<>(context.bakeLayer(CabbageModel.LAYER)));
	}

	@Override
	protected float getScaleByEntity(IceCabbageEntity entity) {
		return 1F;
	}

	@Override
	public ResourceLocation getTextureLocation(IceCabbageEntity entity) {
		return ICE_CABBAGE_TEX;
	}

}