package com.hungteen.pvz.common.world.structure;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

public abstract class PVZTemplateComponent extends TemplateStructurePiece {

	private static final BlockPos STRUCTURE_OFFSET = BlockPos.ZERO;
	protected final Rotation rotation;
	protected final ResourceLocation res;

	private static StructurePlaceSettings makeSettings(Rotation rotation) {
		return new StructurePlaceSettings().setRotation(rotation)
				.setMirror(Mirror.NONE)
				.setRotationPivot(STRUCTURE_OFFSET)
				.addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK);
	}

	private static String displayName(ResourceLocation r) {
		return r.toString();
	}

	public PVZTemplateComponent(StructurePieceType type, StructureTemplateManager mgr, ResourceLocation res, BlockPos pos, Rotation rotation) {
		super(type, 0, mgr, res, displayName(res), makeSettings(rotation), pos);
		this.rotation = rotation;
		this.res = res;
	}

	public PVZTemplateComponent(StructurePieceType type, StructureTemplateManager mgr, CompoundTag tag) {
		super(type, tag, mgr, (resourceLocation) -> {
			Rotation rot = Rotation.valueOf(tag.getString("Rot"));
			return makeSettings(rot);
		});
		this.res = ResourceLocation.tryParse(tag.contains("StructureTemplate") ? tag.getString("StructureTemplate") : tag.getString("Template"));
		this.rotation = Rotation.valueOf(tag.getString("Rot"));
	}

	@Override
	protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tagCompound) {
		super.addAdditionalSaveData(context, tagCompound);
		if (this.res != null) {
			tagCompound.putString("StructureTemplate", this.res.toString());
		}
		tagCompound.putString("Rot", this.rotation.name());
	}

}
