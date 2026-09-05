package com.hungteen.pvz.client.render.tileentity;

import com.hungteen.pvz.client.model.entity.te.OriginModel;
import com.hungteen.pvz.common.tileentity.EssenceAltarTileEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EssenceAltarTER implements BlockEntityRenderer<EssenceAltarTileEntity> {

	private static final ResourceLocation RES = StringUtil.prefix("textures/tileentity/origin.png");
	private final OriginModel origin;

	public EssenceAltarTER(BlockEntityRendererProvider.Context context) {
		this.origin = new OriginModel(context.bakeLayer(OriginModel.LAYER));
	}

	@Override
	public void render(EssenceAltarTileEntity tileEntityIn, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.pushPose();
		matrixStackIn.scale(- 1, - 1, 1);
		float size = 1F;
		matrixStackIn.scale(size, size, size);
		final float time = tileEntityIn.getLevel() == null ? tileEntityIn.tick + partialTicks
				: tileEntityIn.getLevel().getGameTime() + partialTicks;
		matrixStackIn.translate(- 0.5 / size, - 2.3D - 0.15 * Math.sin(time * 0.1), 0.5 / size);
		VertexConsumer builder = bufferIn.getBuffer(RenderType.entityTranslucentCull(RES));
		origin.setupAnim(null, 0, 0, time, 0, 0);
		origin.renderToBuffer(matrixStackIn, builder, combinedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
	}

}
