package com.hungteen.pvz.client.render.entity.misc;

import com.hungteen.pvz.common.entity.misc.ElementBallEntity;
import com.hungteen.pvz.common.entity.misc.ElementBallEntity.ElementTypes;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ElementBallRender extends EntityRenderer<ElementBallEntity>{

	public ElementBallRender(EntityRendererProvider.Context context) {
		super(context);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void render(ElementBallEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.pushPose();
		float f = getScaleByEntity(entityIn);
		matrixStackIn.scale(f, f, f);
		matrixStackIn.translate(- 0.5F, 0, - 0.5F);
//		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(entityIn.ticksExisted * 15));
//		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) + 180.0F));
//		matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
        Minecraft.getInstance().getBlockRenderer().renderSingleBlock(getBlockByEntity(entityIn), matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
        matrixStackIn.popPose();
	}
	
	public float getScaleByEntity(ElementBallEntity entity) {
		return 3;
	}

	public BlockState getBlockByEntity(ElementBallEntity entity) {
		if(entity.getElementBallType() == ElementTypes.FLAME) return Blocks.MAGMA_BLOCK.defaultBlockState();
		return Blocks.BLUE_ICE.defaultBlockState();
	}

	@Override
	public ResourceLocation getTextureLocation(ElementBallEntity entity) {
		return null;
	}
	
}