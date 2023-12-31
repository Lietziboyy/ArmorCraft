package lietziboy.projectarmorcraft.materials;

import lietziboy.projectarmorcraft.item.ModItems;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;

public class KevlarArmorMaterial implements ArmorMaterial {
    private static final String NAME = "kevlar";
    private static final float TOUGHNESS = 0.0F;
    private static final int[] DURABILITY = new int[] {0, 0, 600, 0}; // Durability of Boots, Leggings, Chestplate, Helmet
    private static final int[] PROTECTION = new int[] {0, 0, 3,5, 0}; // Armor points of Boots, Leggings, Chestplate, Helmet
    private static final int ENCHANTABILITY = 20;
    private static final SoundEvent EQUIP_SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.KEVLAR);
    private static final float KNOCKBACK_RESISTANCE = 1.0f;

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