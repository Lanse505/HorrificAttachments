package lanse505.horrificattachments.common.core;

import baubles.api.BaubleType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class ChestAttachment extends Attachment{
    private String name;

    public ChestAttachment (ArmorMaterial materialIn, String name) {
        super(materialIn, EntityEquipmentSlot.CHEST);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.BODY;
    }
}
