package com.hungteen.pvz.client.particle;

import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ParticleUtil {

	public static void spawnSplash(Level world, Vec3 vec, int cnt) {
		for(int i = 0; i < cnt; ++i) {
			RandomSource rand = world.random;
			world.addParticle(ParticleRegister.DIRT_BURST_OUT.get(), vec.x + 0.5d, vec.y, vec.z + 0.5d, (rand.nextFloat() - 0.5) / 10, 0.05d, (rand.nextFloat() - 0.5) / 10);
			world.addParticle(ParticleRegister.DIRT_BURST_OUT.get(), vec.x + 0.5d, vec.y, vec.z - 0.5d, (rand.nextFloat() - 0.5) / 10, 0.05d, (rand.nextFloat() - 0.5) / 10);
			world.addParticle(ParticleRegister.DIRT_BURST_OUT.get(), vec.x - 0.5d, vec.y, vec.z + 0.5d, (rand.nextFloat() - 0.5) / 10, 0.05d, (rand.nextFloat() - 0.5) / 10);
			world.addParticle(ParticleRegister.DIRT_BURST_OUT.get(), vec.x - 0.5d, vec.y, vec.z - 0.5d, (rand.nextFloat() - 0.5) / 10, 0.05d, (rand.nextFloat() - 0.5) / 10);
		}
	}
}