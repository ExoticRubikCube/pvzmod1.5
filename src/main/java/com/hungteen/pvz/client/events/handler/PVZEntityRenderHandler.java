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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class PVZEntityRenderHandler {

	public static final BlockState ICE_BLOCK = Blocks.FROSTED_ICE.defaultBlockState();
	
	public static void checkBungeeHandStand(LivingEntity entity, PoseStack stack) {
		if(entity instanceof PVZPlantEntity || entity instanceof PVZZombieEntity) return ;
		if(entity.getVehicle() instanceof BungeeZombieEntity) {
			stack.mulPose(Vector3f.ZP.rotationDegrees(180F));
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void checkAndRenderFrozenIce(LivingEntity entity, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
		if(! EntityUtil.isEntityValid(entity) || ! EntityUtil.isEntityFrozen(entity)) return ;
		matrixStackIn.pushPose();
		float scale = 0.5F;
		matrixStackIn.scale(scale, scale, scale);
		matrixStackIn.pushPose();
		Minecraft.getInstance().getBlockRenderer().renderSingleBlock(ICE_BLOCK, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(90F));
		Minecraft.getInstance().getBlockRenderer().renderSingleBlock(ICE_BLOCK, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180F));
		Minecraft.getInstance().getBlockRenderer().renderSingleBlock(ICE_BLOCK, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(- 90F));
		Minecraft.getInstance().getBlockRenderer().renderSingleBlock(ICE_BLOCK, matrixStackIn, bufferIn, packedLightIn, OverlayTexture.NO_OVERLAY);
		matrixStackIn.popPose();
		matrixStackIn.popPose();
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