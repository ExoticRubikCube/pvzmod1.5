package com.hungteen.pvz.common.world.structure.shop;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

import com.hungteen.pvz.common.world.structure.StructureRegister;

public class SunTempleStructure extends Structure {

	public static final Codec<SunTempleStructure> CODEC = simpleCodec(SunTempleStructure::new);

	public SunTempleStructure(StructureSettings settings) {
		super(settings);
	}

	@Override
	public Optional<GenerationStub> findGenerationPoint(GenerationContext ctx) {
		return onTopOfChunkCenter(ctx, Heightmap.Types.WORLD_SURFACE_WG, (StructurePiecesBuilder builder) -> {
			Rotation rotation = Rotation.values()[ctx.random().nextInt(Rotation.values().length)];
			int h = 180 + ctx.random().nextInt(10);
			BlockPos pos = new BlockPos(ctx.chunkPos().getMinBlockX(), h, ctx.chunkPos().getMinBlockZ());
			SunTempleComponents.generate(ctx.structureTemplateManager(), pos, rotation, builder, ctx.random());
		});
	}

	@Override
	public StructureType<?> type() {
		return StructureRegister.SUN_TEMPLE_TYPE.get();
	}

}
