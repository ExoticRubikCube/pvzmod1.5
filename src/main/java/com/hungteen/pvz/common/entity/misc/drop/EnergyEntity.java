package com.hungteen.pvz.common.entity.misc.drop;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class EnergyEntity extends DropEntity{

	private final int changeVTime = 50;
	public EnergyEntity(EntityType<? extends Mob> type, Level worldIn) {
		super(type, worldIn);
		this.setAmount(1);//always 1
		this.setNoGravity(true);
	}

	@Override
	public void onCollectedByPlayer(Player player) {
		if(! this.level.isClientSide()) {
			PlayerUtil.addResource(player, Resources.ENERGY_NUM, this.getAmount());
			PlayerUtil.playClientSound(player, SoundRegister.JEWEL_PICK.get());
		}
	}
	
	@Override
	public void tick() {
		super.tick();
		if(this.liveTime % this.changeVTime == 0) {
			double mult = 0.2f;
//			System.out.println(this.getMotion().y);
			Vec3 v = new Vec3(this.random.nextInt(1000) - 500, this.random.nextInt(1000) - 500, this.random.nextInt(1000) - 500).normalize();
			v = v.scale(mult);
			this.setDeltaMovement(v.x ,v.y / 5, v.z);
		}
	}
	
	@Override
	protected int getMaxLiveTick() {
		return PVZConfig.COMMON_CONFIG.EntitySettings.EntityLiveTick.EnergyLiveTick.get();
	}

}