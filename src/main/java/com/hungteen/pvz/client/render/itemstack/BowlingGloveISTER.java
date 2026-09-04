package com.hungteen.pvz.client.render.itemstack;

import com.hungteen.pvz.client.model.entity.plant.defence.WallNutModel;
import com.hungteen.pvz.common.entity.plant.defence.WallNutEntity;
import com.hungteen.pvz.common.item.tool.plant.BowlingGloveItem;
import com.hungteen.pvz.common.item.tool.plant.BowlingGloveItem.BowlingType;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

public class BowlingGloveISTER extends BlockEntityWithoutLevelRenderer {

	private final EntityModel<WallNutEntity> model;
	private int degree = 0;

	public BowlingGloveISTER(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
		super(dispatcher, modelSet);
		this.model = new WallNutModel<>(WallNutModel.createBodyLayer().bakeRoot());
	}

	@Override
	public void renderByItem(ItemStack stack, ItemTransforms.TransformType tansformType, PoseStack matrixStackIn, MultiBufferSource bufferIn,
			int combinedLightIn, int combinedOverlayIn) {
		ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        BakedModel ibakedmodel = itemRenderer.getModel(stack, null, null, 0);
        matrixStackIn.pushPose();
        matrixStackIn.translate(0.8F, 0.7F, 0.4F);
        itemRenderer.render(stack, ItemTransforms.TransformType.NONE, false, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, ibakedmodel);
        matrixStackIn.popPose();

        Optional<BowlingType> type = BowlingGloveItem.getBowlingType(stack);
		if(! type.isPresent()) {// no bowling.
			return ;
		}

		if (degree >= 360) {
            degree -= 360;
        }
        degree += 4;

		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(degree));
        VertexConsumer ivertexbuilder = bufferIn.getBuffer(this.model.renderType(type.get().getType().getRenderResource()));
        this.model.renderToBuffer(matrixStackIn, ivertexbuilder, combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.popPose();
	}

}
