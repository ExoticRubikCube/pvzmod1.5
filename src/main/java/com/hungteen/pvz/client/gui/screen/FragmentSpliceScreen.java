package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.client.gui.GuiHandler;
import com.hungteen.pvz.client.gui.widget.DisplayField;
import com.hungteen.pvz.common.container.FragmentSpliceContainer;
import com.hungteen.pvz.common.network.PVZPacketHandler;
import com.hungteen.pvz.common.network.toserver.ClickButtonPacket;
import com.hungteen.pvz.common.tileentity.FragmentSpliceTileEntity;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;

@OnlyIn(Dist.CLIENT)
public class FragmentSpliceScreen extends PVZContainerScreen<FragmentSpliceContainer> {

	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/fragment_splice.png");
	protected Button craftButton;
	
	public FragmentSpliceScreen(FragmentSpliceContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 210;
		this.imageHeight = 225;
		this.tips.add(new DisplayField.TipField(3, 3, Arrays.asList(
				Component.translatable("gui.pvz.fragment_splice.tip1"),
				Component.translatable("gui.pvz.fragment_splice.tip2"),
				Component.translatable("gui.pvz.fragment_splice.tip3"),
				Component.translatable("gui.pvz.fragment_splice.tip4")
		)));
	}

	@Override
	protected void init() {
		super.init();
		this.craftButton = this.addRenderableWidget(new Button(this.leftPos + 92, this.topPos + 122, 26, 14, Component.translatable("gui.pvz.fragment_splice"), (button) -> {
			if(this.craftButton.visible) {
			    PVZPacketHandler.CHANNEL.sendToServer(new ClickButtonPacket(GuiHandler.FRAGMENT_SPLICE, 0, 0));
			}
		}));
		this.craftButton.visible = false;
	}
	
	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		this.craftButton.visible = this.canCraftNow();
		super.render(stack, mouseX, mouseY, partialTicks);
		StringUtil.drawCenteredScaledString(stack, font, Component.translatable("block.pvz.fragment_splice").getString(), this.leftPos + this.imageWidth / 2, this.topPos + 8, Colors.BLACK, 1F);
		StringUtil.drawCenteredScaledString(stack, font, "" + this.menu.te.array.get(0), this.leftPos + 15, this.topPos + 67, Colors.BLACK, 0.5F);
		this.renderTooltip(stack, mouseX, mouseY);
    }
	
	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
		this.minecraft.getTextureManager().bindForSetup(TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);

		final int maxLen = 88;
		final int len = MathUtil.getBarLen(this.menu.te.array.get(0), FragmentSpliceTileEntity.CRAFT_COST, maxLen);
		blit(stack, this.leftPos + 7, this.topPos + 113 - len + 1, 210, 0, 16, len);
		stack.popPose();

		super.renderBg(stack, partialTicks, mouseX, mouseY);
	}

	protected boolean canCraftNow() {
		return this.menu.canCraft();
	}

}