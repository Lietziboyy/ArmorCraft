package lietziboy.projectarmorcraft.item;

import lietziboy.projectarmorcraft.ProjectArmorCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static lietziboy.projectarmorcraft.ProjectArmorCraft.MOD_ID;

public class ModItems {

    public static final Item RUBBER = registerItem("rubber",
            new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));
    public static final Item RAW_RUBBER = registerItem("raw_rubber",
        new Item(new FabricItemSettings().group(ModItemGroup.ARMORCRAFT)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProjectArmorCraft.LOGGER.debug("Registering Items for " + MOD_ID);
    }

}
