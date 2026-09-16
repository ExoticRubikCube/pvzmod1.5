package com.hungteen.pvz.common.item.blockitem;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;

public class SporeItem extends BlockItem {

	public SporeItem() {
		super(BlockRegister.TOXIC_SHROOM.get(), new Properties().tab(PVZItemGroups.PVZ_MISC));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		final Level level = context.getLevel();
		final BlockPos pos = context.getClickedPos();
		if (level.getBlockState(pos).is(Blocks.GRASS_BLOCK)) {
			final Player player = context.getPlayer();
			level.playSound(player, pos, SoundEvents.GRASS_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
			if (! level.isClientSide) {
				level.setBlock(pos, Blocks.MYCELIUM.defaultBlockState(), 11);
				level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
				if (player == null || ! player.getAbilities().instabuild) {
					context.getItemInHand().shrink(1);
				}
			}
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		return super.useOn(context);
	}
}
