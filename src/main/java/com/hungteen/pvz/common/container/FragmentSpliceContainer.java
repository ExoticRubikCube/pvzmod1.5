package com.hungteen.pvz.common.container;

import com.hungteen.pvz.api.types.IPAZType;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.blockentity.FragmentSpliceTileEntity;
import com.hungteen.pvz.common.item.spawn.card.SummonCardItem;
import com.hungteen.pvz.common.recipe.FragmentRecipe;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import com.hungteen.pvz.utils.PlayerUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;
import java.util.Optional;

public class FragmentSpliceContainer extends PVZContainer {

	public final FragmentSpliceTileEntity te;
	private final CraftingContainer craftSlots = new CraftingContainer(this, 5, 5);
	private final ContainerLevelAccess access;
	private final Player player;

	public FragmentSpliceContainer(int id, Player player, BlockPos pos) {
		super(ContainerRegister.FRAGMENT_SPLICE.get(), id);
		this.te = (FragmentSpliceTileEntity) player.level.getBlockEntity(pos);
		this.player = player;
		this.access = ContainerLevelAccess.create(player.level, pos);
		if(this.te == null) {
			System.out.println("Error: Open Fragment Splice GUI !");
			return ;
		}

		// result slot.
		this.addSlot(new SlotItemHandler(te.handler, 0, 142, 62){
			@Override
			public boolean mayPlace(@Nonnull ItemStack stack) {
				return false;
			}
			@Override
			public void onTake(Player thePlayer, ItemStack stack) {
				super.onTake(thePlayer, stack);
				craftOnce(thePlayer, stack);
			}
		});
		// input slots. JEI 一键转移校验每个配方槽的 mayPickup，SlotItemHandler 默认对空槽模拟提取返回 false 会隐藏+号
		for (int i = 0; i < 5; ++ i) {
			for (int j = 0; j < 5; ++ j) {
				this.addSlot(new SlotItemHandler(te.handler, j + i * 5 + 1, 16 + j * 18, 26 + i * 18) {
					@Override
					public boolean mayPickup(Player playerIn) {
						return true;
					}
				});
			}
		}
		// player inventory
		for (int k = 0; k < 3; ++ k) {
			for (int i1 = 0; i1 < 9; ++ i1) {
				this.addSlot(new Slot(player.getInventory(), i1 + k * 9 + 9, 9 + i1 * 18, 127 + k * 18));
			}
		}
		for (int l = 0; l < 9; ++ l) {
			this.addSlot(new Slot(player.getInventory(), l, 9 + l * 18, 185));
		}
		if(! this.player.level.isClientSide) {
			this.refreshResult();
		}
	}

	private void craftOnce(Player crafter, ItemStack crafted){
		this.te.clearCraftingSlots();
		if(crafted.getItem() instanceof SummonCardItem && PlayerUtil.isPAZLocked(crafter, ((SummonCardItem) crafted.getItem()).type)){
			IPAZType type = ((SummonCardItem) crafted.getItem()).type;
			PlayerUtil.setPAZLock(crafter, type, false);
			//*0.6.4 add unlock tip.
			PlayerUtil.sendMsgTo(crafter, Component.translatable("entity."+type.getModID()+"."+ type).append(Component.translatable("help.pvz.is_unlocked")).withStyle(ChatFormatting.GREEN));
		}
		this.refreshResult();
	}

	private void refreshResult(){
		this.te.handler.setStackInSlot(0, this.getResult());
	}

	public ItemStack getResult(){
		for(int i = 0; i < 5; ++ i){
			for(int j = 0; j < 5; ++ j){
				this.craftSlots.setItem(i * 5 + j, this.te.handler.getStackInSlot(i * 5 + j + 1).copy());
			}
		}
		final Optional<FragmentRecipe> recipe = this.player.level.getRecipeManager().getRecipeFor(RecipeRegister.FRAGMENT_RECIPE_TYPE.get(), this.craftSlots, this.player.level);
		return recipe.map(FragmentRecipe::getResultItem).orElse(ItemStack.EMPTY);
	}

	@Override
	public void slotsChanged(Container inventoryIn) {
		super.slotsChanged(inventoryIn);
		if(!this.player.level.isClientSide && inventoryIn != this.craftSlots) {
			this.refreshResult();
		}
	}

	@Override
	public void clicked(int slotId, int dragType, ClickType clickType, Player playerIn) {
		super.clicked(slotId, dragType, clickType, playerIn);
		if(!this.player.level.isClientSide) {
			this.refreshResult();
		}
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if (slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 26) {
				if (!this.moveItemStackTo(itemstack1, 26, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
			} else if (index < 26 + 27) {
				if(!moveItemStackTo(itemstack1, 1, 26, false)
						&& !moveItemStackTo(itemstack1, 26 + 27, this.slots.size(), false)) {
					return ItemStack.EMPTY;
				}
			} else {
				if (!this.moveItemStackTo(itemstack1, 1, 26 + 27, false)) {
					return ItemStack.EMPTY;
				}
			}
			if (itemstack1.isEmpty()) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (index == 0) {
				this.craftOnce(this.player, itemstack);
			}
		}
		return itemstack;
	}

	@Override
	public boolean stillValid(Player playerIn) {
		return stillValid(this.access, player, BlockRegister.FRAGMENT_SPLICE.get());
	}

}