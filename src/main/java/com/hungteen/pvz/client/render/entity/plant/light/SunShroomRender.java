package com.hungteen.pvz.client.render.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.light.SunShroomModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.light.SunShroomEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SunShroomRender extends PVZPlantRender<SunShroomEntity>{
	private static final ResourceLocation GROWN_TEXTURE = StringUtil.prefix("textures/entity/plant/light/sun_shroom_grown.png");

	public SunShroomRender(EntityRendererProvider.Context context) {
		super(context, new SunShroomModel(context.bakeLayer(SunShroomModel.LAYER)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SunShroomEntity entity) {
		return entity.getExistTick() >= SunShroomEntity.GROW_CD - SunShroomEntity.GROW_ANIM_CD
				? GROWN_TEXTURE : super.getTextureLocation(entity);
	}

	@Override
	public float getScaleByEntity(SunShroomEntity entity) {
		final float smallSize = 0.2F;
		final float bigSize = 0.35F;
		final int animStart = SunShroomEntity.GROW_CD - SunShroomEntity.GROW_ANIM_CD;
		final int tick = entity.getExistTick();
		if(tick < animStart) {
			return smallSize;
		}
		if(tick < SunShroomEntity.GROW_CD) {
			/* grow-up window kept in sync with SunShroomEntity#growUpTo */
			final float progress = (float) (tick - animStart) / SunShroomEntity.GROW_ANIM_CD;
			return smallSize + (bigSize - smallSize) * progress;
		}
		return bigSize;
	}

}