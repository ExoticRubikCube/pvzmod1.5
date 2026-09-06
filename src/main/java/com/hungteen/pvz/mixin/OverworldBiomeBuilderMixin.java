package com.hungteen.pvz.mixin;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(OverworldBiomeBuilder.class)
public class OverworldBiomeBuilderMixin {

	@Unique
    private static final ResourceKey<Biome> ZEN_GARDEN = ResourceKey.create(
			Registry.BIOME_REGISTRY, new ResourceLocation("pvz", "zen_garden"));

	@Inject(method = "addBiomes", at = @At("TAIL"))
	@SuppressWarnings("unchecked")
	private void pvz_addZenGarden(Consumer consumer, CallbackInfo ci) {
		Climate.Parameter temperature = Climate.Parameter.span(0.0F, 1.0F);
		Climate.Parameter humidity = Climate.Parameter.span(-0.35F, 0.35F);
		Climate.Parameter continentalness = Climate.Parameter.span(-0.11F, 1.0F);
		Climate.Parameter erosion = Climate.Parameter.span(-0.375F, 0.55F);
		Climate.Parameter weirdness = Climate.Parameter.span(-1.0F, 1.0F);
		consumer.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, 0.0F), ZEN_GARDEN));
		consumer.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, 0.0F), ZEN_GARDEN));
	}
}