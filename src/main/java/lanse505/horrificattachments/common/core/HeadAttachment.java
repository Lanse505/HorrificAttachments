package lanse505.horrificattachments.common.core;

import baubles.api.BaubleType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class HeadAttachment extends Attachment {
    private String name;

    public HeadAttachment (ArmorMaterial materialIn, String name) {
        super(materialIn, EntityEquipmentSlot.HEAD);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.HEAD;
    }
}
