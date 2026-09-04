package com.hungteen.pvz.common.world.structure.zombie;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.zombie.pool.YetiZombieEntity;
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
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePieceAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class YetiHouseComponents {

	public static final ResourceLocation res1 = StringUtil.prefix("zombie_house/yeti_house");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		accessor.addPiece(new YetiHouseComponent(manager, res1, pos1, rotation));
	}

	public static class YetiHouseComponent extends PVZTemplateComponent {

		public YetiHouseComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.YETI_HOUSE_PIECE.get(), manager, nbt);
		}

		public YetiHouseComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.YETI_HOUSE_PIECE.get(), manager, res, pos, rotation);
		}

		@Override
		public void postProcess(WorldGenLevel worldIn, StructureManager manager, ChunkGenerator chunkGeneratorIn, RandomSource randomIn,
				BoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn, BlockPos blockPos) {
			int height = worldIn.getHeight(Heightmap.Types.WORLD_SURFACE_WG, this.templatePosition.getX(), this.templatePosition.getZ());
			this.templatePosition = new BlockPos(this.templatePosition.getX(), height - 1, this.templatePosition.getZ());
			super.postProcess(worldIn, manager, chunkGeneratorIn, randomIn, mutableBoundingBoxIn, chunkPosIn, blockPos);
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("chest1")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.YETI_HOUSE_CHEST, null);
			} else if (function.equals("chest2")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.YETI_HOUSE_CHEST, null);
			} else if (function.equals("chest3")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.YETI_HOUSE_CHEST, null);
			} else if (function.equals("spawn")) {
				if (rand.nextInt(3) == 0 && worldIn instanceof ServerLevel serverLevel) {
					YetiZombieEntity yeti = EntityRegister.YETI_ZOMBIE.get().create(serverLevel);
					EntityUtil.onEntitySpawn(worldIn, yeti, pos);
					worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
				}
			}
		}
	}
}
