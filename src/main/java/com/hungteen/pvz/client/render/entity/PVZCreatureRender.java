package com.hungteen.pvz.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class PVZCreatureRender<T extends Mob> extends MobRenderer<T, EntityModel<T>>{

	public PVZCreatureRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn,
			float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
	}

	@Override
	protected void scale(T entity, PoseStack matrixStackIn, float partialTickTime) {
		float sz = getScaleByEntity(entity);
		matrixStackIn.scale(sz, sz, sz);
		Vec3 vec = this.getTranslateVec(entity);
		matrixStackIn.translate(vec.x, vec.y, vec.z);
	}
	
	protected abstract float getScaleByEntity(T entity);
	
	public Vec3 getTranslateVec(T entity) {
		return new Vec3(0, 0, 0);
	}

}