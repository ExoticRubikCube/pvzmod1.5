package com.hungteen.pvz.common.world.structure.shop;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.npc.SunDaveEntity;
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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePieceAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class SunTempleComponents {

	public static final ResourceLocation res = StringUtil.prefix("shop/sun_temple");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		accessor.addPiece(new SunTempleComponent(manager, res, pos1, rotation));
	}

	public static class SunTempleComponent extends PVZTemplateComponent {

		public SunTempleComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.SUN_TEMPLE_PIECE.get(), manager, nbt);
		}

		public SunTempleComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.SUN_TEMPLE_PIECE.get(), manager, res, pos, rotation);
		}

		@Override
		public void postProcess(WorldGenLevel worldIn, StructureManager manager, ChunkGenerator chunkGeneratorIn, RandomSource randomIn,
				BoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn, BlockPos blockPos) {
			super.postProcess(worldIn, manager, chunkGeneratorIn, randomIn, mutableBoundingBoxIn, chunkPosIn, blockPos);
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("spawn")) {
				if (worldIn instanceof ServerLevel serverLevel) {
					SunDaveEntity dave = EntityRegister.SUN_DAVE.get().create(serverLevel);
					EntityUtil.onEntitySpawn(worldIn, dave, pos.above());
				}
			} else if (function.equals("chest")) {
				this.createChest(worldIn, sbb, rand, pos.above(), PVZLoot.SUN_TEMPLE_CHEST, null);
				worldIn.setBlock(pos, Blocks.SPAWNER.defaultBlockState(), 2);
				BlockEntity te = worldIn.getBlockEntity(pos);
				if (te instanceof SpawnerBlockEntity spawner) {
					spawner.getSpawner().setEntityId(EntityRegister.RA_ZOMBIE.get());
				}
			}
		}

	}
}
