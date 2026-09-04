package com.hungteen.pvz.data.loot;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.item.ItemRegister;

import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class PVZBlockLootTables implements Consumer<BiConsumer<ResourceLocation, LootTable.Builder>> {

	private final Set<Block> knownBlocks = new HashSet<>();
	private final Map<ResourceLocation, LootTable.Builder> lootTables = new HashMap<>();
	private LootItemCondition.Builder tmpBuilder;
	private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item()
			.hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
	private static final LootItemCondition.Builder HAS_SHEARS = MatchTool
			.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));
	private static final LootItemCondition.Builder HAS_SHEARS_OR_SILK_TOUCH = HAS_SHEARS.or(HAS_SILK_TOUCH);
	private static final LootItemCondition.Builder HAS_NO_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_OR_SILK_TOUCH.invert();
	private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

	@Override
	public void accept(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
		final Set<Block> noLootBlocks = new HashSet<>(Arrays.asList(
				BlockRegister.LILY_PAD.get(), BlockRegister.FLOWER_POT.get(),
				BlockRegister.SLOT_MACHINE.get()
			    ));
		// drop item like coal ore
		Arrays.asList(BlockRegister.ORIGIN_ORE.get(), BlockRegister.APPEASE_ORE.get(), BlockRegister.LIGHT_ORE.get(),
				BlockRegister.EXPLOSION_ORE.get(), BlockRegister.DEFENCE_ORE.get(), BlockRegister.ICE_ORE.get(),
				BlockRegister.ENFORCE_ORE.get(), BlockRegister.TOXIC_ORE.get(), BlockRegister.ASSIST_ORE.get(),
				BlockRegister.MAGIC_ORE.get(), BlockRegister.FLAME_ORE.get(), BlockRegister.SPEAR_ORE.get(),
				BlockRegister.ARMA_ORE.get(), BlockRegister.ELECTRIC_ORE.get(), BlockRegister.SHADOW_ORE.get())
				.forEach((object) -> {
					this.add(object, (block) -> createOreDrop(block, object.essence.getEssenceItem()));
				});
		// crop
		this.tmpBuilder = getAgeBuilder(BlockRegister.CABBAGE.get(), 3);
		this.add(BlockRegister.CABBAGE.get(),
				createCropDrops(BlockRegister.CABBAGE.get(), ItemRegister.CABBAGE.get(), this.tmpBuilder));
		this.tmpBuilder = getAgeBuilder(BlockRegister.CORN.get(), 7);
		this.add(BlockRegister.CORN.get(),
				createCropDrops(BlockRegister.CORN.get(), ItemRegister.CORN.get(), this.tmpBuilder));

		// leaves
		this.add(BlockRegister.NUT_LEAVES.get(), (block) -> {
			return createLeavesDrops(block, BlockRegister.NUT_SAPLING.get(), ItemRegister.NUT.get(), NORMAL_LEAVES_SAPLING_CHANCES);
		});

		// misc
		this.dropOther(BlockRegister.GOLD_TILE1.get(), Blocks.GOLD_BLOCK);
		this.dropOther(BlockRegister.GOLD_TILE2.get(), Blocks.GOLD_BLOCK);
		this.dropOther(BlockRegister.GOLD_TILE3.get(), Blocks.GOLD_BLOCK);

		// no-loot blocks get empty loot table
		for (Block block : noLootBlocks) {
			this.lootTables.put(block.getLootTable(), LootTable.lootTable());
		}

		// other blocks are drop itself
		ForgeRegistries.BLOCKS.forEach(block -> {
			ResourceLocation name = ForgeRegistries.BLOCKS.getKey(block);
			if (name != null && PVZMod.MOD_ID.equals(name.getNamespace())
					&& !noLootBlocks.contains(block) && !this.knownBlocks.contains(block)) {
				this.dropSelf(block);
			}
		});

		this.lootTables.forEach(consumer);
	}

	protected void add(Block block, LootTable.Builder builder) {
		this.lootTables.put(block.getLootTable(), builder);
		this.knownBlocks.add(block);
	}

	protected void add(Block block, Function<Block, LootTable.Builder> factory) {
		this.add(block, factory.apply(block));
	}

	protected void dropSelf(Block block) {
		this.dropOther(block, block);
	}

	protected void dropOther(Block block, ItemLike like) {
		this.add(block, LootTable.lootTable().withPool(LootPool.lootPool()
				.setRolls(ConstantValue.exactly(1.0F))
				.add(LootItem.lootTableItem(like).when(ExplosionCondition.survivesExplosion()))));
	}

	protected LootTable.Builder createOreDrop(Block block, Item dropItem) {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(block).when(HAS_SILK_TOUCH)
								.otherwise(LootItem.lootTableItem(dropItem)
										.apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
										.apply(ApplyExplosionDecay.explosionDecay()))));
	}

	private LootTable.Builder createCropDrops(Block block, Item crops, LootItemCondition.Builder bb) {
		return createCropDrops(block, crops, block.asItem(), bb);
	}

	private static LootTable.Builder createCropDrops(Block block, Item crops, Item seeds,
			LootItemCondition.Builder matureCondition) {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool()
						.add(LootItem.lootTableItem(crops).when(matureCondition)
								.otherwise(LootItem.lootTableItem(seeds)))
						.apply(ApplyExplosionDecay.explosionDecay()))
				.withPool(LootPool.lootPool().when(matureCondition)
						.add(LootItem.lootTableItem(seeds).apply(
								ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))));
	}

	private LootItemCondition.Builder getAgeBuilder(Block block, int age) {
		return LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, age));
	}

	protected static LootTable.Builder createLeavesDrops(Block leavesBlock, Block saplingBlock,
			Item drop, float... saplingChances) {
		return LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
						.add(LootItem.lootTableItem(leavesBlock).when(HAS_SHEARS_OR_SILK_TOUCH)
								.otherwise(LootItem.lootTableItem(saplingBlock)
										.when(BonusLevelTableCondition.bonusLevelFlatChance(
												Enchantments.BLOCK_FORTUNE, saplingChances))
										.when(ExplosionCondition.survivesExplosion()))))
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).when(HAS_NO_SHEARS_OR_SILK_TOUCH)
						.add(LootItem.lootTableItem(drop)
								.when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE,
										0.01F, 0.015F, 0.02F, 0.025F, 0.03F))
								.when(ExplosionCondition.survivesExplosion())));
	}

}
