package com.hungteen.pvz.common.world.structure.shop;

import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

public class DaveVillaStructure extends Structure {

	public static final Codec<DaveVillaStructure> CODEC = simpleCodec(DaveVillaStructure::new);

	public DaveVillaStructure(StructureSettings settings) {
		super(settings);
	}

	@Override
	public Optional<GenerationStub> findGenerationPoint(GenerationContext ctx) {
		ChunkGenerator generator = ctx.chunkGenerator();
		Rotation rotation = Rotation.values()[ctx.random().nextInt(Rotation.values().length)];
		final int len = 50;
		int x = ctx.chunkPos().getMinBlockX();
		int z = ctx.chunkPos().getMinBlockZ();
		int dx = 0, dz = 0;
		switch (rotation) {
		case CLOCKWISE_90:
			dx -= len;
			dz += len;
			break;
		case CLOCKWISE_180:
			dx -= len;
			dz -= len;
			break;
		case COUNTERCLOCKWISE_90:
			dx += len;
			dz -= len;
			break;
		default:
			dx += len;
			dz += len;
			break;
		}
		int h1 = generator.getFirstOccupiedHeight(x, z, Heightmap.Types.WORLD_SURFACE_WG, ctx.heightAccessor(), ctx.randomState());
		int h2 = generator.getFirstOccupiedHeight(x, z + dz, Heightmap.Types.WORLD_SURFACE_WG, ctx.heightAccessor(), ctx.randomState());
		int h3 = generator.getFirstOccupiedHeight(x + dx, z, Heightmap.Types.WORLD_SURFACE_WG, ctx.heightAccessor(), ctx.randomState());
		int h4 = generator.getFirstOccupiedHeight(x + dx, z + dz, Heightmap.Types.WORLD_SURFACE_WG, ctx.heightAccessor(), ctx.randomState());
		int h = (h1 + h2 + h3 + h4) / 4;
		BlockPos blockpos = new BlockPos(x, h, z);
		return Optional.of(new GenerationStub(blockpos, (StructurePiecesBuilder builder) -> {
			DaveVillaComponents.generate(ctx.structureTemplateManager(), blockpos, rotation, builder, ctx.random());
		}));
	}

	@Override
	public StructureType<?> type() {
		return StructureRegister.DAVE_VILLA_TYPE.get();
	}

}
