package com.hungteen.pvz.client.render.tileentity;

import com.hungteen.pvz.client.model.entity.plant.light.SunFlowerModel;
import com.hungteen.pvz.common.block.AbstractFacingBlock;
import com.hungteen.pvz.common.block.special.SunFlowerTrophyBlock;
import com.hungteen.pvz.common.blockentity.SunFlowerTrophyTileEntity;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SunFlowerTrophyTER implements BlockEntityRenderer<SunFlowerTrophyTileEntity> {

	protected final SunFlowerModel model;
	
	public SunFlowerTrophyTER(BlockEntityRendererProvider.Context context) {
		this.model = new SunFlowerModel(context.bakeLayer(SunFlowerModel.LAYER));
	}

	@Override
	public void render(SunFlowerTrophyTileEntity tileEntityIn, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		SunFlowerTrophyBlock block = (SunFlowerTrophyBlock) tileEntityIn.getBlockState().getBlock();
		if(block == null) return ;
		matrixStackIn.pushPose();
		matrixStackIn.scale(- 1, - 1, 1);
		float size = 1F;
		matrixStackIn.scale(size, size, size);
		matrixStackIn.translate(- 0.5D, -2.25D, 0.5D);
		Direction facing = tileEntityIn.getBlockState().getValue(AbstractFacingBlock.FACING);
		if(facing == Direction.SOUTH) matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180));
		else if(facing == Direction.WEST) matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(- 90));
		else if(facing == Direction.EAST) matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(90));
		VertexConsumer builder = bufferIn.getBuffer(RenderType.entityTranslucent(getResourceByBlock(block)));
		this.model.renderToBuffer(matrixStackIn, builder, 200, OverlayTexture.NO_OVERLAY, 1F, 1F, 1F, 1F);
		
		matrixStackIn.popPose();
	}
	
	private ResourceLocation getResourceByBlock(SunFlowerTrophyBlock block) {
		if(block.lvl == 1) return StringUtil.prefix("textures/entity/plant/light/silver_sunflower.png");
		if(block.lvl == 2) return StringUtil.prefix("textures/entity/plant/light/gold_sunflower.png");
		return StringUtil.prefix("textures/entity/plant/light/diamond_sunflower.png");
	}

}
