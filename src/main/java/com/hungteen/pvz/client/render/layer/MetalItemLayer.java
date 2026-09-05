package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.api.enums.MetalTypes;
import com.hungteen.pvz.common.entity.plant.assist.MagnetShroomEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MetalItemLayer <T extends MagnetShroomEntity> extends RenderLayer<T, EntityModel<T>> {

	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
	
    public MetalItemLayer(RenderLayerParent<T, EntityModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}
    
	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn,
			MagnetShroomEntity entityIn, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch) {
		if(entityIn.getMetalType() == MetalTypes.EMPTY || entityIn.isInvisible()) {
			return ;
		}
		matrixStackIn.pushPose();
		matrixStackIn.scale(-1, -1, 1);
		float percent = entityIn.getAttackTime() * 1.0F / entityIn.getWorkCD();
		matrixStackIn.scale(percent, percent, percent);
		ItemStack itemstack = entityIn.getMetalRenderItem();
		BakedModel ibakedmodel = this.itemRenderer.getModel(itemstack, entityIn.level, null,0);
		this.itemRenderer.render(itemstack, ItemTransforms.TransformType.GROUND, false, matrixStackIn,
				bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY, ibakedmodel);
		matrixStackIn.popPose();
	}

}