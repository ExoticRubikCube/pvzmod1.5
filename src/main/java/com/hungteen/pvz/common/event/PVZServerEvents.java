package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.world.invasion.InvasionManager;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class PVZServerEvents {

	@SubscribeEvent
    public static void serverInit(ServerStartingEvent ev) {
    	ServerLevel world = ev.getServer().getLevel(Level.OVERWORLD);
    	InvasionManager.syncStartInvasionCache(world);
    }
    
    @SubscribeEvent
    public static void serverShutDown(ServerStoppingEvent ev) {
    	ServerLevel world = ev.getServer().getLevel(Level.OVERWORLD);
    	InvasionManager.syncEndInvasionCache(world);
    }
    
}