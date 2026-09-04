package com.hungteen.pvz.client;

import com.hungteen.pvz.client.model.baked.ImitaterCardBakedModel;
import com.hungteen.pvz.client.model.baked.PVZBakedModel;
import com.hungteen.pvz.client.particle.*;
import com.hungteen.pvz.client.particle.bomb.CherryBombParticle;
import com.hungteen.pvz.client.particle.bomb.PotatoMineParticle;
import com.hungteen.pvz.client.render.entity.bullet.*;
import com.hungteen.pvz.client.render.entity.creature.FoodieZombieRender;
import com.hungteen.pvz.client.render.entity.effects.DoomFixerRender;
import com.hungteen.pvz.client.render.entity.effects.OriginEffectRender;
import com.hungteen.pvz.client.render.entity.misc.*;
import com.hungteen.pvz.client.render.entity.misc.bowling.ExplosionBowlingRender;
import com.hungteen.pvz.client.render.entity.misc.bowling.GiantNutBowlingRender;
import com.hungteen.pvz.client.render.entity.misc.bowling.WallNutBowlingRender;
import com.hungteen.pvz.client.render.entity.misc.drop.CoinRender;
import com.hungteen.pvz.client.render.entity.misc.drop.EnergyRender;
import com.hungteen.pvz.client.render.entity.misc.drop.JewelRender;
import com.hungteen.pvz.client.render.entity.misc.drop.SunRender;
import com.hungteen.pvz.client.render.entity.npc.CrazyDaveRender;
import com.hungteen.pvz.client.render.entity.npc.PennyRender;
import com.hungteen.pvz.client.render.entity.npc.SunDaveRender;
import com.hungteen.pvz.client.render.entity.plant.appease.*;
import com.hungteen.pvz.client.render.entity.plant.arma.ButterPultRender;
import com.hungteen.pvz.client.render.entity.plant.arma.CabbagePultRender;
import com.hungteen.pvz.client.render.entity.plant.arma.KernelPultRender;
import com.hungteen.pvz.client.render.entity.plant.arma.MelonPultRender;
import com.hungteen.pvz.client.render.entity.plant.assist.*;
import com.hungteen.pvz.client.render.entity.plant.defence.*;
import com.hungteen.pvz.client.render.entity.plant.enforce.*;
import com.hungteen.pvz.client.render.entity.plant.explosion.*;
import com.hungteen.pvz.client.render.entity.plant.flame.JalapenoRender;
import com.hungteen.pvz.client.render.entity.plant.flame.TorchWoodRender;
import com.hungteen.pvz.client.render.entity.plant.ice.IceShroomRender;
import com.hungteen.pvz.client.render.entity.plant.ice.IcebergLettuceRender;
import com.hungteen.pvz.client.render.entity.plant.ice.SnowPeaRender;
import com.hungteen.pvz.client.render.entity.plant.ice.WinterMelonRender;
import com.hungteen.pvz.client.render.entity.plant.light.*;
import com.hungteen.pvz.client.render.entity.plant.magic.*;
import com.hungteen.pvz.client.render.entity.plant.spear.CactusRender;
import com.hungteen.pvz.client.render.entity.plant.spear.CatTailRender;
import com.hungteen.pvz.client.render.entity.plant.spear.SpikeRockRender;
import com.hungteen.pvz.client.render.entity.plant.spear.SpikeWeedRender;
import com.hungteen.pvz.client.render.entity.plant.toxic.*;
import com.hungteen.pvz.client.render.entity.zombie.body.ZombieBodyRender;
import com.hungteen.pvz.client.render.entity.zombie.grass.*;
import com.hungteen.pvz.client.render.entity.zombie.other.*;
import com.hungteen.pvz.client.render.entity.zombie.pool.*;
import com.hungteen.pvz.client.render.entity.zombie.roof.*;
import com.hungteen.pvz.client.render.entity.zombie.zombotany.*;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.tileentity.TileEntityRegister;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

import static com.hungteen.pvz.common.entity.EntityRegister.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientRegister {

	@SubscribeEvent
	public static void onModelBaked(ModelEvent.BakingCompleted ev) {
		Map<ResourceLocation, BakedModel> modelRegistry = ev.getModels();
//		{
//			Pair<BakedModel, ModelResourceLocation> now = getBakedModel(ev, ItemRegister.BOWLING_GLOVE.get());
//			BowlingGloveBakedModel tmp = new BowlingGloveBakedModel(now.getFirst());
//			modelRegistry.put(now.getSecond(), tmp);
//		}
		{
			Pair<BakedModel, ModelResourceLocation> now = getBakedModel(ev, ItemRegister.IMITATER_CARD.get());
			ImitaterCardBakedModel tmp = new ImitaterCardBakedModel(now.getFirst());
			modelRegistry.put(now.getSecond(), tmp);
		}
	}

	@SubscribeEvent
    public static void registerFactories(RegisterParticleProvidersEvent event) {
        event.register(ParticleRegister.RED_BOMB.get(), CherryBombParticle.Provider::new);
        event.register(ParticleRegister.YELLOW_BOMB.get(), PotatoMineParticle.Provider::new);
        event.register(ParticleRegister.DIRT_BURST_OUT.get(), DirtBurstOutParticle.Provider::new);
        event.register(ParticleRegister.YELLOW_FLAME.get(), YellowFlameParticle.Provider::new);
        event.register(ParticleRegister.BLUE_FLAME.get(), BlueFlameParticle.Provider::new);
        event.register(ParticleRegister.SLEEP.get(), SleepParticle.Provider::new);
        event.register(ParticleRegister.SPORE.get(), SporeParticle.Provider::new);
        event.register(ParticleRegister.FUME.get(), FumeParticle.Provider::new);
        event.register(ParticleRegister.SNOW_FLOWER.get(), SnowFlowerParticle.Provider::new);
        event.register(ParticleRegister.DOOM.get(), DoomParticle.Provider::new);
        event.register(ParticleRegister.MELON_SLICE.get(), MelonSliceParticle.Provider::new);
        event.register(ParticleRegister.FROZEN_MELON_SLICE.get(), FrozenMelonSliceParticle.Provider::new);
        event.register(ParticleRegister.GREEN_SWEEP.get(), GreenSweepParticle.Provider::new);
        event.register(ParticleRegister.POP_CORN.get(), PopCornParticle.Provider::new);
	}


	private static Pair<BakedModel, ModelResourceLocation> getBakedModel(ModelEvent.BakingCompleted ev, Item item) {
		Map<ResourceLocation, BakedModel> modelRegistry = ev.getModels();
		ModelResourceLocation location = new ModelResourceLocation(ForgeRegistries.ITEMS.getKey(item), "inventory");
		BakedModel model = modelRegistry.get(location);
		if(model == null) throw new RuntimeException("Did not find Obsidian Hidden in registry");
        else if(model instanceof PVZBakedModel) throw new RuntimeException("Tried to replaceObsidian Hidden twice");
		return Pair.of(model, location);
	}

	@SuppressWarnings("removal")
	@SubscribeEvent
	public static void reigsterRenderType(FMLClientSetupEvent ev){
		TileEntityRegister.bindRenderers(ev);
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.ORIGIN_BLOCK.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.PEA_PLANT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.NUT_LEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.NUT_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.TOXIC_SHROOM.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.LANTERN.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.FLOWER_POT.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.LILY_PAD.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.CABBAGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.BUTTER_BLOCK.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.CORN.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.ESSENCE_ALTAR.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.STEEL_LADDER.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.SILVER_SUNFLOWER_TROPHY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.GOLD_SUNFLOWER_TROPHY.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockRegister.DIAMOND_SUNFLOWER_TROPHY.get(), RenderType.cutout());
		TileEntityRegister.bindRenderers(ev);
	}

	@SubscribeEvent
	public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers ev) {
		ev.registerEntityRenderer(SUN.get(), ctx -> new SunRender(ctx));
		ev.registerEntityRenderer(COIN.get(), ctx -> new CoinRender(ctx));
		ev.registerEntityRenderer(JEWEL.get(), ctx -> new JewelRender(ctx));
		ev.registerEntityRenderer(ENERGY.get(), ctx -> new EnergyRender(ctx));
		ev.registerEntityRenderer(GIFT_BOX.get(), ctx -> new GiftBoxRender(ctx));
		ev.registerEntityRenderer(PEA.get(), ctx -> new PeaRender(ctx));
		ev.registerEntityRenderer(POTATO.get(), ctx -> new PotatoRender(ctx));
		ev.registerEntityRenderer(SPORE.get(), ctx -> new SporeRender(ctx));
		ev.registerEntityRenderer(FUME.get(), ctx -> new FumeRender(ctx));
		ev.registerEntityRenderer(METAL.get(), ctx -> new MetalItemRender(ctx));
		ev.registerEntityRenderer(THORN.get(), ctx -> new ThornRender(ctx));
		ev.registerEntityRenderer(STAR.get(), ctx -> new StarRender(ctx));
		ev.registerEntityRenderer(NUT.get(), ctx -> new NutRender(ctx));
		ev.registerEntityRenderer(CABBAGE.get(), ctx -> new CabbageRender(ctx));
		ev.registerEntityRenderer(KERNEL.get(), ctx -> new KernelRender(ctx));
		ev.registerEntityRenderer(BUTTER.get(), ctx -> new ButterRender(ctx));
		ev.registerEntityRenderer(TARGET_ARROW.get(), ctx -> new TargetArrowRender(ctx));
		ev.registerEntityRenderer(MELON.get(), ctx -> new MelonRender(ctx));
		ev.registerEntityRenderer(FIRE_CRACKER.get(), ctx -> new FireCrackerRender(ctx));
		ev.registerEntityRenderer(BALL.get(), ctx -> new BallRender(ctx));
		ev.registerEntityRenderer(CORN.get(), ctx -> new CornRender(ctx));
		ev.registerEntityRenderer(ORIGIN_EFFECT.get(), ctx -> new OriginEffectRender(ctx));
		ev.registerEntityRenderer(DOOM_FIXER.get(), ctx -> new DoomFixerRender(ctx));
		ev.registerEntityRenderer(SMALL_CHOMPER.get(), ctx -> new SmallChomperRender(ctx));
		ev.registerEntityRenderer(BOBSLE_CAR.get(), ctx -> new BobsleCarRender(ctx));
		ev.registerEntityRenderer(ZOMBIE_PART.get(), ctx -> new EmptyRender(ctx));
		ev.registerEntityRenderer(ZOMBIE_HAND.get(), ctx -> new ZombieHandRender(ctx));
		ev.registerEntityRenderer(WALL_NUT_BOWLING.get(), ctx -> new WallNutBowlingRender(ctx));
		ev.registerEntityRenderer(EXPLOSION_BOWLING.get(), ctx -> new ExplosionBowlingRender(ctx));
		ev.registerEntityRenderer(GIANT_NUT_BOWLING.get(), ctx -> new GiantNutBowlingRender(ctx));
		ev.registerEntityRenderer(LAWN_MOWER.get(), ctx -> new LawnMowerRender(ctx));
		ev.registerEntityRenderer(FIRE_CRACKERS.get(), ctx -> new FireCrackersRender(ctx));
		ev.registerEntityRenderer(ELEMENT_BALL.get(), ctx -> new ElementBallRender(ctx));
		ev.registerEntityRenderer(DESTROY_CAR.get(), ctx -> new DestroyCarRender(ctx));
		ev.registerEntityRenderer(GARDEN_RAKE.get(), ctx -> new GardenRakeRender(ctx));
		ev.registerEntityRenderer(ZOMBIE_DROP_BODY.get(), ctx -> new ZombieBodyRender(ctx));
		ev.registerEntityRenderer(FOODIE_ZOMBIE.get(), ctx -> new FoodieZombieRender(ctx));
		ev.registerEntityRenderer(CRAZY_DAVE.get(), ctx -> new CrazyDaveRender(ctx));
		ev.registerEntityRenderer(PANNEY.get(), ctx -> new PennyRender(ctx));
		ev.registerEntityRenderer(SUN_DAVE.get(), ctx -> new SunDaveRender(ctx));
		ev.registerEntityRenderer(NORMAL_ZOMBIE.get(), ctx -> new NormalZombieRender(ctx));
		ev.registerEntityRenderer(FLAG_ZOMBIE.get(), ctx -> new FlagZombieRender(ctx));
		ev.registerEntityRenderer(CONEHEAD_ZOMBIE.get(), ctx -> new ConeHeadZombieRender(ctx));
		ev.registerEntityRenderer(POLE_ZOMBIE.get(), ctx -> new PoleZombieRender(ctx));
		ev.registerEntityRenderer(BUCKETHEAD_ZOMBIE.get(), ctx -> new BucketHeadZombieRender(ctx));
		ev.registerEntityRenderer(SNORKEL_ZOMBIE.get(), ctx -> new SnorkelZombieRender(ctx));
		ev.registerEntityRenderer(ZOMBONI.get(), ctx -> new ZomboniRender(ctx));
		ev.registerEntityRenderer(BOBSLE_TEAM.get(), ctx -> new BobsleTeamRender(ctx));
		ev.registerEntityRenderer(BOBSLE_ZOMBIE.get(), ctx -> new BobsleZombieRender(ctx));
		ev.registerEntityRenderer(ZOMBIE_DOLPHIN.get(), ctx -> new ZombieDolphinRender(ctx));
		ev.registerEntityRenderer(DOLPHIN_RIDER.get(), ctx -> new DolphinRiderRender(ctx));
		ev.registerEntityRenderer(DOLPHIN_RIDER_ZOMBIE.get(), ctx -> new DolphinRiderZombieRender(ctx));
		ev.registerEntityRenderer(LAVA_ZOMBIE.get(), ctx -> new LavaZombieRender(ctx));
		ev.registerEntityRenderer(NEWSPAPER_ZOMBIE.get(), ctx -> new NewspaperZombieRender(ctx));
		ev.registerEntityRenderer(TOMB_STONE.get(), ctx -> new TombStoneRender(ctx));
		ev.registerEntityRenderer(SCREENDOOR_ZOMBIE.get(), ctx -> new ScreenDoorZombieRender(ctx));
		ev.registerEntityRenderer(FOOTBALL_ZOMBIE.get(), ctx -> new FootballZombieRender(ctx));
		ev.registerEntityRenderer(GIGA_FOOTBALL_ZOMBIE.get(), ctx -> new GigaFootballZombieRender(ctx));
		ev.registerEntityRenderer(DANCING_ZOMBIE.get(), ctx -> new DancingZombieRender(ctx));
		ev.registerEntityRenderer(BACKUP_DANCER.get(), ctx -> new BackupDancerRender(ctx));
		ev.registerEntityRenderer(PUMPKIN_ZOMBIE.get(), ctx -> new PumpkinZombieRender(ctx));
		ev.registerEntityRenderer(TRICK_ZOMBIE.get(), ctx -> new TrickZombieRender(ctx));
		ev.registerEntityRenderer(COFFIN.get(), ctx -> new CoffinRender(ctx));
		ev.registerEntityRenderer(MOURNER_ZOMBIE.get(), ctx -> new MournerZombieRender(ctx));
		ev.registerEntityRenderer(NOBLE_ZOMBIE.get(), ctx -> new NobleZombieRender(ctx));
		ev.registerEntityRenderer(OLD_ZOMBIE.get(), ctx -> new OldZombieRender(ctx));
		ev.registerEntityRenderer(SUNDAY_EDITION_ZOMBIE.get(), ctx -> new SundayEditionZombieRender(ctx));
		ev.registerEntityRenderer(JACK_IN_BOX_ZOMBIE.get(), ctx -> new JackInBoxZombieRender(ctx));
		ev.registerEntityRenderer(POGO_ZOMBIE.get(), ctx -> new PogoZombieRender(ctx));
		ev.registerEntityRenderer(YETI_ZOMBIE.get(), ctx -> new YetiZombieRender(ctx));
		ev.registerEntityRenderer(DIGGER_ZOMBIE.get(), ctx -> new DiggerZombieRender(ctx));
		ev.registerEntityRenderer(BALLOON_ZOMBIE.get(), ctx -> new BalloonZombieRender(ctx));
		ev.registerEntityRenderer(RA_ZOMBIE.get(), ctx -> new RaZombieRender(ctx));
		ev.registerEntityRenderer(BUNGEE_ZOMBIE.get(), ctx -> new BungeeZombieRender(ctx));
		ev.registerEntityRenderer(LADDER_ZOMBIE.get(), ctx -> new LadderZombieRender(ctx));
		ev.registerEntityRenderer(CATAPULT_ZOMBIE.get(), ctx -> new CatapultZombieRender(ctx));
		ev.registerEntityRenderer(GARGANTUAR.get(), ctx -> new GargantuarRender(ctx));
		ev.registerEntityRenderer(IMP.get(), ctx -> new ImpRender(ctx));
		ev.registerEntityRenderer(GIGA_GARGANTUAR.get(), ctx -> new GigaGargantuarRender(ctx));
		ev.registerEntityRenderer(EDGAR_090505.get(), ctx -> new EdgarRobotRender(ctx));
		ev.registerEntityRenderer(PEASHOOTER_ZOMBIE.get(), ctx -> new PeaShooterZombieRender(ctx));
		ev.registerEntityRenderer(GATLINGPEA_ZOMBIE.get(), ctx -> new GatlingPeaZombieRender(ctx));
		ev.registerEntityRenderer(SQUASH_ZOMBIE.get(), ctx -> new SquashZombieRender(ctx));
		ev.registerEntityRenderer(JALAPENO_ZOMBIE.get(), ctx -> new JalapenoZombieRender(ctx));
		ev.registerEntityRenderer(WALLNUT_ZOMBIE.get(), ctx -> new WallNutZombieRender(ctx));
		ev.registerEntityRenderer(TALLNUT_ZOMBIE.get(), ctx -> new TallNutZombieRender(ctx));
		ev.registerEntityRenderer(GIGA_TOMB_STONE.get(), ctx -> new GigaTombStoneRender(ctx));
		ev.registerEntityRenderer(EDGAR_090517.get(), ctx -> new EdgarRobotRender(ctx));
		ev.registerEntityRenderer(PEA_SHOOTER.get(), ctx -> new PeaShooterRender(ctx));
		ev.registerEntityRenderer(SUN_FLOWER.get(), ctx -> new SunFlowerRender(ctx));
		ev.registerEntityRenderer(CHERRY_BOMB.get(), ctx -> new CherryBombRender(ctx));
		ev.registerEntityRenderer(WALL_NUT.get(), ctx -> new WallNutRender(ctx));
		ev.registerEntityRenderer(POTATO_MINE.get(), ctx -> new PotatoMineRender(ctx));
		ev.registerEntityRenderer(SNOW_PEA.get(), ctx -> new SnowPeaRender(ctx));
		ev.registerEntityRenderer(CHOMPER.get(), ctx -> new ChomperRender(ctx));
		ev.registerEntityRenderer(REPEATER.get(), ctx -> new RepeaterRender(ctx));
		ev.registerEntityRenderer(LILY_PAD.get(), ctx -> new LilyPadRender(ctx));
		ev.registerEntityRenderer(SQUASH.get(), ctx -> new SquashRender(ctx));
		ev.registerEntityRenderer(THREE_PEATER.get(), ctx -> new ThreePeaterRender(ctx));
		ev.registerEntityRenderer(TANGLE_KELP.get(), ctx -> new TangleKelpRender(ctx));
		ev.registerEntityRenderer(JALAPENO.get(), ctx -> new JalapenoRender(ctx));
		ev.registerEntityRenderer(SPIKE_WEED.get(), ctx -> new SpikeWeedRender(ctx));
		ev.registerEntityRenderer(TORCH_WOOD.get(), ctx -> new TorchWoodRender(ctx));
		ev.registerEntityRenderer(TALL_NUT.get(), ctx -> new TallNutRender(ctx));
		ev.registerEntityRenderer(PUFF_SHROOM.get(), ctx -> new PuffShroomRender(ctx));
		ev.registerEntityRenderer(SUN_SHROOM.get(), ctx -> new SunShroomRender(ctx));
		ev.registerEntityRenderer(FUME_SHROOM.get(), ctx -> new FumeShroomRender(ctx));
		ev.registerEntityRenderer(GRAVE_BUSTER.get(), ctx -> new GraveBusterRender(ctx));
		ev.registerEntityRenderer(HYPNO_SHROOM.get(), ctx -> new HypnoShroomRender(ctx));
		ev.registerEntityRenderer(SCAREDY_SHROOM.get(), ctx -> new ScaredyShroomRender(ctx));
		ev.registerEntityRenderer(ICE_SHROOM.get(), ctx -> new IceShroomRender(ctx));
		ev.registerEntityRenderer(DOOM_SHROOM.get(), ctx -> new DoomShroomRender(ctx));
		ev.registerEntityRenderer(SEA_SHROOM.get(), ctx -> new SeaShroomRender(ctx));
		ev.registerEntityRenderer(PLANTERN.get(), ctx -> new PlanternRender(ctx));
		ev.registerEntityRenderer(CACTUS.get(), ctx -> new CactusRender(ctx));
		ev.registerEntityRenderer(BLOVER.get(), ctx -> new BloverRender(ctx));
		ev.registerEntityRenderer(SPLIT_PEA.get(), ctx -> new SplitPeaRender(ctx));
		ev.registerEntityRenderer(STAR_FRUIT.get(), ctx -> new StarFruitRender(ctx));
		ev.registerEntityRenderer(PUMPKIN.get(), ctx -> new PumpkinRender(ctx));
		ev.registerEntityRenderer(MAGNET_SHROOM.get(), ctx -> new MagnetShroomRender(ctx));
		ev.registerEntityRenderer(CABBAGE_PULT.get(), ctx -> new CabbagePultRender(ctx));
		ev.registerEntityRenderer(FLOWER_POT.get(), ctx -> new FlowerPotRender(ctx));
		ev.registerEntityRenderer(KERNEL_PULT.get(), ctx -> new KernelPultRender(ctx));
		ev.registerEntityRenderer(GARLIC.get(), ctx -> new GarlicRender(ctx));
		ev.registerEntityRenderer(COFFEE_BEAN.get(), ctx -> new CoffeeBeanRender(ctx));
		ev.registerEntityRenderer(UMBRELLA_LEAF.get(), ctx -> new UmbrellaLeafRender(ctx));
		ev.registerEntityRenderer(MARIGOLD.get(), ctx -> new MariGoldRender(ctx));
		ev.registerEntityRenderer(MELON_PULT.get(), ctx -> new MelonPultRender(ctx));
		ev.registerEntityRenderer(GATLING_PEA.get(), ctx -> new GatlingPeaRender(ctx));
		ev.registerEntityRenderer(TWIN_SUNFLOWER.get(), ctx -> new TwinSunFlowerRender(ctx));
		ev.registerEntityRenderer(GLOOM_SHROOM.get(), ctx -> new GloomShroomRender(ctx));
		ev.registerEntityRenderer(CAT_TAIL.get(), ctx -> new CatTailRender(ctx));
		ev.registerEntityRenderer(WINTER_MELON.get(), ctx -> new WinterMelonRender(ctx));
		ev.registerEntityRenderer(GOLD_MAGNET.get(), ctx -> new GoldMagnetRender(ctx));
		ev.registerEntityRenderer(SPIKE_ROCK.get(), ctx -> new SpikeRockRender(ctx));
		ev.registerEntityRenderer(COB_CANNON.get(), ctx -> new CobCannonRender(ctx));
		ev.registerEntityRenderer(IMITATER.get(), ctx -> new ImitaterRender(ctx));
		ev.registerEntityRenderer(WATER_GUARD.get(), ctx -> new WaterGuardRender(ctx));
		ev.registerEntityRenderer(STRANGE_CAT.get(), ctx -> new StrangeCatRender(ctx));
		ev.registerEntityRenderer(ANGEL_STAR_FRUIT.get(), ctx -> new AngelStarFruitRender(ctx));
		ev.registerEntityRenderer(GOLD_LEAF.get(), ctx -> new GoldLeafRender(ctx));
		ev.registerEntityRenderer(BUTTER_PULT.get(), ctx -> new ButterPultRender(ctx));
		ev.registerEntityRenderer(BAMBOO_LORD.get(), ctx -> new BambooLordRender(ctx));
		ev.registerEntityRenderer(ICEBERG_LETTUCE.get(), ctx -> new IcebergLettuceRender(ctx));
		ev.registerEntityRenderer(BONK_CHOY.get(), ctx -> new BonkChoyRender(ctx));
		ev.registerBlockEntityRenderer(TileEntityRegister.SUNFLOWER_TROPHY.get(), ctx -> new com.hungteen.pvz.client.render.tileentity.SunFlowerTrophyTER(ctx));
		ev.registerBlockEntityRenderer(TileEntityRegister.ESSENCE_ALTAR.get(), ctx -> new com.hungteen.pvz.client.render.tileentity.EssenceAltarTER(ctx));
	}


	@SubscribeEvent
	public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions ev) {
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.BallModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.BallModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.CornModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.CornModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.KernelModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.KernelModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.StarModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.StarModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.TargetArrowModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.TargetArrowModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.bullet.ThornModel.LAYER,
			com.hungteen.pvz.client.model.entity.bullet.ThornModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.creature.FoodieZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.creature.FoodieZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.BobsleCarModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.BobsleCarModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.DropModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.DropModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.FireCrackersModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.FireCrackersModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.GardenRakeModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.GardenRakeModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.GiftBoxModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.GiftBoxModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.LadderModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.LadderModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.LawnMowerModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.LawnMowerModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.SmallChomperModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.SmallChomperModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.misc.ZombieHandModel.LAYER,
			com.hungteen.pvz.client.model.entity.misc.ZombieHandModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.npc.CrazyDaveModel.LAYER,
			com.hungteen.pvz.client.model.entity.npc.CrazyDaveModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.npc.PennyModel.LAYER,
			com.hungteen.pvz.client.model.entity.npc.PennyModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.npc.SunDaveModel.LAYER,
			com.hungteen.pvz.client.model.entity.npc.SunDaveModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.AngelStarFruitModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.AngelStarFruitModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.GatlingPeaModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.GatlingPeaModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.PeaShooterModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.PeaShooterModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.RepeaterModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.RepeaterModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.SplitPeaModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.SplitPeaModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.StarFruitModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.StarFruitModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.appease.ThreePeaterModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.appease.ThreePeaterModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.arma.CabbagePultModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.arma.CabbagePultModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.arma.KernelPultModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.arma.KernelPultModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.arma.MelonPultModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.arma.MelonPultModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.BloverModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.BloverModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.FlowerPotModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.FlowerPotModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.GoldMagnetModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.GoldMagnetModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.GraveBusterModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.GraveBusterModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.LilyPadModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.LilyPadModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.assist.MagnetShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.assist.MagnetShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.defence.GarlicModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.defence.GarlicModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.defence.PumpkinModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.defence.WallNutModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.defence.WallNutModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.defence.WaterGuardModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.defence.WaterGuardModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.enforce.BonkChoyModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.enforce.BonkChoyModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.enforce.ChomperModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.enforce.ChomperModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.enforce.SquashModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.enforce.SquashModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.enforce.TangleKelpModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.enforce.TangleKelpModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.enforce.UmbrellaLeafModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.enforce.UmbrellaLeafModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.explosion.BambooLordModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.explosion.BambooLordModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.explosion.CherryBombModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.explosion.CherryBombModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.explosion.CobCannonModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.explosion.CobCannonModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.explosion.DoomShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.explosion.DoomShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.explosion.PotatoMineModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.explosion.PotatoMineModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.flame.JalapenoModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.flame.JalapenoModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.ice.IcebergLettuceModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.ice.IcebergLettuceModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.ice.IceShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.ice.IceShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.ice.SnowPeaModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.ice.SnowPeaModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.ice.WinterMelonModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.ice.WinterMelonModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.light.GoldLeafModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.light.GoldLeafModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.light.PlanternModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.light.PlanternModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.light.SunFlowerModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.light.SunFlowerModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.light.SunShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.light.SunShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.light.TwinSunFlowerModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.light.TwinSunFlowerModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.magic.CoffeeBeanModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.magic.CoffeeBeanModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.magic.HypnoShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.magic.HypnoShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.magic.ImitaterModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.magic.ImitaterModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.magic.MariGoldModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.magic.MariGoldModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.magic.StrangeCatModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.magic.StrangeCatModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.spear.CactusModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.spear.CactusModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.spear.CatTailModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.spear.CatTailModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.spear.SpikeRockModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.spear.SpikeRockModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.spear.SpikeWeedModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.spear.SpikeWeedModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.toxic.FumeShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.toxic.FumeShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.toxic.GloomShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.toxic.GloomShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.toxic.PuffShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.toxic.PuffShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.toxic.ScaredyShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.toxic.ScaredyShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.plant.toxic.SeaShroomModel.LAYER,
			com.hungteen.pvz.client.model.entity.plant.toxic.SeaShroomModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.te.OriginModel.LAYER,
			com.hungteen.pvz.client.model.entity.te.OriginModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.BackupDancerModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.BackupDancerModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.BucketHeadZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.BucketHeadZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.ConeHeadZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.ConeHeadZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.DancingZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.DancingZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.FlagZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.FlagZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.FootballZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.FootballZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.GigaFootballZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.GigaFootballZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.NewspaperZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.NewspaperZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.NormalZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.NormalZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.OldZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.OldZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.PoleZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.PoleZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.ScreenDoorZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.ScreenDoorZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.SundayEditionZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.SundayEditionZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.grass.TombStoneModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.grass.TombStoneModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.other.CoffinModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.other.CoffinModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.other.MournerZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.other.MournerZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.other.NobleZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.other.NobleZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.other.RaZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.other.RaZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.other.TrickZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.other.TrickZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.BalloonZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.BalloonZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.BobsleTeamModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.BobsleTeamModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.BobsleZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.BobsleZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.DiggerZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.DiggerZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.DolphinRiderZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.DuckyTubeModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.DuckyTubeModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.JackInBoxZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.JackInBoxZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.LavaZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.LavaZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.PogoZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.PogoZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.SnorkelZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.SnorkelZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.YetiZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.YetiZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.ZombieDolphinModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.ZombieDolphinModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.pool.ZomboniModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.pool.ZomboniModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.BungeeZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.BungeeZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.CatapultZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.CatapultZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.EdgarRobotModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.EdgarRobotModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.GargantuarModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.GargantuarModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.ImpModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.ImpModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.roof.LadderZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.roof.LadderZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.GatlingPeaZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.GatlingPeaZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.JalapenoZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.JalapenoZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.PeaShooterZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.PeaShooterZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.PumpkinZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.PumpkinZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.SquashZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.SquashZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.TallNutZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.TallNutZombieModel::createBodyLayer);
		ev.registerLayerDefinition(com.hungteen.pvz.client.model.entity.zombie.zombotany.WallNutZombieModel.LAYER,
			com.hungteen.pvz.client.model.entity.zombie.zombotany.WallNutZombieModel::createBodyLayer);
	}

}