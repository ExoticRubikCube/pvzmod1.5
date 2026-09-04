package com.hungteen.pvz.data.loot;

import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.misc.PVZLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PVZEntityLootTables implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>> {

	@Override
	public void accept(BiConsumer<ResourceLocation, LootTable.Builder> t) {
		t.accept(PVZLoot.NORMAL_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.ZOMBIE_DOLL.get()))
						.add(LootItem.lootTableItem(Items.BAMBOO))
						.add(LootItem.lootTableItem(ItemRegister.ALMANAC.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.001F, 0.01F))
		));
		t.accept(PVZLoot.FLAG_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.ZOMBIE_FLAG.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.CONEHEAD_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.CONE_HEAD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.BUCKETHEAD_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.BUCKET_HEAD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.SCREENDOOR_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.SCREEN_DOOR.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.FOOTBALL_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.FOOTBALL_HELMET.get()))
				        .add(LootItem.lootTableItem(ItemRegister.FOOTBALL_CHESTPLATE.get()))
				        .add(LootItem.lootTableItem(ItemRegister.FOOTBALL_LEGGINGS.get()))
				        .add(LootItem.lootTableItem(ItemRegister.FOOTBALL_BOOTS.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F))
		));
		t.accept(PVZLoot.GIGA_FOOTBALL_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.GIGA_HELMET.get()))
				        .add(LootItem.lootTableItem(ItemRegister.GIGA_CHESTPLATE.get()))
				        .add(LootItem.lootTableItem(ItemRegister.GIGA_LEGGINGS.get()))
				        .add(LootItem.lootTableItem(ItemRegister.GIGA_BOOTS.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F))
		));
		t.accept(PVZLoot.NOBLE_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.TIME_KEY_TO_DEEP.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1F, 0.01F)))
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(Items.MYCELIUM))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.08F, 0.01F))
		));
		t.accept(PVZLoot.COFFIN, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(Items.MYCELIUM))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.08F, 0.01F))
		));
		t.accept(PVZLoot.MOURNER_ZOMBIE, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.SPORE.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.2F, 0.01F))
		));
		t.accept(PVZLoot.BOBSLE_TEAM, getZombieLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.BOBSLE_CAR.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.05F, 0.01F))
		));
		t.accept(PVZLoot.ZOMBIE_DOLPHIN, getRottenFleshLootTable());
		t.accept(PVZLoot.FOODIE_ZOMBIE, getRottenFleshLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.REAL_BRAIN.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.2F, 0.01F))
		));
		t.accept(PVZLoot.LAVA_ZOMBIE, getRottenFleshLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.PEPPER.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.02F, 0.01F))
		));
		t.accept(PVZLoot.PUMPKIN_ZOMBIE, getRottenFleshLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.CANDY.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.1F, 0.01F))
				).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.PUMPKIN_ENJOY_CARD.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.TRICK_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.CANDY.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.1F, 0.01F))
		));
		t.accept(PVZLoot.JACK_IN_BOX_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.JACK_BOX.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F))
		));
		t.accept(PVZLoot.BALLOON_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.BALLOON.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.DIGGER_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.ORIGIN_PICKAXE.get()))
				        .add(LootItem.lootTableItem(Items.DIAMOND_PICKAXE))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.RA_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.RESOURCE_COLLECTOR.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.001F, 0.01F))
		));
		t.accept(PVZLoot.BUNGEE_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.TARGET_ARROW.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F))
		));
		t.accept(PVZLoot.LADDER_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(BlockRegister.STEEL_LADDER.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.1F, 0.01F))
		));
		t.accept(PVZLoot.GARGANTUAR, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.POLE.get()))
				        .add(LootItem.lootTableItem(ItemRegister.ZOMBIE_DOLL.get()))
				        .add(LootItem.lootTableItem(ItemRegister.WARNING_SIGN.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F))
		));
		t.accept(PVZLoot.GIGA_GARGANTUAR, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.POLE.get()))
				        .add(LootItem.lootTableItem(ItemRegister.ZOMBIE_DOLL.get()))
				        .add(LootItem.lootTableItem(ItemRegister.WARNING_SIGN.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.08F, 0.01F))
		));
		t.accept(PVZLoot.EDGAR_090505, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(BlockRegister.SILVER_SUNFLOWER_TROPHY.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1F, 0.01F))
				).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.ZOMBIE_ON_YOUR_LAWN.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1F, 0.01F))
				).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.TIME_SOURCE.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.6F, 0.01F))
		));
		t.accept(PVZLoot.EDGAR_090517, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(BlockRegister.GOLD_SUNFLOWER_TROPHY.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1F, 0.01F))
				).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.ZOMBIE_ON_YOUR_LAWN.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1F, 0.01F))
				).withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(ItemRegister.TIME_SOURCE.get()))
						.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.6F, 0.01F))
				));
		t.accept(PVZLoot.PEASHOOTER_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.PEA_SHOOTER_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.WALLNUT_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.WALL_NUT_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.GATLINGPEA_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.GATLING_PEA_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.004F, 0.01F))
		));
		t.accept(PVZLoot.TALLNUT_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.TALL_NUT_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
		t.accept(PVZLoot.SQUASH_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.SQUASH_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.008F, 0.01F))
		));
		t.accept(PVZLoot.JALAPENO_ZOMBIE, getLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				        .add(LootItem.lootTableItem(ItemRegister.JALAPENO_ENJOY_CARD.get()))
				        .when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.005F, 0.01F))
		));
	}
	
	private static LootTable.Builder getLootTable() {
		return LootTable.lootTable();
	}
	
	private static LootTable.Builder getRottenFleshLootTable() {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				.add(LootItem.lootTableItem(Items.ROTTEN_FLESH))
				.apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 2.0F)))
				.apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))
				.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.15F, 0.01F)));
	}
	
	private static LootTable.Builder getZombieLootTable() {
		return getRottenFleshLootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				.add(LootItem.lootTableItem(ItemRegister.CORN_SEEDS.get()))
				.add(LootItem.lootTableItem(Items.SUNFLOWER))
				.add(LootItem.lootTableItem(ItemRegister.NUT.get()))
				.when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.01F, 0.01F)));
	}

}
