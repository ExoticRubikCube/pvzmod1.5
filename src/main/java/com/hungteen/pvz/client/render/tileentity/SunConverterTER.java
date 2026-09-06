package com.hungteen.pvz.client.render.tileentity;

import com.hungteen.pvz.common.blockentity.SunConverterTileEntity;
import com.hungteen.pvz.common.item.ItemRegister;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SunConverterTER implements BlockEntityRenderer<SunConverterTileEntity> {

	public SunConverterTER(BlockEntityRenderDispatcher rendererDispatcherIn) {
	}

	@Override
	public void render(SunConverterTileEntity tileEntityIn, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.pushPose();
		ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack stack = new ItemStack(ItemRegister.RESOURCE_COLLECTOR.get());
        float scale = 1.2F;
        matrixStackIn.scale(scale, scale, scale);
        matrixStackIn.translate(0.5D / scale, 1D / scale, 0.5D / scale);
        if(tileEntityIn.array.get(0) == 1) {
        	matrixStackIn.translate(0, (0.1D * Mth.sin(tileEntityIn.tickExist / 10F)) / scale, 0);
        	matrixStackIn.mulPose(Vector3f.YP.rotation(tileEntityIn.tickExist / 10F));
        }
        BakedModel ibakedmodel = itemRenderer.getModel(stack, tileEntityIn.getLevel(), null,0);
        itemRenderer.render(stack, ItemTransforms.TransformType.GROUND, true, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, ibakedmodel);
        matrixStackIn.popPose();
	}

}