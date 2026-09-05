package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.common.container.ImitaterContainer;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ImitaterScreen extends AbstractContainerScreen<ImitaterContainer>{
	
	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/imitate.png");
	
	public ImitaterScreen(ImitaterContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 176;
		this.imageHeight = 133;
	}

	@Override
	protected void renderLabels(PoseStack p_230451_1_, int p_230451_2_, int p_230451_3_) {
	}
	
	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
        if (this.minecraft != null) {
            RenderSystem.setShaderTexture(0, TEXTURE);
        }
        blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
        stack.popPose();
	}
	
	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		renderTooltip(stack, mouseX, mouseY);
	}

}