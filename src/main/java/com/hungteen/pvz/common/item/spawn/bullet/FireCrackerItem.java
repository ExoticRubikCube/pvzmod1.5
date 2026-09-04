package com.hungteen.pvz.common.item.spawn.bullet;

import com.hungteen.pvz.common.entity.bullet.itembullet.FireCrackerEntity;
import com.hungteen.pvz.common.item.PVZToolItem;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class FireCrackerItem extends PVZToolItem {

	private static final int CD = 10;
	
	public FireCrackerItem() {
		super(new Item.Properties());
	}
	
	@Override
	public InteractionResultHolder<ItemStack> use(Level worldIn, Player playerIn, InteractionHand handIn) {
		ItemStack stack = playerIn.getItemInHand(handIn);
		if(! worldIn.isClientSide && handIn == InteractionHand.MAIN_HAND) {
			FireCrackerEntity entity = new FireCrackerEntity(worldIn, playerIn);
			Vec3 vec = playerIn.getLookAngle();
			entity.setPos(playerIn.getX() + vec.x, playerIn.getY() + playerIn.getEyeHeight() + vec.y, playerIn.getZ() + vec.z);
			entity.summonByOwner(playerIn);
			entity.shoot(vec);
			entity.setAttackDamage(4F);
			worldIn.addFreshEntity(entity);
			EntityUtil.playSound(playerIn, SoundEvents.SNOWBALL_THROW);
			if(! playerIn.getAbilities().instabuild) {
				stack.shrink(1);
			}
			playerIn.getCooldowns().addCooldown(this, CD);
		}
		return InteractionResultHolder.success(stack);
	}

}