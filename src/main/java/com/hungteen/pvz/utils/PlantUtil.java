package com.hungteen.pvz.utils;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;

public class PlantUtil {

    public static final int MAX_PLANT_LEVEL = 20;
    public static final float PUMPKIN_LIFE = 400;
    public static final float PUMPKIN_SUPER_LIFE = 400;
    //1  2  3  4  5  6   7   8   9   10  11  12  13   14   15   16   17   18   19   20
    public static int CURRENT_PLANT_NUM = 0;

    /**
     * refund sun cost equivalent of a plant: upgrade plants (purple rank) refund the base plant cost plus their own cost.
     */
    public static int getPlantRefundSunCost(IPlantType type) {
        return type.getUpgradeFrom().isPresent()
                ? type.getUpgradeFrom().get().getSunCost() + type.getSunCost()
                : type.getSunCost();
    }

    /**
     * copy data from p1 to p2
     */
    public static void copyPlantData(PVZPlantEntity p2, PVZPlantEntity p1) {
        p2.setSkills(p1.getSkills());
        p2.setCharmed(p1.isCharmed());
        p2.setOwnerUUID(p1.getOwnerUUID().orElse(null));
    }

}
