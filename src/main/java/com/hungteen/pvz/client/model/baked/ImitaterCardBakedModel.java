package com.hungteen.pvz.client.model.baked;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.resources.model.BakedModel;

public class ImitaterCardBakedModel extends PVZBakedModel {
	
    public ImitaterCardBakedModel(BakedModel existingModel) {
       super(existingModel);
    }

    @Override
    public BakedModel applyTransform(ItemTransforms.TransformType transformType, PoseStack poseStack, boolean applyLeftHandTransform) {
        if (transformType == ItemTransforms.TransformType.GUI) {
            return this;
        }
        return this.existingModel.applyTransform(transformType, poseStack, applyLeftHandTransform);
    }
}