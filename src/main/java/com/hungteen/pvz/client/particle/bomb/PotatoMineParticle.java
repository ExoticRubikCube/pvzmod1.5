package com.hungteen.pvz.client.particle.bomb;

import com.hungteen.pvz.client.particle.base.BombParticle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import org.jetbrains.annotations.Nullable;

@OnlyIn(Dist.CLIENT)
public class PotatoMineParticle extends BombParticle {

	public PotatoMineParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed,
                              SpriteSet sprite) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed, sprite);
		this.lifetime = 6 + this.random.nextInt(4);
		this.setColor(1, 1, 0.5f);
		this.quadSize = 3;
		this.hasPhysics = false;
		this.setSpriteFromAge(this.sprite);
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
			return new PotatoMineParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.sprite);
		}
	}
}