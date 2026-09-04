package com.hungteen.pvz.compat.jade.provider;

import com.hungteen.pvz.api.interfaces.IHasOwner;
import com.hungteen.pvz.api.types.IPAZType;
import com.hungteen.pvz.common.entity.AbstractPAZEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.compat.jade.JadeRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.Level;
import snownee.jade.api.EntityAccessor;
import snownee.jade.api.IEntityComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.overlay.DisplayHelper;

import java.util.Optional;

public class PVZEntityProvider implements IEntityComponentProvider {

	public static final PVZEntityProvider INSTANCE = new PVZEntityProvider();
	private static final ResourceLocation UID = StringUtil.prefix("pvz_entity");

	@Override
	public ResourceLocation getUid() {
		return UID;
	}

	@Override
	public void appendTooltip(ITooltip tooltip, EntityAccessor accessor, IPluginConfig config) {
		if(config.get(JadeRegister.CONFIG_SHOW_DEFENCE_HEALTH)) {
		    appendDefenceHealth(accessor.getEntity(), tooltip);
		}
		if(config.get(JadeRegister.CONFIG_SHOW_OWNER)) {
			appendOwner(accessor.getLevel(), accessor.getEntity(), tooltip);
		}
		if(config.get(JadeRegister.CONFIG_SHOW_SKILLS)) {
			appendSkills(accessor.getLevel(), accessor.getEntity(), tooltip);
		}
		//hide info need shift to check.
		if(accessor.getPlayer().getPose() == Pose.CROUCHING) {

		}
	}

	private void appendOwner(Level world, Entity entity, ITooltip tooltip) {
		if(! (entity instanceof IHasOwner)) {
			return ;
		}
		((IHasOwner) entity).getOwnerUUID().ifPresent(uuid -> {
			Optional.ofNullable(world.getPlayerByUUID(uuid)).ifPresent(player -> {
				tooltip.add(Component.translatable("tooltip.pvz.owner").append(" : " + player.getName().getString()).withStyle(ChatFormatting.GREEN));
			});
		});
	}

	private void appendDefenceHealth(Entity entity, ITooltip tooltip) {
		if(! (entity instanceof LivingEntity)) {
			return ;
		}
		double health = EntityUtil.getCurrentDefenceHealth((LivingEntity) entity);
		if(health == 0) {
			return ;
		}
		tooltip.add(Component.translatable("tooltip.pvz.defence").append(" : " + String.format("%s", DisplayHelper.dfCommas.format(health))).withStyle(ChatFormatting.RED));
	}

	private void appendSkills(Level world, Entity entity, ITooltip tooltip) {
		if(entity instanceof AbstractPAZEntity){
			final IPAZType type = ((AbstractPAZEntity) entity).getPAZType();
			final CompoundTag nbt = ((AbstractPAZEntity) entity).getSkills();
			type.getSkills().forEach(skillType -> {
				if(nbt != null){
					final int lvl = SkillTypes.getSkillLevel(nbt, skillType);
					if(lvl > 0){
						tooltip.add(skillType.getText().append(StringUtil.getRomanString(lvl)).withStyle(ChatFormatting.DARK_PURPLE));
					}
				}
			});
		}
	}

}