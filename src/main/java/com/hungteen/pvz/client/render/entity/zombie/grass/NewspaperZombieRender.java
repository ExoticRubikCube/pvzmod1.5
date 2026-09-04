package com.hungteen.pvz.client.render.entity.zombie.grass;

import com.hungteen.pvz.client.model.entity.zombie.grass.NewspaperZombieModel;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.grass.NewspaperZombieEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NewspaperZombieRender extends PVZZombieRender<NewspaperZombieEntity>{
	
	public NewspaperZombieRender(EntityRendererProvider.Context context) {
		super(context, new NewspaperZombieModel(context.bakeLayer(NewspaperZombieModel.LAYER)), 0.5F);
	}

}