package com.hungteen.pvz.common.event.events;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.eventbus.api.Cancelable;

import javax.annotation.Nullable;

@Cancelable
public class PlantConditionMatchingEvent extends EntityEvent {

	public final Phase phase;
	public final PlantResourceEvent.CheckPlantConditionEvent event;
	public boolean isPlanting;
	public MutableComponent result;

	public PlantConditionMatchingEvent(Entity entity, PlantResourceEvent.CheckPlantConditionEvent event,
			MutableComponent result, boolean isPlanting, Phase phase) {
		super(entity);
		this.phase = phase;
		this.event = event;
		this.isPlanting = isPlanting;
		this.result = result;
	}

	public static class OnBlock extends PlantConditionMatchingEvent {

		public final Level level;
		public final BlockPos pos;
		@Nullable
		public final Direction direction;

		public OnBlock(Entity entity, PlantResourceEvent.CheckPlantConditionEvent event, MutableComponent result,
				Level level, BlockPos pos, @Nullable Direction direction, boolean isPlanting, Phase phase) {
			super(entity, event, result, isPlanting, phase);
			this.level = level;
			this.pos = pos;
			this.direction = direction;
		}
	}

	public enum Phase {
		PRE, POST
	}
}
