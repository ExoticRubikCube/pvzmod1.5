package com.hungteen.pvz.common.world;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.client.particle.ParticleRegister;
import com.hungteen.pvz.common.capability.level.PVZFogCapability;
import com.hungteen.pvz.common.potion.EffectRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class PVZFog {

	public int lifeLeft;
	public BlockPos position;
	public BlockPos targetPos;
	public double strength;
	public double range;
	public double effect = 0;
	public final UUID uuid;
	private static final Random random = new Random();
	private static double bufferStrength = 1e-10;

	public PVZFog(BlockPos position, int lifeTime, double strength, double range) {
		this(position, lifeTime, strength, range, UUID.randomUUID());
	}

	public PVZFog(BlockPos position, int lifeTime, double strength, double range, UUID uuid) {
		this.position = position;
		this.lifeLeft = lifeTime;
		this.strength = strength;
		this.range = range;
		this.uuid = uuid;
	}

	public double getStrengthAt(Vec3 pos) {
		return Math.max(
				(this.range - Vec3.atCenterOf(this.position).multiply(1, this.range > 5 ? this.range / 5 : 1, 1)
				.distanceTo(pos.multiply(1, this.range > 5 ? this.range / 5 : 1, 1))) / this.range * 5 * 0.5 + 0.5
				, 0) * this.strength;
	}

	public UUID getUuid() {
		return uuid;
	}

	public static double getFogStrengthAt(Level level, Vec3 pos) {
		AtomicReference<Double> strength = new AtomicReference<>((double) 0);
		level.getCapability(PVZFogCapability.CAP).ifPresent(cap -> {
			for (PVZFog fog : cap.fogs.values()) {
				strength.set(Math.max(fog.getStrengthAt(pos), strength.get()));
			}
		});
		return strength.get();
	}

	@OnlyIn(Dist.CLIENT)
	public static void clientTick(double tickTime) {
		if (! Minecraft.getInstance().isPaused()) {
			Level level = ClientProxy.MC.level;
			if (level == null) {
				return;
			}
			level.getCapability(PVZFogCapability.CAP).ifPresent(cap -> {
				for (PVZFog fog : Set.copyOf(cap.fogs.values())) {
					fog.lifeLeft -= (int) (tickTime * 50);
					Player player = ClientProxy.MC.player;
					if (player != null) {
						boolean playerInFog = getFogStrengthAt(player.level, player.position()) >= 0.5;
						float particleNum = (float) (fog.range * fog.range * fog.strength / (playerInFog ? 3000 : 500));
						while (random.nextFloat() < particleNum) {
							particleNum --;
							double yOffset = (random.nextDouble(10) - 5) * (playerInFog ? random.nextFloat() : 1);
							double yRot = random.nextDouble(Math.PI * 2);
							double radius = random.nextDouble(fog.range);
							player.level.addParticle(ParticleRegister.FOG.get(),
									fog.position.getX() + radius * Math.sin(yRot) + 5,
									fog.position.getY() + yOffset,
									fog.position.getZ() + radius * Math.cos(yRot),
									0, 0, 0);
						}
						if (fog.lifeLeft < 0) {
							cap.fogs.remove(fog.uuid);
						}
					}
				}
			});
		}
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void handleFogs(ViewportEvent.RenderFog ev) {
		Player player = ClientProxy.MC.player;
		if (player != null) {
			double strength = getFogStrengthAt(player.level, player.position());
			if (player.hasEffect(EffectRegister.LIGHT_EYE_EFFECT.get())) {
				bufferStrength = (float) (bufferStrength * 0.995 + strength * 0.0005);
			} else {
				bufferStrength = (float) (bufferStrength * 0.995 + strength * 0.005);
			}
			if (bufferStrength < 1e-8) {
				bufferStrength = 0;
			}
			if (bufferStrength > 0) {
				ev.setCanceled(true);
				float far = ev.getFarPlaneDistance();
				float near = ev.getNearPlaneDistance();
				ev.setFarPlaneDistance(Math.min(ev.getFarPlaneDistance(), (float) (0.01 + 50 / (bufferStrength + 49 / ev.getFarPlaneDistance()))));
				if (ev.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
					ev.setNearPlaneDistance(ev.getFarPlaneDistance() * near / far - ev.getFarPlaneDistance() * (far - ev.getFarPlaneDistance()) / far);
				}
			}
		}
	}
}
