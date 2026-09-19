package com.hungteen.pvz.api.raid;

import com.google.gson.JsonObject;

import java.util.List;

public interface IWaveComponent {

    /**
     * make sure constructer has no argument, <br>
     * and use this method to initiate instance.
     */
    boolean readJson(JsonObject json);

    /**
     * how many ticks needed for players to prepare this wave.
     */
    int getPrepareCD();

    /**
     * threat budget of this wave, aligned with htpvz2 Wave.threat.
     */
    int getThreat();

    /**
     * flag wave (big wave), the first summon is forced to be a flag zombie.
     */
    boolean isBigWave();

    /**
     * minimum in-wave ticks before switching to next wave is allowed.
     */
    int getMinimumWaitTime();

    /**
     * maximum in-wave ticks, after which the wave must be cleared before switching.
     */
    int getMaximumWaitTime();

    /**
     * get spawn component list.
     */
    List<ISpawnComponent> getSpawns();

    IPlacementComponent getPlacement();
}
