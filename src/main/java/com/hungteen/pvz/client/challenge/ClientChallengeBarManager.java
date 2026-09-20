package com.hungteen.pvz.client.challenge;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@OnlyIn(Dist.CLIENT)
public class ClientChallengeBarManager {

	private static final Map<Integer, BarData> BARS = new HashMap<>();

	public static void update(int challengeId, UUID challengeBarId, ResourceLocation resource, int totalWaves, int currentWave, BitSet bigWaves) {
		BARS.put(challengeId, new BarData(challengeBarId, resource, totalWaves, currentWave, (BitSet) bigWaves.clone()));
	}

	@Nullable
	public static BarData getByBarUuid(UUID challengeBarId) {
		for (BarData data : BARS.values()) {
			if (data.barUuid.equals(challengeBarId)) {
				return data;
			}
		}
		return null;
	}

	public static void remove(int challengeId) {
		BARS.remove(challengeId);
	}

	public static class BarData {

		private final UUID barUuid;
		private final ResourceLocation resource;
		private final int totalWaves;
		private final int currentWave;
		private final BitSet bigWaves;

		public BarData(UUID barUuid, ResourceLocation resource, int totalWaves, int currentWave, BitSet bigWaves) {
			this.barUuid = barUuid;
			this.resource = resource;
			this.totalWaves = totalWaves;
			this.currentWave = currentWave;
			this.bigWaves = bigWaves;
		}

		public ResourceLocation getResource() {
			return this.resource;
		}

		public int getTotalWaves() {
			return this.totalWaves;
		}

		public int getCurrentWave() {
			return this.currentWave;
		}

		public boolean isBigWave(int wave) {
			return this.bigWaves.get(wave);
		}
	}
}
