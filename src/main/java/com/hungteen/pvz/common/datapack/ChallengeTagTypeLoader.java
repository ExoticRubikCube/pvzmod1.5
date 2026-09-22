package com.hungteen.pvz.common.datapack;

import com.google.gson.*;
import com.hungteen.pvz.PVZMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.profiling.ProfilerFiller;

import javax.annotation.Nullable;
import java.util.*;

public class ChallengeTagTypeLoader extends SimpleJsonResourceReloadListener {

	public static final Map<ResourceLocation, List<String>> RAW_TAGS = new HashMap<>();
	private static final Gson GSON = new GsonBuilder().create();
	public static final String NAME = "challenge_tag";
	private static final String TAG_PREFIX = "#";

	public ChallengeTagTypeLoader() {
		super(GSON, NAME + "s");
	}

	@Override
	protected void apply(Map<ResourceLocation, JsonElement> map, ResourceManager manager, ProfilerFiller profiler) {
		RAW_TAGS.clear();
		map.forEach((res, jsonElement) -> {
			final JsonObject jsonObject = GsonHelper.convertToJsonObject(jsonElement, NAME);
			final List<String> entries = new ArrayList<>();
			final JsonArray values = GsonHelper.getAsJsonArray(jsonObject, "values", new JsonArray());
			for(JsonElement element : values) {
				if(element.isJsonPrimitive()) {
					entries.add(element.getAsString());
				}
			}
			RAW_TAGS.put(res, entries);
		});
		PVZMod.LOGGER.info("Loaded {} custom challenge tag", RAW_TAGS.size());
	}

	/**
	 * 解析指定tag为基础tag集合：裸名直接加入，#引用递归展开，visited拦截循环引用。
	 */
	public static Set<String> resolve(ResourceLocation tagId) {
		final Set<String> result = new HashSet<>();
		collect(tagId, result, new HashSet<>());
		return result;
	}

	private static void collect(ResourceLocation tagId, Set<String> result, Set<ResourceLocation> visited) {
		if(visited.add(tagId)) {
			final List<String> entries = RAW_TAGS.get(tagId);
			if(entries != null) {
				for(String entry : entries) {
					if(entry.startsWith(TAG_PREFIX)) {
						collect(new ResourceLocation(entry.substring(TAG_PREFIX.length())), result, visited);
					} else {
						result.add(entry);
					}
				}
			}
		} else {
			PVZMod.LOGGER.warn("Challenge tag cyclic reference at {}", tagId);
		}
	}

	/**
	 * 挑战JSON的单个tag token解析：已定义的challenge_tag递归展开，未定义则视作基础tag原样保留。
	 */
	public static Set<String> resolveToken(String token) {
		final Set<String> result = new HashSet<>();
		if(token.startsWith(TAG_PREFIX)) {
			collect(new ResourceLocation(token.substring(TAG_PREFIX.length())), result, new HashSet<>());
		} else {
			final ResourceLocation tagId = new ResourceLocation(token);
			if(RAW_TAGS.containsKey(tagId)) {
				collect(tagId, result, new HashSet<>());
			} else {
				result.add(token);
			}
		}
		return result;
	}

	@Nullable
	public static List<String> getRawTag(ResourceLocation tagId) {
		return RAW_TAGS.get(tagId);
	}
}
