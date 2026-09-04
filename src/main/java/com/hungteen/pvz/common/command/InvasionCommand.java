package com.hungteen.pvz.common.command;

import com.hungteen.pvz.common.world.invasion.InvasionManager;
import com.hungteen.pvz.common.world.invasion.InvasionType;
import com.hungteen.pvz.utils.PlayerUtil;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;

public class InvasionCommand {

	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        LiteralArgumentBuilder<CommandSourceStack> builder = Commands.literal("invasion").requires((ctx) -> {return ctx.hasPermission(2);});

		builder.then(Commands.literal("event")
				.then(Commands.argument("targets", EntityArgument.players())
				.then(Commands.literal("set")
						.then(Commands.argument("invasion_type", ResourceLocationArgument.id()).suggests(PVZSuggestionProviders.ALL_INVASIONS)
								.executes((commond) -> {
									return setInvasionEvent(commond.getSource(), EntityArgument.getPlayers(commond, "targets"), ResourceLocationArgument.getId(commond, "invasion_type"));
								})))
				.then(Commands.literal("add")
						.then(Commands.argument("invasion_type", ResourceLocationArgument.id()).suggests(PVZSuggestionProviders.ALL_INVASIONS)
								.executes((commond) -> {
									return addInvasionEvent(commond.getSource(), EntityArgument.getPlayers(commond, "targets"), ResourceLocationArgument.getId(commond, "invasion_type"));
								})))
				.then(Commands.literal("remove")
						.then(Commands.argument("invasion_type", ResourceLocationArgument.id()).suggests(PVZSuggestionProviders.ALL_INVASIONS)
								.executes((commond) -> {
									return removeInvasionEvent(commond.getSource(), EntityArgument.getPlayers(commond, "targets"), ResourceLocationArgument.getId(commond, "invasion_type"));
								})))
				.then(Commands.literal("show")
						.executes((commond)->{
							return showInvasionEvent(commond.getSource(), EntityArgument.getPlayers(commond, "targets"));
						})))
				.then(Commands.literal("stop")
						.executes((commond)->{
							return stopInvasionEvent(commond.getSource());
						}))
		);

//		builder.then(Commands.literal("wave")
//				.then(Commands.argument("targets", EntityArgument.players())
//						.then(Commands.literal("start")
//								.then(Commands.argument("wave_num", IntegerArgumentType.integer())
//										.executes(commond -> {
//											return spawnHugeWave(EntityArgument.getPlayers(commond, "targets"), IntegerArgumentType.getInteger(commond, "wave_num"));
//										}).then(Commands.argument("amount", IntegerArgumentType.integer())
//												.executes(command -> {
//													return spawnHugeWave(EntityArgument.getPlayers(command, "targets"), IntegerArgumentType.getInteger(command, "wave_num"), IntegerArgumentType.getInteger(command, "amount"));
//												}))))
//						.then(Commands.literal("time")
//								.then(Commands.argument("pos", IntegerArgumentType.integer())
//										.then(Commands.argument("time", IntegerArgumentType.integer())
//												.executes(commond -> {
//													return setWaveTime(commond.getSource(), EntityArgument.getPlayers(commond, "targets"), IntegerArgumentType.getInteger(commond, "pos"), IntegerArgumentType.getInteger(commond, "time"));
//												}))))
//						.then(Commands.literal("trigger")
//								.then(Commands.argument("pos", IntegerArgumentType.integer())
//										.then(Commands.argument("flag", BoolArgumentType.bool())
//												.executes(commond -> {
//													return setTriggered(commond.getSource(), EntityArgument.getPlayers(commond, "targets"), IntegerArgumentType.getInteger(commond, "pos"), BoolArgumentType.getBool(commond, "flag"));
//												})))))

//		);

        dispatcher.register(builder);
    }

//	private static int spawnHugeWave(Collection<? extends ServerPlayer> targets, int waveNum) {
//		return spawnHugeWave(targets, waveNum, 0);
//	}

//	private static int spawnHugeWave(Collection<? extends ServerPlayer> targets, int waveNum, int amount) {
//		targets.forEach(player -> {
//			WaveManager manager = new WaveManager(player, waveNum);
//			if(amount != 0){
//				manager.spawnCnt = amount;
//			}
//			manager.spawnWaveZombies();
//		});
//		return targets.size();
//	}

	private static int setWaveTime(CommandSourceStack source, Collection<? extends ServerPlayer> targets, int waveNum, int time) {
		if(waveNum < 0 || waveNum >= InvasionManager.MAX_WAVE_NUM) {
			source.sendFailure(Component.translatable("command.pvz.invasion.out_of_bound"));
		} else{
			targets.forEach(player -> {
				PlayerUtil.getOptManager(player).ifPresent(l -> l.getInvasion().setWaveTime(waveNum, time));
			});
		}
		return targets.size();
	}

	private static int setTriggered(CommandSourceStack source, Collection<? extends ServerPlayer> targets, int waveNum, boolean flag) {
		if(waveNum < 0 || waveNum >= InvasionManager.MAX_WAVE_NUM) {
			source.sendFailure(Component.translatable("command.pvz.invasion.out_of_bound"));
		} else{
			targets.forEach(player -> {
				PlayerUtil.getOptManager(player).ifPresent(l -> l.getInvasion().setWaveTriggered(waveNum, flag));
			});
		}
		return targets.size();
	}

	public static int setInvasionEvent(CommandSourceStack source, Collection<? extends ServerPlayer> targets, ResourceLocation res) {
		InvasionType type = InvasionManager.getInvasion(res);
		if(type != null){
			if(! type.isAssistInvasion()){
				targets.forEach(serverPlayer -> PlayerUtil.getInvasion(serverPlayer).setSpawnInvasion(res));
				source.sendSuccess(Component.translatable("command.pvz.invasion.set", res.toString()), true);
			} else{
				source.sendFailure(Component.translatable("command.pvz.invasion.assist", res.toString()));
			}
		} else{
			source.sendFailure(Component.translatable("command.pvz.invasion.invalid", res.toString()));
		}
		return 0;
	}

	public static int addInvasionEvent(CommandSourceStack source, Collection<? extends ServerPlayer> targets, ResourceLocation res) {
		InvasionType type = InvasionManager.getInvasion(res);
		if(type != null){
			if(type.isAssistInvasion()){
				targets.forEach(serverPlayer -> PlayerUtil.getInvasion(serverPlayer).addAssistInvasion(res));
				source.sendSuccess(Component.translatable("command.pvz.invasion.add", res.toString()), true);
			} else{
				source.sendFailure(Component.translatable("command.pvz.invasion.spawn", res.toString()));
			}
		} else{
			source.sendFailure(Component.translatable("command.pvz.invasion.invalid", res.toString()));
		}
		return 0;
	}

	public static int removeInvasionEvent(CommandSourceStack source, Collection<? extends ServerPlayer> targets, ResourceLocation res) {
		InvasionType type = InvasionManager.getInvasion(res);
		if(type != null){
			if(type.isAssistInvasion()){
				targets.forEach(serverPlayer -> PlayerUtil.getInvasion(serverPlayer).removeAssistInvasion(res));
				source.sendSuccess(Component.translatable("command.pvz.invasion.remove", res.toString()), true);
			} else{
				source.sendFailure(Component.translatable("command.pvz.invasion.spawn", res.toString()));
			}
		} else{
			source.sendFailure(Component.translatable("command.pvz.invasion.invalid", res.toString()));
		}
		return 0;
	}
	
	private static int stopInvasionEvent(CommandSourceStack source) {
		InvasionManager.deactivateInvasion(source.getLevel(), false);
		source.sendSuccess(Component.translatable("command.pvz.invasion.clear"), true);
		return 0;
	}
	
	private static int showInvasionEvent(CommandSourceStack source, Collection<? extends ServerPlayer> targets) {
		targets.forEach(player -> {
			PlayerUtil.getInvasion(player).getActiveInvasions().forEach(type -> {
				source.sendSuccess(type.getText(), true);
			});
		});
		return targets.size();
	}
	
}