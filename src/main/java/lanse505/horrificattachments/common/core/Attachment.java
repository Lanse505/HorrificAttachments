package lanse505.horrificattachments.common.core;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class Attachment extends BaseAttachment implements IBauble {

    public Attachment (ArmorMaterial materialIn, EntityEquipmentSlot slot) {
        super(materialIn, slot);
    }


    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return null;
    }
}
