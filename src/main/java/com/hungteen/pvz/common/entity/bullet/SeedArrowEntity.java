package com.hungteen.pvz.common.entity.bullet;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.item.spawn.card.PlantCardItem;
import com.hungteen.pvz.common.item.spawn.card.SummonCardItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.protocol.Packet;
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

public class SeedArrowEntity extends Arrow {

    private LivingEntity owner;
    private ItemStack seedPacket;

    public SeedArrowEntity(Level level, LivingEntity owner, ItemStack seedPacket) {
        super(EntityRegister.SEED_ARROW.get(), level);
        this.owner = owner;
        this.seedPacket = seedPacket;
        this.setOwner(owner);
        this.setBaseDamage(0);
        this.pickup = Pickup.DISALLOWED;
    }

    public SeedArrowEntity(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
        this.setBaseDamage(0);
        this.pickup = Pickup.DISALLOWED;
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        if (this.owner instanceof Player player && this.seedPacket != null && this.seedPacket.getItem() instanceof PlantCardItem) {
            if (player.getCooldowns().isOnCooldown(this.seedPacket.getItem())) {
                player.displayClientMessage(SummonCardItem.PlacementHints.ON_COOL_DOWN.getTextByArg(ChatFormatting.RED, this.seedPacket.getHoverName()), true);
            } else {
                MutableComponent plantResult = this.plantOnEntity(player, result.getEntity());
                if (plantResult != null) {
                    player.displayClientMessage(plantResult, true);
                }
                this.discard();
            }
        }
        super.onHitEntity(result);
    }

    @Override
    protected void onHitBlock(BlockHitResult result) {
        if (this.owner instanceof Player player && this.seedPacket != null && this.seedPacket.getItem() instanceof PlantCardItem) {
            if (player.getCooldowns().isOnCooldown(this.seedPacket.getItem())) {
                player.displayClientMessage(SummonCardItem.PlacementHints.ON_COOL_DOWN.getTextByArg(ChatFormatting.RED, this.seedPacket.getHoverName()), true);
            } else {
                MutableComponent plantResult = PlantCardItem.plantOnBlock(player, this.seedPacket, this.level, result.getBlockPos(), result.getDirection());
                if (plantResult != null) {
                    player.displayClientMessage(plantResult, true);
                    this.setOwner(null);
                } else {
                    this.discard();
                }
            }
        }
        super.onHitBlock(result);
    }

    private MutableComponent plantOnEntity(Player player, Entity target) {
        MutableComponent result = PlantCardItem.plantOnBlock(player, this.seedPacket, this.level, target.getOnPos(), Direction.UP);
        if (result == null) {
            return null;
        }
        Entity rootVehicle = target.getRootVehicle();
        if (rootVehicle != target) {
            result = PlantCardItem.plantOnBlock(player, this.seedPacket, this.level, rootVehicle.getOnPos(), Direction.UP);
            if (result == null) {
                return null;
            }
        }
        return PlantCardItem.plantOnBlock(player, this.seedPacket, this.level, target.blockPosition(), Direction.UP);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag p_36881_) {
        super.addAdditionalSaveData(p_36881_);
        if (this.owner != null) {
            p_36881_.putUUID("Owner", this.owner.getUUID());
        }
        if (this.seedPacket != null) {
            CompoundTag tag = new CompoundTag();
            this.seedPacket.save(tag);
            p_36881_.put("Item", tag);
        }

    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("Owner") && this.level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
            this.owner = serverLevel.getPlayerByUUID(tag.getUUID("Owner"));
        }
        if (tag.contains("Item")) {
            CompoundTag tag1 = tag.getCompound("Item");
            this.seedPacket = ItemStack.of(tag1);
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
