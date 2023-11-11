package lietziboy.projectarmorcraft.item;

import lietziboy.projectarmorcraft.ProjectArmorCraft;
import lietziboy.projectarmorcraft.materials.DutchUniformArmorMaterial;
import lietziboy.projectarmorcraft.materials.SFUniformArmorMaterial;
import lietziboy.projectarmorcraft.materials.KevlarArmorMaterial;
import lietziboy.projectarmorcraft.materials.AutUniformArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ArmorItem;

import static lietziboy.projectarmorcraft.ProjectArmorCraft.MOD_ID;

public class ModItems {

    public static final Item RUBBER = registerItem("rubber",
            new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));
    public static final Item RAW_RUBBER = registerItem("raw_rubber",
        new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));
    public static final Item RUBBER_PLATE = registerItem("rubber_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));
    public static final Item KEVLAR = registerItem("kevlar",
            new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item KEVLAR_FIBER = registerItem("kevlar_fiber",
            new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    //Armor Material interfaces
    public static final ArmorMaterial Kevlar_Armor_Material = new KevlarArmorMaterial();
    public static final ArmorMaterial AUT_UNIFORM_ARMOR_MATERIAL = new AutUniformArmorMaterial();
    public static final ArmorMaterial DUTCH_UNIFORM_ARMOR_MATERIAL = new DutchUniformArmorMaterial();

    public static final ArmorMaterial SF_UNIFORM_ARMOR_MATERIAL = new SFUniformArmorMaterial();

    //armor
    public static final Item BULLET_PROOF_VEST = registerItem("bullet_proof_vest",
            new ArmorItem(Kevlar_Armor_Material, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT).fireproof()));

        // austrian uniform
    public static final Item AUT_UNIFORM_HELMET = registerItem("austria_uniform_helmet",
            new ArmorItem(AUT_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item AUT_UNIFORM_CHESTPLATE = registerItem("austria_uniform_chestplate",
            new ArmorItem(AUT_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item AUT_UNIFORM_LEGGINGS = registerItem("austria_uniform_leggings",
            new ArmorItem(AUT_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item AUT_UNIFORM_BOOTS = registerItem("austria_uniform_boots",
            new ArmorItem(AUT_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

        // dutch uniform

    public static final Item DUTCH_UNIFORM_HELMET = registerItem("dutch_uniform_helmet",
            new ArmorItem(DUTCH_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item DUTCH_UNIFORM_CHESTPLATE = registerItem("dutch_uniform_chestplate",
            new ArmorItem(DUTCH_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item DUTCH_UNIFORM_LEGGINGS = registerItem("dutch_uniform_leggings",
            new ArmorItem(DUTCH_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item DUTCH_UNIFORM_BOOTS = registerItem("dutch_uniform_boots",
            new ArmorItem(DUTCH_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

        // Special Forces Uniform

    public static final Item SF_UNIFORM_HELMET = registerItem("sf_uniform_helmet",
            new ArmorItem(SF_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item SF_UNIFORM_CHESTPLATE = registerItem("sf_uniform_chestplate",
            new ArmorItem(SF_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item SF_UNIFORM_LEGGINGS = registerItem("sf_uniform_leggings",
            new ArmorItem(SF_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));

    public static final Item SF_UNIFORM_BOOTS = registerItem("sf_uniform_boots",
            new ArmorItem(SF_UNIFORM_ARMOR_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectArmorCraft.LOGGER.debug("Registering Items for " + MOD_ID);
    }

}
