package com.hungteen.pvz.common.network.toclient;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.client.render.entity.zombie.PVZZombieRender;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;

import java.util.Optional;
import java.util.function.Supplier;

public class SpawnBodyPartPacket {

	private final int bodyType;
	private final int entityId;
	private final Optional<Vec3> damageSourcePos;

	public SpawnBodyPartPacket(int bodyType, int entityId, Vec3 sourcePos) {
		this.bodyType = bodyType;
		this.entityId = entityId;
		this.damageSourcePos = Optional.ofNullable(sourcePos);
	}

	public SpawnBodyPartPacket(FriendlyByteBuf buffer) {
		this.bodyType = buffer.readInt();
		this.entityId = buffer.readInt();
		boolean hasSource = buffer.readBoolean();
		if (hasSource) {
			this.damageSourcePos = Optional.of(new Vec3(buffer.readDouble(), buffer.readDouble(), buffer.readDouble()));
		} else {
			this.damageSourcePos = Optional.empty();
		}
	}

	public void encode(FriendlyByteBuf buffer) {
		buffer.writeInt(this.bodyType);
		buffer.writeInt(this.entityId);
		buffer.writeBoolean(this.damageSourcePos.isPresent());
		this.damageSourcePos.ifPresent(vec -> {
			buffer.writeDouble(vec.x);
			buffer.writeDouble(vec.y);
			buffer.writeDouble(vec.z);
		});
	}

	public static class Handler {
		public static void onMessage(SpawnBodyPartPacket message, Supplier<NetworkEvent.Context> ctx) {
			ctx.get().enqueueWork(() -> {
				ClientLevel clientLevel = ClientProxy.MC.level;
				if (clientLevel != null) {
					Entity entity = clientLevel.getEntity(message.entityId);
					if (entity instanceof PVZZombieEntity zombie) {
						EntityRenderer<?> renderer = ClientProxy.MC.getEntityRenderDispatcher().getRenderer(entity);
						if (renderer instanceof PVZZombieRender zombieRender) {
							zombieRender.createBodyParticle(zombie, BodyType.values()[message.bodyType], message.damageSourcePos);
						}
					}
				}
			});
			ctx.get().setPacketHandled(true);
		}
	}
}