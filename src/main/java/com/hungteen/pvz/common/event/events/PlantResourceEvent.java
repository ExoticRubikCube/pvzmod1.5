package com.hungteen.pvz.common.event.events;

import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Cancelable;

public class PlantResourceEvent extends PlayerEvent {

	public int cost;
	public int coolDown;
	public Resources resource;

	public PlantResourceEvent(Player player, Resources resource, int cost, int coolDown) {
		super(player);
		this.cost = cost;
		this.resource = resource;
		this.coolDown = coolDown;
	}

	public static class CheckResourceEvent extends PlantResourceEvent {

		public final ItemStack seedPacket;

		public CheckResourceEvent(Player player, ItemStack seedPacket, Resources resource, int cost, int coolDown) {
			super(player, resource, cost, coolDown);
			this.seedPacket = seedPacket;
		}
	}

	@Cancelable
	public static class CheckPlantConditionEvent extends CheckResourceEvent {

		public Entity spawningEntity;

		public CheckPlantConditionEvent(Player player, ItemStack seedPacket, Entity spawningEntity,
				Resources resource, int cost, int coolDown) {
			super(player, seedPacket, resource, cost, coolDown);
			this.spawningEntity = spawningEntity;
		}
	}
}
