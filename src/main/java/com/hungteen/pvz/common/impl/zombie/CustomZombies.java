package com.hungteen.pvz.common.impl.zombie;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.types.IZombieType;
import com.hungteen.pvz.client.model.entity.zombie.other.MournerZombieModel;
import com.hungteen.pvz.client.model.entity.zombie.other.NobleZombieModel;
import com.hungteen.pvz.client.model.entity.zombie.other.TrickZombieModel;
import com.hungteen.pvz.client.model.entity.zombie.pool.LavaZombieModel;
import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.impl.RankTypes;
import com.hungteen.pvz.common.misc.PVZLoot;

import java.util.ArrayList;
import java.util.List;

public final class CustomZombies extends ZombieType {
	
	private static final List<IZombieType> LIST = new ArrayList<>();
	
	/*
	 * zombotany.
	 */
	
	public static final ZombieType LAVA_ZOMBIE = new CustomZombies("lava_zombie", new ZombieFeatures()
		    .rank(RankTypes.PURPLE).xp(36)
			.entityType(() -> EntityRegister.LAVA_ZOMBIE.get())
			.zombieModel(() -> () -> new LavaZombieModel(LavaZombieModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.loot(PVZLoot.LAVA_ZOMBIE)
			.eatCommonSkill(List.of())
	);
	
	public static final ZombieType MOURNER_ZOMBIE = new CustomZombies("mourner_zombie", new ZombieFeatures()
		    .rank(RankTypes.GREEN).xp(10)
			.entityType(() -> EntityRegister.MOURNER_ZOMBIE.get())
			.zombieModel(() -> () -> new MournerZombieModel(MournerZombieModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.loot(PVZLoot.LAVA_ZOMBIE)
			.commonSkill(List.of())
	);
	
	public static final ZombieType COFFIN = new CustomZombies("coffin", new ZombieFeatures()
		    .rank(RankTypes.BLACK).xp(100)
			.entityType(() -> EntityRegister.COFFIN.get())
			.scale(0.5F)
			.loot(PVZLoot.COFFIN)
			.commonSkill(List.of())
	);
	
	public static final ZombieType NOBLE_ZOMBIE = new CustomZombies("noble_zombie", new ZombieFeatures()
		    .rank(RankTypes.MEGA).xp(250)
			.entityType(() -> EntityRegister.NOBLE_ZOMBIE.get())
			.zombieModel(() -> () -> new NobleZombieModel(NobleZombieModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.loot(PVZLoot.NOBLE_ZOMBIE)
			.commonSkill(List.of())
	);
	
	public static final ZombieType TRICK_ZOMBIE = new CustomZombies("trick_zombie", new ZombieFeatures()
		    .rank(RankTypes.GRAY).xp(3)
			.entityType(() -> EntityRegister.TRICK_ZOMBIE.get())
			.zombieModel(() -> () -> new TrickZombieModel(TrickZombieModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.loot(PVZLoot.TRICK_ZOMBIE)
			.commonSkill(List.of())
	);
	
	public static final ZombieType GIGA_TOMBSTONE = new CustomZombies("giga_tomb_stone", new ZombieFeatures()
		    .rank(RankTypes.WHITE).xp(1)
			.entityType(() -> EntityRegister.GIGA_TOMB_STONE.get())
			.scale(0.5F)
	);
	
	public static void register() {
		registerZombies(LIST);
	}
	
	private CustomZombies(String name, ZombieFeatures features) {
		super(name, features);
		LIST.add(this);
	}

	@Override
	public int getSortPriority() {
		return 60;
	}

	@Override
	public String getCategoryName() {
		return "custom";
	}

	@Override
	public String getModID() {
		return PVZMod.MOD_ID;
	}

}