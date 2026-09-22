package com.hungteen.pvz.common.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class OpenGuiPacket {

	private final int type;

	public OpenGuiPacket(int type) {
		this.type = type;
	}

	public OpenGuiPacket(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
	}

	public void encode(FriendlyByteBuf buffer) {
		buffer.writeInt(this.type);
	}

	public static class Handler {
		public static void onMessage(OpenGuiPacket message, Supplier<NetworkEvent.Context> ctx) {
		ctx.get().setPacketHandled(true);
		}
	}
}