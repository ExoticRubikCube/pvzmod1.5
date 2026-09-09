package com.hungteen.pvz.client.render.entity.zombie;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.client.model.entity.zombie.PVZZombieModel;
import com.hungteen.pvz.client.particle.ModelPartParticle;
import com.hungteen.pvz.client.render.entity.PVZCreatureRender;
import com.hungteen.pvz.client.render.layer.fullskin.CharmLayer;
import com.hungteen.pvz.client.render.layer.fullskin.EnergyLayer;
import com.hungteen.pvz.client.render.layer.fullskin.SunLayer;
import com.hungteen.pvz.client.render.layer.fullskin.SunLightLayer;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.potion.EffectRegister;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;
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
		final ResourceLocation texture = zombie.getZombieType().getRenderResource();
		final float scale = this.getScaleByEntity(zombie);
		switch(type) {
		case LEFT_LEG: {
			this.createPartParticle(zombie, model -> List.of(model.getZombieLeftLeg()),
					texture, scale, type, damageSourcePos, new Vec3(0, zombie.getBbHeight() / 2, 0), Vec3.ZERO);
			break;
		}
		case RIGHT_LEG: {
			this.createPartParticle(zombie, model -> List.of(model.getZombieRightLeg()),
					texture, scale, type, damageSourcePos, new Vec3(0, zombie.getBbHeight() / 2, 0), Vec3.ZERO);
			break;
		}
		case RIGHT_HAND: {
			this.createPartParticle(zombie, model -> List.of(model.getZombieRightHand()),
					texture, scale, type, damageSourcePos, new Vec3(0, 0.75, 0), Vec3.ZERO);
			break;
		}
		case HAND:
		case LEFT_HAND: {
			//出生位与初速度由droppedByOwner对齐1.16.5：僵尸正前方0.6格、眼高、速度为0。
			this.createPartParticle(zombie, model -> List.of(model.getZombieLeftHand()),
					texture, scale, type, damageSourcePos, new Vec3(0, 0.75, 0), new Vec3(0, -0.125, 0));
			break;
		}
		case HEAD: {
			//出生位与hitUp初速度由droppedByOwner对齐1.16.5。
			this.createPartParticle(zombie, model -> {
				List<ModelPart> parts = new ArrayList<>();
				parts.add(model.getZombieHead());
				model.getHelmet().ifPresent(parts::add);
				return parts;
			}, texture, scale, type, damageSourcePos, new Vec3(0, zombie.getEyeHeight(), 0), new Vec3(0, 0.125, 0));
			break;
		}
		case BODY: {
			zombie.getZombieType().getZombieModel2().ifPresent(iz -> {
				ModelPartParticle body = new ModelPartParticle((ClientLevel) zombie.level, zombie.position());
				body.droppedByOwner(zombie, type, damageSourcePos);
				body.texture = texture;
				body.bodyDropModel = iz;
				body.bodyHasHandDefence = zombie.shouldShowBodyDropDefence();
				body.bodyYRot = - zombie.getYRot();
				body.scale(scale);
				ClientProxy.MC.particleEngine.add(body);
			});
			break;
		}
		default:
			break;
		}
	}

	private void createPartParticle(T zombie, PartGetter parts, ResourceLocation texture, float scale, BodyType type, Optional<Vec3> damageSourcePos, Vec3 spawnOffset, Vec3 renderOffset) {
		zombie.getZombieType().getZombieModel1().ifPresent(iz -> {
			if(iz.getZombieModel() instanceof PVZZombieModel<?> model) {
				List<ModelPart> partsList = parts.getParts(model);
				for (ModelPart part : partsList) {
					ModelPartParticle particle = new ModelPartParticle((ClientLevel) zombie.level, part, texture, zombie.position().add(spawnOffset));
					particle.droppedByOwner(zombie, type, damageSourcePos);
					particle.scale(scale).offset(renderOffset);
					ClientProxy.MC.particleEngine.add(particle);
				}
			}
		});
	}

	@FunctionalInterface
	private interface PartGetter {
		List<ModelPart> getParts(PVZZombieModel<?> model);
	}
	
	/**
	 * the height zombie rising from.
	 */
	protected float getOffsetRisingHeight() {
		return 1.6f;
	}
	
	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return entity.getZombieType().getRenderResource();
	}
	
}