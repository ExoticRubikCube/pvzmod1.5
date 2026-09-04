package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.api.interfaces.IAlmanacEntry;
import com.hungteen.pvz.api.paz.IPAZEntity;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.client.gui.search.CategoryToggleWidget;
import com.hungteen.pvz.client.gui.search.SearchOption;
import com.hungteen.pvz.common.container.AlmanacContainer;
import com.hungteen.pvz.compat.patchouli.PVZPatchouliHandler;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.hungteen.pvz.utils.enums.Colors;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class AlmanacScreen extends AbstractOptionScreen<AlmanacContainer> {

	public static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/almanac.png");
	private static final int MAX_ENTRY_COUNT = 7;
	private final List<Pair<IAlmanacEntry, Number>> entries = new ArrayList<>();
	private SearchOption option;
	private Mob renderEntity;
	private int currentPos = 0;
	
	public AlmanacScreen(AlmanacContainer screenContainer, Inventory inv, Component titleIn) {
		super(screenContainer, inv, titleIn);
		this.imageWidth = 150;
		this.imageHeight = 200;
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
		this.renderAlmanac(stack, mouseX, mouseY);
		this.renderTooltip(stack, mouseX, mouseY);
	}
	
	protected void renderAlmanac(PoseStack stack, int mouseX, int mouseY){
		if(! this.searchGui.getCurrentOption().isPresent()){
			return ;
		}
		SearchOption option = this.searchGui.getCurrentOption().get();
		if(! this.isOptionUnLocked(option)){
			return ;
		}
		this.renderTitle(stack, option);
		this.renderLogo(stack, option);
		this.renderBar(stack, option);
//		InventoryScreen.renderEntityInInventory(this.leftPos, this.topPos, 30, 1, 1, this.minecraft.player);
//		renderEntityInInventory(this.leftPos + 37, this.topPos + 60, 30F, this.leftPos - mouseX, this.topPos - mouseY, option);

		if(getRenderEntity(option) instanceof IPAZEntity){
			this.entries.clear();
			((IPAZEntity) getRenderEntity(option)).addAlmanacEntries(this.entries);
			for(int i = 0; i < Math.min(this.entries.size(), MAX_ENTRY_COUNT); ++ i){
				this.currentPos = Mth.clamp(this.currentPos, 0, this.entries.size() - 1);
				drawEntryAt(stack, this.entries.get(this.currentPos + i), i);
			}
		}
	}

	private void drawEntryAt(PoseStack stack, Pair<IAlmanacEntry, Number> pair, int pos){
		final int incHeight = 20;
		final int posX = this.leftPos + 8 + 2;
		final int posY = this.topPos + 49 + 5;
		final String text = pair.getFirst().getText() + " : " + (pair.getSecond() instanceof Float ? String.format("%.2f", pair.getSecond()) : String.format("%d", pair.getSecond()));
		StringUtil.drawScaledString(stack, font, text, posX, posY + incHeight * pos, Colors.WHITE, 1f);
	}

	protected void renderTitle(PoseStack stack, SearchOption a) {
		stack.pushPose();
		int dx = this.leftPos + 49 + 94 / 2, dy = this.topPos + 9;
		StringUtil.drawCenteredScaledString(stack, this.font, a.getType().getText().getString(), dx, dy, Colors.WHITE, 1f);
		stack.popPose();
	}
	
	@SuppressWarnings("deprecation")
	protected void renderLogo(PoseStack stack, SearchOption a) {
		int dx = this.leftPos + 9, dy = this.topPos + 9;
		int scale = 2;
		stack.pushPose();
		stack.scale((float) scale, (float) scale, (float) scale);
		stack.translate((double)(dx % scale) / scale , (double)(dy % scale) / scale, 0);
		this.itemRenderer.renderGuiItem(SearchOption.getItemStackByOption(a), dx / scale, dy / scale);
		stack.popPose();
	}

	protected void renderBar(PoseStack stack, SearchOption a) {
		stack.pushPose();
		//Do not change the position values, if changed pls modify with the below method.
		final int len = 22;
		int posX = 53;
		int posY = 25;
		{//guide book.
			ItemStack guideBook = PVZPatchouliHandler.getPatchouliGuide();
			if(guideBook != ItemStack.EMPTY){
				this.itemRenderer.renderGuiItem(guideBook, this.leftPos + posX, this.topPos + posY);
			} else{
				this.minecraft.getTextureManager().bindForSetup(TEXTURE);
				blit(stack, this.leftPos + posX, this.topPos + posY, 224, 0, 16, 16);
			}
		}
		posX += len;
		{
			if(a.getType() instanceof IPlantType){
				ItemStack itemStack = new ItemStack(a.getType().getEssence().getEssenceItem());
				this.itemRenderer.renderGuiItem(itemStack, this.leftPos + posX, this.topPos + posY);
			}
		}
		posX += len;
		{
			this.itemRenderer.renderGuiItem(new ItemStack(a.getType().getRank().getTemplateCard()), this.leftPos + posX, this.topPos + posY);
		}
		posX += len;
		{
			this.minecraft.getTextureManager().bindForSetup(TEXTURE);
			if(a.getType().getSkills().isEmpty()) {
				blit(stack, this.leftPos + posX, this.topPos + posY, 224, 16, 16, 16);
			} else {
				blit(stack, this.leftPos + posX, this.topPos + posY, 240, 16, 16, 16);
			}
		}
		stack.popPose();
	}

	@Override
	protected void renderTooltip(PoseStack stack, int mouseX, int mouseY) {
		super.renderTooltip(stack, mouseX, mouseY);
		if(this.option != null){
			final int len = 22;
			int posX = this.leftPos + 53;
			int posY = this.topPos + 25;
			if(MathUtil.isInArea(mouseX, mouseY, posX, posY, 16, 16)){

			}
			posX += len;
			if(MathUtil.isInArea(mouseX, mouseY, posX, posY, 16, 16)){
				
				if(this.option.getType() instanceof IPlantType){
					Item item = this.option.getType().getEssence().getEssenceItem();
					this.minecraft.screen.renderComponentTooltip(stack, List.of(
                            Component.translatable("item.pvz." + ForgeRegistries.ITEMS.getKey(item).getPath())
                    ), mouseX, mouseY);
				}
			}
			posX += len;
			if(MathUtil.isInArea(mouseX, mouseY, posX, posY, 16, 16)){
				Item cardItem = this.option.getType().getRank().getTemplateCard();
                if (this.minecraft != null && this.minecraft.screen != null) {
                    this.minecraft.screen.renderComponentTooltip(stack, List.of(
                            Component.translatable(cardItem.getDescriptionId())
                    ), mouseX, mouseY);
                }
            }
			posX += len;
			if(MathUtil.isInArea(mouseX, mouseY, posX, posY, 16, 16)){
				List<Component> list = new ArrayList<>();
				this.option.getType().getSkills().forEach(skill -> {
					list.add(skill.getText().withStyle(ChatFormatting.GREEN));
				});
				if(list.isEmpty()) {
//					list.add(Component.translatable("gui.))
					this.minecraft.screen.renderComponentTooltip(stack, list, mouseX, mouseY);
				} else {
					this.minecraft.screen.renderComponentTooltip(stack, list, mouseX, mouseY);
				}
			}
		}
	}

	@Override
	protected void renderBg(PoseStack stack, float partialTicks, int mouseX, int mouseY) {
		this.minecraft.getTextureManager().bindForSetup(TEXTURE);
		blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
		if(this.entries.size() <= MAX_ENTRY_COUNT) {
			blit(stack, this.leftPos + 130, this.topPos + 49, 162, 0, 12, 15);
		} else {
			final int len = MathUtil.getBarLen(this.currentPos, this.entries.size() - MAX_ENTRY_COUNT, 143 - 15);
			blit(stack, this.leftPos + 130, this.topPos + 49 + len, 150, 0, 12, 15);
		}
//		InventoryScreen.renderEntityInInventory(this.leftPos, this.topPos, 30, 1, 1, this.minecraft.player);
	}

	//TODO Display Entity Model on Almanac Screen.
	public void renderEntityInInventory(PoseStack poseStack, int offsetX, int offsetY, float scale, float vecX, float vecY, SearchOption option) {
		LivingEntity livingEntity = getRenderEntity(option);
		if(this.getRenderEntity(option) == null){
			return;
		}
		scale /= option.getType().getRenderScale();
		float f = (float)Math.atan(vecX / 40.0F);
		float f1 = (float)Math.atan(vecY / 40.0F);
		PoseStack matrixstack = new PoseStack();
		matrixstack.translate(offsetX, offsetY, 2000.0D);
		matrixstack.scale(1.0F, 1.0F, -1.0F);
		matrixstack.scale(scale, scale, scale);
		Quaternion quaternion = Vector3f.ZP.rotationDegrees(180.0F);
		Quaternion quaternion1 = Vector3f.XP.rotationDegrees(f1 * 20.0F);
		quaternion.mul(quaternion1);
		matrixstack.mulPose(quaternion);
		float f2 = livingEntity.yBodyRot;
		float f3 = livingEntity.getYRot();
		float f4 = livingEntity.getXRot();
		float f5 = livingEntity.yHeadRotO;
		float f6 = livingEntity.yHeadRot;
		livingEntity.yBodyRot = 180.0F + f * 20.0F;
		livingEntity.setYRot(180.0F + f * 40.0F);
		livingEntity.setXRot(-f1 * 20.0F);
		livingEntity.yHeadRot = livingEntity.getYRot();
		livingEntity.yHeadRotO = livingEntity.getYRot();
		EntityRenderDispatcher entityrenderermanager = Minecraft.getInstance().getEntityRenderDispatcher();
		quaternion1.conj();
		entityrenderermanager.overrideCameraOrientation(quaternion1);
		entityrenderermanager.setRenderShadow(false);
		MultiBufferSource irendertypebuffer$impl = Minecraft.getInstance().renderBuffers().bufferSource();
		RenderSystem.runAsFancy(() -> {
			entityrenderermanager.render(livingEntity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, matrixstack, irendertypebuffer$impl, 15728880);
		});
		((MultiBufferSource.BufferSource) irendertypebuffer$impl).endBatch();
		entityrenderermanager.setRenderShadow(true);
		livingEntity.yBodyRot = f2;
		livingEntity.setYRot(f3);
		livingEntity.setXRot(f4);
		livingEntity.yHeadRotO = f5;
		livingEntity.yHeadRot = f6;
	}

	public Mob getRenderEntity(SearchOption option){
		if(option.getType().getEntityType().isPresent()) {
			if (option.equals(this.option)) {
				return this.renderEntity == null ? this.renderEntity = option.getType().getEntityType().get().create(this.minecraft.level) : this.renderEntity;
			} else {
				this.currentPos = 0;
			}
			this.option = option;
			return this.renderEntity = option.getType().getEntityType().get().create(this.minecraft.level);
		}
		return null;
	}
	
	@Override
	public boolean isOptionUnLocked(SearchOption option) {
		return ! PlayerUtil.isPAZLocked(this.minecraft.player, option.getType());
	}

	@Override
	public List<CategoryToggleWidget.SearchCategories> getSearchCategories() {
		return Arrays.asList(CategoryToggleWidget.SearchCategories.ALL, CategoryToggleWidget.SearchCategories.PLANTS, CategoryToggleWidget.SearchCategories.ZOMBIES);
	}

}