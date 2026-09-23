package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.SeedArrowEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SeedArrowRender extends ArrowRenderer<SeedArrowEntity> {

    private static final ResourceLocation SEED_ARROW = StringUtil.prefix("textures/entity/projectiles/seed_arrow.png");

    public SeedArrowRender(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SeedArrowEntity entity) {
        return SEED_ARROW;
    }
}
