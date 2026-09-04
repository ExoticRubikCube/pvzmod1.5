package com.hungteen.pvz.common.world.structure.zombie;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.zombie.grass.TombStoneEntity;
import com.hungteen.pvz.common.misc.PVZLoot;
import com.hungteen.pvz.common.world.structure.PVZTemplateComponent;
import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePieceAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class GraveHouseComponents {

	public static final ResourceLocation res = StringUtil.prefix("zombie_house/graveyard");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		accessor.addPiece(new GraveHouseComponent(manager, res, pos1, rotation));
	}

	public static class GraveHouseComponent extends PVZTemplateComponent {

		public GraveHouseComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.GRAVE_HOUSE_PIECE.get(), manager, nbt);
		}

		public GraveHouseComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.GRAVE_HOUSE_PIECE.get(), manager, res, pos, rotation);
		}

		@Override
		public void postProcess(WorldGenLevel worldIn, StructureManager p_226900_, ChunkGenerator chunkGeneratorIn, RandomSource randomIn,
				BoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn, BlockPos blockPos) {
			int dx = 15, dz = 15;
			switch (rotation) {
			case CLOCKWISE_90:
				dx = -15;
				break;
			case CLOCKWISE_180:
				dx = dz = -15;
				break;
			case COUNTERCLOCKWISE_90:
				dz = -15;
				break;
			default:
				break;
			}
			int x = this.templatePosition.getX();
			int z = this.templatePosition.getZ();
			int h1 = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, x, z);
			int h2 = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, x + dx, z);
			int h3 = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, x, z + dz);
			int h4 = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, x + dx, z + dz);
			int height = Math.min(Math.min(h1, h2), Math.min(h3, h4));
			this.templatePosition = new BlockPos(x, height, z);
			super.postProcess(worldIn, p_226900_, chunkGeneratorIn, randomIn, mutableBoundingBoxIn, chunkPosIn, blockPos);
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("bonus_chest1")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.GRAVE_YARD_CHEST, null);
			} else if (function.equals("bonus_chest2")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.GRAVE_YARD_CHEST, null);
			} else if (function.equals("spawner")) {
				worldIn.setBlock(pos, Blocks.SPAWNER.defaultBlockState(), 2);
				BlockEntity te = worldIn.getBlockEntity(pos);
				if (te instanceof SpawnerBlockEntity spawner) {
					spawner.getSpawner().setEntityId(getRandomEntityType(rand));
				}
			} else if (function.startsWith("tomb")) {
				if (rand.nextInt(3) == 0 && worldIn instanceof ServerLevel serverLevel) {
					TombStoneEntity tomb = EntityRegister.TOMB_STONE.get().create(serverLevel);
					EntityUtil.onEntitySpawn(worldIn, tomb, pos);
					worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
				}
			}
		}

		protected EntityType<?> getRandomEntityType(RandomSource rand) {
			int num = rand.nextInt(2);
			if (num == 0) return EntityRegister.GIGA_FOOTBALL_ZOMBIE.get();
			else if (num == 1) return EntityRegister.FOOTBALL_ZOMBIE.get();
			return null;
		}

	}

}
