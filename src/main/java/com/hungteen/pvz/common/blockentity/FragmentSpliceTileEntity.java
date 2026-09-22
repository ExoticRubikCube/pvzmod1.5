package com.hungteen.pvz.common.blockentity;

import com.hungteen.pvz.common.container.FragmentSpliceContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

public class FragmentSpliceTileEntity extends BlockEntity implements MenuProvider{

	public final ItemStackHandler handler = new ItemStackHandler(1 + 25);

	public FragmentSpliceTileEntity(BlockPos pos, BlockState state) {
		super(TileEntityRegister.FRAGMENT_SPLICE.get(), pos, state);
	}

	public void clearCraftingSlots(){
		for(int i = 0; i < 25; ++ i){
			this.handler.getStackInSlot(i + 1).shrink(1);
		}
	}

    @Override
    public void load(CompoundTag compound) {
    	super.load(compound);
    	this.handler.deserializeNBT(compound.getCompound("item_stack_list"));
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
    	compound.put("item_stack_list", this.handler.serializeNBT());
    }

	@Override
	public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
		return new FragmentSpliceContainer(id, player, this.worldPosition);
	}

	@Override
	public Component getDisplayName() {
		return Component.translatable("block.pvz.fragment_splice");
	}

}