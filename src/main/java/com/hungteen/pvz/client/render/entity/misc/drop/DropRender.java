package com.hungteen.pvz.client.render.entity.misc.drop;

import com.hungteen.pvz.client.render.entity.PVZEntityRender;
import com.hungteen.pvz.common.entity.misc.drop.DropEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class DropRender<T extends DropEntity> extends PVZEntityRender<T>{

	public DropRender(EntityRendererProvider.Context context, EntityModel<T> m) {
		super(context, m);
	}

	@Override
	public void render(T entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		matrixStackIn.pushPose();
		matrixStackIn.mulPose(this.entityRenderDispatcher.cameraOrientation());
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
        matrixStackIn.popPose();
	}
	
}