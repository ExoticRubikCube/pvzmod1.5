package com.hungteen.pvz.client.render.layer.fullskin;

import com.hungteen.pvz.common.entity.plant.light.GoldBloomEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoldBloomLightLayer extends PVZFullSkinLayer<GoldBloomEntity, EntityModel<GoldBloomEntity>> {

	public GoldBloomLightLayer(RenderLayerParent<GoldBloomEntity, EntityModel<GoldBloomEntity>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	protected boolean canRender(GoldBloomEntity entity) {
		return true;
	}

	@Override
	protected ResourceLocation getResourceLocation(GoldBloomEntity entity) {
		return StringUtil.prefix("textures/entity/plant/light/gold_bloom_light.png");
	}

}
