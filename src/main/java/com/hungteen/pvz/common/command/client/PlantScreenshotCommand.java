package com.hungteen.pvz.common.command.client;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLevelLastEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, value = Dist.CLIENT)
public class PlantScreenshotCommand {

	private static final Path OUT_DIR = Path.of("mods", "pvz_screenshot");
	private static final int IMAGE_SIZE = 32;
	/** 实际渲染内容最大维占画布的比例 */
	private static final float FILL_FRACTION = 0.75F;
	private static final float VIEW_ANGLE = 45F;
	private static final float PITCH_ANGLE = (float) Math.toDegrees(Math.asin(Math.tan(Math.toRadians(30))));

	private static final List<Entity> queue = new ArrayList<>();
	private static int index = -1;
	private static TextureTarget offscreen;
	private static CommandSourceStack source;


	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		LiteralArgumentBuilder<CommandSourceStack> builder = Commands.literal("pvzscreenshot");
		builder.then(Commands.literal("all_plants").executes(ctx -> startExport(ctx.getSource(), allPlants())));
		builder.then(Commands.literal("all_zombie").executes(ctx -> startExport(ctx.getSource(), allZombies())));
		builder.then(Commands.literal("all")
				.then(Commands.argument("modid", StringArgumentType.word())
						.executes(ctx -> startExport(ctx.getSource(), allOfNamespace(StringArgumentType.getString(ctx, "modid"))))));
		builder.then(Commands.argument("register", ResourceLocationArgument.id())
				.executes(ctx -> startExport(ctx.getSource(), singleEntity(ResourceLocationArgument.getId(ctx, "register")))));
		dispatcher.register(builder);
	}

	private static List<Entity> allPlants() {
		return collectEntities(PVZMod.MOD_ID, entity -> entity instanceof PVZPlantEntity);
	}

	private static List<Entity> allZombies() {
		return collectEntities(PVZMod.MOD_ID, entity -> entity instanceof PVZZombieEntity);
	}

	private static List<Entity> allOfNamespace(String modid) {
		return collectEntities(modid, entity -> true);
	}

	private static List<Entity> collectEntities(String modid, Predicate<Entity> filter) {
		Minecraft mc = Minecraft.getInstance();
		List<Entity> out = new ArrayList<>();
		if (mc.level != null) {
			for (EntityType<?> type : ForgeRegistries.ENTITY_TYPES.getValues()) {
				if (!ForgeRegistries.ENTITY_TYPES.getKey(type).getNamespace().equals(modid)) {
					continue;
				}
				Entity entity = type.create(mc.level);
				if (filter.test(entity)) {
					out.add(entity);
				}
			}
		}
		return out;
	}

	private static List<Entity> singleEntity(ResourceLocation register) {
		Minecraft mc = Minecraft.getInstance();
		if (mc.level == null) {
			return List.of();
		}
		EntityType<?> matched = ForgeRegistries.ENTITY_TYPES.getValue(register);
		if (matched == null) {
			PVZMod.LOGGER.error("plant screenshot: 未找到实体类型 {}", register);
			return List.of();
		}
		try {
			final Entity entity = matched.create(mc.level);
			if (entity == null) {
				PVZMod.LOGGER.error("plant screenshot: create {} 返回空实体", register);
				return List.of();
			}
			return List.of(entity);
		} catch (RuntimeException e) {
			PVZMod.LOGGER.error("plant screenshot: create {} 失败", register, e);
		}
		return List.of();
	}

	/** 反馈统一切回主线程发送，供渲染事件线程脱离命令上下文后告知玩家 */
	private static void sendFeedback(String key, boolean success, Object... args) {
		Minecraft mc = Minecraft.getInstance();
		mc.execute(() -> {
			if (mc.player == null || source == null) {
				return;
			}
			Component msg = Component.translatable(key, args);
			if (success) {
				source.sendSuccess(msg, false);
			} else {
				source.sendFailure(msg);
			}
		});
	}

	private static int startExport(CommandSourceStack commandSource, List<Entity> entities) {
		source = commandSource;
		int result;
		if (!entities.isEmpty()) {
			index = -1;
			queue.clear();
			queue.addAll(entities);
			sendFeedback("command.pvz.screenshot.start", true, queue.size());
			result = entities.size();
		} else {
			sendFeedback("command.pvz.screenshot.empty", false);
			result = 0;
		}
		return result;
	}

	@SuppressWarnings("removal")
    @SubscribeEvent
	public static void onRenderLevelLast(RenderLevelLastEvent event) {
		if (!queue.isEmpty()) {
			if (offscreen == null) {
				offscreen = new TextureTarget(IMAGE_SIZE, IMAGE_SIZE, true, false);
			}
			if (++index >= queue.size()) {
				sendFeedback("command.pvz.screenshot.finish", true);
				queue.clear();
			} else {
				renderEntity(queue.get(index), offscreen);
			}
		}
	}

	private static void renderEntity(Entity current, TextureTarget target) {
		@SuppressWarnings("unchecked")
		EntityRenderer<Entity> renderer = (EntityRenderer<Entity>) Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(current);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		PoseStack pose = new PoseStack();
		pose.scale(1F, -1F, 1F);
		pose.mulPose(Vector3f.ZP.rotationDegrees(180));
		pose.mulPose(Vector3f.XP.rotationDegrees(PITCH_ANGLE));
		pose.mulPose(Vector3f.YP.rotationDegrees(-VIEW_ANGLE));

		try {
			MeasuringBufferSource measure = new MeasuringBufferSource();
			renderer.render(current, 0, (float) 1.0, pose, measure, 0x00f000f0);
			MeasuringBufferSource.MeasuringResult bounds = measure.getData();
			if (bounds == null || bounds.maxX() <= bounds.minX() || bounds.maxY() <= bounds.minY()) {
				PVZMod.LOGGER.error("plant screenshot: {} 测量不到有效渲染范围, 跳过", ForgeRegistries.ENTITY_TYPES.getKey(current.getType()));
				return;
			}
			float spanX = bounds.maxX() - bounds.minX();
			float spanY = bounds.maxY() - bounds.minY();
			float viewSide = Math.max(spanX, spanY) / FILL_FRACTION;
			float half = viewSide / 2;
			float cx = (bounds.minX() + bounds.maxX()) / 2;
			float bottom = bounds.minY() - viewSide * 0.10F;

			target.setClearColor(0F, 0F, 0F, 0F);
			target.clear(false);
			target.bindWrite(true);
			RenderSystem.backupProjectionMatrix();
			RenderSystem.setProjectionMatrix(Matrix4f.orthographic(cx - half, cx + half, bottom, bottom + viewSide, -100F, 100F));
			MultiBufferSource.BufferSource buffer = MultiBufferSource.immediate(new BufferBuilder(512));
			RenderSystem.disableCull();
			renderer.render(current, 0, (float) 1.0, pose, buffer, 0x00f000f0);
			buffer.endBatch();
			RenderSystem.enableCull();
			RenderSystem.restoreProjectionMatrix();
			target.unbindWrite();

			Minecraft.getInstance().getMainRenderTarget().bindWrite(true);
			target.bindRead();
			NativeImage image = new NativeImage(target.width, target.height, false);
			image.downloadTexture(0, false);
			target.unbindRead();
			Files.createDirectories(OUT_DIR);
			Path file = OUT_DIR.resolve(ForgeRegistries.ENTITY_TYPES.getKey(current.getType()).getPath().toLowerCase(Locale.ROOT) + ".png");
			Util.ioPool().execute(() -> {
				try (NativeImage img = image) {
					img.writeToFile(file);
				} catch (IOException e) {
					PVZMod.LOGGER.error("plant screenshot: 写 {} 失败", file, e);
				}
			});
		} catch (Exception e) {
			PVZMod.LOGGER.error("plant screenshot: 渲染/导出 {} 失败", ForgeRegistries.ENTITY_TYPES.getKey(current.getType()), e);
		}
	}

	//计测缓冲源：拦截实体渲染提交的顶点，记录变换到世界坐标后的范
	private static final class MeasuringBufferSource implements MultiBufferSource {
		private final MeasuringVertexConsumer instance = new MeasuringVertexConsumer();

		@Override
		public VertexConsumer getBuffer(RenderType renderType) {
			return instance;
		}

		MeasuringResult getData() {
			return instance.data;
		}

		record MeasuringResult(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
			MeasuringResult(float x, float y, float z) {
				this(x, y, z, x, y, z);
			}

			MeasuringResult measure(float x, float y, float z) {
				float mMinX = Math.min(minX, x);
				float mMinY = Math.min(minY, y);
				float mMinZ = Math.min(minZ, z);
				float mMaxX = Math.max(maxX, x);
				float mMaxY = Math.max(maxY, y);
				float mMaxZ = Math.max(maxZ, z);
				return new MeasuringResult(mMinX, mMinY, mMinZ, mMaxX, mMaxY, mMaxZ);
			}
		}

		private static final class MeasuringVertexConsumer implements VertexConsumer {
			private MeasuringResult data;

			private void record(float x, float y, float z) {
				data = data == null ? new MeasuringResult(x, y, z) : data.measure(x, y, z);
			}

			@Override
			public VertexConsumer vertex(double x, double y, double z) {
				record((float) x, (float) y, (float) z);
				return this;
			}

			@Override
			public VertexConsumer color(int r, int g, int b, int a) {
				return this;
			}

			@Override
			public VertexConsumer uv(float u, float v) {
				return this;
			}

			@Override
			public VertexConsumer overlayCoords(int u, int v) {
				return this;
			}

			@Override
			public VertexConsumer uv2(int u, int v) {
				return this;
			}

			@Override
			public VertexConsumer normal(float nx, float ny, float nz) {
				return this;
			}

			@Override
			public void endVertex() {
			}

			@Override
			public void defaultColor(int r, int g, int b, int a) {
			}

			@Override
			public void unsetDefaultColor() {
			}
		}
	}
}