package com.hungteen.pvz.common.impl.challenge;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.hungteen.pvz.api.raid.IPlacementComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.TagParser;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ForgeRegistries;

public class SpawnComponent implements ISpawnComponent {

	public static final String NAME = "default";
	private static final int DEFAULT_THREAT = 1;
	private static final int DEFAULT_WEIGHT = 1000;
	private EntityType<?> entityType;
	private CompoundTag nbt = new CompoundTag();
	private IPlacementComponent placement;
	private int threat = DEFAULT_THREAT;
	private int weight = DEFAULT_WEIGHT;
	private float startFrom = 0.0F;
	private boolean elite = false;
	private boolean flag = false;

	@Override
	public boolean readJson(JsonObject json) {

		/* entity type */
		final String entityTypeStr = GsonHelper.getAsString(json, "entity_type", "");
		final ResourceLocation entityId = new ResourceLocation(entityTypeStr);
		this.entityType = ForgeRegistries.ENTITY_TYPES.getValue(entityId);
		if(this.entityType == null) {
			throw new JsonSyntaxException("entity type cannot be empty or wrong format");
		}

		/* threat cost & pick weight */
		this.threat = Math.max(DEFAULT_THREAT, GsonHelper.getAsInt(json, "threat", DEFAULT_THREAT));
		this.weight = Math.max(0, GsonHelper.getAsInt(json, "weight", DEFAULT_WEIGHT));
		this.startFrom = Mth.clamp(GsonHelper.getAsFloat(json, "start_from", 0.0F), 0.0F, 1.0F);
		this.elite = GsonHelper.getAsBoolean(json, "is_elite", false);
		this.flag = GsonHelper.getAsBoolean(json, "is_flag", false);

	    /* spawn placement */
		this.placement = ChallengeManager.readPlacement(json, false);

		/* nbt */
		if(json.has("nbt")) {
			try {
			    nbt = TagParser.parseTag(GsonHelper.convertToString(json.get("nbt"), "nbt"));
		    } catch (CommandSyntaxException e) {
			    throw new JsonSyntaxException("Invalid nbt tag: " + e.getMessage());
		    }
		}

		return true;
	}

	@Override
	public int getThreat() {
		return this.threat;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public float getStartFrom() {
		return this.startFrom;
	}

	@Override
	public boolean isElite() {
		return this.elite;
	}

	@Override
	public boolean isFlag() {
		return this.flag;
	}

	@Override
	public IPlacementComponent getPlacement() {
		return this.placement;
	}

	@Override
	public CompoundTag getNBT() {
		return this.nbt;
	}

	@Override
	public EntityType<?> getSpawnType() {
		return this.entityType;
	}

}