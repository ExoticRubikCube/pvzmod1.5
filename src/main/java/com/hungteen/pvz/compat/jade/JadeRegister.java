package com.hungteen.pvz.compat.jade;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.compat.jade.provider.PVZEntityProvider;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class JadeRegister implements IWailaPlugin {

	public static final ResourceLocation CONFIG_SHOW_DEFENCE_HEALTH = StringUtil.prefix("show_defence_health");
	public static final ResourceLocation CONFIG_SHOW_OWNER = StringUtil.prefix("show_owner");
	public static final ResourceLocation CONFIG_SHOW_SKILLS = StringUtil.prefix("show_skills");

	public JadeRegister() {
	}

	@Override
	public void registerClient(IWailaClientRegistration reg) {
		reg.registerEntityComponent(PVZEntityProvider.INSTANCE, Entity.class);

		reg.addConfig(CONFIG_SHOW_DEFENCE_HEALTH, true);
		reg.addConfig(CONFIG_SHOW_OWNER, true);
		reg.addConfig(CONFIG_SHOW_SKILLS, true);
	}

}