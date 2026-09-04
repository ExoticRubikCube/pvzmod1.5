package com.hungteen.pvz.client.render.entity.misc.bowling;

import com.hungteen.pvz.common.entity.misc.bowling.GiantNutBowlingEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GiantNutBowlingRender extends AbstractbowlingRender<GiantNutBowlingEntity> {

	public GiantNutBowlingRender(EntityRendererProvider.Context context) {
		super(context);
	}
	
	protected float getRenderSize(GiantNutBowlingEntity entity) {
		return 1.2F;
	}
	
}