package com.hungteen.pvz.common.command;

import com.hungteen.pvz.common.world.challenge.ChallengeManager;
import com.hungteen.pvz.common.world.invasion.InvasionManager;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.SharedSuggestionProvider;
import net.minecraft.commands.synchronization.SuggestionProviders;

public class PVZSuggestionProviders {

    public static final SuggestionProvider<CommandSourceStack> ALL_INVASIONS = SuggestionProviders.register(StringUtil.prefix("all_invasion"), (commandContext, builder) -> {
        return SharedSuggestionProvider.suggestResource(InvasionManager.getIds(), builder);
    });

    public static final SuggestionProvider<CommandSourceStack> ALL_CHALLENGES = SuggestionProviders.register(StringUtil.prefix("all_challenge"), (commandContext, builder) -> {
        return SharedSuggestionProvider.suggestResource(ChallengeManager.getIds(), builder);
    });
}