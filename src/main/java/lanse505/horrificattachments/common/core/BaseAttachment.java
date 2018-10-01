package lanse505.horrificattachments.common.core;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BaseAttachment extends ItemArmor {

    public BaseAttachment(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, 0, equipmentSlotIn);
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return false;
    }
}
