package com.hungteen.pvz.common.entity.bullet;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.potion.EffectRegister;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;

public class OriginArrowEntity extends Arrow {

	private static final EntityDataAccessor<Boolean> ENERGY = SynchedEntityData.defineId(OriginArrowEntity.class, EntityDataSerializers.BOOLEAN);
	private static final double BASE_DAMAGE = 3.0D;

	private boolean handled;

	public OriginArrowEntity(Level level, LivingEntity owner, boolean energy) {
		super(EntityRegister.ORIGIN_ARROW.get(), level);
		this.setOwner(owner);
		this.setBaseDamage(BASE_DAMAGE);
		this.setEnergyArrow(energy);
	}

	public OriginArrowEntity(EntityType<? extends Arrow> type, Level level) {
		super(type, level);
		this.setBaseDamage(BASE_DAMAGE);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(ENERGY, false);
	}

	@Override
	protected void onHitEntity(EntityHitResult result) {
		if (this.isEnergyArrow() && !this.handled) {
			this.handled = true;
			Entity target = result.getEntity();
			if (target instanceof PVZPlantEntity plant && plant.canStartSuperMode()) {
				if (!this.level.isClientSide) {
					plant.startSuperMode(true);
					if (this.getOwner() instanceof Player player) {
						final int treeLevel = PlayerUtil.getResource(player, Resources.TREE_LVL);
						player.addEffect(new MobEffectInstance(EffectRegister.ENERGETIC_EFFECT.get(), 100 + (treeLevel + 1) / 2, 0));
					}
				}
			} else {
				if (!(target instanceof PVZPlantEntity)) {
					super.onHitEntity(result);
				}
				if (!this.level.isClientSide && this.getOwner() instanceof Player player) {
					PlayerUtil.addResource(player, Resources.ENERGY_NUM, 1);
				}
			}
			this.discard();
		} else {
			super.onHitEntity(result);
		}
	}

	@Override
	protected void onHitBlock(BlockHitResult result) {
		if (this.isEnergyArrow()) {
			if (!this.level.isClientSide && this.getOwner() instanceof Player player) {
				PlayerUtil.addResource(player, Resources.ENERGY_NUM, 1);
			}
			this.setEnergyArrow(false);
		}
		super.onHitBlock(result);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(ItemRegister.ORIGIN_ARROW.get());
	}

	public boolean isEnergyArrow() {
		return this.entityData.get(ENERGY);
	}

	public void setEnergyArrow(boolean energy) {
		this.entityData.set(ENERGY, energy);
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		super.addAdditionalSaveData(tag);
		tag.putBoolean("Energy", this.isEnergyArrow());
		tag.putBoolean("Handled", this.handled);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		if (tag.contains("Energy")) {
			this.setEnergyArrow(tag.getBoolean("Energy"));
		}
		if (tag.contains("Handled")) {
			this.handled = tag.getBoolean("Handled");
		}
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}
