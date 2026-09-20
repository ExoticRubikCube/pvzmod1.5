package com.hungteen.pvz.mixin.client;

import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.client.challenge.ClientChallengeBarManager;
import com.hungteen.pvz.client.challenge.ClientChallengeBarManager.BarData;
import com.hungteen.pvz.common.datapack.ChallengeTypeLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.LerpingBossEvent;
import net.minecraft.sounds.Music;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

@Mixin(Minecraft.class)
public class MinecraftMixin {

	private static boolean pvz$hadChallengeMusic = false;

	/**
	 * 挑战 bar 在任意维度都直接给出挑战 BGM 情境。音乐一旦响起就持续循环，玩家进出范围不停曲不重播；
	 * 仅当挑战 bar 仍在而音乐标志翻平（终态）时单次 stopPlaying 完成硬切
	 * （普通群系音乐 replace=false 不会主动打断当前曲，需在此显式停）。
	 */
	@Inject(method = "getSituationalMusic", at = @At("HEAD"), cancellable = true)
	private void pvz$challengeMusic(CallbackInfoReturnable<Music> cir) {
		final Minecraft minecraft = (Minecraft)(Object)this;
		final Map<UUID, LerpingBossEvent> events = minecraft.gui.getBossOverlay().events;
		final Music music = getChallengeMusic(events);
		if (music != null) {
			pvz$hadChallengeMusic = true;
			cir.setReturnValue(music);
		} else if (pvz$hadChallengeMusic && hasEndedChallengeBar(events)) {
			pvz$hadChallengeMusic = false;
			minecraft.getMusicManager().stopPlaying();
		}
	}

	@Nullable
	private static Music getChallengeMusic(Map<UUID, LerpingBossEvent> events) {
		for (LerpingBossEvent event : events.values()) {
			if (event.shouldPlayBossMusic()) {
				final Music music = resolveChallengeMusic(event);
				if (music != null) {
					return music;
				}
			}
		}
		return null;
	}

	/**
	 * 挑战 bar 仍在但音乐标志已翻平，说明该挑战已进入终态（胜利/失败）；
	 * 玩家离开范围时 bar 直接被移除、不在此列，因此进出范围不会误停音乐。
	 */
	private static boolean hasEndedChallengeBar(Map<UUID, LerpingBossEvent> events) {
		for (LerpingBossEvent event : events.values()) {
			if (! event.shouldPlayBossMusic() && resolveChallengeMusic(event) != null) {
				return true;
			}
		}
		return false;
	}

	@Nullable
	private static Music resolveChallengeMusic(LerpingBossEvent event) {
		final BarData data = ClientChallengeBarManager.getByBarUuid(event.getId());
		if (data == null) {
			return null;
		}
		final IChallengeComponent component = ChallengeTypeLoader.CHALLENGE_MAP.get(data.getResource());
		if (component == null) {
			return null;
		}
		return component.getBgmMusic().orElse(null);
	}
}
