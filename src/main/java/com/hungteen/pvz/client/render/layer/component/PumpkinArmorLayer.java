package com.hungteen.pvz.client.render.layer.component;

import com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel;
import com.hungteen.pvz.common.entity.plant.defence.PumpkinEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.resources.ResourceLocation;

public class PumpkinArmorLayer extends ComponentLayer<PumpkinEntity> {

    private final ResourceLocation ARMOR = StringUtil.prefix("textures/entity/plant/defence/pumpkin_armor.png");

    public PumpkinArmorLayer(RenderLayerParent<PumpkinEntity, EntityModel<PumpkinEntity>> entityRendererIn) {
        super(entityRendererIn, new PumpkinModel.PumpkinArmorModel());
    }

    @Override
    public boolean canRender(PumpkinEntity entity) {
        return entity.getInnerDefenceLife() > 0;
    }

    @Override
    public ResourceLocation getRenderTexture(PumpkinEntity entity) {
        return ARMOR;
    }

}
