package com.hungteen.pvz.client.render.entity.plant;

import com.hungteen.pvz.client.render.layer.PlantLadderLayer;
import com.hungteen.pvz.client.render.layer.PumpkinArmorLayer;
import com.hungteen.pvz.client.render.layer.fullskin.CharmLayer;
import com.hungteen.pvz.client.render.layer.fullskin.EnergyLayer;
import com.hungteen.pvz.client.render.layer.fullskin.HealLightLayer;
import com.hungteen.pvz.client.render.layer.fullskin.SunLightLayer;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.utils.AnimationUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class PVZPlantRender<T extends PVZPlantEntity> extends MobRenderer<T, EntityModel<T>>{

	private static final int BREATH_ANIM_CD = 40;
	
	public PVZPlantRender(EntityRendererProvider.Context context, EntityModel<T> entityModelIn, float shadowSizeIn) {
		super(context, entityModelIn, shadowSizeIn);
		this.addPlantLayers();
	}

	@Override
	protected void scale(T plant, PoseStack matrixStackIn, float partialTickTime) {
		int live = plant.getExistTick() % BREATH_ANIM_CD;
		final float scaleOffset = AnimationUtil.upDown(live, BREATH_ANIM_CD, 0.01F);
		final float sz1 = getScaleByEntity(plant);
		final float sz = sz1 * (1 + scaleOffset);
		final Vec3 vec = getTranslateVec(plant);
		matrixStackIn.scale(sz, sz, sz);
		matrixStackIn.translate(vec.x, vec.y, vec.z);
	}
	
	protected void addPlantLayers(){
		this.addLayer(new EnergyLayer<>(this));
		this.addLayer(new CharmLayer<>(this));
		this.addLayer(new PumpkinArmorLayer<>(this));
		this.addLayer(new SunLightLayer<>(this));
		this.addLayer(new HealLightLayer<>(this));
		this.addLayer(new PlantLadderLayer<>(this));
	}
	
	public float getScaleByEntity(T entity) {
		return entity.getPlantType().getRenderScale();
	}
	
	public Vec3 getTranslateVec(T entity) {
		return new Vec3(0, 0, 0);
	}
	
	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return entity.getPlantType().getRenderResource();
	}
	
}