package com.hungteen.pvz.common.command;

import com.hungteen.pvz.common.world.challenge.Challenge;
import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.hungteen.pvz.utils.ConfigUtil;
import com.hungteen.pvz.utils.PlayerUtil;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;

public class ChallengeCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        LiteralArgumentBuilder<CommandSourceStack> builder = Commands.literal("challenge").requires(ctx -> ctx.hasPermission(2));
        builder.then(Commands.literal("add")
                .then(Commands.argument("challenge_type", ResourceLocationArgument.id()).suggests(PVZSuggestionProviders.ALL_CHALLENGES)
                        .then(Commands.argument("pos", BlockPosArgument.blockPos()).executes(command -> {
                            return addChallenge(command.getSource(), ResourceLocationArgument.getId(command, "challenge_type"), BlockPosArgument.getLoadedBlockPos(command, "pos"));
                        }))));
        builder.then(Commands.literal("remove")
                .then(Commands.literal("nearby")
                        .then(Commands.argument("pos", BlockPosArgument.blockPos()).executes((command) -> {
                            return removeNearby(command.getSource(), BlockPosArgument.getLoadedBlockPos(command, "pos"));
                        }))).then(Commands.literal("all").executes((command) -> {
                    return removeAll(command.getSource());
                })));
        builder.then(Commands.literal("list")
                .then(Commands.argument("targets", EntityArgument.players()).executes((command) -> {
                    return showAllChallenge(command.getSource(), EntityArgument.getPlayers(command, "targets"));
                })));

        dispatcher.register(builder);
    }

    private static int addChallenge(CommandSourceStack source, ResourceLocation res, BlockPos pos) {
        if (ChallengeManager.getChallengeByResource(res) != null) {
            if (!ChallengeManager.hasChallengeNearby(source.getLevel(), pos)) {
                ChallengeManager.createChallenge(source.getLevel(), res, pos);
            } else {
                source.sendFailure(Component.translatable("command.pvz.challenge.exist"));
            }
        } else {
            source.sendFailure(Component.translatable("command.pvz.challenge.no", res.toString()));
        }
        return 1;
    }

    private static int removeNearby(CommandSourceStack source, BlockPos pos) {
        ChallengeManager.getChallenges(source.getLevel()).forEach(raid -> {
            if (raid.getCenter().closerThan(pos, ConfigUtil.getRaidRange())) {
                raid.remove();
            }
        });
        return 1;
    }

    private static int removeAll(CommandSourceStack source) {
        ChallengeManager.getChallenges(source.getLevel()).forEach(Challenge::remove);
        return 1;
    }

    private static int showAllChallenge(CommandSourceStack source, Collection<? extends ServerPlayer> targets) {
        ChallengeManager.getChallenges(source.getLevel()).forEach(raid -> {
            targets.forEach(p -> PlayerUtil.sendMsgTo(p, Component.literal(raid.getCenter().toString())));
        });
        return 1;
    }

}