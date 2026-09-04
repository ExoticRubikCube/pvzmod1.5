package com.hungteen.pvz.compat.jei;

import com.hungteen.pvz.client.ClientProxy;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.Objects;

public class PVZJEIHandler {

    public static RecipeManager getRecipeManager(){
        ClientLevel world = Objects.requireNonNull(ClientProxy.MC.level);
        return world.getRecipeManager();
    }

}
