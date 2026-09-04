package com.hungteen.pvz.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;

import org.jetbrains.annotations.Nullable;

public class SporeParticle extends PVZNormalParticle {

	public SporeParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.quadSize = 0.2f;
		if (xSpeed <= 0.01F) {
			this.lifetime = this.random.nextInt(2) + 1;
		} else {
			this.lifetime = this.random.nextInt(20) + 20;
		}
		this.hasPhysics = false;
		this.gravity = 0f;
		float f = this.random.nextFloat() * 0.6F + 0.4F;
		this.rCol = f * 0.9F;
		this.gCol = f * 0.3F;
		this.bCol = f;
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
			SporeParticle particle = new SporeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
			particle.pickSprite(this.sprite);
			return particle;
		}
	}

}