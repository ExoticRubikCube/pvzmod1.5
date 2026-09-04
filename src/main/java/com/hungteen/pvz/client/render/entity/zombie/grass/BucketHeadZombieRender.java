package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.BucketHeadZombieModel;
import com.hungteen.pvz.common.entity.zombie.grass.BucketHeadZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BucketHeadZombieRender extends AbstractNormalRender<BucketHeadZombieEntity>{

	public BucketHeadZombieRender(EntityRendererProvider.Context context) {
		super(context, new BucketHeadZombieModel(context.bakeLayer(BucketHeadZombieModel.LAYER)),0.5f);
	}

}