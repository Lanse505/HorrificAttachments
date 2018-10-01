package lanse505.horrificattachments.common.attachments.vampire;

import baubles.api.BaubleType;
import lanse505.horrificattachments.common.core.ChestAttachment;
import lanse505.horrificattachments.common.core.HAMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class WingsOfTheVampire extends ChestAttachment {

    public WingsOfTheVampire() {
        super(HAMaterials.monsterMaterial, "wings_vampire");
        setMaxStackSize(1);
    }

    @Override
    public int getEntityLifespan(ItemStack itemStack, World world) {
        return Integer.MAX_VALUE;
    }

    @Nullable
    @Override
    public Entity createEntity(World world, Entity location, ItemStack itemstack) {
        NBTTagCompound tag = new NBTTagCompound();
        location.writeToNBT(tag);
        tag.setBoolean("Invulnerable", true);
        location.readFromNBT(tag);
        return null;
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {

    }
}
