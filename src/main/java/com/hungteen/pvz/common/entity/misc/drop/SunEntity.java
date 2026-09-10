package com.hungteen.pvz.common.entity.misc.drop;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.common.enchantment.EnchantmentRegister;
import com.hungteen.pvz.common.enchantment.misc.SunMendingEnchantment;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.event.events.PlayerCollectDropEvent;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @program: pvzmod-1.18.x
 * @author: HungTeen
 * @create: 2022-03-11 09:16
 **/
public class SunEntity extends DropEntity {

	private static final float SUN_FALL_SPEED = 0.03F;
	//必须与 onCollectedByPlayer 的消耗条件保持一致，否则阳光会追上却无法消失
	private static final Predicate<Entity> CAN_ABSORB_SUN = (target) -> target instanceof Player player && EntitySelector.NO_SPECTATORS.test(target)
		&& (player.isCreative() || PlayerUtil.getResource(player, Resources.SUN_NUM) < PlayerUtil.getPlayerMaxSunNum(PlayerUtil.getResource(player, Resources.TREE_LVL))
			|| EnchantmentHelper.getRandomItemWith(EnchantmentRegister.SUN_MENDING.get(), player, ItemStack::isDamaged) != null);
	public Vec3 ColorBase = new Vec3(255,230,15);
	public Vec3 ColorChange = new Vec3(0,25,15);
	private Entity following;

	public SunEntity(EntityType<? extends Mob> type, Level worldIn) {
		super(type, worldIn);
		setAmount(this.getDefaultAmount());
		this.setNoGravity(true);
	}

	@Override
	public void tick() {
		super.tick();

		if(! this.onGround && ! this.isInWater()) {
			this.setDeltaMovement(this.getDeltaMovement().x, - SUN_FALL_SPEED, this.getDeltaMovement().z);
		} else{
			this.setDeltaMovement(Vec3.ZERO);
		}

		if ((this.tickCount+this.getId()) % ((this.following instanceof Player) ? 200 : 50) == 0 || (this.following != null && this.following.distanceToSqr(this) > 64.0D)) {
			this.following = this.level.getNearestPlayer(this.getX(), this.getY(), this.getZ(), 6.0D, CAN_ABSORB_SUN);
		}
		if (this.following instanceof Player player && ! CAN_ABSORB_SUN.test(player)) {
			this.following = null;
		}
		if (this.following == null && getAmount() < 150 && (this.tickCount+this.getId()) % 50 == 0){
			List<Entity> list = this.level.getEntities(this, this.getBoundingBox().inflate(2D, 2D, 2D));
			for (Entity entity : list) {
				if (entity instanceof SunEntity && entity.getId() > this.getId()) {
					this.following = entity;
					break;
				}
			}
		}

		if (this.following != null) {
			if (following instanceof SunEntity){
				if (this.distanceTo(following) < 0.5F){
					((SunEntity) following).setAmount(((SunEntity) following).getAmount()+this.getAmount());
					this.discard();
				}
			}
			Vec3 vec3 = new Vec3(this.following.getX() - this.getX(), this.following.getY() + (double)this.following.getEyeHeight() / 2.0D - this.getY(), this.following.getZ() - this.getZ());
			double d0 = vec3.lengthSqr();
			if (d0 < 25.0D) {
				double d1 = 1.0D - Math.sqrt(d0) / 5.0D;
				this.setDeltaMovement(this.getDeltaMovement().add(vec3.normalize().scale(d1 * d1 * (following instanceof SunEntity ? 0.1D: 0.3D))));
			}
		}
	}

	public int getIcon() {
		final int value = this.getAmount();
		return value < 6 ? 0 : value < 16 ? 1 : value < 26 ? 2 : 3;
	}

	protected int getDefaultAmount() {
		return 25;
	}

	@Override
	public void onCollectedByPlayer(Player living) {
		if(! level.isClientSide() && ! MinecraftForge.EVENT_BUS.post(new PlayerCollectDropEvent.PlayerCollectSunEvent(living, this))) {
			final int currentSun = PlayerUtil.getResource(living, Resources.SUN_NUM);
			final int maxSun = PlayerUtil.getPlayerMaxSunNum(PlayerUtil.getResource(living, Resources.TREE_LVL));
			//sun mending enchantment, repair works at any sun amount and costs no sun.
			final Map.Entry<EquipmentSlot, ItemStack> entry = EnchantmentHelper.getRandomItemWith(EnchantmentRegister.SUN_MENDING.get(), living, ItemStack::isDamaged);
			if(entry != null) {
				SunMendingEnchantment.repairItem(entry.getValue(), this.getAmount());
			}
			//player absorb.
			final int absorbed = living.isCreative() ? this.getAmount() : Math.min(this.getAmount(), maxSun - currentSun);
			if(absorbed > 0) {
				PlayerUtil.addResource(living, Resources.SUN_NUM, absorbed);
				this.setAmount(this.getAmount() - absorbed);
			}
			//sun can not be stored at cap, mending collection consumes the left amount.
			if(this.getAmount() > 0 && entry != null) {
				this.setAmount(0);
			}
			if(absorbed > 0 || entry != null) {
				PlayerUtil.playClientSound(living, SoundRegister.SUN_PICK.get());
			}
		}
	}

	@Override
	public void onCollect(LivingEntity living) {
		if(living instanceof Player) {
			this.onCollectedByPlayer((Player) living);
		}
		if(this.getAmount() <= 0) {
			this.discard();
		}
	}

	@Override
	public EntityDimensions getDimensions(Pose poseIn) {
		int amount = this.getAmount();
		float w = amount * 1f / 200 + 0.2f;
		return EntityDimensions.scalable(w, w);
	}

	public static void spawnSunsByAmount(Level world, BlockPos pos, int amount) {
		spawnSunsByAmount(world, pos, amount, 75, 1);
	}

	/**
	 * spawn sun in range, each is set to a specific amount.
	 */
	public static void spawnSunsByAmount(Level world, BlockPos pos, int amount, int each, double speed) {
		while(amount >= each) {
			amount -= each;
			dropSunRandomly(world, pos, each, speed);
		}
		if(amount != 0) {
			dropSunRandomly(world, pos, amount, speed);
		}
	}

	/**
	 * spawn random speed sun entity with specific amount.
	 */
	public static void dropSunRandomly(Level world, BlockPos pos, int amount, double speed) {
		final SunEntity sun = EntityRegister.SUN.get().create(world);
		sun.setAmount(amount);
		speed *= 0.15;
		EntityUtil.onEntitySpawn(world, sun, pos);
		final double dy = speed * 0.2 + 0.2;
		final double dx = MathUtil.getRandomFloat(world.getRandom()) + speed * 0.2;
		final double dz = MathUtil.getRandomFloat(world.getRandom()) + speed * 0.2;
		sun.setDeltaMovement(new Vec3(dx, 0, dz).scale(speed).add(0, dy, 0));
	}

	public static boolean canSunSpawn(EntityType<? extends SunEntity> zombieType, LevelAccessor worldIn, MobSpawnType reason, BlockPos pos, RandomSource rand) {
		if(worldIn instanceof ServerLevel) {
			return ! ((ServerLevel) worldIn).isRainingAt(pos) && ((ServerLevel) worldIn).isDay() && worldIn.getBrightness(LightLayer.SKY, pos) >= 15;
		}
		return worldIn.getBrightness(LightLayer.SKY, pos) >= 15;
	}

	@Override
	public int getMaxLiveTick() {
		return PVZConfig.COMMON_CONFIG.EntitySettings.EntityLiveTick.SunLiveTick.get();
	}

}
