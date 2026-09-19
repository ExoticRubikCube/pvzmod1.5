package com.hungteen.pvz.common.capability.challenge;
import net.minecraft.nbt.CompoundTag;

public class RaiderDataCapability implements IRaiderDataCapability {

    public int challenge = 0;
    public int threat = 0;
    public int wave = 0;

    public void init(int ch){
        challenge = ch;
    }

    public CompoundTag SavetoNBT(){
        CompoundTag nbt = new CompoundTag();
        nbt.putInt("in_challenge",challenge);
        nbt.putInt("raider_threat",threat);
        nbt.putInt("raider_wave",wave);
        return nbt;
    }

    public void LoadfromNBT(CompoundTag nbt){
        this.challenge = nbt.getInt("in_challenge");
        if(nbt.contains("raider_threat")) {
            this.threat = nbt.getInt("raider_threat");
        }
        if(nbt.contains("raider_wave")) {
            this.wave = nbt.getInt("raider_wave");
        }
    }

    @Override
    public int getChallengeID() {
        return challenge;
    }

    @Override
    public void setChallengeID(int ch) {
        challenge = ch;
    }

    @Override
    public int getThreat() {
        return threat;
    }

    @Override
    public void setThreat(int threat) {
        this.threat = threat;
    }

    @Override
    public int getWave() {
        return wave;
    }

    @Override
    public void setWave(int wave) {
        this.wave = wave;
    }
}