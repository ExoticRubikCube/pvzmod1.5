package com.hungteen.pvz.common.block.plants;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.utils.MathUtil;
import com.hungteen.pvz.utils.WorldUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class ChomperBlock extends BushBlock{

	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D);
	
	public ChomperBlock() {
		super(Block.Properties.copy(Blocks.PUMPKIN).noOcclusion());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@Override
	public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
		if(entityIn instanceof Animal || entityIn instanceof Player) {
			if(!worldIn.isClientSide) {
				if(worldIn.getRandom().nextInt(50) == 0) {
					entityIn.hurt(PVZEntityDamageSource.CHOMPER_PLANT, 8);
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player,
			InteractionHand handIn, BlockHitResult hit) {
		if(player.getItemInHand(handIn).getItem() == Items.BONE_MEAL) {
			if(worldIn.isClientSide) {
				for(int i = 0 ;i < 5; ++ i) {
					WorldUtil.spawnRandomSpeedParticle(worldIn, ParticleTypes.COMPOSTER, MathUtil.toVector(pos), 0.1F);
				}
			}
			for(int i = -2; i <= 2; ++ i) {
				for(int k = -2; k <= 2; ++ k) {
					final BlockPos tmp = WorldUtil.getSuitableHeightPos(worldIn, pos.offset(i, 0, k)).below();
					if(Math.abs(pos.getY() - tmp.getY()) < 5 && mayPlaceOn(worldIn.getBlockState(tmp), worldIn, tmp)) {
						if(worldIn.isEmptyBlock(tmp.above())){
							if(! worldIn.isClientSide) {
								player.getItemInHand(handIn).shrink(1);
							    if(worldIn.getRandom().nextFloat() < 0.2F) {
								    worldIn.setBlockAndUpdate(tmp.above(), BlockRegister.CHOMPER.get().defaultBlockState().rotate(Rotation.getRandom(worldIn.getRandom())));
							    }
							}
						}
					}
				}
			}
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
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

	@Override
	public BlockPathTypes getBlockPathType(BlockState state, BlockGetter world, BlockPos pos, @Nullable Mob entity) {
		return BlockPathTypes.DANGER_OTHER;
	}
	
}