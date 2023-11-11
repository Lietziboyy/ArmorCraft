package lietziboy.projectarmorcraft.materials;

import lietziboy.projectarmorcraft.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class SFUniformArmorMaterial implements ArmorMaterial {
    private static final String NAME = "sf_uniform";
    private static final float TOUGHNESS = 3.0F;
    private static final int[] DURABILITY = new int[] {798, 790, 819, 805}; // Durability of Boots, Leggings, Chestplate, Helmet
    private static final int[] PROTECTION = new int[] {2, 4, 6, 3}; // Armor points of Boots, Leggings, Chestplate, Helmet
    private static final int ENCHANTABILITY = 60;
    private static final SoundEvent EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.KEVLAR_FIBER);
    private static final float KNOCKBACK_RESISTANCE = 3.5f;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return ENCHANTABILITY;
    }

    @Override
    public SoundEvent getEquipSound() {
        return EQUIP_SOUND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return REPAIR_INGREDIENT;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public float getToughness() {
        return TOUGHNESS;
    }

    @Override
    public float getKnockbackResistance() {
        return KNOCKBACK_RESISTANCE;
    }
}