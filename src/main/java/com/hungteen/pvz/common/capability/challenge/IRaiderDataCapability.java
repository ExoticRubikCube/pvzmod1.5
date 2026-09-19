package com.hungteen.pvz.common.capability.challenge;
import net.minecraft.nbt.CompoundTag;

public interface IRaiderDataCapability {
    void init(int ch);
    CompoundTag SavetoNBT();
    void LoadfromNBT(CompoundTag nbt);
    int getChallengeID();
    void setChallengeID(int ch);
    int getThreat();
    void setThreat(int threat);
    int getWave();
    void setWave(int wave);
}