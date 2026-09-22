package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.drop.FallenStar;
import com.hungteen.pvz.common.entity.misc.drop.SunEntity;
import com.hungteen.pvz.common.world.challenge.Challenge;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.hungteen.pvz.common.world.invasion.InvasionManager;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid=PVZMod.MOD_ID)
public class PVZWorldEvents {

	private static final int SUN_FALL_INTERVAL = 2000;//hardcoded, TODO: configurable like HTPVZ2 naturallySpawnSunInterval
	private static final int STAR_FALL_INTERVAL = 40000;//hardcoded, TODO: configurable like HTPVZ2 naturallySpawnFallenStarInterval
	//pvz2D ticks at 100Hz, so 1 MC tick = 5cs; the 9 columns of the 3*3 sampling stack the per-column hit rate 9 times
	private static final int CHALLENGE_SUN_INTERVAL = (425 / 5) * 9;//pvz2D SUN_COUNTDOWN
	private static final int CHALLENGE_SEED_RAIN_INTERVAL = (500 / 5) * 9;//pvz2D RandRangeInt(500, 999) lower bound
	private static final int CHALLENGE_SUN_AMOUNT = 50;

	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent ev) {
		if (ev.phase != TickEvent.Phase.END || ev.level.isClientSide) {
			return;
		}
		ChallengeManager.tickChallenges(ev.level);
		if(ev.level.dimension() == Level.OVERWORLD && ev.level instanceof ServerLevel level) {
			InvasionManager.tick(ev);
			final long time = level.getGameTime();
			final boolean isRaining = level.isRaining();
			final boolean isNight = level.isNight();
			final int skyDarken = level.getSkyDarken();
			final Random random = new Random();

			for (ServerPlayer player : level.players()) {
				ChunkPos pPos = player.chunkPosition();
				random.setSeed(time + pPos.x * 14L + pPos.z * 37L);
				final Challenge challenge = ChallengeManager.getPlayerChallenge(player);
				final boolean isChallenge = challenge != null && (challenge.isPreparing() || challenge.isRunning()) ;

				for (int i = 0; i < 9; i ++) {
					ChunkPos cPos = new ChunkPos(pPos.x - 1 + i % 3, pPos.z - 1 + i / 3);
					int x = cPos.x * 16 + random.nextInt(16);
					int z = cPos.z * 16 + random.nextInt(16);

					BlockPos pos = new BlockPos(x, level.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, x, z) + 10, z);
					int light = level.getBrightness(LightLayer.SKY, pos) - skyDarken;

					if(isNight) {
						if(isRaining){
							if(isChallenge && challenge.hasSeedRain() && random.nextInt(CHALLENGE_SEED_RAIN_INTERVAL) == (int) (time % CHALLENGE_SEED_RAIN_INTERVAL)) {
								challenge.spawnSeedPacket(pos);
							}
						}
						else if(random.nextInt(STAR_FALL_INTERVAL) == (int) (time % STAR_FALL_INTERVAL)) {
							BlockPos starPos = pos.above(20);
							FallenStar.spawnAt(level, starPos);
						}
					}else if(light > 9 && !isRaining) {
						if (isChallenge && random.nextInt(CHALLENGE_SUN_INTERVAL) == (int) (time % CHALLENGE_SUN_INTERVAL)) {
							SunEntity.dropSunRandomly(level, pos, CHALLENGE_SUN_AMOUNT, 0.3D);
						} else if (random.nextInt(SUN_FALL_INTERVAL) == (int) (time % SUN_FALL_INTERVAL)) {
							SunEntity.dropSunRandomly(level, pos, light > 12 ? 50 : 25, 0.3F);
						}
					}
				}
			}
		}
	}
	
}