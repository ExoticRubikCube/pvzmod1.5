package com.hungteen.pvz.api.raid;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;

public interface ISpawnComponent {

    /**
     * make sure constructer has no argument,
     * and use this method to initiate instance.
     */
    boolean readJson(JsonObject json);

    /**
     * threat cost of this zombie in the wave threat budget.
     */
    int getThreat();

    /**
     * pick weight of this zombie in the weighted random selection.
     */
    int getWeight();

    /**
     * earliest wave ratio (0.0 ~ 1.0) this zombie can be picked, aligned with htpvz2 startFrom.
     */
    float getStartFrom();

    /**
     * elite zombie can only be picked in big waves.
     */
    boolean isElite();

    /**
     * flag zombie is forced as the first summon of a big wave.
     */
    boolean isFlag();

    IPlacementComponent getPlacement();

    CompoundTag getNBT();

    EntityType<?> getSpawnType();

}