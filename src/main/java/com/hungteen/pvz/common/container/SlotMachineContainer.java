package com.hungteen.pvz.common.container;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.blockentity.SlotMachineTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class SlotMachineContainer extends AbstractContainerMenu {

	public final SlotMachineTileEntity te;
	public final Player player;
	
	public SlotMachineContainer(int id, Player player, BlockPos pos) {
		super(ContainerRegister.SLOT_MACHINE.get(), id);
		this.player = player;
		this.te = (SlotMachineTileEntity) player.level.getBlockEntity(pos);
		if(this.te == null) {
			PVZMod.LOGGER.debug("Error: Open Slot Machine GUI !");
			return ;
		}
		this.addDataSlots(this.te.array);
		this.te.setPlayer(player);
		for(int i = 0; i < 3; ++ i) {
			for(int j = 0; j < 9; ++ j) {
				this.addSlot(new Slot(player.getInventory(), j + i * 9 + 9, 8 + 18 * j, 145 + 18 * i));
			}
		}
		for(int i = 0; i < 9; ++ i) {
			this.addSlot(new Slot(player.getInventory(), i, 8 + 18 * i, 203));
		}
	}

	@Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = this.slots.get(index);
		return ItemStack.EMPTY;
    }
	
	@Override
	public boolean stillValid(Player playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}