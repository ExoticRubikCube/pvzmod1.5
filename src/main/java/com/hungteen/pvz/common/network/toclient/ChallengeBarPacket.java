package com.hungteen.pvz.common.network.toclient;

import com.hungteen.pvz.api.raid.IChallengeComponent;
import com.hungteen.pvz.client.challenge.ChallengeBgmManager;
import com.hungteen.pvz.client.challenge.ClientChallengeBarManager;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
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
	private final BitSet givenUpWaves;
	private final boolean bossChallenge;
	private final boolean bgmPlaying;
	private final boolean remove;

	public ChallengeBarPacket(int challengeId, UUID challengeBarId, ResourceLocation resource, int totalWaves, int currentWave, BitSet bigWaves, BitSet givenUpWaves, boolean bossChallenge, boolean bgmPlaying) {
		this.challengeId = challengeId;
		this.challengeBarId = challengeBarId;
		this.resource = resource;
		this.totalWaves = totalWaves;
		this.currentWave = currentWave;
		this.bigWaves = bigWaves;
		this.givenUpWaves = givenUpWaves;
		this.bossChallenge = bossChallenge;
		this.bgmPlaying = bgmPlaying;
		this.remove = false;
	}

	private ChallengeBarPacket(int challengeId) {
		this.challengeId = challengeId;
		this.challengeBarId = null;
		this.resource = null;
		this.totalWaves = 0;
		this.currentWave = 0;
		this.bigWaves = new BitSet();
		this.givenUpWaves = new BitSet();
		this.bossChallenge = false;
		this.bgmPlaying = false;
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
			this.givenUpWaves = new BitSet();
			this.bossChallenge = false;
			this.bgmPlaying = false;
		} else {
			this.challengeBarId = buf.readUUID();
			this.resource = buf.readResourceLocation();
			this.totalWaves = buf.readInt();
			this.currentWave = buf.readInt();
			this.bigWaves = BitSet.valueOf(buf.readLongArray());
			this.givenUpWaves = BitSet.valueOf(buf.readLongArray());
			this.bossChallenge = buf.readBoolean();
			this.bgmPlaying = buf.readBoolean();
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
			buf.writeLongArray(this.givenUpWaves.toLongArray());
			buf.writeBoolean(this.bossChallenge);
			buf.writeBoolean(this.bgmPlaying);
		}
	}

	public void handle(Supplier<NetworkEvent.Context> ctx) {
		ctx.get().enqueueWork(() -> {
			if(this.remove) {
				ClientChallengeBarManager.remove(this.challengeId);
				ChallengeBgmManager.remove(this.challengeId);
			} else {
				ClientChallengeBarManager.update(this.challengeId, this.challengeBarId, this.resource, this.totalWaves, this.currentWave, this.bigWaves, this.givenUpWaves, this.bossChallenge);
				if(this.bgmPlaying) {
					final IChallengeComponent component = ChallengeManager.getChallengeByResource(this.resource);
					if(component != null && component.getBgmSound() != null) {
						ChallengeBgmManager.play(this.challengeId, component.getBgmSound().getLocation());
					}
				} else {
					ChallengeBgmManager.remove(this.challengeId);
				}
			}
		});
		ctx.get().setPacketHandled(true);
	}
}
