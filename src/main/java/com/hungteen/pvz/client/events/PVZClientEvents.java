package com.hungteen.pvz.client.events;

import com.hungteen.pvz.PVZConfig;
import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.events.handler.PVZEntityRenderHandler;
import com.hungteen.pvz.client.gui.screen.PVZMainMenuScreen;
import com.hungteen.pvz.common.item.spawn.card.SummonCardItem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, value = Dist.CLIENT)
public class PVZClientEvents {
	
	@SubscribeEvent 
	@SuppressWarnings("rawtypes")
	public static void onLivingRender(RenderLivingEvent.Pre ev) {
		final PoseStack stack = ev.getPoseStack();
		final MultiBufferSource buffer = ev.getMultiBufferSource();
		final int light = ev.getPackedLight();
//		ev.getPoseStack().mulPose(Vector3f.ZP.rotationDegrees(180F));
		PVZEntityRenderHandler.checkBungeeHandStand(ev.getEntity(), stack);
		PVZEntityRenderHandler.checkAndRenderFrozenIce(ev.getEntity(), stack, buffer, light);
		PVZEntityRenderHandler.checkAndRenderButter(ev.getRenderer(), ev.getEntity(), stack, buffer, light);
	}
	
	@SubscribeEvent
	public static void addToolTips(ItemTooltipEvent event) {
		SummonCardItem.appendSkillToolTips(event.getItemStack(), event.getToolTip());
	}
	
	@SubscribeEvent
	public static void onGuiOpened(ScreenEvent.Opening event) {
		if(PVZConfig.CLIENT_CONFIG.OtherSettings.ShowPVZMainMenu.get()) {
			if (event.getScreen() instanceof TitleScreen && ! (event.getScreen() instanceof PVZMainMenuScreen)) {
				event.setNewScreen(new PVZMainMenuScreen());
			}
		}
	}
	
}