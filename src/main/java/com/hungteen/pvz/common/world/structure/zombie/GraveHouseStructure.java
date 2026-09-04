package com.hungteen.pvz.common.world.structure.zombie;

import com.hungteen.pvz.common.world.structure.StructureRegister;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

public class GraveHouseStructure extends Structure {

	public static final Codec<GraveHouseStructure> CODEC = simpleCodec(GraveHouseStructure::new);

	public GraveHouseStructure(StructureSettings settings) {
		super(settings);
	}

	@Override
	public Optional<GenerationStub> findGenerationPoint(GenerationContext ctx) {
		return onTopOfChunkCenter(ctx, Heightmap.Types.WORLD_SURFACE_WG, (StructurePiecesBuilder builder) -> {
			Rotation rotation = Rotation.values()[ctx.random().nextInt(Rotation.values().length)];
			BlockPos pos = new BlockPos(ctx.chunkPos().getMinBlockX(), 63, ctx.chunkPos().getMinBlockZ());
			GraveHouseComponents.generate(ctx.structureTemplateManager(), pos, rotation, builder, ctx.random());
		});
	}

	@Override
	public StructureType<?> type() {
		return StructureRegister.GRAVE_HOUSE_TYPE.get();
	}

}
