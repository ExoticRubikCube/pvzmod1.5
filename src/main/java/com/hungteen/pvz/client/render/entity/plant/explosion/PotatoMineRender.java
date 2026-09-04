package com.hungteen.pvz.client.render.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.explosion.PotatoMineModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.explosion.PotatoMineEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PotatoMineRender extends PVZPlantRender<PotatoMineEntity>{

	public PotatoMineRender(EntityRendererProvider.Context context) {
		super(context, new PotatoMineModel(context.bakeLayer(PotatoMineModel.LAYER)), 0.3F);
	}

	@Override
	public float getScaleByEntity(PotatoMineEntity entity) {
		final float sz = super.getScaleByEntity(entity);
		if(entity.isMineReady()) {
			final float scale = 0.15F;
			return sz + entity.getAttackTime() * scale / entity.getAttackCD();
		}
		return sz;
	}
	
	@Override
	public Vec3 getTranslateVec(PotatoMineEntity entity) {
		final float offsetY = 0.6F;
		if(entity.isRisingFromDirt()) {
			final int time = entity.getPrepareCD() - entity.getExistTick();
			return new Vec3(0, time * offsetY / PotatoMineEntity.RISING_ANIM_CD, 0);
		}
		return entity.isMineReady() ? new Vec3(0, 0, 0) : new Vec3(0, offsetY, 0);
	}
	
}