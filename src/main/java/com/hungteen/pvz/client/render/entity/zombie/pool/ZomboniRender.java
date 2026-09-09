package com.hungteen.pvz.client.render.entity.zombie.pool;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.client.model.entity.zombie.pool.ZomboniModel;
import com.hungteen.pvz.client.particle.ModelPartParticle;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.pool.ZomboniEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Optional;

@OnlyIn(Dist.CLIENT)
public class ZomboniRender extends PVZZombieRender<ZomboniEntity>{

	public ZomboniRender(EntityRendererProvider.Context context) {
		super(context, new ZomboniModel(context.bakeLayer(ZomboniModel.LAYER)), 0.5f);
	}
	
	@Override
	protected boolean isShaking(ZomboniEntity zombie) {
		return zombie.isCarShaking();
	}

	@Override
	protected void onFallBody(ModelPartParticle body, ZomboniEntity zombie, BodyType type, Optional<Vec3> damageSourcePos) {
		body.scale(this.getScaleByEntity(zombie));
		//ref CarZombieEntity.onFallBody→specialDropBody：整车整车以0.5三轴抛飞，存活默认60。
		body.specialDropBody(zombie, type, damageSourcePos);
	}

}