package com.hungteen.pvz.common.block.plants;


import com.hungteen.pvz.common.entity.plant.spear.CatTailEntity;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.entity.zombie.pool.ZombieDolphinEntity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

public class LilyPadBlock extends BushBlock {

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	protected static final VoxelShape LILY_PAD_AABB = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 1.5D, 15.0D);

	public LilyPadBlock() {
		super(Block.Properties.copy(Blocks.LILY_PAD));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@SuppressWarnings("deprecation")
	public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
		super.entityInside(state, worldIn, pos, entityIn);
		if (worldIn instanceof ServerLevel) {
			if((entityIn instanceof PVZZombieEntity && !(entityIn instanceof ZombieDolphinEntity))) {
			    if(entityIn.isAlive() && ((PVZZombieEntity) entityIn).canBreakPlantBlock()) {
			        worldIn.destroyBlock(new BlockPos(pos), true, entityIn);
			    }
			} else if(entityIn instanceof CatTailEntity && ! ((CatTailEntity) entityIn).isImmuneToWeak()){
				 worldIn.destroyBlock(new BlockPos(pos), true, entityIn);
			}
		}
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return LILY_PAD_AABB;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected boolean mayPlaceOn(BlockState state, BlockGetter reader, BlockPos pos) {
	    return ! state.isAir();
	}

	public BlockState getStateForPlacement(Player player) {
		if(player == null) return this.defaultBlockState();
		return this.defaultBlockState().setValue(FACING, player.getDirection().getOpposite());
	}
	
	public BlockState getStateForPlacement(Direction direction) {
		return this.defaultBlockState().setValue(FACING, direction);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction direction = context.getHorizontalDirection().getOpposite();
		return this.defaultBlockState().setValue(FACING, direction);
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Nullable
	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter level, BlockPos pos, @Nullable Mob mob) {
		return BlockPathTypes.TRAPDOOR;
	}

}