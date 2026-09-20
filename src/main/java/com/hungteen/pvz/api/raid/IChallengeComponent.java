package com.hungteen.pvz.api.raid;

import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

public interface IChallengeComponent {

    /**
     * make sure constructer has no argument,
     * and use this method to initiate instance.
     */
    boolean readJson(JsonObject json);

    /**
     * get how many ticks needed for players to prepare the wave.
     */
    int getPrepareCD(int wavePos);

    /**
     * how many waves is there.
     */
    int getTotalWaveCount();

    /**
     * how long will win state last.
     */
    int getWinTick();

    /**
     * how long will loss state last.
     */
    int getLossTick();

    /**
     * the recommended level to defeat the challenge.
     */
    int getRecommendLevel();

    /**
     * isolated challenge sun each player holds when entering the challenge range.
     */
    int getInitialSun();

    /**
     * sun cap during challenge, overriding player tree level cap.
     */
    int getSunLimit();

    boolean canTrade();

    int getTradeWeight();

    int getTradePrice();

    boolean hasTag(String tag);

    boolean isSuitableDimension(ResourceKey<Level> type);

    boolean showRoundTitle();

    boolean shouldCloseToCenter();

    MutableComponent getChallengeName();

    List<String> getAuthors();

    /**
     * get spawn list of current wave.
     */
    List<ISpawnComponent> getSpawns(int wavePos);

    List<IWaveComponent> getWaves();

    List<IRewardComponent> getRewards();

    IPlacementComponent getPlacement(int wavePos);

    Component getTitle();

    Component getWinTitle();

    Component getLossTitle();

    BossEvent.BossBarColor getBarColor();

    SoundEvent getPrepareSound();

    SoundEvent getStartWaveSound();

    SoundEvent getWinSound();

    SoundEvent getLossSound();

    default SoundEvent getBgmSound() {
        return null;
    }

    /**
     * data driven challenge BGM, analogous to Biome#getBackgroundMusic.
     */
    default Optional<Music> getBgmMusic() {
        return Optional.empty();
    }

    List<Pair<MutableComponent, Integer>> getMessages();

    void setMessages(List<Pair<MutableComponent, Integer>> list);
}