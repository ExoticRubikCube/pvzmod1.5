package com.hungteen.pvz.api.interfaces;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;

public interface IChallenge {

    BlockPos getCenter();

    ServerLevel getWorld();
}