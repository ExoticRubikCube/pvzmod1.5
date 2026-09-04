package com.hungteen.pvz.common.event;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.block.cubes.OriginBlock;
import com.hungteen.pvz.common.item.ItemRegister;
import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.TagsUpdatedEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class PVZMiscEvents {

    @SubscribeEvent
    public static void onTagsChange(TagsUpdatedEvent event){
        OriginBlock.updateRadiationMap(event.getRegistryAccess().registryOrThrow(Registry.BLOCK_REGISTRY));
    }

    @SubscribeEvent
    public static void addTrades(WandererTradesEvent event){
        event.getRareTrades().add((e, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 8), new ItemStack(ItemRegister.SPORE.get()), 8, 5, 0.05F));
        event.getGenericTrades().add((e, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.BAMBOO), 12, 8, 0.05F));
        event.getGenericTrades().add((e, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(Items.SUNFLOWER), 12, 8, 0.05F));
        event.getGenericTrades().add((e, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(BlockRegister.CHOMPER.get()), 12, 8, 0.05F));
        event.getRareTrades().add((e, r) -> new MerchantOffer(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.MYCELIUM), 4, 15, 0.05F));
    }

}