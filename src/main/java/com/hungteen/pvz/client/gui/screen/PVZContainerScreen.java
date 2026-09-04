package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.client.gui.widget.DisplayField;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public abstract class PVZContainerScreen<T extends AbstractContainerMenu> extends AbstractContainerScreen<T> {

	private static final ResourceLocation WIDGETS = StringUtil.prefix("textures/gui/widgets.png");
	protected final List<DisplayField> tips = new ArrayList<>();

	public PVZContainerScreen(T screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
	}

	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
		this.minecraft.getTextureManager().bindForSetup(WIDGETS);
		this.tips.forEach(tip -> {
			blit(stack, this.leftPos + tip.getX(), this.topPos + tip.getY(), tip.getTexX(), tip.getTexY(), tip.getWidth(), tip.getHeight());
		});
		stack.popPose();
	}
	
	@Override
	protected void renderLabels(PoseStack stack, int mouseX, int mouseY) {
	}

	@Override
	protected void renderTooltip(PoseStack stack, int mouseX, int mouseY) {
		super.renderTooltip(stack, mouseX, mouseY);
		this.tips.forEach(tip -> {
			if (tip.isInField(mouseX - this.leftPos, mouseY - this.topPos)) {
				this.minecraft.screen.renderComponentTooltip(stack, tip.getTexts(), mouseX, mouseY);
			}
		});
	}

}