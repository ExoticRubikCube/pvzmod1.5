package com.hungteen.pvz.client.render.entity.misc.drop;

import com.hungteen.pvz.common.entity.misc.drop.SeedPacketEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SeedPacketRender extends EntityRenderer<SeedPacketEntity> {

	private final ItemRenderer itemRenderer;

	public SeedPacketRender(EntityRendererProvider.Context context) {
		super(context);
		this.itemRenderer = context.getItemRenderer();
		this.shadowRadius = 0.15F;
	}

	@Override
	public void render(SeedPacketEntity entity, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource source, int packedLight) {
		int tmp = entity.getMaxLiveTick() - entity.tickCount;
		int alpha;
		if (tmp >= 90) {
			alpha = 255;
		} else if (tmp > 10) {
			alpha = 159 - (int) ((Mth.sin((tmp + 5) / 3.183F)) * 96);
		} else {
			alpha = 127 - (int) ((Mth.sin((tmp + 5) / 3.183F)) * 127);
		}
		if (alpha > 80) {
			stack.pushPose();
			stack.translate(0.0D, 0.2F, 0.0D);
			stack.mulPose(this.entityRenderDispatcher.cameraOrientation());
			stack.mulPose(Vector3f.YP.rotationDegrees(180.0F));
			stack.scale(1.5F, 1.5F, 1.5F);
			final ItemStack card = entity.getCardStack();
			if(! card.isEmpty()) {
				this.itemRenderer.renderStatic(card, ItemTransforms.TransformType.FIXED, packedLight, OverlayTexture.NO_OVERLAY, stack, source, entity.getId());
			}
			stack.popPose();
		}
		super.render(entity, entityYaw, partialTicks, stack, source, packedLight);
	}

	@Override
	public ResourceLocation getTextureLocation(SeedPacketEntity entity) {
		return TextureAtlas.LOCATION_BLOCKS;
	}
}