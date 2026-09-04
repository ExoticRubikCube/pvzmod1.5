package com.hungteen.pvz.client.render.entity.bullet;

import com.hungteen.pvz.client.model.entity.bullet.TargetArrowModel;
import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.bullet.TargetArrowEntity;
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
public class TargetArrowRender extends PVZEntityRender<TargetArrowEntity> {

	private static final ResourceLocation TARGET_ARROW = StringUtil.prefix("textures/entity/misc/target_arrow.png");
	
	public TargetArrowRender(EntityRendererProvider.Context context) {
		super(context, new TargetArrowModel(context.bakeLayer(TargetArrowModel.LAYER)));
	}

	@Override
	public void render(TargetArrowEntity entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) + 180.0F));
		matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		matrixStackIn.popPose();
	}

	@Override
	protected float getScaleByEntity(TargetArrowEntity entity) {
		return 1.5F;
	}

	@Override
	public ResourceLocation getTextureLocation(TargetArrowEntity entity) {
		return TARGET_ARROW;
	}

}