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

public class YetiHouseStructure extends Structure {

	public static final Codec<YetiHouseStructure> CODEC = simpleCodec(YetiHouseStructure::new);

	public YetiHouseStructure(StructureSettings settings) {
		super(settings);
	}

	@Override
	public Optional<GenerationStub> findGenerationPoint(GenerationContext ctx) {
		return onTopOfChunkCenter(ctx, Heightmap.Types.WORLD_SURFACE_WG, (StructurePiecesBuilder builder) -> {
			Rotation rotation = Rotation.values()[ctx.random().nextInt(Rotation.values().length)];
			BlockPos pos = new BlockPos(ctx.chunkPos().getMinBlockX(), 90, ctx.chunkPos().getMinBlockZ());
			YetiHouseComponents.generate(ctx.structureTemplateManager(), pos, rotation, builder, ctx.random());
		});
	}

	@Override
	public StructureType<?> type() {
		return StructureRegister.YETI_HOUSE_TYPE.get();
	}

}
