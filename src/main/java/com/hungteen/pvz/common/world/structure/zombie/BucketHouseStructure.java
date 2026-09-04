package com.hungteen.pvz.common.world.structure.zombie;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

import com.hungteen.pvz.common.world.structure.StructureRegister;

public class BucketHouseStructure extends Structure {

	public static final Codec<BucketHouseStructure> CODEC = simpleCodec(BucketHouseStructure::new);

	public BucketHouseStructure(StructureSettings settings) {
		super(settings);
	}

	@Override
	public Optional<GenerationStub> findGenerationPoint(GenerationContext ctx) {
		return onTopOfChunkCenter(ctx, Heightmap.Types.WORLD_SURFACE_WG, (StructurePiecesBuilder builder) -> {
			Rotation rotation = Rotation.values()[ctx.random().nextInt(Rotation.values().length)];
			BlockPos pos = new BlockPos(ctx.chunkPos().getMinBlockX(), 90, ctx.chunkPos().getMinBlockZ());
			BucketHouseComponents.generate(ctx.structureTemplateManager(), pos, rotation, builder, ctx.random());
		});
	}

	@Override
	public StructureType<?> type() {
		return StructureRegister.BUCKET_HOUSE_TYPE.get();
	}

}
