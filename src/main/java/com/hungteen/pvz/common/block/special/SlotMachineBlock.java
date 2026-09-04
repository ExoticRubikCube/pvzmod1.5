package com.hungteen.pvz.common.block.special;

import com.hungteen.pvz.common.block.AbstractFacingBlock;
import com.hungteen.pvz.common.datapack.LotteryTypeLoader;
import com.hungteen.pvz.common.item.PVZItemGroups;
import com.hungteen.pvz.common.tileentity.SlotMachineTileEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;

public class SlotMachineBlock extends AbstractFacingBlock implements EntityBlock {

	public SlotMachineBlock() {
		super(Properties.copy(Blocks.GOLD_BLOCK));
	}

	@Override
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn,
			BlockHitResult hit) {
		if (!worldIn.isClientSide && handIn == InteractionHand.MAIN_HAND) {
			SlotMachineTileEntity te = (SlotMachineTileEntity) worldIn.getBlockEntity(pos);
			if (te.getLotteryType() != null) {
				NetworkHooks.openScreen((ServerPlayer) player, te, pos);
			}
		}
		return InteractionResult.SUCCESS;
	}

	public void setPlacedBy(Level p_180633_1_, BlockPos p_180633_2_, BlockState p_180633_3_, LivingEntity p_180633_4_,
			ItemStack p_180633_5_) {
		if (p_180633_5_.hasCustomHoverName()) {
			BlockEntity tileentity = p_180633_1_.getBlockEntity(p_180633_2_);
			if (tileentity instanceof SlotMachineTileEntity) {
				((SlotMachineTileEntity) tileentity).setCustomName(p_180633_5_.getHoverName());
			}
		}

	}

	@Override
	public void fillItemCategory(CreativeModeTab itemGroup, NonNullList<ItemStack> itemStacks) {
		if (itemGroup.equals(PVZItemGroups.PVZ_USEFUL)) {
			LotteryTypeLoader.LOTTERIES.forEach((res, lottery) -> {
				final ItemStack stack = new ItemStack(this);
				setResourceTag(stack, res);
				itemStacks.add(stack);
			});
		}
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter iBlockReader,
			List<Component> iTextComponents, TooltipFlag iTooltipFlag) {
		super.appendHoverText(stack, iBlockReader, iTextComponents, iTooltipFlag);
		final String res = getResourceTag(stack).toString();
		iTextComponents.add(Component.literal(res).withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	}

	public static void setResourceTag(ItemStack stack, ResourceLocation res) {
		final CompoundTag nbt = stack.getOrCreateTagElement(StringUtil.TE_TAG);
		nbt.putString("lottery_type", res.toString());
	}

	public static ResourceLocation getResourceTag(ItemStack stack) {
		return ResourceLocation.parse(stack.getOrCreateTagElement(StringUtil.TE_TAG).getString("lottery_type"));
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SlotMachineTileEntity(pos, state);
	}

	public ItemStack getCloneItemStack(BlockGetter p_185473_1_, BlockPos p_185473_2_, BlockState p_185473_3_) {
		@SuppressWarnings("deprecation")
		final ItemStack itemstack = super.getCloneItemStack(p_185473_1_, p_185473_2_, p_185473_3_);
		SlotMachineTileEntity blockEntity = (SlotMachineTileEntity) p_185473_1_.getBlockEntity(p_185473_2_);
        CompoundTag compoundnbt;
        if (blockEntity != null) {
			compoundnbt = blockEntity.saveWithFullMetadata();
			if (!compoundnbt.isEmpty()) {
				itemstack.addTagElement(StringUtil.TE_TAG, compoundnbt);
			}
		}

		return itemstack;
	}

}