package com.hungteen.pvz.common.blockentity;

import com.hungteen.pvz.common.container.EssenceAltarContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;

/**
 * @program: pvzmod-1.16.5
 * @author: HungTeen
 * @create: 2022-01-20 16:06
 **/
public class EssenceAltarTileEntity extends PVZTileEntity implements MenuProvider {

    public final ItemStackHandler handler = new ItemStackHandler(4);
    public int tick = 0;

    public EssenceAltarTileEntity(BlockPos pos, BlockState state) {
        super(TileEntityRegister.ESSENCE_ALTAR.get(), pos, state);
    }
    
   	public void tick() {
    	++ tick;
   	}

    @Override
    public void load(CompoundTag compound) {
        super.load(compound);
        if (compound.contains("essence_altar_slots")) {
            this.handler.deserializeNBT(compound.getCompound("essence_altar_slots"));
        }
        if(compound.contains("tick")) {
        	this.tick = compound.getInt("tick");
        }
    }

    @Override
    protected void saveAdditional(CompoundTag compound) {
        compound.put("essence_altar_slots", this.handler.serializeNBT());
        compound.putInt("tick", this.tick);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.pvz.essence_altar");
    }

    @Override
    public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new EssenceAltarContainer(id, player, this.worldPosition);
    }

}