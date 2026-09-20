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
	 * 挑战 BGM 只在玩家处于挑战范围内时播放：bar 对当前客户端不可见（离开范围被移除、或终态音乐标志翻平）的
	 * 那一刻单次 stopPlaying 完成硬切（普通群系音乐 replace=false 不会主动打断当前曲，需在此显式停）。
	 * 挑战自身进度由服务端持续推进，不因玩家进出范围而重置。
	 */
	@Inject(method = "getSituationalMusic", at = @At("HEAD"), cancellable = true)
	private void pvz$challengeMusic(CallbackInfoReturnable<Music> cir) {
		final Minecraft minecraft = (Minecraft)(Object)this;
		final Map<UUID, LerpingBossEvent> events = minecraft.gui.getBossOverlay().events;
		final Music music = getChallengeMusic(events);
		if (music != null) {
			pvz$hadChallengeMusic = true;
			cir.setReturnValue(music);
		} else if (pvz$hadChallengeMusic) {
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
