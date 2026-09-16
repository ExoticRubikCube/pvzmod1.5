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
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * when a plant card failed to grow on a block at post position check,
 * a shell startup in the backpack auto-plants matching cards at the same
 * position: container cards (flower pot/lily pad/pumpkin) carry the failed
 * plant as passenger, upgrade (purple) cards first plant the base plant and
 * then upgrade it into the held card, and the two chains can stack (container
 * carries the base plant, which upgrades in place).
 *
 * no cost is predicted before reentrant planting: each inner card posts its
 * own PRE/POST pair, PRE merges the outer cost so the innermost sun check sees
 * the whole chain total, POST subtracts it back on success so every card is
 * charged exactly its own cost. nested chains (upgrade needing a container)
 * stack one context per reentrant layer.
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

	/** one failed placement waiting to be rescued; upgrade contexts may nest a container context */
	private static final class PlantContext {

		private final PlantConditionMatchingEvent.OnBlock event;
		private final boolean upgrade;

		private PlantContext(PlantConditionMatchingEvent.OnBlock event, boolean upgrade) {
			this.event = event;
			this.upgrade = upgrade;
		}
	}

	private static final Deque<PlantContext> contextStack = new ArrayDeque<>();

	@SubscribeEvent
	public static void shellStartupPlantGoal(PlantConditionMatchingEvent.OnBlock event) {
		if(contextStack.isEmpty()) {
			if(event.phase == PlantConditionMatchingEvent.Phase.POST && event.isPlanting && event.result != null
					&& event.event.spawningEntity instanceof PVZPlantEntity
					&& event.event.seedPacket.getItem() instanceof PlantCardItem outerCard) {
				tryCandidates(event, isAutoUpgradeCard(outerCard));
			}
			return;
		}
		final PlantContext top = contextStack.peek();
		if(event.phase == PlantConditionMatchingEvent.Phase.PRE) {
			/* outer cost rides this card's sun check, so the innermost layer sees the chain total */
			if(event.event.resource == top.event.event.resource) {
				event.event.cost += top.event.event.cost;
			}
		} else if(event.phase == PlantConditionMatchingEvent.Phase.POST
				&& event.event.spawningEntity instanceof PVZPlantEntity inner
				&& top.event.event.spawningEntity instanceof PVZPlantEntity outer) {
			if(top.upgrade) {
				/* base plant without a valid position first asks a container card to carry it;
				 * after that (or when the position was valid) the upgrade finishes in place */
				if(event.result != null) {
					tryCandidates(event, false);
				}
				if(event.result == null) {
					/* same gate as manual upgrade; the carrier, if any, is handed
					 * to the upgrade plant after the base plant is discarded */
					final boolean success = inner.canBeUpgrade(event.event.getEntity());
					if(success) {
						final Entity carrier = inner.getVehicle();
						inner.onPlantUpgrade(outer);
						if(carrier instanceof PVZPlantEntity) {
							outer.mountPlantOn((PVZPlantEntity) carrier);
						}
						if(event.event.resource == top.event.event.resource) {
							event.event.cost -= top.event.event.cost;
						}
						top.event.result = null;
						contextStack.pop();
					} else {
						event.result = top.event.result;
					}
				}
			} else if(event.result == null) {
				/* let the outer plant itself decide whether the candidate can carry it;
				 * imitater type unwrapping, position move and startRiding all live in the entity */
				if(outer.mountPlantOn(inner)) {
					if(event.event.resource == top.event.event.resource) {
						event.event.cost -= top.event.event.cost;
					}
					top.event.result = null;
					contextStack.pop();
				} else {
					event.result = top.event.result;
				}
			}
		}
	}

	/**
	 * collect shell startup and candidate cards in backpack, then reentrantly plant
	 * them on the failed position; upgrade mode only accepts the exact base card,
	 * container mode lets every card answer by its own position and mount checks.
	 */
	private static void tryCandidates(PlantConditionMatchingEvent.OnBlock failEvent, boolean upgradeMode) {
		final Player player = failEvent.event.getEntity();
		boolean hasShellStartup = false;
		final List<ItemStack> toTestList = new ArrayList<>();
		final List<ItemStack> inventory = new ArrayList<>(player.getInventory().items);
		inventory.add(player.getOffhandItem());
		for(ItemStack toTest : inventory) {
			if(toTest == failEvent.event.seedPacket || toTest.isEmpty()) {
				continue;
			}
			if(! hasShellStartup && toTest.getItem() == ItemRegister.SHELL_STARTUP.get()) {
				hasShellStartup = true;
			} else if(toTest.getItem() instanceof PlantCardItem testCard
					&& (! upgradeMode || (! (testCard instanceof ImitaterCardItem)
					&& failEvent.event.seedPacket.getItem() instanceof PlantCardItem heldCard
					&& testCard.plantType == heldCard.plantType.getUpgradeFrom().get()))) {
				toTestList.add(toTest);
			}
		}
		if(hasShellStartup && ! toTestList.isEmpty()) {
			final PlantContext context = new PlantContext(failEvent, upgradeMode);
			contextStack.push(context);
			for(ItemStack stack : toTestList) {
				PlantCardItem.plantOnBlock(player, stack, failEvent.level, failEvent.pos, failEvent.direction);
				if(failEvent.result == null) {
					break;
				}
			}
			/* success paths pop themselves; a failed chain (sun/lock/position early return
			 * before POST) must be removed here so later plantings stay unaffected */
			if(! contextStack.isEmpty() && contextStack.peek() == context) {
				contextStack.pop();
			}
		}
	}

	/**
	 * purple cards handled by shell startup auto-planting: imitater cards and cob cannon
	 * (manual two-kernel merge only) keep their original placement behaviour.
	 */
	private static boolean isAutoUpgradeCard(PlantCardItem card) {
		return ! (card instanceof ImitaterCardItem)
				&& card.plantType != PVZPlants.COB_CANNON
				&& card.plantType.getUpgradeFrom().isPresent();
	}
}