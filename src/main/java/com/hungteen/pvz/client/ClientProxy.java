package com.hungteen.pvz.client;

import com.hungteen.pvz.client.render.layer.fullskin.ColdLayer;
import com.hungteen.pvz.common.CommonProxy;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.block.others.SteelLadderBlock;
import com.hungteen.pvz.common.item.ItemRegister;
import com.hungteen.pvz.common.item.armor.BucketArmorItem;
import com.hungteen.pvz.common.item.armor.ConeArmorItem;
import com.hungteen.pvz.common.item.armor.FootballArmorItem;
import com.hungteen.pvz.common.item.armor.GigaArmorItem;
import com.hungteen.pvz.common.item.tool.GardenCompassItem;
import com.hungteen.pvz.utils.StringUtil;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.server.commands.LocateCommand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.Registry;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

import java.util.Optional;

import static com.hungteen.pvz.common.world.biome.BiomeRegister.ZEN_GARDEN;

@OnlyIn(Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    public static final Minecraft MC = Minecraft.getInstance();

    @Override
    public void init() {
    }

    ;

    @Override
    public void postInit() {
        this.addLayersForRender();
    }

    ;

    @Override
    public void setUpClient() {
        ConeArmorItem.initArmorModel();
        BucketArmorItem.initArmorModel();
        FootballArmorItem.initArmorModel();
        GigaArmorItem.initArmorModel();
        KeyBindRegister.init();
        ItemProperties.register(ItemRegister.SCREEN_DOOR.get(), StringUtil.prefix("blocking"), (stack, world, entity, seed) -> {
            return entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F;
        });
        ItemProperties.register(ItemRegister.GARDEN_COMPASS.get(), StringUtil.prefix("angle"), new ItemPropertyFunction() {

            private final Angle wobble = new Angle();
            private final Angle wobbleRandom = new Angle();
            private int tick = 0;
            private BlockPos pos = null;

            @Override
            public float call(ItemStack pStack, @Nullable ClientLevel pLevel, @Nullable LivingEntity pEntity,int pSeed) {
                Entity entity = pEntity != null ? pEntity : pStack.getEntityRepresentation();
                if (entity == null) {
                    return 0.0F;
                } else {
                    if (pLevel == null && entity.level instanceof ClientLevel) {
                        pLevel = (ClientLevel) entity.level;
                    }

                    pos = this.getPointPosition(pStack);
                    long i = pLevel.getGameTime();
                    if (pos != null && !(entity.position().distanceToSqr((double) pos.getX() + 0.5D, entity.position().y(), (double) pos.getZ() + 0.5D) < (double) 1.0E-5F)) {
                        boolean flag = pEntity instanceof Player && ((Player) pEntity).isLocalPlayer();
                        double d1 = 0.0D;
                        if (flag) {
                            d1 = pEntity.getYRot();
                        } else if (entity instanceof ItemFrame) {
                            d1 = this.getFrameRotation((ItemFrame) entity);
                        } else if (entity instanceof ItemEntity) {
                            d1 = 180.0F - ((ItemEntity) entity).getSpin(0.5F) / ((float) Math.PI * 2F) * 360.0F;
                        } else if (pEntity != null) {
                            d1 = pEntity.yBodyRot;
                        }

                        d1 = Mth.positiveModulo(d1 / 360.0D, 1.0D);
                        double d2 = this.getAngleTo(Vec3.atCenterOf(pos), entity) / (double) ((float) Math.PI * 2F);
                        double d3;
                        if (flag) {
                            if (this.wobble.shouldUpdate(i)) {
                                this.wobble.update(i, 0.5D - (d1 - 0.25D));
                            }

                            d3 = d2 + this.wobble.rotation;
                        } else {
                            d3 = 0.5D - (d1 - 0.25D - d2);
                        }

                        return Mth.positiveModulo((float) d3, 1.0F);
                    } else {
                        if (this.wobbleRandom.shouldUpdate(i)) {
                            this.wobbleRandom.update(i, Math.random());
                        }

                        double d0 = this.wobbleRandom.rotation + (double) ((float) pStack.hashCode() / 2.14748365E9F);
                        return Mth.positiveModulo((float) d0, 1.0F);
                    }
                }
            }

            @Nullable
            private BlockPos getPointPosition(ItemStack itemstack) {
                return GardenCompassItem.getPos(itemstack);
            }

            private double getFrameRotation(ItemFrame p_239441_1_) {
                Direction direction = p_239441_1_.getDirection();
                int i = direction.getAxis().isVertical() ? 90 * direction.getAxisDirection().getStep() : 0;
                return Mth.wrapDegrees(180 + direction.get2DDataValue() * 90 + p_239441_1_.getRotation() * 45 + i);
            }

            private double getAngleTo(Vec3 p_239443_1_, Entity p_239443_2_) {
                return Math.atan2(p_239443_1_.z() - p_239443_2_.getZ(), p_239443_1_.x() - p_239443_2_.getX());
            }
        });
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void addLayersForRender() {
        MC.getEntityRenderDispatcher().renderers.values().forEach(r -> {
            if (r instanceof LivingEntityRenderer) {
                ((LivingEntityRenderer) r).addLayer(new ColdLayer<>((LivingEntityRenderer) r));
            }
        });
    }

    @Override
    public void climbUp() {
        final Player player = this.getPlayer();
        if (player != null && player.horizontalCollision && player.onClimbable()) {
            //is on steel ladder.
            if (player.level.getBlockState(player.blockPosition()).getBlock().equals(BlockRegister.STEEL_LADDER.get())) {
                ladderSpeed = Math.min(SteelLadderBlock.MAX_SPEED_UP, ladderSpeed + SteelLadderBlock.UP_SPEED * 0.8F);
                final Vec3 vec = player.getDeltaMovement();
                player.setDeltaMovement(vec.x, ladderSpeed, vec.z);
            } else {
                ladderSpeed = Math.max(0, ladderSpeed - SteelLadderBlock.UP_SPEED);
            }
        } else {
            ladderSpeed = 0.06F;
        }
    }

    @Override
    public Player getPlayer() {
        return MC.player;
    }


    @OnlyIn(Dist.CLIENT)
    static class Angle {
        private double rotation;
        private double deltaRotation;
        private long lastUpdateTick;

        private Angle() {
        }

        private boolean shouldUpdate(long p_239448_1_) {
            return this.lastUpdateTick != p_239448_1_;
        }

        private void update(long p_239449_1_, double p_239449_3_) {
            this.lastUpdateTick = p_239449_1_;
            double d0 = p_239449_3_ - this.rotation;
            d0 = Mth.positiveModulo(d0 + 0.5D, 1.0D) - 0.5D;
            this.deltaRotation += d0 * 0.1D;
            this.deltaRotation *= 0.8D;
            this.rotation = Mth.positiveModulo(this.rotation + this.deltaRotation, 1.0D);
        }
    }
}