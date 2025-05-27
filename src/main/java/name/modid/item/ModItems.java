package name.modid.item;

import name.modid.WuyaziMod;
import name.modid.item.custom.Test_Tool_Pro;
import name.modid.item.proitem.proitem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
//import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item TEST = registerItems("test",new Item(new FabricItemSettings()));
    public static Item WUYAZI = registerItems("wuyazi",new Item(new FabricItemSettings()));
    public static Item PROITEM = registerItems("proitem",new proitem(new FabricItemSettings().maxDamage(100000)));
    public static Item CORN = registerItems("corn",new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static Item STRAWBERRY = registerItems("strawberry",new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static Item CHESS = registerItems("chess",new Item(new FabricItemSettings().food(ModFoodComponents.CHESS)));
    public static Item GAMETEST = registerItems("gametest",new Item(new FabricItemSettings()));
    public static Item TEST_TOOL = registerItems("test_tool", new SwordItem(ModToolMaterials.TEST_TOOL,
            5, -3.0F, new Item.Settings()));
    public static Item TEST_TOOL1 = registerItems("test_tool1", new ShovelItem(ModToolMaterials.TEST_TOOL,
            1, -2.0F, new Item.Settings()));
    public static Item TEST_TOOL2 = registerItems("test_tool2", new PickaxeItem(ModToolMaterials.TEST_TOOL,
            3, -1.0F, new Item.Settings()));
    public static Item TEST_TOOL3 = registerItems("test_tool3", new AxeItem(ModToolMaterials.TEST_TOOL,
            6, -2.0F, new Item.Settings()));
    public static Item TEST_TOOL4 = registerItems("test_tool4", new HoeItem(ModToolMaterials.TEST_TOOL,
            -1, -3.0F, new Item.Settings()));
    public static Item TEST_TOOL_PRO = registerItems("test_tool_pro", new Test_Tool_Pro(ModToolMaterials.TEST_TOOL,
            6.0f, -1.5F, new Item.Settings()));

    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(WuyaziMod.MOD_ID,name),item);
    }

    public static void registerModItems(){

    }
}
