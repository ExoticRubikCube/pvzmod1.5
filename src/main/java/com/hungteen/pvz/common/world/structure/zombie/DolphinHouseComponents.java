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
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePieceAccessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public class DolphinHouseComponents {

	public static final ResourceLocation res = StringUtil.prefix("zombie_house/dolphin_house");

	public static void generate(StructureTemplateManager manager, BlockPos pos1, Rotation rotation, StructurePieceAccessor accessor, RandomSource rand) {
		accessor.addPiece(new DolphinHouseComponent(manager, res, pos1, rotation));
	}

	public static class DolphinHouseComponent extends PVZTemplateComponent {

		public DolphinHouseComponent(StructureTemplateManager manager, CompoundTag nbt) {
			super(StructureRegister.DOLPHIN_HOUSE_PIECE.get(), manager, nbt);
		}

		public DolphinHouseComponent(StructureTemplateManager manager, ResourceLocation res, BlockPos pos, Rotation rotation) {
			super(StructureRegister.DOLPHIN_HOUSE_PIECE.get(), manager, res, pos, rotation);
		}

		@Override
		protected void handleDataMarker(String function, BlockPos pos, ServerLevelAccessor worldIn, RandomSource rand,
				BoundingBox sbb) {
			if (function.equals("bonus_chest1")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.DOLPHIN_HOUSE_CHEST, null);
			} else if (function.equals("bonus_chest2")) {
				this.createChest(worldIn, sbb, rand, pos, PVZLoot.DOLPHIN_HOUSE_CHEST, null);
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
			if (num == 0) return EntityRegister.SNORKEL_ZOMBIE.get();
			else if (num == 1) return EntityRegister.LAVA_ZOMBIE.get();
			else if (num == 2) return EntityRegister.DOLPHIN_RIDER_ZOMBIE.get();
			return null;
		}

	}

}
