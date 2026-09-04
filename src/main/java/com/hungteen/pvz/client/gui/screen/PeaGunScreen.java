package com.hungteen.pvz.client.gui.screen;

import java.util.Arrays;

import com.hungteen.pvz.client.gui.widget.DisplayField.TipField;
import com.hungteen.pvz.common.container.PeaGunContainer;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PeaGunScreen extends PVZContainerScreen<PeaGunContainer>{
	
	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/pea_gun.png");
	
	public PeaGunScreen(PeaGunContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 176;
		this.imageHeight = 187;
		this.tips.add(new TipField(2, 2, Arrays.asList(
			Component.translatable("gui.pvz.pea_gun.tip1"),
			Component.translatable("gui.pvz.pea_gun.tip2")
		)));
	}

	@Override
	protected void renderLabels(PoseStack p_230451_1_, int p_230451_2_, int p_230451_3_) {
	}
	
	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
        this.minecraft.getTextureManager().bindForSetup(TEXTURE);
        blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
        stack.popPose();
        
        super.renderBg(stack, partialTicks, mouseX, mouseY);
	}
	
	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		renderTooltip(stack, mouseX, mouseY);
	}

}