package com.hungteen.pvz.api.types;

import javax.annotation.Nullable;

/**
 * container plant that other plants can ride on.
 * the declared placement restricts the rider's placement;
 * null means no restriction and every rider passes.
 */
public interface IPlantCarrier {

	@Nullable
	default ICardPlacement getCarryPlacement() {
		return null;
	}

}
