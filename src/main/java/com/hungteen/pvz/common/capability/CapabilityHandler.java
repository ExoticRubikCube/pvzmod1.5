package com.hungteen.pvz.common.capability;


import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.capability.challenge.IRaiderDataCapability;
import com.hungteen.pvz.common.capability.challenge.RaiderDataProvider;
import com.hungteen.pvz.common.capability.player.IPlayerDataCapability;
import com.hungteen.pvz.common.capability.player.PlayerDataProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CapabilityHandler {

	public static final Capability<IPlayerDataCapability> PLAYER_DATA_CAPABILITY =
			CapabilityManager.get(new CapabilityToken<>() {});

	public static final Capability<IRaiderDataCapability> RAIDER_DATA_CAPABILITY =
			CapabilityManager.get(new CapabilityToken<>() {});

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.register(IPlayerDataCapability.class);
		event.register(IRaiderDataCapability.class);
	}

	@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
	private static final class ForgeEvents {
		@SubscribeEvent
		public static void attachCapability(AttachCapabilitiesEvent<Entity> event){
			Entity entity = event.getObject();
			if (entity instanceof Player){
				event.addCapability(new ResourceLocation(PVZMod.MOD_ID, "player_data"), new PlayerDataProvider((Player) entity));
			}
			event.addCapability(new ResourceLocation(PVZMod.MOD_ID, "challenge_data"), new RaiderDataProvider(0));
		}
	}
}