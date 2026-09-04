package com.hungteen.pvz.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;

import org.jetbrains.annotations.Nullable;

public class PopCornParticle extends PVZNormalParticle {

	public PopCornParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.quadSize = 0.25f;
		this.lifetime = this.random.nextInt(20) + 10;
		this.hasPhysics = true;
		this.gravity = 0.1f;
		this.xd = world.random.nextFloat() - 0.5;
		this.yd = world.random.nextFloat() / 2;
		this.zd = world.random.nextFloat() - 0.5;
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
			PopCornParticle particle = new PopCornParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
			particle.pickSprite(this.sprite);
			return particle;
		}
	}

}