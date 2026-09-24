package com.hungteen.pvz.common.entity.bullet.itembullet;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.plant.explosion.PotatoMineEntity;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.utils.PlantUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class PotatoEntity extends PVZItemBulletEntity{

	private static final EntityDataAccessor<Boolean> POISONOUS = SynchedEntityData.defineId(PotatoEntity.class,
			EntityDataSerializers.BOOLEAN);
	
	private static final double SHOOT_SPEED_Y = 0.5D;

	public PotatoEntity(EntityType<?> type, Level worldIn) {
		super(type, worldIn);
		this.setNoGravity(false);
		this.airSlowDown = 1F;
	}
	
	public PotatoEntity(Level worldIn, LivingEntity thrower) {
		super(EntityRegister.POTATO.get(), worldIn, thrower);
		this.setNoGravity(false);
		this.airSlowDown = 1F;
	}
	
	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		entityData.define(POISONOUS, false);
	}
	
	public void shootTo(BlockPos pos) {
		final double g = this.getGravityVelocity();
		final double t1 = SHOOT_SPEED_Y / g;
		final double height = SHOOT_SPEED_Y * SHOOT_SPEED_Y / 2 / g;
		final double downHeight = this.getY() + height - pos.getY() - 1;
		double t2 = 0;
		if(downHeight >= 0) {
			t2 = Mth.sqrt((float) (2 * downHeight / g));
		}
		final double dx = pos.getX() + 0.5D - this.getX();
		final double dz = pos.getZ() + 0.5D - this.getZ();
		final double dxz = Mth.sqrt((float) (dx * dx + dz * dz));
		final double vxz = dxz / (t1 + t2);
		if(dxz == 0) {
			this.setDeltaMovement(0, SHOOT_SPEED_Y, 0);
		} else {
			this.setDeltaMovement(vxz * dx / dxz, SHOOT_SPEED_Y, vxz * dz / dxz);
		}
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(this.isPoisonous() ? Items.POISONOUS_POTATO : Items.POTATO);
	}

	public boolean isPoisonous() {
		return entityData.get(POISONOUS);
	}

	public void setPoisonous(boolean poisonous) {
		entityData.set(POISONOUS, poisonous);
	}

	@Override
	public void onImpact(HitResult result) {
		this.level.broadcastEntityEvent(this, (byte)3);
        if(! this.checkLive(result)) {
            if(! (this.getThrower() instanceof PVZPlantEntity plant)) {
            	PVZMod.LOGGER.warn("Who is shooting potato, there are some matter !");
            	return ;
            }
            PotatoMineEntity mine = EntityRegister.POTATO_MINE.get().create(level);
            PlantUtil.copyPlantData(mine, plant);
            /* 毒化随子弹走，不从技能表推断 */
            mine.setPoisonous(this.isPoisonous());
            boolean planted = false;
            if(result instanceof BlockHitResult blockResult && blockResult.getDirection() == Direction.UP) {
            	final BlockPos groundPos = blockResult.getBlockPos();
            	final BlockPos spawnPos = groundPos.above();
            	if(! this.isInWater() && PVZPlants.POTATO_MINE.getPlacement().canPlaceOnBlock(level.getBlockState(groundPos).getBlock())
            			&& level.isEmptyBlock(spawnPos)
            			&& level.getEntitiesOfClass(PVZPlantEntity.class, new AABB(spawnPos)).isEmpty()) {
            		mine.setPos(groundPos.getX() + 0.5D, groundPos.getY() + 1.0D, groundPos.getZ() + 0.5D);
            		mine.setRisingFromDirt();
            		this.level.addFreshEntity(mine);
            		planted = true;
            	}
            }
            if(! planted) {
            	mine.setPos(this.getX(), this.getY(), this.getZ());
            	mine.performAttack(null);
            }
			this.discard();
        }
	}

	@Override
	protected int getMaxLiveTick() {
		return 120;
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.06f;
	}

}