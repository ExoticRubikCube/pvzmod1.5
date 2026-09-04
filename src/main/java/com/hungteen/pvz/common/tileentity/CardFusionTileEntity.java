package com.hungteen.pvz.common.tileentity;

import com.hungteen.pvz.common.container.CardFusionContainer;
import com.hungteen.pvz.common.item.material.EssenceItem;
import com.hungteen.pvz.common.item.tool.plant.SunStorageSaplingItem;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class CardFusionTileEntity extends BlockEntity implements MenuProvider {

	public final ItemStackHandler handler = new ItemStackHandler(12);
	public static final int CRAFT_ESSENCE_COST = 8;
	public static final int CRAFT_SUN_COST = 5000;
	public ContainerData array = new SimpleContainerData(2);
	public int sunAmount = 0;
	public int essenceAmount = 0;
	
	public CardFusionTileEntity(BlockPos pos, BlockState state) {
		super(TileEntityRegister.CARD_FUSION.get(), pos, state);
	}

	public void tick() {
		if(! level.isClientSide) {
			this.absorbSunAmount();
			this.absorbEssences();
			this.array.set(0, sunAmount);
			this.array.set(1, essenceAmount);
		}
	}
	
	private void absorbSunAmount() {
    	ItemStack stack = this.handler.getStackInSlot(0);
    	if(! stack.isEmpty() && stack.getItem() instanceof SunStorageSaplingItem) {
    		int amount = SunStorageSaplingItem.getStorageSunAmount(stack);
    		int decAmount = Math.min(CRAFT_SUN_COST - this.sunAmount, Math.min(100, amount));
    		amount -= decAmount;
    		this.sunAmount += decAmount;
    		SunStorageSaplingItem.setStorageSunAmount(stack, amount);
    	}
    }

	private void absorbEssences() {
		ItemStack stack = this.handler.getStackInSlot(1);
		if(! stack.isEmpty() && stack.getItem() instanceof EssenceItem && this.essenceAmount < CRAFT_ESSENCE_COST) {
			stack.shrink(1);
			++ this.essenceAmount;
		}
	}

	public void clearCraftingSlots(){
		for(int i = 3; i < 12; ++ i){
			this.handler.getStackInSlot(i).shrink(1);
//			this.handler.setStackInSlot(i, ItemStack.EMPTY);
		}
	}
	
	@Override
    public void load(CompoundTag compound) {
    	super.load(compound);
    	this.handler.deserializeNBT(compound.getCompound("itemstack_list"));
    	this.sunAmount = compound.getInt("sun_amount");
		this.essenceAmount = compound.getInt("essence_amount");
    }
    
    @Override
    protected void saveAdditional(CompoundTag compound) {
    	compound.put("itemstack_list", this.handler.serializeNBT());
    	compound.putInt("sun_amount", this.sunAmount);
		compound.putInt("essence_amount", this.essenceAmount);
    }
    
	@Override
	public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
		return new CardFusionContainer(id, player, this.worldPosition);
	}

	@Override
	public Component getDisplayName() {
		return Component.translatable("gui.pvz.card_fusion");
	}

}