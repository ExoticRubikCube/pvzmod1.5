package com.hungteen.pvz.common.item.armor;

import com.hungteen.pvz.client.model.armor.ConeHeadModel;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConeArmorItem extends PVZArmorItem {

    @SuppressWarnings("rawtypes")
    private static final Map<EquipmentSlot, HumanoidModel> modelMap = new EnumMap<>(EquipmentSlot.class);

    public ConeArmorItem(ArmorMaterial materialIn, EquipmentSlot slot) {
        super(materialIn, slot);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return StringUtil.ARMOR_PREFIX + "cone_head.png";
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                          EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                HumanoidModel<?> model = modelMap.get(equipmentSlot);
                return model != null ? model : original;
            }
        });
    }

    @OnlyIn(Dist.CLIENT)
    public static void initArmorModel() {
        modelMap.put(EquipmentSlot.HEAD, new ConeHeadModel(1f));
    }
}