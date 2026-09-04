package com.hungteen.pvz.client.render.entity.plant.spear;

import com.hungteen.pvz.client.model.entity.plant.spear.CactusModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.spear.CactusEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CactusRender extends PVZPlantRender<CactusEntity> {

	public CactusRender(EntityRendererProvider.Context context) {
		super(context, new CactusModel(context.bakeLayer(CactusModel.LAYER)), 0.5F);
	}

	@Override
	public Vec3 getTranslateVec(CactusEntity entity) {
		float h = entity.getCactusHeight();
		return new Vec3(0, - h, 0);
	}

}