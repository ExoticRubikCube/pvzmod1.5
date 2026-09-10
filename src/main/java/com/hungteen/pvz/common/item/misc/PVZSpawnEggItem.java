package com.hungteen.pvz.common.item.misc;

import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class PVZSpawnEggItem extends ForgeSpawnEggItem{

	protected static final List<PVZSpawnEggItem> PVZ_EGGS = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public PVZSpawnEggItem(final NonNullSupplier<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn, Properties builder) {
		super(() -> (EntityType<? extends Mob>) entityTypeSupplier.get(), primaryColorIn, secondaryColorIn, builder);
		PVZ_EGGS.add(this);
	}

	@SuppressWarnings("unchecked")
	public PVZSpawnEggItem(final RegistryObject<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn, Properties builder) {
		super(() -> (EntityType<? extends Mob>) entityTypeSupplier.get(), primaryColorIn, secondaryColorIn, builder);
		PVZ_EGGS.add(this);
	}

	public static void initUnaddedEggs() {
		DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior() {
			public ItemStack execute(BlockSource source, ItemStack stack) {
				Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
				EntityType<?> entitytype = ((ForgeSpawnEggItem) stack.getItem()).getType(stack.getTag());
				entitytype.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), MobSpawnType.DISPENSER, direction != Direction.UP, false);
				stack.shrink(1);
				return stack;
			}
		};
		for (final PVZSpawnEggItem egg : PVZ_EGGS) {
			DispenserBlock.registerBehavior(egg, defaultDispenseItemBehavior);
		}
		PVZ_EGGS.clear();
	}

}