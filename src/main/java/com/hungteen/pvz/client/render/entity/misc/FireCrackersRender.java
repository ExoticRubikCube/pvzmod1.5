package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.client.model.entity.misc.FireCrackersModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.FireCrackersEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FireCrackersRender extends PVZEntityRender<FireCrackersEntity> {

	private static final ResourceLocation FIRE_CRACKERS_TEX = StringUtil.prefix("textures/entity/misc/fire_crackers.png");
	public FireCrackersRender(EntityRendererProvider.Context context) {
		super(context, new FireCrackersModel(context.bakeLayer(FireCrackersModel.LAYER)));
	}

	@Override
	protected float getScaleByEntity(FireCrackersEntity entity) {
		return 1F + 0.1F * Mth.sin(entity.getFuse() * 0.1F);
	}

	@Override
	public ResourceLocation getTextureLocation(FireCrackersEntity entity) {
		return FIRE_CRACKERS_TEX;
	}

}