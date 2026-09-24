package com.hungteen.pvz.client.challenge;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.challenge.ClientChallengeBarManager.BarData;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.BossEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, value = Dist.CLIENT)
public class ChallengeBarOverlay {

	private static final ResourceLocation CHALLENGE = new ResourceLocation(PVZMod.MOD_ID, "textures/gui/overlay/challenge.png");
	private static final int TEX_SIZE = 256;
	private static final List<BarSnapshot> SNAPSHOTS = new ArrayList<>();

	@SubscribeEvent
	public static void onCustomizeBossBar(CustomizeGuiOverlayEvent.BossEventProgress event) {
		//血条名称参数经网络 JSON 序列化后会丢失 Number 类型，只能按 bar UUID 匹配（服务端 ChallengeBarPacket 已同步该 UUID）
		final BarData data = ClientChallengeBarManager.getByBarUuid(event.getBossEvent().getId());
		if(data != null) {
			SNAPSHOTS.add(new BarSnapshot(data, event.getX(), event.getY(), event.getBossEvent()));
			event.setCanceled(true);
		}
	}

	/**
	 * registered onto the mod bus in ClientProxy, aligned with htpvz2 PVZOverlayHandler.registerOverlay.
	 */
	public static void registerOverlay(RegisterGuiOverlaysEvent event) {
		event.registerAbove(VanillaGuiOverlay.BOSS_EVENT_PROGRESS.id(), "challenge_bar", ChallengeBarOverlay::renderFromSnapshots);
	}

	private static void renderFromSnapshots(ForgeGui gui, PoseStack stack, float partialTick, int width, int height) {
		if(SNAPSHOTS.isEmpty()) {
			return;
		}
		RenderSystem.enableBlend();
		RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderTexture(0, CHALLENGE);
		for(BarSnapshot snapshot : SNAPSHOTS) {
			renderBar(stack, width, snapshot, snapshot.data);
		}
		RenderSystem.disableBlend();
		SNAPSHOTS.clear();
	}

	private static void renderBar(PoseStack stack, int screenWidth, BarSnapshot snapshot, BarData data) {
		final int x = snapshot.x;
		final int y = snapshot.y;
		final float progress = snapshot.event.getProgress();
		blit(stack, x - 2, y + 2, 0, 0, 186, 9);
		blit(stack, x, y + 4, 0, 9, (int) (182 * progress), 5);
		if(! data.isBossChallenge()) {
			for(int i = 0; i < data.getTotalWaves(); ++ i) {
				if(data.isBigWave(i)) {
					final boolean reached = data.getCurrentWave() >= i;
					blit(stack, (int) (x + 170 * ((float) (i + 1) / data.getTotalWaves())), reached ? y - 2 : y + 1, 0, data.isGivenUp(i) ? 25 : 14, 11, reached ? 11 : 8);
				}
			}
		}
		final Component name = snapshot.event.getName();
		final int nameWidth = Minecraft.getInstance().font.width(name);
		Minecraft.getInstance().font.drawShadow(stack, name, (float) (screenWidth / 2 - nameWidth / 2), (float) (y - 9), 0xFFFFFF);
	}

	private static void blit(PoseStack stack, int x, int y, int u, int v, int width, int height) {
		GuiComponent.blit(stack, x, y, 0, (float) u, (float) v, width, height, TEX_SIZE, TEX_SIZE);
	}

	private record BarSnapshot(BarData data, int x, int y, BossEvent event) {
	}
}
