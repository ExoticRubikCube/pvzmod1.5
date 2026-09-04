package com.hungteen.pvz.common.item.display;

import com.hungteen.pvz.common.container.AlmanacContainer;
import com.hungteen.pvz.common.item.PVZItemGroups;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;

public class AlmanacItem extends Item{

	public AlmanacItem() {
		super(new Properties().tab(PVZItemGroups.PVZ_USEFUL).stacksTo(1));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
		if(!worldIn.isClientSide && playerIn instanceof ServerPlayer) {
			NetworkHooks.openScreen((ServerPlayer) playerIn, new MenuProvider() {

				@Override
				public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new AlmanacContainer(id, player);
				}

				@Override
				public Component getDisplayName() {
					return Component.translatable("gui.pvz.almanac.show");
				}
			});
		}
		return InteractionResultHolder.pass(playerIn.getItemInHand(handIn));
	}
	
}