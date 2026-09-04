package com.hungteen.pvz.client.render.entity.zombie.zombotany;

import com.hungteen.pvz.client.model.entity.zombie.zombotany.JalapenoZombieModel;
import com.hungteen.pvz.common.entity.zombie.zombotany.JalapenoZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class JalapenoZombieRender extends AbstractZombotanyRender<JalapenoZombieEntity> {

	public JalapenoZombieRender(EntityRendererProvider.Context context) {
		super(context, new JalapenoZombieModel(context.bakeLayer(JalapenoZombieModel.LAYER)), 0.4F);
	}

}