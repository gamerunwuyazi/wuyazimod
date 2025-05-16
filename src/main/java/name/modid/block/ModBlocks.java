package name.modid.block;

import name.modid.WuyaziMod;
import name.modid.block.problock.problock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public  static Block TEST_BLOCK = registerBlocks("test_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public  static Block WUYAZI_BLOCK = registerBlocks("wuyazi_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(0.1f,0.1f)));
    public static Block PRO_BLOCK = registerBlocks("pro_block",
            new problock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .strength(0.5f,0.5f)));

    private static Block registerBlocks(String name,Block block){
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(WuyaziMod.MOD_ID,name),block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(WuyaziMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){

    }
}
