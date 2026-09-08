package com.hungteen.pvz.common.command;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.command.client.PlantScreenshotCommand;
import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.commands.CommandSourceStack;
import net.minecraftforge.client.event.RegisterClientCommandsEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PVZMod.MOD_ID)
public class PVZCommandHandler {

	@SubscribeEvent
    public static void init(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        ResourceCommand.register(dispatcher);
        PAZCommand.register(dispatcher);
        InvasionCommand.register(dispatcher);
        ChallengeCommand.register(dispatcher);
    }

    @SubscribeEvent
    public static void clientInit(RegisterClientCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();
        PlantScreenshotCommand.register(dispatcher);
    }
}