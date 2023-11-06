package lietziboy.projectarmorcraft.item;

import lietziboy.projectarmorcraft.ProjectArmorCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ARMORCRAFT = FabricItemGroupBuilder.build(
            new Identifier(ProjectArmorCraft.MOD_ID, "armorcraft"), () -> new ItemStack(ModItems.RUBBER));

}
