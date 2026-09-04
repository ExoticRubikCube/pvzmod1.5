package com.hungteen.pvz.client.render.entity.misc.bowling;

import com.hungteen.pvz.common.entity.misc.bowling.WallNutBowlingEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WallNutBowlingRender extends AbstractbowlingRender<WallNutBowlingEntity> {

	public WallNutBowlingRender(EntityRendererProvider.Context context) {
		super(context);
	}
	

}