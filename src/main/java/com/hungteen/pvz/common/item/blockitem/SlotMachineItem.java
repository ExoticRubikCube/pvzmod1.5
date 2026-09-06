package com.hungteen.pvz.common.item.blockitem;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.block.special.SlotMachineBlock;
import com.hungteen.pvz.common.blockentity.SlotMachineTileEntity;
import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;

import javax.annotation.Nullable;

public class SlotMachineItem extends BlockItem {

	public SlotMachineItem() {
		super(BlockRegister.SLOT_MACHINE.get(), new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL));
	}

	/**
	 * Copy from super BlockItem#place using 1.19.2 BlockPlaceContext.
	 */
	@Override
	public InteractionResult place(BlockPlaceContext context) {
		if (!context.canPlace()) {
			return InteractionResult.FAIL;
		} else {
			BlockPlaceContext blockplacecontext = this.updatePlacementContext(context);
			if (blockplacecontext == null) {
				return InteractionResult.FAIL;
			} else {
				BlockState blockstate = this.getPlacementState(blockplacecontext);
				if (blockstate == null) {
					return InteractionResult.FAIL;
				} else if (!this.placeBlock(blockplacecontext, blockstate)) {
					return InteractionResult.FAIL;
				} else {
					BlockPos blockpos = blockplacecontext.getClickedPos();
					Level world = blockplacecontext.getLevel();
					Player playerentity = blockplacecontext.getPlayer();
					ItemStack itemstack = blockplacecontext.getItemInHand();
					BlockState blockstate1 = world.getBlockState(blockpos);
					Block block = blockstate1.getBlock();

					if (block == blockstate.getBlock()) {
						blockstate1 = this.updateBlockStateFromTag(blockpos, world, itemstack, blockstate1);
						this.updateCustomBlockEntityTag(blockpos, world, playerentity, itemstack, blockstate1);
						block.setPlacedBy(world, blockpos, blockstate1, playerentity, itemstack);
						if (playerentity instanceof ServerPlayer serverPlayer) {
							CriteriaTriggers.PLACED_BLOCK.trigger(serverPlayer, blockpos, itemstack);
						}
					}

					SoundType soundtype = blockstate1.getSoundType(world, blockpos, context.getPlayer());
					world.playSound(playerentity, blockpos,
							this.getPlaceSound(blockstate1, world, blockpos, playerentity),
							SoundSource.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

					if (!playerentity.getAbilities().instabuild) {
						itemstack.shrink(1);
					}

					return InteractionResult.sidedSuccess(world.isClientSide);
				}
			}
		}
	}

	/**
	 * copy from super.
	 */
	protected boolean updateCustomBlockEntityTag(BlockPos p_195943_1_, Level p_195943_2_,
			@Nullable Player p_195943_3_, ItemStack p_195943_4_, BlockState p_195943_5_) {
		return updateCustomBlockEntityTag(p_195943_2_, p_195943_3_, p_195943_1_, p_195943_4_);
	}
	
	/**
	 * copy from super.
	 */
	public static boolean updateCustomBlockEntityTag(Level p_179224_0_, @Nullable Player p_179224_1_,
			BlockPos p_179224_2_, ItemStack stack) {
		MinecraftServer minecraftserver = p_179224_0_.getServer();
		if (minecraftserver == null) {
			return false;
		} else {
			CompoundTag compoundnbt = stack.getTagElement("BlockEntityTag");
			if (compoundnbt != null) {
				BlockEntity tileentity = p_179224_0_.getBlockEntity(p_179224_2_);
				if (tileentity instanceof SlotMachineTileEntity) {
					if (!p_179224_0_.isClientSide && tileentity.onlyOpCanSetNbt()
							&& (p_179224_1_ == null || !p_179224_1_.canUseGameMasterBlocks())) {
						return false;
					}
					
					//new add.
					((SlotMachineTileEntity) tileentity).init(SlotMachineBlock.getResourceTag(stack));

					CompoundTag compoundnbt1 = tileentity.saveWithFullMetadata();
					CompoundTag compoundnbt2 = compoundnbt1.copy();
					compoundnbt1.merge(compoundnbt);
					compoundnbt1.putInt("x", p_179224_2_.getX());
					compoundnbt1.putInt("y", p_179224_2_.getY());
					compoundnbt1.putInt("z", p_179224_2_.getZ());
					if (!compoundnbt1.equals(compoundnbt2)) {
						tileentity.load(compoundnbt1);
						tileentity.setChanged();
						return true;
					}
				}
			}

			return false;
		}
	}

	/**
	 * copy from super.
	 */
	private BlockState updateBlockStateFromTag(BlockPos p_219985_1_, Level p_219985_2_, ItemStack p_219985_3_,
			BlockState p_219985_4_) {
		BlockState blockstate = p_219985_4_;
		CompoundTag compoundnbt = p_219985_3_.getTag();
		if (compoundnbt != null) {
			CompoundTag compoundnbt1 = compoundnbt.getCompound("BlockStateTag");
			StateDefinition<Block, BlockState> statecontainer = p_219985_4_.getBlock().getStateDefinition();

			for (String s : compoundnbt1.getAllKeys()) {
				Property<?> property = statecontainer.getProperty(s);
				if (property != null) {
					String s1 = compoundnbt1.get(s).getAsString();
					blockstate = updateState(blockstate, property, s1);
				}
			}
		}

		if (blockstate != p_219985_4_) {
			p_219985_2_.setBlock(p_219985_1_, blockstate, 2);
		}

		return blockstate;
	}

	/**
	 * copy from super.
	 */
	private static <T extends Comparable<T>> BlockState updateState(BlockState p_219988_0_, Property<T> p_219988_1_,
			String p_219988_2_) {
		return p_219988_1_.getValue(p_219988_2_).map((p_219986_2_) -> {
			return p_219988_0_.setValue(p_219988_1_, p_219986_2_);
		}).orElse(p_219988_0_);
	}

}