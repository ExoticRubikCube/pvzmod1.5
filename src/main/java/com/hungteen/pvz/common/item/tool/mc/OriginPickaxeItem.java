package com.hungteen.pvz.common.item.tool.mc;

import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.item.PVZItemTier;
import com.hungteen.pvz.common.misc.tag.PVZBlockTags;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;
import java.util.List;

public class OriginPickaxeItem extends PickaxeItem {

    public OriginPickaxeItem() {
        super(PVZItemTier.ORIGIN, 1, -2.8F, new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
        if (! level.isClientSide && state.getDestroySpeed(level, pos) != 0.0F) {
            if (state.is(PVZBlockTags.ESSENCE_ORES)) {
                if (stack.isDamaged()) {
                    stack.setDamageValue(Math.max(stack.getDamageValue() - 2, 0));
                }
            } else {
                stack.hurtAndBreak(1, entity, (p) -> {
                    p.broadcastBreakEvent(EquipmentSlot.MAINHAND);
                });
            }
        }
        return true;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> textComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, level, textComponents, tooltipFlag);
        textComponents.add(Component.translatable("tooltip.pvz.origin_pickaxe").withStyle(ChatFormatting.DARK_GREEN));
    }
}