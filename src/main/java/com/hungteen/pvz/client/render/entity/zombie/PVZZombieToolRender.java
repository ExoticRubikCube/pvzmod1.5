package com.hungteen.pvz.client.render.entity.zombie;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Mob;

public abstract class PVZZombieToolRender<T extends Mob> extends MobRenderer<T, EntityModel<T>>{

	public PVZZombieToolRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn,
			float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
	}

	@Override
	protected void scale(T entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
		float sz=getScaleByEntity(entitylivingbaseIn);
		matrixStackIn.scale(sz,sz,sz);
	}
	
	protected abstract float getScaleByEntity(T entity);
	
}