package com.hungteen.pvz.common.item.tool.plant;

import com.hungteen.pvz.common.enchantment.EnchantmentRegister;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.bullet.itembullet.PeaEntity;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.common.potion.EffectRegister;
import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PeaGunItem extends ProjectileWeaponItem {

	public PeaGunItem() {
		super(new Properties().tab(PVZItemGroups.PVZ_USEFUL).stacksTo(1).durability(1200));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		final ItemStack gun = player.getItemInHand(hand);
		ItemStack bulletStack = player.getProjectile(gun);
		if (player.getAbilities().instabuild && bulletStack.getItem() == Items.ARROW) {
			bulletStack = new ItemStack(ItemRegister.PEA.get());
		}
		if (bulletStack.isEmpty()) {
			return InteractionResultHolder.fail(gun);
		}
		if (level.isClientSide) {
			return InteractionResultHolder.consume(gun);
		}
		final boolean flame = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, gun) > 0;
		final int force = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, gun);
		final PeaEntity pea = this.createBullet(level, player, bulletStack.getItem(), flame, force);
		final boolean infinite = player.getAbilities().instabuild
				|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.INFINITY_ARROWS, gun) > 0
				|| player.hasEffect(EffectRegister.ENERGETIC_EFFECT.get());
		if (!infinite) {
			bulletStack.shrink(1);
		}
		pea.summonByOwner(player);
		level.playSound(null, player, SoundRegister.PEA_SNIPER_SHOOT.get(), SoundSource.PLAYERS, 1.0F, 1.0F);
		level.addFreshEntity(pea);
		player.getCooldowns().addCooldown(this, getShootCD(player, gun));
		gun.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(hand));
		return InteractionResultHolder.consume(gun);
	}

	private PeaEntity createBullet(Level level, Player player, Item bulletItem, boolean flame, int force) {
		final PeaEntity pea = EntityRegister.PEA.get().create(level);
        if (pea != null) {
			pea.setPos(player.getX(), player.getEyeY() - 0.2D, player.getZ());
			pea.shootPea(player.getLookAngle(), 1.3D, 0.0D);
			pea.setPeaType(PeaEntity.Type.NORMAL);

			if (bulletItem == ItemRegister.PEA.get()) {
				pea.setPeaState(flame ? PeaEntity.State.FIRE : PeaEntity.State.NORMAL);
				pea.setAttackDamage(8.0F + force * 2.0F);
			} else if (bulletItem == ItemRegister.SNOW_PEA.get()) {
				pea.setPeaState(flame ? PeaEntity.State.NORMAL : PeaEntity.State.ICE);
				pea.setAttackDamage(7.0F + force * 2.0F);
			} else {
				pea.setPeaState(PeaEntity.State.FIRE);
				pea.setAttackDamage(12.0F + force * 2.0F);
			}
		}
		return pea;
	}

	@Override
	public Predicate<ItemStack> getAllSupportedProjectiles() {
		return stack -> stack.getItem() == ItemRegister.PEA.get()
				|| stack.getItem() == ItemRegister.SNOW_PEA.get()
				|| stack.getItem() == ItemRegister.FLAME_PEA.get();
	}

	@Override
	public int getDefaultProjectileRange() {
		return 32;
	}

	/**
	 * 30 20 15 10
	 */
	public static int getShootCD(LivingEntity living, ItemStack stack) {
		if (living.hasEffect(EffectRegister.ENERGETIC_EFFECT.get())) {
			return 2;
		}
		final int lvl = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.QUICK_CHARGE, stack);
		return lvl == 0 ? 30 : 25 - Math.min(3, lvl) * 5;
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
		tooltip.add(Component.translatable("tooltip.pvz.pea_gun").withStyle(ChatFormatting.GREEN));
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return enchantment == Enchantments.QUICK_CHARGE
				|| enchantment == Enchantments.PUNCH_ARROWS
				|| enchantment == Enchantments.POWER_ARROWS
				|| (enchantment == Enchantments.INFINITY_ARROWS && !EnchantmentHelper.getEnchantments(stack).containsKey(Enchantments.FLAMING_ARROWS))
				|| (enchantment == Enchantments.FLAMING_ARROWS && !EnchantmentHelper.getEnchantments(stack).containsKey(Enchantments.INFINITY_ARROWS))
				|| enchantment == Enchantments.UNBREAKING
				|| enchantment == Enchantments.MENDING
				|| enchantment == EnchantmentRegister.SUN_MENDING.get();
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}

	@Override
	public int getEnchantmentValue() {
		return 8;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.NONE;
	}

	@Override
	public boolean isValidRepairItem(ItemStack stack, ItemStack repairStack) {
		return repairStack.getItem().equals(ItemRegister.APPEASE_ESSENCE.get());
	}

	/**only decoration.*/
	@Override
	public boolean canEquip(ItemStack stack, EquipmentSlot armorType, Entity entity) {
		return armorType == EquipmentSlot.HEAD;
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(PeaGunClientExt.INSTANCE);
	}

	private static class PeaGunClientExt implements IClientItemExtensions {

		private static final PeaGunClientExt INSTANCE = new PeaGunClientExt();

		@Override
		public HumanoidModel.ArmPose getArmPose(LivingEntity entity, InteractionHand hand, ItemStack stack) {
			return HumanoidModel.ArmPose.BOW_AND_ARROW;
		}
	}

}