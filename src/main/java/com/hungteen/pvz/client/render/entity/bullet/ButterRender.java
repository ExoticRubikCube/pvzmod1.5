package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.render.entity.EntityBlockRender;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.entity.bullet.ButterEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ButterRender extends EntityBlockRender<ButterEntity> {

	public ButterRender(EntityRendererProvider.Context context) {
		super(context);
	}

	@Override
	public float getScaleByEntity(ButterEntity entity) {
		return 0.5F;
	}

	@Override
	public BlockState getBlockByEntity(ButterEntity entity) {
		return BlockRegister.BUTTER_BLOCK.get().defaultBlockState();
	}

}