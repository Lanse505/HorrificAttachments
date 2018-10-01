package lanse505.horrificattachments.common.core;

import lanse505.horrificattachments.utils.HAConstants;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class HAMaterials {
    public static final ItemArmor.ArmorMaterial monsterMaterial = EnumHelper.addArmorMaterial("monster", HAConstants.MOD_ID + ":monster", Integer.MAX_VALUE, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
}
