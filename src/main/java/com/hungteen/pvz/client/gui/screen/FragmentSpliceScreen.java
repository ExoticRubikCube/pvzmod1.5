package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.client.gui.widget.DisplayField;
import com.hungteen.pvz.common.container.FragmentSpliceContainer;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;

@OnlyIn(Dist.CLIENT)
public class FragmentSpliceScreen extends PVZContainerScreen<FragmentSpliceContainer> {

	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/fragment_splice.png");

	public FragmentSpliceScreen(FragmentSpliceContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 178;
		this.imageHeight = 199;
		this.tips.add(new DisplayField.TipField(3, 3, Arrays.asList(
				Component.translatable("gui.pvz.fragment_splice.tip1"),
				Component.translatable("gui.pvz.fragment_splice.tip2"),
				Component.translatable("gui.pvz.fragment_splice.tip3"),
				Component.translatable("gui.pvz.fragment_splice.tip4")
		)));
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		StringUtil.drawScaledString(stack, font, this.title.getString(), this.leftPos + 17, this.topPos + 6, 4210752, 1F);
		this.renderTooltip(stack, mouseX, mouseY);
    }

	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
		stack.popPose();

		super.renderBg(stack, partialTicks, mouseX, mouseY);
	}

}
