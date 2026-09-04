package com.hungteen.pvz.common.impl.challenge;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.hungteen.pvz.api.raid.IAmountComponent;
import com.hungteen.pvz.api.raid.IPlacementComponent;
import com.hungteen.pvz.api.raid.ISpawnComponent;
import com.hungteen.pvz.common.impl.challenge.amount.ConstantAmount;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.TagParser;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map.Entry;

public class SpawnComponent implements ISpawnComponent {
	
	public static final String NAME = "default";
	private EntityType<?> entityType;
	private IAmountComponent spawnAmount = new ConstantAmount();
	private CompoundTag nbt = new CompoundTag();
	private IPlacementComponent placement;
	private int spawnTick;
	
	@Override
	public boolean readJson(JsonObject json) {
		
		/* entity type */
		final String entityTypeStr = GsonHelper.getAsString(json, "entity_type", "");
		final ResourceLocation entityId = ResourceLocation.parse(entityTypeStr);
		this.entityType = ForgeRegistries.ENTITY_TYPES.getValue(entityId);
		if(this.entityType == null) {
			throw new JsonSyntaxException("entity type cannot be empty or wrong format");
		}
		
		/* spawn amount */
		JsonObject obj = GsonHelper.getAsJsonObject(json, "spawn_amount");
		if(! obj.entrySet().isEmpty()) {
			for(Entry<String, JsonElement> entry : obj.entrySet()) {
				final IAmountComponent tmp = ChallengeManager.getAmountComponent(entry.getKey());
                tmp.readJson(entry.getValue());
                this.spawnAmount = tmp;
                break;
			}
		}
	    
	    /* spawn placement */
		this.placement = ChallengeManager.readPlacement(json, false);
		
		/* spawn tick */
		this.spawnTick = GsonHelper.getAsInt(json, "spawn_tick", 0);
		
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
	public int getSpawnTick() {
		return this.spawnTick;
	}
	
	@Override
	public int getSpawnAmount() {
		return this.spawnAmount.getSpawnAmount();
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