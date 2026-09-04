package com.hungteen.pvz.common.datapack;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.impl.plant.PlantType;
import com.hungteen.pvz.common.network.PVZPacketHandler;
import com.hungteen.pvz.common.network.toclient.DatapackPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.network.PacketDistributor;

public class PVZDataPackManager {

    /**
     * {@link PVZMod#PVZMod()}
     */
    public static void addReloadListenerEvent(AddReloadListenerEvent event) {
        event.addListener(new PlantType.PlantTypeLoader());
        event.addListener(new LotteryTypeLoader());
        event.addListener(new InvasionTypeLoader());
        event.addListener(new ChallengeTypeLoader());
        event.addListener(new TransactionTypeLoader());
    }

    public static void sendSyncPacketsTo(Player player){
        if(player instanceof ServerPlayer) {
            LotteryTypeLoader.JSONS.forEach((key, value) -> PVZPacketHandler.CHANNEL.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), new DatapackPacket(LotteryTypeLoader.NAME, key.toString(), value.toString())));

            TransactionTypeLoader.JSONS.forEach((key, value) -> PVZPacketHandler.CHANNEL.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), new DatapackPacket(TransactionTypeLoader.NAME, key.toString(), value.toString())));

            ChallengeTypeLoader.JSONS.forEach((key, value) -> PVZPacketHandler.CHANNEL.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player), new DatapackPacket(ChallengeTypeLoader.NAME, key.toString(), value.toString())));
        }
    }

}