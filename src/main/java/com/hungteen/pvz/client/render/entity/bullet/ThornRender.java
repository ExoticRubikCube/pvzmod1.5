package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.model.entity.bullet.ThornModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.bullet.ThornEntity;
import com.hungteen.pvz.common.entity.bullet.ThornEntity.ThornStates;
import com.hungteen.pvz.common.entity.bullet.ThornEntity.ThornTypes;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ThornRender extends PVZEntityRender<ThornEntity> {

	public ThornRender(EntityRendererProvider.Context context) {
		super(context, new ThornModel(context.bakeLayer(ThornModel.LAYER)));
	}

	@Override
	public void render(ThornEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
//		System.out.println(entityIn.rotationYaw);
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) + 180.0F));
		matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.popPose();
	}

	@Override
	protected float getScaleByEntity(ThornEntity entity) {
		if(entity.getThornType() == ThornTypes.AUTO) return 2.5F;
		return 1.2F;
	}

	@Override
	public ResourceLocation getTextureLocation(ThornEntity entity) {
		if(entity.getThornState() == ThornStates.POWER) return StringUtil.prefix("textures/entity/misc/power_thorn.png");
		return StringUtil.prefix("textures/entity/misc/thorn.png");
	}

}