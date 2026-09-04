package com.hungteen.pvz.common.datapack;

import com.google.gson.*;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.world.invasion.InvasionType;
import com.hungteen.pvz.common.world.invasion.SpawnType;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.TagParser;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.GsonHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.ChatFormatting;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public class InvasionTypeLoader extends SimpleJsonResourceReloadListener {

    public static final Map<ResourceLocation, InvasionType> INVASIONS = new HashMap<>();
    private static final Gson GSON = (new GsonBuilder()).create();
    public static final String NAME = "invasion";

    public InvasionTypeLoader() {
        super(GSON, NAME + "s");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> map, ResourceManager manager, ProfilerFiller profiler) {
        INVASIONS.clear();

        map.forEach((res, jsonElement) -> {
            try {
                JsonObject jsonObject = GsonHelper.convertToJsonObject(jsonElement, NAME);

                final boolean isAssist = GsonHelper.getAsBoolean(jsonObject, "isAssistInvasion");
                final InvasionType invasionType = new InvasionType(res, isAssist);

                final int chance = GsonHelper.getAsInt(jsonObject, "triggerChance", 10);
                invasionType.setTriggerChance(chance);

                if(jsonObject.has("bonus")){
                    final ResourceLocation bonus = ResourceLocation.parse(GsonHelper.getAsString(jsonObject, "bonus"));
                    invasionType.setBonusResource(bonus);
                }

                final String color = GsonHelper.getAsString(jsonObject, "display_color", "white");
                invasionType.setDisplayColor(ChatFormatting.valueOf(color.toUpperCase()));

                JsonArray array = GsonHelper.getAsJsonArray(jsonObject, "spawns", new JsonArray());
                array.forEach(e -> {
                    if(e.isJsonObject()) {
                        final JsonObject obj  = e.getAsJsonObject();

                        /* entity type */
                        final EntityType<? extends Mob> entityType = (EntityType<? extends Mob>) ForgeRegistries.ENTITY_TYPES.getValue(ResourceLocation.parse(GsonHelper.getAsString(obj, StringUtil.ENTITY_TYPE, "")));
                        if(entityType == null) {
                            throw new JsonSyntaxException("entity type cannot be empty or wrong format");
                        }
                        final SpawnType spawnType = new SpawnType(entityType);

                        /* nbt */
                        if(obj.has(StringUtil.ENTITY_NBT)) {
                            try {
                                final CompoundTag nbt = TagParser.parseTag(GsonHelper.convertToString(obj.get(StringUtil.ENTITY_NBT), StringUtil.ENTITY_NBT));
                                spawnType.setNbt(nbt);
                            } catch (CommandSyntaxException ee) {
                                throw new JsonSyntaxException("Invalid nbt tag: " + ee.getMessage());
                            }
                        }

                        /* invasion level */
                        final int dif = GsonHelper.getAsInt(obj, "invasion_level", 1);
                        spawnType.setInvasionLevel(dif);

                        /* spawn weight */
                        final int weight = GsonHelper.getAsInt(obj, "spawn_weight", 100);
                        spawnType.setSpawnWeight(weight);

                        final String placeType = GsonHelper.getAsString(obj, "placement", SpawnType.PlaceType.SNOW_AND_LAND.toString().toLowerCase());
                        spawnType.setPlaceType(SpawnType.PlaceType.valueOf(placeType.toUpperCase()));

                        invasionType.addSpawn(spawnType);
                    }
                });

                if(jsonObject.has("invasion_level")){
                    invasionType.setRequireDifficulty(GsonHelper.getAsInt(jsonObject, "invasion_level"));
                }

                INVASIONS.put(res, invasionType);

            } catch (IllegalArgumentException | JsonParseException e) {
                PVZMod.LOGGER.error("Parsing error loading invasion type {}: {}", res, e.getMessage());
            }
        });

        PVZMod.LOGGER.info("Loaded {} custom invasion type", INVASIONS.size());

    }
}