package com.hungteen.pvz.common.entity.misc;

import com.hungteen.pvz.common.capability.level.PVZFogCapability;
import com.hungteen.pvz.common.entity.EntityRegister;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

import java.util.UUID;

public class ThrownFogInBottle extends ThrowableItemProjectile {

	public ThrownFogInBottle(EntityType<? extends ThrownFogInBottle> type, Level level) {
		super(type, level);
	}

	public ThrownFogInBottle(Level level, LivingEntity owner) {
		super(EntityRegister.FOG_IN_BOTTLE.get(), owner, level);
	}

	@Override
	protected Item getDefaultItem() {
		return Items.EXPERIENCE_BOTTLE;
	}

	@Override
	protected float getGravity() {
		return 0.07F;
	}

	@Override
	protected void onHit(HitResult hitResult) {
		super.onHit(hitResult);
		if (this.level instanceof ServerLevel) {
			PVZFogCapability.addOrResetFog(level, this.blockPosition(), 600, 10, 15, UUID.randomUUID());
			this.discard();
		}
	}
}
