package lanse505.horrificattachments.common.core;

import net.minecraft.inventory.EntityEquipmentSlot;

public class LegAttachment extends Attachment {
    private String name;

    public LegAttachment (ArmorMaterial materialIn, String name) {
        super(materialIn, EntityEquipmentSlot.LEGS);
        setRegistryName(name);
        setTranslationKey(name);
        this.name = name;
    }

}
