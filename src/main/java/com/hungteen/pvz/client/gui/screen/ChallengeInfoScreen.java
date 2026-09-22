package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.api.raid.IWaveComponent;
import com.hungteen.pvz.client.gui.search.SearchOption;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class ChallengeInfoScreen extends Screen{

	public static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/almanac.png");
	private static final int MAX_ENTRY_COUNT = 14;
	private final List<MutableComponent> entries = new ArrayList<>();
	private final IChallengeComponent challengeComponent;
	private final int xSize = 150;
	private final int ySize = 200;
	private int currentPos = 0;

	public ChallengeInfoScreen(IChallengeComponent challengeComponent) {
		super(StringUtil.EMPTY);
		this.challengeComponent = challengeComponent;
		this.initEntries(challengeComponent);
	}

	private void initEntries(IChallengeComponent challengeComponent){
		for(int i = 0; i < challengeComponent.getTotalWaveCount(); ++ i){
			final IWaveComponent waveComponent = challengeComponent.getWaves().get(i);
			MutableComponent waveTitle = Component.translatable("gui.pvz.challenge_info.wave", i + 1, waveComponent.getThreat());
			if(waveComponent.isBigWave()) {
				waveTitle = Component.literal("★ ").append(waveTitle);
			}
			this.entries.add(waveTitle.withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.RED));
			challengeComponent.getSpawns(i).forEach(spawn -> {
				this.entries.add(Component.translatable("gui.pvz.challenge_info.spawn", spawn.getThreat(), spawn.getWeight(), spawn.getSpawnType().getDescription().getString()));
			});
		}
	}

	@Override
	public boolean mouseScrolled(double p_mouseScrolled_1_, double p_mouseScrolled_3_, double p_mouseScrolled_5_) {
		if (this.entries.size() > MAX_ENTRY_COUNT) {
			final int next = (int) ((double) this.currentPos - p_mouseScrolled_5_);
			this.currentPos = Mth.clamp(next, 0, this.entries.size() - MAX_ENTRY_COUNT);
		}
		return true;
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);
		int cornerX = (this.width - this.xSize) / 2;
		int cornerY = (this.height - this.ySize) / 2;

		{
			RenderSystem.setShaderTexture(0, TEXTURE);
			blit(stack, cornerX, cornerY, 0, 0, this.xSize, this.ySize);
			if(this.entries.size() <= MAX_ENTRY_COUNT) {
				blit(stack, cornerX + 130, cornerY + 49, 162, 0, 12, 15);
			} else {
				final int len = MathUtil.getBarLen(this.currentPos, this.entries.size() - MAX_ENTRY_COUNT, 143 - 15);
				blit(stack, cornerX + 130, cornerY + 49 + len, 150, 0, 12, 15);
			}
		}

		{
			stack.pushPose();
			int dx = cornerX + 49 + 94 / 2, dy = cornerY + 9;
			StringUtil.drawCenteredScaledString(stack, this.font, this.challengeComponent.getChallengeName().getString(), dx, dy, Colors.WHITE, 1f);
			stack.popPose();
		}

		{
			int dx = cornerX + 9, dy = cornerY + 9;
			int scale = 2;
			stack.pushPose();
			stack.scale((float) scale, (float) scale, (float) scale);
			stack.translate((double)(dx % scale) / scale , (double)(dy % scale) / scale, 0);
			this.itemRenderer.renderGuiItem(new ItemStack(ItemRegister.CHALLENGE_ENVELOPE.get()), dx / scale, dy / scale);
			stack.popPose();
		}

		{
			for(int i = 0; i < Math.min(this.entries.size(), MAX_ENTRY_COUNT); ++ i){
				this.currentPos = Mth.clamp(this.currentPos, 0, this.entries.size() - 1);
				final String text = this.entries.get(this.currentPos + i).getString();
				final int incHeight = 10;
				final int posX = cornerX + 8 + 2;
				final int posY = cornerY + 49 + 5;
				StringUtil.drawScaledString(stack, font, text, posX, posY + incHeight * i, Colors.WHITE, 0.5f);
			}
		}
	}

	protected void renderBar(PoseStack stack, SearchOption a) {
		//Do not change the position values, if changed pls modify with the below method.
	}

	protected void renderTooltip(PoseStack stack, int mouseX, int mouseY) {
	}
	
}