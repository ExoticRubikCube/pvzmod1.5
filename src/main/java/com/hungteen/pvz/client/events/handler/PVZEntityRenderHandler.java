package com.hungteen.pvz.client.events.handler;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.entity.zombie.roof.BungeeZombieEntity;
import com.hungteen.pvz.utils.EntityUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.LivingEntity;

public class PVZEntityRenderHandler {

	public static void checkBungeeHandStand(LivingEntity entity, PoseStack stack) {
		if(entity instanceof PVZPlantEntity || entity instanceof PVZZombieEntity) return ;
		if(entity.getVehicle() instanceof BungeeZombieEntity) {
			stack.mulPose(Vector3f.ZP.rotationDegrees(180F));
		}
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void checkAndRenderButter(LivingEntityRenderer r, LivingEntity entity, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
		if(! EntityUtil.isEntityValid(entity) || ! EntityUtil.isEntityButter(entity)) return ;
		matrixStackIn.pushPose();
		float scale = 0.7F;
		matrixStackIn.scale(scale, scale, scale);
		matrixStackIn.translate(- 0.5F, entity.getBbHeight() / scale - 0.5F, - 0.5F);
		Minecraft.getInstance().getBlockRenderer().renderSingleBlock(BlockRegister.BUTTER_BLOCK.get().defaultBlockState(), matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
	}
}
