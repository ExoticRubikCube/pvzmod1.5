package com.hungteen.pvz.client.challenge;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class ChallengeBgmManager {

	private static final Map<Integer, ChallengeBgmSound> BGMS = new HashMap<>();

	public static void play(int challengeId, ResourceLocation soundLocation) {
		final SoundEvent sound = ForgeRegistries.SOUND_EVENTS.getValue(soundLocation);
		if(sound == null) {
			return;
		}
		//同挑战重复包且实例仍存活：幂等忽略，绝不重建实例，保证无缝循环不被打断；
		//已在淡出（remove 后）的旧实例允许被同曲新实例替换
		final ChallengeBgmSound existing = BGMS.get(challengeId);
		if(existing != null && existing.isActive() && existing.getLocation().equals(sound.getLocation())) {
			return;
		}
		final ChallengeBgmSound bgm = new ChallengeBgmSound(sound);
		BGMS.put(challengeId, bgm);
		Minecraft.getInstance().getSoundManager().play(bgm);
	}

	public static void remove(int challengeId) {
		final ChallengeBgmSound bgm = BGMS.get(challengeId);
		if(bgm != null) {
			//仅触发宽限+淡出，映射保留到实例自停，使 canPlaySound 在淡出期恒为真
			bgm.deactivate();
		}
	}

	public static boolean isActive(ChallengeBgmSound sound) {
		//实例淡出到底自停后引擎不再 tick，顺带清理映射，避免残留
		if(sound.isStopped()) {
			BGMS.values().removeIf(value -> value == sound);
			return false;
		}
		return BGMS.containsValue(sound);
	}
}
