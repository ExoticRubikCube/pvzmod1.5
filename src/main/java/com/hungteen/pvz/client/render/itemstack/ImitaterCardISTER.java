package com.hungteen.pvz.client.render.itemstack;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.spawn.card.ImitaterCardItem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

public class ImitaterCardISTER extends BlockEntityWithoutLevelRenderer {

	public ImitaterCardISTER(BlockEntityRenderDispatcher dispatcher, EntityModelSet modelSet) {
		super(dispatcher, modelSet);
	}

	@Override
	public void renderByItem(ItemStack stack, ItemTransforms.TransformType tansformType, PoseStack matrixStackIn, MultiBufferSource bufferIn,
			int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.pushPose();
		ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        matrixStackIn.translate(0.5F, 0.5F, 0.5F);
        ItemStack itemstack = new ItemStack(ItemRegister.IMITATER_CARD.get());
		if(stack.getItem() instanceof ImitaterCardItem) {
			Optional<IPlantType> opt = ImitaterCardItem.getImitatePlantType(stack);
			if(opt.isPresent() && opt.get() != PVZPlants.IMITATER && opt.get().getSummonCard().isPresent()) {
				itemstack = new ItemStack(opt.get().getSummonCard().get());
			}
		}

        BakedModel ibakedmodel = itemRenderer.getModel(itemstack, null, null, 0);
        matrixStackIn.pushPose();
        itemRenderer.render(itemstack, ItemTransforms.TransformType.NONE, false, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, ibakedmodel);
        matrixStackIn.popPose();
        matrixStackIn.popPose();

	}

}
