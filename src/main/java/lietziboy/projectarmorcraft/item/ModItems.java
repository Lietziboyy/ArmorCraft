package lietziboy.projectarmorcraft.item;

import lietziboy.projectarmorcraft.ProjectArmorCraft;
import lietziboy.projectarmorcraft.materials.KevlarArmorMaterial;
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


    //Armor
    public static final ArmorMaterial Kevlar_Armor_Material = new KevlarArmorMaterial();
    public static final Item BULLET_PROOF_VEST = registerItem("bullet_proof_vest",
            new ArmorItem(Kevlar_Armor_Material, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.ARMORCRAFT).fireproof()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectArmorCraft.LOGGER.debug("Registering Items for " + MOD_ID);
    }

}
