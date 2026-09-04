package com.hungteen.pvz.client.gui.search;

import com.hungteen.pvz.client.gui.screen.AbstractOptionScreen;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class OptionWidget extends AbstractWidget {

	private final AbstractOptionScreen<?> screen;
	private SearchOption option;

	public OptionWidget(AbstractOptionScreen<?> screen) {
		super(0, 0, 25, 25, StringUtil.EMPTY);
		this.screen = screen;
	}

	public void init(SearchOption a) {
		this.option = a;
	}

	@Override
	public void renderButton(PoseStack stack, int p_renderButton_1_, int p_renderButton_2_, float p_renderButton_3_) {
		stack.pushPose();
		Minecraft minecraft = Minecraft.getInstance();
		minecraft.getTextureManager().bindForSetup(OptionSearchGui.TEXTURE);
		int posX = this.isOptionUnLocked() ? 29 : 29 + 25;
		int posY = 206;
		this.blit(stack, this.x, this.y, posX, posY, this.width, this.height);
		minecraft.getItemRenderer().renderAndDecorateItem(SearchOption.getItemStackByOption(this.option), this.x + 4,
				this.y + 4);
		if(! this.isOptionUnLocked()){
			this.blit(stack, this.x + 8, this.y + 8, 81, 225, 7, 7);
		}
		stack.popPose();
	}
	
	private boolean isOptionUnLocked() {
		return this.screen.isOptionUnLocked(option);
	}

	public List<Component> getToolTipText(Screen screen) {
		List<Component> list = new ArrayList<>();
		list.add(option.getType().getText());
		return list;
	}

	public SearchOption getSearchOption() {
		return this.option;
	}

	@Override
	public void updateNarration(NarrationElementOutput output) {
		this.defaultButtonNarrationText(output);
	}
}