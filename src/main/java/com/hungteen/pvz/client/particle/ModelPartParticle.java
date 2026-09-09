package com.hungteen.pvz.client.particle;

import com.hungteen.pvz.api.enums.BodyType;
import com.hungteen.pvz.api.interfaces.IBodyEntity;
import com.hungteen.pvz.api.paz.IZombieModel;
import com.hungteen.pvz.api.types.IZombieType;
import com.hungteen.pvz.client.ClientProxy;
import com.hungteen.pvz.common.entity.zombie.PVZZombieEntity;
import com.hungteen.pvz.common.impl.zombie.PoolZombies;
import com.hungteen.pvz.common.impl.zombie.RoofZombies;
import com.hungteen.pvz.utils.ClientUtil;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.Camera;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Optional;

public class ModelPartParticle extends Particle implements IBodyEntity {

    public static final int MAX_EXIST_TICK = 60;
    private int max_exist_tick = MAX_EXIST_TICK;
    public ModelPart model;
    public ResourceLocation texture;
    public Vec3 rotation = Vec3.ZERO;
    public Vec3 offset = Vec3.ZERO;
    public Vec3 originalScale = new Vec3(1, 1, 1);
    public Vec3 aRotation = Vec3.ZERO;
    public IZombieModel<?> bodyDropModel = null;
    public BodyType bodyDropType = BodyType.BODY;
    public boolean bodyHasHandDefence = false;
    public float bodyYRot = 0;
    public float headRot = 0;

    public ModelPartParticle(LivingEntity entity, List<ModelPart> models, ResourceLocation texture, Vec3 offset) {
        this((ClientLevel) entity.level, models.get(0), texture, entity.position().add(offset));
        Vec3 speed = entity.getDeltaMovement().multiply(0.8, 0.8, 0.8)
                .add(new Vec3(entity.getRandom().nextFloat() * 0.2 - 0.1,
                        entity.getRandom().nextFloat() * 0.3 + 0.1,
                        entity.getRandom().nextFloat() * 0.2 - 0.1));
        this.speed(speed).rotation(speed.multiply(80, 80, 80));
        ClientProxy.MC.particleEngine.add(this);
        for (int i = 1; i < models.size(); i++) {
            ModelPartParticle particle = new ModelPartParticle((ClientLevel) entity.level, models.get(i), texture, entity.position().add(offset));
            particle.speed(speed).rotation(speed.multiply(80, 80, 80));
            ClientProxy.MC.particleEngine.add(particle);
        }
    }

    public ModelPartParticle(ClientLevel level, ModelPart model, ResourceLocation texture, Vec3 position) {
        this(level, position);
        this.model = ClientUtil.copyModelPart(model);
        this.model.x = 0;
        this.model.y = 0;
        this.model.z = 0;
        this.texture = texture;
        this.originalScale = new Vec3(model.xScale, model.yScale, model.zScale);
    }

    public ModelPartParticle(ClientLevel level, Vec3 position) {
        this(level, position, Vec3.ZERO);
    }

    public ModelPartParticle(ClientLevel level, Vec3 position, Vec3 velocity) {
        super(level, position.x, position.y, position.z, velocity.x, velocity.y, velocity.z);
        this.gravity = 2F;
        this.friction = 1f;
        this.lifetime = MAX_EXIST_TICK;
    }

    public ModelPartParticle offset(Vec3 vec3) {
        this.offset = vec3;
        return this;
    }

    public ModelPartParticle speed(Vec3 vec3) {
        this.xd = vec3.x;
        this.yd = vec3.y;
        this.zd = vec3.z;
        return this;
    }

    public ModelPartParticle rotation(Vec3 vec3) {
        this.aRotation = vec3;
        return this;
    }

    public ModelPartParticle scale(Vec3 vec3) {
        this.originalScale = vec3;
        return this;
    }

    public ModelPartParticle scale(float scale) {
        this.originalScale = new Vec3(scale, scale, scale);
        return this;
    }

    public ModelPartParticle life(int life) {
        this.lifetime = life;
        return this;
    }

    /**
     * 镜像ZombieDropBodyEntity.updateInfo：统一设置部位、纹理、朝向、缩放、防御、随机落角与掉落模型。
     */
    public void updateInfo(PVZZombieEntity zombie, BodyType type) {
        this.bodyDropType = type;
        this.texture = zombie.getZombieType().getRenderResource();
        this.bodyYRot = -zombie.getYRot();
        this.bodyHasHandDefence = zombie.shouldShowBodyDropDefence();
        this.headRot = zombie.getRandom().nextInt(60) - 30;
        (type == BodyType.BODY ? zombie.getZombieType().getZombieModel2() : zombie.getZombieType().getZombieModel1())
                .ifPresent(iz -> this.bodyDropModel = iz);
    }

    /**
     * 镜像ZombieDropBodyEntity.droppedByOwner：updateInfo后按肢体类型设置出生位置与初始速度。
     */
    public void droppedByOwner(PVZZombieEntity zombie, BodyType type, Optional<Vec3> damageSourcePos) {
        this.updateInfo(zombie, type);
        switch(type) {
        case HAND:
        case LEFT_HAND: {
            //ref htpvz2 ZombieDropBodyEntity.droppedByOwner(HAND)：掉落体初始yRot为0(不继承僵尸朝向)，
            //故手部固定落于僵尸中心偏+Z 0.6、眼高处(cos0=1,sin0=0)，与死亡时面向无关。
            final float dis = 0.6F;
            this.setPos(zombie.position().x, zombie.position().y + zombie.getEyeHeight(), zombie.position().z + dis);
            this.speed(Vec3.ZERO);
            break;
        }
        case HEAD: {
            this.hitUp(zombie, damageSourcePos, 0.3D);
            break;
        }
        case BODY: {
            this.setPos(zombie.position().x, zombie.position().y, zombie.position().z);
            this.speed(zombie.getDeltaMovement());
            break;
        }
        default:
            break;
        }
    }

    /**
     * 镜像1.16.5的specialDropBody：仅冰车/弹射器对整体做更强劲的0.5三轴扩散上抛。
     */
    public void specialDropBody(PVZZombieEntity zombie, BodyType type, Optional<Vec3> damageSourcePos) {
        this.updateInfo(zombie, type);
        final IZombieType zombieType = zombie.getZombieType();
        if(zombieType == PoolZombies.ZOMBONI || zombieType == RoofZombies.CATAPULT_ZOMBIE) {
            this.hitUp(zombie, damageSourcePos, 0.5D);
        }
    }

    private void hitUp(PVZZombieEntity zombie, Optional<Vec3> damageSourcePos, double speed) {
        this.setPos(zombie.position().x, zombie.position().y + zombie.getEyeHeight(), zombie.position().z);
        double speedX = (zombie.getRandom().nextDouble() - 0.5D) * speed;
        double speedZ = (zombie.getRandom().nextDouble() - 0.5D) * speed;
        double speedY = zombie.getRandom().nextDouble() * speed;
        if (damageSourcePos.isPresent()) {
            Vec3 pos = new Vec3(this.x, this.y, this.z);
            Vec3 v = pos.subtract(damageSourcePos.get());
            this.speed(v.normalize().multiply(speed, speed, speed).add(speedX, speedY, speedZ));
        }
    }

    public void setMaxLiveTick(int tick) {
        this.max_exist_tick = tick;
        this.lifetime = tick;
    }

    @Override
    public void tick() {
        super.tick();
        this.rotation = this.rotation.add(aRotation);
        if (this.age >= this.max_exist_tick) {
            this.remove();
        }
    }

    @Override
    public void move(double x, double y, double z) {
        super.move(x, y, z);
        //ref ZombieDropBodyEntity：落地点急剧减速(×0.3)并停住姿态，避免尸体贴着地面滑走。
        if (this.onGround) {
            this.aRotation = Vec3.ZERO;
            this.xd *= 0.3F;
            this.yd *= 0.3F;
            this.zd *= 0.3F;
        }
    }

    @Override
    public void render(VertexConsumer vertexConsumer, Camera camera, float partialTick) {
        float disappearSize = (this.lifetime - partialTick - this.age) / 5;
        if (disappearSize <= 0) {
            return;
        }
        if (this.bodyDropModel != null) {
            this.renderBodyDrop(camera, partialTick);
            return;
        }
        PoseStack poseStack = new PoseStack();
        MultiBufferSource.BufferSource bufferSource = ClientProxy.MC.renderBuffers().bufferSource();
        BlockPos blockpos = new BlockPos(x, y, z);
        Vec3 camPos = camera.getPosition();
        int light = LightTexture.pack(this.level.getBrightness(LightLayer.BLOCK, blockpos), this.level.getBrightness(LightLayer.SKY, blockpos));
        poseStack.pushPose();
        poseStack.translate(
                x * partialTick + xo * (1 - partialTick) - camPos.x(),
                y * partialTick + yo * (1 - partialTick) - camPos.y(),
                z * partialTick + zo * (1 - partialTick) - camPos.z());
        poseStack.scale((float) (-1 * this.originalScale.x), (float) (-1 * this.originalScale.y), (float) (1 * this.originalScale.z));
        if (disappearSize < 1) {
            poseStack.scale(disappearSize, disappearSize, disappearSize);
        }
        Vec3 rotation = this.rotation.add(aRotation.multiply(partialTick, partialTick, partialTick));
        VertexConsumer buffer = bufferSource.getBuffer(RenderType.entityTranslucent(texture));
        poseStack.mulPose(Vector3f.ZP.rotationDegrees((float) rotation.z));
        poseStack.mulPose(Vector3f.YP.rotationDegrees((float) rotation.y));
        poseStack.mulPose(Vector3f.XP.rotationDegrees((float) rotation.x));
        poseStack.translate(offset.x, offset.y, offset.z);
        model.render(poseStack, buffer, light, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        bufferSource.endBatch();
    }

    /**
     * BODY粒子渲染：把poseStack平移到自身世界坐标，然后复用原ZombieBodyRender.renderDropBody
     * 的坐标变换（Y朝向、-1翻转、下移、倒向动画），保证与实体版表现一致。
     */
    private void renderBodyDrop(Camera camera, float partialTick) {
        PoseStack poseStack = new PoseStack();
        MultiBufferSource.BufferSource bufferSource = ClientProxy.MC.renderBuffers().bufferSource();
        BlockPos blockpos = new BlockPos(x, y, z);
        Vec3 camPos = camera.getPosition();
        int light = LightTexture.pack(this.level.getBrightness(LightLayer.BLOCK, blockpos), this.level.getBrightness(LightLayer.SKY, blockpos));
        poseStack.pushPose();
        poseStack.translate(
                x * partialTick + xo * (1 - partialTick) - camPos.x(),
                y * partialTick + yo * (1 - partialTick) - camPos.y(),
                z * partialTick + zo * (1 - partialTick) - camPos.z());
        poseStack.pushPose();
        poseStack.mulPose(Vector3f.YP.rotationDegrees(this.bodyYRot + 180.0F));
        poseStack.scale(-1, -1, 1);
        Vec3 rotVec = this.rotation.add(this.aRotation.multiply(partialTick, partialTick, partialTick));
        poseStack.mulPose(Vector3f.YP.rotationDegrees((float) rotVec.y));
        if(this.bodyDropType != BodyType.BODY) {
            //ref ZombieBodyRender：非躯干部位空中绕X负向翻转，落地后头部随机偏角、其余静止躺平。
            if(this.onGround) {
                poseStack.mulPose(Vector3f.XN.rotationDegrees(this.bodyDropType == BodyType.HEAD ? this.headRot : 90));
            } else {
                poseStack.mulPose(Vector3f.XN.rotationDegrees(- this.age * 15));
            }
        }
        poseStack.mulPose(Vector3f.XP.rotationDegrees((float) rotVec.x));
        poseStack.mulPose(Vector3f.ZP.rotationDegrees((float) rotVec.z));
        poseStack.scale((float) this.originalScale.x, (float) this.originalScale.y, (float) this.originalScale.z);
        poseStack.translate(0.0, (this.bodyDropType != BodyType.BODY ? -1.501 : -1.7), 0.0);
        this.bodyDropModel.tickPartAnim(this, 0, 0, this.getAnimTime() + partialTick, 0, 0);
        final VertexConsumer buffer = bufferSource.getBuffer(this.bodyDropModel.getZombieModel().renderType(this.texture));
        this.bodyDropModel.renderBody(this, poseStack, buffer, light, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
        poseStack.popPose();
        bufferSource.endBatch();
    }

    @Override
    public IZombieType getZombieType() {
        return null;
    }

    @Override
    public BodyType getBodyType() {
        return this.bodyDropType;
    }

    @Override
    public boolean hasHandDefence() {
        return this.bodyHasHandDefence;
    }

    @Override
    public boolean isMini() {
        return false;
    }

    @Override
    public int getAnimTime() {
        return this.age;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.CUSTOM;
    }
}