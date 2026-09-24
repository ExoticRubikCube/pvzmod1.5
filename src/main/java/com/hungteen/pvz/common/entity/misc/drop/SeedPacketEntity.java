package com.hungteen.pvz.common.entity.misc.drop;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;


public class SeedPacketEntity extends DropEntity {

	private static final float FALL_SPEED = 0.03F;
	private ItemStack cardStack = ItemStack.EMPTY;

	public SeedPacketEntity(EntityType<? extends Entity> type, Level worldIn) {
		super(type, worldIn);
		this.setNoGravity(true);
	}

	@Override
	public void tick() {
		super.tick();
		if(! this.onGround && ! this.isInWater()) {
			this.setDeltaMovement(this.getDeltaMovement().x, - FALL_SPEED, this.getDeltaMovement().z);
		} else {
			this.setDeltaMovement(Vec3.ZERO);
		}
	}

	/**
	 * 绑定种子包将要变成的挑战体验卡（含挑战 uuid 标记）。
	 */
	public void setCardStack(ItemStack cardStack) {
		this.cardStack = cardStack.copy();
	}

	public ItemStack getCardStack() {
		return this.cardStack;
	}

	@Nullable
	@Override
	public ItemStack getPickResult() {
		return this.cardStack.isEmpty() ? null : this.cardStack.copy();
	}

	@Override
	public InteractionResult interact(Player player, InteractionHand hand) {
		if(! this.level.isClientSide() && ! this.cardStack.isEmpty()) {
			final ItemEntity item = new ItemEntity(this.level, this.getX(), this.getY(), this.getZ(), this.cardStack.copy());
			item.setDefaultPickUpDelay();
			this.level.addFreshEntity(item);
			this.discard();
		}
		return InteractionResult.sidedSuccess(this.level.isClientSide());
	}

	@Override
	public void onCollectedByPlayer(Player player) {
		if(! this.level.isClientSide() && ! this.cardStack.isEmpty()) {
			final ItemEntity item = new ItemEntity(this.level, this.getX(), this.getY(), this.getZ(), this.cardStack.copy());
			item.setDefaultPickUpDelay();
			this.level.addFreshEntity(item);
		}
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if(compound.contains("card_stack")) {
			this.cardStack = ItemStack.of(compound.getCompound("card_stack"));
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		if(! this.cardStack.isEmpty()) {
			compound.put("card_stack", this.cardStack.save(new CompoundTag()));
		}
	}

	@Override
	public int getMaxLiveTick() {
		return 400;
	}
}
