package com.hungteen.pvz.client.render.layer.fullskin;

import com.hungteen.pvz.common.potion.EffectRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.data.ModelData;

import java.util.Random;

@OnlyIn(Dist.CLIENT)
public class ColdLayer<T extends LivingEntity, M extends EntityModel<T>> extends PVZFullSkinLayer<T,M>{

	private final Random random = new Random();

	public ColdLayer(RenderLayerParent<T, M> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, T entitylivingbaseIn,
	                   float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
	                   float headPitch) {
		super.render(matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch);
		if (entitylivingbaseIn.isAlive() && EntityUtil.isEntityFrozen(entitylivingbaseIn)) {
			MobEffectInstance effect = entitylivingbaseIn.getEffect(EffectRegister.FROZEN_EFFECT.get());
			int amplifier = effect == null ? 0 : effect.getAmplifier();
			this.random.setSeed(entitylivingbaseIn.getId() * entitylivingbaseIn.getId() * 3121L + entitylivingbaseIn.getId() * 45238971L);
			int numCubes = (int) (entitylivingbaseIn.getBbHeight() / 0.4F) + amplifier + 1;
			for (int i = 0; i < numCubes; ++ i) {
				matrixStackIn.pushPose();
				float dx = ((this.random.nextFloat() * (entitylivingbaseIn.getBbWidth() * 2.0F)) - entitylivingbaseIn.getBbWidth()) * 0.1F;
				float dy = Math.max(1.5F - this.random.nextFloat() * entitylivingbaseIn.getBbHeight(), -0.1F);
				float dz = ((this.random.nextFloat() * (entitylivingbaseIn.getBbWidth() * 2.0F)) - entitylivingbaseIn.getBbWidth()) * 0.1F;
				matrixStackIn.translate(dx, dy, dz);
				matrixStackIn.scale(0.5F, 0.5F, 0.5F);
				matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(this.random.nextFloat() * 360F));
				matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(this.random.nextFloat() * 360F));
				matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(this.random.nextFloat() * 360F));
				matrixStackIn.translate(-0.5F, -0.5F, -0.5F);
				Minecraft.getInstance().getBlockRenderer().renderSingleBlock(Blocks.ICE.defaultBlockState(), matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY, ModelData.EMPTY, RenderType.translucentMovingBlock());
				matrixStackIn.popPose();
			}
		}
	}

	@Override
	protected boolean canRender(T entity) {
		if(entity.isInvisible()) return false;
		return EntityUtil.isEntityCold(entity);
	}

	@Override
	protected ResourceLocation getResourceLocation(T entity) {
		return StringUtil.prefix("textures/entity/layer/cold_layer.png");
	}

}
