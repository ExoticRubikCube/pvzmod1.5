package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.utils.EntityUtil;

import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=PVZMod.MOD_ID)
public class PVZEntityEvents {

	@SubscribeEvent
	public static void onEntityJoinOverWorld(EntityJoinLevelEvent ev) {
		/* plants play the placement sound only once they actually join the world;
		 * a pre-created entity discarded by failed card checks never reaches here */
		if(ev.getEntity() instanceof PVZPlantEntity plantEntity && ! ev.getLevel().isClientSide && ! ev.loadedFromDisk()) {
			plantEntity.getSpawnSound().ifPresent(s -> EntityUtil.playSound(plantEntity, s));
		}
		if(! PVZConfig.COMMON_CONFIG.RuleSettings.CanSpawnDefaultMonster.get()) {
			if(! ev.getEntity().level.isClientSide && ev.getLevel().dimension() == Level.OVERWORLD) {
			    if(! (ev.getEntity() instanceof PVZZombieEntity) && ev.getEntity() instanceof Monster) {
				    ev.setCanceled(true);
			    }
			}
		}
	}
}