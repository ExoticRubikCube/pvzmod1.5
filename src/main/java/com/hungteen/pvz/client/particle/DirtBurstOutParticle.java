package com.hungteen.pvz.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;

import org.jetbrains.annotations.Nullable;

public class DirtBurstOutParticle extends PVZNormalParticle {

	public DirtBurstOutParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.quadSize = 0.05F;
		this.lifetime = 30 + this.random.nextInt(30);
		this.hasPhysics = true;
		this.gravity = 0.02F;
	}

	public static class Provider implements ParticleProvider<SimpleParticleType> {

		private final SpriteSet sprite;

		public Provider(SpriteSet sprite) {
			this.sprite = sprite;
		}

		@Nullable
		@Override
		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z,
				double xSpeed, double ySpeed, double zSpeed) {
			DirtBurstOutParticle particle = new DirtBurstOutParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
			particle.pickSprite(this.sprite);
			return particle;
		}
	}

}