package com.hungteen.pvz.client.model.baked;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.resources.model.BakedModel;

public class BowlingGloveBakedModel extends PVZBakedModel {

    public BowlingGloveBakedModel(BakedModel existingModel) {
        super(existingModel);
    }

    @Override
    public BakedModel applyTransform(ItemTransforms.TransformType cameraTransformType, PoseStack poseStack, boolean applyLeftHandTransform) {
        if (cameraTransformType == ItemTransforms.TransformType.FIRST_PERSON_RIGHT_HAND) {
            return this;
        }
        return this.existingModel.applyTransform(cameraTransformType, poseStack, applyLeftHandTransform);
    }
}