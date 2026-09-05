package com.hungteen.pvz.common.tileentity;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.client.render.tileentity.EssenceAltarTER;
import com.hungteen.pvz.client.render.tileentity.SunConverterTER;
import com.hungteen.pvz.common.block.BlockRegister;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TileEntityRegister {

	public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PVZMod.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<SunConverterTileEntity>> SUN_CONVERTER = TILE_ENTITY_TYPES.register("sun_converter", () -> {
		return BlockEntityType.Builder.of(SunConverterTileEntity::new , BlockRegister.SUN_CONVERTER.get()).build(null);
	});
	public static final RegistryObject<BlockEntityType<FragmentSpliceTileEntity>> FRAGMENT_SPLICE = TILE_ENTITY_TYPES.register("fragment_splice", () -> {
		return BlockEntityType.Builder.of(FragmentSpliceTileEntity::new , BlockRegister.FRAGMENT_SPLICE.get()).build(null);
	});
	public static final RegistryObject<BlockEntityType<SlotMachineTileEntity>> SLOT_MACHINE = TILE_ENTITY_TYPES.register("slot_machine", () -> {
		return BlockEntityType.Builder.of(SlotMachineTileEntity::new , BlockRegister.SLOT_MACHINE.get()).build(null);
	});
	public static final RegistryObject<BlockEntityType<CardFusionTileEntity>> CARD_FUSION = TILE_ENTITY_TYPES.register("card_fusion", () -> {
		return BlockEntityType.Builder.of(CardFusionTileEntity::new , BlockRegister.CARD_FUSION_TABLE.get()).build(null);
	});
	public static final RegistryObject<BlockEntityType<SunFlowerTrophyTileEntity>> SUNFLOWER_TROPHY = TILE_ENTITY_TYPES.register("sunflower_trophy", () -> {
		return BlockEntityType.Builder.of(SunFlowerTrophyTileEntity::new , BlockRegister.SILVER_SUNFLOWER_TROPHY.get(), BlockRegister.GOLD_SUNFLOWER_TROPHY.get(), BlockRegister.DIAMOND_SUNFLOWER_TROPHY.get()).build(null);
	});
	public static final RegistryObject<BlockEntityType<EssenceAltarTileEntity>> ESSENCE_ALTAR = TILE_ENTITY_TYPES.register("essence_altar", () -> {
		return BlockEntityType.Builder.of(EssenceAltarTileEntity::new , BlockRegister.ESSENCE_ALTAR.get()).build(null);
	});
	
	@OnlyIn(Dist.CLIENT)
	public static void bindRenderers(FMLClientSetupEvent ev) {
		ev.enqueueWork(() -> net.minecraft.client.Minecraft.getInstance().tell(() -> {
			BlockEntityRenderers.register(TileEntityRegister.SUN_CONVERTER.get(), ctx -> new SunConverterTER(ctx.getBlockEntityRenderDispatcher()));
			BlockEntityRenderers.register(TileEntityRegister.ESSENCE_ALTAR.get(), EssenceAltarTER::new);
		}));
	}
	
}