package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.utils.MathUtil;

import net.minecraftforge.event.level.SaplingGrowTreeEvent;
import net.minecraftforge.eventbus.api.Event.Result;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=PVZMod.MOD_ID)
public class TreeEvents {

	@SubscribeEvent
	public static void onTreeGrow(SaplingGrowTreeEvent ev) {
		if(! ev.getLevel().isClientSide()) {
			final boolean isBlocked = ! ev.getLevel().isEmptyBlock(ev.getPos().above());
			if(PVZConfig.COMMON_CONFIG.RuleSettings.AllowNaturalTurnOrigin.get() || isBlocked) {
				final double chance = PVZConfig.COMMON_CONFIG.BlockSettings.SaplingTurnChance.get();
				if(MathUtil.randDouble(ev.getLevel().getRandom(), isBlocked ? chance * 1.2 : chance) && ev.getPos().getY() > 2) {
					ev.getLevel().setBlock(ev.getPos().below(), BlockRegister.ORIGIN_ORE.get().defaultBlockState(), 3);
					ev.setResult(Result.DENY);
				}
			}
		}
	}
	
}