package com.hungteen.pvz.common.network.toclient;

import com.hungteen.pvz.client.challenge.ClientChallengeBarManager;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkEvent;

import java.util.BitSet;
import java.util.UUID;
import java.util.function.Supplier;

public class ChallengeBarPacket {

	private final int challengeId;
	private final UUID challengeBarId;
	private final ResourceLocation resource;
	private final int totalWaves;
	private final int currentWave;
	private final BitSet bigWaves;
	private final boolean remove;

	public ChallengeBarPacket(int challengeId, UUID challengeBarId, ResourceLocation resource, int totalWaves, int currentWave, BitSet bigWaves) {
		this.challengeId = challengeId;
		this.challengeBarId = challengeBarId;
		this.resource = resource;
		this.totalWaves = totalWaves;
		this.currentWave = currentWave;
		this.bigWaves = bigWaves;
		this.remove = false;
	}

	private ChallengeBarPacket(int challengeId) {
		this.challengeId = challengeId;
		this.challengeBarId = null;
		this.resource = null;
		this.totalWaves = 0;
		this.currentWave = 0;
		this.bigWaves = new BitSet();
		this.remove = true;
	}

	public static ChallengeBarPacket remove(int challengeId) {
		return new ChallengeBarPacket(challengeId);
	}

	public ChallengeBarPacket(FriendlyByteBuf buf) {
		this.challengeId = buf.readInt();
		this.remove = buf.readBoolean();
		if (this.remove) {
			this.challengeBarId = null;
			this.resource = null;
			this.totalWaves = 0;
			this.currentWave = 0;
			this.bigWaves = new BitSet();
		} else {
			this.challengeBarId = buf.readUUID();
			this.resource = buf.readResourceLocation();
			this.totalWaves = buf.readInt();
			this.currentWave = buf.readInt();
			this.bigWaves = BitSet.valueOf(buf.readLongArray());
		}
	}

	public void encode(FriendlyByteBuf buf) {
		buf.writeInt(this.challengeId);
		buf.writeBoolean(this.remove);
		if (!this.remove) {
			buf.writeUUID(this.challengeBarId);
			buf.writeResourceLocation(this.resource);
			buf.writeInt(this.totalWaves);
			buf.writeInt(this.currentWave);
			buf.writeLongArray(this.bigWaves.toLongArray());
		}
	}

	public void handle(Supplier<NetworkEvent.Context> ctx) {
		ctx.get().enqueueWork(() -> {
			if(this.remove) {
				ClientChallengeBarManager.remove(this.challengeId);
			} else {
				ClientChallengeBarManager.update(this.challengeId, this.challengeBarId, this.resource, this.totalWaves, this.currentWave, this.bigWaves);
			}
		});
		ctx.get().setPacketHandled(true);
	}
}
