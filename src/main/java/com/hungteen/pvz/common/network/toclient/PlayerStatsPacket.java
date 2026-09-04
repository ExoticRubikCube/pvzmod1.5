package com.hungteen.pvz.common.network.toclient;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.utils.PlayerUtil;
import com.hungteen.pvz.utils.enums.Resources;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PlayerStatsPacket{

	private final int type;
	private final int data;
	
	public PlayerStatsPacket(int x, int y) {
		this.type = x;
		this.data = y;
	}
	
	public PlayerStatsPacket(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.data = buffer.readInt();
	}

	public void encode(FriendlyByteBuf buffer) {
		buffer.writeInt(this.type);
		buffer.writeInt(this.data);
	}

	public static class Handler {
		public static void onMessage(PlayerStatsPacket message, Supplier<NetworkEvent.Context> ctx) {
			ctx.get().enqueueWork(() -> {
				PlayerUtil.setResource(PVZMod.PROXY.getPlayer(), Resources.values()[message.type], message.data);
			});
		    ctx.get().setPacketHandled(true);
	    }
	}
}