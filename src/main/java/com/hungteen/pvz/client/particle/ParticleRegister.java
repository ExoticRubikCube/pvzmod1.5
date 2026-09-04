package com.hungteen.pvz.client.particle;

import com.hungteen.pvz.PVZMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParticleRegister {

	public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PVZMod.MOD_ID);

	public static final RegistryObject<SimpleParticleType> RED_BOMB = PARTICLE_TYPES.register("red_bomb", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> YELLOW_BOMB = PARTICLE_TYPES.register("yellow_bomb", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> DIRT_BURST_OUT = PARTICLE_TYPES.register("dirt_burst_out", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> YELLOW_FLAME = PARTICLE_TYPES.register("yellow_flame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLUE_FLAME = PARTICLE_TYPES.register("blue_flame", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SLEEP = PARTICLE_TYPES.register("sleep", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPORE = PARTICLE_TYPES.register("spore", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FUME = PARTICLE_TYPES.register("fume", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SNOW_FLOWER = PARTICLE_TYPES.register("snow_flower", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> DOOM = PARTICLE_TYPES.register("doom", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MELON_SLICE = PARTICLE_TYPES.register("melon_slice", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> FROZEN_MELON_SLICE = PARTICLE_TYPES.register("frozen_melon_slice", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> GREEN_SWEEP = PARTICLE_TYPES.register("green_sweep", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> POP_CORN = PARTICLE_TYPES.register("pop_corn", () -> new SimpleParticleType(false));

}