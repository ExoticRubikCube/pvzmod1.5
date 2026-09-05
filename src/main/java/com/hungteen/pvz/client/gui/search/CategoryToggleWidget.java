package com.hungteen.pvz.client.gui.search;

import com.hungteen.pvz.client.ClientProxy;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CategoryToggleWidget extends AbstractWidget {

	protected SearchCategories category;
	protected ResourceLocation resourceLocation;
	protected boolean isStateTriggered;
	protected int xTexStart;
	protected int yTexStart;
	protected int xDiffTex;
	protected int yDiffTex;

	public CategoryToggleWidget(SearchCategories category) {
		super(0, 0, 35, 26, Component.empty());
		this.category = category;
		initTextureValues(153, 2, 35, 0, OptionSearchGui.TEXTURE);
	}

	protected void initTextureValues(int xTexStartIn, int yTexStartIn, int xDiffTexIn, int yDiffTexIn, ResourceLocation resourceLocationIn) {
		this.xTexStart = xTexStartIn;
		this.yTexStart = yTexStartIn;
		this.xDiffTex = xDiffTexIn;
		this.yDiffTex = yDiffTexIn;
		this.resourceLocation = resourceLocationIn;
	}

	public void setStateTriggered(boolean triggered) {
		this.isStateTriggered = triggered;
	}

	@Override
	public void renderButton(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		stack.pushPose();
		RenderSystem.setShaderTexture(0, this.resourceLocation);
		RenderSystem.disableDepthTest();
		int posX = this.isStateTriggered ? this.x - 2 : this.x;
		int posY = this.y;
		int texX = this.isStateTriggered ? this.xTexStart + this.xDiffTex : this.xTexStart;
		int texY = this.isStateTriggered ? this.yTexStart + this.yDiffTex : this.yTexStart;
		GuiComponent.blit(stack, posX, posY, texX, texY, this.width, this.height, 256, 256);
		RenderSystem.enableDepthTest();
		this.renderCategoryIcon(stack);
		stack.popPose();
	}

	private void renderCategoryIcon(PoseStack stack) {
		final int posX = x + 9 + (this.isStateTriggered ? -2 : 0);
		final int posY = y + 5;
		if(this.category == SearchCategories.ALL){
			ClientProxy.MC.getItemRenderer().renderAndDecorateItem(new ItemStack(Items.COMPASS), posX, posY);
		} else if(this.category == SearchCategories.PLANTS) {
			GuiComponent.blit(stack, posX, posY, 152, 32, 16, 16, 256, 256);
		} else if(this.category == SearchCategories.ZOMBIES){
			GuiComponent.blit(stack, posX, posY, 168, 32, 16, 16, 256, 256);
		}
	}

	@Override
	public void updateNarration(NarrationElementOutput output) {
		this.defaultButtonNarrationText(output);
	}

	public SearchCategories getCategory() {
		return this.category;
	}

	public enum SearchCategories {
		ALL,
		PLANTS,
		ZOMBIES
    }
}