package com.hungteen.pvz.common.world.invasion;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.utils.ConfigUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.storage.DimensionDataStorage;

public class PVZInvasionData extends SavedData {

	private static final String DATA_NAME = "InvasionEventData";
	private boolean changed = false;
	private int countDownDay = PVZConfig.COMMON_CONFIG.InvasionSettings.InvasionIntervalLength.get();

	public PVZInvasionData() {
	}

	public void setChanged(boolean is) {
		this.changed = is;
		this.setDirty();
	}

	public boolean hasChanged() {
		return this.changed;
	}

	public void setCountDownDay(int day) {
		this.countDownDay = day;
		this.setDirty();
	}

	public void decCountDownDay() {
		if (this.countDownDay <= 0) {
			this.countDownDay = PVZConfig.COMMON_CONFIG.InvasionSettings.InvasionIntervalLength.get();
		} else {
			--this.countDownDay;
		}
		this.setDirty();
	}

	public int getCountDownDay() {
		return this.countDownDay;
	}

	public int getCountDownDay(Player player) {
		return ConfigUtil.scatteredInvasions() ? (int) (player.getUUID().getMostSignificantBits() + countDownDay) % PVZConfig.COMMON_CONFIG.InvasionSettings.InvasionIntervalLength.get() : getCountDownDay();
	}

	public boolean hasCountDownDay() {
		return this.getCountDownDay() <= 0;
	}

	public boolean hasCountDownDay(Player player) {
		return ConfigUtil.scatteredInvasions() ? (player.getUUID().getMostSignificantBits() + countDownDay) % PVZConfig.COMMON_CONFIG.InvasionSettings.InvasionIntervalLength.get() <= 0 : hasCountDownDay();
	}

	public void load(CompoundTag nbt) {
		this.changed = nbt.getBoolean("changed");
		this.countDownDay = nbt.getInt("count_down_day");
	}

	@Override
	public CompoundTag save(CompoundTag nbt) {
		nbt.putBoolean("changed", this.changed);
		nbt.putInt("count_down_day", this.countDownDay);
		return nbt;
	}

	private static PVZInvasionData deserialize(CompoundTag tag) {
		PVZInvasionData data = new PVZInvasionData();
		data.load(tag);
		return data;
	}

	public static PVZInvasionData getOverWorldInvasionData(Level worldIn) {
		if (!(worldIn instanceof ServerLevel serverLevel)) {
			throw new RuntimeException("Attempted to get the data from a client world. This is wrong.");
		}
		ServerLevel overworld = serverLevel.getServer().getLevel(Level.OVERWORLD);

		if (overworld == null) {
			throw new IllegalStateException("Cannot access Overworld data: Overworld dimension is null.");
		}
		DimensionDataStorage storage = overworld.getDataStorage();
		return storage.computeIfAbsent(PVZInvasionData::deserialize, PVZInvasionData::new, DATA_NAME);
	}

}
