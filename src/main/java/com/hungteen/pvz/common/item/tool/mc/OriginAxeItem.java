package com.hungteen.pvz.common.item.tool.mc;

import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.item.PVZItemTier;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OriginAxeItem extends AxeItem {

    public OriginAxeItem() {
        super(PVZItemTier.ORIGIN, 6.0F, -3.1F, new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        BlockState state = level.getBlockState(pos);
        Optional<BlockState> stripped = this.getStripped(state);
        Optional<BlockState> scraped = WeatheringCopper.getPrevious(state);
        Optional<BlockState> waxOff = Optional.ofNullable(HoneycombItem.WAX_OFF_BY_BLOCK.get().get(state.getBlock())).map((block) -> {
            return block.withPropertiesOf(state);
        });
        Optional<BlockState> unstripped = this.getUnstripped(state);
        ItemStack stack = context.getItemInHand();
        Optional<BlockState> resultState = Optional.empty();
        if (stripped.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            resultState = stripped;
        } else if (unstripped.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            resultState = unstripped;
        } else if (scraped.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3005, pos, 0);
            resultState = scraped;
        } else if (waxOff.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
            level.levelEvent(player, 3004, pos, 0);
            resultState = waxOff;
        }

        if (resultState.isPresent()) {
            if (player instanceof ServerPlayer serverPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, pos, stack);
            }

            level.setBlock(pos, resultState.get(), 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, resultState.get()));
            if (player != null) {
                stack.hurtAndBreak(1, player, (p) -> {
                    p.broadcastBreakEvent(context.getHand());
                });
            }

            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    private Optional<BlockState> getStripped(BlockState state) {
        return Optional.ofNullable(STRIPPABLES.get(state.getBlock())).map((block) -> {
            return block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS));
        });
    }

    private Optional<BlockState> getUnstripped(BlockState state) {
        Block current = state.getBlock();
        Block original = null;
        for (Map.Entry<Block, Block> entry : STRIPPABLES.entrySet()) {
            if (entry.getValue().equals(current)) {
                original = entry.getKey();
                break;
            }
        }
        if (original == null) {
            return Optional.empty();
        }
        return Optional.of(original.defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> textComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, level, textComponents, tooltipFlag);
        textComponents.add(Component.translatable("tooltip.pvz.origin_axe").withStyle(ChatFormatting.DARK_GREEN));
    }
}
