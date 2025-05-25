package name.modid.item;

import name.modid.WuyaziMod;
import name.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGrop {
    public static  final ItemGroup wuyazi_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WuyaziMod.MOD_ID,"wuyazimod_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.wuyazimod_group"))
                    .icon(()-> new ItemStack(ModItems.TEST))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST);
                        entries.add(ModBlocks.TEST_BLOCK);
                        entries.add(ModBlocks.WUYAZI_BLOCK);
                        entries.add(ModItems.WUYAZI);
                        entries.add(ModItems.PROITEM);
                        entries.add(ModBlocks.PRO_BLOCK);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.CHESS);
                        entries.add(ModItems.GAMETEST);
                        entries.add(ModBlocks.WOOD_TEST);
                        entries.add(ModBlocks.BUILD);
                        entries.add(ModBlocks.BUILD1);
                        entries.add(ModBlocks.BUILD2);
                        entries.add(ModBlocks.BUILD3);
                        entries.add(ModBlocks.BUILD4);
                        entries.add(ModBlocks.BUILD5);
                        entries.add(ModBlocks.BUILD6);
                        entries.add(ModBlocks.BUILD7);
                        entries.add(ModBlocks.BUILD8);
                    }).build());
    public static void  registerModItemGroup(){

    }
}
