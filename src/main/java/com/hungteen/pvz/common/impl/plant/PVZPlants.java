package com.hungteen.pvz.common.impl.plant;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.PVZAPI;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.client.model.entity.plant.appease.*;
import com.hungteen.pvz.client.model.entity.plant.arma.CabbagePultModel;
import com.hungteen.pvz.client.model.entity.plant.arma.KernelPultModel;
import com.hungteen.pvz.client.model.entity.plant.arma.MelonPultModel;
import com.hungteen.pvz.client.model.entity.plant.assist.*;
import com.hungteen.pvz.client.model.entity.plant.defence.GarlicModel;
import com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel;
import com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel;
import com.hungteen.pvz.client.model.entity.plant.defence.WallNutModel;
import com.hungteen.pvz.client.model.entity.plant.enforce.ChomperModel;
import com.hungteen.pvz.client.model.entity.plant.enforce.SquashModel;
import com.hungteen.pvz.client.model.entity.plant.enforce.TangleKelpModel;
import com.hungteen.pvz.client.model.entity.plant.enforce.UmbrellaLeafModel;
import com.hungteen.pvz.client.model.entity.plant.explosion.CherryBombModel;
import com.hungteen.pvz.client.model.entity.plant.explosion.CobCannonModel;
import com.hungteen.pvz.client.model.entity.plant.explosion.DoomShroomModel;
import com.hungteen.pvz.client.model.entity.plant.explosion.PotatoMineModel;
import com.hungteen.pvz.client.model.entity.plant.flame.JalapenoModel;
import com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel;
import com.hungteen.pvz.client.model.entity.plant.ice.IceShroomModel;
import com.hungteen.pvz.client.model.entity.plant.ice.SnowPeaModel;
import com.hungteen.pvz.client.model.entity.plant.ice.WinterMelonModel;
import com.hungteen.pvz.client.model.entity.plant.light.PlanternModel;
import com.hungteen.pvz.client.model.entity.plant.light.SunFlowerModel;
import com.hungteen.pvz.client.model.entity.plant.light.SunShroomModel;
import com.hungteen.pvz.client.model.entity.plant.light.TwinSunFlowerModel;
import com.hungteen.pvz.client.model.entity.plant.magic.CoffeeBeanModel;
import com.hungteen.pvz.client.model.entity.plant.magic.HypnoShroomModel;
import com.hungteen.pvz.client.model.entity.plant.magic.ImitaterModel;
import com.hungteen.pvz.client.model.entity.plant.magic.MariGoldModel;
import com.hungteen.pvz.client.model.entity.plant.spear.CactusModel;
import com.hungteen.pvz.client.model.entity.plant.spear.CatTailModel;
import com.hungteen.pvz.client.model.entity.plant.spear.SpikeRockModel;
import com.hungteen.pvz.client.model.entity.plant.spear.SpikeWeedModel;
import com.hungteen.pvz.client.model.entity.plant.toxic.*;

import com.hungteen.pvz.common.entity.EntityRegister;
import com.hungteen.pvz.common.impl.*;
import com.hungteen.pvz.common.item.ItemRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PVZPlants extends PlantType {

	private static final List<IPlantType> LIST = new ArrayList<>();
	
	/*
	 * grass day.
	 */
	
	public static final IPlantType PEA_SHOOTER = new PVZPlants("pea_shooter", new PlantFeatures()
			.cost(100).requiredLevel(1)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.PEA_SHOOTER.get())
			.summonCard(() -> ItemRegister.PEA_SHOOTER_CARD.get())
			.enjoyCard(() -> ItemRegister.PEA_SHOOTER_ENJOY_CARD.get())
			.plantModel(() -> () -> new PeaShooterModel(PeaShooterModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of(SkillTypes.PEA_DAMAGE))
	);
	
	public static final IPlantType SUN_FLOWER = new PVZPlants("sun_flower", new PlantFeatures()
			.cost(50).requiredLevel(1)
			.cd(CoolDowns.HUGE_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.LIGHT)
			.entityType(() -> EntityRegister.SUN_FLOWER.get())
			.summonCard(() -> ItemRegister.SUN_FLOWER_CARD.get())
			.enjoyCard(() -> ItemRegister.SUN_FLOWER_ENJOY_CARD.get())
			.plantModel(() -> () -> new SunFlowerModel(SunFlowerModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeTo(() -> PVZPlants.TWIN_SUNFLOWER)
			.commonSkill(List.of())
	);
	
	public static final IPlantType CHERRY_BOMB = new PVZPlants("cherry_bomb", new PlantFeatures()
			.cost(150).requiredLevel(30)
			.cd(CoolDowns.HUGE_SLOW).rank(RankTypes.GOLD).essence(EssenceTypes.EXPLOSION)
			.entityType(() -> EntityRegister.CHERRY_BOMB.get())
			.summonCard(() -> ItemRegister.CHERRY_BOMB_CARD.get())
			.enjoyCard(() -> ItemRegister.CHERRY_BOMB_ENJOY_CARD.get())
			.plantModel(() -> () -> new CherryBombModel(CherryBombModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.cdSkill(List.of(SkillTypes.NORMAL_BOMB_DAMAGE))
	);
	
	public static final IPlantType WALL_NUT = new PVZPlants("wall_nut", new PlantFeatures()
			.cost(50).requiredLevel(1)
			.cd(CoolDowns.SLOW).rank(RankTypes.WHITE).essence(EssenceTypes.DEFENCE)
			.entityType(() -> EntityRegister.WALL_NUT.get())
			.summonCard(() -> ItemRegister.WALL_NUT_CARD.get())
			.enjoyCard(() -> ItemRegister.WALL_NUT_ENJOY_CARD.get())
			.plantModel(() -> () -> new WallNutModel(WallNutModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(List.of(SkillTypes.NUT_MORE_LIFE))
	);
	
	public static final IPlantType POTATO_MINE = new PVZPlants("potato_mine", new PlantFeatures()
			.cost(25).requiredLevel(1)
			.cd(CoolDowns.LITTLE_SLOW).rank(RankTypes.WHITE).essence(EssenceTypes.EXPLOSION)
			.entityType(() -> EntityRegister.POTATO_MINE.get())
			.summonCard(() -> ItemRegister.POTATO_MINE_CARD.get())
			.enjoyCard(() -> ItemRegister.POTATO_MINE_ENJOY_CARD.get())
			.plantModel(() -> () -> new PotatoMineModel(PotatoMineModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(Arrays.asList(SkillTypes.NORMAL_BOMB_DAMAGE, SkillTypes.MINE_FAST_PREPARE))
			.placement(Placements.STABLE)
	);
	
	public static final IPlantType SNOW_PEA = new PVZPlants("snow_pea", new PlantFeatures()
			.cost(175).requiredLevel(12)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.ICE)
			.entityType(() -> EntityRegister.SNOW_PEA.get())
			.summonCard(() -> ItemRegister.SNOW_PEA_CARD.get())
			.enjoyCard(() -> ItemRegister.SNOW_PEA_ENJOY_CARD.get())
			.plantModel(() -> () -> new SnowPeaModel(SnowPeaModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of(SkillTypes.PEA_DAMAGE))
	);
	
	public static final IPlantType CHOMPER = new PVZPlants("chomper", new PlantFeatures()
			.cost(150).requiredLevel(24)
			.cd(CoolDowns.NORMAL).rank(RankTypes.GOLD).essence(EssenceTypes.ENFORCE)
			.entityType(() -> EntityRegister.CHOMPER.get())
			.summonCard(() -> ItemRegister.CHOMPER_CARD.get())
			.enjoyCard(() -> ItemRegister.CHOMPER_ENJOY_CARD.get())
			.plantModel(() -> () -> new ChomperModel(ChomperModel.createBodyLayer().bakeRoot())).scale(0.85F)
			.commonSkill(List.of(SkillTypes.NORMAL_ENHANCE_STRENGTH))
	);
	
	public static final IPlantType REPEATER = new PVZPlants("repeater", new PlantFeatures()
			.cost(225).requiredLevel(15)
			.cd(CoolDowns.VERY_FAST).rank(RankTypes.GOLD).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.REPEATER.get())
			.summonCard(() -> ItemRegister.REPEATER_CARD.get())
			.enjoyCard(() -> ItemRegister.REPEATER_ENJOY_CARD.get())
			.plantModel(() -> () -> new RepeaterModel(RepeaterModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeTo(() -> PVZPlants.GATLING_PEA)
			.commonSunSkill(List.of(SkillTypes.PEA_DAMAGE))
	);
	
	/*
	 * grass night.
	 */
	
	public static final IPlantType PUFF_SHROOM = new PVZPlants("puff_shroom", new PlantFeatures().isShroomPlant()
			.cost(10).requiredLevel(21)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.TOXIC)
			.entityType(() -> EntityRegister.PUFF_SHROOM.get())
			.summonCard(() -> ItemRegister.PUFF_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.PUFF_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new PuffShroomModel(PuffShroomModel.createBodyLayer().bakeRoot())).scale(0.6F)
			.cdSkill(List.of(SkillTypes.SPORE_DAMAGE))
	);
	
	public static final IPlantType SUN_SHROOM = new PVZPlants("sun_shroom", new PlantFeatures().isShroomPlant()
			.cost(25).requiredLevel(21)
			.cd(CoolDowns.HUGE_FAST).rank(RankTypes.GOLD).essence(EssenceTypes.LIGHT)
			.entityType(() -> EntityRegister.SUN_SHROOM.get())
			.summonCard(() -> ItemRegister.SUN_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.SUN_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new SunShroomModel(SunShroomModel.createBodyLayer().bakeRoot())).scale(0.4F)
			.commonSkill(List.of())
	);
	
	public static final IPlantType FUME_SHROOM = new PVZPlants("fume_shroom", new PlantFeatures().isShroomPlant()
			.cost(100).requiredLevel(22)
			.cd(CoolDowns.LITTLE_FAST).rank(RankTypes.GOLD).essence(EssenceTypes.TOXIC)
			.entityType(() -> EntityRegister.FUME_SHROOM.get())
			.summonCard(() -> ItemRegister.FUME_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.FUME_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new FumeShroomModel(FumeShroomModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.upgradeTo(() -> PVZPlants.GLOOM_SHROOM)
			.commonSkill(List.of(SkillTypes.SPORE_DAMAGE))
	);
	
	public static final IPlantType GRAVE_BUSTER = new PVZPlants("grave_buster", new PlantFeatures()
			.cost(75).requiredLevel(7)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.GRAVE_BUSTER.get())
			.summonCard(() -> ItemRegister.GRAVE_BUSTER_CARD.get())
			.enjoyCard(() -> ItemRegister.GRAVE_BUSTER_ENJOY_CARD.get())
			.plantModel(() -> () -> new GraveBusterModel(GraveBusterModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of())
	);
	
	public static final IPlantType HYPNO_SHROOM = new PVZPlants("hypno_shroom", new PlantFeatures().isShroomPlant()
			.cost(75).requiredLevel(32)
			.cd(CoolDowns.LITTLE_SLOW).rank(RankTypes.GOLD).essence(EssenceTypes.MAGIC)
			.entityType(() -> EntityRegister.HYPNO_SHROOM.get())
			.summonCard(() -> ItemRegister.HYPNO_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.HYPNO_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new HypnoShroomModel(HypnoShroomModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(List.of())
	);
	
	public static final IPlantType SCAREDY_SHROOM = new PVZPlants("scaredy_shroom", new PlantFeatures().isShroomPlant()
			.cost(25).requiredLevel(29)
			.cd(CoolDowns.VERY_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.TOXIC)
			.entityType(() -> EntityRegister.SCAREDY_SHROOM.get())
			.summonCard(() -> ItemRegister.SCAREDY_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.SCAREDY_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new ScaredyShroomModel(ScaredyShroomModel.createBodyLayer().bakeRoot())).scale(0.7F)
			.commonSkill(List.of(SkillTypes.SPORE_DAMAGE))
	);
	
	public static final IPlantType ICE_SHROOM = new PVZPlants("ice_shroom", new PlantFeatures().isShroomPlant()
			.cost(75).requiredLevel(54)
			.cd(CoolDowns.SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.ICE)
			.entityType(() -> EntityRegister.ICE_SHROOM.get())
			.summonCard(() -> ItemRegister.ICE_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.ICE_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new IceShroomModel(IceShroomModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of())
	);
	
	public static final IPlantType DOOM_SHROOM = new PVZPlants("doom_shroom", new PlantFeatures().isShroomPlant()
			.cost(225).requiredLevel(55)
			.cd(CoolDowns.SUPER_SLOW).rank(RankTypes.BLACK).essence(EssenceTypes.EXPLOSION)
			.entityType(() -> EntityRegister.DOOM_SHROOM.get())
			.summonCard(() -> ItemRegister.DOOM_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.DOOM_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new DoomShroomModel(DoomShroomModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSunSkill(List.of(SkillTypes.HIGH_EXPLODE_DAMAGE))
	);
	
	/*
	 * pool day.
	 */
	public static final IPlantType LILY_PAD = new PVZPlants("lily_pad", new PlantFeatures().isWaterPlant()
			.cost(25).requiredLevel(11)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.LILY_PAD.get())
			.summonCard(() -> ItemRegister.LILY_PAD_CARD.get())
			.enjoyCard(() -> ItemRegister.LILY_PAD_ENJOY_CARD.get())
			.canNotBeHold()
			.plantModel(() -> () -> new LilyPadModel(LilyPadModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeTo(() -> PVZPlants.CAT_TAIL)
			.cdSkill(List.of())
	);
	
	public static final IPlantType SQUASH = new PVZPlants("squash", new PlantFeatures()
			.cost(50).requiredLevel(37)
			.cd(CoolDowns.LITTLE_SLOW).rank(RankTypes.GREEN).essence(EssenceTypes.ENFORCE)
			.entityType(() -> EntityRegister.SQUASH.get())
			.summonCard(() -> ItemRegister.SQUASH_CARD.get())
			.enjoyCard(() -> ItemRegister.SQUASH_ENJOY_CARD.get())
			.plantModel(() -> () -> new SquashModel(SquashModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.commonSkill(List.of(SkillTypes.NORMAL_ENHANCE_STRENGTH))
	);
	
	public static final IPlantType THREE_PEATER = new PVZPlants("three_peater", new PlantFeatures()
			.cost(325).requiredLevel(33)
			.cd(CoolDowns.VERY_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.THREE_PEATER.get())
			.summonCard(() -> ItemRegister.THREE_PEATER_CARD.get())
			.enjoyCard(() -> ItemRegister.THREE_PEATER_ENJOY_CARD.get())
			.plantModel(() -> () -> new ThreePeaterModel(ThreePeaterModel.createBodyLayer().bakeRoot())).scale(0.98F)
			.commonSunSkill(List.of(SkillTypes.PEA_DAMAGE))
	);
	
	public static final IPlantType TANGLE_KELP = new PVZPlants("tangle_kelp", new PlantFeatures().isWaterPlant()
			.cost(25).requiredLevel(7)
			.cd(CoolDowns.LITTLE_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.ENFORCE)
			.entityType(() -> EntityRegister.TANGLE_KELP.get())
			.summonCard(() -> ItemRegister.TANGLE_KELP_CARD.get())
			.enjoyCard(() -> ItemRegister.TANGLE_KELP_ENJOY_CARD.get())
			.plantModel(() -> () -> new TangleKelpModel(TangleKelpModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of(SkillTypes.NORMAL_ENHANCE_STRENGTH))
	);
	
	public static final IPlantType JALAPENO = new PVZPlants("jalapeno", new PlantFeatures()
			.cost(175).requiredLevel(45)
			.cd(CoolDowns.HUGE_SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.FLAME)
			.entityType(() -> EntityRegister.JALAPENO.get())
			.summonCard(() -> ItemRegister.JALAPENO_CARD.get())
			.enjoyCard(() -> ItemRegister.JALAPENO_ENJOY_CARD.get())
			.plantModel(() -> () -> new JalapenoModel(JalapenoModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(List.of(SkillTypes.NORMAL_BOMB_DAMAGE))
	);
	
	public static final IPlantType SPIKE_WEED = new PVZPlants("spike_weed", new PlantFeatures()
			.cost(100).requiredLevel(17)
			.cd(CoolDowns.LITTLE_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.SPEAR)
			.entityType(() -> EntityRegister.SPIKE_WEED.get())
			.summonCard(() -> ItemRegister.SPIKE_WEED_CARD.get())
			.enjoyCard(() -> ItemRegister.SPIKE_WEED_ENJOY_CARD.get())
			.plantModel(() -> () -> new SpikeWeedModel(SpikeWeedModel.createBodyLayer().bakeRoot())).scale(1F)
			.placement(Placements.STABLE)
			.upgradeTo(() -> PVZPlants.SPIKE_ROCK)
			.commonSkill(List.of(SkillTypes.SPIKE_DAMAGE))
	);
	
	public static final IPlantType TORCH_WOOD = new PVZPlants("torch_wood", new PlantFeatures()
			.cost(200).requiredLevel(35)
			.cd(CoolDowns.NORMAL).rank(RankTypes.PURPLE).essence(EssenceTypes.FLAME)
			.entityType(() -> EntityRegister.TORCH_WOOD.get())
			.summonCard(() -> ItemRegister.TORCH_WOOD_CARD.get())
			.enjoyCard(() -> ItemRegister.TORCH_WOOD_ENJOY_CARD.get())
			.plantModel(() -> () -> new TorchWoodModel(TorchWoodModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(Arrays.asList(SkillTypes.WOOD_MORE_LIFE, SkillTypes.HEAT_PEA_RANGE, SkillTypes.LESS_SUN))
	);
	
	public static final IPlantType TALL_NUT = new PVZPlants("tall_nut", new PlantFeatures()
			.cost(125).requiredLevel(25)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.DEFENCE)
			.entityType(() -> EntityRegister.TALL_NUT.get())
			.summonCard(() -> ItemRegister.TALL_NUT_CARD.get())
			.enjoyCard(() -> ItemRegister.TALL_NUT_ENJOY_CARD.get())
			.plantModel(() -> () -> new TallNutModel(TallNutModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(List.of(SkillTypes.NUT_MORE_LIFE))
	);
	
	/*
	 * pool night.
	 */
	public static final IPlantType SEA_SHROOM = new PVZPlants("sea_shroom", new PlantFeatures().isShroomPlant().isWaterPlant()
			.cost(10).requiredLevel(20)
			.cd(CoolDowns.SUPER_FAST).rank(RankTypes.WHITE).essence(EssenceTypes.TOXIC)
			.entityType(() -> EntityRegister.SEA_SHROOM.get())
			.summonCard(() -> ItemRegister.SEA_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.SEA_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new SeaShroomModel(SeaShroomModel.createBodyLayer().bakeRoot())).scale(0.6F)
			.commonSkill(List.of(SkillTypes.SPORE_DAMAGE))
	);
	
	public static final IPlantType PLANTERN = new PVZPlants("plantern", new PlantFeatures()
			.cost(75).requiredLevel(5)
			.cd(CoolDowns.FAST).rank(RankTypes.WHITE).essence(EssenceTypes.LIGHT)
			.entityType(() -> EntityRegister.PLANTERN.get())
			.summonCard(() -> ItemRegister.PLANTERN_CARD.get())
			.enjoyCard(() -> ItemRegister.PLANTERN_ENJOY_CARD.get())
			.plantModel(() -> () -> new PlanternModel(PlanternModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(Arrays.asList(SkillTypes.MORE_LIGHT_RANGE, SkillTypes.NIGHT_VISION))
	);
	
	public static final IPlantType CACTUS = new PVZPlants("cactus", new PlantFeatures()
			.cost(125).requiredLevel(8)
			.cd(CoolDowns.HUGE_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.SPEAR)
			.entityType(() -> EntityRegister.CACTUS.get())
			.summonCard(() -> ItemRegister.CACTUS_CARD.get())
			.enjoyCard(() -> ItemRegister.CACTUS_ENJOY_CARD.get())
			.plantModel(() -> () -> new CactusModel(CactusModel.createBodyLayer().bakeRoot())).scale(1F)
			.placement(Placements.SAND)
			.commonSkill(List.of(SkillTypes.MORE_THORN_DAMAGE))
	);
	
	public static final IPlantType BLOVER = new PVZPlants("blover", new PlantFeatures()
			.cost(50).requiredLevel(19)
			.cd(CoolDowns.FAST).rank(RankTypes.GREEN).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.BLOVER.get())
			.summonCard(() -> ItemRegister.BLOVER_CARD.get())
			.enjoyCard(() -> ItemRegister.BLOVER_ENJOY_CARD.get())
			.plantModel(() -> () -> new BloverModel(BloverModel.createBodyLayer().bakeRoot())).scale(1.2F)
			.cdSkill(List.of(SkillTypes.BLOW_STRENGTH))
	);
	
	public static final IPlantType SPLIT_PEA = new PVZPlants("split_pea", new PlantFeatures()
			.cost(125).requiredLevel(20)
			.cd(CoolDowns.HUGE_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.SPLIT_PEA.get())
			.summonCard(() -> ItemRegister.SPLIT_PEA_CARD.get())
			.enjoyCard(() -> ItemRegister.SPLIT_PEA_ENJOY_CARD.get())
			.plantModel(() -> () -> new SplitPeaModel(SplitPeaModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(Arrays.asList(SkillTypes.PEA_DAMAGE, SkillTypes.SPLIT_DOUBLE_CHANCE))
	);
	
	public static final IPlantType STAR_FRUIT = new PVZPlants("star_fruit", new PlantFeatures()
			.cost(150).requiredLevel(31)
			.cd(CoolDowns.FAST).rank(RankTypes.GREEN).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.STAR_FRUIT.get())
			.summonCard(() -> ItemRegister.STAR_FRUIT_CARD.get())
			.enjoyCard(() -> ItemRegister.STAR_FRUIT_ENJOY_CARD.get())
			.plantModel(() -> () -> new StarFruitModel(StarFruitModel.createBodyLayer().bakeRoot())).scale(0.82F)
			.commonSkill(List.of(SkillTypes.MORE_STAR_DAMAGE))
	);
	
	public static final IPlantType PUMPKIN = new PVZPlants("pumpkin", new PlantFeatures()
			.cost(125).requiredLevel(40)
			.cd(CoolDowns.SLOW).rank(RankTypes.GOLD).essence(EssenceTypes.DEFENCE)
			.entityType(() -> EntityRegister.PUMPKIN.get())
			.summonCard(() -> ItemRegister.PUMPKIN_CARD.get())
			.enjoyCard(() -> ItemRegister.PUMPKIN_ENJOY_CARD.get())
			.plantModel(() -> () -> new PumpkinModel(PumpkinModel.createBodyLayer().bakeRoot())).scale(1.0F)
			.cdSkill(List.of(SkillTypes.PUMPKIN_MORE_LIFE))
	);
	
	public static final IPlantType MAGNET_SHROOM = new PVZPlants("magnet_shroom", new PlantFeatures().isShroomPlant()
			.cost(100).requiredLevel(41)
			.cd(CoolDowns.LITTLE_FAST).rank(RankTypes.GOLD).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.MAGNET_SHROOM.get())
			.summonCard(() -> ItemRegister.MAGNET_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.MAGNET_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new MagnetShroomModel(MagnetShroomModel.createBodyLayer().bakeRoot())).scale(1.2F)
			.upgradeTo(() -> PVZPlants.GOLD_MAGNET)
			.commonSkill(List.of(SkillTypes.LESS_WORK_CD))
	);
	
	/*
	 * roof.
	 */
	public static final IPlantType CABBAGE_PULT = new PVZPlants("cabbage_pult", new PlantFeatures()
			.cost(100).requiredLevel(10)
			.cd(CoolDowns.VERY_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.ARMA)
			.entityType(() -> EntityRegister.CABBAGE_PULT.get())
			.summonCard(() -> ItemRegister.CABBAGE_PULT_CARD.get())
			.enjoyCard(() -> ItemRegister.CABBAGE_PULT_ENJOY_CARD.get())
			.plantModel(() -> () -> new CabbagePultModel(CabbagePultModel.createBodyLayer().bakeRoot())).scale(1F)
			.commonSkill(List.of(SkillTypes.MORE_CABBAGE_DAMAGE))
	);
	
	public static final IPlantType FLOWER_POT = new PVZPlants("flower_pot", new PlantFeatures()
			.cost(25).requiredLevel(3)
			.cd(CoolDowns.HUGE_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.FLOWER_POT.get())
			.summonCard(() -> ItemRegister.FLOWER_POT_CARD.get())
			.enjoyCard(() -> ItemRegister.FLOWER_POT_ENJOY_CARD.get())
			.canNotBeHold()
			.plantModel(() -> () -> new FlowerPotModel(FlowerPotModel.createBodyLayer().bakeRoot())).scale(0.85F)
			.placement(Placements.ANY)
			.cdSkill(List.of())
	);
	
	public static final IPlantType KERNEL_PULT = new PVZPlants("kernel_pult", new PlantFeatures()
			.cost(125).requiredLevel(18)
			.cd(CoolDowns.FAST).rank(RankTypes.GOLD).essence(EssenceTypes.ARMA)
			.entityType(() -> EntityRegister.KERNEL_PULT.get())
			.summonCard(() -> ItemRegister.KERNEL_PULT_CARD.get())
			.enjoyCard(() -> ItemRegister.KERNEL_PULT_ENJOY_CARD.get())
			.plantModel(() -> () -> new KernelPultModel(KernelPultModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.upgradeTo(() -> PVZPlants.COB_CANNON)
			.commonSkill(List.of(SkillTypes.MORE_KERNEL_DAMAGE))
	);
	
	public static final IPlantType COFFEE_BEAN = new PVZPlants("coffee_bean", new PlantFeatures()
			.cost(75).requiredLevel(38)
			.cd(CoolDowns.FAST).rank(RankTypes.GREEN).essence(EssenceTypes.MAGIC)
			.entityType(() -> EntityRegister.COFFEE_BEAN.get())
			.summonCard(() -> ItemRegister.COFFEE_BEAN_CARD.get())
			.enjoyCard(() -> ItemRegister.COFFEE_BEAN_ENJOY_CARD.get())
			.placement(Placements.NONE)
			.plantModel(() -> () -> new CoffeeBeanModel(CoffeeBeanModel.createBodyLayer().bakeRoot())).scale(1F)
			.cdSkill(List.of())
	);
	
	public static final IPlantType GARLIC = new PVZPlants("garlic", new PlantFeatures()
			.cost(50).requiredLevel(16)
			.cd(CoolDowns.FAST).rank(RankTypes.GREEN).essence(EssenceTypes.DEFENCE)
			.entityType(() -> EntityRegister.GARLIC.get())
			.summonCard(() -> ItemRegister.GARLIC_CARD.get())
			.enjoyCard(() -> ItemRegister.GARLIC_ENJOY_CARD.get())
			.plantModel(() -> () -> new GarlicModel(GarlicModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.cdSkill(List.of(SkillTypes.MORE_GARLIC_LIFE))
	);
	
	public static final IPlantType UMBRELLA_LEAF = new PVZPlants("umbrella_leaf", new PlantFeatures()
			.cost(100).requiredLevel(23)
			.cd(CoolDowns.LITTLE_FAST).rank(RankTypes.GREEN).essence(EssenceTypes.ENFORCE)
			.entityType(() -> EntityRegister.UMBRELLA_LEAF.get())
			.summonCard(() -> ItemRegister.UMBRELLA_LEAF_CARD.get())
			.enjoyCard(() -> ItemRegister.UMBRELLA_LEAF_ENJOY_CARD.get())
			.plantModel(() -> () -> new UmbrellaLeafModel(UmbrellaLeafModel.createBodyLayer().bakeRoot())).scale(0.8F)
			.commonSkill(List.of())
	);
	
	public static final IPlantType MARIGOLD = new PVZPlants("marigold", new PlantFeatures()
			.cost(50).requiredLevel(55)
			.cd(CoolDowns.NORMAL).rank(RankTypes.BLUE).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.MARIGOLD.get())
			.summonCard(() -> ItemRegister.MARIGOLD_CARD.get())
			.enjoyCard(() -> ItemRegister.MARIGOLD_ENJOY_CARD.get())
			.plantModel(() -> () -> new MariGoldModel(MariGoldModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.commonSkill(List.of())
	);
	
	public static final IPlantType MELON_PULT = new PVZPlants("melon_pult", new PlantFeatures()
			.cost(400).requiredLevel(23)
			.cd(CoolDowns.SLOW).rank(RankTypes.PURPLE).essence(EssenceTypes.ARMA)
			.entityType(() -> EntityRegister.MELON_PULT.get())
			.summonCard(() -> ItemRegister.MELON_PULT_CARD.get())
			.enjoyCard(() -> ItemRegister.MELON_PULT_ENJOY_CARD.get())
			.plantModel(() -> () -> new MelonPultModel(MelonPultModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.upgradeTo(() -> PVZPlants.WINTER_MELON)
			.commonSunSkill(List.of(SkillTypes.MORE_MELON_DAMAGE))
	);
	
	/*
	 * upgrade
	 */
	public static final IPlantType GATLING_PEA = new PVZPlants("gatling_pea", new PlantFeatures()
			.cost(450).requiredLevel(28)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.PURPLE).essence(EssenceTypes.APPEASE)
			.entityType(() -> EntityRegister.GATLING_PEA.get())
			.summonCard(() -> ItemRegister.GATLING_PEA_CARD.get())
			.enjoyCard(() -> ItemRegister.GATLING_PEA_ENJOY_CARD.get())
			.plantModel(() -> () -> new GatlingPeaModel(GatlingPeaModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeFrom(() -> PVZPlants.REPEATER)
			.commonSunSkill(List.of(SkillTypes.PEA_DAMAGE))
	);
	
	public static final IPlantType TWIN_SUNFLOWER = new PVZPlants("twin_sunflower", new PlantFeatures()
			.cost(200).requiredLevel(25)
			.cd(CoolDowns.NORMAL).rank(RankTypes.BLUE).essence(EssenceTypes.LIGHT)
			.entityType(() -> EntityRegister.TWIN_SUNFLOWER.get())
			.summonCard(() -> ItemRegister.TWIN_SUNFLOWER_CARD.get())
			.enjoyCard(() -> ItemRegister.TWIN_SUNFLOWER_ENJOY_CARD.get())
			.plantModel(() -> () -> new TwinSunFlowerModel(TwinSunFlowerModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeFrom(() -> PVZPlants.SUN_FLOWER)
			.commonSunSkill(List.of())
	);
	
	public static final IPlantType GLOOM_SHROOM = new PVZPlants("gloom_shroom", new PlantFeatures().isShroomPlant()
			.cost(250).requiredLevel(50)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.PURPLE).essence(EssenceTypes.TOXIC)
			.entityType(() -> EntityRegister.GLOOM_SHROOM.get())
			.summonCard(() -> ItemRegister.GLOOM_SHROOM_CARD.get())
			.enjoyCard(() -> ItemRegister.GLOOM_SHROOM_ENJOY_CARD.get())
			.plantModel(() -> () -> new GloomShroomModel(GloomShroomModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeFrom(() -> PVZPlants.FUME_SHROOM)
			.commonSunSkill(List.of(SkillTypes.SPORE_DAMAGE))
	);
	
	public static final IPlantType CAT_TAIL = new PVZPlants("cat_tail", new PlantFeatures().isWaterPlant()
			.cost(350).requiredLevel(52)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.BLACK).essence(EssenceTypes.SPEAR)
			.placement(Placements.LILY_PAD)
			.entityType(() -> EntityRegister.CAT_TAIL.get())
			.summonCard(() -> ItemRegister.CAT_TAIL_CARD.get())
			.enjoyCard(() -> ItemRegister.CAT_TAIL_ENJOY_CARD.get())
			.plantModel(() -> () -> new CatTailModel(CatTailModel.createBodyLayer().bakeRoot())).scale(1F)
			.upgradeFrom(() -> PVZPlants.LILY_PAD)
			.commonSunSkill(List.of(SkillTypes.MORE_THORN_DAMAGE))
	);
	
	public static final IPlantType WINTER_MELON = new PVZPlants("winter_melon", new PlantFeatures()
			.cost(650).requiredLevel(50)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.BLACK).essence(EssenceTypes.ICE)
			.entityType(() -> EntityRegister.WINTER_MELON.get())
			.summonCard(() -> ItemRegister.WINTER_MELON_CARD.get())
			.enjoyCard(() -> ItemRegister.WINTER_MELON_ENJOY_CARD.get())
			.plantModel(() -> () -> new WinterMelonModel(WinterMelonModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.upgradeFrom(() -> PVZPlants.MELON_PULT)
			.commonSunSkill(List.of(SkillTypes.MORE_MELON_DAMAGE))
	);
	
	public static final IPlantType GOLD_MAGNET = new PVZPlants("gold_magnet", new PlantFeatures()
			.cost(200).requiredLevel(55)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.WHITE).essence(EssenceTypes.ASSIST)
			.entityType(() -> EntityRegister.GOLD_MAGNET.get())
			.summonCard(() -> ItemRegister.GOLD_MAGNET_CARD.get())
			.enjoyCard(() -> ItemRegister.GOLD_MAGNET_ENJOY_CARD.get())
			.plantModel(() -> () -> new GoldMagnetModel(GoldMagnetModel.createBodyLayer().bakeRoot())).scale(1.2F)
			.upgradeFrom(() -> PVZPlants.MAGNET_SHROOM)
			.commonSunSkill(List.of())
	);
	
	public static final IPlantType SPIKE_ROCK = new PVZPlants("spike_rock", new PlantFeatures()
			.cost(275).requiredLevel(27)
			.cd(CoolDowns.VERY_SLOW).rank(RankTypes.BLUE).essence(EssenceTypes.SPEAR)
			.entityType(() -> EntityRegister.SPIKE_ROCK.get())
			.summonCard(() -> ItemRegister.SPIKE_ROCK_CARD.get())
			.enjoyCard(() -> ItemRegister.SPIKE_ROCK_ENJOY_CARD.get())
			.plantModel(() -> () -> new SpikeRockModel(SpikeRockModel.createBodyLayer().bakeRoot())).scale(0.5F)
			.placement(Placements.STABLE)
			.upgradeFrom(() -> PVZPlants.SPIKE_WEED)
			.commonSunSkill(Arrays.asList(SkillTypes.SPIKE_DAMAGE, SkillTypes.MORE_SPIKE))
	);
	
	public static final IPlantType COB_CANNON = new PVZPlants("cob_cannon", new PlantFeatures()
			.cost(700).requiredLevel(60)
			.cd(CoolDowns.HUGE_SLOW).rank(RankTypes.BLACK).essence(EssenceTypes.EXPLOSION)
			.entityType(() -> EntityRegister.COB_CANNON.get())
			.summonCard(() -> ItemRegister.COB_CANNON_CARD.get())
			.enjoyCard(() -> ItemRegister.COB_CANNON_ENJOY_CARD.get())
			.plantModel(() -> () -> new CobCannonModel(CobCannonModel.createBodyLayer().bakeRoot())).scale(1.1F)
			.placement(Placements.ANY)
			.upgradeFrom(() -> PVZPlants.KERNEL_PULT)
			.commonSunSkill(List.of(SkillTypes.NORMAL_BOMB_DAMAGE))
	);
	
	public static final IPlantType IMITATER = new PVZPlants("imitater", new PlantFeatures()
			.requiredLevel(43)
			.rank(RankTypes.PURPLE).essence(EssenceTypes.MAGIC)
			.entityType(() -> EntityRegister.IMITATER.get())
			.summonCard(() -> ItemRegister.IMITATER_CARD.get())
			.enjoyCard(() -> ItemRegister.IMITATER_ENJOY_CARD.get())
			.plantModel(() -> () -> new ImitaterModel(ImitaterModel.createBodyLayer().bakeRoot())).scale(0.9F)
			.placement(Placements.NONE)
	);
	
	public static void register() {
		PVZAPI.get().registerPlantTypes(LIST);
	}
	
	private PVZPlants(String name, PlantFeatures features) {
		super(name, features);
		LIST.add(this);
	}
	
    @Override
	public int getSortPriority() {
		return 100;
	}
    
	@Override
	public String getCategoryName() {
		return "pvz";
	}

	@Override
	public String getModID() {
		return PVZMod.MOD_ID;
	}

}