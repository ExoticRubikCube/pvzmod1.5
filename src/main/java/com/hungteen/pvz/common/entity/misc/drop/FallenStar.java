package com.hungteen.pvz.common.entity.misc.drop;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class FallenStar extends ItemEntity {
	public Vec3 storedSpeed;
	public boolean persistent = false;
	public static Random random = new Random();

	public FallenStar(EntityType<? extends ItemEntity> type, Level level) {
		super(type, level);
		this.setItem((random.nextInt(5) == 0 ? ItemRegister.ANGEL_STARFRUIT.get() : ItemRegister.STARFRUIT.get()).getDefaultInstance());
		this.storedSpeed = this.getDeltaMovement();
	}

	public FallenStar(Level level, double x, double y, double z) {
		super(level, x, y, z, (random.nextInt(5) == 0 ? ItemRegister.ANGEL_STARFRUIT.get() : ItemRegister.STARFRUIT.get()).getDefaultInstance());
		this.storedSpeed = this.getDeltaMovement();
	}

	public static FallenStar spawnAt(Level level, BlockPos pos) {
		FallenStar star = EntityRegister.FALLEN_STAR.get().create(level);
		star.setItem((random.nextInt(5) == 0 ? ItemRegister.ANGEL_STARFRUIT.get() : ItemRegister.STARFRUIT.get()).getDefaultInstance());
		star.moveTo(Vec3.atCenterOf(pos));
		star.setDeltaMovement(random.nextFloat() * 2 - 1, 0, random.nextFloat() * 2 - 1);
		level.addFreshEntity(star);
		return star;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag tag) {
		tag.putBoolean("Persistent", this.persistent);
		super.addAdditionalSaveData(tag);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag tag) {
		super.readAdditionalSaveData(tag);
		if (tag.contains("Persistent")) {
			this.persistent = tag.getBoolean("Persistent");
		}
	}

	@Override
	public void baseTick() {
		super.baseTick();
		//disappear when day
		if (! this.persistent && ! level.isClientSide && level.isDay() && random.nextInt(100) == 0) {
			this.discard();
		}
		//moving && bouncing.
		if (this.getDeltaMovement().y < - 1) {
			this.setDeltaMovement(this.getDeltaMovement().multiply(1, 0, 1).add(0, - 1, 0));
		}
		if (! level.isClientSide && this.verticalCollisionBelow) {
			double speedSqr = this.storedSpeed.lengthSqr();
			if (speedSqr > 0.5) {
				level.getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(0.5)).forEach(entity -> entity.hurt(PVZEntityDamageSource.FALLEN_STAR, (float) speedSqr * 3));
			}
			this.setDeltaMovement(this.getDeltaMovement().x, (this.storedSpeed.y < -1 ? - this.storedSpeed.y * 0.5 : this.getDeltaMovement().y), this.getDeltaMovement().z);
		}
		this.storedSpeed = this.getDeltaMovement();
	}
}
