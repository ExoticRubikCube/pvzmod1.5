package com.hungteen.pvz.client.particle;

import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.multiplayer.ClientLevel;

public abstract class PVZNormalParticle extends TextureSheetParticle{

	public PVZNormalParticle(ClientLevel world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
		super(world, x, y, z, xSpeed, ySpeed, zSpeed);
		this.xd = xSpeed;
		this.yd = ySpeed;
		this.zd = zSpeed;
	}

	@Override
    public void tick() {
        xo = x;
        yo = y;
        zo = z;
        if (age++ >= lifetime) {
            this.remove();
        }
        this.move(this.xd, this.yd, this.zd);
        this.yd -= this.gravity;
        if (onGround) {
            xd *= 0.0D;
            zd *= 0.0D;
        }
    }
	
	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

}