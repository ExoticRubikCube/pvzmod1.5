package com.hungteen.pvz.common.world.structure.zombie;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.misc.PVZLoot;
import com.hungteen.pvz.common.world.structure.PVZTemplateComponent;
import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.ChunkPos;
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

public class BucketHouseComponents {

	public static final ResourceLocation res1 = StringUtil.prefix("zombie_house/bucket_house");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		accessor.addPiece(new BucketHouseComponent(manager, res1, pos1, rotation));
	}

	public static class BucketHouseComponent extends PVZTemplateComponent {

		public BucketHouseComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.BUCKET_HOUSE_PIECE.get(), manager, nbt);
		}

		public BucketHouseComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.BUCKET_HOUSE_PIECE.get(), manager, res, pos, rotation);
		}

		@Override
		public void postProcess(WorldGenLevel worldIn, StructureManager p_226900_, ChunkGenerator chunkGeneratorIn, RandomSource randomIn,
				BoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn, BlockPos blockPos) {
			BlockPos mid = BlockPos.ZERO;
			int dx = 6, dz = 5;
			switch (rotation) {
			case CLOCKWISE_90:
				mid = this.templatePosition.offset(-dz, 0, dx);
				break;
			case CLOCKWISE_180:
				mid = this.templatePosition.offset(-dx, 0, -dz);
				break;
			case COUNTERCLOCKWISE_90:
				mid = this.templatePosition.offset(dz, 0, -dx);
				break;
			default:
				mid = this.templatePosition.offset(dx, 0, dz);
				break;
			}
			int height = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, mid.getX(), mid.getZ());
			this.templatePosition = new BlockPos(this.templatePosition.getX(), height + 1, this.templatePosition.getZ());
			super.postProcess(worldIn, p_226900_, chunkGeneratorIn, randomIn, mutableBoundingBoxIn, chunkPosIn, blockPos);
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, net.minecraft.world.level.ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("bonus_chest1")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.BUCKET_HOUSE_CHEST, null);
			} else if (function.equals("bonus_chest2")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.BUCKET_HOUSE_CHEST, null);
			} else if (function.equals("spawner")) {
				worldIn.setBlock(pos, Blocks.SPAWNER.defaultBlockState(), 2);
				BlockEntity te = worldIn.getBlockEntity(pos);
				if (te instanceof SpawnerBlockEntity spawner) {
					spawner.getSpawner().setEntityId(getRandomEntityType(rand));
				}
			}
		}

		protected EntityType<?> getRandomEntityType(RandomSource rand) {
			int num = rand.nextInt(3);
			if (num == 0) return EntityRegister.CONEHEAD_ZOMBIE.get();
			if (num == 1) return EntityRegister.POLE_ZOMBIE.get();
			if (num == 2) return EntityRegister.BUCKETHEAD_ZOMBIE.get();
			return null;
		}

	}

}
