package com.hungteen.pvz.common.block.special;

import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.plant.light.GoldLeafEntity;
import com.hungteen.pvz.utils.ConfigUtil;
import com.hungteen.pvz.utils.PlantUtil;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class GoldTileBlock extends Block {

	public final int lvl;
	
	public GoldTileBlock(int lvl) {
		super(Properties.copy(Blocks.GOLD_BLOCK).strength(6.0F, 6.0F));
		this.lvl = lvl;
	}

	@Override
	public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
		if(! level.isClientSide()) {
			level.scheduleTick(pos, this, ConfigUtil.getPlantMinimumTick());
		}
	}

	@Override
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if(this.lvl > 1) {
			level.setBlockAndUpdate(pos, GoldLeafEntity.getGoldTileByLvl(this.lvl - 1).defaultBlockState());
		} else {
			level.setBlockAndUpdate(pos, Blocks.GOLD_BLOCK.defaultBlockState());
			this.convertPlantsOnGoldTile(level, pos);
		}
	}

	/**
	 * convert plants planted on this tile into sun refunds, including container plants and their riding passengers.
	 */
	private void convertPlantsOnGoldTile(ServerLevel level, BlockPos pos) {
		final List<PVZPlantEntity> plants = level.getEntitiesOfClass(PVZPlantEntity.class, new AABB(pos).inflate(1.0D, 3.0D, 1.0D));
		for(PVZPlantEntity plant : plants) {
			if(plant.blockPosition().below().equals(pos)
					|| plant.getVehicle() instanceof PVZPlantEntity vehicle && vehicle.blockPosition().below().equals(pos)) {
				plant.getOwnerPlayer().ifPresent(player -> PlayerUtil.addResource(player, Resources.SUN_NUM, PlantUtil.getPlantRefundSunCost(plant.getPlantType())));
				plant.discard();
			}
		}
	}

}
