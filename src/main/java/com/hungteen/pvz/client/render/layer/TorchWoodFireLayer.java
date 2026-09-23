package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TorchWoodFireLayer extends RenderLayer<TorchWoodEntity, EntityModel<TorchWoodEntity>> {

	private final BlockRenderDispatcher blockRenderer = Minecraft.getInstance().getBlockRenderer();

	public TorchWoodFireLayer(RenderLayerParent<TorchWoodEntity, EntityModel<TorchWoodEntity>> renderer) {
		super(renderer);
	}

	@Override
	public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, TorchWoodEntity torchWood,
			float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.XP.rotationDegrees(180.0F));
		poseStack.translate(-0.5F, -0.8F, -0.5F);
		this.blockRenderer.renderSingleBlock(
				torchWood.getFlameType() == TorchWoodEntity.FlameTypes.BLUE ? Blocks.SOUL_FIRE.defaultBlockState() : Blocks.FIRE.defaultBlockState(),
				poseStack, bufferSource, packedLight, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();
	}
}