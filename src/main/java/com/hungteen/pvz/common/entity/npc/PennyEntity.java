package com.hungteen.pvz.common.entity.npc;

import com.hungteen.pvz.common.container.provider.PVZContainerProvider;
import com.hungteen.pvz.common.container.shop.PennyShopContainer;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;

public class PennyEntity extends AbstractDaveEntity {

	public PennyEntity(EntityType<? extends PathfinderMob> type, Level worldIn) {
		super(type, worldIn);
		this.setInvulnerable(true);
		this.transactionResource = StringUtil.prefix("penny");
	}

	@Override
	protected boolean canOpenShop(Player player, ItemStack heldItem) {
		return heldItem.getItem().equals(ItemRegister.CAR_KEY.get());
	}

	@Override
	protected void openContainer(ServerPlayer player) {
		NetworkHooks.openScreen(player, new PVZContainerProvider() {

			@Override
			public net.minecraft.world.inventory.AbstractContainerMenu createMenu(int id, Inventory inventory,
										Player playerEntity) {
				return new PennyShopContainer(id, playerEntity, PennyEntity.this.getId());
			}

		}, buffer -> {
			buffer.writeInt(PennyEntity.this.getId());
		});
	}

	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		return EntityDimensions.scalable(1.8f, 2f);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundRegister.PENNY_SAY.get();
	}
	
	@Nullable
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.GENERIC_HURT;
	}

	@Nullable
	protected SoundEvent getDeathSound() {
		return SoundEvents.GENERIC_DEATH;
	}

}