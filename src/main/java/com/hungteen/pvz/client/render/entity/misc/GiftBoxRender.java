package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.client.model.entity.misc.GiftBoxModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.GiftBoxEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GiftBoxRender extends PVZEntityRender<GiftBoxEntity> {

	private static final ResourceLocation RES = StringUtil.prefix("textures/entity/misc/gift_box.png");

	public GiftBoxRender(EntityRendererProvider.Context context) {
		super(context, new GiftBoxModel(context.bakeLayer(GiftBoxModel.LAYER)));
	}

	@Override
	protected float getScaleByEntity(GiftBoxEntity entity) {
		return 1;
	}

	@Override
	public ResourceLocation getTextureLocation(GiftBoxEntity p_110775_1_) {
		return RES;
	}
}