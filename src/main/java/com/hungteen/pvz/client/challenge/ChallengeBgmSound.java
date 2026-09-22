package com.hungteen.pvz.client.challenge;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ChallengeBgmSound extends AbstractTickableSoundInstance {

	private static final int FADE_TICK = 40;
	private static final int GRACE_TICK = 60;
	private static final float MIN_VOLUME = 0.025F;

	private boolean active = true;
	private int graceTick = GRACE_TICK;
	private float targetVolume = 1.0F;
	private int ticksExisted = 0;

	public ChallengeBgmSound(SoundEvent sound) {
		super(sound, SoundSource.RECORDS, RandomSource.create());
		//全局音，声音生命周期只跟随挑战存活，玩家离开范围不停播
		this.attenuation = Attenuation.NONE;
		this.looping = true;
		this.delay = 0;
		this.volume = 0.0F;
	}

	public void deactivate() {
		this.active = false;
	}

	public boolean isActive() {
		return this.active;
	}

	@Override
	public boolean canStartSilent() {
		//初始音量 0 用于淡入，须声明允许静音启动，否则 SoundEngine.play 直接跳过本实例
		return true;
	}

	@Override
	public boolean canPlaySound() {
		return ChallengeBgmManager.isActive(this);
	}

	@Override
	public void tick() {
		if(this.active) {
			this.graceTick = GRACE_TICK;
			this.targetVolume = Mth.clamp(this.targetVolume + 1.0F / FADE_TICK, 0.0F, 1.0F);
		} else {
			//载体移除后保留宽限；宽限耗尽才线性淡出，淡出到底由引擎摘除本实例
			if(this.graceTick > 0) {
				-- this.graceTick;
			} else {
				this.targetVolume = Mth.clamp(this.targetVolume - 1.0F / FADE_TICK, 0.0F, 1.0F);
				if(this.targetVolume < MIN_VOLUME) {
					this.stop();
				}
			}
		}
		this.volume = this.targetVolume;
		//周期性压制原版情境音乐抢播，对齐灾变 BossMusicSound
		if(this.ticksExisted % 100 == 0) {
			Minecraft.getInstance().getMusicManager().stopPlaying();
		}
		++ this.ticksExisted;
	}
}
