package com.hungteen.pvz.common.world.spawn;

import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.server.level.ServerLevel;

public class SpawnChecker {

	public static boolean canZombieSpawn(EntityType<? extends PVZZombieEntity> zombieType, ServerLevelAccessor worldIn,
										 MobSpawnType reason, BlockPos pos, RandomSource rand) {
		return checkSpawn(zombieType, worldIn, reason, pos, rand);
	}

	public static boolean canLavaZombieSpawn(EntityType<? extends PVZZombieEntity> zombieType, ServerLevelAccessor worldIn,
											MobSpawnType reason, BlockPos pos, RandomSource rand) {
		return worldIn.getDifficulty() == Difficulty.HARD && checkSpawn(zombieType, worldIn, reason, pos, rand);
	}

	public static boolean canTombStoneSpawn(EntityType<? extends PVZZombieEntity> zombieType, ServerLevelAccessor worldIn,
											MobSpawnType reason, BlockPos pos, RandomSource rand) {
		return (int) worldIn.getLevel().dayTime() % 24000 > 14000 && checkSpawn(zombieType, worldIn, reason, pos, rand);
	}

	public static boolean canYetiSpawn(EntityType<? extends PVZZombieEntity> zombieType, ServerLevelAccessor worldIn,
									  MobSpawnType reason, BlockPos pos, RandomSource rand) {
		if(worldIn instanceof ServerLevel serverLevel && canZombieSpawn(zombieType, worldIn, reason, pos, rand)) {
			return serverLevel.isThundering() && !serverLevel.isDay() && rand.nextInt(3) == 0;
		}
		return false;
	}

	private static boolean checkSpawn(EntityType<? extends Mob> zombieType, ServerLevelAccessor worldIn, MobSpawnType reason, BlockPos pos, RandomSource rand) {
		return isDarkEnough(worldIn, pos) && worldIn.getDifficulty() != Difficulty.PEACEFUL && Mob.checkMobSpawnRules(zombieType, worldIn, reason, pos, rand);
	}

	private static boolean isDarkEnough(ServerLevelAccessor worldIn, BlockPos pos) {
		return worldIn.getBrightness(LightLayer.BLOCK, pos) < 7;
	}

}
