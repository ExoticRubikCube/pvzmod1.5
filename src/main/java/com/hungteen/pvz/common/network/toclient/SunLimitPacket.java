package com.hungteen.pvz.common.network.toclient;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.utils.PlayerUtil;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SunLimitPacket {

	private final int limit;

	public SunLimitPacket(int limit) {
		this.limit = limit;
	}

	public SunLimitPacket(FriendlyByteBuf buffer) {
		this.limit = buffer.readInt();
	}

	public void encode(FriendlyByteBuf buffer) {
		buffer.writeInt(this.limit);
	}

	public static class Handler {
		public static void onMessage(SunLimitPacket message, Supplier<NetworkEvent.Context> ctx) {
			ctx.get().enqueueWork(() -> {
				PlayerUtil.setSunLimitOverride(PVZMod.PROXY.getPlayer(), message.limit);
			});
			ctx.get().setPacketHandled(true);
		}
	}
}
