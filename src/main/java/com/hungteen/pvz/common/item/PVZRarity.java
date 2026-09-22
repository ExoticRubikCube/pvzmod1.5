package com.hungteen.pvz.common.item;

import com.hungteen.pvz.api.types.IRankType;
import com.hungteen.pvz.common.impl.RankTypes;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Rarity;

/**
 * @program: pvzmod-1.16.5
 * @author: HungTeen
 * @create: 2022-01-22 22:20
 **/
public class PVZRarity{

    public static final Rarity GRAY = Rarity.create("gray", ChatFormatting.GRAY);
    public static final Rarity WHITE = Rarity.create("white", ChatFormatting.WHITE);
    public static final Rarity GREEN = Rarity.create("green", ChatFormatting.GREEN);
    public static final Rarity BLUE = Rarity.create("blue", ChatFormatting.BLUE);
    public static final Rarity PURPLE = Rarity.create("purple", ChatFormatting.LIGHT_PURPLE);
    public static final Rarity GOLD = Rarity.create("gold", ChatFormatting.GOLD);
    public static final Rarity RED = Rarity.create("red", ChatFormatting.RED);
    public static final Rarity BLACK = Rarity.create("black", ChatFormatting.DARK_GRAY);

    public static Rarity getRarityByRank(IRankType rankType){
        Rarity rarity = Rarity.COMMON;
        if (rankType == RankTypes.GRAY) {
            rarity = GRAY;
        } else if (rankType == RankTypes.WHITE) {
            rarity = WHITE;
        } else if (rankType == RankTypes.GREEN) {
            rarity = GREEN;
        } else if (rankType == RankTypes.BLUE) {
            rarity = BLUE;
        } else if (rankType == RankTypes.PURPLE) {
            rarity = PURPLE;
        } else if (rankType == RankTypes.GOLD) {
            rarity = GOLD;
        } else if (rankType == RankTypes.RED) {
            rarity = RED;
        } else if (rankType == RankTypes.BLACK) {
            rarity = BLACK;
        }
        return rarity;
    }

}