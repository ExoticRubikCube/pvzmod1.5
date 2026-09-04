package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.client.model.entity.misc.ZombieHandModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.ZombieHandEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ZombieHandRender extends PVZEntityRender<ZombieHandEntity>{

	public ZombieHandRender(EntityRendererProvider.Context context) {
		super(context, new ZombieHandModel(context.bakeLayer(ZombieHandModel.LAYER)));
	}
	
    @Override
	protected float getScaleByEntity(ZombieHandEntity entity) {
		return 0.75f;
	}
    
    @Override
    public Vec3 getTranslateVec(ZombieHandEntity entity) {
    	int tick = entity.getTick();//1 - 40
		return new Vec3(0, 0.05f * tick, 0);
    }
    
	@Override
	public ResourceLocation getTextureLocation(ZombieHandEntity entity) {
		return StringUtil.prefix("textures/entity/zombie/misc/zombie_hand.png");
	}

}