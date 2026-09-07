package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.client.gui.GuiHandler;
import com.hungteen.pvz.client.gui.widget.DisplayField;
import com.hungteen.pvz.common.blockentity.SlotMachineTileEntity;
import com.hungteen.pvz.common.container.SlotMachineContainer;
import com.hungteen.pvz.common.network.PVZPacketHandler;
import com.hungteen.pvz.common.network.toserver.ClickButtonPacket;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.hungteen.pvz.utils.enums.Resources;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.Arrays;

@OnlyIn(Dist.CLIENT)
public class SlotMachineScreen extends PVZContainerScreen<SlotMachineContainer> {

	private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/slot_machine.png");
	protected Button slowLotteryButton;
	protected Button fastLotteryButton;
	
	public SlotMachineScreen(SlotMachineContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 176;
		this.imageHeight = 227;
		this.tips.add(new DisplayField.TipField(4, 4, new ArrayList<>()));
	}
	
	@Override
	protected void init() {
		super.init();
		this.slowLotteryButton = this.addRenderableWidget(new Button(this.leftPos + 13, this.topPos + 119, 62, 20, Component.translatable("gui.pvz.slot_machine.slow"), (button) -> {
			if(this.slowLotteryButton.visible) {
			    PVZPacketHandler.CHANNEL.sendToServer(new ClickButtonPacket(GuiHandler.SLOT_MACHINE, 0, 0));
			}
		}));
		this.slowLotteryButton.visible = false;

		this.fastLotteryButton = this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 119, 62, 20, Component.translatable("gui.pvz.slot_machine.fast"), (button) -> {
			if(this.fastLotteryButton.visible) {
				PVZPacketHandler.CHANNEL.sendToServer(new ClickButtonPacket(GuiHandler.SLOT_MACHINE, 1, 0));
			}
		}));
		this.fastLotteryButton.visible = false;
	}

	@Override
	public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
		super.render(stack, mouseX, mouseY, partialTicks);

		final boolean canLottery = this.canLottery();
		this.slowLotteryButton.visible = canLottery;
		this.fastLotteryButton.visible = canLottery;

		this.tips.forEach(e -> {
			if(e instanceof DisplayField.TipField){
				((DisplayField.TipField) e).setTips(Arrays.asList(
						Component.translatable("gui.pvz.slot_machine.tip1"),
						Component.translatable("gui.pvz.slot_machine.tip2", PlayerUtil.getResource(this.minecraft.player, Resources.SUN_NUM), this.menu.te.getSunCost()),
						Component.translatable("gui.pvz.slot_machine.tip3", PlayerUtil.getResource(this.minecraft.player, Resources.LOTTERY_CHANCE))
				));
			}
		});

		this.renderSlotMachine(stack);

		this.renderTooltip(stack, mouseX, mouseY);
    }
	
	@Override
	protected void renderLabels(PoseStack p_230451_1_, int p_230451_2_, int p_230451_3_) {
	}
	
	@SuppressWarnings("deprecation")
	private void renderSlotMachine(PoseStack stack) {
		final int currentPos = this.menu.te.array.get(13);
		final int changeTick = this.menu.te.array.get(12);
		final int changeCd = this.menu.te.array.get(15);
		final int offset = changeCd > 0 ? (changeCd - changeTick) * 18 / changeCd : 0;
		stack.pushPose();
		enableScissor(this.leftPos + 62, this.topPos + 22, this.leftPos + 114, this.topPos + 74);
		
		for(int i = 0; i < 4; ++ i) {
			final int row = (currentPos + i - 2 + 4) % 4;
			for(int j = 0; j < 3; ++ j) {
				final SlotMachineTileEntity.SlotType type = this.menu.te.getLotteryType().getSlotType(this.menu.te.array.get(3 * row + j));
				final int x = this.leftPos + 62 + 18 * j;
				final int y = this.topPos + 58 - 18 * i + offset;

				stack.pushPose();
				switch (type.getSlotTypes()){
					case ITEM:{
						type.getStack().ifPresent(itemStack -> {
							this.itemRenderer.blitOffset -= 100;
							this.itemRenderer.renderAndDecorateItem(itemStack, x, y);
							this.itemRenderer.blitOffset += 100;
						});
						break;
					}
					case SUN:{
						RenderSystem.enableBlend();
						RenderSystem.setShaderTexture(0, TEXTURE);
						blit(stack, x, y, 176, 16, 16, 16);
						break;
					}
					case JEWEL:{
						RenderSystem.setShaderTexture(0, TEXTURE);
						blit(stack, x, y, 176, 0, 16, 16);
						break;
					}
//					case :{
//						RenderSystem.enableBlend();
//						this.minecraft.getTextureManager().bindForSetup(TEXTURE);
//						blit(stack, x, y, 176, 32, 16, 16);
//					}
					case EVENT:{
						RenderSystem.enableBlend();
						RenderSystem.setShaderTexture(0, TEXTURE);
						blit(stack, x, y, 176, 48, 16, 16);
					}
				default:
					break;
				}
				stack.popPose();
			}
		}
		disableScissor();
		stack.popPose();

		stack.pushPose();
		stack.translate(0, 0, 120);
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos + 61, this.topPos + 74, 61, 74, 54, 21);
		blit(stack, this.leftPos + 61, this.topPos + 1, 61, 1, 54, 21);
		
		stack.translate(0, 0, 200);
		StringUtil.drawCenteredScaledString(stack, font, this.title.getString(), this.leftPos + this.imageWidth / 2, this.topPos + 6, Colors.BLACK, 1.2F);
		stack.popPose();
	}
	
	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		stack.pushPose();
		RenderSystem.setShaderTexture(0, TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
		stack.popPose();
		
		super.renderBg(stack, partialTicks, mouseX, mouseY);
	}

	private boolean canLottery() {
		return this.menu.te.array.get(14) == 1;
	}

}