package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.client.gui.widget.DisplayField;
import com.hungteen.pvz.common.blockentity.CardFusionTileEntity;
import com.hungteen.pvz.common.container.CardFusionContainer;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import java.util.Arrays;

public class CardFusionScreen extends PVZContainerScreen<CardFusionContainer> {

	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/card_fusion.png");
	
	public CardFusionScreen(CardFusionContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 178;
		this.imageHeight = 166;
		this.tips.add(new DisplayField.TipField(3, 3, Arrays.asList(
			    Component.translatable("gui.pvz.card_fusion_table.tip1"),
				Component.translatable("gui.pvz.card_fusion_table.tip2"),
				Component.translatable("gui.pvz.card_fusion_table.tip3")
		)));
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		this.renderTooltip(stack, mouseX, mouseY);
		StringUtil.drawScaledString(stack, font, this.title.getString(), this.leftPos + 17, this.topPos + 6, 4210752, 1F);
		final float percent2 = this.menu.te.array.get(0) * 100.0F / CardFusionTileEntity.CRAFT_ESSENCE_COST;
		StringUtil.drawCenteredScaledString(stack, font, String.format("%.0f%%", percent2), this.leftPos + 25, this.topPos + 34, Colors.BLACK, 0.8F);
		StringUtil.drawCenteredScaledString(stack, font, String.format("%.0f%%", percent2), this.leftPos + 24, this.topPos + 33, Colors.WHITE, 0.8F);
	}
	
	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);

		final int maxLen = 34;
		final int len2 = MathUtil.getBarLen(this.menu.te.array.get(0), CardFusionTileEntity.CRAFT_ESSENCE_COST, maxLen);
		blit(stack, this.leftPos + 18, this.topPos + 51 - len2, 178, 51 - len2, 16, len2);

		stack.popPose();

		super.renderBg(stack, partialTicks, mouseX, mouseY);
	}

}
