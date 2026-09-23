package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.model.entity.bullet.CabbageModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.bullet.itembullet.CabbageEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CabbageRender extends PVZEntityRender<CabbageEntity> {

	private static final ResourceLocation CABBAGE_TEX = StringUtil.prefix("textures/entity/bullet/cabbage.png");

	public CabbageRender(EntityRendererProvider.Context context) {
		super(context, new CabbageModel<>(context.bakeLayer(CabbageModel.LAYER)));
	}

	@Override
	protected float getScaleByEntity(CabbageEntity entity) {
		return 1F;
	}

	@Override
	public ResourceLocation getTextureLocation(CabbageEntity entity) {
		return CABBAGE_TEX;
	}

}