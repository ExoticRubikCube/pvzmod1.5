package com.hungteen.pvz.common.container;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.blockentity.CardFusionTileEntity;
import com.hungteen.pvz.common.item.material.EssenceItem;
import com.hungteen.pvz.common.recipe.FusionRecipe;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.SlotItemHandler;

import java.util.Optional;

public class CardFusionContainer extends PVZContainer {

	public final CardFusionTileEntity te;
	private final CraftingContainer craftSlots = new CraftingContainer(this, 3, 3);
	private final ContainerLevelAccess access;
	private final Player player;
	//craftSlots.setItem 会回调 slotsChanged -> broadcastChanges，刷新期间需阻断重入避免无限递归
	private boolean isRefreshing = false;
	
	public CardFusionContainer(int id, Player player, BlockPos pos) {
		super(ContainerRegister.CARD_FUSION.get(), id);
		this.te = (CardFusionTileEntity) player.level.getBlockEntity(pos);
		this.player = player;
		this.access = ContainerLevelAccess.create(player.level, pos);
		if(this.te == null) {
			System.out.println("Error: Open Card Fusion GUI !");
			return ;
		}

		this.addDataSlots(this.te.array);

		//essences.
		this.addSlot(new SlotItemHandler(te.handler, 0, 17, 53) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return stack.getItem() instanceof EssenceItem;
			}
		});
		//result.
		this.addSlot(new SlotItemHandler(te.handler, 1, 137, 35) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}

			@Override
			public void onTake(Player thePlayer, ItemStack stack) {
				te.clearCraftingSlots();
				te.essenceAmount = 0;
				refreshResult();
				super.onTake(thePlayer, stack);
			}
		});
		//JEI 一键转移校验每个配方槽的 mayPickup，SlotItemHandler 默认对空槽模拟提取返回 false 会隐藏+号
		for(int i = 0; i < 3; ++ i){
			for(int j = 0; j < 3; ++ j){
				this.addSlot(new SlotItemHandler(te.handler, i * 3 + j + 2, 43 + j * 18, 17 + i * 18) {
					@Override
					public boolean mayPickup(Player playerIn) {
						return true;
					}
				});
			}
		}
		//player inventory.
		this.addInventoryAndHotBar(player, 9, 84);
		if( ! player.level.isClientSide) {
			this.refreshResult();
		}
	}

	@Override
	public void broadcastChanges() {
		if( ! this.player.level.isClientSide) {
			this.refreshResult();
		}
		super.broadcastChanges();
	}

	private void refreshResult() {
		if( ! this.isRefreshing) {
			this.isRefreshing = true;
			try {
				this.te.handler.setStackInSlot(1, this.canPreview() ? this.getResult().copy() : ItemStack.EMPTY);
			} finally {
				this.isRefreshing = false;
			}
		}
	}

	private boolean canPreview(){
		return this.te.essenceAmount == CardFusionTileEntity.CRAFT_ESSENCE_COST && ! this.getResult().isEmpty();
	}

	public ItemStack getResult(){
		for(int i = 0; i < 3; ++ i){
			for(int j = 0; j < 3; ++ j){
				this.craftSlots.setItem(i * 3 + j, this.te.handler.getStackInSlot(i * 3 + j + 2).copy());
			}
		}
		final Optional<FusionRecipe> recipe = this.player.level.getRecipeManager().getRecipeFor(RecipeRegister.FUSION_RECIPE_TYPE.get(), this.craftSlots, this.player.level);
		return recipe.isPresent() ? recipe.get().getResultItem() : ItemStack.EMPTY;
	}
	
	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index == 1) {
				if (!this.moveItemStackTo(itemstack1, 11, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				this.te.clearCraftingSlots();
				this.te.essenceAmount = 0;
				this.refreshResult();
			} else if (index < 11) {
				if (!this.moveItemStackTo(itemstack1, 11, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
			} else if (index < 11 + 27) {
				if(!moveItemStackTo(itemstack1, 0, 11, false)
						&& !moveItemStackTo(itemstack1, 11 + 27, this.slots.size(), false)) {
					return ItemStack.EMPTY;
				}
			} else {
				if (!this.moveItemStackTo(itemstack1, 0, 11 + 27, false)) {
					return ItemStack.EMPTY;
				}
			}
			if (itemstack1.isEmpty()) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
		}
		return itemstack;
	}

	@Override
	public boolean stillValid(Player playerIn) {
		return stillValid(this.access, player, BlockRegister.CARD_FUSION_TABLE.get());
	}
}
