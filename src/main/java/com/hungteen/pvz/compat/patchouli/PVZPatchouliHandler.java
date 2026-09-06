package com.hungteen.pvz.compat.patchouli;

import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import vazkii.patchouli.api.PatchouliAPI;

public class PVZPatchouliHandler {

	public static final String PATCHOULI = "patchouli";
	public static final ResourceLocation GUIDE_BOOK = new ResourceLocation(PATCHOULI, "guide_book");
	public static final ResourceLocation PVZ_GUIDE = StringUtil.prefix("pvz_guide");

	public static void giveInitialGuideBook(Player player) {
		if (isPatchouliLoaded()) {
			ItemStack book = getPatchouliGuide();
			if (!book.isEmpty()) {
				player.getInventory().add(book);
			}
		}
	}

	public static ItemStack getPatchouliGuide() {
		if (isPatchouliLoaded() && ForgeRegistries.ITEMS.containsKey(GUIDE_BOOK)) {
			return getPatchouliAPI().getBookStack(PVZ_GUIDE);
		}
		return ItemStack.EMPTY;
	}

	public static PatchouliAPI.IPatchouliAPI getPatchouliAPI() {
		return PatchouliAPI.get();
	}

	public static ResourceLocation prefix(String res) {
		return new ResourceLocation(PATCHOULI, res);
	}

	public static boolean isPatchouliLoaded() {
		return ModList.get().isLoaded(PATCHOULI);
	}
}