package com.hungteen.pvz;

import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.common.CommonProxy;
import com.hungteen.pvz.common.advancement.AdvancementHandler;
import com.hungteen.pvz.common.block.cubes.OriginBlock;
import com.hungteen.pvz.common.datapack.PVZDataPackManager;
import com.hungteen.pvz.common.entity.AbstractPAZEntity;
import net.minecraft.core.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(PVZMod.MOD_ID)
@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class PVZMod {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    // Mod ID.
	public static final String MOD_ID = "pvz";
	// Mod Version.
	public static final String MOD_VERSION = "0.6.6";
	// Proxy of Server and Client.
	public static CommonProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);

	@SuppressWarnings("removal")
    public PVZMod() {
		PVZConfig.register(ModLoadingContext.get());
    	IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    	RegistryHandler.deferredRegister(modBus);

    	IEventBus forgeBus = MinecraftForge.EVENT_BUS;
		//BiomeLoadingEvent已废弃，若需修改 Biome 建议改用 JSON Biome Modifiers
		// forgeBus.addListener(EventPriority.HIGH, BiomeRegister::biomeModification);
		forgeBus.addListener(EventPriority.NORMAL, PVZDataPackManager::addReloadListenerEvent);
    	
    	AdvancementHandler.init();
    	RegistryHandler.coreRegister();

    	PROXY.init();
    }
    
	@SubscribeEvent
    public static void setUpComplete(FMLLoadCompleteEvent event) {
        PROXY.postInit();
    }
	
	@SubscribeEvent
	public static void setUp(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
            PROXY.setUp();
            RegistryHandler.setUp(event);
			OriginBlock.updateRadiationMap(Registry.BLOCK);
		});
    }
	
	@SubscribeEvent
	public static void setUpClient(FMLClientSetupEvent event) {
        PROXY.setUpClient();
    }

	@SubscribeEvent
	public static void onCommonConfigLoaded(final ModConfigEvent.Loading event) {
		if (event.getConfig().getModId().equals(MOD_ID)) {
			if (event.getConfig().getType() == Type.COMMON && PVZConfig.COMMON_CONFIG != null) {
				AbstractPAZEntity.refreshFromConfig();
			}
		}
	}

	@SubscribeEvent
	public static void onCommonConfigReloaded(final ModConfigEvent.Reloading event) {
		if (event.getConfig().getModId().equals(MOD_ID)) {
			if (event.getConfig().getType() == Type.COMMON && PVZConfig.COMMON_CONFIG != null) {
				AbstractPAZEntity.refreshFromConfig();
			}
		}
	}
}
