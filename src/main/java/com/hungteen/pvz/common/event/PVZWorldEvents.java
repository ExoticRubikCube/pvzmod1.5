package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.misc.drop.SunEntity;
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

	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent ev) {
		if (ev.phase != TickEvent.Phase.END || ev.level.isClientSide) {
			return;
		}
		ChallengeManager.tickChallenges(ev.level);
		if(ev.level.dimension() == Level.OVERWORLD) {
			InvasionManager.tick(ev);
			tryNaturallySpawnSun((ServerLevel) ev.level);
		}
	}

	private static void tryNaturallySpawnSun(ServerLevel level) {
		final long time = level.getGameTime();
		for (ServerPlayer player : level.getServer().getPlayerList().getPlayers()) {
			if(player.level != level) {
				continue;
			}
			ChunkPos pPos = player.chunkPosition();
			final Random random = new Random(time + pPos.x * 14L + pPos.z * 37L);
			for (int i = 0; i < 9; i ++) {
				ChunkPos cPos = new ChunkPos(pPos.x - 1 + i % 3, pPos.z - 1 + i / 3);
				int x = cPos.x * 16 + random.nextInt(16);
				int z = cPos.z * 16 + random.nextInt(16);
				BlockPos pos = new BlockPos(x, level.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, x, z) + 10, z);
				int light = level.getBrightness(LightLayer.SKY, pos) - level.getSkyDarken();
				if(light > 9 && random.nextInt(SUN_FALL_INTERVAL) == (int) (time % SUN_FALL_INTERVAL)) {
					SunEntity.dropSunRandomly(level, pos, light > 12 ? 50 : 25, 0.3F);
				}
			}
		}
	}
	
}