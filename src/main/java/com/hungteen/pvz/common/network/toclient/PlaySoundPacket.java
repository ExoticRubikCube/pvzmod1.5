package com.hungteen.pvz.common.network.toclient;

import java.util.function.Supplier;

import com.hungteen.pvz.PVZMod;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class PlaySoundPacket {

	private String type;
	
	public PlaySoundPacket(String type) {
		this.type = type;
	}
	
	public PlaySoundPacket(FriendlyByteBuf buffer) {
		this.type = buffer.readUtf();
	}

	public void encode(FriendlyByteBuf buffer) {
		buffer.writeUtf(type);
	}

	public static class Handler {
		public static void onMessage(PlaySoundPacket message, Supplier<NetworkEvent.Context> ctx) {
		    ctx.get().enqueueWork(()->{
		    	SoundEvent sound = ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse(message.type));
		    	if(sound != null && PVZMod.PROXY.getPlayer() != null) {
		    		PVZMod.PROXY.getPlayer().playSound(sound, 1F, 1F);
		    	}
		    });
		    ctx.get().setPacketHandled(true);
	    }
	}
}