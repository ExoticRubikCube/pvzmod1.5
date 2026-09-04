package com.hungteen.pvz.common.item.tool;

import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Optional;

public class GardenCompassItem extends Item {

	public GardenCompassItem() {
		super(new Properties().stacksTo(1).tab(PVZItemGroups.PVZ_USEFUL).durability(0));
	}

	@Override
	public boolean canBeHurtBy(net.minecraft.world.damagesource.DamageSource source) {
		return false;
	}

	@Override
	public EquipmentSlot getEquipmentSlot(ItemStack stack) {
		return EquipmentSlot.OFFHAND;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
		ItemStack stack = playerIn.getItemInHand(handIn);
		if(playerIn.level.isClientSide) {
			return InteractionResultHolder.success(stack);
		}
		BlockPos pos = this.getPointPosition(playerIn);
		setPos(stack, pos);
		return InteractionResultHolder.consume(stack);
	}

	public static ItemStack setPos(ItemStack stack, BlockPos pos) {
		stack.getOrCreateTag().putBoolean("pos", pos != null);
		if (pos != null){
			stack.getOrCreateTag().putInt("pos_x", pos.getX());
			stack.getOrCreateTag().putInt("pos_y", pos.getY());
			stack.getOrCreateTag().putInt("pos_z", pos.getZ());
		}
		return stack;
	}

	public static BlockPos getPos(ItemStack stack) {
		if (!stack.hasTag() || !stack.getTag().getBoolean("pos")) {
			return null;
		}
		return new BlockPos(stack.getTag().getInt("pos_x"), stack.getTag().getInt("pos_y"), stack.getTag().getInt("pos_z"));
	}

	private BlockPos getPointPosition(LivingEntity player) {
		BlockPos blockpos = new BlockPos(player.position());
		ResourceKey<Biome> targetKey = ResourceKey.create(Registry.BIOME_REGISTRY, ResourceLocation.fromNamespaceAndPath("pvz", "zen_garden"));
		Registry<Biome> biomeReg = player.getServer().registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		Biome targetBiome = biomeReg.get(targetKey);
		if (targetBiome == null) {
			return null;
		}
		Optional<ResourceKey<Biome>> presentKey = biomeReg.getResourceKey(targetBiome);
		if (presentKey.isEmpty()) {
			return null;
		}
		BlockPos blockpos1 = null;
		int radius = 512;
		int step = 16;
		BlockPos.MutableBlockPos mbp = new BlockPos.MutableBlockPos();
		search:
		for(int r = step; r <= radius; r += step) {
			for(int dx = -r; dx <= r; dx += step) {
				for(int dz = -r; dz <= r; dz += step) {
					if(Math.abs(dx) == r || Math.abs(dz) == r) {
						mbp.set(blockpos.getX() + dx, blockpos.getY(), blockpos.getZ() + dz);
						if(player.level.getBiome(mbp).is(presentKey.get())) {
							blockpos1 = mbp.immutable();
							break search;
						}
					}
				}
			}
		}
		return blockpos1;
	}

	@SubscribeEvent
	public static void disturb(PlayerEvent.PlayerChangedDimensionEvent ev){
		for (ItemStack item : ev.getEntity().getInventory().items){
			if (item.getItem() instanceof GardenCompassItem){
				setPos(item, null);
			}
		}
	}
}