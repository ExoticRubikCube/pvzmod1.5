package com.hungteen.pvz.api.types;

import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import net.minecraft.world.level.block.Block;

public interface ICardPlacement {

    /**
     * {@link PVZPlantEntity#shouldWilt()}
     */
    boolean canPlaceOnBlock(Block block);

    /**
     * whether a plant declaring plantPlacement can ride a container declaring this placement.
     * ANY overrides this to accept every rider; other placements only accept the same one.
     * a null carrier placement is handled by the caller as no restriction.
     */
    default boolean canPlantOn(ICardPlacement plantPlacement) {
        return plantPlacement == this;
    }

}