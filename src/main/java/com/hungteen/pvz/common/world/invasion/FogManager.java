package com.hungteen.pvz.common.world.invasion;

//remove.
public class FogManager {

//	public static final int CD = 100;
//
//	public static void tickFog(Level world) {
//		world.players().forEach((player) -> {
//			player.getCapability(CapabilityHandler.PLAYER_DATA_CAPABILITY).ifPresent((l) -> {
//				int now = l.getPlayerData().getResource(Resources.NO_FOG_TICK);
//				int newTick = (shouldFogOn(world, player)) ? Mth.clamp(now - 1, - CD, 0) : Mth.clamp(now + 1, - CD, 0);
//				if(newTick != now) {
//					l.getPlayerData().setResource(Resources.NO_FOG_TICK, newTick);
//				}
//			});
//		});
//	}
//
//	private static boolean shouldFogOn(Level world, Player player) {
//		return world.dimension().equals(Level.OVERWORLD) && ! world.isDay() && ! world.isRainingAt(player.blockPosition()) && PVZInvasionData.getOverWorldInvasionData(world).hasEvent(InvasionEvents.FOG) && (player != null && PlayerUtil.isPlayerSurvival(player) && ! player.isUnderWater()
//				&& player.getPose() != Pose.SWIMMING && ! player.hasEffect(EffectRegister.LIGHT_EYE_EFFECT.get()));
//	}
	
}