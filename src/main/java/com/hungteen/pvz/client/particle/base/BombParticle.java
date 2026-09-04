package com.hungteen.pvz.client.particle.base;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BombParticle extends TextureSheetParticle {

	protected final SpriteSet sprite;

	protected BombParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed,
                           SpriteSet sprite) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.lifetime = 6 + this.random.nextInt(4);
		this.setColor(1, 0, 0);
		this.quadSize = 4;
		this.sprite = sprite;
		this.hasPhysics = false;
		this.setSpriteFromAge(this.sprite);
	}

	@Override
	public void tick() {
		this.xo = this.x;
		this.yo = this.y;
		this.zo = this.z;
		if (this.age++ >= this.lifetime) {
			this.remove();
		} else {
			this.setSpriteFromAge(this.sprite);
		}
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

}