package com.hungteen.pvz.client.render.entity.creature;

import com.hungteen.pvz.client.model.entity.creature.MooBloomModel;
import com.hungteen.pvz.client.render.entity.PVZCreatureRender;
import com.hungteen.pvz.common.entity.creature.MooBloom;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MooBloomRender extends PVZCreatureRender<MooBloom>{

	public MooBloomRender(EntityRendererProvider.Context context) {
		super(context, new MooBloomModel<>(context.bakeLayer(MooBloomModel.LAYER)), 0.7F);
	}
	
	@Override
	protected float getScaleByEntity(MooBloom entity) {
		return 1.0F;
	}
	
	@Override
	public ResourceLocation getTextureLocation(MooBloom entity) {
		return StringUtil.prefix("textures/entity/moo_bloom/moo_bloom.png");
	}

}