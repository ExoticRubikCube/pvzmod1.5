package com.hungteen.pvz.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;

import org.jetbrains.annotations.Nullable;

public class MashedPotatoParticle extends TextureSheetParticle {

	public MashedPotatoParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.gravity = 0.3F;
		this.friction = 0.9F;
		this.quadSize = 0.5F;
		this.xd = xSpeed + (Math.random() * 2.0D - 1.0D) * 0.05D;
		this.yd = ySpeed + (Math.random() * 2.0D - 1.0D) * 0.05D + 0.05D;
		this.zd = zSpeed + (Math.random() * 2.0D - 1.0D) * 0.05D;
		this.lifetime = (int) (16.0D / ((double) this.random.nextFloat() * 0.8D + 0.2D)) + 5;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
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
			MashedPotatoParticle particle = new MashedPotatoParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed);
			particle.pickSprite(this.sprite);
			return particle;
		}
	}

}