package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.client.model.entity.misc.SmallChomperModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.SmallChomperEntity;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SmallChomperRender extends PVZEntityRender<SmallChomperEntity>{

	public SmallChomperRender(EntityRendererProvider.Context context) {
		super(context, new SmallChomperModel(context.bakeLayer(SmallChomperModel.LAYER)));
	}

	@Override
	protected float getScaleByEntity(SmallChomperEntity entity) {
		return 1f;
	}
	
	@Override
	public Vec3 getTranslateVec(SmallChomperEntity entity) {
		int tick = entity.getTick();//1 - 20
		return new Vec3(0, 1f - 0.05f * tick, 0);
	}
	
	@Override
	public ResourceLocation getTextureLocation(SmallChomperEntity entity) {
		return StringUtil.prefix("textures/entity/plant/enforce/chomper.png");
	}

}