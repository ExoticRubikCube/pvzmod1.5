package com.hungteen.pvz.common.entity.creature;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.potion.EffectRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SuspiciousStewItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.IForgeShearable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MooBloom extends Cow implements Shearable, IForgeShearable {

    public MooBloom(EntityType<? extends MooBloom> p_28914_, Level p_28915_) {
        super(p_28914_, p_28915_);
    }

    public float getWalkTargetValue(BlockPos p_28933_, LevelReader p_28934_) {
        return p_28934_.getBlockState(p_28933_.below()).is(BlockTags.FLOWERS) ? 10.0F : p_28934_.getPathfindingCostFromLightLevels(p_28933_);
    }

    public InteractionResult mobInteract(Player p_28941_, InteractionHand p_28942_) {
        ItemStack itemstack = p_28941_.getItemInHand(p_28942_);
        if (itemstack.is(Items.BOWL) && !this.isBaby()) {
            ItemStack itemstack1;
            itemstack1 = Items.SUSPICIOUS_STEW.getDefaultInstance();
            SuspiciousStewItem.saveMobEffect(itemstack1, EffectRegister.LIGHT_EYE_EFFECT.get(), 600);
            ItemStack itemstack2 = ItemUtils.createFilledResult(itemstack, p_28941_, itemstack1, false);
            p_28941_.setItemInHand(p_28942_, itemstack2);
            this.playSound(SoundEvents.MOOSHROOM_MILK, 1.0F, 1.0F);
            return InteractionResult.sidedSuccess(this.level.isClientSide);
        } else {
            return super.mobInteract(p_28941_, p_28942_);
        }
    }

    public MooBloom getBreedOffspring(ServerLevel p_148942_, AgeableMob p_148943_) {
        return EntityRegister.MOOBLOOM.get().create(p_148942_);
    }


    //About shearing
    @Override
    public List<ItemStack> onSheared(@Nullable Player player, @NotNull ItemStack item, Level world, BlockPos pos, int fortune) {
        this.gameEvent(GameEvent.SHEAR, player);
        return shearInternal(player == null ? SoundSource.BLOCKS : SoundSource.PLAYERS);
    }

    @Override
    public boolean isShearable(@NotNull ItemStack item, Level world, BlockPos pos) {
        return readyForShearing();
    }

    public boolean readyForShearing() {
        return this.isAlive() && !this.isBaby();
    }

    @Override
    public void shear(SoundSource p_28924_) {
        shearInternal(p_28924_).forEach(s -> this.level.addFreshEntity(new ItemEntity(this.level, this.getX(), this.getY(1.0D), this.getZ(), s)));
    }

    private List<ItemStack> shearInternal(SoundSource p_28924_) {
        this.level.playSound(null, this, SoundEvents.MOOSHROOM_SHEAR, p_28924_, 1.0F, 1.0F);
        if (!this.level.isClientSide()) {
            ((ServerLevel) this.level).sendParticles(ParticleTypes.EXPLOSION, this.getX(), this.getY(0.5D), this.getZ(), 1, 0.0D, 0.0D, 0.0D, 0.0D);
            this.discard();
            Cow cow = EntityType.COW.create(this.level);
            cow.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
            cow.setHealth(this.getHealth());
            cow.yBodyRot = this.yBodyRot;
            if (this.hasCustomName()) {
                cow.setCustomName(this.getCustomName());
                cow.setCustomNameVisible(this.isCustomNameVisible());
            }

            if (this.isPersistenceRequired()) {
                cow.setPersistenceRequired();
            }

            cow.setInvulnerable(this.isInvulnerable());
            this.level.addFreshEntity(cow);

            List<ItemStack> items = new ArrayList<>();
            for (int i = 0; i < 2; ++i) {
                items.add(Items.SUNFLOWER.getDefaultInstance());
            }
            return items;
        }
        return Collections.emptyList();

    }

    public static boolean checkMooBloomSpawnRules(EntityType<? extends Animal> entityType, LevelAccessor level, MobSpawnType mobSpawnType, BlockPos blockPos, RandomSource rand) {
        return checkAnimalSpawnRules(entityType, level, mobSpawnType, blockPos, rand);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D);
    }
}