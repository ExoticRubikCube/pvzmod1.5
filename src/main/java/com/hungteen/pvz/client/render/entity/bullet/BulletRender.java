package com.hungteen.pvz.client.render.entity.bullet;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class BulletRender<T extends Entity & ItemSupplier> extends EntityRenderer<T> {
	
	private final ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
	private final boolean fullBright;

	public BulletRender(EntityRendererProvider.Context context, boolean p_i226035_4_) {
		super(context);
		this.fullBright = p_i226035_4_;
	}

	public BulletRender(EntityRendererProvider.Context context) {
		this(context, false);
	}

	@Override
	protected int getBlockLightLevel(T entityIn, BlockPos pos) {
		return this.fullBright ? 15 : super.getBlockLightLevel(entityIn, pos);
	}

	public void render(T entityIn, float entityYaw, float partialTicks, PoseStack matrixStackIn,
			MultiBufferSource bufferIn, int packedLightIn) {
		matrixStackIn.pushPose();
		float scale = getScaleByEntity(entityIn);
		matrixStackIn.scale(scale, scale, scale);
		matrixStackIn.mulPose(this.entityRenderDispatcher.cameraOrientation());
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180.0F));
		this.itemRenderer.renderStatic(entityIn.getItem(), ItemTransforms.TransformType.GROUND,
				packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn, entityIn.getId());
		matrixStackIn.popPose();
		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}

	protected abstract float getScaleByEntity(T entity);

	/**
	 * Returns the location of an entity's texture.
	 */
	public ResourceLocation getTextureLocation(Entity entity) {
		return TextureAtlas.LOCATION_BLOCKS;
	}
}