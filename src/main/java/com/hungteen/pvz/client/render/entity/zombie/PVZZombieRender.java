package com.hungteen.pvz.client.render.entity.zombie;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.client.particle.ModelPartParticle;
import com.hungteen.pvz.client.render.entity.PVZCreatureRender;
import com.hungteen.pvz.client.render.layer.fullskin.CharmLayer;
import com.hungteen.pvz.client.render.layer.fullskin.EnergyLayer;
import com.hungteen.pvz.client.render.layer.fullskin.SunLayer;
import com.hungteen.pvz.client.render.layer.fullskin.SunLightLayer;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.potion.EffectRegister;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;

import java.util.Optional;

public abstract class PVZZombieRender <T extends PVZZombieEntity> extends PVZCreatureRender<T> {

	public static final float MINI_SCALE = 0.32F;
	
	public PVZZombieRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn, float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
		this.addZombieLayers();
	}

	@Override
	protected boolean isBodyVisible(T livingEntityIn) {
		return super.isBodyVisible(livingEntityIn) || PVZMod.PROXY.getPlayer().hasEffect(EffectRegister.LIGHT_EYE_EFFECT.get());
	}
	
	protected void addZombieLayers() {
		this.addLayer(new EnergyLayer<>(this));
		this.addLayer(new CharmLayer<>(this));
		this.addLayer(new SunLightLayer<>(this));
		this.addLayer(new SunLayer<>(this));
	}
	
	@Override
	public Vec3 getTranslateVec(T entity) {
		float height = this.getOffsetRisingHeight();
		float downOffset = entity.getAnimTime() < 0 ? (- entity.getAnimTime() * 1.0f / PVZZombieEntity.RISING_CD) * height : 0;
		return new Vec3(0, downOffset, 0);
	}
	
	@Override
	protected float getScaleByEntity(T entity) {
		final float sz = entity.getZombieType().getRenderScale();
		return entity.isMiniZombie() ? sz * MINI_SCALE : sz;
	}

	/**
	 * spawn a body part particle when the body part is dropped.
	 * called by {@link com.hungteen.pvz.common.network.toclient.SpawnBodyPartPacket}.
	 */
	public void createBodyParticle(T zombie, BodyType type, Optional<Vec3> damageSourcePos) {
		ModelPartParticle body = new ModelPartParticle((ClientLevel) zombie.level, zombie.position());
		//抛落风格按僵尸由各渲染器子类分派（镜像1.16.5僵尸子类onFallBody）。
		this.onFallBody(body, zombie, type, damageSourcePos);
		ClientProxy.MC.particleEngine.add(body);
	}

	/**
	 * 客户端抛落分派，镜像1.16.5僵尸实体 onFallBody + setBodyStates：默认死亡整体存活40；
	 * 僵王/整车由各自渲染器子类override，巨人经setBodyStates延命到DEATH_ANIM_CD。
	 */
	protected void onFallBody(ModelPartParticle body, T zombie, BodyType type, Optional<Vec3> damageSourcePos) {
		body.scale(this.getScaleByEntity(zombie));
		body.droppedByOwner(zombie, type, damageSourcePos);
		if (type == BodyType.BODY) {
			//ref PVZZombieEntity.onFallBody：死亡整体默认存活40（断手断头维持60）。
			body.setMaxLiveTick(40);
			this.setBodyStates(body, zombie);
		}
	}

	/**
	 * 镜像PVZZombieEntity.setBodyStates：默认空实现，巨人子类override延命。
	 */
	protected void setBodyStates(ModelPartParticle body, T zombie) {
	}

	protected float getOffsetRisingHeight() {
		return 1.6f;
	}

	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return entity.getZombieType().getRenderResource();
	}

}