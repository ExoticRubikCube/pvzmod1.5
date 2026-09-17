package com.hungteen.pvz.client.render.entity.misc;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;

public class FallenStarRender extends ItemEntityRenderer {

	public FallenStarRender(EntityRendererProvider.Context context) {
		super(context);
		this.shadowRadius = 0.15F;
		this.shadowStrength = 0.75F;
	}

	@Override
	protected int getBlockLightLevel(ItemEntity itemEntity, BlockPos pos) {
		return Math.min(super.getBlockLightLevel(itemEntity, pos) + 7, 15);
	}
}
