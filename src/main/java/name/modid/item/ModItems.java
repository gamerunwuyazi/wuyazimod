package name.modid.item;

import name.modid.WuyaziMod;
import name.modid.item.proitem.proitem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
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

    //private  static  void  addItwmsToIGroup(FabricItemGroupEntries fabricItemGroupEntries){
    //    fabricItemGroupEntries.add(TEST);
    //}

    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(WuyaziMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItwmsToIGroup);
    }
}
