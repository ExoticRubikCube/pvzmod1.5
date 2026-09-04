package com.hungteen.pvz.client.particle.base;

import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class SweepParticle extends TextureSheetParticle {
	
	protected final SpriteSet sprite;

	protected SweepParticle(ClientLevel world, double x, double y, double z, double scale, SpriteSet sprite) {
	      super(world, x, y, z, 0.0D, 0.0D, 0.0D);
	      this.sprite = sprite;
	      this.lifetime = 4;
	      float f = this.random.nextFloat() * 0.6F + 0.4F;
	      this.rCol = f;
	      this.gCol = f;
	      this.bCol = f;
	      this.quadSize = 1.0F - (float)scale * 0.5F;
	      this.setSpriteFromAge(sprite);
	   }

	public int getLightColor(float partialTick) {
		return 15728880;
	}

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

	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

}