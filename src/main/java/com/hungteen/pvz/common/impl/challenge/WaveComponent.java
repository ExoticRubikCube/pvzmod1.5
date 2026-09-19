package com.hungteen.pvz.common.impl.challenge;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.hungteen.pvz.api.raid.IPlacementComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.api.raid.IWaveComponent;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.util.GsonHelper;

import java.util.ArrayList;
import java.util.List;

public class WaveComponent implements IWaveComponent {

	public static final String NAME = "default";
	private static final int DEFAULT_MIN_WAIT = 200;
	private static final int DEFAULT_MAX_WAIT = 800;
	private final List<ISpawnComponent> spawns = new ArrayList<>();
	private IPlacementComponent placement;
	private int preCD;
	private int threat;
	private boolean bigWave;
	private int minimumWaitTime;
	private int maximumWaitTime;

	@Override
	public boolean readJson(JsonObject json) {

		/* prepare tick */
		this.preCD = GsonHelper.getAsInt(json, "pre_tick", 100);

		/* wave threat budget, 0 lets challenge fallback to spawn table sum */
		this.threat = Math.max(0, GsonHelper.getAsInt(json, "threat", 0));
		this.bigWave = GsonHelper.getAsBoolean(json, "is_big_wave", false);
		this.minimumWaitTime = Math.max(0, GsonHelper.getAsInt(json, "minimum_wait_time", DEFAULT_MIN_WAIT));
		this.maximumWaitTime = Math.max(this.minimumWaitTime, GsonHelper.getAsInt(json, "maximum_wait_time", DEFAULT_MAX_WAIT));

		/* spawn placement */
		this.placement = ChallengeManager.readPlacement(json, false);

		/* spawn list */
		JsonArray jsonSpawns = GsonHelper.getAsJsonArray(json, StringUtil.SPAWNS, new JsonArray());
		for(int i = 0; i < jsonSpawns.size(); ++ i) {
			JsonObject obj = jsonSpawns.get(i).getAsJsonObject();
		    if(obj != null) {
		    	String type = GsonHelper.getAsString(obj, "type", "");
	            ISpawnComponent spawn = ChallengeManager.getSpawnComponent(type);
	            if(! spawn.readJson(obj)) {
	            	return false;
	            }
			    this.spawns.add(spawn);
		    }
		}
		if(this.spawns.isEmpty()) {
			throw new JsonSyntaxException("Spawn list cannot be empty");
		}

		return true;
	}

	@Override
	public List<ISpawnComponent> getSpawns(){
		return this.spawns;
	}

	@Override
	public IPlacementComponent getPlacement() {
		return this.placement;
	}

	@Override
	public int getPrepareCD() {
		return this.preCD;
	}

	@Override
	public int getThreat() {
		return this.threat;
	}

	@Override
	public boolean isBigWave() {
		return this.bigWave;
	}

	@Override
	public int getMinimumWaitTime() {
		return this.minimumWaitTime;
	}

	@Override
	public int getMaximumWaitTime() {
		return this.maximumWaitTime;
	}

}
