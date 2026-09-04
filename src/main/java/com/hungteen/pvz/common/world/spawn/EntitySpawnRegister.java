package com.hungteen.pvz.common.world.spawn;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.drop.SunEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.world.biome.BiomeRegister;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.utils.BiomeUtil;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntitySpawnRegister {

	@SubscribeEvent
	public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
		registerSpawnPlacements();
	}

	private static void registerSpawnPlacements() {
		SpawnPlacements.register(EntityRegister.SUN.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(EntityType<SunEntity> type, ServerLevelAccessor world, MobSpawnType spawnType, BlockPos pos, RandomSource random) ->
						world.canSeeSky(pos) && world.canSeeSky(pos.offset(0, -5, 0)) && SunEntity.canSunSpawn(type, world, spawnType, pos, random));

		SpawnPlacements.register(EntityRegister.CRAZY_DAVE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

		SpawnPlacements.register(EntityRegister.NORMAL_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.FLAG_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.CONEHEAD_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.POLE_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.BUCKETHEAD_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);

		SpawnPlacements.register(EntityRegister.TOMB_STONE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.GIGA_TOMB_STONE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canTombStoneSpawn);
		SpawnPlacements.register(EntityRegister.NEWSPAPER_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.SCREENDOOR_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.FOOTBALL_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.GIGA_FOOTBALL_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.DANCING_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.BACKUP_DANCER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.OLD_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.SUNDAY_EDITION_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);

		SpawnPlacements.register(EntityRegister.SNORKEL_ZOMBIE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.ZOMBONI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.BOBSLE_TEAM.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(type, world, spawnType, pos, rand) -> {
					if (onSnow(world, pos)) {
						return SpawnChecker.canZombieSpawn(type, world, spawnType, pos, rand);
					}
					return false;
				});
		SpawnPlacements.register(EntityRegister.DOLPHIN_RIDER.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.LAVA_ZOMBIE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canLavaZombieSpawn);

		SpawnPlacements.register(EntityRegister.PUMPKIN_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.TRICK_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);

		SpawnPlacements.register(EntityRegister.JACK_IN_BOX_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.BALLOON_ZOMBIE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(type, world, spawnType, pos, rand) ->
						world.canSeeSky(pos) && world.canSeeSky(pos.offset(0, -5, 0)) && SpawnChecker.canZombieSpawn(type, world, spawnType, pos, rand));
		SpawnPlacements.register(EntityRegister.DIGGER_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.POGO_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.YETI_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canYetiSpawn);

		SpawnPlacements.register(EntityRegister.BUNGEE_ZOMBIE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(type, world, spawnType, pos, rand) ->
						world.canSeeSky(pos) && world.canSeeSky(pos.offset(0, -5, 0)) && SpawnChecker.canZombieSpawn((EntityType) type, world, spawnType, pos, rand));
		SpawnPlacements.register(EntityRegister.LADDER_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.CATAPULT_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.GARGANTUAR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.GIGA_GARGANTUAR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);

		SpawnPlacements.register(EntityRegister.PEASHOOTER_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.WALLNUT_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.GATLINGPEA_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.TALLNUT_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.SQUASH_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
		SpawnPlacements.register(EntityRegister.JALAPENO_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, SpawnChecker::canZombieSpawn);
	}

	private static boolean onSnow(LevelAccessor world, BlockPos pos) {
		return world.getBlockState(pos).getBlock() == Blocks.SNOW || world.getBlockState(pos.below()).getBlock() == Blocks.SNOW_BLOCK;
	}

}
