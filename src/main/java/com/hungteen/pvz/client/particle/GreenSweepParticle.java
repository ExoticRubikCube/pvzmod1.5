package com.hungteen.pvz.client.particle;

import com.hungteen.pvz.client.particle.base.SweepParticle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import org.jetbrains.annotations.Nullable;

@OnlyIn(Dist.CLIENT)
public class GreenSweepParticle extends SweepParticle {

	protected GreenSweepParticle(ClientLevel world, double x, double y, double z, double scale, SpriteSet sprite) {
		super(world, x, y, z, scale, sprite);
		this.setColor(0, 0.8F, 0);
	}
	
	@Override
	public void tick() {
		super.tick();
		this.y += 0.6;
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
			return new GreenSweepParticle(worldIn, x, y, z, xSpeed, this.sprite);
		}
	}

}