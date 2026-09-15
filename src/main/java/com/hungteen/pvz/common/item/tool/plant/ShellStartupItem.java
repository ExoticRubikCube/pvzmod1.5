package com.hungteen.pvz.common.item.tool.plant;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.event.events.PlantConditionMatchingEvent;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.spawn.card.ImitaterCardItem;
import com.hungteen.pvz.common.item.spawn.card.PlantCardItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

/**
 * when a plant card failed to grow on a block at post position check,
 * automatically plant a container card (flower pot/lily pad/pumpkin) in
 * the backpack at the same position and make the failed plant ride it.
 */
@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class ShellStartupItem extends Item {

	private final String description;

	public ShellStartupItem(Properties properties, String description) {
		super(properties);
		this.description = description;
	}

	@Override
	public void appendHoverText(ItemStack stack, Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable(this.description).withStyle(ChatFormatting.GRAY));
		super.appendHoverText(stack, level, tooltip, flag);
	}

	private static PlantConditionMatchingEvent.OnBlock handlingEvent = null;
	private static boolean handlingUpgrade = false;

	@SubscribeEvent
	public static void shellStartupPlantGoal(PlantConditionMatchingEvent.OnBlock event) {
		if(handlingEvent == null) {
			final Player player = event.event.getEntity();
			if(event.phase == PlantConditionMatchingEvent.Phase.POST && event.isPlanting && event.result != null
					&& event.event.spawningEntity instanceof PVZPlantEntity
					&& event.event.seedPacket.getItem() instanceof PlantCardItem outerCard) {
				/* cob cannon needs two adjacent kernel pults, its auto upgrade is planned separately */
				final boolean upgradeMode = ! (outerCard instanceof ImitaterCardItem)
						&& outerCard.plantType != PVZPlants.COB_CANNON
						&& outerCard.plantType.getUpgradeFrom().isPresent();
				/* collect shell startup itself and all plant cards in backpack;
				 * whether a card can serve as the container is answered by its own
				 * position check and canHoldPlant()/canPlantOnMe() during reentrant planting */
				boolean hasShellStartup = false;
				final List<ItemStack> toTestList = new ArrayList<>();
				final List<ItemStack> inventory = new ArrayList<>(player.getInventory().items);
				inventory.add(player.getOffhandItem());
				for(ItemStack toTest : inventory) {
					if(toTest == event.event.seedPacket || toTest.isEmpty()) {
						continue;
					}
					if(! hasShellStartup && toTest.getItem() == ItemRegister.SHELL_STARTUP.get()) {
						hasShellStartup = true;
					} else if(toTest.getItem() instanceof PlantCardItem testCard
							&& (! upgradeMode || (! (testCard instanceof ImitaterCardItem)
							&& testCard.plantType == outerCard.plantType.getUpgradeFrom().get()))) {
						/* upgrade mode only tries the exact base plant card;
						 * container mode keeps trying every card exactly as before */
						toTestList.add(toTest);
					}
				}
				if(hasShellStartup && ! toTestList.isEmpty()) {
					handlingEvent = event;
					handlingUpgrade = upgradeMode;
					for(ItemStack stack : toTestList) {
						PlantCardItem.plantOnBlock(player, stack, event.level, event.pos, event.direction);
						if(handlingEvent.result == null) {
							break;
						}
					}
					handlingEvent = null;
					handlingUpgrade = false;
				}
			}
		} else if(event.phase == PlantConditionMatchingEvent.Phase.PRE) {
			/* outer plant cost is charged together with the container card */
			if(event.event.resource == handlingEvent.event.resource) {
				event.event.cost += handlingEvent.event.cost;
			}
		} else if(event.phase == PlantConditionMatchingEvent.Phase.POST && event.result == null
				&& event.event.spawningEntity instanceof PVZPlantEntity container
				&& handlingEvent.event.spawningEntity instanceof PVZPlantEntity outerPlant) {
			/* let the outer plant itself decide whether the candidate can carry it;
			 * imitater type unwrapping, position move and startRiding all live in the entity */
			if(outerPlant.mountPlantOn(container)) {
				if(event.event.resource == handlingEvent.event.resource) {
					event.event.cost -= handlingEvent.event.cost;
				}
				handlingEvent.result = null;
			} else {
				event.result = handlingEvent.result;
			}
		}
	}
}