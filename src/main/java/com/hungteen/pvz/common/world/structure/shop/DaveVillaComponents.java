package com.hungteen.pvz.common.world.structure.shop;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.entity.npc.CrazyDaveEntity;
import com.hungteen.pvz.common.entity.npc.PennyEntity;
import com.hungteen.pvz.common.entity.plant.appease.PeaShooterEntity;
import com.hungteen.pvz.common.entity.plant.defence.WallNutEntity;
import com.hungteen.pvz.common.entity.plant.light.SunFlowerEntity;
import com.hungteen.pvz.common.misc.PVZLoot;
import com.hungteen.pvz.common.world.structure.PVZTemplateComponent;
import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePieceAccessor;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class DaveVillaComponents {

	public static final BlockState BASE_BLOCK = Blocks.DIRT.defaultBlockState();
	public static final ResourceLocation res1 = StringUtil.prefix("dave_villa/davevilla1");
	public static final ResourceLocation res2 = StringUtil.prefix("dave_villa/davevilla2");
	public static final ResourceLocation res3 = StringUtil.prefix("dave_villa/davevilla3");
	public static final ResourceLocation res4 = StringUtil.prefix("dave_villa/davevilla4");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		BlockPos pos2, pos3, pos4;
		switch (rotation) {
		case CLOCKWISE_90:
			pos2 = pos1.offset(0, 0, 32);
			pos3 = pos1.offset(-32, 0, 0);
			pos4 = pos2.offset(-32, 0, 0);
			break;
		case CLOCKWISE_180:
			pos2 = pos1.offset(-32, 0, 0);
			pos3 = pos1.offset(0, 0, -32);
			pos4 = pos2.offset(0, 0, -32);
			break;
		case COUNTERCLOCKWISE_90:
			pos2 = pos1.offset(0, 0, -32);
			pos3 = pos1.offset(32, 0, 0);
			pos4 = pos2.offset(32, 0, 0);
			break;
		default:
			pos2 = pos1.offset(32, 0, 0);
			pos3 = pos1.offset(0, 0, 32);
			pos4 = pos2.offset(0, 0, 32);
			break;
		}
		accessor.addPiece(new DaveVillaComponent(manager, res1, pos1, rotation));
		accessor.addPiece(new DaveVillaComponent(manager, res2, pos2, rotation));
		accessor.addPiece(new DaveVillaComponent(manager, res3, pos3, rotation));
		accessor.addPiece(new DaveVillaComponent(manager, res4, pos4, rotation));
	}

	public static class DaveVillaComponent extends PVZTemplateComponent {

		public DaveVillaComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.DAVE_VILLA_PIECE.get(), manager, nbt);
		}

		public DaveVillaComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.DAVE_VILLA_PIECE.get(), manager, res, pos, rotation);
		}

		public BlockPos getBlockPos() {
			return this.templatePosition;
		}

		@Override
		protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tagCompound) {
			super.addAdditionalSaveData(context, tagCompound);
			tagCompound.putString("StructureTemplate", this.res.toString());
			tagCompound.putString("Rot", this.rotation.name());
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("dave")) {
				ServerLevel serverLevel = worldIn.getLevel();
				CrazyDaveEntity dave = EntityRegister.CRAZY_DAVE.get().create(serverLevel);
				EntityUtil.onEntitySpawn(serverLevel, dave, pos);
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("panney")) {
				ServerLevel serverLevel = worldIn.getLevel();
				PennyEntity panney = EntityRegister.PANNEY.get().create(serverLevel);
				EntityUtil.onEntitySpawn(serverLevel, panney, pos);
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos1")) {
				if (rand.nextInt(3) == 0) {
					ServerLevel serverLevel = worldIn.getLevel();
					PeaShooterEntity nut = EntityRegister.PEA_SHOOTER.get().create(serverLevel);
					EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				}
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos2")) {
				if (rand.nextInt(3) == 0) {
					ServerLevel serverLevel = worldIn.getLevel();
					SunFlowerEntity nut = EntityRegister.SUN_FLOWER.get().create(serverLevel);
					EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				}
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos3")) {
				if (rand.nextInt(3) == 0) {
					ServerLevel serverLevel = worldIn.getLevel();
					PeaShooterEntity nut = EntityRegister.PEA_SHOOTER.get().create(serverLevel);
					EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				}
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos4")) {
				if (rand.nextInt(2) == 0) {
					ServerLevel serverLevel = worldIn.getLevel();
					WallNutEntity nut = EntityRegister.WALL_NUT.get().create(serverLevel);
					EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				}
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos5")) {
				ServerLevel serverLevel = worldIn.getLevel();
				SunFlowerEntity nut = EntityRegister.SUN_FLOWER.get().create(serverLevel);
				EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("plant_pos6")) {
				if (rand.nextInt(2) == 0) {
					ServerLevel serverLevel = worldIn.getLevel();
					PeaShooterEntity nut = EntityRegister.PEA_SHOOTER.get().create(serverLevel);
					EntityUtil.onEntitySpawn(serverLevel, nut, pos);
				}
				worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 2);
			} else if (function.equals("bonus_chest1")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.DAVE_VILLA_CHEST, null);
			} else if (function.equals("bonus_chest2")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.DAVE_VILLA_CHEST, null);
			}
		}

		@Override
		public void postProcess(WorldGenLevel worldIn, StructureManager manager, ChunkGenerator chunkGeneratorIn, RandomSource randomIn,
				BoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn, BlockPos blockPos) {
			BlockPos pos = this.templatePosition;
			Vec3i size = this.template.getSize();
			BlockPos ab = new BlockPos(0, size.getY(), 0);
            ab = switch (rotation) {
                case CLOCKWISE_90 -> ab.offset(-size.getZ(), 0, size.getX());
                case CLOCKWISE_180 -> ab.offset(-size.getX(), 0, -size.getZ());
                case COUNTERCLOCKWISE_90 -> ab.offset(size.getZ(), 0, -size.getX());
                default -> ab.offset(size.getX(), 0, size.getZ());
            };
			BlockPos to = pos.offset(ab.getX(), ab.getY(), ab.getZ());
			BlockPos min = new BlockPos(Math.min(pos.getX(), to.getX()), Math.min(pos.getY(), to.getY()), Math.min(pos.getZ(), to.getZ()));
			BlockPos max = new BlockPos(Math.max(pos.getX(), to.getX()), Math.max(pos.getY(), to.getY()), Math.max(pos.getZ(), to.getZ()));
			super.postProcess(worldIn, manager, chunkGeneratorIn, randomIn, mutableBoundingBoxIn, chunkPosIn, blockPos);
			int fillMinX = Math.max(min.getX(), mutableBoundingBoxIn.minX());
			int fillMaxX = Math.min(max.getX(), mutableBoundingBoxIn.maxX());
			int fillMinZ = Math.max(min.getZ(), mutableBoundingBoxIn.minZ());
			int fillMaxZ = Math.min(max.getZ(), mutableBoundingBoxIn.maxZ());
			for (int i = fillMinX; i <= fillMaxX; ++i) {
				for (int j = fillMinZ; j <= fillMaxZ; ++j) {
					int y = min.getY() - 1;
					while (y >= 50) {
						BlockPos tmp = new BlockPos(i, y, j);
						if (worldIn.getBlockState(tmp).canOcclude()) {
							break;
						} else {
							worldIn.setBlock(tmp, BASE_BLOCK, 3);
						}
						y--;
					}
				}
			}
		}

	}

}
