package com.hungteen.pvz.common;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class CommonProxy {

	protected float ladderSpeed = 0;

	public void init() {
	}

	public void postInit() {
		
	}
	
	public void setUp() {
	}
	
	public void setUpClient() {
		
	}

	/**
	 * climp up on client side.
	 */
	public void climbUp() {
	}

	public Player getPlayer(){
		return null;
	}

	public Level getLevel() {
		return null;
	}

}