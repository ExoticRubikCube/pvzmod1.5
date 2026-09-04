package com.hungteen.pvz.common.world.challenge;

import com.google.common.collect.Maps;
import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.common.capability.CapabilityHandler;
import com.hungteen.pvz.utils.ConfigUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PVZChallengeData extends SavedData {

	private static final String DATA_NAME = "ChallengeData";
	private final Map<Integer, Challenge> challengeMap = Maps.newHashMap();
	private final ServerLevel world;
	private int currentChallengeId = 1;
	private int tick = 0;

	public PVZChallengeData(ServerLevel world) {
		this.world = world;
	}

	/**
	 * {@link ChallengeManager#tickChallenges(Level)}
	 */
	public void tick() {
        for (Entity entity : world.getAllEntities()) {
            entity.getCapability(CapabilityHandler.RAIDER_DATA_CAPABILITY).ifPresent(x -> {
                if (x.getChallengeID() == 0) {
                    for (Challenge tmp : this.getChallenges()) {
                        if (tmp.raiders.contains(entity)) {
                            x.setChallengeID(tmp.getId());
                        }
                    }
                    if (x.getChallengeID() == 0) {
                        x.setChallengeID(-1);
                    }
                } else if (matchID(x.getChallengeID()) == null) {
                    x.setChallengeID(0);
                } else if (x.getChallengeID() != -1) {
                    matchID(x.getChallengeID()).raiders.add(entity);
                }
            });
        }

        Iterator<Challenge> iterator = this.challengeMap.values().iterator();
		while (iterator.hasNext()) {
			Challenge raid = iterator.next();
			if (!ConfigUtil.isRaidEnable()) {
				raid.remove();
			}
			if (raid.isRemoving()) {
				iterator.remove();
				this.setDirty();
			} else {
				this.world.getProfiler().push("Challenge Tick");
				raid.tick();
				this.world.getProfiler().pop();
			}
		}

		if (++this.tick % 200 == 0) {
			this.setDirty();
		}
	}

	public Optional<Challenge> createChallenge(ServerLevel world, ResourceLocation res, BlockPos pos) {
		final int id = this.getUniqueId();
		IChallengeComponent tmp = ChallengeManager.getChallengeByResource(res);
		if (tmp != null && tmp.isSuitableDimension(world.dimension())) {
			final Challenge challenge = new Challenge(id, world, res, pos);
			this.addChallenge(id, challenge);
			return Optional.ofNullable(challenge);
		}
		return Optional.empty();
	}

	public void addChallenge(int id, Challenge challenge) {
		this.challengeMap.put(id, challenge);
		this.setDirty();
	}

	public int getUniqueId() {
		this.setDirty();
		return this.currentChallengeId++;
	}

	public List<Challenge> getChallenges() {
		return this.challengeMap.values().stream().collect(Collectors.toList());
	}

	public Challenge matchID(int id) {
		for (Challenge challenge : this.getChallenges()) {
			if (challenge.getId() == id) {
				return challenge;
			}
		}
		return null;
	}

	public void load(CompoundTag nbt) {
		if (nbt.contains("current_id")) {
			this.currentChallengeId = nbt.getInt("current_id");
		}
		final ListTag raidList = nbt.getList("challenges", 10);
		for (int i = 0; i < raidList.size(); ++i) {
			final CompoundTag tmp = raidList.getCompound(i);
			final Challenge raid = new Challenge(world, tmp);
			this.challengeMap.put(raid.getId(), raid);
		}
	}

	@Override
	public CompoundTag save(CompoundTag nbt) {
		nbt.putInt("current_id", this.currentChallengeId);

		final ListTag raidList = new ListTag();
		for (Challenge raid : this.challengeMap.values()) {
			final CompoundTag tmp = new CompoundTag();
			raid.save(tmp);
			raidList.add(tmp);
		}
		nbt.put("challenges", raidList);

		return nbt;
	}

	public static PVZChallengeData getInvasionData(Level worldIn) {
		if (!(worldIn instanceof ServerLevel serverLevel)) {
			throw new RuntimeException("Attempted to get the data from a client world. This is wrong.");
		}
		return serverLevel.getDataStorage().computeIfAbsent(
				(CompoundTag tag) -> {
					PVZChallengeData d = new PVZChallengeData(serverLevel);
					d.load(tag);
					return d;
				},
				() -> new PVZChallengeData(serverLevel),
				DATA_NAME);
	}

}