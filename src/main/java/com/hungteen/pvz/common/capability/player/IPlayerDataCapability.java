package com.hungteen.pvz.common.capability.player;

import net.minecraft.world.entity.player.Player;

public interface IPlayerDataCapability{

	void init(Player pl);

	PlayerDataManager getPlayerData();
}
