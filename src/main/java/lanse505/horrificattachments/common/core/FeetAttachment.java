package lanse505.horrificattachments.common.core;

import net.minecraft.inventory.EntityEquipmentSlot;

public class FeetAttachment extends Attachment {
    private String name;

    public FeetAttachment (ArmorMaterial materialIn, String name) {
        super(materialIn, EntityEquipmentSlot.FEET);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }
}
