package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.event.handler.BlockEventHandler;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class PVZBlockEvents {

	@SubscribeEvent
	public static void onPlayerBreakBlock(BlockEvent.BreakEvent ev) {
		BlockEventHandler.checkAndDropSeeds(ev);
		BlockEventHandler.triggerAmethystAround(ev);
	}

	@SubscribeEvent
	public static void onBlockPlacedBy(BlockEvent.EntityPlaceEvent ev) {
		//TODO coffincarriers(Coffin) summoning method deleted temporaryly
	}
}