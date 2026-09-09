package com.hungteen.pvz.utils;

import net.minecraft.client.model.geom.ModelPart;

import java.util.HashMap;
import java.util.Map;

public class ClientUtil {

    public static ModelPart copyModelPart(ModelPart original) {
        Map<String, ModelPart> children = new HashMap<>();
        for (String part : original.children.keySet()) {
            children.put(part, copyModelPart(original.children.get(part)));
        }
        ModelPart newPart = new ModelPart(original.cubes, children);
        newPart.xScale = original.xScale;
        newPart.yScale = original.yScale;
        newPart.zScale = original.zScale;
        newPart.visible = original.visible;
        newPart.setInitialPose(original.getInitialPose());
        newPart.resetPose();
        return newPart;
    }

}